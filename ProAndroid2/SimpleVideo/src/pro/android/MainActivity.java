package pro.android;

import android.app.Activity; import android.net.Uri; import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public  class  MainActivity extends Activity  {
	/**  액티비티 최초 생성 시에 호출됨 */
	@Override
	protected void  onCreate(Bundle savedInstanceState)  {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.main);
		
		VideoView videoView  = (VideoView)this.findViewById(R.id.videoView);
		MediaController mc  = new MediaController(this);
		videoView.setMediaController(mc);
		videoView.setVideoURI(Uri.parse("http://www.androidbook.com/akc/filestorage/android/documentfiles/3389/movie.mp4"));
		// videoView.setVideoPath("/sdcard/movie.mp4");
		videoView.requestFocus();
		videoView.start();
	}
}
