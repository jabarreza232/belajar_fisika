package com.evolutions.jabar.videoyoutube.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.evolutions.jabar.videoyoutube.Constant;
import com.evolutions.jabar.videoyoutube.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;


public class Video_fragment2 extends Fragment {

    public Video_fragment2() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    View view= inflater.inflate(R.layout.fragment_video_fragment2, container, false);
        YouTubePlayerSupportFragment youTubePlayer = YouTubePlayerSupportFragment.newInstance();
        FragmentTransaction transaction2= getChildFragmentManager().beginTransaction();
        transaction2.add(R.id.player2,youTubePlayer).commit();
        youTubePlayer.initialize(Constant.YOUTUBE_API_KEY2, new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer2, boolean a) {
                if (!a){
                    youTubePlayer2.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);
                    youTubePlayer2.cueVideo(Constant.YOUTUBE_ID2);
                }
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult error) {
                String errorMessage = error.toString();
                Toast.makeText(getActivity(),errorMessage,Toast.LENGTH_LONG).show();
                Log.d("errorMessage:",errorMessage);
            }
        });
return view;
    }
}
