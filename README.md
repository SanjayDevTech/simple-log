## Simple Log
Simple light weight logging library for android apps

[ ![Download](https://api.bintray.com/packages/sanjaydevtech/log/com.sanjaydevtech.log/images/download.svg) ](https://bintray.com/sanjaydevtech/log/com.sanjaydevtech.log/_latestVersion)


### Inspiration

- [DLog](https://github.com/ymegane/DLog)


### Why Simple Log

You may think you can use android.util.Log class. But how many times you create TAG field in each Activity or Fragment.
The default log library will also printed in production package(Which can put you in danger)

To avoid these difficulties and some boilerplate code, I created this Simple Log


### Benefits

- TAG will be created automatically
- You can even hide logging in production mode


### Adding dependency

```gradle
implementation 'com.sanjaydevtech.log:log:<latest_version>'
```


### Using in code

```java
Cout.d("Logged");
```
Refer [Getting Started](https://github.com/SanjayDevTech/simple-log/wiki/Getting-Started) for all details


### License

MIT
