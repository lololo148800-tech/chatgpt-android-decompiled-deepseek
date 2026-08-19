package p722e8;

import android.util.Log;
import io.sentry.internal.debugmeta.C15384c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p1113xn.AbstractC21329w;
import p228J.AbstractC3794B0;
import p499U9.C7591u;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC8119j5;
import p571X9.AbstractC9150J;
import p592Y7.AbstractC9667b;
import p592Y7.EnumC9671f;
import p661b7.EnumC11255b;
import p677c8.C11689a;
import p677c8.C11691c;
import p714e0.C13254b;
import p743f7.InterfaceC13575a;
import p765g7.InterfaceC13823a;
import p775h2.AbstractC14376f;
import p902n8.C17522i;
import p902n8.InterfaceC17524k;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17681o;
import p919o8.C17893E1;
import p919o8.C18027y1;

/* JADX INFO: renamed from: e8.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C13315Z implements InterfaceC13303M {

    /* JADX INFO: renamed from: U */
    public static final long f42159U = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: V */
    public static final long f42160V = TimeUnit.MILLISECONDS.toNanos(700);

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ int f42161W = 0;

    /* JADX INFO: renamed from: A */
    public long f42162A;

    /* JADX INFO: renamed from: B */
    public long f42163B;

    /* JADX INFO: renamed from: C */
    public long f42164C;

    /* JADX INFO: renamed from: D */
    public long f42165D;

    /* JADX INFO: renamed from: E */
    public long f42166E;

    /* JADX INFO: renamed from: F */
    public long f42167F;

    /* JADX INFO: renamed from: G */
    public long f42168G;

    /* JADX INFO: renamed from: H */
    public long f42169H;

    /* JADX INFO: renamed from: I */
    public long f42170I;

    /* JADX INFO: renamed from: J */
    public final LinkedHashMap f42171J;

    /* JADX INFO: renamed from: K */
    public final LinkedHashMap f42172K;

    /* JADX INFO: renamed from: L */
    public boolean f42173L;

    /* JADX INFO: renamed from: M */
    public Double f42174M;

    /* JADX INFO: renamed from: N */
    public final C13309T f42175N;

    /* JADX INFO: renamed from: O */
    public C17522i f42176O;

    /* JADX INFO: renamed from: P */
    public final C13310U f42177P;

    /* JADX INFO: renamed from: Q */
    public C17522i f42178Q;

    /* JADX INFO: renamed from: R */
    public final C13310U f42179R;

    /* JADX INFO: renamed from: S */
    public final LinkedHashMap f42180S;

    /* JADX INFO: renamed from: T */
    public final int f42181T;

    /* JADX INFO: renamed from: a */
    public final C13307Q f42182a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13823a f42183b;

    /* JADX INFO: renamed from: c */
    public final C15384c f42184c;

    /* JADX INFO: renamed from: d */
    public final C13304N f42185d;

    /* JADX INFO: renamed from: e */
    public final C13323g f42186e;

    /* JADX INFO: renamed from: f */
    public final C13254b f42187f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC17524k f42188g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC17524k f42189h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC17524k f42190i;

    /* JADX INFO: renamed from: j */
    public final C7591u f42191j;

    /* JADX INFO: renamed from: k */
    public final boolean f42192k;

    /* JADX INFO: renamed from: l */
    public final float f42193l;

    /* JADX INFO: renamed from: m */
    public final String f42194m;

    /* JADX INFO: renamed from: n */
    public final LinkedHashMap f42195n;

    /* JADX INFO: renamed from: o */
    public Map f42196o;

    /* JADX INFO: renamed from: p */
    public String f42197p;

    /* JADX INFO: renamed from: q */
    public String f42198q;

    /* JADX INFO: renamed from: r */
    public final LinkedHashSet f42199r;

    /* JADX INFO: renamed from: s */
    public final long f42200s;

    /* JADX INFO: renamed from: t */
    public final long f42201t;

    /* JADX INFO: renamed from: u */
    public final long f42202u;

    /* JADX INFO: renamed from: v */
    public C13321e f42203v;

    /* JADX INFO: renamed from: w */
    public final LinkedHashMap f42204w;

    /* JADX INFO: renamed from: x */
    public long f42205x;

    /* JADX INFO: renamed from: y */
    public long f42206y;

    /* JADX INFO: renamed from: z */
    public int f42207z;

    public C13315Z(C13307Q c13307q, InterfaceC13823a interfaceC13823a, C15384c c15384c, C13304N c13304n, C11691c eventTime, Map initialAttributes, C13323g c13323g, C13254b firstPartyHostHeaderTypeResolver, InterfaceC17524k cpuVitalMonitor, InterfaceC17524k memoryVitalMonitor, InterfaceC17524k frameRateVitalMonitor, int i10, boolean z6, float f10, int i11) {
        C7591u c7591u = new C7591u(21);
        int i12 = (i11 & 4096) != 0 ? 2 : i10;
        AbstractC16544l.m18094g(eventTime, "eventTime");
        AbstractC16544l.m18094g(initialAttributes, "initialAttributes");
        AbstractC16544l.m18094g(firstPartyHostHeaderTypeResolver, "firstPartyHostHeaderTypeResolver");
        AbstractC16544l.m18094g(cpuVitalMonitor, "cpuVitalMonitor");
        AbstractC16544l.m18094g(memoryVitalMonitor, "memoryVitalMonitor");
        AbstractC16544l.m18094g(frameRateVitalMonitor, "frameRateVitalMonitor");
        AbstractC14376f.m15825D(i12, "type");
        this.f42182a = c13307q;
        this.f42183b = interfaceC13823a;
        this.f42184c = c15384c;
        this.f42185d = c13304n;
        this.f42186e = c13323g;
        this.f42187f = firstPartyHostHeaderTypeResolver;
        this.f42188g = cpuVitalMonitor;
        this.f42189h = memoryVitalMonitor;
        this.f42190i = frameRateVitalMonitor;
        this.f42191j = c7591u;
        this.f42181T = i12;
        this.f42192k = z6;
        this.f42193l = f10;
        this.f42194m = AbstractC21329w.m21730q(c13304n.f42078b, '.', '/');
        this.f42195n = AbstractC17659D.m19256r(initialAttributes);
        this.f42196o = AbstractC17659D.m19254p(AbstractC9667b.m10254a(interfaceC13823a).mo10255k());
        C13305O c13305o = c13307q.f42105a;
        this.f42197p = c13305o.m14928c().f35458b;
        this.f42198q = AbstractC3794B0.m4498w("randomUUID().toString()");
        this.f42199r = new LinkedHashSet();
        this.f42200s = eventTime.f35477b;
        long j10 = interfaceC13823a.getTime().f35450d;
        this.f42201t = j10;
        this.f42202u = eventTime.f35476a + j10;
        this.f42204w = new LinkedHashMap();
        this.f42170I = 1L;
        this.f42171J = new LinkedHashMap();
        this.f42172K = new LinkedHashMap();
        C13309T c13309t = new C13309T(this);
        this.f42175N = c13309t;
        C13310U c13310u = new C13310U(this, 1);
        this.f42177P = c13310u;
        C13310U c13310u2 = new C13310U(this, 0);
        this.f42179R = c13310u2;
        this.f42180S = new LinkedHashMap();
        interfaceC13823a.mo15460p("rum", new C13308S(this, 0));
        cpuVitalMonitor.mo19202c(c13309t);
        memoryVitalMonitor.mo19202c(c13310u);
        frameRateVitalMonitor.mo19202c(c13310u2);
        C11689a c11689aM14928c = c13305o.m14928c();
        if (c11689aM14928c.f35464h != null) {
            Log.i("DatadogSynthetics", "_dd.application.id=" + c11689aM14928c.f35457a);
            Log.i("DatadogSynthetics", "_dd.session.id=" + c11689aM14928c.f35458b);
            Log.i("DatadogSynthetics", "_dd.view.id=" + this.f42198q);
        }
    }

    @Override // p722e8.InterfaceC13303M
    /* JADX INFO: renamed from: a */
    public final boolean mo14926a() {
        return !this.f42173L;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11331. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // p722e8.InterfaceC13303M
    /* JADX INFO: renamed from: b */
    public final p722e8.InterfaceC13303M mo14927b(p523V9.AbstractC8119j5 r24, p743f7.InterfaceC13575a r25) {
        /*
            Method dump skipped, instruction units count: 1133
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p722e8.C13315Z.mo14927b(V9.j5, f7.a):e8.M");
    }

    /* JADX INFO: renamed from: c */
    public final void m14931c(AbstractC8119j5 abstractC8119j5, InterfaceC13575a interfaceC13575a) {
        Iterator it = this.f42204w.entrySet().iterator();
        while (it.hasNext()) {
            if (((InterfaceC13303M) ((Map.Entry) it.next()).getValue()).mo14927b(abstractC8119j5, interfaceC13575a) == null) {
                if (abstractC8119j5 instanceof C13294D) {
                    this.f42166E--;
                    this.f42168G++;
                }
                it.remove();
            }
        }
        C13321e c13321e = this.f42203v;
        if (c13321e == null || c13321e.mo14927b(abstractC8119j5, interfaceC13575a) != null) {
            return;
        }
        this.f42203v = null;
        this.f42183b.mo15460p("rum", new C13313X(this, m14932d(), 1));
    }

    /* JADX INFO: renamed from: d */
    public final C11689a m14932d() {
        C11689a c11689aM14928c = this.f42182a.f42105a.m14928c();
        String str = this.f42197p;
        String str2 = c11689aM14928c.f35458b;
        if (!AbstractC16544l.m18089b(str2, str)) {
            this.f42197p = str2;
            String strM4498w = AbstractC3794B0.m4498w("randomUUID().toString()");
            this.f42199r.add(this.f42198q);
            this.f42198q = strM4498w;
            C11689a c11689aM14932d = m14932d();
            if (c11689aM14932d.f35464h != null) {
                Log.i("DatadogSynthetics", "_dd.application.id=" + c11689aM14932d.f35457a);
                Log.i("DatadogSynthetics", "_dd.session.id=" + c11689aM14932d.f35458b);
                Log.i("DatadogSynthetics", "_dd.view.id=" + this.f42198q);
            }
        }
        String str3 = this.f42198q;
        C13304N c13304n = this.f42185d;
        C13321e c13321e = this.f42203v;
        if (!(c13321e instanceof C13321e)) {
            c13321e = null;
        }
        return C11689a.m13025a(c11689aM14928c, null, false, str3, c13304n.f42079c, this.f42194m, c13321e != null ? c13321e.f42237j : null, 0, 0, this.f42181T, null, null, this.f42202u, this.f42201t, 3463);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m14933e() {
        return this.f42173L && this.f42204w.isEmpty() && ((this.f42167F + this.f42166E) + this.f42168G) + this.f42169H <= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final void m14934f(AbstractC8119j5 abstractC8119j5, InterfaceC13575a interfaceC13575a, int i10) {
        long j10;
        Boolean bool;
        C17893E1 c17893e1;
        boolean z6;
        long j11;
        Boolean boolValueOf;
        boolean zM14933e = m14933e();
        long j12 = this.f42170I + 1;
        this.f42170I = j12;
        long j13 = this.f42206y;
        long j14 = this.f42162A;
        long j15 = this.f42205x;
        long j16 = this.f42163B;
        long j17 = this.f42164C;
        long j18 = this.f42165D;
        Double d10 = this.f42174M;
        int i11 = this.f42207z;
        LinkedHashMap linkedHashMap = this.f42180S;
        C17522i c17522i = (C17522i) linkedHashMap.get(EnumC9671f.f29156Y);
        C17893E1 c17893e2 = c17522i != null ? new C17893E1(Double.valueOf(c17522i.f56049b), Double.valueOf(c17522i.f56050c), Double.valueOf(c17522i.f56051d), null) : null;
        C17522i c17522i2 = (C17522i) linkedHashMap.get(EnumC9671f.f29157Z);
        C17893E1 c17893e3 = c17522i2 != null ? new C17893E1(Double.valueOf(c17522i2.f56049b), Double.valueOf(c17522i2.f56050c), Double.valueOf(c17522i2.f56051d), null) : null;
        C17522i c17522i3 = (C17522i) linkedHashMap.get(EnumC9671f.f29158o0);
        if (c17522i3 != null) {
            double d11 = c17522i3.f56050c;
            double d12 = d11 == 0.0d ? 0.0d : 1.0d / d11;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            j10 = 1;
            Double dValueOf = Double.valueOf(d12 * timeUnit.toNanos(1L));
            double d13 = c17522i3.f56049b;
            Double dValueOf2 = Double.valueOf((d13 == 0.0d ? 0.0d : 1.0d / d13) * timeUnit.toNanos(1L));
            double d14 = c17522i3.f56051d;
            Double dValueOf3 = Double.valueOf((d14 != 0.0d ? 1.0d / d14 : 0.0d) * timeUnit.toNanos(1L));
            bool = null;
            c17893e1 = new C17893E1(dValueOf, dValueOf2, dValueOf3, null);
        } else {
            j14 = j14;
            j10 = 1;
            bool = null;
            c17893e1 = null;
        }
        long j19 = abstractC8119j5.mo8622a().f35477b - this.f42200s;
        InterfaceC13823a interfaceC13823a = this.f42183b;
        if (j19 <= 0) {
            z6 = true;
            AbstractC7889G0.m8185c(interfaceC13823a.mo15463s(), 4, AbstractC17681o.m19382k(EnumC11255b.f34098Y, EnumC11255b.f34100o0), new C13298H(this, 2), null, 56);
            j11 = j10;
        } else {
            z6 = true;
            j11 = j19;
        }
        C11689a c11689aM14932d = m14932d();
        LinkedHashMap linkedHashMap2 = this.f42171J;
        Object c18027y1 = !linkedHashMap2.isEmpty() ? new C18027y1(new LinkedHashMap(linkedHashMap2)) : bool;
        C17522i c17522i4 = this.f42176O;
        C17522i c17522i5 = this.f42178Q;
        if (c17522i5 == null) {
            boolValueOf = bool;
        } else {
            boolValueOf = Boolean.valueOf(c17522i5.f56051d < 55.0d ? z6 : false);
        }
        AbstractC9150J.m9697b(interfaceC13823a, interfaceC13575a, i10, new C13314Y(c11689aM14932d, this, AbstractC17659D.m19256r(this.f42172K), j13, j15, j14, j16, j17, j18, zM14933e, j11, d10, c17522i4, c17522i5, i11, c18027y1, boolValueOf != null ? boolValueOf.booleanValue() : false, c17893e2, c17893e3, c17893e1, AbstractC17659D.m19256r(AbstractC17659D.m19248j(this.f42195n, this.f42196o)), j12)).m18940m();
    }

    /* JADX INFO: renamed from: g */
    public final void m14935g(AbstractC8119j5 abstractC8119j5, InterfaceC13575a interfaceC13575a, InterfaceC1426a interfaceC1426a) {
        if (this.f42173L) {
            return;
        }
        interfaceC1426a.invoke();
        this.f42173L = true;
        m14934f(abstractC8119j5, interfaceC13575a, 1);
        m14931c(abstractC8119j5, interfaceC13575a);
        C13323g c13323g = this.f42186e;
        LinkedHashMap linkedHashMap = this.f42195n;
        boolean z6 = this.f42173L;
        C13306P c13306p = new C13306P(this.f42185d, linkedHashMap, !z6);
        if (!z6) {
            c13323g.f42271m = c13306p;
        }
        this.f42188g.mo19200a(this.f42175N);
        this.f42189h.mo19200a(this.f42177P);
        this.f42190i.mo19200a(this.f42179R);
    }
}
