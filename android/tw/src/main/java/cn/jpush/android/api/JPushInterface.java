//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cn.jpush.android.api;

import android.content.Context;

import java.util.Set;

import cn.jpush.android.data.JPushLocalNotification;

public class JPushInterface {
    public static final String PUSH_MESSAGE_PERMISSION_POSTFIX = ".permission.JPUSH_MESSAGE";
    public static final String ACTION_CONNECTION_CHANGE = "cn.jpush.android.intent.CONNECTION";
    public static final String ACTION_REGISTRATION_ID = "cn.jpush.android.intent.REGISTRATION";
    public static final String ACTION_MESSAGE_RECEIVED = "cn.jpush.android.intent.MESSAGE_RECEIVED";
    public static final String ACTION_NOTIFICATION_RECEIVED = "cn.jpush.android.intent.NOTIFICATION_RECEIVED";
    public static final String ACTION_NOTIFICATION_OPENED = "cn.jpush.android.intent.NOTIFICATION_OPENED";
    public static final String ACTION_NOTIFICATION_CLICK_ACTION = "cn.jpush.android.intent.NOTIFICATION_CLICK_ACTION";
    public static final String ACTION_NOTIFICATION_CLICK_ACTION_PROXY = "cn.jpush.android.intent.NOTIFICATION_CLICK_ACTION_PROXY";
    public static final String ACTION_NOTIFICATION_RECEIVED_PROXY = "cn.jpush.android.intent.NOTIFICATION_RECEIVED_PROXY";
    public static final String ACTION_IN_APP_MSG_RECEIVED = "cn.jpush.android.intent.IN_APP_MSG_RECEIVED";
    public static final String ACTION_IN_APP_MSG_CLICK = "cn.jpush.android.intent.IN_APP_MSG_CLICK";
    public static final String EXTRA_CONNECTION_CHANGE = "cn.jpush.android.CONNECTION_CHANGE";
    public static final String EXTRA_REGISTRATION_ID = "cn.jpush.android.REGISTRATION_ID";
    public static final String EXTRA_APP_KEY = "cn.jpush.android.APPKEY";
    public static final String EXTRA_NOTIFICATION_DEVELOPER_ARG0 = "cn.jpush.android.NOTIFICATION_DEVELOPER_ARG0";
    public static final String EXTRA_NOTIFICATION_TITLE = "cn.jpush.android.NOTIFICATION_CONTENT_TITLE";
    public static final String EXTRA_NOTIFICATION_URL = "cn.jpush.android.NOTIFICATION_URL";
    public static final String EXTRA_PUSH_ID = "cn.jpush.android.PUSH_ID";
    public static final String EXTRA_MSG_ID = "cn.jpush.android.MSG_ID";
    public static final String EXTRA_NOTI_TYPE = "cn.jpush.android.NOTIFICATION_TYPE";
    public static final String EXTRA_ALERT = "cn.jpush.android.ALERT";
    public static final String EXTRA_ALERT_TYPE = "cn.jpush.android.ALERT_TYPE";
    public static final String EXTRA_MESSAGE = "cn.jpush.android.MESSAGE";
    public static final String EXTRA_CONTENT_TYPE = "cn.jpush.android.CONTENT_TYPE";
    public static final String EXTRA_TITLE = "cn.jpush.android.TITLE";
    public static final String EXTRA_BIG_TEXT = "cn.jpush.android.BIG_TEXT";
    public static final String EXTRA_INBOX = "cn.jpush.android.INBOX";
    public static final String EXTRA_BIG_PIC_PATH = "cn.jpush.android.BIG_PIC_PATH";
    public static final String EXTRA_EXTRA = "cn.jpush.android.EXTRA";
    public static final String EXTRA_NOTI_PRIORITY = "cn.jpush.android.NOTI_PRIORITY";
    public static final String EXTRA_NOTI_CATEGORY = "cn.jpush.android.NOTI_CATEGORY";
    public static final String EXTRA_NOTIFICATION_ID = "cn.jpush.android.NOTIFICATION_ID";
    public static final String EXTRA_NOTIFICATION_ACTION_EXTRA = "cn.jpush.android.NOTIFIACATION_ACTION_EXTRA";
    public static final String EXTRA_NOTIFICATION_SMALL_ICON = "cn.jpush.android.NOTIFICATION_SMALL_ICON";
    public static final String EXTRA_NOTIFICATION_LARGET_ICON = "cn.jpush.android.NOTIFICATION_LARGE_ICON";
    public static final String EXTRA_ACTIVITY_PARAM = "cn.jpush.android.ACTIVITY_PARAM";
    public static final String EXTRA_TYPE_PLATFORM = "cn.jpush.android.TYPE_PLATFORM";
    public static final String EXTRA_RICHPUSH_FILE_PATH = "cn.jpush.android.FILE_PATH";
    public static final String EXTRA_RICHPUSH_FILE_TYPE = "cn.jpush.android.FILE_TYPE";
    public static final String EXTRA_RICHPUSH_HTML_PATH = "cn.jpush.android.HTML_PATH";
    public static final String EXTRA_RICHPUSH_HTML_RES = "cn.jpush.android.HTML_RES";
    public static final String EXTRA_STATUS = "cn.jpush.android.STATUS";
    public static int DEFAULT_NOTIFICATION_NUM = 5;
    private static final Integer a = 0;
    public static final String ACTION_RICHPUSH_CALLBACK = "cn.jpush.android.intent.ACTION_RICHPUSH_CALLBACK";

    public JPushInterface() {
    }

    public static void init(Context var0) {
    }

    public static void setNotificationCallBackEnable(Context var0, boolean var1) {

    }

    public static void resumePush(Context var0) {
    }

    public static void stopPush(Context var0) {
    }

//    public static boolean isPushStopped(Context var0) {
//        checkContext(var0);
//        JCoreHelper.runActionWithService(var0, "JPUSH", "check_stop", (Bundle)null);
//        return cn.jpush.android.cache.a.e(var0);
//    }
//
    public static void setDebugMode(boolean var0) {
    }

    public static void setChannel(Context var0, String var1) {
    }

//    public static void setPushTime(Context var0, Set<Integer> var1, int var2, int var3) {
//        checkContext(var0);
//        if (!cn.jpush.android.bu.a.a(var0)) {
//            Logger.dd("JPushInterface", "检测到当前没有网络。此动作将在有网络时自动继续执行。");
//        }
//
//        if (null == var1) {
//            Bundle var7 = new Bundle();
//            var7.putString("time", "0123456_0^23");
//            JCoreHelper.runActionWithService(var0, "JPUSH", "pushtime", var7);
//        } else if (var1.size() != 0 && !var1.isEmpty()) {
//            if (var2 > var3) {
//                Logger.ee("JPushInterface", "Invalid time format - startHour should less than endHour");
//            } else {
//                StringBuilder var4 = new StringBuilder();
//                Iterator var5 = var1.iterator();
//
//                while(var5.hasNext()) {
//                    Integer var6 = (Integer)var5.next();
//                    if (var6 > 6 || var6 < 0) {
//                        Logger.ee("JPushInterface", "Invalid day format - " + var6);
//                        return;
//                    }
//
//                    var4.append(var6);
//                }
//
//                var4.append("_");
//                var4.append(var2);
//                var4.append("^");
//                var4.append(var3);
//                Bundle var8 = new Bundle();
//                var8.putString("time", var4.toString());
//                JCoreHelper.runActionWithService(var0, "JPUSH", "pushtime", var8);
//            }
//        } else {
//            JCoreHelper.runActionWithService(var0, "JPUSH", "disable_push", (Bundle)null);
//        }
//    }
//
//    public static void setSilenceTime(Context var0, int var1, int var2, int var3, int var4) {
//        checkContext(var0);
//        if (var1 >= 0 && var2 >= 0 && var3 >= 0 && var4 >= 0 && var2 <= 59 && var4 <= 59 && var3 <= 23 && var1 <= 23) {
//            if (var1 == 0 && var2 == 0 && var3 == 0 && var4 == 0) {
//                Bundle var8 = new Bundle();
//                var8.putString("time", "");
//                JCoreHelper.runActionWithService(var0, "JPUSH", "silenceTime", var8);
//                Logger.dd("JPushInterface", "Remove the silence time!");
//            } else {
//                JSONObject var5 = new JSONObject();
//
//                try {
//                    var5.put("startHour", var1);
//                    var5.put("startMins", var2);
//                    var5.put("endHour", var3);
//                    var5.put("endtMins", var4);
//                    Bundle var6 = new Bundle();
//                    var6.putString("time", var5.toString());
//                    JCoreHelper.runActionWithService(var0, "JPUSH", "silenceTime", var6);
//                } catch (JSONException var7) {
//                }
//
//            }
//        } else {
//            Logger.ee("JPushInterface", "Invalid parameter format, startHour and endHour should between 0 ~ 23, startMins and endMins should between 0 ~ 59. ");
//        }
//    }

    public static String getRegistrationID(Context var0) {
        return "JCoreHelper.getRegistrationID(var0)";
    }

    private static void checkContext(Context var0) {
    }

//    public static String getUdid(Context var0) {
//        checkContext(var0);
//        return JCoreHelper.getDeviceId(var0);
//    }

    public static void setLatestNotificationNumber(Context var0, int var1) {
    }

    public static void clearAllNotifications(Context var0) {
    }

    public static void clearNotificationById(Context var0, int var1) {
    }

//    public static void setDefaultPushNotificationBuilder(PushNotificationBuilder var0) {
//        if (null == var0) {
//            throw new IllegalArgumentException("NULL notification");
//        } else {
//            Bundle var1 = new Bundle();
//            var1.putInt("buidler_id", a);
//            var1.putString("buidler_string", var0.toString());
//            JCoreHelper.runActionWithService(JPushConstants.mApplicationContext, "JPUSH", "set_custom_notify", var1);
//        }
//    }
//
//    public static void setPushNotificationBuilder(Integer var0, PushNotificationBuilder var1) {
//        Logger.vv("JPushInterface", "action:setPushNotificationBuilder - id:" + var0);
//        if (null == var1) {
//            throw new IllegalArgumentException("NULL pushNotificationBuilder");
//        } else if (var0 < 1) {
//            Logger.ee("JPushInterface", "id should be larger than 0");
//        } else {
//            Bundle var2 = new Bundle();
//            var2.putInt("buidler_id", var0);
//            var2.putString("buidler_string", var1.toString());
//            JCoreHelper.runActionWithService(JPushConstants.mApplicationContext, "JPUSH", "set_custom_notify", var2);
//        }
//    }

    @Deprecated
    public void setAliasAndTags(Context var1, String var2, Set<String> var3) {
    }

    @Deprecated
    public static void setAliasAndTags(Context var0, String var1, Set<String> var2, TagAliasCallback var3) {
    }

    @Deprecated
    public static void setTags(Context var0, Set<String> var1, TagAliasCallback var2) {
        checkContext(var0);
        setAliasAndTags(var0, (String)null, var1, var2);
    }

    @Deprecated
    public static void setAlias(Context var0, String var1, TagAliasCallback var2) {
        checkContext(var0);
        setAliasAndTags(var0, var1, (Set)null, var2);
    }

//    public static Set<String> filterValidTags(Set<String> var0) {
//        return cn.jpush.android.bs.a.a(var0);
//    }

    public static void setTags(Context var0, int var1, Set<String> var2) {
    }

    public static void addTags(Context var0, int var1, Set<String> var2) {
    }

    public static void deleteTags(Context var0, int var1, Set<String> var2) {
    }

    public static void cleanTags(Context var0, int var1) {
    }

    public static void getAllTags(Context var0, int var1) {
    }

    public static void checkTagBindState(Context var0, int var1, String var2) {
    }

    public static void setAlias(Context var0, int var1, String var2) {
    }

    public static void deleteAlias(Context var0, int var1) {
    }

    public static void getAlias(Context var0, int var1) {
    }

//    public static void setMobileNumber(Context var0, int var1, String var2) {
//        checkContext(var0);
//        d.a().a(var0, var1, var2);
//    }
//
//    public static void reportMessageOpened(Context var0, String var1, byte var2) {
//        checkContext(var0);
//        if (TextUtils.isEmpty(var1)) {
//            Logger.ee("JPushInterface", "The msgId is not valid - " + var1);
//        } else {
//            c.a(var1, "", var2, 1028, var0);
//        }
//    }
//
//    public static void reportNotificationOpened(Context var0, String var1) {
//        checkContext(var0);
//        if (TextUtils.isEmpty(var1)) {
//            Logger.ee("JPushInterface", "The msgId is not valid - " + var1);
//        } else {
//            c.a(var1, 1028, var0);
//        }
//    }
//
//    public static void reportNotificationOpened(Context var0, String var1, byte var2) {
//    }
//
//    public static void reportNotificationOpened(Context var0, String var1, byte var2, String var3) {
//    }

    @Deprecated
    public static boolean getConnectionState(Context var0) {
        return true;
    }

//    public static void onResume(Context var0) {
//        JCoreHelper.saEvent(var0, "resume", (Object)null);
//    }
//
//    public static void onPause(Context var0) {
//        JCoreHelper.saEvent(var0, "pause", (Object)null);
//    }
//
//    public static void onFragmentResume(Context var0, String var1) {
//        JCoreHelper.saEvent(var0, "f_resume", var1);
//        if (TextUtils.isEmpty(var1)) {
//            Logger.ee("JPushInterface", "fragmentName can not null");
//        } else {
//            Bundle var2 = new Bundle();
//            var2.putString("activity_name", var1);
//            var2.putBoolean("state", true);
//            ActionHelper.getInstance().doSingleAction(var0, "sync_fragment_life", var2);
//        }
//    }
//
//    public static void onFragmentPause(Context var0, String var1) {
//        JCoreHelper.saEvent(var0, "f_pause", var1);
//        if (TextUtils.isEmpty(var1)) {
//            Logger.ee("JPushInterface", "fragmentName can not null");
//        } else {
//            Bundle var2 = new Bundle();
//            var2.putString("activity_name", var1);
//            var2.putBoolean("state", false);
//            ActionHelper.getInstance().doSingleAction(var0, "sync_fragment_life", var2);
//        }
//    }
//
//    public static void onKillProcess(Context var0) {
//        JCoreHelper.saEvent(var0, "kill", (Object)null);
//    }
//
//    public static void setStatisticsSessionTimeout(long var0) {
//    }
//
//    public static void setStatisticsEnable(boolean var0) {
//    }
//
//    public static void initCrashHandler(Context var0) {
//        checkContext(var0);
//        JCoreManager.initCrashHandler(var0);
//    }
//
//    public static void stopCrashHandler(Context var0) {
//        checkContext(var0);
//        JCoreManager.stopCrashHandler(var0);
//    }

    public static void addLocalNotification(Context var0, JPushLocalNotification var1) {
    }

//    public static void removeLocalNotification(Context var0, long var1) {
//        checkContext(var0);
//        cn.jpush.android.bg.d.a(var0, var1);
//    }
//
//    public static void clearLocalNotifications(Context var0) {
//        checkContext(var0);
//        cn.jpush.android.bg.d.a(var0);
//    }
//
//    private static boolean checkLengthOfTags(String var0) {
//        int var1 = 0;
//        if (!TextUtils.isEmpty(var0)) {
//            var1 += var0.getBytes().length;
//        }
//
//        Logger.v("JPushInterface", "tags length:" + var1);
//        return var1 <= 7000;
//    }
//
//    public static String getStringTags(Set<String> var0) {
//        return cn.jpush.android.bs.a.b(var0);
//    }
//
//    private static void setDefaultNotifactionNumber(Context var0) {
//        setLatestNotificationNumber(var0, DEFAULT_NOTIFICATION_NUM);
//    }
//
//    public static void requestPermission(Context var0) {
//        if (var0 == null) {
//            Logger.ww("JPushInterface", "[requestPermission] unexcepted - context was null");
//        } else {
//            JCoreManager.requestPermission(var0);
//        }
//    }
//
//    public static void setDaemonAction(String var0) {
//    }
//
//    public static void setPowerSaveMode(Context var0, boolean var1) {
//    }
//
//    public static void setGeofenceInterval(Context var0, long var1) {
//        checkContext(var0);
//        if (var1 >= 180000L && var1 <= 86400000L) {
//            Bundle var3 = new Bundle();
//            var3.putLong("interval", var1);
//            JCoreHelper.runActionWithService(var0, "JPUSH", "geo_interval", var3);
//        } else {
//            Logger.ee("JPushInterface", "Invalid interval, it should be a ms number between 3 mins and 1 day!");
//        }
//    }
//
//    public static void setMaxGeofenceNumber(Context var0, int var1) {
//        checkContext(var0);
//        if (var1 >= 1 && var1 <= 100) {
//            Bundle var2 = new Bundle();
//            var2.putInt("num", var1);
//            JCoreHelper.runActionWithService(var0, "JPUSH", "geo_fence_max_num", var2);
//        } else {
//            Logger.ee("JPushInterface", "Invalid maxNumber,it should be a number between 1 and 100!");
//        }
//    }
//
//    public static void deleteGeofence(Context var0, String var1) {
//        checkContext(var0);
//        Bundle var2 = new Bundle();
//        var2.putString("id", var1);
//        JCoreHelper.runActionWithService(var0, "JPUSH", "delete_geo_fence", var2);
//    }
//
//    private static void taq() {
//        JPushConstants.testAndroidQ();
//    }

    public static void setBadgeNumber(Context var0, int var1) {
    }

//    public static void setLbsEnable(Context var0, boolean var1) {
//        try {
//            JCoreManager.setLBSEnable(var0, var1);
//        } catch (Throwable var4) {
//            Logger.ee("JPushInterface", "not found [setLBSEnable] in jcore");
//        }
//
//        try {
//            if (!var1) {
//                cn.jpush.android.cache.a.d(var0, false);
//            }
//
//            Bundle var2 = new Bundle();
//            var2.putBoolean("enable", var1);
//            JCoreHelper.runActionWithService(var0, "JPUSH", "enable_lbs", var2);
//        } catch (Throwable var3) {
//        }
//
//    }
//
//    public static void setSmartPushEnable(Context var0, boolean var1) {
//        try {
//            Bundle var2 = new Bundle();
//            var2.putBoolean("enable", var1);
//            JCoreHelper.runActionWithService(var0, "JPUSH", "enable_smart_push", var2);
//        } catch (Throwable var3) {
//        }
//
//    }
//
//    public static void attachBaseContext(Context var0) {
//        try {
//            long var1 = System.currentTimeMillis();
//            Class.forName("cn.jpush.android.dy.JPushThirdDyManager").getDeclaredMethod("attachBaseContext", Context.class).invoke((Object)null, var0);
//            Logger.d("JPushInterface", "use time:" + (System.currentTimeMillis() - var1));
//        } catch (Throwable var3) {
//        }
//
//    }

    public static int isNotificationEnabled(Context var0) {
       return 1;
    }

    public static void goToAppNotificationSettings(Context var0) {
    }

//    public static void setThirdPushEnable(Context var0, boolean var1) {
//        try {
//            JPushConstants.THIRD_ENABLE = var1;
//            Bundle var2 = new Bundle();
//            var2.putBoolean("enable", var1);
//            JCoreHelper.runActionWithService(var0, "JPUSH", "third_enable", var2);
//        } catch (Throwable var3) {
//        }
//
//    }
//
//    public static void reportWakedData(Context var0, Bundle var1, int var2) {
//        checkContext(var0);
//
//        try {
//            JCoreManager.reportWakedData(var0, var1, var2);
//        } catch (Throwable var4) {
//            Logger.ee("JPushInterface", "not found [reportWakedData] in jcore");
//        }
//
//    }

    @Deprecated
    public static void pullInAppMessage(Context var0, int var1) {
    }

    @Deprecated
    public static void pullInAppMessage(Context var0, int var1, int var2) {
    }

//    public static void pullInAppMessage(Context var0, int var1, String var2) {
//        checkContext(var0);
//
//        try {
//            Bundle var3 = new Bundle();
//            var3.putInt("sequence", var1);
//            var3.putString("AdPositionKey", var2);
//            JCoreHelper.runActionWithService(var0, "JPUSH", "in_app_req", var3);
//        } catch (Throwable var4) {
//        }
//
//    }
//
//    public static void pullInAppMessageWithParams(Context var0, InAppSlotParams var1) {
//        checkContext(var0);
//
//        try {
//            Bundle var2 = new Bundle();
//            if (null != var1) {
//                var2.putString("inapp_param", var1.toJSONString());
//            }
//
//            JCoreHelper.runActionWithService(var0, "JPUSH", "in_app_req", var2);
//        } catch (Throwable var3) {
//        }
//
//    }
//
//    public static void triggerInAppMsgByEvent(Context var0, int var1, String var2) {
//        checkContext(var0);
//
//        try {
//            Bundle var3 = new Bundle();
//            var3.putInt("sequence", var1);
//            var3.putString("event_name", var2);
//            JCoreHelper.runActionWithService(var0, "JPUSH", "trigger_in_app_event", var3);
//        } catch (Throwable var4) {
//        }
//
//    }
//
//    public static void si(Context var0, Bundle var1) {
//        checkContext(var0);
//        JCoreHelper.runActionWithService(var0, "JPUSH", "si", var1);
//    }
//
//    public static void checkSupportVasMessage(Context var0, int var1) {
//        checkContext(var0);
//
//        try {
//            Bundle var2 = new Bundle();
//            var2.putInt("type", var1);
//            JCoreHelper.runActionWithService(var0, "JPUSH", "check_vas_integrate", var2);
//        } catch (Throwable var3) {
//        }
//
//    }
//
//    public static void setHbPeriodEnable(Context var0, boolean var1) {
//        checkContext(var0);
//
//        try {
//            Bundle var2 = new Bundle();
//            var2.putBoolean("enable", var1);
//            JCoreHelper.runActionWithService(var0, "JPUSH", "set_hb_period_enable", var2);
//        } catch (Throwable var3) {
//        }
//
//    }
//
//    static {
//        JCoreManager.addDispatchAction("JPUSH", cn.jpush.android.helper.b.class.getName());
//    }

    public static class InAppStyle {
        public static int STYLE_BANNER = 1;
        public static int STYLE_MODAL = 2;
        public static int STYLE_FLOAT = 4;

        public InAppStyle() {
        }
    }

    public static class ErrorCode {
        public static int SUCCESS = 0;
        public static int NULL_TAGANDALIAS = 6001;
        public static int TIMEOUT = 6002;
        public static int INVALID_ALIAS = 6003;
        public static int TOO_LONG_ALIAS = 6004;
        public static int INVALID_TAGS = 6005;
        public static int TOO_LONG_TAGS = 6006;
        public static int TOO_MANY_TAGS = 6007;
        public static int TOO_LONG_TAGALIAS = 6008;
        public static int UNKNOWN_ERROR = 6009;
        public static int INVALID_JSON = 6010;
        public static int INVOKE_TOO_SOON = 6011;
        public static int PUSH_STOPED = 6012;
        public static int INCORRECT_TIME = 6013;
        public static int ERROR_CODE_TOO_BUSY = 6014;
        public static int ERROR_CODE_BLACKLIST = 6015;
        public static int ERROR_CODE_INVALIDUSER = 6016;
        public static int ERROR_CODE_INVALIDREQ = 6017;
        public static int ERROR_CODE_TOO_MANY_TAGS = 6018;
        public static int ERROR_CODE_GET_FAILED = 6019;
        public static int ERROR_CODE_SERVER_UNAVAILABLE = 6020;
        public static int ERROR_CODE_TAG_OPERATORING = 6021;
        public static int ERROR_CODE_ALIAS_OPERATORING = 6022;
        public static int ERROR_CODE_INVALID_MOBILENUMBER = 6023;
        public static int ERROR_CODE_INTERNEL_SERVER_ERROR = 6024;
        public static int ERROR_CODE_TOO_LONG_MOBILENUMBER = 6025;
        public static int ERROR_CODE_ALIAS_LIMIT = 6027;
        public static int HAS_IN_APP_DATA = 6028;
        public static int ERROR_CODE_NO_IN_APP_DATA = 6029;
        public static int ERROR_CODE_OVER_FREQUENCY_SRV = 6030;
        public static int ERROR_CODE_OVER_FREQUENCY = 6031;
        public static int ERROR_CODE_STYLE_NOT_SUPPORT = 6032;
        public static int ERROR_CODE_SERVER_INTERNAL_ERROR = 6033;
        public static int ERROR_CODE_MODE_NOT_MATCH = 6034;
        public static int ERROR_CODE_NOT_PULL_IN_BLOCK_LIST = 6035;

        public ErrorCode() {
        }
    }
}
