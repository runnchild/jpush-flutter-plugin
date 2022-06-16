//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cn.jiguang.api;

import android.content.Context;

public class JCoreInterface {
    private static final String TAG = "JCoreInterface";
    private static Context mApplicationContext;
    public static String DAEMON_ACTION = "cn.jpush.android.intent.DaemonService";

    public JCoreInterface() {
    }

//    public static void initAction(String var0, Class<? extends JAction> var1) {
//        a.a().a(var0, var1.getName());
//    }
//
//    public static void initActionExtra(String var0, Class<? extends JActionExtra> var1) {
//        a.a().b(var0, var1.getName());
//    }
//
//    public static boolean init(Context var0, boolean var1) {
//        if (var0 != null) {
//            mApplicationContext = var0;
//        }
//
//        JCoreManager.init(var0);
//        return true;
//    }
//
//    public static void register(Context var0) {
//        d.b("JCoreInterface", "Action - init registerOnly:");
//        if (var0 != null) {
//            mApplicationContext = var0;
//        }
//
//        JCoreManager.init(var0);
//    }
//
//    public static void sendData(Context var0, String var1, int var2, byte[] var3) {
//        send(var0, var1, var2, var3, 0, false);
//    }

    private static void send(Context var0, String var1, int var2, byte[] var3, int var4, boolean var5) {
    }


    public static void setWakeEnable(Context var0, boolean var1) {
    }

}
