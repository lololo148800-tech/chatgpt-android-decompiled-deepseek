package androidx.work.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.os.Looper;
import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import io.sentry.AbstractC15152P0;
import io.sentry.EnumC15147N1;
import io.sentry.InterfaceC15154Q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p110E4.C2304b;
import p110E4.C2309g;
import p110E4.InterfaceC2305c;
import p207I4.InterfaceC3617d;
import p207I4.InterfaceC3619f;
import p233J4.C4255a;
import p233J4.C4256b;
import p544W9.AbstractC8706s;
import p658b5.C11232c;
import p658b5.C11234e;
import p658b5.C11238i;
import p658b5.C11241l;
import p658b5.C11242m;
import p658b5.C11246q;
import p658b5.C11248s;
import p817j$.util.DesugarCollections;
import p909nm.C17689w;
import p909nm.C17690x;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000B\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m18067d2 = {"Landroidx/work/impl/WorkDatabase;", "<init>", "()V", "work-runtime_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class WorkDatabase {

    /* JADX INFO: renamed from: a */
    public volatile C4256b f33702a;

    /* JADX INFO: renamed from: b */
    public Executor f33703b;

    /* JADX INFO: renamed from: c */
    public InterfaceC3617d f33704c;

    /* JADX INFO: renamed from: e */
    public boolean f33706e;

    /* JADX INFO: renamed from: f */
    public ArrayList f33707f;

    /* JADX INFO: renamed from: j */
    public final Map f33711j;

    /* JADX INFO: renamed from: k */
    public final LinkedHashMap f33712k;

    /* JADX INFO: renamed from: d */
    public final C2309g f33705d = mo12341d();

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f33708g = new LinkedHashMap();

    /* JADX INFO: renamed from: h */
    public final ReentrantReadWriteLock f33709h = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: i */
    public final ThreadLocal f33710i = new ThreadLocal();

    public WorkDatabase() {
        Map mapSynchronizedMap = DesugarCollections.synchronizedMap(new LinkedHashMap());
        AbstractC16544l.m18093f(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f33711j = mapSynchronizedMap;
        this.f33712k = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: q */
    public static Object m12337q(Class cls, InterfaceC3617d interfaceC3617d) {
        if (cls.isInstance(interfaceC3617d)) {
            return interfaceC3617d;
        }
        if (interfaceC3617d instanceof InterfaceC2305c) {
            return m12337q(cls, ((InterfaceC2305c) interfaceC3617d).getDelegate());
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m12339b() {
        if (!m12345h().mo4328d0().m5020S() && this.f33710i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12340c() {
        m12338a();
        m12338a();
        C4256b c4256bMo4328d0 = m12345h().mo4328d0();
        this.f33705d.m3414c(c4256bMo4328d0);
        if (c4256bMo4328d0.m5021T()) {
            c4256bMo4328d0.m5024e();
        } else {
            c4256bMo4328d0.m5023a();
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract C2309g mo12341d();

    /* JADX INFO: renamed from: e */
    public abstract InterfaceC3617d mo12342e(C2304b c2304b);

    /* JADX INFO: renamed from: f */
    public abstract C11232c mo12343f();

    /* JADX INFO: renamed from: g */
    public List mo12344g(LinkedHashMap autoMigrationSpecs) {
        AbstractC16544l.m18094g(autoMigrationSpecs, "autoMigrationSpecs");
        return C17689w.f56480Y;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC3617d m12345h() {
        InterfaceC3617d interfaceC3617d = this.f33704c;
        if (interfaceC3617d != null) {
            return interfaceC3617d;
        }
        AbstractC16544l.m18103p("internalOpenHelper");
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public Set mo12346i() {
        return C17691y.f56482Y;
    }

    /* JADX INFO: renamed from: j */
    public Map mo12347j() {
        return C17690x.f56481Y;
    }

    /* JADX INFO: renamed from: k */
    public final void m12348k() {
        m12345h().mo4328d0().m5027m();
        if (m12345h().mo4328d0().m5020S()) {
            return;
        }
        C2309g c2309g = this.f33705d;
        if (c2309g.f7167e.compareAndSet(false, true)) {
            Executor executor = c2309g.f7163a.f33703b;
            if (executor != null) {
                executor.execute(c2309g.f7174l);
            } else {
                AbstractC16544l.m18103p("internalQueryExecutor");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract C11234e mo12349l();

    /* JADX INFO: renamed from: m */
    public final Cursor m12350m(InterfaceC3619f interfaceC3619f, CancellationSignal cancellationSignal) {
        m12338a();
        m12339b();
        if (cancellationSignal == null) {
            return m12345h().mo4328d0().m5022W(interfaceC3619f);
        }
        C4256b c4256bMo4328d0 = m12345h().mo4328d0();
        c4256bMo4328d0.getClass();
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.query", interfaceC3619f.mo3424k()) : null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = c4256bMo4328d0.f13904Y;
                String strMo3424k = interfaceC3619f.mo3424k();
                String[] strArr = C4256b.f13903o0;
                AbstractC16544l.m18091d(cancellationSignal);
                Cursor cursorM9415c = AbstractC8706s.m9415c(sQLiteDatabase, strMo3424k, strArr, cancellationSignal, new C4255a(interfaceC3619f, 0));
                if (interfaceC15154QMo16291v != null) {
                    interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
                }
                if (interfaceC15154QMo16291v == null) {
                    return cursorM9415c;
                }
                interfaceC15154QMo16291v.mo16271b();
                return cursorM9415c;
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

    /* JADX INFO: renamed from: n */
    public final Object m12351n(Callable callable) {
        m12340c();
        try {
            Object objCall = callable.call();
            m12352o();
            return objCall;
        } finally {
            m12348k();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m12352o() {
        m12345h().mo4328d0().m5028r0();
    }

    /* JADX INFO: renamed from: p */
    public abstract C11238i mo12353p();

    /* JADX INFO: renamed from: r */
    public abstract C11241l mo12354r();

    /* JADX INFO: renamed from: s */
    public abstract C11242m mo12355s();

    /* JADX INFO: renamed from: t */
    public abstract C11246q mo12356t();

    /* JADX INFO: renamed from: u */
    public abstract C11248s mo12357u();

    /* JADX INFO: renamed from: a */
    public final void m12338a() {
        if (!this.f33706e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException(lZYtIbClQJm.tlrxKwS);
        }
    }
}
