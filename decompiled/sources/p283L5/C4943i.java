package p283L5;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import kotlin.jvm.internal.AbstractC16541i;
import p049Bm.InterfaceC1436k;
import p913o2.AbstractC17803d;

/* JADX INFO: renamed from: L5.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4943i extends AbstractC16541i implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C4943i f16115Y = new C4943i(1, AbstractC4941g.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Context applicationContext = ((Context) obj).getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        C4938d c4938d = InterfaceC4939e.f16109a;
        if (connectivityManager == null || AbstractC17803d.m19554a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return c4938d;
        }
        try {
            return Build.VERSION.SDK_INT > 23 ? new C4940f(connectivityManager, 1) : new C4940f(connectivityManager, 0);
        } catch (Exception unused) {
            return c4938d;
        }
    }
}
