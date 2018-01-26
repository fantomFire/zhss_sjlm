package com.zhss.zhss_sjlm.ui.adapter;

import android.content.Context;

import com.zhss.zhss_sjlm.R;
import com.zhss.zhss_sjlm.bean.FoodBean;
import com.zhss.zhss_sjlm.tools.CommonRecyclerAdapter;
import com.zhss.zhss_sjlm.tools.ViewHolder;

import java.util.ArrayList;

/**
 * Created by win7-64 on 2017/11/16.
 */

public class YijuFoodAdapter extends CommonRecyclerAdapter<FoodBean> {
    public YijuFoodAdapter(Context context, ArrayList<FoodBean> foodBeans) {
        super(context,foodBeans, R.layout.yiju_item);

    }

    @Override
    protected void convert(ViewHolder holder, FoodBean data) {
            holder.setText(R.id.yiju_name,data.name)
                    .setText(R.id.yiju_address,data.address);
            holder.getViw(R.id.image).setBackgroundResource(data.img);
    }
}
