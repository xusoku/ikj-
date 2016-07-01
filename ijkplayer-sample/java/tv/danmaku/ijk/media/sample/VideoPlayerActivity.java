/*
 * Copyright (C) 2013 Zhang Rui <bbcallen@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tv.danmaku.ijk.media.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import tv.danmaku.ijk.media.widget.MediaController;
import tv.danmaku.ijk.media.widget.VideoView;

public class VideoPlayerActivity extends Activity {
    private VideoView mVideoView;
    private View mBufferingIndicator;
    private MediaController mMediaController;

    private String mVideoPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

//        mVideoPath = getIntent().getStringExtra("videoPath");

//        Intent intent = getIntent();
//        String intentAction = intent.getAction();
//        if (!TextUtils.isEmpty(intentAction) && intentAction.equals(Intent.ACTION_VIEW)) {
//            mVideoPath = intent.getDataString();
//        }
        mVideoPath="http://pl.youku.com/playlist/m3u8?ts=1428995583&keyframe=1&vid=XNjE2MTcwOTY4&type=mp4&sid=14289955230643485b5db&token=2674&oip=1883341046&did=0096f9c83546d26d7e6d3a2000498c72&ctype=30&ev=1&ep=j0PyImAPwcg1eIecs%2FKXJ4AYf91A5WECOpDlSWysRq%2FtM8DvGDYmFAYzyzq5QGjY";
        mVideoPath="rtsp://user:foscam@50.197.211.181:9831/videoMain";
        mBufferingIndicator = findViewById(R.id.buffering_indicator);
        mMediaController = new MediaController(this);

        mVideoView = (VideoView) findViewById(R.id.video_view);
        mVideoView.setMediaController(mMediaController);
        mVideoView.setMediaBufferingIndicator(mBufferingIndicator);
        mVideoView.setVideoPath(mVideoPath);
        mVideoView.requestFocus();
        mVideoView.start();
    }
}
