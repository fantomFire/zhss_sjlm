package com.zhss.zhss_sjlm.bean;

import java.util.List;

/**
 * Created by win7-64 on 2018/1/22.
 */

public class CategreyBean {


    /**
     * status : 200
     * msg : [{"class_id":"1","class_name":"酒店住宿","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"0","content":[{"class_id":"2","class_name":"园林酒店","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"1","content":[]},{"class_id":"3","class_name":"设计师酒店","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"1","content":[]},{"class_id":"4","class_name":"青年旅社","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"1","content":[]},{"class_id":"5","class_name":"特色客栈","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"1","content":[]},{"class_id":"6","class_name":"主题酒店","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"1","content":[]},{"class_id":"7","class_name":"公寓型酒店","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"1","content":[]},{"class_id":"8","class_name":"海外酒店","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"1","content":[]},{"class_id":"9","class_name":"度假酒店","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"1","content":[]},{"class_id":"10","class_name":"海岛酒店","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"1","content":[]},{"class_id":"11","class_name":"温泉酒店","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"1","content":[]},{"class_id":"12","class_name":"高级酒店","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"1","content":[]}]},{"class_id":"13","class_name":"美食商铺","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"0","content":[{"class_id":"14","class_name":"海鲜自助","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"13","content":[]},{"class_id":"15","class_name":"日韩料理","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"13","content":[]},{"class_id":"16","class_name":"蛋糕甜点","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"13","content":[]},{"class_id":"17","class_name":"粤菜","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"13","content":[]},{"class_id":"18","class_name":"川菜","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"13","content":[]},{"class_id":"19","class_name":"湘菜","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"13","content":[]},{"class_id":"20","class_name":"江浙菜","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"13","content":[]},{"class_id":"21","class_name":"名嘴小吃","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"13","content":[]},{"class_id":"22","class_name":"香锅串串","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"13","content":[]},{"class_id":"23","class_name":"夜市烧烤","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"13","content":[]},{"class_id":"24","class_name":"火锅","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"13","content":[]}]},{"class_id":"25","class_name":"休闲娱乐","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"0","content":[{"class_id":"26","class_name":"洗浴汗蒸","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"25","content":[]},{"class_id":"27","class_name":"网吧网卡","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"25","content":[]},{"class_id":"28","class_name":"私人影院","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"25","content":[]},{"class_id":"29","class_name":"演出赛事","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"25","content":[]},{"class_id":"30","class_name":"手工手作","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"25","content":[]},{"class_id":"31","class_name":"唱吧KTv","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"25","content":[]},{"class_id":"32","class_name":"运动健身","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"25","content":[]},{"class_id":"33","class_name":"酒吧茶馆","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"25","content":[]},{"class_id":"34","class_name":"游戏厅","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"25","content":[]},{"class_id":"35","class_name":"桌游轰趴","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"25","content":[]}]},{"class_id":"36","class_name":"美容美发","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"0","content":[{"class_id":"37","class_name":"美容美体","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"36","content":[]},{"class_id":"38","class_name":"美甲","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"36","content":[]},{"class_id":"39","class_name":"舞蹈瑜伽","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"36","content":[]},{"class_id":"40","class_name":"纤身瘦体","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"36","content":[]},{"class_id":"41","class_name":"韩式定妆","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"36","content":[]},{"class_id":"42","class_name":"纹身","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"36","content":[]},{"class_id":"43","class_name":"祛斑祛痘","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"36","content":[]},{"class_id":"44","class_name":"泰式SPA","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"36","content":[]}]},{"class_id":"45","class_name":"游泳健身","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"0","content":[{"class_id":"46","class_name":"游泳馆","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"45","content":[]},{"class_id":"47","class_name":"健身房","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"45","content":[]},{"class_id":"48","class_name":"跆拳道","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"45","content":[]},{"class_id":"49","class_name":"力量散打","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"45","content":[]}]},{"class_id":"50","class_name":"时尚衣装","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"0","content":[{"class_id":"51","class_name":"短袖T恤","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"50","content":[]},{"class_id":"52","class_name":"运动休闲","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"50","content":[]},{"class_id":"53","class_name":"连衣裙","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"50","content":[]},{"class_id":"54","class_name":"短裤","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"50","content":[]},{"class_id":"55","class_name":"卫衣","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"50","content":[]},{"class_id":"56","class_name":"毛呢外套","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"50","content":[]},{"class_id":"57","class_name":"冬季棉衣","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"50","content":[]},{"class_id":"58","class_name":"时尚套装","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"50","content":[]},{"class_id":"59","class_name":"半身裙","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"50","content":[]},{"class_id":"60","class_name":"冲锋衣","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"50","content":[]},{"class_id":"61","class_name":"婚纱礼服","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"50","content":[]}]},{"class_id":"62","class_name":"生活服务","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"0","content":[{"class_id":"63","class_name":"社区医疗","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"62","content":[]},{"class_id":"64","class_name":"同城快递","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"62","content":[]},{"class_id":"65","class_name":"果蔬到家","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"62","content":[]},{"class_id":"66","class_name":"洗衣店","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"62","content":[]},{"class_id":"67","class_name":"同城跑腿","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"62","content":[]},{"class_id":"68","class_name":"快递寄存","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"62","content":[]}]},{"class_id":"69","class_name":"周边旅游","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"0","content":[{"class_id":"70","class_name":"兵马俑","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"69","content":[]},{"class_id":"71","class_name":"大唐芙蓉园","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"69","content":[]},{"class_id":"72","class_name":"华山","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"69","content":[]},{"class_id":"73","class_name":"牛背梁","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"69","content":[]},{"class_id":"74","class_name":"秦岭","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"69","content":[]},{"class_id":"75","class_name":"汤峪温泉","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"69","content":[]},{"class_id":"76","class_name":"太白森林公园","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"69","content":[]},{"class_id":"77","class_name":"蓝田","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"69","content":[]},{"class_id":"78","class_name":"古城墙","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"69","content":[]},{"class_id":"79","class_name":"周至","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"69","content":[]},{"class_id":"80","class_name":"园林酒店","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"69","content":[]}]},{"class_id":"81","class_name":"汽车服务","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"0","content":[{"class_id":"82","class_name":"专业洗车","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"81","content":[]},{"class_id":"83","class_name":"轮胎修理","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"81","content":[]},{"class_id":"84","class_name":"汽车美容","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"81","content":[]},{"class_id":"85","class_name":"加油站","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"81","content":[]}]},{"class_id":"86","class_name":"金银首饰","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"0","content":[{"class_id":"87","class_name":"翡翠玉石","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"86","content":[]},{"class_id":"88","class_name":"琥珀蜜蜡","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"86","content":[]},{"class_id":"89","class_name":"珍珠玛瑙","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"86","content":[]},{"class_id":"90","class_name":"水晶钻石","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"86","content":[]},{"class_id":"91","class_name":"金银饰品","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"86","content":[]},{"class_id":"92","class_name":"铂金钻戒","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"86","content":[]},{"class_id":"93","class_name":"岫岩玉雕","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"86","content":[]},{"class_id":"94","class_name":"彩色宝石","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"86","content":[]},{"class_id":"95","class_name":"金镶玉石","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"86","content":[]},{"class_id":"96","class_name":"裸石原石","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"86","content":[]}]},{"class_id":"97","class_name":"家装家饰","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"0","content":[{"class_id":"98","class_name":"装修定制","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"97","content":[]},{"class_id":"99","class_name":"居家日用","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"97","content":[]},{"class_id":"100","class_name":"生活日用","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"97","content":[]},{"class_id":"101","class_name":"精品家具","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"97","content":[]},{"class_id":"102","class_name":"家装建材","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"97","content":[]},{"class_id":"103","class_name":"厨房达人","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"97","content":[]},{"class_id":"104","class_name":"装修服务","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"97","content":[]},{"class_id":"105","class_name":"家装软饰","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"97","content":[]},{"class_id":"106","class_name":"厨房卫浴","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"97","content":[]},{"class_id":"107","class_name":"五金电工","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"97","content":[]}]},{"class_id":"108","class_name":"学习培训","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"0","content":[{"class_id":"109","class_name":"学习辅导","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"108","content":[]},{"class_id":"110","class_name":"文体艺术","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"108","content":[]},{"class_id":"111","class_name":"语言培训","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"108","content":[]},{"class_id":"112","class_name":"电脑ＩＴ","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"108","content":[]},{"class_id":"113","class_name":"职业技能","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"108","content":[]},{"class_id":"114","class_name":"资格考试","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"108","content":[]},{"class_id":"115","class_name":"企业管理","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"108","content":[]},{"class_id":"116","class_name":"学历文凭","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"108","content":[]},{"class_id":"117","class_name":"出国留学","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"108","content":[]},{"class_id":"118","class_name":"远程教育","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"108","content":[]}]},{"class_id":"119","class_name":"医疗诊所","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"0","content":[{"class_id":"120","class_name":"美容诊疗","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"119","content":[]},{"class_id":"121","class_name":"私立医院","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"119","content":[]},{"class_id":"122","class_name":"公立医院","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"119","content":[]},{"class_id":"123","class_name":"专科医院","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"119","content":[]},{"class_id":"124","class_name":"门诊药店","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"119","content":[]},{"class_id":"125","class_name":"健康服务","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"119","content":[]},{"class_id":"126","class_name":"养老疗养","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"119","content":[]},{"class_id":"127","class_name":"妇幼保健","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"119","content":[]},{"class_id":"128","class_name":"保健器械","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"119","content":[]},{"class_id":"129","class_name":"护理护具","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"119","content":[]}]},{"class_id":"130","class_name":"数码家电","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"0","content":[{"class_id":"131","class_name":"电脑及配件","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"130","content":[]},{"class_id":"132","class_name":"手机及配件","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"130","content":[]},{"class_id":"133","class_name":"摄影摄像","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"130","content":[]},{"class_id":"134","class_name":"智能数码","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"130","content":[]},{"class_id":"135","class_name":"影音娱乐","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"130","content":[]},{"class_id":"136","class_name":"电视","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"130","content":[]},{"class_id":"137","class_name":"空调","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"130","content":[]},{"class_id":"138","class_name":"洗衣机","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"130","content":[]},{"class_id":"139","class_name":"厨卫电器","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"130","content":[]},{"class_id":"140","class_name":"生活电器","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"130","content":[]},{"class_id":"141","class_name":"个护健康","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"130","content":[]}]},{"class_id":"142","class_name":"电影演出","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"0","content":[{"class_id":"143","class_name":"电影票","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"142","content":[]},{"class_id":"144","class_name":"演出票","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"142","content":[]},{"class_id":"145","class_name":"赛事票","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"142","content":[]},{"class_id":"146","class_name":"资讯","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"142","content":[]},{"class_id":"147","class_name":"在线选座","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"142","content":[]},{"class_id":"148","class_name":"优惠券","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"142","content":[]},{"class_id":"149","class_name":"转让票","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"142","content":[]},{"class_id":"150","class_name":"活动福利","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"142","content":[]}]},{"class_id":"151","class_name":"花店盆景","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"0","content":[{"class_id":"152","class_name":"花卉市场","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"151","content":[]},{"class_id":"153","class_name":"写字楼花店","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"151","content":[]},{"class_id":"154","class_name":"街头花店","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"151","content":[]},{"class_id":"155","class_name":"多肉专区","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"151","content":[]},{"class_id":"156","class_name":"花肥花瓶","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"151","content":[]},{"class_id":"157","class_name":"松柏盆景","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"151","content":[]},{"class_id":"158","class_name":"杂木盆景","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"151","content":[]},{"class_id":"159","class_name":"观花盆景","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"151","content":[]},{"class_id":"160","class_name":"观叶盆景","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"151","content":[]},{"class_id":"161","class_name":"观果盆景","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"151","content":[]},{"class_id":"162","class_name":"山石盆景","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"151","content":[]}]},{"class_id":"163","class_name":"旅游团购","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"0","content":[{"class_id":"164","class_name":"国际游","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"163","content":[]},{"class_id":"165","class_name":"国内游","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"163","content":[]},{"class_id":"166","class_name":"周边游","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"163","content":[]},{"class_id":"167","class_name":"酒店住宿","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"163","content":[]},{"class_id":"168","class_name":"机票车票","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"163","content":[]},{"class_id":"169","class_name":"美食团购","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"163","content":[]},{"class_id":"170","class_name":"娱乐团购","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"163","content":[]},{"class_id":"171","class_name":"生活团购","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"163","content":[]},{"class_id":"172","class_name":"身边团购","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"163","content":[]},{"class_id":"173","class_name":"出游团购","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"163","content":[]},{"class_id":"174","class_name":"其他团购","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"163","content":[]}]}]
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
         * class_id : 1
         * class_name : 酒店住宿
         * class_image : http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg
         * class_parent_id : 0
         * content : [{"class_id":"2","class_name":"园林酒店","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"1","content":[]},{"class_id":"3","class_name":"设计师酒店","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"1","content":[]},{"class_id":"4","class_name":"青年旅社","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"1","content":[]},{"class_id":"5","class_name":"特色客栈","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"1","content":[]},{"class_id":"6","class_name":"主题酒店","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"1","content":[]},{"class_id":"7","class_name":"公寓型酒店","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"1","content":[]},{"class_id":"8","class_name":"海外酒店","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"1","content":[]},{"class_id":"9","class_name":"度假酒店","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"1","content":[]},{"class_id":"10","class_name":"海岛酒店","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"1","content":[]},{"class_id":"11","class_name":"温泉酒店","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"1","content":[]},{"class_id":"12","class_name":"高级酒店","class_image":"http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg","class_parent_id":"1","content":[]}]
         */

        private String class_id;
        private String class_name;
        private String class_image;
        private String class_parent_id;
        private List<ContentBean> content;

        public String getClass_id() {
            return class_id;
        }

        public void setClass_id(String class_id) {
            this.class_id = class_id;
        }

        public String getClass_name() {
            return class_name;
        }

        public void setClass_name(String class_name) {
            this.class_name = class_name;
        }

        public String getClass_image() {
            return class_image;
        }

        public void setClass_image(String class_image) {
            this.class_image = class_image;
        }

        public String getClass_parent_id() {
            return class_parent_id;
        }

        public void setClass_parent_id(String class_parent_id) {
            this.class_parent_id = class_parent_id;
        }

        public List<ContentBean> getContent() {
            return content;
        }

        public void setContent(List<ContentBean> content) {
            this.content = content;
        }

        public static class ContentBean {
            /**
             * class_id : 2
             * class_name : 园林酒店
             * class_image : http://sjlm.test.zhonghuass.cn/admin/public/img/a3.jpg
             * class_parent_id : 1
             * content : []
             */

            private String class_id;
            private String class_name;
            private String class_image;
            private String class_parent_id;
            private List<?> content;

            public String getClass_id() {
                return class_id;
            }

            public void setClass_id(String class_id) {
                this.class_id = class_id;
            }

            public String getClass_name() {
                return class_name;
            }

            public void setClass_name(String class_name) {
                this.class_name = class_name;
            }

            public String getClass_image() {
                return class_image;
            }

            public void setClass_image(String class_image) {
                this.class_image = class_image;
            }

            public String getClass_parent_id() {
                return class_parent_id;
            }

            public void setClass_parent_id(String class_parent_id) {
                this.class_parent_id = class_parent_id;
            }

            public List<?> getContent() {
                return content;
            }

            public void setContent(List<?> content) {
                this.content = content;
            }
        }

        @Override
        public String toString() {
            return "MsgBean{" +
                    "class_id='" + class_id + '\'' +
                    ", class_name='" + class_name + '\'' +
                    ", class_image='" + class_image + '\'' +
                    ", class_parent_id='" + class_parent_id + '\'' +
                    ", content=" + content +
                    '}';
        }
    }
}
