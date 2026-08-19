package p057C3;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import io.sentry.clientreport.C15333a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import livekit.org.webrtc.MediaStreamTrack;
import p001A.AbstractC0010F;
import p001A.C0030P;
import p001A.C0039U;
import p001A.C0041V;
import p001A.C0072l;
import p001A.C0093v0;
import p001A.C0095w0;
import p001A.RunnableC0000A;
import p007A5.C0376k;
import p025An.C0644w;
import p030B2.C0781s;
import p083D3.C1868f;
import p083D3.C1875m;
import p084D4.C1904b;
import p1016t3.AbstractC19764N;
import p1016t3.AbstractC19798y;
import p1016t3.C19751A;
import p1016t3.C19753C;
import p1016t3.C19758H;
import p1016t3.C19760J;
import p1016t3.C19762L;
import p1016t3.C19763M;
import p1016t3.C19770U;
import p1016t3.C19773X;
import p1016t3.C19778e;
import p1016t3.C19783j;
import p1016t3.C19786m;
import p1016t3.C19797x;
import p1016t3.C19799z;
import p1016t3.InterfaceC19752B;
import p1016t3.InterfaceC19759I;
import p1053v3.C20422c;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20808j;
import p1073w3.C20812n;
import p1073w3.C20813o;
import p1073w3.C20814p;
import p1073w3.C20815q;
import p1073w3.InterfaceC20806h;
import p1073w3.InterfaceC20807i;
import p228J.AbstractC3812N;
import p232J3.C4222W;
import p232J3.C4227a0;
import p232J3.C4253y;
import p232J3.InterfaceC4252x;
import p281L3.AbstractC4931r;
import p281L3.C4928o;
import p281L3.C4932s;
import p281L3.InterfaceC4930q;
import p305M3.C5283c;
import p305M3.C5287g;
import p305M3.InterfaceC5284d;
import p451Sb.C7102a;
import p499U9.C7591u;
import p607Yo.C10115d;
import p720e6.C13288c;

/* JADX INFO: renamed from: C3.D */
/* JADX INFO: loaded from: classes.dex */
public final class C1526D extends AbstractC3812N {

    /* JADX INFO: renamed from: A0 */
    public final C19762L f4051A0;

    /* JADX INFO: renamed from: B0 */
    public final ArrayList f4052B0;

    /* JADX INFO: renamed from: C0 */
    public final boolean f4053C0;

    /* JADX INFO: renamed from: D0 */
    public final InterfaceC4252x f4054D0;

    /* JADX INFO: renamed from: E0 */
    public final C1868f f4055E0;

    /* JADX INFO: renamed from: F0 */
    public final Looper f4056F0;

    /* JADX INFO: renamed from: G0 */
    public final InterfaceC5284d f4057G0;

    /* JADX INFO: renamed from: H0 */
    public final C20813o f4058H0;

    /* JADX INFO: renamed from: I0 */
    public final SurfaceHolderCallbackC1523A f4059I0;

    /* JADX INFO: renamed from: J0 */
    public final C1524B f4060J0;

    /* JADX INFO: renamed from: K0 */
    public final C0093v0 f4061K0;

    /* JADX INFO: renamed from: L0 */
    public final C1552c f4062L0;

    /* JADX INFO: renamed from: M0 */
    public final C7102a f4063M0;

    /* JADX INFO: renamed from: N0 */
    public final C7591u f4064N0;

    /* JADX INFO: renamed from: O0 */
    public final long f4065O0;

    /* JADX INFO: renamed from: P0 */
    public int f4066P0;

    /* JADX INFO: renamed from: Q0 */
    public int f4067Q0;

    /* JADX INFO: renamed from: R0 */
    public boolean f4068R0;

    /* JADX INFO: renamed from: S0 */
    public final C1561g0 f4069S0;

    /* JADX INFO: renamed from: T0 */
    public C4222W f4070T0;

    /* JADX INFO: renamed from: U0 */
    public final C1573r f4071U0;

    /* JADX INFO: renamed from: V0 */
    public C19758H f4072V0;

    /* JADX INFO: renamed from: W0 */
    public C19751A f4073W0;

    /* JADX INFO: renamed from: X0 */
    public AudioTrack f4074X0;

    /* JADX INFO: renamed from: Y0 */
    public Surface f4075Y0;

    /* JADX INFO: renamed from: Z0 */
    public Surface f4076Z0;

    /* JADX INFO: renamed from: a1 */
    public final int f4077a1;

    /* JADX INFO: renamed from: b1 */
    public C20812n f4078b1;

    /* JADX INFO: renamed from: c1 */
    public final int f4079c1;

    /* JADX INFO: renamed from: d1 */
    public final C19778e f4080d1;

    /* JADX INFO: renamed from: e1 */
    public float f4081e1;

    /* JADX INFO: renamed from: f1 */
    public boolean f4082f1;

    /* JADX INFO: renamed from: g1 */
    public final boolean f4083g1;

    /* JADX INFO: renamed from: h1 */
    public boolean f4084h1;

    /* JADX INFO: renamed from: i1 */
    public final int f4085i1;

    /* JADX INFO: renamed from: j1 */
    public C19751A f4086j1;

    /* JADX INFO: renamed from: k1 */
    public C1547Z f4087k1;

    /* JADX INFO: renamed from: l1 */
    public int f4088l1;

    /* JADX INFO: renamed from: m1 */
    public long f4089m1;

    /* JADX INFO: renamed from: o0 */
    public final C4932s f4090o0;

    /* JADX INFO: renamed from: p0 */
    public final C19758H f4091p0;

    /* JADX INFO: renamed from: q0 */
    public final C0376k f4092q0;

    /* JADX INFO: renamed from: r0 */
    public final Context f4093r0;

    /* JADX INFO: renamed from: s0 */
    public final AbstractC3812N f4094s0;

    /* JADX INFO: renamed from: t0 */
    public final AbstractC1554d[] f4095t0;

    /* JADX INFO: renamed from: u0 */
    public final AbstractC4931r f4096u0;

    /* JADX INFO: renamed from: v0 */
    public final C20815q f4097v0;

    /* JADX INFO: renamed from: w0 */
    public final C1576u f4098w0;

    /* JADX INFO: renamed from: x0 */
    public final C1532J f4099x0;

    /* JADX INFO: renamed from: y0 */
    public final C10115d f4100y0;

    /* JADX INFO: renamed from: z0 */
    public final CopyOnWriteArraySet f4101z0;

    static {
        AbstractC19798y.m20754a("media3.exoplayer");
    }

    public C1526D(C1572q c1572q) {
        boolean zEquals;
        super(11, (byte) 0);
        this.f4092q0 = new C0376k(13, false);
        try {
            AbstractC20800b.m21327o("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + AbstractC20817s.f66110e + "]");
            this.f4093r0 = c1572q.f4397a.getApplicationContext();
            C0030P c0030p = c1572q.f4404h;
            C20813o c20813o = c1572q.f4398b;
            c0030p.getClass();
            this.f4055E0 = new C1868f(c20813o);
            this.f4085i1 = c1572q.f4406j;
            this.f4080d1 = c1572q.f4407k;
            this.f4077a1 = c1572q.f4408l;
            this.f4082f1 = false;
            this.f4065O0 = c1572q.f4413q;
            SurfaceHolderCallbackC1523A surfaceHolderCallbackC1523A = new SurfaceHolderCallbackC1523A(this);
            this.f4059I0 = surfaceHolderCallbackC1523A;
            this.f4060J0 = new C1524B();
            Handler handler = new Handler(c1572q.f4405i);
            AbstractC1554d[] abstractC1554dArrM2434b = ((C1566k) c1572q.f4399c.get()).m2434b(handler, surfaceHolderCallbackC1523A, surfaceHolderCallbackC1523A, surfaceHolderCallbackC1523A, surfaceHolderCallbackC1523A);
            this.f4095t0 = abstractC1554dArrM2434b;
            AbstractC20800b.m21320h(abstractC1554dArrM2434b.length > 0);
            this.f4096u0 = (AbstractC4931r) c1572q.f4401e.get();
            this.f4054D0 = (InterfaceC4252x) c1572q.f4400d.get();
            this.f4057G0 = (InterfaceC5284d) c1572q.f4403g.get();
            this.f4053C0 = c1572q.f4409m;
            this.f4069S0 = c1572q.f4410n;
            Looper looper = c1572q.f4405i;
            this.f4056F0 = looper;
            C20813o c20813o2 = c1572q.f4398b;
            this.f4058H0 = c20813o2;
            this.f4094s0 = this;
            this.f4100y0 = new C10115d(looper, c20813o2, new C1576u(this));
            this.f4101z0 = new CopyOnWriteArraySet();
            this.f4052B0 = new ArrayList();
            this.f4070T0 = new C4222W();
            this.f4071U0 = C1573r.f4417a;
            this.f4090o0 = new C4932s(new C1559f0[abstractC1554dArrM2434b.length], new InterfaceC4930q[abstractC1554dArrM2434b.length], C19770U.f62647b, null);
            this.f4051A0 = new C19762L();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i10 = 0; i10 < 20; i10++) {
                int i11 = iArr[i10];
                AbstractC20800b.m21320h(!false);
                sparseBooleanArray.append(i11, true);
            }
            this.f4096u0.getClass();
            AbstractC20800b.m21320h(!false);
            sparseBooleanArray.append(29, true);
            AbstractC20800b.m21320h(!false);
            C19786m c19786m = new C19786m(sparseBooleanArray);
            this.f4091p0 = new C19758H(c19786m);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i12 = 0; i12 < c19786m.f62693a.size(); i12++) {
                int iM20745a = c19786m.m20745a(i12);
                AbstractC20800b.m21320h(!false);
                sparseBooleanArray2.append(iM20745a, true);
            }
            AbstractC20800b.m21320h(!false);
            sparseBooleanArray2.append(4, true);
            AbstractC20800b.m21320h(!false);
            sparseBooleanArray2.append(10, true);
            AbstractC20800b.m21320h(!false);
            this.f4072V0 = new C19758H(new C19786m(sparseBooleanArray2));
            this.f4097v0 = this.f4058H0.m21372a(this.f4056F0, null);
            C1576u c1576u = new C1576u(this);
            this.f4098w0 = c1576u;
            this.f4087k1 = C1547Z.m2372h(this.f4090o0);
            this.f4055E0.m2749E(this.f4094s0, this.f4056F0);
            int i13 = AbstractC20817s.f66106a;
            C1875m c1875m = i13 < 31 ? new C1875m(c1572q.f4416t) : AbstractC1578w.m2439a(this.f4093r0, this, c1572q.f4414r, c1572q.f4416t);
            AbstractC1554d[] abstractC1554dArr = this.f4095t0;
            AbstractC4931r abstractC4931r = this.f4096u0;
            C4932s c4932s = this.f4090o0;
            c1572q.f4402f.getClass();
            this.f4099x0 = new C1532J(abstractC1554dArr, abstractC4931r, c4932s, new C1564i(), this.f4057G0, this.f4055E0, this.f4069S0, c1572q.f4411o, c1572q.f4412p, this.f4056F0, this.f4058H0, c1576u, c1875m, this.f4071U0);
            this.f4081e1 = 1.0f;
            C19751A c19751a = C19751A.f62530y;
            this.f4073W0 = c19751a;
            this.f4086j1 = c19751a;
            this.f4088l1 = -1;
            if (i13 < 21) {
                AudioTrack audioTrack = this.f4074X0;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f4074X0.release();
                    this.f4074X0 = null;
                }
                if (this.f4074X0 == null) {
                    this.f4074X0 = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f4079c1 = this.f4074X0.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.f4093r0.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                this.f4079c1 = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            }
            int i14 = C20422c.f64594b;
            this.f4083g1 = true;
            C1868f c1868f = this.f4055E0;
            c1868f.getClass();
            this.f4100y0.m10690a(c1868f);
            InterfaceC5284d interfaceC5284d = this.f4057G0;
            Handler handler2 = new Handler(this.f4056F0);
            C1868f c1868f2 = this.f4055E0;
            C5287g c5287g = (C5287g) interfaceC5284d;
            c5287g.getClass();
            c1868f2.getClass();
            C13288c c13288c = c5287g.f17418b;
            c13288c.getClass();
            CopyOnWriteArrayList<C5283c> copyOnWriteArrayList = (CopyOnWriteArrayList) c13288c.f42001Y;
            for (C5283c c5283c : copyOnWriteArrayList) {
                if (c5283c.f17401b == c1868f2) {
                    c5283c.f17402c = true;
                    copyOnWriteArrayList.remove(c5283c);
                }
            }
            ((CopyOnWriteArrayList) c13288c.f42001Y).add(new C5283c(handler2, c1868f2));
            this.f4101z0.add(this.f4059I0);
            C0093v0 c0093v0 = new C0093v0(c1572q.f4397a, handler, this.f4059I0);
            this.f4061K0 = c0093v0;
            c0093v0.m353w();
            C1552c c1552c = new C1552c(c1572q.f4397a, handler, this.f4059I0);
            this.f4062L0 = c1552c;
            if (!AbstractC20817s.m21400a(c1552c.f4278d, null)) {
                c1552c.f4278d = null;
                c1552c.f4280f = 0;
                AbstractC20800b.m21315c("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", true);
            }
            Context context = c1572q.f4397a;
            C7102a c7102a = new C7102a(3);
            context.getApplicationContext();
            this.f4063M0 = c7102a;
            this.f4064N0 = new C7591u(c1572q.f4397a);
            C0781s c0781s = new C0781s(9);
            c0781s.f2192b = 0;
            c0781s.f2193c = 0;
            new C19783j(c0781s);
            C19773X c19773x = C19773X.f62650e;
            this.f4078b1 = C20812n.f66095c;
            AbstractC4931r abstractC4931r2 = this.f4096u0;
            C19778e c19778e = this.f4080d1;
            C4928o c4928o = (C4928o) abstractC4931r2;
            synchronized (c4928o.f16086c) {
                zEquals = c4928o.f16091h.equals(c19778e);
                c4928o.f16091h = c19778e;
            }
            if (!zEquals) {
                c4928o.m5539d();
            }
            m2249j0(1, Integer.valueOf(this.f4079c1), 10);
            m2249j0(2, Integer.valueOf(this.f4079c1), 10);
            m2249j0(1, this.f4080d1, 3);
            m2249j0(2, Integer.valueOf(this.f4077a1), 4);
            m2249j0(2, 0, 5);
            m2249j0(1, Boolean.valueOf(this.f4082f1), 9);
            m2249j0(2, this.f4060J0, 7);
            m2249j0(6, this.f4060J0, 8);
            m2249j0(-1, Integer.valueOf(this.f4085i1), 16);
            this.f4092q0.m1015h();
        } catch (Throwable th2) {
            this.f4092q0.m1015h();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m2230Q(C1526D c1526d, final int i10, final int i11) {
        C20812n c20812n = c1526d.f4078b1;
        if (i10 == c20812n.f66096a && i11 == c20812n.f66097b) {
            return;
        }
        c1526d.f4078b1 = new C20812n(i10, i11);
        c1526d.f4100y0.m10694e(24, new InterfaceC20806h() { // from class: C3.v
            @Override // p1073w3.InterfaceC20806h
            public final void invoke(Object obj) {
                ((InterfaceC19759I) obj).mo2775w(i10, i11);
            }
        });
        c1526d.m2249j0(2, new C20812n(i10, i11), 14);
    }

    /* JADX INFO: renamed from: c0 */
    public static long m2231c0(C1547Z c1547z) {
        C19763M c19763m = new C19763M();
        C19762L c19762l = new C19762L();
        c1547z.f4250a.mo2416g(c1547z.f4251b.f13895a, c19762l);
        long j10 = c1547z.f4252c;
        if (j10 != -9223372036854775807L) {
            return c19762l.f62581e + j10;
        }
        return c1547z.f4250a.mo2411m(c19762l.f62579c, c19763m, 0L).f62596k;
    }

    /* JADX INFO: renamed from: R */
    public final C19751A m2232R() {
        AbstractC19764N abstractC19764NM2239Y = m2239Y();
        if (abstractC19764NM2239Y.m20728p()) {
            return this.f4086j1;
        }
        C19797x c19797x = abstractC19764NM2239Y.mo2411m(m2236V(), (C19763M) this.f11539Z, 0L).f62588c;
        C19799z c19799zM20700a = this.f4086j1.m20700a();
        C19751A c19751a = c19797x.f62788d;
        if (c19751a != null) {
            CharSequence charSequence = c19751a.f62531a;
            if (charSequence != null) {
                c19799zM20700a.f62793a = charSequence;
            }
            CharSequence charSequence2 = c19751a.f62532b;
            if (charSequence2 != null) {
                c19799zM20700a.f62794b = charSequence2;
            }
            CharSequence charSequence3 = c19751a.f62533c;
            if (charSequence3 != null) {
                c19799zM20700a.f62795c = charSequence3;
            }
            CharSequence charSequence4 = c19751a.f62534d;
            if (charSequence4 != null) {
                c19799zM20700a.f62796d = charSequence4;
            }
            CharSequence charSequence5 = c19751a.f62535e;
            if (charSequence5 != null) {
                c19799zM20700a.f62797e = charSequence5;
            }
            byte[] bArr = c19751a.f62536f;
            if (bArr != null) {
                c19799zM20700a.f62798f = bArr == null ? null : (byte[]) bArr.clone();
                c19799zM20700a.f62799g = c19751a.f62537g;
            }
            Integer num = c19751a.f62538h;
            if (num != null) {
                c19799zM20700a.f62800h = num;
            }
            Integer num2 = c19751a.f62539i;
            if (num2 != null) {
                c19799zM20700a.f62801i = num2;
            }
            Integer num3 = c19751a.f62540j;
            if (num3 != null) {
                c19799zM20700a.f62802j = num3;
            }
            Boolean bool = c19751a.f62541k;
            if (bool != null) {
                c19799zM20700a.f62803k = bool;
            }
            Integer num4 = c19751a.f62542l;
            if (num4 != null) {
                c19799zM20700a.f62804l = num4;
            }
            Integer num5 = c19751a.f62543m;
            if (num5 != null) {
                c19799zM20700a.f62804l = num5;
            }
            Integer num6 = c19751a.f62544n;
            if (num6 != null) {
                c19799zM20700a.f62805m = num6;
            }
            Integer num7 = c19751a.f62545o;
            if (num7 != null) {
                c19799zM20700a.f62806n = num7;
            }
            Integer num8 = c19751a.f62546p;
            if (num8 != null) {
                c19799zM20700a.f62807o = num8;
            }
            Integer num9 = c19751a.f62547q;
            if (num9 != null) {
                c19799zM20700a.f62808p = num9;
            }
            Integer num10 = c19751a.f62548r;
            if (num10 != null) {
                c19799zM20700a.f62809q = num10;
            }
            CharSequence charSequence6 = c19751a.f62549s;
            if (charSequence6 != null) {
                c19799zM20700a.f62810r = charSequence6;
            }
            CharSequence charSequence7 = c19751a.f62550t;
            if (charSequence7 != null) {
                c19799zM20700a.f62811s = charSequence7;
            }
            CharSequence charSequence8 = c19751a.f62551u;
            if (charSequence8 != null) {
                c19799zM20700a.f62812t = charSequence8;
            }
            CharSequence charSequence9 = c19751a.f62552v;
            if (charSequence9 != null) {
                c19799zM20700a.f62813u = charSequence9;
            }
            CharSequence charSequence10 = c19751a.f62553w;
            if (charSequence10 != null) {
                c19799zM20700a.f62814v = charSequence10;
            }
            Integer num11 = c19751a.f62554x;
            if (num11 != null) {
                c19799zM20700a.f62815w = num11;
            }
        }
        return new C19751A(c19799zM20700a);
    }

    /* JADX INFO: renamed from: S */
    public final long m2233S(C1547Z c1547z) {
        if (!c1547z.f4251b.m5017b()) {
            return AbstractC20817s.m21399M(m2238X(c1547z));
        }
        Object obj = c1547z.f4251b.f13895a;
        AbstractC19764N abstractC19764N = c1547z.f4250a;
        C19762L c19762l = this.f4051A0;
        abstractC19764N.mo2416g(obj, c19762l);
        long j10 = c1547z.f4252c;
        return j10 == -9223372036854775807L ? AbstractC20817s.m21399M(abstractC19764N.mo2411m(m2240Z(c1547z), (C19763M) this.f11539Z, 0L).f62596k) : AbstractC20817s.m21399M(c19762l.f62581e) + AbstractC20817s.m21399M(j10);
    }

    /* JADX INFO: renamed from: T */
    public final int m2234T() {
        m2256q0();
        if (m2243d0()) {
            return this.f4087k1.f4251b.f13896b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: U */
    public final int m2235U() {
        m2256q0();
        if (m2243d0()) {
            return this.f4087k1.f4251b.f13897c;
        }
        return -1;
    }

    /* JADX INFO: renamed from: V */
    public final int m2236V() {
        m2256q0();
        int iM2240Z = m2240Z(this.f4087k1);
        if (iM2240Z == -1) {
            return 0;
        }
        return iM2240Z;
    }

    /* JADX INFO: renamed from: W */
    public final long m2237W() {
        m2256q0();
        return AbstractC20817s.m21399M(m2238X(this.f4087k1));
    }

    /* JADX INFO: renamed from: X */
    public final long m2238X(C1547Z c1547z) {
        if (c1547z.f4250a.m20728p()) {
            return AbstractC20817s.m21390D(this.f4089m1);
        }
        long jM2380i = c1547z.f4265p ? c1547z.m2380i() : c1547z.f4268s;
        if (c1547z.f4251b.m5017b()) {
            return jM2380i;
        }
        AbstractC19764N abstractC19764N = c1547z.f4250a;
        Object obj = c1547z.f4251b.f13895a;
        C19762L c19762l = this.f4051A0;
        abstractC19764N.mo2416g(obj, c19762l);
        return jM2380i + c19762l.f62581e;
    }

    /* JADX INFO: renamed from: Y */
    public final AbstractC19764N m2239Y() {
        m2256q0();
        return this.f4087k1.f4250a;
    }

    /* JADX INFO: renamed from: Z */
    public final int m2240Z(C1547Z c1547z) {
        if (c1547z.f4250a.m20728p()) {
            return this.f4088l1;
        }
        return c1547z.f4250a.mo2416g(c1547z.f4251b.f13895a, this.f4051A0).f62579c;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m2241a0() {
        m2256q0();
        return this.f4087k1.f4261l;
    }

    /* JADX INFO: renamed from: b0 */
    public final int m2242b0() {
        m2256q0();
        return this.f4087k1.f4254e;
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m2243d0() {
        m2256q0();
        return this.f4087k1.f4251b.m5017b();
    }

    /* JADX INFO: renamed from: e0 */
    public final C1547Z m2244e0(C1547Z c1547z, AbstractC19764N abstractC19764N, Pair pair) {
        List list;
        AbstractC20800b.m21316d(abstractC19764N.m20728p() || pair != null);
        AbstractC19764N abstractC19764N2 = c1547z.f4250a;
        long jM2233S = m2233S(c1547z);
        C1547Z c1547zM2379g = c1547z.m2379g(abstractC19764N);
        if (abstractC19764N.m20728p()) {
            C4253y c4253y = C1547Z.f4249u;
            long jM21390D = AbstractC20817s.m21390D(this.f4089m1);
            C1547Z c1547zM2374b = c1547zM2379g.m2375c(c4253y, jM21390D, jM21390D, jM21390D, 0L, C4227a0.f13814d, this.f4090o0, C11294T.f34185q0).m2374b(c4253y);
            c1547zM2374b.f4266q = c1547zM2374b.f4268s;
            return c1547zM2374b;
        }
        Object obj = c1547zM2379g.f4251b.f13895a;
        boolean zEquals = obj.equals(pair.first);
        C4253y c4253y2 = !zEquals ? new C4253y(pair.first) : c1547zM2379g.f4251b;
        long jLongValue = ((Long) pair.second).longValue();
        long jM21390D2 = AbstractC20817s.m21390D(jM2233S);
        if (!abstractC19764N2.m20728p()) {
            jM21390D2 -= abstractC19764N2.mo2416g(obj, this.f4051A0).f62581e;
        }
        if (!zEquals || jLongValue < jM21390D2) {
            AbstractC20800b.m21320h(!c4253y2.m5017b());
            C4227a0 c4227a0 = !zEquals ? C4227a0.f13814d : c1547zM2379g.f4257h;
            C4932s c4932s = !zEquals ? this.f4090o0 : c1547zM2379g.f4258i;
            if (zEquals) {
                list = c1547zM2379g.f4259j;
            } else {
                C11276A c11276a = AbstractC11278C.f34162Z;
                list = C11294T.f34185q0;
            }
            C1547Z c1547zM2374b2 = c1547zM2379g.m2375c(c4253y2, jLongValue, jLongValue, jLongValue, 0L, c4227a0, c4932s, list).m2374b(c4253y2);
            c1547zM2374b2.f4266q = jLongValue;
            return c1547zM2374b2;
        }
        if (jLongValue != jM21390D2) {
            AbstractC20800b.m21320h(!c4253y2.m5017b());
            long jMax = Math.max(0L, c1547zM2379g.f4267r - (jLongValue - jM21390D2));
            long j10 = c1547zM2379g.f4266q;
            if (c1547zM2379g.f4260k.equals(c1547zM2379g.f4251b)) {
                j10 = jLongValue + jMax;
            }
            C1547Z c1547zM2375c = c1547zM2379g.m2375c(c4253y2, jLongValue, jLongValue, jLongValue, jMax, c1547zM2379g.f4257h, c1547zM2379g.f4258i, c1547zM2379g.f4259j);
            c1547zM2375c.f4266q = j10;
            return c1547zM2375c;
        }
        int iMo2413b = abstractC19764N.mo2413b(c1547zM2379g.f4260k.f13895a);
        if (iMo2413b != -1 && abstractC19764N.mo2410f(iMo2413b, this.f4051A0, false).f62579c == abstractC19764N.mo2416g(c4253y2.f13895a, this.f4051A0).f62579c) {
            return c1547zM2379g;
        }
        abstractC19764N.mo2416g(c4253y2.f13895a, this.f4051A0);
        long jM20714a = c4253y2.m5017b() ? this.f4051A0.m20714a(c4253y2.f13896b, c4253y2.f13897c) : this.f4051A0.f62580d;
        C1547Z c1547zM2374b3 = c1547zM2379g.m2375c(c4253y2, c1547zM2379g.f4268s, c1547zM2379g.f4268s, c1547zM2379g.f4253d, jM20714a - c1547zM2379g.f4268s, c1547zM2379g.f4257h, c1547zM2379g.f4258i, c1547zM2379g.f4259j).m2374b(c4253y2);
        c1547zM2374b3.f4266q = jM20714a;
        return c1547zM2374b3;
    }

    /* JADX INFO: renamed from: f0 */
    public final Pair m2245f0(AbstractC19764N abstractC19764N, int i10, long j10) {
        if (abstractC19764N.m20728p()) {
            this.f4088l1 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f4089m1 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= abstractC19764N.mo2420o()) {
            i10 = abstractC19764N.mo2412a(false);
            j10 = AbstractC20817s.m21399M(abstractC19764N.mo2411m(i10, (C19763M) this.f11539Z, 0L).f62596k);
        }
        return abstractC19764N.m20725i((C19763M) this.f11539Z, this.f4051A0, i10, AbstractC20817s.m21390D(j10));
    }

    /* JADX INFO: renamed from: g0 */
    public final void m2246g0() {
        m2256q0();
        boolean zM2241a0 = m2241a0();
        int iM2384c = this.f4062L0.m2384c(2, zM2241a0);
        m2253n0(iM2384c, iM2384c == -1 ? 2 : 1, zM2241a0);
        C1547Z c1547z = this.f4087k1;
        if (c1547z.f4254e != 1) {
            return;
        }
        C1547Z c1547zM2377e = c1547z.m2377e(null);
        C1547Z c1547zM2378f = c1547zM2377e.m2378f(c1547zM2377e.f4250a.m20728p() ? 4 : 2);
        this.f4066P0++;
        C20815q c20815q = this.f4099x0.f4161t0;
        c20815q.getClass();
        C20814p c20814pM21375b = C20815q.m21375b();
        c20814pM21375b.f66099a = c20815q.f66101a.obtainMessage(29);
        c20814pM21375b.m21374b();
        m2254o0(c1547zM2378f, 1, false, 5, -9223372036854775807L, -1);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m2247h0() {
        String str;
        AudioTrack audioTrack;
        int i10 = 10;
        StringBuilder sb2 = new StringBuilder("Release ");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" [AndroidXMedia3/1.4.1] [");
        sb2.append(AbstractC20817s.f66110e);
        sb2.append("] [");
        HashSet hashSet = AbstractC19798y.f62791a;
        synchronized (AbstractC19798y.class) {
            str = AbstractC19798y.f62792b;
        }
        sb2.append(str);
        sb2.append("]");
        AbstractC20800b.m21327o("ExoPlayerImpl", sb2.toString());
        m2256q0();
        if (AbstractC20817s.f66106a < 21 && (audioTrack = this.f4074X0) != null) {
            audioTrack.release();
            this.f4074X0 = null;
        }
        this.f4061K0.m353w();
        this.f4063M0.getClass();
        this.f4064N0.getClass();
        C1552c c1552c = this.f4062L0;
        c1552c.f4277c = null;
        c1552c.m2382a();
        c1552c.m2383b(0);
        if (!this.f4099x0.m2326x()) {
            this.f4100y0.m10694e(10, new C0030P(12));
        }
        this.f4100y0.m10693d();
        this.f4097v0.f66101a.removeCallbacksAndMessages(null);
        InterfaceC5284d interfaceC5284d = this.f4057G0;
        C1868f c1868f = this.f4055E0;
        CopyOnWriteArrayList<C5283c> copyOnWriteArrayList = (CopyOnWriteArrayList) ((C5287g) interfaceC5284d).f17418b.f42001Y;
        for (C5283c c5283c : copyOnWriteArrayList) {
            if (c5283c.f17401b == c1868f) {
                c5283c.f17402c = true;
                copyOnWriteArrayList.remove(c5283c);
            }
        }
        C1547Z c1547z = this.f4087k1;
        if (c1547z.f4265p) {
            this.f4087k1 = c1547z.m2373a();
        }
        C1547Z c1547zM2378f = this.f4087k1.m2378f(1);
        this.f4087k1 = c1547zM2378f;
        C1547Z c1547zM2374b = c1547zM2378f.m2374b(c1547zM2378f.f4251b);
        this.f4087k1 = c1547zM2374b;
        c1547zM2374b.f4266q = c1547zM2374b.f4268s;
        this.f4087k1.f4267r = 0L;
        C1868f c1868f2 = this.f4055E0;
        C20815q c20815q = c1868f2.f5371t0;
        AbstractC20800b.m21321i(c20815q);
        c20815q.m21377c(new RunnableC0000A(c1868f2, i10));
        this.f4096u0.mo5538a();
        Surface surface = this.f4076Z0;
        if (surface != null) {
            surface.release();
            this.f4076Z0 = null;
        }
        int i11 = C20422c.f64594b;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m2248i0(InterfaceC19759I interfaceC19759I) {
        m2256q0();
        C10115d c10115d = this.f4100y0;
        c10115d.m10695f();
        CopyOnWriteArraySet<C20808j> copyOnWriteArraySet = (CopyOnWriteArraySet) c10115d.f29952f;
        for (C20808j c20808j : copyOnWriteArraySet) {
            if (c20808j.f66079a.equals(interfaceC19759I)) {
                c20808j.f66082d = true;
                if (c20808j.f66081c) {
                    c20808j.f66081c = false;
                    C19786m c19786mM367d = c20808j.f66080b.m367d();
                    ((InterfaceC20807i) c10115d.f29951e).mo394j(c20808j.f66079a, c19786mM367d);
                }
                copyOnWriteArraySet.remove(c20808j);
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m2249j0(int i10, Object obj, int i11) {
        for (AbstractC1554d abstractC1554d : this.f4095t0) {
            if (i10 == -1 || abstractC1554d.f4296Z == i10) {
                int iM2240Z = m2240Z(this.f4087k1);
                AbstractC19764N abstractC19764N = this.f4087k1.f4250a;
                int i12 = iM2240Z == -1 ? 0 : iM2240Z;
                C1532J c1532j = this.f4099x0;
                C1553c0 c1553c0 = new C1553c0(c1532j, abstractC1554d, abstractC19764N, i12, this.f4058H0, c1532j.f4163v0);
                AbstractC20800b.m21320h(!c1553c0.f4289g);
                c1553c0.f4286d = i11;
                AbstractC20800b.m21320h(!c1553c0.f4289g);
                c1553c0.f4287e = obj;
                c1553c0.m2387c();
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m2250k0(boolean z6) {
        m2256q0();
        int iM2384c = this.f4062L0.m2384c(m2242b0(), z6);
        m2253n0(iM2384c, iM2384c == -1 ? 2 : 1, z6);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m2251l0(Surface surface) {
        boolean z6;
        ArrayList arrayList = new ArrayList();
        for (AbstractC1554d abstractC1554d : this.f4095t0) {
            if (abstractC1554d.f4296Z == 2) {
                int iM2240Z = m2240Z(this.f4087k1);
                AbstractC19764N abstractC19764N = this.f4087k1.f4250a;
                int i10 = iM2240Z == -1 ? 0 : iM2240Z;
                C1532J c1532j = this.f4099x0;
                C1553c0 c1553c0 = new C1553c0(c1532j, abstractC1554d, abstractC19764N, i10, this.f4058H0, c1532j.f4163v0);
                AbstractC20800b.m21320h(!c1553c0.f4289g);
                c1553c0.f4286d = 1;
                AbstractC20800b.m21320h(!c1553c0.f4289g);
                c1553c0.f4287e = surface;
                c1553c0.m2387c();
                arrayList.add(c1553c0);
            }
        }
        Surface surface2 = this.f4075Y0;
        if (surface2 == null || surface2 == surface) {
            z6 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C1553c0) it.next()).m2385a(this.f4065O0);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z6 = true;
            }
            z6 = false;
            Surface surface3 = this.f4075Y0;
            Surface surface4 = this.f4076Z0;
            if (surface3 == surface4) {
                surface4.release();
                this.f4076Z0 = null;
            }
        }
        this.f4075Y0 = surface;
        if (z6) {
            m2252m0(new C1567l(2, 1003, new C0644w("Detaching surface timed out.")));
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m2252m0(C1567l c1567l) {
        C1547Z c1547z = this.f4087k1;
        C1547Z c1547zM2374b = c1547z.m2374b(c1547z.f4251b);
        c1547zM2374b.f4266q = c1547zM2374b.f4268s;
        c1547zM2374b.f4267r = 0L;
        C1547Z c1547zM2378f = c1547zM2374b.m2378f(1);
        if (c1567l != null) {
            c1547zM2378f = c1547zM2378f.m2377e(c1567l);
        }
        C1547Z c1547z2 = c1547zM2378f;
        this.f4066P0++;
        C20815q c20815q = this.f4099x0.f4161t0;
        c20815q.getClass();
        C20814p c20814pM21375b = C20815q.m21375b();
        c20814pM21375b.f66099a = c20815q.f66101a.obtainMessage(6);
        c20814pM21375b.m21374b();
        m2254o0(c1547z2, 0, false, 5, -9223372036854775807L, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX INFO: renamed from: n0 */
    public final void m2253n0(int i10, int i11, boolean z6) {
        ?? r13 = (!z6 || i10 == -1) ? 0 : 1;
        int i12 = i10 == 0 ? 1 : 0;
        C1547Z c1547z = this.f4087k1;
        if (c1547z.f4261l == r13 && c1547z.f4263n == i12 && c1547z.f4262m == i11) {
            return;
        }
        this.f4066P0++;
        C1547Z c1547z2 = this.f4087k1;
        boolean z10 = c1547z2.f4265p;
        C1547Z c1547zM2373a = c1547z2;
        if (z10) {
            c1547zM2373a = c1547z2.m2373a();
        }
        C1547Z c1547zM2376d = c1547zM2373a.m2376d(i11, i12, r13);
        int i13 = (i12 << 4) | i11;
        C20815q c20815q = this.f4099x0.f4161t0;
        c20815q.getClass();
        C20814p c20814pM21375b = C20815q.m21375b();
        c20814pM21375b.f66099a = c20815q.f66101a.obtainMessage(1, r13, i13);
        c20814pM21375b.m21374b();
        m2254o0(c1547zM2376d, 0, false, 5, -9223372036854775807L, -1);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m2254o0(final C1547Z c1547z, int i10, boolean z6, int i11, long j10, int i12) {
        Pair pair;
        int i13;
        C19797x c19797x;
        int iMo2418k;
        boolean z10;
        int iMo2415e;
        int i14;
        int i15;
        boolean z11;
        int i16;
        Object obj;
        C19797x c19797x2;
        Object obj2;
        int i17;
        long j11;
        long j12;
        long jM2231c0;
        long jM2231c1;
        Object obj3;
        C19797x c19797x3;
        Object obj4;
        int i18;
        int i19 = 1;
        C1547Z c1547z2 = this.f4087k1;
        this.f4087k1 = c1547z;
        boolean zEquals = c1547z2.f4250a.equals(c1547z.f4250a);
        AbstractC19764N abstractC19764N = c1547z2.f4250a;
        AbstractC19764N abstractC19764N2 = c1547z.f4250a;
        if (abstractC19764N2.m20728p() && abstractC19764N.m20728p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (abstractC19764N2.m20728p() != abstractC19764N.m20728p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            C4253y c4253y = c1547z2.f4251b;
            Object obj5 = c4253y.f13895a;
            C19762L c19762l = this.f4051A0;
            int i20 = abstractC19764N.mo2416g(obj5, c19762l).f62579c;
            C19763M c19763m = (C19763M) this.f11539Z;
            Object obj6 = abstractC19764N.mo2411m(i20, c19763m, 0L).f62586a;
            C4253y c4253y2 = c1547z.f4251b;
            if (obj6.equals(abstractC19764N2.mo2411m(abstractC19764N2.mo2416g(c4253y2.f13895a, c19762l).f62579c, c19763m, 0L).f62586a)) {
                pair = (z6 && i11 == 0 && c4253y.f13898d < c4253y2.f13898d) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
            } else {
                if (z6 && i11 == 0) {
                    i13 = 1;
                } else if (z6 && i11 == 1) {
                    i13 = 2;
                } else {
                    if (zEquals) {
                        throw new IllegalStateException();
                    }
                    i13 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i13));
            }
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            c19797x = c1547z.f4250a.m20728p() ? null : c1547z.f4250a.mo2411m(c1547z.f4250a.mo2416g(c1547z.f4251b.f13895a, this.f4051A0).f62579c, (C19763M) this.f11539Z, 0L).f62588c;
            this.f4086j1 = C19751A.f62530y;
        } else {
            c19797x = null;
        }
        if (zBooleanValue || !c1547z2.f4259j.equals(c1547z.f4259j)) {
            C19799z c19799zM20700a = this.f4086j1.m20700a();
            List list = c1547z.f4259j;
            for (int i21 = 0; i21 < list.size(); i21++) {
                C19753C c19753c = (C19753C) list.get(i21);
                int i22 = 0;
                while (true) {
                    InterfaceC19752B[] interfaceC19752BArr = c19753c.f62555Y;
                    if (i22 < interfaceC19752BArr.length) {
                        interfaceC19752BArr[i22].mo10752S(c19799zM20700a);
                        i22++;
                    }
                }
            }
            this.f4086j1 = new C19751A(c19799zM20700a);
        }
        C19751A c19751aM2232R = m2232R();
        boolean zEquals2 = c19751aM2232R.equals(this.f4073W0);
        this.f4073W0 = c19751aM2232R;
        boolean z12 = c1547z2.f4261l != c1547z.f4261l;
        boolean z13 = c1547z2.f4254e != c1547z.f4254e;
        if (z13 || z12) {
            m2255p0();
        }
        boolean z14 = c1547z2.f4256g != c1547z.f4256g;
        if (!zEquals) {
            this.f4100y0.m10692c(0, new C0041V(c1547z, i10, i19));
        }
        if (z6) {
            C19762L c19762l2 = new C19762L();
            if (c1547z2.f4250a.m20728p()) {
                i16 = i12;
                obj = null;
                c19797x2 = null;
                obj2 = null;
                i17 = -1;
            } else {
                Object obj7 = c1547z2.f4251b.f13895a;
                c1547z2.f4250a.mo2416g(obj7, c19762l2);
                int i23 = c19762l2.f62579c;
                int iMo2413b = c1547z2.f4250a.mo2413b(obj7);
                obj2 = obj7;
                obj = c1547z2.f4250a.mo2411m(i23, (C19763M) this.f11539Z, 0L).f62586a;
                c19797x2 = ((C19763M) this.f11539Z).f62588c;
                i16 = i23;
                i17 = iMo2413b;
            }
            if (i11 == 0) {
                if (c1547z2.f4251b.m5017b()) {
                    C4253y c4253y3 = c1547z2.f4251b;
                    jM2231c0 = c19762l2.m20714a(c4253y3.f13896b, c4253y3.f13897c);
                    jM2231c1 = m2231c0(c1547z2);
                } else {
                    if (c1547z2.f4251b.f13899e != -1) {
                        jM2231c0 = m2231c0(this.f4087k1);
                    } else {
                        j11 = c19762l2.f62581e;
                        j12 = c19762l2.f62580d;
                        jM2231c0 = j11 + j12;
                    }
                    jM2231c1 = jM2231c0;
                }
            } else if (c1547z2.f4251b.m5017b()) {
                jM2231c0 = c1547z2.f4268s;
                jM2231c1 = m2231c0(c1547z2);
            } else {
                j11 = c19762l2.f62581e;
                j12 = c1547z2.f4268s;
                jM2231c0 = j11 + j12;
                jM2231c1 = jM2231c0;
            }
            long jM21399M = AbstractC20817s.m21399M(jM2231c0);
            long jM21399M2 = AbstractC20817s.m21399M(jM2231c1);
            C4253y c4253y4 = c1547z2.f4251b;
            C19760J c19760j = new C19760J(obj, i16, c19797x2, obj2, i17, jM21399M, jM21399M2, c4253y4.f13896b, c4253y4.f13897c);
            int iM2236V = m2236V();
            if (this.f4087k1.f4250a.m20728p()) {
                obj3 = null;
                c19797x3 = null;
                obj4 = null;
                i18 = -1;
            } else {
                C1547Z c1547z3 = this.f4087k1;
                Object obj8 = c1547z3.f4251b.f13895a;
                c1547z3.f4250a.mo2416g(obj8, this.f4051A0);
                int iMo2413b2 = this.f4087k1.f4250a.mo2413b(obj8);
                AbstractC19764N abstractC19764N3 = this.f4087k1.f4250a;
                C19763M c19763m2 = (C19763M) this.f11539Z;
                i18 = iMo2413b2;
                obj3 = abstractC19764N3.mo2411m(iM2236V, c19763m2, 0L).f62586a;
                c19797x3 = c19763m2.f62588c;
                obj4 = obj8;
            }
            long jM21399M3 = AbstractC20817s.m21399M(j10);
            long jM21399M4 = this.f4087k1.f4251b.m5017b() ? AbstractC20817s.m21399M(m2231c0(this.f4087k1)) : jM21399M3;
            C4253y c4253y5 = this.f4087k1.f4251b;
            this.f4100y0.m10692c(11, new C0039U(i11, c19760j, new C19760J(obj3, iM2236V, c19797x3, obj4, i18, jM21399M3, jM21399M4, c4253y5.f13896b, c4253y5.f13897c)));
        } else {
            z13 = z13;
            z14 = z14;
        }
        if (zBooleanValue) {
            this.f4100y0.m10692c(1, new C0041V(c19797x, iIntValue, 2));
        }
        if (c1547z2.f4255f != c1547z.f4255f) {
            final int i24 = 7;
            this.f4100y0.m10692c(10, new InterfaceC20806h() { // from class: C3.s
                @Override // p1073w3.InterfaceC20806h
                public final void invoke(Object obj9) {
                    InterfaceC19759I interfaceC19759I = (InterfaceC19759I) obj9;
                    switch (i24) {
                        case 0:
                            C1547Z c1547z4 = c1547z;
                            boolean z15 = c1547z4.f4256g;
                            interfaceC19759I.getClass();
                            interfaceC19759I.mo2757e(c1547z4.f4256g);
                            break;
                        case 1:
                            C1547Z c1547z5 = c1547z;
                            interfaceC19759I.mo2773u(c1547z5.f4254e, c1547z5.f4261l);
                            break;
                        case 2:
                            interfaceC19759I.mo2760h(c1547z.f4254e);
                            break;
                        case 3:
                            C1547Z c1547z6 = c1547z;
                            interfaceC19759I.mo2758f(c1547z6.f4262m, c1547z6.f4261l);
                            break;
                        case 4:
                            interfaceC19759I.mo2753a(c1547z.f4263n);
                            break;
                        case 5:
                            interfaceC19759I.mo2776x(c1547z.m2381j());
                            break;
                        case 6:
                            interfaceC19759I.mo2766n(c1547z.f4264o);
                            break;
                        case 7:
                            interfaceC19759I.mo2769q(c1547z.f4255f);
                            break;
                        case 8:
                            interfaceC19759I.mo2761i(c1547z.f4255f);
                            break;
                        default:
                            interfaceC19759I.mo2768p(c1547z.f4258i.f16099d);
                            break;
                    }
                }
            });
            if (c1547z.f4255f != null) {
                final int i25 = 8;
                this.f4100y0.m10692c(10, new InterfaceC20806h() { // from class: C3.s
                    @Override // p1073w3.InterfaceC20806h
                    public final void invoke(Object obj9) {
                        InterfaceC19759I interfaceC19759I = (InterfaceC19759I) obj9;
                        switch (i25) {
                            case 0:
                                C1547Z c1547z4 = c1547z;
                                boolean z15 = c1547z4.f4256g;
                                interfaceC19759I.getClass();
                                interfaceC19759I.mo2757e(c1547z4.f4256g);
                                break;
                            case 1:
                                C1547Z c1547z5 = c1547z;
                                interfaceC19759I.mo2773u(c1547z5.f4254e, c1547z5.f4261l);
                                break;
                            case 2:
                                interfaceC19759I.mo2760h(c1547z.f4254e);
                                break;
                            case 3:
                                C1547Z c1547z6 = c1547z;
                                interfaceC19759I.mo2758f(c1547z6.f4262m, c1547z6.f4261l);
                                break;
                            case 4:
                                interfaceC19759I.mo2753a(c1547z.f4263n);
                                break;
                            case 5:
                                interfaceC19759I.mo2776x(c1547z.m2381j());
                                break;
                            case 6:
                                interfaceC19759I.mo2766n(c1547z.f4264o);
                                break;
                            case 7:
                                interfaceC19759I.mo2769q(c1547z.f4255f);
                                break;
                            case 8:
                                interfaceC19759I.mo2761i(c1547z.f4255f);
                                break;
                            default:
                                interfaceC19759I.mo2768p(c1547z.f4258i.f16099d);
                                break;
                        }
                    }
                });
            }
        }
        C4932s c4932s = c1547z2.f4258i;
        C4932s c4932s2 = c1547z.f4258i;
        if (c4932s != c4932s2) {
            AbstractC4931r abstractC4931r = this.f4096u0;
            C1904b c1904b = c4932s2.f16100e;
            abstractC4931r.getClass();
            final int i26 = 9;
            this.f4100y0.m10692c(2, new InterfaceC20806h() { // from class: C3.s
                @Override // p1073w3.InterfaceC20806h
                public final void invoke(Object obj9) {
                    InterfaceC19759I interfaceC19759I = (InterfaceC19759I) obj9;
                    switch (i26) {
                        case 0:
                            C1547Z c1547z4 = c1547z;
                            boolean z15 = c1547z4.f4256g;
                            interfaceC19759I.getClass();
                            interfaceC19759I.mo2757e(c1547z4.f4256g);
                            break;
                        case 1:
                            C1547Z c1547z5 = c1547z;
                            interfaceC19759I.mo2773u(c1547z5.f4254e, c1547z5.f4261l);
                            break;
                        case 2:
                            interfaceC19759I.mo2760h(c1547z.f4254e);
                            break;
                        case 3:
                            C1547Z c1547z6 = c1547z;
                            interfaceC19759I.mo2758f(c1547z6.f4262m, c1547z6.f4261l);
                            break;
                        case 4:
                            interfaceC19759I.mo2753a(c1547z.f4263n);
                            break;
                        case 5:
                            interfaceC19759I.mo2776x(c1547z.m2381j());
                            break;
                        case 6:
                            interfaceC19759I.mo2766n(c1547z.f4264o);
                            break;
                        case 7:
                            interfaceC19759I.mo2769q(c1547z.f4255f);
                            break;
                        case 8:
                            interfaceC19759I.mo2761i(c1547z.f4255f);
                            break;
                        default:
                            interfaceC19759I.mo2768p(c1547z.f4258i.f16099d);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.f4100y0.m10692c(14, new C0072l(this.f4073W0, 11));
        }
        if (z14) {
            final int i27 = 0;
            this.f4100y0.m10692c(3, new InterfaceC20806h() { // from class: C3.s
                @Override // p1073w3.InterfaceC20806h
                public final void invoke(Object obj9) {
                    InterfaceC19759I interfaceC19759I = (InterfaceC19759I) obj9;
                    switch (i27) {
                        case 0:
                            C1547Z c1547z4 = c1547z;
                            boolean z15 = c1547z4.f4256g;
                            interfaceC19759I.getClass();
                            interfaceC19759I.mo2757e(c1547z4.f4256g);
                            break;
                        case 1:
                            C1547Z c1547z5 = c1547z;
                            interfaceC19759I.mo2773u(c1547z5.f4254e, c1547z5.f4261l);
                            break;
                        case 2:
                            interfaceC19759I.mo2760h(c1547z.f4254e);
                            break;
                        case 3:
                            C1547Z c1547z6 = c1547z;
                            interfaceC19759I.mo2758f(c1547z6.f4262m, c1547z6.f4261l);
                            break;
                        case 4:
                            interfaceC19759I.mo2753a(c1547z.f4263n);
                            break;
                        case 5:
                            interfaceC19759I.mo2776x(c1547z.m2381j());
                            break;
                        case 6:
                            interfaceC19759I.mo2766n(c1547z.f4264o);
                            break;
                        case 7:
                            interfaceC19759I.mo2769q(c1547z.f4255f);
                            break;
                        case 8:
                            interfaceC19759I.mo2761i(c1547z.f4255f);
                            break;
                        default:
                            interfaceC19759I.mo2768p(c1547z.f4258i.f16099d);
                            break;
                    }
                }
            });
        }
        if (z13 || z12) {
            final int i28 = 1;
            this.f4100y0.m10692c(-1, new InterfaceC20806h() { // from class: C3.s
                @Override // p1073w3.InterfaceC20806h
                public final void invoke(Object obj9) {
                    InterfaceC19759I interfaceC19759I = (InterfaceC19759I) obj9;
                    switch (i28) {
                        case 0:
                            C1547Z c1547z4 = c1547z;
                            boolean z15 = c1547z4.f4256g;
                            interfaceC19759I.getClass();
                            interfaceC19759I.mo2757e(c1547z4.f4256g);
                            break;
                        case 1:
                            C1547Z c1547z5 = c1547z;
                            interfaceC19759I.mo2773u(c1547z5.f4254e, c1547z5.f4261l);
                            break;
                        case 2:
                            interfaceC19759I.mo2760h(c1547z.f4254e);
                            break;
                        case 3:
                            C1547Z c1547z6 = c1547z;
                            interfaceC19759I.mo2758f(c1547z6.f4262m, c1547z6.f4261l);
                            break;
                        case 4:
                            interfaceC19759I.mo2753a(c1547z.f4263n);
                            break;
                        case 5:
                            interfaceC19759I.mo2776x(c1547z.m2381j());
                            break;
                        case 6:
                            interfaceC19759I.mo2766n(c1547z.f4264o);
                            break;
                        case 7:
                            interfaceC19759I.mo2769q(c1547z.f4255f);
                            break;
                        case 8:
                            interfaceC19759I.mo2761i(c1547z.f4255f);
                            break;
                        default:
                            interfaceC19759I.mo2768p(c1547z.f4258i.f16099d);
                            break;
                    }
                }
            });
        }
        if (z13) {
            final int i29 = 2;
            this.f4100y0.m10692c(4, new InterfaceC20806h() { // from class: C3.s
                @Override // p1073w3.InterfaceC20806h
                public final void invoke(Object obj9) {
                    InterfaceC19759I interfaceC19759I = (InterfaceC19759I) obj9;
                    switch (i29) {
                        case 0:
                            C1547Z c1547z4 = c1547z;
                            boolean z15 = c1547z4.f4256g;
                            interfaceC19759I.getClass();
                            interfaceC19759I.mo2757e(c1547z4.f4256g);
                            break;
                        case 1:
                            C1547Z c1547z5 = c1547z;
                            interfaceC19759I.mo2773u(c1547z5.f4254e, c1547z5.f4261l);
                            break;
                        case 2:
                            interfaceC19759I.mo2760h(c1547z.f4254e);
                            break;
                        case 3:
                            C1547Z c1547z6 = c1547z;
                            interfaceC19759I.mo2758f(c1547z6.f4262m, c1547z6.f4261l);
                            break;
                        case 4:
                            interfaceC19759I.mo2753a(c1547z.f4263n);
                            break;
                        case 5:
                            interfaceC19759I.mo2776x(c1547z.m2381j());
                            break;
                        case 6:
                            interfaceC19759I.mo2766n(c1547z.f4264o);
                            break;
                        case 7:
                            interfaceC19759I.mo2769q(c1547z.f4255f);
                            break;
                        case 8:
                            interfaceC19759I.mo2761i(c1547z.f4255f);
                            break;
                        default:
                            interfaceC19759I.mo2768p(c1547z.f4258i.f16099d);
                            break;
                    }
                }
            });
        }
        if (z12 || c1547z2.f4262m != c1547z.f4262m) {
            final int i30 = 3;
            this.f4100y0.m10692c(5, new InterfaceC20806h() { // from class: C3.s
                @Override // p1073w3.InterfaceC20806h
                public final void invoke(Object obj9) {
                    InterfaceC19759I interfaceC19759I = (InterfaceC19759I) obj9;
                    switch (i30) {
                        case 0:
                            C1547Z c1547z4 = c1547z;
                            boolean z15 = c1547z4.f4256g;
                            interfaceC19759I.getClass();
                            interfaceC19759I.mo2757e(c1547z4.f4256g);
                            break;
                        case 1:
                            C1547Z c1547z5 = c1547z;
                            interfaceC19759I.mo2773u(c1547z5.f4254e, c1547z5.f4261l);
                            break;
                        case 2:
                            interfaceC19759I.mo2760h(c1547z.f4254e);
                            break;
                        case 3:
                            C1547Z c1547z6 = c1547z;
                            interfaceC19759I.mo2758f(c1547z6.f4262m, c1547z6.f4261l);
                            break;
                        case 4:
                            interfaceC19759I.mo2753a(c1547z.f4263n);
                            break;
                        case 5:
                            interfaceC19759I.mo2776x(c1547z.m2381j());
                            break;
                        case 6:
                            interfaceC19759I.mo2766n(c1547z.f4264o);
                            break;
                        case 7:
                            interfaceC19759I.mo2769q(c1547z.f4255f);
                            break;
                        case 8:
                            interfaceC19759I.mo2761i(c1547z.f4255f);
                            break;
                        default:
                            interfaceC19759I.mo2768p(c1547z.f4258i.f16099d);
                            break;
                    }
                }
            });
        }
        if (c1547z2.f4263n != c1547z.f4263n) {
            final int i31 = 4;
            this.f4100y0.m10692c(6, new InterfaceC20806h() { // from class: C3.s
                @Override // p1073w3.InterfaceC20806h
                public final void invoke(Object obj9) {
                    InterfaceC19759I interfaceC19759I = (InterfaceC19759I) obj9;
                    switch (i31) {
                        case 0:
                            C1547Z c1547z4 = c1547z;
                            boolean z15 = c1547z4.f4256g;
                            interfaceC19759I.getClass();
                            interfaceC19759I.mo2757e(c1547z4.f4256g);
                            break;
                        case 1:
                            C1547Z c1547z5 = c1547z;
                            interfaceC19759I.mo2773u(c1547z5.f4254e, c1547z5.f4261l);
                            break;
                        case 2:
                            interfaceC19759I.mo2760h(c1547z.f4254e);
                            break;
                        case 3:
                            C1547Z c1547z6 = c1547z;
                            interfaceC19759I.mo2758f(c1547z6.f4262m, c1547z6.f4261l);
                            break;
                        case 4:
                            interfaceC19759I.mo2753a(c1547z.f4263n);
                            break;
                        case 5:
                            interfaceC19759I.mo2776x(c1547z.m2381j());
                            break;
                        case 6:
                            interfaceC19759I.mo2766n(c1547z.f4264o);
                            break;
                        case 7:
                            interfaceC19759I.mo2769q(c1547z.f4255f);
                            break;
                        case 8:
                            interfaceC19759I.mo2761i(c1547z.f4255f);
                            break;
                        default:
                            interfaceC19759I.mo2768p(c1547z.f4258i.f16099d);
                            break;
                    }
                }
            });
        }
        if (c1547z2.m2381j() != c1547z.m2381j()) {
            final int i32 = 5;
            this.f4100y0.m10692c(7, new InterfaceC20806h() { // from class: C3.s
                @Override // p1073w3.InterfaceC20806h
                public final void invoke(Object obj9) {
                    InterfaceC19759I interfaceC19759I = (InterfaceC19759I) obj9;
                    switch (i32) {
                        case 0:
                            C1547Z c1547z4 = c1547z;
                            boolean z15 = c1547z4.f4256g;
                            interfaceC19759I.getClass();
                            interfaceC19759I.mo2757e(c1547z4.f4256g);
                            break;
                        case 1:
                            C1547Z c1547z5 = c1547z;
                            interfaceC19759I.mo2773u(c1547z5.f4254e, c1547z5.f4261l);
                            break;
                        case 2:
                            interfaceC19759I.mo2760h(c1547z.f4254e);
                            break;
                        case 3:
                            C1547Z c1547z6 = c1547z;
                            interfaceC19759I.mo2758f(c1547z6.f4262m, c1547z6.f4261l);
                            break;
                        case 4:
                            interfaceC19759I.mo2753a(c1547z.f4263n);
                            break;
                        case 5:
                            interfaceC19759I.mo2776x(c1547z.m2381j());
                            break;
                        case 6:
                            interfaceC19759I.mo2766n(c1547z.f4264o);
                            break;
                        case 7:
                            interfaceC19759I.mo2769q(c1547z.f4255f);
                            break;
                        case 8:
                            interfaceC19759I.mo2761i(c1547z.f4255f);
                            break;
                        default:
                            interfaceC19759I.mo2768p(c1547z.f4258i.f16099d);
                            break;
                    }
                }
            });
        }
        if (!c1547z2.f4264o.equals(c1547z.f4264o)) {
            final int i33 = 6;
            this.f4100y0.m10692c(12, new InterfaceC20806h() { // from class: C3.s
                @Override // p1073w3.InterfaceC20806h
                public final void invoke(Object obj9) {
                    InterfaceC19759I interfaceC19759I = (InterfaceC19759I) obj9;
                    switch (i33) {
                        case 0:
                            C1547Z c1547z4 = c1547z;
                            boolean z15 = c1547z4.f4256g;
                            interfaceC19759I.getClass();
                            interfaceC19759I.mo2757e(c1547z4.f4256g);
                            break;
                        case 1:
                            C1547Z c1547z5 = c1547z;
                            interfaceC19759I.mo2773u(c1547z5.f4254e, c1547z5.f4261l);
                            break;
                        case 2:
                            interfaceC19759I.mo2760h(c1547z.f4254e);
                            break;
                        case 3:
                            C1547Z c1547z6 = c1547z;
                            interfaceC19759I.mo2758f(c1547z6.f4262m, c1547z6.f4261l);
                            break;
                        case 4:
                            interfaceC19759I.mo2753a(c1547z.f4263n);
                            break;
                        case 5:
                            interfaceC19759I.mo2776x(c1547z.m2381j());
                            break;
                        case 6:
                            interfaceC19759I.mo2766n(c1547z.f4264o);
                            break;
                        case 7:
                            interfaceC19759I.mo2769q(c1547z.f4255f);
                            break;
                        case 8:
                            interfaceC19759I.mo2761i(c1547z.f4255f);
                            break;
                        default:
                            interfaceC19759I.mo2768p(c1547z.f4258i.f16099d);
                            break;
                    }
                }
            });
        }
        C19758H c19758h = this.f4072V0;
        int i34 = AbstractC20817s.f66106a;
        C1526D c1526d = (C1526D) this.f4094s0;
        boolean zM2243d0 = c1526d.m2243d0();
        AbstractC19764N abstractC19764NM2239Y = c1526d.m2239Y();
        boolean zM20728p = abstractC19764NM2239Y.m20728p();
        C19763M c19763m3 = (C19763M) c1526d.f11539Z;
        boolean z15 = !zM20728p && abstractC19764NM2239Y.mo2411m(c1526d.m2236V(), c19763m3, 0L).f62592g;
        AbstractC19764N abstractC19764NM2239Y2 = c1526d.m2239Y();
        if (abstractC19764NM2239Y2.m20728p()) {
            iMo2418k = -1;
        } else {
            int iM2236V2 = c1526d.m2236V();
            c1526d.m2256q0();
            c1526d.m2256q0();
            iMo2418k = abstractC19764NM2239Y2.mo2418k(iM2236V2, 0, false);
        }
        boolean z16 = iMo2418k != -1;
        AbstractC19764N abstractC19764NM2239Y3 = c1526d.m2239Y();
        if (abstractC19764NM2239Y3.m20728p()) {
            iMo2415e = -1;
            i14 = -1;
            z10 = false;
        } else {
            int iM2236V3 = c1526d.m2236V();
            c1526d.m2256q0();
            c1526d.m2256q0();
            z10 = false;
            iMo2415e = abstractC19764NM2239Y3.mo2415e(iM2236V3, 0, false);
            i14 = -1;
        }
        boolean z17 = iMo2415e != i14 ? true : z10;
        AbstractC19764N abstractC19764NM2239Y4 = c1526d.m2239Y();
        boolean z18 = (abstractC19764NM2239Y4.m20728p() || !abstractC19764NM2239Y4.mo2411m(c1526d.m2236V(), c19763m3, 0L).m20722a()) ? z10 : true;
        AbstractC19764N abstractC19764NM2239Y5 = c1526d.m2239Y();
        boolean z19 = !abstractC19764NM2239Y5.m20728p() && abstractC19764NM2239Y5.mo2411m(c1526d.m2236V(), c19763m3, 0L).f62593h;
        boolean zM20728p2 = c1526d.m2239Y().m20728p();
        C15333a c15333a = new C15333a(7);
        C19786m c19786m = this.f4091p0.f62567a;
        C0095w0 c0095w0 = (C0095w0) c15333a.f47885Y;
        c0095w0.getClass();
        for (int i35 = 0; i35 < c19786m.f62693a.size(); i35++) {
            c0095w0.m366c(c19786m.m20745a(i35));
        }
        boolean z20 = !zM2243d0;
        c15333a.m16550a(4, z20);
        c15333a.m16550a(5, z15 && !zM2243d0);
        c15333a.m16550a(6, z16 && !zM2243d0);
        c15333a.m16550a(7, !zM20728p2 && (z16 || !z18 || z15) && !zM2243d0);
        c15333a.m16550a(8, z17 && !zM2243d0);
        c15333a.m16550a(9, !zM20728p2 && (z17 || (z18 && z19)) && !zM2243d0);
        c15333a.m16550a(10, z20);
        c15333a.m16550a(11, z15 && !zM2243d0);
        if (!z15 || zM2243d0) {
            i15 = 12;
            z11 = false;
        } else {
            z11 = true;
            i15 = 12;
        }
        c15333a.m16550a(i15, z11);
        C19758H c19758h2 = new C19758H(((C0095w0) c15333a.f47885Y).m367d());
        this.f4072V0 = c19758h2;
        if (!c19758h2.equals(c19758h)) {
            this.f4100y0.m10692c(13, new C1576u(this));
        }
        this.f4100y0.m10691b();
        if (c1547z2.f4265p != c1547z.f4265p) {
            Iterator it = this.f4101z0.iterator();
            while (it.hasNext()) {
                ((SurfaceHolderCallbackC1523A) it.next()).f4046Y.m2255p0();
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m2255p0() {
        int iM2242b0 = m2242b0();
        C7591u c7591u = this.f4064N0;
        C7102a c7102a = this.f4063M0;
        if (iM2242b0 != 1) {
            if (iM2242b0 == 2 || iM2242b0 == 3) {
                m2256q0();
                boolean z6 = this.f4087k1.f4265p;
                m2241a0();
                c7102a.getClass();
                m2241a0();
                c7591u.getClass();
                return;
            }
            if (iM2242b0 != 4) {
                throw new IllegalStateException();
            }
        }
        c7102a.getClass();
        c7591u.getClass();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m2256q0() {
        C0376k c0376k = this.f4092q0;
        synchronized (c0376k) {
            boolean z6 = false;
            while (!c0376k.f1278Z) {
                try {
                    c0376k.wait();
                } catch (InterruptedException unused) {
                    z6 = true;
                }
            }
            if (z6) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f4056F0.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f4056F0.getThread().getName();
            int i10 = AbstractC20817s.f66106a;
            Locale locale = Locale.US;
            String strM20d = AbstractC0010F.m20d("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f4083g1) {
                throw new IllegalStateException(strM20d);
            }
            AbstractC20800b.m21333u("ExoPlayerImpl", strM20d, this.f4084h1 ? null : new IllegalStateException());
            this.f4084h1 = true;
        }
    }
}
