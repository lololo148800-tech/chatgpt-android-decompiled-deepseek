package p233J4;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import io.sentry.android.core.AbstractC15256t;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p031B3.AbstractC0797a;
import p228J.AbstractC3794B0;
import p258K4.C4538a;
import p477Tb.C7296c;
import p544W9.AbstractC8461D;

/* JADX INFO: renamed from: J4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C4259e extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ int f13909t0 = 0;

    /* JADX INFO: renamed from: Y */
    public final Context f13910Y;

    /* JADX INFO: renamed from: Z */
    public final C7296c f13911Z;

    /* JADX INFO: renamed from: o0 */
    public final AbstractC0797a f13912o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f13913p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f13914q0;

    /* JADX INFO: renamed from: r0 */
    public final C4538a f13915r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f13916s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4259e(Context context, String str, final C7296c c7296c, final AbstractC0797a callback, boolean z6) {
        super(context, str, null, callback.f2213Z, new DatabaseErrorHandler() { // from class: J4.c
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase dbObj) {
                AbstractC0797a callback2 = callback;
                AbstractC16544l.m18094g(callback2, "$callback");
                C7296c c7296c2 = c7296c;
                int i10 = C4259e.f13909t0;
                AbstractC16544l.m18093f(dbObj, "dbObj");
                C4256b c4256bM9085b = AbstractC8461D.m9085b(c7296c2, dbObj);
                AbstractC15256t.m16465c("SupportSQLite", "Corruption reported by sqlite on database: " + c4256bM9085b + ".path");
                SQLiteDatabase sQLiteDatabase = c4256bM9085b.f13904Y;
                if (!sQLiteDatabase.isOpen()) {
                    String path = sQLiteDatabase.getPath();
                    if (path != null) {
                        AbstractC0797a.m1820b(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        c4256bM9085b.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs != null) {
                        return;
                    }
                } finally {
                    if (attachedDbs != null) {
                        Iterator<T> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            AbstractC16544l.m18093f(obj, "p.second");
                            AbstractC0797a.m1820b((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase.getPath();
                        if (path2 != null) {
                            AbstractC0797a.m1820b(path2);
                        }
                    }
                }
            }
        });
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(callback, "callback");
        this.f13910Y = context;
        this.f13911Z = c7296c;
        this.f13912o0 = callback;
        this.f13913p0 = z6;
        this.f13915r0 = new C4538a(str == null ? AbstractC3794B0.m4498w("randomUUID().toString()") : str, context.getCacheDir(), false);
    }

    /* JADX INFO: renamed from: a */
    public final C4256b m5029a(boolean z6) {
        C4538a c4538a = this.f13915r0;
        try {
            c4538a.m5301a((this.f13916s0 || getDatabaseName() == null) ? false : true);
            this.f13914q0 = false;
            SQLiteDatabase sQLiteDatabaseM5032m = m5032m(z6);
            if (!this.f13914q0) {
                return m5030e(sQLiteDatabaseM5032m);
            }
            close();
            return m5029a(z6);
        } finally {
            c4538a.m5302b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        C4538a c4538a = this.f13915r0;
        try {
            c4538a.m5301a(c4538a.f14836a);
            super.close();
            this.f13911Z.f23104Z = null;
            this.f13916s0 = false;
        } finally {
            c4538a.m5302b();
        }
    }

    /* JADX INFO: renamed from: e */
    public final C4256b m5030e(SQLiteDatabase sqLiteDatabase) {
        AbstractC16544l.m18094g(sqLiteDatabase, "sqLiteDatabase");
        return AbstractC8461D.m9085b(this.f13911Z, sqLiteDatabase);
    }

    /* JADX INFO: renamed from: k */
    public final SQLiteDatabase m5031k(boolean z6) {
        if (z6) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            AbstractC16544l.m18093f(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        AbstractC16544l.m18093f(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    /* JADX INFO: renamed from: m */
    public final SQLiteDatabase m5032m(boolean z6) throws Throwable {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z10 = this.f13916s0;
        Context context = this.f13910Y;
        if (databaseName != null && !z10 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                AbstractC15256t.m16482t("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return m5031k(z6);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return m5031k(z6);
            } catch (Throwable th2) {
                super.close();
                if (th2 instanceof C4258d) {
                    C4258d c4258d = th2;
                    int iM24h = AbstractC0010F.m24h(c4258d.f13907Y);
                    Throwable th3 = c4258d.f13908Z;
                    if (iM24h == 0 || iM24h == 1 || iM24h == 2 || iM24h == 3 || !(th3 instanceof SQLiteException)) {
                        throw th3;
                    }
                } else if (!(th2 instanceof SQLiteException) || databaseName == null || !this.f13913p0) {
                    throw th2;
                }
                context.deleteDatabase(databaseName);
                try {
                    return m5031k(z6);
                } catch (C4258d e10) {
                    throw e10.f13908Z;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db2) {
        AbstractC16544l.m18094g(db2, "db");
        boolean z6 = this.f13914q0;
        AbstractC0797a abstractC0797a = this.f13912o0;
        if (!z6 && abstractC0797a.f2213Z != db2.getVersion()) {
            db2.setMaxSqlCacheSize(1);
        }
        try {
            abstractC0797a.mo1825f(m5030e(db2));
        } catch (Throwable th2) {
            throw new C4258d(1, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        AbstractC16544l.m18094g(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.f13912o0.mo1826g(m5030e(sqLiteDatabase));
        } catch (Throwable th2) {
            throw new C4258d(2, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db2, int i10, int i11) {
        AbstractC16544l.m18094g(db2, "db");
        this.f13914q0 = true;
        try {
            this.f13912o0.mo1827i(m5030e(db2), i10, i11);
        } catch (Throwable th2) {
            throw new C4258d(4, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db2) {
        AbstractC16544l.m18094g(db2, "db");
        if (!this.f13914q0) {
            try {
                this.f13912o0.mo1828j(m5030e(db2));
            } catch (Throwable th2) {
                throw new C4258d(5, th2);
            }
        }
        this.f13916s0 = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i10, int i11) {
        AbstractC16544l.m18094g(sqLiteDatabase, "sqLiteDatabase");
        this.f13914q0 = true;
        try {
            this.f13912o0.mo1829l(m5030e(sqLiteDatabase), i10, i11);
        } catch (Throwable th2) {
            throw new C4258d(3, th2);
        }
    }
}
