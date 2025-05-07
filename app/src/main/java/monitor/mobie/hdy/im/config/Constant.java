package monitor.mobie.hdy.im.config;

import java.text.SimpleDateFormat;

public interface Constant {
     public static final String BARK_ENABLE = "bark_enable";
     public static final String BARK_URL = "bark_url";
     public static final String COUSTOM_ENABLE = "coustom_enable";
     public static final String COUSTOM_METHOD = "coustom_method";
     public static final String COUSTOM_REMARK = "coustom_remark";
     public static final String COUSTOM_URL = "coustom_url";
     public static final String DATA = "data";
     public static final String DELETE = "DELETE";
     public static final SimpleDateFormat FORMATTER = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
     public static final String GET = "GET";
     public static final String POST = "POST";
     public static final String PUT = "PUT";
     public static final String SCKEY = "SCT120193TiRX9jadoS2u0CLPsNaQSdIDx";
     public static final String SCKEY_ENABLE = "SCKEY_enable";
     public static final String WX_AGENTID = "wx_agentid";
     public static final String WX_CORPID = "wx_corpid";
     public static final String WX_CORPSECRET = "wx_corpsecret";
     public static final String WX_ENABLE = "wx_enable";
     public static final String EMAIL_ENABLE = "email_enable";
     public static final String EMAIL_ACCOUNT = "email_account";
     public static final String EMAIL_PASSWORD = "email_password";
     public static final String EMAIL_TYPE = "email_type";
     public static final String EMAIL_RECEIVER = "email_receiver";


     /**
      * 预设常用的软件包名，一键启用对对应软件的通知接收
      */
     // 中国常用社交软件
     public static final String[] ChinaTalkAPP = {
             "com.tencent.mobileqq",
             "com.tencent.mm",
             "com.alibaba.android.rimet",
             "com.tencent.qqlite",
             "com.tencent.minihd.qq",
             "com.tencent.mobileqqi",
             "com.tencent.tim",
             "com.bullet.messenger",
             "com.tencent.eim",
             "com.tencent.wework"
     };

     // 中国常用购物消费软件
     public static final String[] ChinaShopAPP = {
             "com.taobao.taobao"
     };

     // 国外常用社交软件
     public static final String[] OtherTalkAPP = {
             "com.twitter.android",
             "com.skype.raider",
             "com.facebook.katana",
             "com.android.chrome",
             "com.whatsapp",
             "com.facebook.orca"
     };

     // 新闻类软件
     public static final String[] NewsAPP = {
             "com.ss.android.article.news",
             "com.sina.weibo",
             "com.netease.newsreader.activity",
             "com.sohu.newsclient"
     };

     // 短视频类
     public static final String[] ShortVideos = {             
             "com.youku.phone",
             "com.qiyi.video",
             "com.tencent.qqlive",
             "air.tv.douyu.android"
     };


     // 外卖类
     public static final String[] TakeOut = {
             "me.ele",
             "com.sankuai.meituan.takeoutnew",
             "com.dianping.v1"
     };


     // 音乐类
     public static final String[] Music = {
             "com.tencent.qqmusic",
             "com.kugou.android"
     };

     // 短信和电话
     public static final String[] PhoneAndMessage = {
             "com.android.contacts",
             "com.android.dialer",
             "com.android.mms",
             "com.android.providers.telephony",
             "com.android.phone",
             "com.android.incallui"
     };

}
