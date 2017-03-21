package main.tc.com.secretrofit;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tckj03 on 2017/3/17.
 * 数据适配器
 */

public class adpter extends RecyclerView.Adapter<adpter.girlViewHolder>
{
    private Context mcontext;//上下文
    //加载的完整实体类Gankio
   private List<GankBean> mGankBean=new ArrayList<>();
    //获取传入的对象
    public List<GankBean> getmGankBean()
    {
        return mGankBean;
    }

    @Override
    public girlViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        girlViewHolder holder=new girlViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.re_item,parent,false));

        return holder;
    }
    //获取上下文数据
    public adpter(Context context, List<GankBean> gankBeen)
    {
        this.mcontext=context;
        if(gankBeen!=null)
        {
            this.mGankBean=gankBeen;
        }

    }

    @Override
    public void onBindViewHolder(girlViewHolder holder, int position) {
        Glide.with(mcontext)
                .load(mGankBean.get(position).getUrl())
                .into(holder.img);


    }



    @Override
    public int getItemCount() {
        return mGankBean.size();
    }

    //自定义一个viewholder
    class girlViewHolder extends RecyclerView.ViewHolder {
        //声明控件
        ImageView img;
        public girlViewHolder(View itemView) {
            super(itemView);
            //绑定控件
            img= (ImageView) itemView.findViewById(R.id.imageview);
        }
    }
}
