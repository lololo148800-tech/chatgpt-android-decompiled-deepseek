package p334Na;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import io.sentry.android.core.AbstractC15256t;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import p357Oa.AbstractC6148a;
import p357Oa.AbstractC6155h;
import p357Oa.C6161n;
import p477Tb.C7296c;

/* JADX INFO: renamed from: Na.g */
/* JADX INFO: loaded from: classes.dex */
public final class C5700g {

    /* JADX INFO: renamed from: e */
    public static final C7296c f18478e = new C7296c("AppUpdateService");

    /* JADX INFO: renamed from: f */
    public static final Intent f18479f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a */
    public final C6161n f18480a;

    /* JADX INFO: renamed from: b */
    public final String f18481b;

    /* JADX INFO: renamed from: c */
    public final Context f18482c;

    /* JADX INFO: renamed from: d */
    public final C5701h f18483d;

    public C5700g(Context context, C5701h c5701h) {
        String strEncodeToString;
        this.f18481b = context.getPackageName();
        this.f18482c = context;
        this.f18483d = c5701h;
        C7296c c7296c = AbstractC6148a.f20032a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    Object[] objArr = new Object[0];
                    C7296c c7296c2 = AbstractC6148a.f20032a;
                    c7296c2.getClass();
                    if (Log.isLoggable("PlayCore", 5)) {
                        AbstractC15256t.m16482t("PlayCore", C7296c.m7748L((String) c7296c2.f23104Z, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                        return;
                    }
                    return;
                }
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(byteArray);
                        strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        strEncodeToString = "";
                    }
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                        String str = Build.TAGS;
                        if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                        }
                    }
                    Context applicationContext = context.getApplicationContext();
                    this.f18480a = new C6161n(applicationContext != null ? applicationContext : context, f18478e, f18479f);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m6141a(C5700g c5700g, String str) {
        Map map;
        Integer numValueOf;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        HashMap map2 = AbstractC6155h.f20039a;
        synchronized (AbstractC6155h.class) {
            try {
                HashMap map3 = AbstractC6155h.f20039a;
                if (!map3.containsKey("app_update")) {
                    HashMap map4 = new HashMap();
                    map4.put("java", 11004);
                    map3.put("app_update", map4);
                }
                map = (Map) map3.get("app_update");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle3.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
        if (map.containsKey("native")) {
            bundle3.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
        }
        if (map.containsKey("unity")) {
            bundle3.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
        }
        bundle2.putAll(bundle3);
        bundle2.putInt("playcore.version.code", 11004);
        bundle.putAll(bundle2);
        bundle.putString("package.name", str);
        try {
            numValueOf = Integer.valueOf(c5700g.f18482c.getPackageManager().getPackageInfo(c5700g.f18482c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            C7296c c7296c = f18478e;
            Object[] objArr = new Object[0];
            c7296c.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                AbstractC15256t.m16465c("PlayCore", C7296c.m7748L((String) c7296c.f23104Z, "The current version of the app could not be retrieved", objArr));
            }
            numValueOf = null;
        }
        if (numValueOf != null) {
            bundle.putInt("app.version.code", numValueOf.intValue());
        }
        return bundle;
    }
}
