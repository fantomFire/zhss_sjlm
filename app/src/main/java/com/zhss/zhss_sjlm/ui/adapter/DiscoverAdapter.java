package com.zhss.zhss_sjlm.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.zhss.zhss_sjlm.R;
import com.zhss.zhss_sjlm.bean.DiscoverBean;

import java.util.List;

/**
 * Created by win7-64 on 2018/1/29.
 */

public class DiscoverAdapter extends RecyclerView.Adapter {
    private Context context;
    private final int TYPE1 = 1;
    private final int TYPE2 = 2;
    private final LayoutInflater inflater;
    private List<DiscoverBean.MsgBean> dataList;

    public DiscoverAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case TYPE1:
                View viewOne = inflater.inflate(R.layout.hor_item, parent, false);
                return new OneViewHolder(viewOne);
            case TYPE2:
                View viewTwo = inflater.inflate(R.layout.ver_item, parent, false);
                return new TwoViewHolder(viewTwo);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)) {

            case TYPE1:
                System.out.println("typ1==="+position);
                Glide.with(context)
                        .load(dataList.get(position).getStore_image())
                        .into(((OneViewHolder) holder).oneImg);
                ((OneViewHolder) holder).oneAddres.setText(dataList.get(position).getLive_store_address());
                ((OneViewHolder) holder).oneName.setText(dataList.get(position).getStore_name());
                break;
            case TYPE2:
                System.out.println("typ2==="+position);
                Glide.with(context)
                        .load(dataList.get(position).getStore_image())
                        .into(((TwoViewHolder) holder).twoImg);
                ((TwoViewHolder) holder).twoAdd.setText(dataList.get(position).getLive_store_address());
                ((TwoViewHolder) holder).twoName.setText(dataList.get(position).getStore_name());
                break;
        }
    }

    @Override
    public int getItemCount() {
        return dataList == null ? 0 : dataList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position% 5 == 3 || (position % 5 == 4)) {
            System.out.println("pos"+position);

            return TYPE2;
        } else {
            return TYPE1;
        }

    }

    public void setData(List<DiscoverBean.MsgBean> dataList) {
        this.dataList = dataList;
    }

    class OneViewHolder extends RecyclerView.ViewHolder {

        ImageView oneImg;
        TextView oneName;
        TextView oneAddres;

        public OneViewHolder(View itemView) {
            super(itemView);
            oneImg = itemView.findViewById(R.id.foot_img);
            oneName = itemView.findViewById(R.id.food_name);
            oneAddres = itemView.findViewById(R.id.food_address);
        }
    }

    class TwoViewHolder extends RecyclerView.ViewHolder {

        ImageView twoImg;
        TextView twoAdd;
        TextView twoName;

        public TwoViewHolder(View itemView) {
            super(itemView);
            twoImg = itemView.findViewById(R.id.ver_img);
            twoAdd = itemView.findViewById(R.id.ver_distance);
            twoName = itemView.findViewById(R.id.ver_name);
        }
    }
}
