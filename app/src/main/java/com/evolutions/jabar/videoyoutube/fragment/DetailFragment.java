package com.evolutions.jabar.videoyoutube.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
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


public class DetailFragment extends Fragment {
    private static final int REQUEST_NUMBER = 999;


    public DetailFragment() {
        // Required empty public constructor
    }


        @Override
        public View onCreateView (LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
            YouTubePlayerSupportFragment youTubePlayer = YouTubePlayerSupportFragment.newInstance();
            FragmentTransaction transaction= getChildFragmentManager().beginTransaction();
            transaction.add(R.id.player,youTubePlayer).commit();
            youTubePlayer.initialize(Constant.YOUTUBE_API_KEY, new YouTubePlayer.OnInitializedListener() {
                @Override
                public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                    if (!b){
                         youTubePlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);
                        youTubePlayer.cueVideo(Constant.YOUTUBE_ID);

                    }

                }

                @Override
                public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult error) {
String errorMessage = error.toString();
Toast.makeText(getActivity(),errorMessage,Toast.LENGTH_LONG).show();
                    Log.d("errorMessage:",errorMessage);
                }
            });
      /*
            YouTubePlayerSupportFragment youTubePlayer2 = YouTubePlayerSupportFragment.newInstance();
            FragmentTransaction transaction2= getChildFragmentManager().beginTransaction();
            transaction2.add(R.id.player2,youTubePlayer2).commit();
            youTubePlayer.initialize(Constant.YOUTUBE_API_KEY2, new YouTubePlayer.OnInitializedListener() {
                @Override
                public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer2, boolean a) {
                    if (!a){
                        youTubePlayer2.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);
                        youTubePlayer2.loadVideo(Constant.YOUTUBE_ID2);
                        youTubePlayer2.play();
                    }

                }

                @Override
                public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult error) {
                    String errorMessage = error.toString();
                    Toast.makeText(getActivity(),errorMessage,Toast.LENGTH_LONG).show();
                    Log.d("errorMessage:",errorMessage);
                }
            });
      */
            Video_fragment2 categoryFragment = new Video_fragment2();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frame_container2, categoryFragment,Video_fragment2.class.getSimpleName());
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            return view;
        }




    }