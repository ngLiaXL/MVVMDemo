package ldroid.mvvmdemo.module;


import java.util.ArrayList;

import ldroid.mvvmdemo.models.in.ExpressInEntity;
import ldroid.mvvmdemo.models.out.ExpressOutEntity;
import ldroid.mvvmdemo.models.out.OutputListEntity;
import ldroid.mvvmdemo.network.ExpressRetrofit;
import ldroid.mvvmdemo.viewmodel.BaseViewModel;
import rx.Subscriber;
import rx.Subscription;

public class MainViewModel implements BaseViewModel {

    private Subscription mSubscription;

    private String content;


    public void reqExpress(String type, String postid) {
        ExpressInEntity in = new ExpressInEntity(type, postid);
        if (!in.checkInput()) {
            return;
        }
        if (mSubscription != null) {
            mSubscription.unsubscribe();
        }
        mSubscription = ExpressRetrofit.get()
                .reqExpress(type, postid)
                .subscribe(new Subscriber<OutputListEntity<ExpressOutEntity>>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                    }

                    @Override
                    public void onNext(OutputListEntity<ExpressOutEntity> response) {
                        StringBuffer sbf = new StringBuffer();
                        ArrayList<ExpressOutEntity> expressList = response.reList;
                        for (ExpressOutEntity kd : expressList) {
                            sbf.append(kd.toString()).append("\r\n\n\n");
                        }
                        setContent(sbf.toString());

                    }
                });


    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
