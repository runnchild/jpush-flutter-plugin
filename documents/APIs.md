[Common API](#common-api)

- [addEventHandler](#addeventhandler)
- [setup](#setup)
- [getRegistrationID](#getregistrationid)
- [stopPush](#stoppush)
- [resumePush](#resumepush)
- [setAlias](#setalias)
- [deleteAlias](#deletealias)
- [addTags](#addtags)
- [deleteTags](#deletetags)
- [setTags](#settags)
- [cleanTags](#cleantags)
- [getAllTags](getalltags)
- [sendLocalNotification](#sendlocalnotification)
- [clearAllNotifications](#clearallnotifications)

[iOS Only]()

- [applyPushAuthority](#applypushauthority)
- [setBadge](#setbadge)
- [getLaunchAppNotification](#getlaunchappnotification)

**注意：addEventHandler 方法建议放到 setup 之前，其他方法需要在 setup 方法之后调用，**

####  addEventHandler

添加事件监听方法。

```dart
JPush.addEventHandler(
      // 接收通知回调方法。
      onReceiveNotification: (Map<String, dynamic> message) async {
         print("flutter onReceiveNotification: $message");
      },
      // 点击通知回调方法。
      onOpenNotification: (Map<String, dynamic> message) async {
        print("flutter onOpenNotification: $message");
      },
      // 接收自定义消息回调方法。
      onReceiveMessage: (Map<String, dynamic> message) async {
        print("flutter onReceiveMessage: $message");
      },
  );
```

#### setup

添加初始化方法，调用 setup 方法会执行两个操作：

- 初始化 JPush SDK
- 将缓存的事件下发到 dart 环境中。

```dart
JPush.setup(
      appKey: "替换成你自己的 appKey",
      channel: "theChannel",
      production: false
    );
```

#### getRegistrationID

获取 registrationId，这个 JPush 运行通过 registrationId 来进行推送.

```dart
JPush.getRegistrationID().then((rid) { });
```

#### stopPush

停止推送功能，调用该方法将不会接收到通知。

```dart
JPush.stopPush();
```

#### resumePush

调用 stopPush 后，可以通过 resumePush 方法恢复推送。

```dart
JPush.resumePush();
```

#### setAlias

设置别名，极光后台可以通过别名来推送，一个 App 应用只有一个别名，一般用来存储用户 id。

```
JPush.setAlias("your alias").then((map) { });
```

#### deleteAlias

可以通过 deleteAlias 方法来删除已经设置的 alias。

```dart
JPush.deleteAlias().then((map) {})
```

#### addTags

在原来的 Tags 列表上添加指定 tags。

```
JPush.addTags(["tag1","tag2"]).then((map) {});
```

####  deleteTags

在原来的 Tags 列表上删除指定 tags。

```
JPush.deleteTags(["tag1","tag2"]).then((map) {});
```

#### setTags

重置 tags。

```
JPush.setTags(["tag1","tag2"]).then((map) {});
```

#### cleanTags

清空所有 tags

```dart
JPush.setTags().then((map) {});
```

#### getAllTags

获取当前 tags 列表。

```
JPush.getAllTags().then((map) {});
```

#### sendLocalNotification

指定触发时间，添加本地推送通知。

```dart
// 延时 3 秒后触发本地通知。
var fireDate = DateTime.fromMillisecondsSinceEpoch(DateTime.now().millisecondsSinceEpoch + 3000);
var localNotification = LocalNotification(
   id: 234,
   title: 'notification title',
   buildId: 1,
   content: 'notification content',
   fireTime: fireDate,
   subtitle: 'notification subtitle', // 该参数只有在 iOS 有效
   badge: 5, // 该参数只有在 iOS 有效
   extras: {"fa": "0"} // 设置 extras ，extras 需要是 Map<String, String>
  );
JPush.sendLocalNotification(localNotification).then((res) {});
```

#### clearAllNotifications

清楚通知栏上所有通知。

```dart
JPush.clearAllNotifications();
```

#### applyPushAuthority

申请推送权限，注意这个方法只会向用户弹出一次推送权限请求（如果用户不同意，之后只能用户到设置页面里面勾选相应权限），需要开发者选择合适的时机调用。

**注意： iOS10+ 可以通过该方法来设置推送是否前台展示，是否触发声音，是否设置应用角标 badge**

```dart
JPush.applyPushAuthority(new NotificationSettingsIOS(
      sound: true,
      alert: true,
      badge: true));
```

#### setBadge

**iOS Only **

设置应用 badge 值，该方法还会同步 JPush 服务器的的 badge 值，JPush 服务器的 badge 值用于推送 badge 自动 +1 时会用到。

```dart
JPush.setBadge(66).then((map) {});
```

### getLaunchAppNotification

获取 iOS 点击推送启动应用的那条通知。

```dart
JPush.getLaunchAppNotification().then((map) {});
```
