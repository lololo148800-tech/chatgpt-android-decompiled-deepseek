package p110E4;

import android.database.sqlite.SQLiteException;
import androidx.work.impl.WorkDatabase_Impl;
import io.sentry.android.core.AbstractC15256t;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p003A1.RunnableC0153B;
import p1028u.C20089f;
import p233J4.C4256b;
import p233J4.C4262h;
import p523V9.AbstractC8190s4;
import p582Xk.HXHG.TfazcFv;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: E4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2309g {

    /* JADX INFO: renamed from: m */
    public static final String[] f7162m = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: a */
    public final WorkDatabase_Impl f7163a;

    /* JADX INFO: renamed from: b */
    public final HashMap f7164b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f7165c;

    /* JADX INFO: renamed from: d */
    public final String[] f7166d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f7167e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public volatile boolean f7168f;

    /* JADX INFO: renamed from: g */
    public volatile C4262h f7169g;

    /* JADX INFO: renamed from: h */
    public final C2307e f7170h;

    /* JADX INFO: renamed from: i */
    public final C20089f f7171i;

    /* JADX INFO: renamed from: j */
    public final Object f7172j;

    /* JADX INFO: renamed from: k */
    public final Object f7173k;

    /* JADX INFO: renamed from: l */
    public final RunnableC0153B f7174l;

    public C2309g(WorkDatabase_Impl workDatabase_Impl, HashMap map, HashMap map2, String... strArr) {
        String lowerCase;
        this.f7163a = workDatabase_Impl;
        this.f7164b = map;
        this.f7170h = new C2307e(strArr.length);
        AbstractC16544l.m18093f(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.f7171i = new C20089f();
        this.f7172j = new Object();
        this.f7173k = new Object();
        this.f7165c = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String strM534w = AbstractC0168G.m534w(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
            this.f7165c.put(strM534w, Integer.valueOf(i10));
            String str2 = (String) this.f7164b.get(strArr[i10]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                AbstractC16544l.m18093f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                strM534w = lowerCase;
            }
            strArr2[i10] = strM534w;
        }
        this.f7166d = strArr2;
        for (Map.Entry entry : this.f7164b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String strM534w2 = AbstractC0168G.m534w(locale2, "US", str3, locale2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f7165c.containsKey(strM534w2)) {
                String lowerCase2 = ((String) entry.getKey()).toLowerCase(locale2);
                AbstractC16544l.m18093f(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f7165c;
                linkedHashMap.put(lowerCase2, AbstractC17659D.m19243e(linkedHashMap, strM534w2));
            }
        }
        this.f7174l = new RunnableC0153B(this, 4);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3412a() {
        C4256b c4256b = this.f7163a.f33702a;
        if (!AbstractC16544l.m18089b(c4256b != null ? Boolean.valueOf(c4256b.f13904Y.isOpen()) : null, Boolean.TRUE)) {
            return false;
        }
        if (!this.f7168f) {
            this.f7163a.m12345h().mo4328d0();
        }
        if (this.f7168f) {
            return true;
        }
        AbstractC15256t.m16465c("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m3413b(C4256b c4256b, int i10) {
        c4256b.m5018E("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f7166d[i10];
        String[] strArr = f7162m;
        for (int i11 = 0; i11 < 3; i11++) {
            String str2 = strArr[i11];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + AbstractC8190s4.m8771b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i10 + " AND invalidated = 0; END";
            AbstractC16544l.m18093f(str3, "StringBuilder().apply(builderAction).toString()");
            c4256b.m5018E(str3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3414c(C4256b database) {
        AbstractC16544l.m18094g(database, "database");
        if (database.m5020S()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.f7163a.f33709h.readLock();
            AbstractC16544l.m18093f(lock, TfazcFv.QtURIgq);
            lock.lock();
            try {
                synchronized (this.f7172j) {
                    int[] iArrM3399k = this.f7170h.m3399k();
                    if (iArrM3399k == null) {
                        lock.unlock();
                        return;
                    }
                    if (database.m5021T()) {
                        database.m5024e();
                    } else {
                        database.m5023a();
                    }
                    try {
                        int length = iArrM3399k.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length) {
                            int i12 = iArrM3399k[i10];
                            int i13 = i11 + 1;
                            if (i12 == 1) {
                                m3413b(database, i11);
                            } else if (i12 == 2) {
                                String str = this.f7166d[i11];
                                String[] strArr = f7162m;
                                for (int i14 = 0; i14 < 3; i14++) {
                                    String str2 = "DROP TRIGGER IF EXISTS " + AbstractC8190s4.m8771b(str, strArr[i14]);
                                    AbstractC16544l.m18093f(str2, "StringBuilder().apply(builderAction).toString()");
                                    database.m5018E(str2);
                                }
                            }
                            i10++;
                            i11 = i13;
                        }
                        database.m5028r0();
                        database.m5027m();
                        lock.unlock();
                    } catch (Throwable th2) {
                        database.m5027m();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                lock.unlock();
                throw th3;
            }
        } catch (SQLiteException e10) {
            AbstractC15256t.m16466d("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        } catch (IllegalStateException e11) {
            AbstractC15256t.m16466d("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
        }
    }
}
