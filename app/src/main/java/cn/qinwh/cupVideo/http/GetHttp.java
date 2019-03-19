package cn.qinwh.cupVideo.http;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import android.os.Handler;
import android.os.Message;

public abstract class GetHttp extends Thread{

	private Handler handler;
	private String url;
	private Message msg;
	public GetHttp(Handler handler, String url) {
		this.handler = handler;
		this.url = url;
		this.msg = handler.obtainMessage();
	}
	@Override
	public void run() {
		try {
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("GET");
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line = "";
			StringBuffer sb = new StringBuffer();
			if(conn.getResponseCode() == 200){
				while((line=br.readLine())!=null){
					sb.append(line).append("\n");
				}
			}
			br.close();
			callback(conn.getResponseCode(), handler, msg, sb);
			
		} catch (Exception e) {
			error(e,handler,msg);
		}
	}
	/*
	 * 请求后的回调
	 */
	public abstract void callback(int responseCode,Handler handler,Message msg,StringBuffer sb);
	
	/*
	 * 请求出错
	 */
	public void error(Exception e,Handler handler,Message msg){
		e.printStackTrace();
	}
	
}
