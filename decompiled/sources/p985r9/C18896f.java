package p985r9;

import android.os.Build;
import android.util.Log;
import p817j$.util.Objects;

/* JADX INFO: renamed from: r9.f */
/* JADX INFO: loaded from: classes.dex */
public final class C18896f extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z6) {
        if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(str, z6);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("CloudMessengerCompat", 3))) {
            return C18897g.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return C18897g.class;
    }
}
