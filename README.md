# Discord IPC
Java 21-25 библиотека для взаимодействия с локально запущенным Discord без использования JNI.

На данный момент поддерживает получение информации о текущем пользователе и установку активности.

Библиотека протестирована на Windows, Linux и macOS.

# Благодарности
Спасибо meteordevelopment (https://github.com/MeteorDevelopment/discord-ipc) за исходный код

## Gradle
```groovy
repositories {
    mavenCentral()
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.NBTPackets:java-discord-ipc:1.0.0'
    implementation "com.google.code.gson:gson:2.8.9" // GSON не включён, но обязателен
}
```

## Примеры
Примеры использования находятся в `example/src/main/java/example/Main.java`.
