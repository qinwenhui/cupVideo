package cn.qinwh.cupVideo.http;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by admin1 on 2019/3/19.
 */

public abstract class ImageHttp extends Thread{
    private Handler handler;
    private String url;
    private Message msg;
    Bitmap bitmap = null;
    public ImageHttp(Handler handler, String url) {
        this.handler = handler;
        this.url = url;
        this.msg = handler.obtainMessage();
    }
    @Override
    public void run() {
        try {
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            InputStream is = conn.getInputStream();
            bitmap = BitmapFactory.decodeStream(is);
            is.close();
            callback(conn.getResponseCode(), handler, msg, bitmap);

        } catch (Exception e) {
            error(e,handler,msg);
        }
    }
    /*
     * 请求后的回调
     */
    public abstract void callback(int responseCode,Handler handler,Message msg,Bitmap bitmap);

    /*
     * 请求出错
     */
    public void error(Exception e,Handler handler,Message msg){
        e.printStackTrace();
    }
}
