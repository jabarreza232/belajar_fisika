package com.evolutions.jabar.videoyoutube.view;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.evolutions.jabar.videoyoutube.R;
import com.evolutions.jabar.videoyoutube.design.BottomNavigationBehavior;
import com.evolutions.jabar.videoyoutube.fragment.DetailFragment;
import com.evolutions.jabar.videoyoutube.fragment.Info;
import com.evolutions.jabar.videoyoutube.fragment.Quiz;
import com.evolutions.jabar.videoyoutube.fragment.fragment_materi;

public class Main2Activity extends AppCompatActivity {
private ActionBar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        toolbar = getSupportActionBar();
        toolbar.setTitle("List Materi");
        FragmentManager mfragmentManager = getSupportFragmentManager();
        FragmentTransaction mFragmentTransaction = mfragmentManager.beginTransaction();
        fragment_materi homeFragment = new fragment_materi();
        mFragmentTransaction.add(R.id.frame_container,homeFragment,fragment_materi.class.getSimpleName());
        Log.d("MyFlexibleFragment","Fragment Name :"+fragment_materi.class.getSimpleName());
        mFragmentTransaction.commit();

        BottomNavigationView navigation = (BottomNavigationView)findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams)navigation.getLayoutParams();
        layoutParams.setBehavior(new BottomNavigationBehavior());

    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
switch (item.getItemId()){
    case R.id.navigation_materi:
        fragment = new fragment_materi();
        toolbar.setTitle("List Materi");
        loadfragment(fragment);
        return true;
    case R.id.navigation_video:
        fragment = new DetailFragment();
        toolbar.setTitle("Video Materi");
        loadfragment(fragment);
        return true;
    case R.id.navigation_quiz:
fragment = new Quiz();
toolbar.setTitle("Quiz");
loadfragment(fragment);
       return true;
    case R.id.navigation_info:
fragment = new Info();
toolbar.setTitle("Info");
loadfragment(fragment);
        return true;

}
return false;
        }
    };


private void loadfragment(Fragment fragment){
    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    transaction.replace(R.id.frame_container,fragment);
    transaction.addToBackStack(null);
    transaction.commit();
}
    /*
    private void showRecycleList() {
        rv_fisika.setLayoutManager(new LinearLayoutManager(this));
        FisikaAdapter fisikaAdapter = new FisikaAdapter(this);
        fisikaAdapter.setListFisika(list);
        rv_fisika.setAdapter(fisikaAdapter);
    */

      /*  private void showRecyclerGrid() {
            rv_fisika.setLayoutManager(new GridLayoutManager(this, 2));
            GridFisikaAdapter gridPresidentAdapter = new GridFisikaAdapter(this);
            gridPresidentAdapter.setListfisika(list);
            rv_fisika.setAdapter(gridPresidentAdapter);

        }
        */
        /*



        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.player);
        //set the api key here
        youTubePlayerView.initialize(Constant.YOUTUBE_API_KEY, this);

        }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        if(!b){
            youTubePlayer.cueVideo(Constant.YOUTUBE_ID);

             * there are 2 method you can user here :
             * .cueVideo(), for didn't play automatically
             * .loadVideo(), for do play automatically
             *
             * if you are using play automatically, it better if you hide the video controllers
             * do like below :
             * youTubePlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.CHROMELESS);//hide the players controllers

        }
    }*/
/*
    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        if(youTubeInitializationResult.isUserRecoverableError()){
            youTubeInitializationResult.getErrorDialog(this, REQUEST_NUMBER).show();
        }else{
            String errorMessage = String.format(
                    "There was an error initializing the YouTubePlayer (%1$s)", youTubeInitializationResult.toString()
            );
            Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_NUMBER) {
            youTubePlayerView.initialize(Constant.YOUTUBE_API_KEY, this);
        }
    }
*/


}
