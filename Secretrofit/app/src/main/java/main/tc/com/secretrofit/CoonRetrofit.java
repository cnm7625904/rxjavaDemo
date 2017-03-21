package main.tc.com.secretrofit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by tckj03 on 2017/3/17.
 * 网络请求
 */

public class CoonRetrofit {
//    private String baseUrl = "http://gank.io/api/";
//    private OkHttpClient httpClient;
//
//    private OkHttpClient createHttpClient() {
//        if (httpClient == null) {
//            httpClient = new OkHttpClient();
//        }
//        return httpClient;
//    }
//  private static Retrofit.Builder builder=new Retrofit.Builder()
//          //基本URL
//          .baseUrl("http://gank.io/api/")
//          //JSON转换
//          .addConverterFactory(GsonConverterFactory.create())
//          //rxjava
//          .addCallAdapterFactory(RxJavaCallAdapterFactory.create());
//    //泛型
//   public <S>  S createService(Class<S> serviceClass)
//   {
//       Retrofit retrofit=builder.client(createHttpClient()).build();
//       return retrofit.create(serviceClass);
//   }




    private static OkHttpClient httpClient;
    private  OkHttpClient createHttpClient()
    {
        httpClient=new OkHttpClient();
        return httpClient;
    }
    //构建Retrofit
    private static Retrofit.Builder builder=new
            Retrofit.Builder()
            .baseUrl("http://gank.io/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create());
    //泛型
    public <S> S createService(Class<S> serviceClass)
    {
        Retrofit retrofit=builder.client(createHttpClient()).build();
        return retrofit.create(serviceClass);
    }




}
