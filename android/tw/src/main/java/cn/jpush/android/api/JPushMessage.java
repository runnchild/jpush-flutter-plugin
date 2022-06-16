//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cn.jpush.android.api;

import java.io.Serializable;
import java.util.Set;

public class JPushMessage implements Serializable {
    private static final long serialVersionUID = 1L;
    private String a;
    private Set<String> b;
    private String c;
    private int d;
    private boolean e;
    private boolean f;
    private int g;
    private String h;

    public JPushMessage() {
    }

    public String getAlias() {
        return this.a;
    }

    public void setAlias(String var1) {
        this.a = var1;
    }

    public Set<String> getTags() {
        return this.b;
    }

    public void setTags(Set<String> var1) {
        this.b = var1;
    }

    public int getErrorCode() {
        return this.d;
    }

    public void setErrorCode(int var1) {
        this.d = var1;
    }

    public int getSequence() {
        return this.g;
    }

    public void setSequence(int var1) {
        this.g = var1;
    }

    public String getCheckTag() {
        return this.c;
    }

    public void setCheckTag(String var1) {
        this.c = var1;
    }

    public boolean getTagCheckStateResult() {
        return this.e;
    }

    public void setTagCheckStateResult(boolean var1) {
        this.e = var1;
    }

    public boolean isTagCheckOperator() {
        return this.f;
    }

    public void setTagCheckOperator(boolean var1) {
        this.f = var1;
    }

    public String getMobileNumber() {
        return this.h;
    }

    public void setMobileNumber(String var1) {
        this.h = var1;
    }

    public String toString() {
        return "JPushMessage{alias='" + this.a + '\'' + ", tags=" + this.b + ", checkTag='" + this.c + '\'' + ", errorCode=" + this.d + ", tagCheckStateResult=" + this.e + ", isTagCheckOperator=" + this.f + ", sequence=" + this.g + ", mobileNumber=" + this.h + '}';
    }
}
