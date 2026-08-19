package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import io.sentry.android.core.performance.C15251d;
import p025An.C0644w;
import p282L4.C4933a;
import p544W9.AbstractC8447A3;

/* JADX INFO: loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        C15251d.m16452c(this);
        Context context = getContext();
        if (context == null) {
            C0644w c0644w = new C0644w("Context cannot be null");
            C15251d.m16453d(this);
            throw c0644w;
        }
        if (context.getApplicationContext() != null) {
            C4933a c4933aM5543c = C4933a.m5543c(context);
            Context context2 = c4933aM5543c.f16105c;
            try {
                try {
                    Trace.beginSection(AbstractC8447A3.m9053f("Startup"));
                    c4933aM5543c.m5544a(context2.getPackageManager().getProviderInfo(new ComponentName(context2.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
                    Trace.endSection();
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new C0644w(e10);
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        C15251d.m16453d(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
