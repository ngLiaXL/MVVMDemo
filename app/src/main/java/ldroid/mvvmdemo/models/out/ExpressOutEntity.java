package ldroid.mvvmdemo.models.out;

import com.google.gson.annotations.Expose;

import ldroid.mvvmdemo.models.BaseEntity;


public class ExpressOutEntity extends BaseEntity {

    @Expose
    public String time;
    @Expose
    public String ftime;
    @Expose
    public String context;


    @Override
    public String toString() {
        return "time：" + time + "\nftime：" + ftime + "\ncontext：" + context;
    }
}
