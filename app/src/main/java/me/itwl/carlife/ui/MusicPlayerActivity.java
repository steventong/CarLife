package me.itwl.carlife.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import me.itwl.carlife.R;

public class MusicPlayerActivity extends AppCompatActivity {

    private enum PlatMode{
        SINGLE
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    public void performClick(View view) {
        switch (view.getId()) {
            case R.id.play:
                break;
            case R.id.last:
                break;
            case R.id.next:
                break;
            case R.id.more:
                break;
            case R.id.list:
                startActivity(new Intent(this, MusicListActivity.class));
                break;
        }
    }

}
