package p233J4;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import io.sentry.AbstractC15152P0;
import io.sentry.EnumC15147N1;
import io.sentry.InterfaceC15154Q;
import java.io.Closeable;
import kotlin.jvm.internal.AbstractC16544l;
import p017Af.C0485p;
import p207I4.C3614a;
import p207I4.InterfaceC3619f;

/* JADX INFO: renamed from: J4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C4256b implements Closeable {

    /* JADX INFO: renamed from: Z */
    public static final String[] f13902Z = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: o0 */
    public static final String[] f13903o0 = new String[0];

    /* JADX INFO: renamed from: Y */
    public final SQLiteDatabase f13904Y;

    public C4256b(SQLiteDatabase delegate) {
        AbstractC16544l.m18094g(delegate, "delegate");
        this.f13904Y = delegate;
    }

    /* JADX INFO: renamed from: E */
    public final void m5018E(String sql) {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.query", sql) : null;
        try {
            try {
                AbstractC16544l.m18094g(sql, "sql");
                this.f13904Y.execSQL(sql);
                if (interfaceC15154QMo16291v != null) {
                    interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
                }
                if (interfaceC15154QMo16291v != null) {
                    interfaceC15154QMo16291v.mo16271b();
                }
            } catch (SQLException e10) {
                if (interfaceC15154QMo16291v != null) {
                    interfaceC15154QMo16291v.mo16272c(EnumC15147N1.INTERNAL_ERROR);
                    interfaceC15154QMo16291v.mo16284o(e10);
                }
                throw e10;
            }
        } catch (Throwable th2) {
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            throw th2;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x001d */
    /* JADX INFO: renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5019P(Object[] objArr) {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.query", "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)") : null;
        try {
            this.f13904Y.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
            }
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
        } catch (SQLException e10) {
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16272c(EnumC15147N1.INTERNAL_ERROR);
                interfaceC15154QMo16291v.mo16284o(e10);
            }
            throw e10;
        }
    }

    /* JADX INFO: renamed from: S */
    public final boolean m5020S() {
        return this.f13904Y.inTransaction();
    }

    /* JADX INFO: renamed from: T */
    public final boolean m5021T() {
        SQLiteDatabase sQLiteDatabase = this.f13904Y;
        AbstractC16544l.m18094g(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    /* JADX INFO: renamed from: W */
    public final Cursor m5022W(InterfaceC3619f interfaceC3619f) {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.query", interfaceC3619f.mo3424k()) : null;
        try {
            try {
                Cursor cursorRawQueryWithFactory = this.f13904Y.rawQueryWithFactory(new C4255a(new C0485p(interfaceC3619f, 2), 1), interfaceC3619f.mo3424k(), f13903o0, null);
                AbstractC16544l.m18093f(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
                if (interfaceC15154QMo16291v != null) {
                    interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
                }
                if (interfaceC15154QMo16291v != null) {
                    interfaceC15154QMo16291v.mo16271b();
                }
                return cursorRawQueryWithFactory;
            } catch (Exception e10) {
                if (interfaceC15154QMo16291v != null) {
                    interfaceC15154QMo16291v.mo16272c(EnumC15147N1.INTERNAL_ERROR);
                    interfaceC15154QMo16291v.mo16284o(e10);
                }
                throw e10;
            }
        } catch (Throwable th2) {
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5023a() {
        this.f13904Y.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f13904Y.close();
    }

    /* JADX INFO: renamed from: e */
    public final void m5024e() {
        this.f13904Y.beginTransactionNonExclusive();
    }

    /* JADX INFO: renamed from: j0 */
    public final Cursor m5025j0(String query) {
        AbstractC16544l.m18094g(query, "query");
        return m5022W(new C3614a(query));
    }

    /* JADX INFO: renamed from: k */
    public final C4262h m5026k(String str) {
        SQLiteStatement sQLiteStatementCompileStatement = this.f13904Y.compileStatement(str);
        AbstractC16544l.m18093f(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new C4262h(sQLiteStatementCompileStatement);
    }

    /* JADX INFO: renamed from: m */
    public final void m5027m() {
        this.f13904Y.endTransaction();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m5028r0() {
        this.f13904Y.setTransactionSuccessful();
    }
}
