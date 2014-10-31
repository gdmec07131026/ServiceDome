package cn.edu.gdmec.s07131026.servicedome;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void onCreate(){
		super.onCreate();
		Toast.makeText(this, "服务创建", 3000).show();
	}
	
	@Override
	public void onDestroy(){
		super.onDestroy();
		Toast.makeText(this, "服务停止", 3000).show();
	}
	
	@Override
	@Deprecated
	public void onStart(Intent intent,int startId){
		super.onStart(intent, startId);
		Toast.makeText(this, "服务启动", 3000).show();
	}

}
