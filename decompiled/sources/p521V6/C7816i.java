package p521V6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.auth0.android.provider.AuthenticationActivity;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p1070w.AbstractServiceConnectionC20695d;
import p1070w.C20694c;
import p1070w.C20696e;
import p182H3.C3202c;
import p618Za.C10266e;
import p757g.C13722a;
import p757g.InterfaceC13724c;

/* JADX INFO: renamed from: V6.i */
/* JADX INFO: loaded from: classes.dex */
public final class C7816i extends AbstractServiceConnectionC20695d {

    /* JADX INFO: renamed from: b */
    public final WeakReference f24705b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f24706c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public final CountDownLatch f24707d = new CountDownLatch(1);

    /* JADX INFO: renamed from: e */
    public final String f24708e;

    /* JADX INFO: renamed from: f */
    public final C10266e f24709f;

    /* JADX INFO: renamed from: g */
    public final C7817j f24710g;

    /* JADX INFO: renamed from: h */
    public boolean f24711h;

    public C7816i(AuthenticationActivity authenticationActivity, C7817j c7817j, C10266e c10266e) {
        this.f24705b = new WeakReference(authenticationActivity);
        this.f24710g = c7817j;
        this.f24708e = c7817j.m8083a(authenticationActivity.getPackageManager());
        this.f24709f = c10266e;
    }

    @Override // p1070w.AbstractServiceConnectionC20695d
    /* JADX INFO: renamed from: a */
    public final void mo8079a(C20694c c20694c) {
        Log.d("i", "CustomTabs Service connected");
        try {
            ((C13722a) ((InterfaceC13724c) c20694c.f65551b)).m15209k();
        } catch (RemoteException unused) {
        }
        this.f24706c.set(c20694c.m21213a(null));
        this.f24707d.countDown();
    }

    /* JADX INFO: renamed from: b */
    public final void m8080b() {
        Log.v("i", "Trying to bind the service");
        Context context = (Context) this.f24705b.get();
        boolean zBindService = false;
        this.f24711h = false;
        String str = this.f24708e;
        if (context != null && str != null) {
            this.f24711h = true;
            this.f65554a = context.getApplicationContext();
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(str)) {
                intent.setPackage(str);
            }
            zBindService = context.bindService(intent, this, 33);
        }
        Log.v("i", "Bind request result (" + str + "): " + zBindService);
    }

    /* JADX INFO: renamed from: c */
    public final void m8081c(Context context, Uri uri) {
        boolean zAwait;
        m8080b();
        try {
            zAwait = this.f24707d.await(this.f24708e == null ? 0L : 1L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            zAwait = false;
        }
        Log.d("i", "Launching URI. Custom Tabs available: " + zAwait);
        C20696e c20696e = (C20696e) this.f24706c.get();
        C7817j c7817j = this.f24710g;
        c7817j.getClass();
        C3202c c3202c = new C3202c(c20696e);
        Intent intent = (Intent) c3202c.f9661o0;
        intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", c7817j.f24712Y ? 1 : 0);
        c3202c.f9659Y = 2;
        intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
        int i10 = c7817j.f24713Z;
        if (i10 > 0) {
            int color = context.getColor(i10) | (-16777216);
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", color);
            c3202c.f9663q0 = bundle;
        }
        Intent intent2 = (Intent) c3202c.m4056b().f42490Y;
        intent2.setData(uri);
        context.startActivity(intent2);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.d("i", "CustomTabs Service disconnected");
        this.f24706c.set(null);
    }
}
