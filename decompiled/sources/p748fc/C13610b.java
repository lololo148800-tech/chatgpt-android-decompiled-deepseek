package p748fc;

import ac.C10539a;
import android.javax.sip.C10808o;
import android.os.SystemClock;
import ec.C13363e;
import io.sentry.C15358g1;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p038Ba.AbstractC0865o;
import p084D4.C1918i;
import p1060v9.C20490h;
import p1060v9.C20493k;
import p1102x9.C21158b;
import p110E4.C2307e;
import p117Eb.RunnableC2394x;
import p178H.C3179x;
import p310M9.C5311e;
import p401Qb.C6584a;
import p501Ub.C7604f;
import p501Ub.EnumC7610l;
import p594Y9.C9788P4;
import p594Y9.C9891g0;
import p594Y9.C9919k4;
import p594Y9.EnumC9913j4;
import p594Y9.EnumC9966s3;
import p594Y9.EnumC9972t3;
import p604Yk.C10077b;
import p768gc.C13836a;

/* JADX INFO: renamed from: fc.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13610b extends AbstractC0865o {

    /* JADX INFO: renamed from: h */
    public static final C2307e f42991h = new C2307e(6, (byte) 0);

    /* JADX INFO: renamed from: i */
    public static boolean f42992i = true;

    /* JADX INFO: renamed from: d */
    public final InterfaceC13613e f42993d;

    /* JADX INFO: renamed from: e */
    public final C9788P4 f42994e;

    /* JADX INFO: renamed from: f */
    public final C15358g1 f42995f;

    /* JADX INFO: renamed from: g */
    public final C13836a f42996g;

    public C13610b(C9788P4 c9788p4, InterfaceC13613e interfaceC13613e, C13836a c13836a) {
        super(f42991h);
        this.f42994e = c9788p4;
        this.f42993d = interfaceC13613e;
        this.f42995f = new C15358g1(C7604f.m7950c().m7952b(), 11);
        this.f42996g = c13836a;
    }

    @Override // p038Ba.AbstractC0865o
    /* JADX INFO: renamed from: j */
    public final synchronized void mo1937j() {
        this.f42993d.mo2431b();
    }

    @Override // p038Ba.AbstractC0865o
    /* JADX INFO: renamed from: n */
    public final synchronized void mo1941n() {
        f42992i = true;
        this.f42993d.mo2432c();
    }

    @Override // p038Ba.AbstractC0865o
    /* JADX INFO: renamed from: q */
    public final Object mo1944q(C10539a c10539a) {
        C13363e c13363eMo2430a;
        synchronized (this) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                c13363eMo2430a = this.f42993d.mo2430a(c10539a);
                m15140s(EnumC9966s3.NO_ERROR, jElapsedRealtime, c10539a);
                f42992i = false;
            } catch (C6584a e10) {
                m15140s(e10.f21271Y == 14 ? EnumC9966s3.MODEL_NOT_DOWNLOADED : EnumC9966s3.UNKNOWN_ERROR, jElapsedRealtime, c10539a);
                throw e10;
            }
        }
        return c13363eMo2430a;
    }

    /* JADX INFO: renamed from: s */
    public final void m15140s(EnumC9966s3 enumC9966s3, long j10, C10539a c10539a) {
        int i10 = 7;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f42994e.m10404b(new C3179x(this, jElapsedRealtime, enumC9966s3, c10539a), EnumC9972t3.ON_DEVICE_TEXT_DETECT);
        C5311e c5311e = new C5311e(19);
        c5311e.f17484Z = enumC9966s3;
        c5311e.f17485o0 = Boolean.valueOf(f42992i);
        C10808o c10808o = new C10808o(25, false);
        this.f42996g.getClass();
        c10808o.f32040Z = EnumC9913j4.LATIN;
        c5311e.f17486p0 = new C9919k4(c10808o);
        EnumC7610l.f24056Y.execute(new RunnableC2394x(this.f42994e, new C9891g0(c5311e), jElapsedRealtime, new C10077b(this, i10), 3));
        long jCurrentTimeMillis = System.currentTimeMillis();
        C15358g1 c15358g1 = this.f42995f;
        int i11 = this.f42996g.m15474a() ? 24317 : 24306;
        int i12 = enumC9966s3.f29550Y;
        long j11 = jCurrentTimeMillis - jElapsedRealtime;
        synchronized (c15358g1) {
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (((AtomicLong) c15358g1.f47946Z).get() != -1 && jElapsedRealtime2 - ((AtomicLong) c15358g1.f47946Z).get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            ((C21158b) c15358g1.f47945Y).m21593c(new C20493k(0, Arrays.asList(new C20490h(i11, i12, 0, j11, jCurrentTimeMillis, null, null, 0, -1)))).m15124c(new C1918i(c15358g1, jElapsedRealtime2, i10));
        }
    }
}
