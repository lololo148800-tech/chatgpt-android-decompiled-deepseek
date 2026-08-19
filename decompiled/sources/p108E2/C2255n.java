package p108E2;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.core.widget.RemoteViewsCompatService;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC15256t;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.AbstractC0761i;
import p523V9.AbstractC8158o4;

/* JADX INFO: renamed from: E2.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2255n implements RemoteViewsService.RemoteViewsFactory {

    /* JADX INFO: renamed from: e */
    public static final C2252k f6902e = new C2252k(new long[0], new RemoteViews[0]);

    /* JADX INFO: renamed from: a */
    public final RemoteViewsCompatService f6903a;

    /* JADX INFO: renamed from: b */
    public final int f6904b;

    /* JADX INFO: renamed from: c */
    public final int f6905c;

    /* JADX INFO: renamed from: d */
    public C2252k f6906d = f6902e;

    public C2255n(RemoteViewsCompatService remoteViewsCompatService, int i10, int i11) {
        this.f6903a = remoteViewsCompatService;
        this.f6904b = i10;
        this.f6905c = i11;
    }

    /* JADX INFO: renamed from: a */
    public final void m3298a() {
        Long lValueOf;
        RemoteViewsCompatService remoteViewsCompatService = this.f6903a;
        SharedPreferences sharedPreferences = remoteViewsCompatService.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
        AbstractC16544l.m18093f(sharedPreferences, "context.getSharedPrefere…S_FILENAME, MODE_PRIVATE)");
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f6904b;
        sb2.append(i10);
        sb2.append(':');
        sb2.append(this.f6905c);
        C2252k c2252k = null;
        String string = sharedPreferences.getString(sb2.toString(), null);
        if (string == null) {
            AbstractC15256t.m16482t("RemoteViewsCompatServic", "No collection items were stored for widget " + i10);
        } else {
            C2253l c2253l = C2253l.f6897o0;
            byte[] bArrDecode = Base64.decode(string, 0);
            AbstractC16544l.m18093f(bArrDecode, "decode(hexString, Base64.DEFAULT)");
            C2254m c2254m = (C2254m) AbstractC8158o4.m8717b(bArrDecode, c2253l);
            if (AbstractC16544l.m18089b(Build.VERSION.INCREMENTAL, c2254m.f6900b)) {
                try {
                    PackageInfo packageInfo = remoteViewsCompatService.getPackageManager().getPackageInfo(remoteViewsCompatService.getPackageName(), 0);
                    lValueOf = Long.valueOf(Build.VERSION.SDK_INT >= 28 ? AbstractC0761i.m1672d(packageInfo) : packageInfo.versionCode);
                } catch (PackageManager.NameNotFoundException e10) {
                    AbstractC15256t.m16466d("RemoteViewsCompatServic", "Couldn't retrieve version code for " + remoteViewsCompatService.getPackageManager(), e10);
                    lValueOf = null;
                }
                if (lValueOf == null) {
                    AbstractC15256t.m16482t("RemoteViewsCompatServic", "Couldn't get version code, not using stored collection items for widget " + i10);
                } else if (lValueOf.longValue() != c2254m.f6901c) {
                    AbstractC15256t.m16482t("RemoteViewsCompatServic", "App version code has changed, not using stored collection items for widget " + i10);
                } else {
                    try {
                        c2252k = (C2252k) AbstractC8158o4.m8717b(c2254m.f6899a, C2253l.f6896Z);
                    } catch (Throwable th2) {
                        AbstractC15256t.m16466d("RemoteViewsCompatServic", "Unable to deserialize stored collection items for widget " + i10, th2);
                    }
                }
            } else {
                AbstractC15256t.m16482t("RemoteViewsCompatServic", "Android version code has changed, not using stored collection items for widget " + i10);
            }
        }
        if (c2252k == null) {
            c2252k = f6902e;
        }
        this.f6906d = c2252k;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return this.f6906d.f6892a.length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i10) {
        try {
            return this.f6906d.f6892a[i10];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i10) {
        try {
            return this.f6906d.f6893b[i10];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.f6903a.getPackageName(), R.layout.invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return this.f6906d.f6895d;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return this.f6906d.f6894c;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        m3298a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        m3298a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
