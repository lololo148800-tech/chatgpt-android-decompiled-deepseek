package leakcanary.internal;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import fo.AbstractC13707d;
import fo.C13705b;
import fo.C13710g;
import fo.C13711h;
import fo.C13714k;
import fo.C13718o;
import fo.InterfaceC13708e;
import io.sentry.android.core.performance.C15251d;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import leakcanary.FragmentAndViewModelWatcher;
import mm.C17316s;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC7854B5;
import p771go.AbstractC14204c;
import p771go.AbstractC14206e;
import p909nm.AbstractC17681o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lleakcanary/internal/MainProcessAppWatcherInstaller;", "Landroid/content/ContentProvider;", "<init>", "()V", "leakcanary-object-watcher-android_release"}, m18068k = 1, m18069mv = {1, 4, 1})
public final class MainProcessAppWatcherInstaller extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        AbstractC16544l.m18095h(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        AbstractC16544l.m18095h(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        AbstractC16544l.m18095h(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        C15251d.m16452c(this);
        Context context = getContext();
        if (context == null) {
            AbstractC16544l.m18101n();
            throw null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            C17316s c17316s = new C17316s("null cannot be cast to non-null type android.app.Application");
            C15251d.m16453d(this);
            throw c17316s;
        }
        Application application = (Application) applicationContext;
        RuntimeException runtimeException = AbstractC13707d.f43255b;
        long millis = TimeUnit.SECONDS.toMillis(5L);
        C13711h reachabilityWatcher = AbstractC13707d.f43256c;
        AbstractC16544l.m18095h(reachabilityWatcher, "reachabilityWatcher");
        List listM19382k = AbstractC17681o.m19382k(new C13705b(application, reachabilityWatcher), new FragmentAndViewModelWatcher(application, reachabilityWatcher), new C13714k(reachabilityWatcher), new C13718o(reachabilityWatcher));
        AbstractC14204c.m15511a();
        if (AbstractC13707d.f43255b != null) {
            throw new IllegalStateException("AppWatcher already installed, see exception cause for prior install call", AbstractC13707d.f43255b);
        }
        if (millis < 0) {
            throw new IllegalStateException(AbstractC0168G.m533v("retainedDelayMillis ", millis, " must be at least 0 ms").toString());
        }
        AbstractC13707d.f43254a = millis;
        if ((2 & application.getApplicationInfo().flags) != 0) {
            AbstractC7854B5.f24748b = new C13710g();
        }
        ((InterfaceC1436k) AbstractC14206e.f44619a.getValue()).invoke(application);
        Iterator it = listM19382k.iterator();
        while (it.hasNext()) {
            ((InterfaceC13708e) it.next()).mo15175a();
        }
        AbstractC13707d.f43255b = new RuntimeException("manualInstall() first called here");
        C15251d.m16453d(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        AbstractC16544l.m18095h(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        AbstractC16544l.m18095h(uri, "uri");
        return 0;
    }
}
