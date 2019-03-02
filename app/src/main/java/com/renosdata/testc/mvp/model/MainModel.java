package com.renosdata.testc.mvp.model;

import com.renosdata.testc.mvp.IMainContract;
import com.renosdata.testc.mvp.bean.LoginBean;

/**
 * Model层
 *
 * @author orange
 * @time 2019-03-02 10:41
 */
public class MainModel implements IMainContract.IMainModel {

    private Callbak mCallbak;

    @Override
    public LoginBean getInitData() {
        return new LoginBean("orange", "123456");
    }

    @Override
    public void login(LoginBean loginBean) {
        if (mCallbak != null) {
            mCallbak.loginResultInfos("成功");
        }
    }


    public void setCallBack(Callbak callBack) {
        this.mCallbak = callBack;
    }

    public interface Callbak {
        /**
         * 返回信息结果
         *
         * @param infos 结果
         */
        void loginResultInfos(String infos);
    }
}
