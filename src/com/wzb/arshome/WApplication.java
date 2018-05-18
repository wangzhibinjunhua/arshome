package com.wzb.arshome;

import android.app.Activity;
import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;

import java.util.ArrayList;
import java.util.List;



/**
 * @author wzb<wangzhibin_x@qq.com>
 * @date May 8, 2017 2:54:00 PM
 */
public class WApplication extends Application {


	public static Context CONTEXT;


	// public static UserBean user;

	public static final String BASE_FILE_PATH = Environment.getExternalStorageDirectory().getAbsolutePath()
			+ "/Health/";

	public static final String IMAGE_FILE_PATH = BASE_FILE_PATH + "image/";


	public static List<Activity> activityList = new ArrayList<Activity>();

	public static boolean isNetWork = true;

	
	private final String SP_NAME = "hhu";

	public static SQLiteDatabase db;

	public static int USER_LEVEL = 0;



	@Override
	public void onCreate() {
		super.onCreate();

		CONTEXT = getApplicationContext();


	}
	


}
