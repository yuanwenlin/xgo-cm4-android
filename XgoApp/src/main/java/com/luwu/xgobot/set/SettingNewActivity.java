package com.luwu.xgobot.set;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.luwu.xgobot.R;

/**
 * <p>文件描述：<p>
 * <p>作者：zhangyibin<p>
 * <p>创建时间：2023/1/8<p>
 *     设置页面
 */
public class SettingNewActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settingnew);

        initView();
    }
    private ImageView mBack_img;
    private RadioButton mFolwSys_btn,mChinese_btn,mEnglish_btn,mConfirm_btn,mNo_btn;
    private TextView mDeviceinfo_tv;
    private void initView() {
        mBack_img = findViewById(R.id.main_back_img);
        mBack_img.setOnClickListener(v -> {
            finish();
        });

        mFolwSys_btn = findViewById(R.id.setting_flowsys_btn);
        mChinese_btn = findViewById(R.id.setting_chinese_btn);
        mEnglish_btn = findViewById(R.id.setting_english_btn);

        //跟随系统
        mFolwSys_btn.setOnCheckedChangeListener((buttonView, isChecked) -> {
            mFolwSys_btn.setTextColor(isChecked?this.getResources().getColor(R.color.white):this.getResources().getColor(R.color.gray_8b));
            if(isChecked){
                mChinese_btn.setChecked(false);
                mEnglish_btn.setChecked(false);
            }
        });
        //中文
        mChinese_btn.setOnCheckedChangeListener((buttonView, isChecked) -> {
            mChinese_btn.setTextColor(isChecked?this.getResources().getColor(R.color.white):this.getResources().getColor(R.color.gray_8b));
            if(isChecked){
                mFolwSys_btn.setChecked(false);
                mEnglish_btn.setChecked(false);
            }
        });
        //英文
        mEnglish_btn.setOnCheckedChangeListener((buttonView, isChecked) -> {
            mEnglish_btn.setTextColor(isChecked?this.getResources().getColor(R.color.white):this.getResources().getColor(R.color.gray_8b));
            if(isChecked){
                mFolwSys_btn.setChecked(false);
                mChinese_btn.setChecked(false);
            }
        });

        mConfirm_btn = findViewById(R.id.setting_yes_btn);
        mNo_btn = findViewById(R.id.setting_no_btn);
        //是
        mConfirm_btn.setOnCheckedChangeListener((buttonView, isChecked) -> {
            mConfirm_btn.setTextColor(isChecked?this.getResources().getColor(R.color.white):this.getResources().getColor(R.color.gray_8b));
            if(isChecked){
                mNo_btn.setChecked(false);
            }
        });
        //否
        mNo_btn.setOnCheckedChangeListener((buttonView, isChecked) -> {
            mNo_btn.setTextColor(isChecked?this.getResources().getColor(R.color.white):this.getResources().getColor(R.color.gray_8b));
            if(isChecked){
                mConfirm_btn.setChecked(false);
            }
        });
        //设备信息
        mDeviceinfo_tv = findViewById(R.id.setting_deviceinfo_tv);

    }
}
