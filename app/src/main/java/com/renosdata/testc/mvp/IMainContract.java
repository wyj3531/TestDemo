package com.renosdata.testc.mvp;

import android.content.Context;

import com.renosdata.testc.mvp.bean.LoginBean;
import com.renosdata.testc.mvp.presenter.BasePresenter;
import com.renosdata.testc.mvp.view.BaseView;

/**
 * 契约管理类
 *
 * @author orange
 * @time 2019-03-02 11:49
 */
public interface IMainContract {


    interface IMainView extends BaseView<IMainPresenter> {

        /**
         * 获取上下文
         *
         * @return Context
         */
        Context getContext();

        /**
         * 初始化数据
         *
         * @param name     账户
         * @param password 密码
         */
        void showUerNameAndPassword(String name, String password);

        /**
         * 展示登入结果
         *
         * @param msg 结果
         */
        void showLoginResult(String msg);
    }

    interface IMainModel {
        /**
         * 获取初始化数据
         */
        LoginBean getInitData();

        /**
         * 登入
         *
         * @param loginBean 登入数据
         */
        void login(LoginBean loginBean);
    }

    interface IMainPresenter extends BasePresenter {
        /**
         * 登入
         *
         * @param loginBean 登入数据
         */
        void login(LoginBean loginBean);

        void onDestroy();
    }
}
