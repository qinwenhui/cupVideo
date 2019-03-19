package cn.qinwh.cupVideo.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import cn.qinwh.cupVideo.R;
import cn.qinwh.cupVideo.http.ImageHttp;

/**
 * Created by admin1 on 2018/2/7.
 */

public class WelcomeActivity extends Activity{

    private ImageView welcomeImage;
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            Bitmap bitmap = null;
            bitmap = (Bitmap) msg.obj;
            if(msg!=null){
                welcomeImage.setImageBitmap(bitmap);
            }
            super.handleMessage(msg);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        //隐藏标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //隐藏状态栏
        //定义全屏参数
        int flag= WindowManager.LayoutParams.FLAG_FULLSCREEN;
        //设置当前窗体为全屏显示
        window.setFlags(flag, flag);
        setContentView(R.layout.welcome);

        welcomeImage = (ImageView) findViewById(R.id.welcome_image);
        String imageUrl = "";   //启动图的地址
        imageUrl = "http://ai-shetuan.oss-cn-hangzhou.aliyuncs.com/ast/images/welcome.jpg";
        new ImageHttp(handler,imageUrl){

            @Override
            public void callback(int responseCode, Handler handler, Message msg, Bitmap bitmap) {
                if(responseCode == 200){
                    msg.what = 0;
                    msg.obj = bitmap;
                    handler.sendMessage(msg);
                }
            }
        }.start();
        //设置按时间跳转
        Handler handler2 = new Handler();
        handler2.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(intent);
                WelcomeActivity.this.finish();
            }
        }, 3000);
    }
}
