package com.zhss.zhss_sjlm.bean;

import java.util.List;

/**
 * Created by win7-64 on 2018/1/29.
 */

public class DiscoverBean {

    /**
     * status : 200
     * msg : [{"store_name":"gg","store_id":"1","store_image":"http://sjlm.test.zhonghuass.cn","live_store_address":"碑林区二环南路"}]
     */

    private String status;
    private List<MsgBean> msg;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<MsgBean> getMsg() {
        return msg;
    }

    public void setMsg(List<MsgBean> msg) {
        this.msg = msg;
    }

    public static class MsgBean {
        /**
         * store_name : gg
         * store_id : 1
         * store_image : http://sjlm.test.zhonghuass.cn
         * live_store_address : 碑林区二环南路
         */

        private String store_name;
        private String store_id;
        private String store_image;
        private String live_store_address;

        public String getStore_name() {
            return store_name;
        }

        public void setStore_name(String store_name) {
            this.store_name = store_name;
        }

        public String getStore_id() {
            return store_id;
        }

        public void setStore_id(String store_id) {
            this.store_id = store_id;
        }

        public String getStore_image() {
            return store_image;
        }

        public void setStore_image(String store_image) {
            this.store_image = store_image;
        }

        public String getLive_store_address() {
            return live_store_address;
        }

        public void setLive_store_address(String live_store_address) {
            this.live_store_address = live_store_address;
        }

        @Override
        public String toString() {
            return "MsgBean{" +
                    "store_name='" + store_name + '\'' +
                    ", store_id='" + store_id + '\'' +
                    ", store_image='" + store_image + '\'' +
                    ", live_store_address='" + live_store_address + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "DiscoverBean{" +
                "status='" + status + '\'' +
                ", msg=" + msg +
                '}';
    }
}
