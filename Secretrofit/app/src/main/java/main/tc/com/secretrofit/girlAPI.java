package main.tc.com.secretrofit;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by tckj03 on 2017/3/17.
 * 请求接口
 */

public interface  girlAPI {

    @GET("data/{type}/{number}/{page}")
    Observable<Gankio> getGankio(
            @Path("type") String type,
            @Path("number") int number,
            @Path("page") int page
    );



}
