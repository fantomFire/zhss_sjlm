package com.zhss.zhss_sjlm.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/11/15 0015.
 */

/**
 * "message_id": "信息编号id",
 "content": "发送内容",
 "data_time": "发送时间2016.11.15 15:34",
 "type": "2(重点  根据1或者2
 判断显示在左边还是右边 1：代表是登录用户发送出去的信息，2：代表接收到的信息)",
 "thumb_img": "用户头像http://192.168.10.245/upload/app/t21.jpg",
 "nickname": "用户名称艾麒麟",
 "user_id": "对方id"

 */
public class MyChatBean {
    public List<DataBean> data;
    public String status;
    public String type;
    public class DataBean{
        public String message_id;
        public String content;
        public String data_time;
        public String type;
        public String thumb_img;
        public String nickname;
        public String user_id;
        public String content_img;
        public String data_type;

    }
}
