package com.shining.p010_recycleviewall.shoucang.iview;


import com.shining.p010_recycleviewall.shoucang.domain.ShoucangYinyueIndexBean;
import com.shining.p010_recycleviewall.tablayout.fragmentframelayout.mvp.IView;

public interface IYinyueView extends IView {
    void onGetYinyueSuccess(ShoucangYinyueIndexBean data);

    void onGetYinyueNotok(boolean isok);

    void onGetYinyueEmpty(String msg);

    void onGetYinyueFailed(String msg);
}