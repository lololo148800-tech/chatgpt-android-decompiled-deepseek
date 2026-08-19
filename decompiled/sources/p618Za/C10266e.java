package p618Za;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.auth0.android.provider.AuthenticationActivity;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.clientreport.C15333a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p1060v9.C20485c;
import p1070w.C20696e;
import p1093x.C21039a;
import p1093x.C21041c;
import p115E9.C2360b;
import p182H3.C3202c;
import p561X.C8990d;
import p885m4.C17151a;

/* JADX INFO: renamed from: Za.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10266e {

    /* JADX INFO: renamed from: i */
    public static final C8990d f30488i = new C8990d(2);

    /* JADX INFO: renamed from: a */
    public AuthenticationActivity f30489a;

    /* JADX INFO: renamed from: b */
    public final String f30490b;

    /* JADX INFO: renamed from: c */
    public final int f30491c;

    /* JADX INFO: renamed from: d */
    public final int f30492d;

    /* JADX INFO: renamed from: e */
    public C10265d f30493e;

    /* JADX INFO: renamed from: f */
    public C20696e f30494f;

    /* JADX INFO: renamed from: g */
    public final C2360b f30495g;

    /* JADX INFO: renamed from: h */
    public boolean f30496h;

    public C10266e(AuthenticationActivity authenticationActivity) {
        C10267f c10267f;
        C2360b c2360b = new C2360b();
        c2360b.f7317Y = authenticationActivity.getApplicationContext();
        this.f30489a = authenticationActivity;
        this.f30492d = 96375;
        this.f30495g = c2360b;
        PackageManager packageManager = authenticationActivity.getPackageManager();
        String str = null;
        Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null));
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(data, 65536);
        listQueryIntentActivities.addAll(packageManager.queryIntentActivities(data, 131072));
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 64);
        HashMap map = new HashMap();
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            ResolveInfo next = it.next();
            String str2 = next.serviceInfo.packageName;
            if (!AbstractC10262a.f30478a.contains(str2) ? false : AbstractC10262a.m10860a(packageManager, str2, 362600000)) {
                map.put(str2, 0);
            } else {
                IntentFilter intentFilter = next.filter;
                if (intentFilter != null && intentFilter.hasCategory("androidx.browser.trusted.category.TrustedWebActivities")) {
                    i10 = 1;
                }
                map.put(str2, Integer.valueOf(i10 ^ 1));
            }
        }
        Iterator<ResolveInfo> it2 = listQueryIntentActivities.iterator();
        String str3 = null;
        while (it2.hasNext()) {
            String str4 = it2.next().activityInfo.packageName;
            int iIntValue = map.containsKey(str4) ? ((Integer) map.get(str4)).intValue() : 2;
            if (iIntValue == 0) {
                Log.d("TWAProviderPicker", "Found TWA provider, finishing search: " + str4);
                c10267f = new C10267f(0, str4);
                this.f30490b = c10267f.f30497a;
                this.f30491c = c10267f.f30498b;
            }
            if (iIntValue == 1) {
                Log.d("TWAProviderPicker", "Found Custom Tabs provider: " + str4);
                if (str == null) {
                    str = str4;
                }
            } else if (iIntValue == 2) {
                Log.d("TWAProviderPicker", "Found browser: " + str4);
                if (str3 == null) {
                    str3 = str4;
                }
            }
        }
        if (str != null) {
            Log.d("TWAProviderPicker", "Found no TWA providers, using first Custom Tabs provider: ".concat(str));
            c10267f = new C10267f(1, str);
        } else {
            Log.d("TWAProviderPicker", "Found no TWA providers, using first browser: " + str3);
            c10267f = new C10267f(2, str3);
        }
        this.f30490b = c10267f.f30497a;
        this.f30491c = c10267f.f30498b;
    }

    /* JADX INFO: renamed from: a */
    public final void m10861a(C20485c c20485c) {
        ArrayList arrayListMo18907b;
        C8990d c8990d = f30488i;
        if (this.f30496h) {
            throw new IllegalStateException("TwaLauncher already destroyed");
        }
        int i10 = this.f30491c;
        String str = this.f30490b;
        if (i10 == 0) {
            RunnableC10264c runnableC10264c = new RunnableC10264c(this, c20485c, 0);
            if (this.f30494f != null) {
                runnableC10264c.run();
            } else {
                RunnableC10264c runnableC10264c2 = new RunnableC10264c(this, c20485c, 1);
                if (this.f30493e == null) {
                    this.f30493e = new C10265d(this);
                }
                C10265d c10265d = this.f30493e;
                c10265d.f30485b = runnableC10264c;
                c10265d.f30486c = runnableC10264c2;
                AuthenticationActivity authenticationActivity = this.f30489a;
                c10265d.f65554a = authenticationActivity.getApplicationContext();
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(str)) {
                    intent.setPackage(str);
                }
                authenticationActivity.bindService(intent, c10265d, 1);
            }
        } else {
            AuthenticationActivity authenticationActivity2 = this.f30489a;
            c8990d.getClass();
            Intent intent2 = (Intent) ((C3202c) c20485c.f65030b).m4056b().f42490Y;
            if (str != null) {
                intent2.setPackage(str);
            }
            if (authenticationActivity2.getPackageManager().hasSystemFeature("org.chromium.arc")) {
                intent2.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
            }
            intent2.setData((Uri) c20485c.f65029a);
            authenticationActivity2.startActivity(intent2, null);
        }
        if (this.f30489a.getPackageManager().hasSystemFeature("org.chromium.arc")) {
            return;
        }
        C15333a c15333a = null;
        try {
            arrayListMo18907b = (Build.VERSION.SDK_INT >= 28 ? new C21039a() : new C17151a()).mo18907b(this.f30489a.getPackageManager(), str);
        } catch (PackageManager.NameNotFoundException e10) {
            AbstractC15256t.m16466d("PackageIdentity", "Could not get fingerprint for package.", e10);
            arrayListMo18907b = null;
        }
        if (arrayListMo18907b != null) {
            try {
                c15333a = new C15333a(C21041c.m21500a(str, arrayListMo18907b));
            } catch (IOException e11) {
                AbstractC15256t.m16466d("Token", "Exception when creating token.", e11);
            }
        }
        SharedPreferences sharedPreferences = this.f30495g.f7317Y.getApplicationContext().getSharedPreferences("com.google.androidbrowserhelper", 0);
        if (c15333a == null) {
            sharedPreferences.edit().remove("SharedPreferencesTokenStore.TOKEN").apply();
        } else {
            byte[] bArr = ((C21041c) c15333a.f47885Y).f66920a;
            sharedPreferences.edit().putString("SharedPreferencesTokenStore.TOKEN", Base64.encodeToString(Arrays.copyOf(bArr, bArr.length), 3)).apply();
        }
    }
}
