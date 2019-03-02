package com.renosdata.testc.mvp.view;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.renosdata.testc.R;
import com.renosdata.testc.mvp.IMainContract;
import com.renosdata.testc.mvp.bean.LoginBean;

/**
 * 主界面fragment
 *
 * @author orange
 * @time 2019-03-03 01:53
 */
public class MainFragment extends Fragment implements IMainContract.IMainView {

    private IMainContract.IMainPresenter mPresenter;
    private EditText mEtName;
    private EditText mEtPassword;
    private ProgressDialog mProgressDialog;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        TextInputLayout mTvInputName = (TextInputLayout) view.findViewById(R.id.tvInputName);
        TextInputLayout mTvInputPassword = (TextInputLayout) view.findViewById(R.id.tvInputPassword);
        mEtName = (EditText) view.findViewById(R.id.etName);
        mEtPassword = (EditText) view.findViewById(R.id.etPassword);
        mTvInputName.setHint("用户名");
        mTvInputPassword.setHint("密码");
        view.findViewById(R.id.btLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

    }

    private void login() {
        mProgressDialog = new ProgressDialog(getContext());
        mPresenter.login(new LoginBean(mEtName.getText().toString().trim(),
                mEtPassword.getText().toString().trim()));
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Override
    public void showUerNameAndPassword(@NonNull String name, @NonNull String password) {
        mEtName.setText(name);
        mEtPassword.setText(password);
    }

    @Override
    public void showLoginResult(String msg) {
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
        dismiss();
    }

    private void dismiss() {
        if (mProgressDialog != null) {
            mProgressDialog.dismiss();
        }
    }

    @Override
    public void setPresenter(@NonNull IMainContract.IMainPresenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPresenter.onDestroy();
    }
}
