package ldroid.mvvmdemo.services;

import ldroid.mvvmdemo.models.out.ExpressOutEntity;
import ldroid.mvvmdemo.models.out.OutputListEntity;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface ExpressService {


    @GET("/query")
    Observable<OutputListEntity<ExpressOutEntity>> reqExpress(
            @Query("type") String type,
            @Query("postid") String postid);

}