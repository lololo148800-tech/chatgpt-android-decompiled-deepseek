package com.google.mlkit.common.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import io.sentry.android.core.performance.C15251d;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import p1060v9.AbstractC20502t;
import p501Ub.C7604f;
import p746fa.AbstractC13600i;
import p746fa.ExecutorC13605n;
import p784hb.C14437f;
import p849k7.C16349b;
import p890mb.C17204a;
import p890mb.C17209f;
import p890mb.InterfaceC17208e;

/* JADX INFO: loaded from: classes.dex */
public class MlKitInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        AbstractC20502t.m21159j("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.", !providerInfo.authority.equals("com.google.mlkit.common.mlkitinitprovider"));
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        C15251d.m16452c(this);
        Context context = getContext();
        if (context == null) {
            Log.i("MlKitInitProvider", "No context available. Manually call MlKit.initialize(), otherwise ML Kit will not be functional.");
            C15251d.m16453d(this);
            return false;
        }
        synchronized (C7604f.f24040b) {
            AbstractC20502t.m21159j("MlKitContext is already initialized", C7604f.f24041c == null);
            C7604f c7604f = new C7604f();
            C7604f.f24041c = c7604f;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList arrayListM16639n = new C15384c(context, 27, new C14437f(MlKitComponentDiscoveryService.class)).m16639n();
            ExecutorC13605n executorC13605n = AbstractC13600i.f42962a;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C16349b c16349b = InterfaceC17208e.f54929k0;
            arrayList.addAll(arrayListM16639n);
            arrayList2.add(C17204a.m18944c(context, Context.class, new Class[0]));
            arrayList2.add(C17204a.m18944c(c7604f, C7604f.class, new Class[0]));
            C17209f c17209f = new C17209f(executorC13605n, arrayList, arrayList2, c16349b);
            c7604f.f24042a = c17209f;
            c17209f.m18946d(true);
        }
        C15251d.m16453d(this);
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
