```sh
$ sed 's/static inline //g' liburing.h > liburing.no-inline.h
$ diff -Naur liburing.h liburing.no-inline.h > liburing.no-inline.patch
$ patch -p1 < liburing.no-inline.patch
```

Gradle args:
```
org.gradle.jvmargs=-Xlog:library=info --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED
```