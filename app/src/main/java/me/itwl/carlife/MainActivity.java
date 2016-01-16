package me.itwl.carlife;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import me.itwl.carlife.ui.FuelCostsActivity;
import me.itwl.carlife.ui.MoreActivity;
import me.itwl.carlife.ui.MusicPlayerActivity;
import me.itwl.carlife.ui.NaviActivity;
import me.itwl.carlife.ui.SettingsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void performClick(View view) {
        switch (view.getId()) {
            case R.id.phone:
                break;
            case R.id.music:
                startActivity(new Intent(this, MusicPlayerActivity.class));
                break;
            case R.id.navi:
                startActivity(new Intent(this, NaviActivity.class));
                break;
            case R.id.fuel:
                startActivity(new Intent(this, FuelCostsActivity.class));
                break;
            case R.id.more:
                startActivity(new Intent(this, MoreActivity.class));
                break;
            case R.id.settings:
                startActivity(new Intent(this, SettingsActivity.class));
                break;
        }
    }

}
