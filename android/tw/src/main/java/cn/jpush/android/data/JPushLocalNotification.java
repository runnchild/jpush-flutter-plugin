//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cn.jpush.android.data;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

public class JPushLocalNotification implements Serializable {
    private static final long serialVersionUID = 1472982106750878137L;
    private int a = 1;
    private String b = "";
    private String c = "00";
    private String d = "00";
    private long e = 0L;
    private String f;
    private String g;
    private String h;
    private long i;
    private long j = 1L;
    private int k = 1;
    private String l = "";
    private String m = "";

    public JPushLocalNotification() {
    }

    public String toJSON() {
        JSONObject var1 = new JSONObject();

        try {
            JSONObject var2 = new JSONObject();
            if (!TextUtils.isEmpty(this.h)) {
                JSONObject var3 = new JSONObject(this.h);
                var2.put("n_extras", var3);
            }

            this.a("n_content", this.f, var2);
            this.a("n_title", this.g, var2);
            this.a("n_content", this.f, var2);
            var2.put("ad_t", 0);
            var1.put("m_content", var2);
            this.a("msg_id", "" + this.j, var1);
            this.a("content_type", this.m, var1);
            this.a("override_msg_id", this.l, var1);
            var1.put("n_only", this.k);
            var1.put("n_builder_id", this.i);
            var1.put("show_type", 3);
            var1.put("notificaion_type", 1);
        } catch (JSONException var4) {
        }

        return var1.toString();
    }

    private void a(String var1, String var2, JSONObject var3) {
//        if (!TextUtils.isEmpty(var2)) {
//            var3.put(var1, var2);
//        }

    }

    public void setNotificationId(long var1) {
        this.j = (long)((int)var1);
    }

    public long getNotificationId() {
        return this.j;
    }

    public void setBroadcastTime(long var1) {
        this.e = var1;
    }

    public void setBroadcastTime(Date var1) {
        this.e = var1.getTime();
    }

    public void setBroadcastTime(int var1, int var2, int var3, int var4, int var5, int var6) {
        if (var1 >= 0 && var2 >= 1 && var2 <= 12 && var3 >= 1 && var3 <= 31 && var4 >= 0 && var4 <= 23 && var5 >= 0 && var5 <= 59 && var6 >= 0 && var6 <= 59) {
            Calendar var7 = Calendar.getInstance();
            var7.set(var1, var2 - 1, var3, var4, var5, var6);
            Date var8 = var7.getTime();
            long var9 = System.currentTimeMillis();
            if (var8.getTime() < var9) {
                this.e = var9;
            } else {
                this.e = var8.getTime();
            }

        } else {
//            Logger.ee("JPushLocalNotification", "Set time fail! Please check your args!");
        }
    }

    public long getBroadcastTime() {
        return this.e;
    }

    public void setExtras(String var1) {
        this.h = var1;
    }

    public String getExtras() {
        return this.h;
    }

    public String getTitle() {
        return this.g;
    }

    public void setTitle(String var1) {
        this.g = var1;
    }

    public String getContent() {
        return this.f;
    }

    public void setContent(String var1) {
        this.f = var1;
    }

    public long getBuilderId() {
        return this.i;
    }

    public void setBuilderId(long var1) {
        this.i = var1;
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else if (var1 != null && this.getClass() == var1.getClass()) {
            JPushLocalNotification var2 = (JPushLocalNotification)var1;
            return this.j == var2.j;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (int)(this.j ^ this.j >>> 32);
    }
}
