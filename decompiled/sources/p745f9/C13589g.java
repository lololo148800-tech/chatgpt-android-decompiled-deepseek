package p745f9;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.gov.nist.core.Separators;
import android.os.SystemClock;
import android.util.Base64;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p001A.C0083q0;
import p301M.C5226h;
import p522V8.C7836c;
import p593Y8.C9682i;
import p663b9.EnumC11264c;
import p767g9.C13830a;
import p767g9.InterfaceC13831b;
import p767g9.InterfaceC13832c;
import p782h9.InterfaceC14430a;
import p805i9.AbstractC14950a;
import p817j$.util.Objects;
import p876lm.InterfaceC17068a;

/* JADX INFO: renamed from: f9.g */
/* JADX INFO: loaded from: classes.dex */
public final class C13589g implements InterfaceC13586d, InterfaceC13832c, InterfaceC13585c {

    /* JADX INFO: renamed from: r0 */
    public static final C7836c f42949r0 = new C7836c("proto");

    /* JADX INFO: renamed from: Y */
    public final C13591i f42950Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC14430a f42951Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC14430a f42952o0;

    /* JADX INFO: renamed from: p0 */
    public final C13583a f42953p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC17068a f42954q0;

    public C13589g(InterfaceC14430a interfaceC14430a, InterfaceC14430a interfaceC14430a2, C13583a c13583a, C13591i c13591i, InterfaceC17068a interfaceC17068a) {
        this.f42950Y = c13591i;
        this.f42951Z = interfaceC14430a;
        this.f42952o0 = interfaceC14430a2;
        this.f42953p0 = c13583a;
        this.f42954q0 = interfaceC17068a;
    }

    /* JADX INFO: renamed from: S */
    public static String m15104S(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder(Separators.LPAREN);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((C13584b) it.next()).f42944a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: T */
    public static Object m15105T(Cursor cursor, InterfaceC13587e interfaceC13587e) {
        try {
            return interfaceC13587e.mo22420apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: renamed from: e */
    public static Long m15106e(SQLiteDatabase sQLiteDatabase, C9682i c9682i) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(c9682i.f29188a, String.valueOf(AbstractC14950a.m16111a(c9682i.f29190c))));
        byte[] bArr = c9682i.f29189b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m15107E(long j10, EnumC11264c enumC11264c, String str) {
        m15110k(new C5226h(str, enumC11264c, j10, 3));
    }

    /* JADX INFO: renamed from: P */
    public final Object m15108P(InterfaceC13831b interfaceC13831b) {
        SQLiteDatabase sQLiteDatabaseM15109a = m15109a();
        InterfaceC14430a interfaceC14430a = this.f42952o0;
        long time = interfaceC14430a.getTime();
        while (true) {
            try {
                sQLiteDatabaseM15109a.beginTransaction();
                try {
                    Object objMo197a = interfaceC13831b.mo197a();
                    sQLiteDatabaseM15109a.setTransactionSuccessful();
                    return objMo197a;
                } finally {
                    sQLiteDatabaseM15109a.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (interfaceC14430a.getTime() >= ((long) this.f42953p0.f42941c) + time) {
                    throw new C13830a("Timed out while trying to acquire the lock.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f42950Y.close();
    }

    /* JADX INFO: renamed from: k */
    public final Object m15110k(InterfaceC13587e interfaceC13587e) {
        SQLiteDatabase sQLiteDatabaseM15109a = m15109a();
        sQLiteDatabaseM15109a.beginTransaction();
        try {
            Object objMo22420apply = interfaceC13587e.mo22420apply(sQLiteDatabaseM15109a);
            sQLiteDatabaseM15109a.setTransactionSuccessful();
            return objMo22420apply;
        } finally {
            sQLiteDatabaseM15109a.endTransaction();
        }
    }

    /* JADX INFO: renamed from: m */
    public final ArrayList m15111m(SQLiteDatabase sQLiteDatabase, C9682i c9682i, int i10) {
        ArrayList arrayList = new ArrayList();
        Long lM15106e = m15106e(sQLiteDatabase, c9682i);
        if (lM15106e == null) {
            return arrayList;
        }
        m15105T(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lM15106e.toString()}, null, null, null, String.valueOf(i10)), new C0083q0(this, arrayList, c9682i, 10));
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final SQLiteDatabase m15109a() {
        C13591i c13591i = this.f42950Y;
        Objects.requireNonNull(c13591i);
        InterfaceC14430a interfaceC14430a = this.f42952o0;
        long time = interfaceC14430a.getTime();
        while (true) {
            try {
                return c13591i.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e10) {
                if (interfaceC14430a.getTime() >= ((long) this.f42953p0.f42941c) + time) {
                    throw new C13830a(YladLSetV.bskKY, e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
