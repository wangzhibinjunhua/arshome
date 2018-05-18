package com.wzb.arshome;




import com.wzb.arshome.view.MyGridAdapter;
import com.wzb.arshome.view.MyGridView;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * @author wzb<wangzhibin_x@qq.com>
 * @date May 3, 2017 10:55:01 AM
 */
public class HomeActivity extends BaseActivity implements OnClickListener {

	private MyGridView mGridView;

	private ImageView backView;
	private ImageView btView;
	private TextView titleView;
	private ImageView titleMeterList;

	private String[] img_text;
	private int[] img_icon = { R.drawable.translate, R.drawable.set, R.drawable.soundrecord, R.drawable.camera };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_home);

		initView();
	}

	private void initView() {
		Resources res = getResources();
		img_text = res.getStringArray(R.array.img_text);

		mGridView = (MyGridView) findViewById(R.id.gridview);
		// mGridView.setAdapter(new MyGridAdapter(this));
		mGridView.setAdapter(new MyGridAdapter(this, img_text, img_icon));
		mGridView.setOnItemClickListener(new MyItemClickListener());

		backView = (ImageView) findViewById(R.id.title_back);
		backView.setOnClickListener(this);
		backView.setVisibility(View.GONE);
	
		titleView = (TextView) findViewById(R.id.title_text);
		titleView.setText(getString(R.string.home_page));

	}

	private class MyItemClickListener implements OnItemClickListener {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
			// TODO Auto-generated method stub
			Intent intent = new Intent();
			intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			
			switch (arg2) {
			case 3:
			
				startActivity(intent);
				break;
			case 4:
				//intent.setClass(MainActivity.this, UserManagerActivity.class);
				startActivity(intent);
				break;
			case 5:
				//intent.setClass(MainActivity.this, LoginNewActivity.class);
				//startActivity(intent);
				for (Activity activity : WApplication.activityList) {
					activity.finish();
				}
				finish();
				System.exit(0);
				System.gc();
				break;
			case 2:
				
			
				startActivity(intent);
				break;
			case 0:// read data
				
	
				startActivity(intent);
				break;
			case 1:
				 //intent.setClass(MainActivity.this, SimpleActivity.class);
				
				
				startActivity(intent);
				break;
			case 6:
				//intent.setClass(MainActivity.this, ApplicationSetting.class);
				startActivity(intent);
				break;
			default:
				break;
			}

		}

	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		return;
	}

	

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

	private void exit() {
		for (Activity activity : WApplication.activityList) {
			activity.finish();
		}
		finish();
		System.exit(0);
		System.gc();
	}

}

