package com.maqianyu.test2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by dllo on 16/10/17.
 */
public abstract class AbsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayout());
        initView();
        initDatas();

    }

    protected abstract int setLayout();

    protected abstract void initView();

    protected abstract void initDatas();

    protected <T extends View> T byView(int resId) {
        return (T) findViewById(resId);
    }


    protected void goTo(Context from, Class<? extends AbsActivity> to) {
        startActivity(new Intent(from, to));
    }

    protected void goTo(Context from, Class<? extends AbsActivity> to, Bundle extras) {
        Intent intent = new Intent(from, to);
        intent.putExtras(extras);
        startActivity(intent);
    }

    public void finish() {
        super.finish();
    }

}
