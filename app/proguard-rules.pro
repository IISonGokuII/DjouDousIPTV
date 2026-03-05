# DjouDousIPTV ProGuard Rules

# Keep Timber logging in release builds
-keep class timber.log.Timber { *; }

# Kotlin Serialization
-keepattributes *Annotation*, InnerClasses
-dontnote kotlinx.serialization.AnnotationsKt
-keepclassmembers class kotlinx.serialization.json.** { *** get*(...); }
-keepclassmembers class kotlin.Metadata { *; }

# Keep data classes for serialization
-keepclassmembers class com.djoudousiptv.android.data.** {
    *** get*();
    void set*(***);
}

# Retrofit
-dontwarn retrofit2.**
-keep class retrofit2.** { *; }
-keepclassmembers,allowobfuscation interface * {
    @retrofit2.http.* <methods>;
}

# OkHttp
-dontwarn okhttp3.**
-dontwarn okio.**
-keep class okhttp3.** { *; }

# Room
-keep class androidx.room.** { *; }
-dontwarn androidx.room.**
-keep @androidx.room.Entity class *
-keep @androidx.room.Dao class *
-keep class * extends androidx.room.RoomDatabase

# Hilt
-keep class dagger.hilt.** { *; }
-keep class * extends dagger.hilt.internal.GeneratedComponent
-keep class * extends dagger.hilt.android.internal.managers.ActivityComponentManager

# Media3 / ExoPlayer
-keep class androidx.media3.** { *; }
-dontwarn androidx.media3.**

# Coil
-keep class coil.** { *; }
-dontwarn coil.**

# TV Material
-keep class androidx.tv.material3.** { *; }

# WorkManager
-keep class androidx.work.** { *; }

# Keep native methods
-keepclasseswithmembernames class * {
    native <methods>;
}

# Keep setters/getters in Views
-keepclassmembers public class * extends android.view.View {
    void set*(***);
    *** get*();
}

# Keep Parcelable implementations
-keep class * implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator *;
}

# Keep Serializable implementations
-keepnames class * implements java.io.Serializable
-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    !static !transient <fields>;
    !private <fields>;
    !private <methods>;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

# General Android
-keep public class * extends android.app.Activity
-keep public class * extends android.app.Application
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
