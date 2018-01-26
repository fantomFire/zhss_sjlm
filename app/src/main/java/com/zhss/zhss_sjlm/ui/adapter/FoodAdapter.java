package com.zhss.zhss_sjlm.ui.adapter;

import android.content.Context;
import android.widget.ImageView;

import com.zhss.zhss_sjlm.R;
import com.zhss.zhss_sjlm.bean.FoodBean;
import com.zhss.zhss_sjlm.tools.CommonRecyclerAdapter;
import com.zhss.zhss_sjlm.tools.ViewHolder;

import java.util.ArrayList;

/**
 * Created by win7-64 on 2017/11/16.
 */

public class FoodAdapter extends CommonRecyclerAdapter<FoodBean> {
    public FoodAdapter(Context context, ArrayList<FoodBean> foodBeans) {
        super(context, foodBeans, R.layout.fooditem);
    }

    @Override
    protected void convert(ViewHolder holder, FoodBean data) {
        holder.setText(R.id.food_name, data.name)
                .setText(R.id.food_address, data.address);
        ImageView viw = holder.getViw(R.id.foot_img);
        viw.setImageResource(data.img);
    }
}
