package main.tc.com.secretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycleview;
    private adpter madpter;
    private volatile static girlAPI mgirlAPi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
        initDatas();
    }

    private void initDatas() {
        recycleview.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recycleview.setAdapter(madpter);
        GetGankBeans("福利",10,1);
    }

    private void initviews() {
        recycleview = (RecyclerView) findViewById(R.id.recycleview);
        if(madpter==null)
        {
            madpter=new adpter(MainActivity.this,null);
        }


    }
private void GetGankBeans(String type,int number,int page)
{

  getCoon.getInstance().getGankio(type,number,page)
          .subscribeOn(Schedulers.io())
          .observeOn(AndroidSchedulers.mainThread())
          .subscribe(new Subscriber<Gankio>() {
              @Override
              public void onCompleted() {
              }

              @Override
              public void onError(Throwable e) {
              }

              @Override
              public void onNext(Gankio gankio) {

                  madpter.getmGankBean().clear();
                  madpter.getmGankBean().addAll(gankio.getResults());
                  madpter.notifyDataSetChanged();

              }
          });

}


}
