package ldroid.mvvmdemo.viewmodel;


import ldroid.mvvmdemo.ExpressRetrofit;
import ldroid.mvvmdemo.models.in.ExpressInEntity;
import ldroid.mvvmdemo.models.out.ExpressOutEntity;
import ldroid.mvvmdemo.models.out.OutputListEntity;
import rx.Subscriber;
import rx.Subscription;

public class ExpressViewModel {

    private Subscription mSubscription;



    public void reqExpress(String type, String postid) {
        ExpressInEntity in = new ExpressInEntity(type, postid);
        if (!in.checkInput()) {
            return;
        }
        if (mSubscription != null) {
            mSubscription.unsubscribe();
        }
        mSubscription = ExpressRetrofit.get()
                .reqExpress("shentong", "123123")
                .subscribe(new Subscriber<OutputListEntity<ExpressOutEntity>>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                    }

                    @Override
                    public void onNext(OutputListEntity<ExpressOutEntity> response) {
                    }
                });


    }


}
