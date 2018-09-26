package cn.adair.itooler;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import cn.adair.itooler.tooler.iLogger;


public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        String init = getIntent().getStringExtra("init");
        iLogger.INSTANCE.e("---->" + init);
}
}
