package p544W9;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.AbstractC2124C;
import p103Dn.C2146N;
import p103Dn.C2153Q0;
import p233J4.C4255a;
import p571X9.AbstractC9221V;
import p658b5.C11232c;

/* JADX INFO: renamed from: W9.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8706s {
    /* JADX INFO: renamed from: a */
    public static final C11232c m9413a(String initialValue) {
        AbstractC16544l.m18094g(initialValue, "initialValue");
        AbstractC16544l.m18094g(initialValue, "initialValue");
        C11232c c11232c = new C11232c();
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(initialValue);
        c11232c.f33996Y = c2153q0M3204c;
        c11232c.f33997Z = new C2146N(c2153q0M3204c, 0);
        return c11232c;
    }

    /* JADX INFO: renamed from: b */
    public static final void m9414b(AutoCloseable autoCloseable, Throwable th2) {
        if (autoCloseable != null) {
            if (th2 == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th3) {
                AbstractC9221V.m9789a(th2, th3);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Cursor m9415c(SQLiteDatabase sQLiteDatabase, String sql, String[] strArr, CancellationSignal cancellationSignal, C4255a c4255a) {
        AbstractC16544l.m18094g(sQLiteDatabase, "sQLiteDatabase");
        AbstractC16544l.m18094g(sql, "sql");
        AbstractC16544l.m18094g(cancellationSignal, "cancellationSignal");
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(c4255a, sql, strArr, null, cancellationSignal);
        AbstractC16544l.m18093f(cursorRawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return cursorRawQueryWithFactory;
    }
}
