package me.itwl.carlife.ui;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.baidu.navisdk.adapter.BaiduNaviManager;

import me.itwl.carlife.R;

public class NaviActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initNavi();
    }

    private void initNavi() {
        BaiduNaviManager.getInstance().init(this, Environment.getExternalStorageState(), "CarLife",
                new BaiduNaviManager.NaviInitListener() {
                    @Override
                    public void onAuthResult(int status, String msg) {
                        if (0 == status) {
                            Toast.makeText(NaviActivity.this, "key校验成功", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(NaviActivity.this, "key校验失败", Toast.LENGTH_SHORT).show();
                        }
                    }

                    public void initSuccess() {
                        Toast.makeText(NaviActivity.this, "百度导航引擎初始化成功", Toast.LENGTH_SHORT).show();
                    }

                    public void initStart() {
                        Toast.makeText(NaviActivity.this, "百度导航引擎初始化开始", Toast.LENGTH_SHORT).show();
                    }

                    public void initFailed() {
                        Toast.makeText(NaviActivity.this, "百度导航引擎初始化失败", Toast.LENGTH_SHORT).show();
                    }
                }, null);
    }
}
