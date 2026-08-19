package p618Za;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.auth0.android.provider.AuthenticationActivity;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p1060v9.C20485c;
import p1070w.BinderC20692a;
import p1070w.C20696e;
import p182H3.C3202c;
import p315Me.Myis.CxcULo;
import p885m4.C17152b;

/* JADX INFO: renamed from: Za.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC10264c implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f30482Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C10266e f30483Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20485c f30484o0;

    public /* synthetic */ RunnableC10264c(C10266e c10266e, C20485c c20485c, int i10) {
        this.f30482Y = i10;
        this.f30483Z = c10266e;
        this.f30484o0 = c20485c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C20485c c20485c = this.f30484o0;
        C10266e c10266e = this.f30483Z;
        switch (this.f30482Y) {
            case 0:
                C20696e c20696e = c10266e.f30494f;
                if (c20696e == null) {
                    throw new IllegalStateException("mSession is null in launchWhenSessionEstablished");
                }
                if (c10266e.f30496h || c20696e == null) {
                    return;
                }
                Log.d(CxcULo.HxdzwtSWrAm, "Launching Trusted Web Activity.");
                C20696e c20696e2 = c10266e.f30494f;
                if (c20696e2 == null) {
                    throw new NullPointerException("CustomTabsSession is required for launching a TWA");
                }
                C3202c c3202c = (C3202c) c20485c.f65030b;
                c3202c.getClass();
                String packageName = c20696e2.f65556b.getPackageName();
                Intent intent = (Intent) c3202c.f9661o0;
                intent.setPackage(packageName);
                BinderC20692a binderC20692a = c20696e2.f65555a;
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", binderC20692a);
                PendingIntent pendingIntent = c20696e2.f65557c;
                if (pendingIntent != null) {
                    bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                }
                intent.putExtras(bundle);
                Intent intent2 = (Intent) c3202c.m4056b().f42490Y;
                intent2.setData((Uri) c20485c.f65029a);
                intent2.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
                List listEmptyList = Collections.emptyList();
                ((C17152b) c20485c.f65031c).getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("androidx.browser.trusted.displaymode.KEY_ID", 0);
                intent2.putExtra("androidx.browser.trusted.extra.DISPLAY_MODE", bundle2);
                intent2.putExtra("androidx.browser.trusted.extra.SCREEN_ORIENTATION", 0);
                AuthenticationActivity authenticationActivity = c10266e.f30489a;
                Boolean bool = AbstractActivityC10263b.f30481Y;
                Intent intent3 = new Intent(authenticationActivity, (Class<?>) AbstractActivityC10263b.class);
                if (AbstractActivityC10263b.f30481Y == null) {
                    AbstractActivityC10263b.f30481Y = Boolean.valueOf(intent3.resolveActivityInfo(authenticationActivity.getPackageManager(), 0) != null);
                }
                if (!Boolean.FALSE.equals(AbstractActivityC10263b.f30481Y)) {
                    intent3.setFlags(268435456);
                    intent2.putExtra("androidx.browser.customtabs.extra.FOCUS_INTENT", PendingIntent.getActivity(authenticationActivity, 0, intent3, 67108864));
                }
                AuthenticationActivity authenticationActivity2 = c10266e.f30489a;
                Iterator it = listEmptyList.iterator();
                while (it.hasNext()) {
                    authenticationActivity2.grantUriPermission(intent2.getPackage(), (Uri) it.next(), 1);
                }
                authenticationActivity2.startActivity(intent2, null);
                return;
            default:
                AuthenticationActivity authenticationActivity3 = c10266e.f30489a;
                Intent intent4 = (Intent) ((C3202c) c20485c.f65030b).m4056b().f42490Y;
                String str = c10266e.f30490b;
                if (str != null) {
                    intent4.setPackage(str);
                }
                if (authenticationActivity3.getPackageManager().hasSystemFeature("org.chromium.arc")) {
                    intent4.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
                }
                intent4.setData((Uri) c20485c.f65029a);
                authenticationActivity3.startActivity(intent4, null);
                return;
        }
    }
}
