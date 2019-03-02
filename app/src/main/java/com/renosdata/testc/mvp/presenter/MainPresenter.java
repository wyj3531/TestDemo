package com.renosdata.testc.mvp.presenter;

import com.renosdata.testc.mvp.IMainContract;
import com.renosdata.testc.mvp.bean.LoginBean;
import com.renosdata.testc.mvp.model.MainModel;

/**
 * p层
 *
 * @author orange
 * @time 2019-03-02 10:46
 */
public class MainPresenter implements IMainContract.IMainPresenter, MainModel.Callbak {


    private MainModel mMainModel;
    private IMainContract.IMainView mMainView;

    public MainPresenter(IMainContract.IMainView mainView) {
        mMainView = mainView;
        mMainModel = new MainModel();
        mMainView.setPresenter(this);
        mMainModel.setCallBack(this);
    }


    @Override
    public void start() {
        mMainView.showUerNameAndPassword(mMainModel.getInitData().getName(),
                mMainModel.getInitData().getPassword());
    }

    @Override
    public void login(LoginBean loginBean) {
        mMainModel.login(loginBean);
    }


    @Override
    public void loginResultInfos(String infos) {
        mMainView.showLoginResult(infos);
    }

    @Override
    public void onDestroy() {
        /*
         * 释放资源
         * */
        mMainView = null;
        mMainModel = null;
    }
}
