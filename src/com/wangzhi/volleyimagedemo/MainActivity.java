package com.wangzhi.volleyimagedemo;

import com.android.volley.Response;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.ImageLoader.ImageListener;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.NetworkImageView;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends Activity
{
	private ImageView iv_img;
	private NetworkImageView netImageView;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		String url = "http://h.hiphotos.baidu.com/baike/c0%3Dbaike80%2C5%2C5%2C80%2C26/sign=e8753d14cafcc3cea0cdc161f32cbded/279759ee3d6d55fb1d9ec7106f224f4a20a4dda8.jpg";
		ImageLoader loader = new ImageLoader(MyApplication.getHttpQueues(), new BitmapCache());
		netImageView.setDefaultImageResId(R.drawable.ic_launcher);
		netImageView.setErrorImageResId(R.drawable.ic_launcher);
		netImageView.setImageUrl(url, loader);
		
		/*
		ImageLoader loader = new ImageLoader(MyApplication.getHttpQueues(), new BitmapCache());
		ImageListener listener = ImageLoader.getImageListener(iv_img, R.drawable.ic_launcher, R.drawable.ic_launcher);
		
		loader.get(url, listener);
		*/
		
		
		/*ImageRequest request = new ImageRequest(url, new Listener<Bitmap>()
		{

			@Override
			public void onResponse(Bitmap response)
			{
				iv_img.setImageBitmap(response);
			}
		}, 800, 800, Config.RGB_565, new Response.ErrorListener()
		{

			@Override
			public void onErrorResponse(VolleyError error)
			{
				iv_img.setBackgroundResource(R.drawable.ic_launcher);
				
			}
		});
		MyApplication.getHttpQueues().add(request);*/
		
	}

	private void initView()
	{
		iv_img = (ImageView) this.findViewById(R.id.iv_img);
		netImageView = (NetworkImageView) findViewById(R.id.networkImageView);
		
	}

	
}
