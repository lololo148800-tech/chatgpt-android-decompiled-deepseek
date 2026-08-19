package p501Ub;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.UUID;
import p331N6.C5676a;
import p890mb.C17204a;
import p890mb.C17212i;

/* JADX INFO: renamed from: Ub.i */
/* JADX INFO: loaded from: classes.dex */
public final class C7607i {

    /* JADX INFO: renamed from: b */
    public static final C17204a f24051b;

    /* JADX INFO: renamed from: a */
    public final Context f24052a;

    static {
        C5676a c5676aM18942a = C17204a.m18942a(C7607i.class);
        c5676aM18942a.m6108d(C17212i.m18950a(C7604f.class));
        c5676aM18942a.m6108d(C17212i.m18950a(Context.class));
        c5676aM18942a.f18435f = C7600b.f24033p0;
        f24051b = c5676aM18942a.m6109e();
    }

    public C7607i(Context context) {
        this.f24052a = context;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized String m7956a() {
        String string = m7957b().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        m7957b().edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }

    /* JADX INFO: renamed from: b */
    public final SharedPreferences m7957b() {
        Context context = this.f24052a;
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
        if (devicePolicyManager == null || Build.VERSION.SDK_INT < 24) {
            return context.getSharedPreferences("com.google.mlkit.internal", 0);
        }
        int storageEncryptionStatus = devicePolicyManager.getStorageEncryptionStatus();
        if (storageEncryptionStatus != 3 && storageEncryptionStatus != 5) {
            return context.getSharedPreferences("com.google.mlkit.internal", 0);
        }
        Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        contextCreateDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, "com.google.mlkit.internal");
        return contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
