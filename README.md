# Discord IPC
Java 25 library for interacting with locally running Discord instance without the use of JNI.  
Currently, only supports retrieving the logged-in user and setting user's activity.  
The library is tested on Windows, Linux and macOS.

# Credits
Thanks meteordevelopment (https://github.com/MeteorDevelopment/discord-ipc) for source code

## Gradle
```groovy
repositories {
    mavenCentral()
    maven { url 'https://jitpack.io' }
    }

dependencies {
    //1.3 requires >= 25 java; 1.2 requires 17—22 java
    implementation implementation 'com.github.NBTPackets:discord-ipc:1.0'
    implementation "com.google.code.gson:gson:2.8.9" // GSON is not included but required
}
```

## Examples
For examples check out `example/src/main/java/example/Main.java`.  
