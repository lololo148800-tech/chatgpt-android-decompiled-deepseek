package p233J4;

import android.database.sqlite.SQLiteStatement;
import io.sentry.AbstractC15152P0;
import io.sentry.EnumC15147N1;
import io.sentry.InterfaceC15154Q;
import p207I4.InterfaceC3618e;

/* JADX INFO: renamed from: J4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C4262h extends C4261g implements InterfaceC3618e {

    /* JADX INFO: renamed from: Z */
    public final SQLiteStatement f13925Z;

    public C4262h(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f13925Z = sQLiteStatement;
    }

    /* JADX INFO: renamed from: a */
    public final long m5033a() {
        SQLiteStatement sQLiteStatement = this.f13925Z;
        String string = sQLiteStatement.toString();
        String strSubstring = string.substring(string.indexOf(58) + 2);
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.query", strSubstring) : null;
        try {
            try {
                long jExecuteInsert = sQLiteStatement.executeInsert();
                if (interfaceC15154QMo16291v != null) {
                    interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
                }
                if (interfaceC15154QMo16291v != null) {
                    interfaceC15154QMo16291v.mo16271b();
                }
                return jExecuteInsert;
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

    /* JADX INFO: renamed from: e */
    public final int m5034e() {
        SQLiteStatement sQLiteStatement = this.f13925Z;
        String string = sQLiteStatement.toString();
        String strSubstring = string.substring(string.indexOf(58) + 2);
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.query", strSubstring) : null;
        try {
            try {
                int iExecuteUpdateDelete = sQLiteStatement.executeUpdateDelete();
                if (interfaceC15154QMo16291v != null) {
                    interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
                }
                if (interfaceC15154QMo16291v != null) {
                    interfaceC15154QMo16291v.mo16271b();
                }
                return iExecuteUpdateDelete;
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
}
