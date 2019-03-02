package com.renosdata.testc.mvp.view;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.renosdata.testc.R;
import com.renosdata.testc.mvp.presenter.MainPresenter;

/**
 * 主界面
 *
 * @author orange
 * @date 2019/3/2
 */

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    /**
     * Activity 在项目中是一个全局的控制者，负责创建 view 以及 presenter 实例，并将二者联系起来，
     */
    private void initView() {
        FragmentManager FMs = getFragmentManager();
        FragmentTransaction MfragmentTransactions = FMs.beginTransaction();
        MainFragment mainFragment =new MainFragment();
        MfragmentTransactions.add(R.id.contentFrame,mainFragment);
        MfragmentTransactions.commit();
        new MainPresenter(mainFragment);
    }


}
