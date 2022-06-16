//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cn.jpush.android.api;

import android.content.Context;
import java.util.ArrayList;

public class NotificationMessage {
    public String appkey;
    public String msgId;
    public Context context;
    public String notificationContent;
    public int notificationAlertType;
    public String notificationTitle;
    public String notificationSmallIcon;
    public String notificationLargeIcon;
    public String notificationExtras;
    public int notificationStyle;
    public String notificationNormalSmallIcon;
    public int notificationBuilderId;
    public String notificationBigText;
    public String notificationBigPicPath;
    public String notificationInbox;
    public int notificationPriority;
    public String notificationCategory;
    public int notificationId;
    public String developerArg0;
    public int platform = 0;
    public String appId;
    public int notificationType;
    public String notificationChannelId;
    public String displayForeground;
    public String _webPagePath;
    public ArrayList<String> showResourceList = new ArrayList();
    public boolean isRichPush;
    public int richType;
    public String deeplink;
    public int failedAction;
    public String failedLink;
    public String targetPkgName;
    public String sspWxAppId;
    public String sspWmOriginId;
    public int sspWmType;
    public boolean isWmDeepLink = false;
    public int inAppMsgType = 1;
    public int inAppMsgShowType = 2;
    public int inAppMsgShowPos = 0;
    public String inAppMsgTitle = "";
    public String inAppMsgContentBody = "";
    public int inAppType;

    public NotificationMessage() {
    }

    public String toString() {
        return "NotificationMessage{notificationId=" + this.notificationId + ", msgId='" + this.msgId + '\'' + ", appkey='" + this.appkey + '\'' + ", notificationContent='" + this.notificationContent + '\'' + ", notificationAlertType=" + this.notificationAlertType + ", notificationTitle='" + this.notificationTitle + '\'' + ", notificationSmallIcon='" + this.notificationSmallIcon + '\'' + ", notificationLargeIcon='" + this.notificationLargeIcon + '\'' + ", notificationExtras='" + this.notificationExtras + '\'' + ", notificationStyle=" + this.notificationStyle + ", notificationBuilderId=" + this.notificationBuilderId + ", notificationBigText='" + this.notificationBigText + '\'' + ", notificationBigPicPath='" + this.notificationBigPicPath + '\'' + ", notificationInbox='" + this.notificationInbox + '\'' + ", notificationPriority=" + this.notificationPriority + ", notificationCategory='" + this.notificationCategory + '\'' + ", developerArg0='" + this.developerArg0 + '\'' + ", platform=" + this.platform + ", notificationChannelId='" + this.notificationChannelId + '\'' + ", displayForeground='" + this.displayForeground + '\'' + ", notificationType=" + this.notificationType + '\'' + ", inAppMsgType=" + this.inAppMsgType + '\'' + ", inAppMsgShowType=" + this.inAppMsgShowType + '\'' + ", inAppMsgShowPos=" + this.inAppMsgShowPos + '\'' + ", inAppMsgTitle=" + this.inAppMsgTitle + ", inAppMsgContentBody=" + this.inAppMsgContentBody + ", inAppType=" + this.inAppType + '}';
    }
}
