package com.google.android.apps.iosched.ui;

import com.google.android.apps.iosched.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class HomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getActivityHelper().setupActionBar(null, 0);

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        getActivityHelper().setupHomeActivity();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.refresh_menu_items, menu);
        super.onCreateOptionsMenu(menu);
        return true;
    }

    public void onClickSub(View v) {
        startActivity(new Intent(this, SubActivity.class));
    }

}
