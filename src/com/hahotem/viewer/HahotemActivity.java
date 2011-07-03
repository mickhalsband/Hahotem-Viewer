package com.hahotem.viewer;

import java.io.IOException;

import java.net.URL;

import android.graphics.Bitmap; 
import android.graphics.BitmapFactory;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;


public class HahotemActivity extends Activity {
		
	private void test()
	{
		try {
			URL newurl = new URL("http://hahotem.com/images/users/panda_title.jpg"); 
			Bitmap bmp = BitmapFactory.decodeStream(newurl.openConnection() .getInputStream()); 
			//profile_photo.setImageBitmap(mIcon_val); 	
			ImageView image = (ImageView) findViewById(R.id.imageView1);
			image.setImageBitmap(bmp); 	
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        test();
    }
}