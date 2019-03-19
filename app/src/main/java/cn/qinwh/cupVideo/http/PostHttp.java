package cn.qinwh.cupVideo.http;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import android.os.Handler;
import android.os.Message;

public abstract class PostHttp extends Thread {

	private Handler handler;
	private String url;
	private Message msg;
	private Map<String,String> params;
	public PostHttp(Handler handler, String url, Map<String,String> params) {
		this.handler = handler;
		this.url = url;
		this.params = params;
		this.msg = handler.obtainMessage();
	}
	@Override
	public void run() {
		try {
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("POST");
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setUseCaches(false);
			setConnParam(conn);
			OutputStream os = conn.getOutputStream();
			os.write(mapToString().getBytes());
			os.flush();
			os.close();
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line = "";
			StringBuffer sb = new StringBuffer();
			if(conn.getResponseCode() == 200){
				while((line=br.readLine())!=null){
					sb.append(line).append("\n");
				}
			}
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
	
	/*
	 * 请求的相关设置
	 */
	public void setConnParam(HttpURLConnection conn){
		
	}
	
	/*
	 * map数据转为传入请求的数据格式
	 */
	private String mapToString(){
		String param = "";
		for(Map.Entry<String, String> entry: params.entrySet()){
			param += entry.getKey();
			param += "=";
			param += entry.getValue();
			param += "&";
		}
		//去掉最后一个&
		param = param.substring(0, param.length()-1);
		return param;
	}
}

