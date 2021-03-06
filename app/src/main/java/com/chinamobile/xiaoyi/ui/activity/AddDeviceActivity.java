package com.chinamobile.xiaoyi.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.base.lib.base.AppBaseActivity;
import com.chinamobile.xiaoyi.R;

/**
 * Created by malijie on 2017/9/12.
 */

public class AddDeviceActivity extends AppBaseActivity {
    private TextView mTextTitle;
    private ImageButton mButtonBack = null;
    private TextView mTextNext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViews();
        initData();

    }

    @Override
    protected int getContentViewId() {
        return R.layout.add_device;
    }


    @Override
    public void initViews() {
        mTextTitle = findViewById(R.id.id_title_bar_text_title);
        mButtonBack = findViewById(R.id.id_title_bar_button_back);
        mTextNext = findViewById(R.id.id_title_bar_text_option);
        mTextNext.setVisibility(View.VISIBLE);

        mButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        mTextTitle.setText("添加设备");

        mTextNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AddDeviceActivity.this,AddDeviceDetailActivity.class));
            }
        });
    }

    @Override
    public void initData() {

    }
}
