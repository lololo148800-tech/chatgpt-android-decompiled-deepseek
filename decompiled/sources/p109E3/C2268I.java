package p109E3;

import android.content.Context;
import android.content.IntentFilter;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import bb.AbstractC11278C;
import bb.AbstractC11320m;
import bb.C11276A;
import bb.C11294T;
import bb.C11333z;
import com.revenuecat.purchases.common.UtilsKt;
import io.sentry.internal.debugmeta.C15384c;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import livekit.org.webrtc.MediaStreamTrack;
import p001A.C0042V0;
import p001A.C0072l;
import p001A.RunnableC0098y;
import p007A5.C0376k;
import p057C3.C1527E;
import p083D3.C1875m;
import p084D4.C1918i;
import p1016t3.AbstractC19754D;
import p1016t3.C19757G;
import p1016t3.C19778e;
import p1016t3.C19779f;
import p1016t3.C19788o;
import p1031u3.C20098a;
import p1031u3.C20099b;
import p1031u3.C20100c;
import p1031u3.C20106i;
import p1031u3.InterfaceC20101d;
import p1031u3.InterfaceC20102e;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1139z0.C21585H;
import p372P3.AbstractC6320b;
import p372P3.C6318J;
import p468T2.ThreadFactoryC7209a;
import p523V9.AbstractC8135l5;
import p571X9.AbstractC9306j0;
import p703db.AbstractC13058c;
import p720e6.C13287b;
import p720e6.C13288c;

/* JADX INFO: renamed from: E3.I */
/* JADX INFO: loaded from: classes.dex */
public final class C2268I implements InterfaceC2294r {

    /* JADX INFO: renamed from: m0 */
    public static final Object f6938m0 = new Object();

    /* JADX INFO: renamed from: n0 */
    public static ExecutorService f6939n0;

    /* JADX INFO: renamed from: o0 */
    public static int f6940o0;

    /* JADX INFO: renamed from: A */
    public C19778e f6941A;

    /* JADX INFO: renamed from: B */
    public C2262C f6942B;

    /* JADX INFO: renamed from: C */
    public C2262C f6943C;

    /* JADX INFO: renamed from: D */
    public C19757G f6944D;

    /* JADX INFO: renamed from: E */
    public boolean f6945E;

    /* JADX INFO: renamed from: F */
    public ByteBuffer f6946F;

    /* JADX INFO: renamed from: G */
    public int f6947G;

    /* JADX INFO: renamed from: H */
    public long f6948H;

    /* JADX INFO: renamed from: I */
    public long f6949I;

    /* JADX INFO: renamed from: J */
    public long f6950J;

    /* JADX INFO: renamed from: K */
    public long f6951K;

    /* JADX INFO: renamed from: L */
    public int f6952L;

    /* JADX INFO: renamed from: M */
    public boolean f6953M;

    /* JADX INFO: renamed from: N */
    public boolean f6954N;

    /* JADX INFO: renamed from: O */
    public long f6955O;

    /* JADX INFO: renamed from: P */
    public float f6956P;

    /* JADX INFO: renamed from: Q */
    public ByteBuffer f6957Q;

    /* JADX INFO: renamed from: R */
    public int f6958R;

    /* JADX INFO: renamed from: S */
    public ByteBuffer f6959S;

    /* JADX INFO: renamed from: T */
    public byte[] f6960T;

    /* JADX INFO: renamed from: U */
    public int f6961U;

    /* JADX INFO: renamed from: V */
    public boolean f6962V;

    /* JADX INFO: renamed from: W */
    public boolean f6963W;

    /* JADX INFO: renamed from: X */
    public boolean f6964X;

    /* JADX INFO: renamed from: Y */
    public boolean f6965Y;

    /* JADX INFO: renamed from: Z */
    public boolean f6966Z;

    /* JADX INFO: renamed from: a */
    public final Context f6967a;

    /* JADX INFO: renamed from: a0 */
    public int f6968a0;

    /* JADX INFO: renamed from: b */
    public final InterfaceC20102e f6969b;

    /* JADX INFO: renamed from: b0 */
    public C19779f f6970b0;

    /* JADX INFO: renamed from: c */
    public final boolean f6971c;

    /* JADX INFO: renamed from: c0 */
    public C2287k f6972c0;

    /* JADX INFO: renamed from: d */
    public final C2298v f6973d;

    /* JADX INFO: renamed from: d0 */
    public boolean f6974d0;

    /* JADX INFO: renamed from: e */
    public final C2276Q f6975e;

    /* JADX INFO: renamed from: e0 */
    public long f6976e0;

    /* JADX INFO: renamed from: f */
    public final C11294T f6977f;

    /* JADX INFO: renamed from: f0 */
    public long f6978f0;

    /* JADX INFO: renamed from: g */
    public final C11294T f6979g;

    /* JADX INFO: renamed from: g0 */
    public boolean f6980g0;

    /* JADX INFO: renamed from: h */
    public final C0376k f6981h;

    /* JADX INFO: renamed from: h0 */
    public boolean f6982h0;

    /* JADX INFO: renamed from: i */
    public final C2297u f6983i;

    /* JADX INFO: renamed from: i0 */
    public Looper f6984i0;

    /* JADX INFO: renamed from: j */
    public final ArrayDeque f6985j;

    /* JADX INFO: renamed from: j0 */
    public long f6986j0;

    /* JADX INFO: renamed from: k */
    public final boolean f6987k;

    /* JADX INFO: renamed from: k0 */
    public long f6988k0;

    /* JADX INFO: renamed from: l */
    public int f6989l;

    /* JADX INFO: renamed from: l0 */
    public Handler f6990l0;

    /* JADX INFO: renamed from: m */
    public C2267H f6991m;

    /* JADX INFO: renamed from: n */
    public final C1918i f6992n;

    /* JADX INFO: renamed from: o */
    public final C1918i f6993o;

    /* JADX INFO: renamed from: p */
    public final C2269J f6994p;

    /* JADX INFO: renamed from: q */
    public final C15384c f6995q;

    /* JADX INFO: renamed from: r */
    public C1875m f6996r;

    /* JADX INFO: renamed from: s */
    public C13288c f6997s;

    /* JADX INFO: renamed from: t */
    public C2261B f6998t;

    /* JADX INFO: renamed from: u */
    public C2261B f6999u;

    /* JADX INFO: renamed from: v */
    public C20098a f7000v;

    /* JADX INFO: renamed from: w */
    public AudioTrack f7001w;

    /* JADX INFO: renamed from: x */
    public C2281e f7002x;

    /* JADX INFO: renamed from: y */
    public C2286j f7003y;

    /* JADX INFO: renamed from: z */
    public C2264E f7004z;

    public C2268I(C0042V0 c0042v0) {
        C2281e c2281eM3373c;
        boolean z6 = false;
        Context context = (Context) c0042v0.f205Z;
        this.f6967a = context;
        C19778e c19778e = C19778e.f62665d;
        this.f6941A = c19778e;
        if (context != null) {
            C2281e c2281e = C2281e.f7051c;
            int i10 = AbstractC20817s.f66106a;
            c2281eM3373c = C2281e.m3373c(context, c19778e, null);
        } else {
            c2281eM3373c = (C2281e) c0042v0.f206o0;
        }
        this.f7002x = c2281eM3373c;
        this.f6969b = (InterfaceC20102e) c0042v0.f207p0;
        int i11 = AbstractC20817s.f66106a;
        this.f6971c = false;
        this.f6987k = false;
        this.f6989l = 0;
        this.f6994p = (C2269J) c0042v0.f208q0;
        C15384c c15384c = (C15384c) c0042v0.f209r0;
        c15384c.getClass();
        this.f6995q = c15384c;
        C0376k c0376k = new C0376k(13, z6);
        this.f6981h = c0376k;
        c0376k.m1015h();
        this.f6983i = new C2297u(new C13287b(this, 8));
        C2298v c2298v = new C2298v();
        this.f6973d = c2298v;
        C2276Q c2276q = new C2276Q();
        c2276q.f7044m = AbstractC20817s.f66111f;
        this.f6975e = c2276q;
        C20106i c20106i = new C20106i();
        C11276A c11276a = AbstractC11278C.f34162Z;
        Object[] objArr = {c20106i, c2298v, c2276q};
        AbstractC11320m.m12723b(3, objArr);
        this.f6977f = AbstractC11278C.m12689r(3, objArr);
        this.f6979g = AbstractC11278C.m12695y(new C2275P());
        this.f6956P = 1.0f;
        this.f6968a0 = 0;
        this.f6970b0 = new C19779f();
        C19757G c19757g = C19757G.f62563d;
        this.f6943C = new C2262C(c19757g, 0L, 0L);
        this.f6944D = c19757g;
        this.f6945E = false;
        this.f6985j = new ArrayDeque();
        this.f6992n = new C1918i(1);
        this.f6993o = new C1918i(1);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m3309m(AudioTrack audioTrack) {
        return AbstractC20817s.f66106a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX INFO: renamed from: a */
    public final void m3310a(long j10) {
        C19757G c19757gMo2433a;
        boolean zMo2437o;
        boolean zM3328t = m3328t();
        boolean z6 = this.f6971c;
        InterfaceC20102e interfaceC20102e = this.f6969b;
        if (zM3328t) {
            c19757gMo2433a = C19757G.f62563d;
        } else {
            if (this.f6974d0) {
                c19757gMo2433a = C19757G.f62563d;
            } else {
                C2261B c2261b = this.f6999u;
                if (c2261b.f6915c == 0) {
                    int i10 = c2261b.f6913a.f62731C;
                    if (z6) {
                        int i11 = AbstractC20817s.f66106a;
                        if (i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4) {
                            c19757gMo2433a = C19757G.f62563d;
                        }
                    }
                    c19757gMo2433a = interfaceC20102e.mo2433a(this.f6944D);
                } else {
                    c19757gMo2433a = C19757G.f62563d;
                }
            }
            this.f6944D = c19757gMo2433a;
        }
        C19757G c19757g = c19757gMo2433a;
        if (this.f6974d0) {
            zMo2437o = false;
        } else {
            C2261B c2261b2 = this.f6999u;
            if (c2261b2.f6915c == 0) {
                int i12 = c2261b2.f6913a.f62731C;
                if (z6) {
                    int i13 = AbstractC20817s.f66106a;
                    if (i12 == 21 || i12 == 1342177280 || i12 == 22 || i12 == 1610612736 || i12 == 4) {
                        zMo2437o = false;
                    }
                }
                zMo2437o = interfaceC20102e.mo2437o(this.f6945E);
            } else {
                zMo2437o = false;
            }
        }
        this.f6945E = zMo2437o;
        ArrayDeque arrayDeque = this.f6985j;
        long jMax = Math.max(0L, j10);
        C2261B c2261b3 = this.f6999u;
        arrayDeque.add(new C2262C(c19757g, jMax, AbstractC20817s.m21394H(c2261b3.f6917e, m3317h())));
        C20098a c20098a = this.f6999u.f6921i;
        this.f7000v = c20098a;
        c20098a.m20931b();
        C13288c c13288c = this.f6997s;
        if (c13288c != null) {
            boolean z10 = this.f6945E;
            C21585H c21585h = ((C2271L) c13288c.f42001Y).f7007R1;
            Handler handler = (Handler) c21585h.f68344Z;
            if (handler != null) {
                handler.post(new RunnableC0098y(c21585h, z10, 1));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x01ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x01cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:110:0x01df  */
    /* JADX WARN: Code duplicated, block: B:78:0x0178  */
    /* JADX WARN: Code duplicated, block: B:81:0x0188  */
    /* JADX WARN: Code duplicated, block: B:83:0x019b  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c2  */
    /* JADX INFO: renamed from: b */
    public final void m3311b(C19788o c19788o, int[] iArr) throws C2290n {
        C20098a c20098a;
        boolean z6;
        int iIntValue;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int iIntValue2;
        int iM21408i;
        int i14;
        int i15;
        int iM3330a;
        RoundingMode roundingMode;
        int i16;
        int i17;
        int iAbs;
        boolean z11;
        boolean z12;
        int[] iArr2;
        m3322n();
        boolean zEquals = "audio/raw".equals(c19788o.f62752m);
        boolean z13 = this.f6987k;
        String str = c19788o.f62752m;
        int i18 = c19788o.f62730B;
        int i19 = c19788o.f62729A;
        if (zEquals) {
            int i20 = c19788o.f62731C;
            AbstractC20800b.m21316d(AbstractC20817s.m21387A(i20));
            int iM21420u = AbstractC20817s.m21420u(i20, i19);
            C11333z c11333z = new C11333z(4);
            if (this.f6971c && (i20 == 21 || i20 == 1342177280 || i20 == 22 || i20 == 1610612736 || i20 == 4)) {
                c11333z.m12764d(this.f6979g);
            } else {
                c11333z.m12764d(this.f6977f);
                InterfaceC20101d[] interfaceC20101dArrMo2438q = this.f6969b.mo2438q();
                int length = interfaceC20101dArrMo2438q.length;
                AbstractC11320m.m12723b(length, interfaceC20101dArrMo2438q);
                c11333z.m12765f(c11333z.f34261b + length);
                System.arraycopy(interfaceC20101dArrMo2438q, 0, (Object[]) c11333z.f34260a, c11333z.f34261b, length);
                c11333z.f34261b += length;
            }
            C20098a c20098a2 = new C20098a(c11333z.m12768j());
            if (c20098a2.equals(this.f7000v)) {
                c20098a2 = this.f7000v;
            }
            int i21 = c19788o.f62732D;
            C2276Q c2276q = this.f6975e;
            c2276q.f7040i = i21;
            c2276q.f7041j = c19788o.f62733E;
            if (AbstractC20817s.f66106a < 21 && i19 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i22 = 0; i22 < 6; i22++) {
                    iArr2[i22] = i22;
                }
            } else {
                iArr2 = iArr;
            }
            this.f6973d.f7134i = iArr2;
            try {
                C20099b c20099bM20930a = c20098a2.m20930a(new C20099b(i18, i19, i20));
                int i23 = c20099bM20930a.f63643b;
                int iM21415p = AbstractC20817s.m21415p(i23);
                int i24 = c20099bM20930a.f63644c;
                int iM21420u2 = AbstractC20817s.m21420u(i24, i23);
                z6 = z13;
                z10 = false;
                iIntValue = i24;
                i12 = iM21420u;
                c20098a = c20098a2;
                iIntValue2 = iM21415p;
                i10 = c20099bM20930a.f63642a;
                i13 = iM21420u2;
                i11 = 0;
            } catch (C20100c e10) {
                throw new C2290n(e10, c19788o);
            }
        } else {
            C20098a c20098a3 = new C20098a(C11294T.f34185q0);
            C2288l c2288lM3314e = this.f6989l != 0 ? m3314e(c19788o) : C2288l.f7073d;
            if (this.f6989l == 0 || !c2288lM3314e.f7074a) {
                Pair pairM3374d = this.f7002x.m3374d(this.f6941A, c19788o);
                if (pairM3374d == null) {
                    throw new C2290n("Unable to configure passthrough for: " + c19788o, c19788o);
                }
                c20098a = c20098a3;
                z6 = z13;
                iIntValue = ((Integer) pairM3374d.first).intValue();
                z10 = false;
                i10 = i18;
                i11 = 2;
                i12 = -1;
                i13 = -1;
                iIntValue2 = ((Integer) pairM3374d.second).intValue();
            } else {
                str.getClass();
                int iM20703a = AbstractC19754D.m20703a(str, c19788o.f62749j);
                int iM21415p2 = AbstractC20817s.m21415p(i19);
                c20098a = c20098a3;
                z10 = c2288lM3314e.f7075b;
                iIntValue = iM20703a;
                i10 = i18;
                i11 = 1;
                i12 = -1;
                z6 = true;
                iIntValue2 = iM21415p2;
                i13 = -1;
            }
        }
        if (iIntValue == 0) {
            throw new C2290n("Invalid output encoding (mode=" + i11 + ") for: " + c19788o, c19788o);
        }
        if (iIntValue2 == 0) {
            throw new C2290n("Invalid output channel config (mode=" + i11 + ") for: " + c19788o, c19788o);
        }
        boolean zEquals2 = "audio/vnd.dts.hd;profile=lbr".equals(str);
        int i25 = c19788o.f62748i;
        if (zEquals2 && i25 == -1) {
            i25 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i10, iIntValue2, iIntValue);
        AbstractC20800b.m21320h(minBufferSize != -2);
        int i26 = i13 != -1 ? i13 : 1;
        double d10 = z6 ? 8.0d : 1.0d;
        this.f6994p.getClass();
        if (i11 == 0) {
            z6 = z6;
            z10 = z10;
            long j10 = i10;
            long j11 = i26;
            iM21408i = AbstractC20817s.m21408i(minBufferSize * 4, AbstractC8135l5.m8655c(((((long) 250000) * j10) * j11) / 1000000), AbstractC8135l5.m8655c(((((long) 750000) * j10) * j11) / 1000000));
        } else if (i11 == 1) {
            iM21408i = AbstractC8135l5.m8655c((((long) 50000000) * ((long) C2269J.m3330a(iIntValue))) / 1000000);
        } else {
            if (i11 != 2) {
                throw new IllegalArgumentException();
            }
            if (iIntValue == 5) {
                i15 = 500000;
            } else {
                if (iIntValue == 8) {
                    i15 = UtilsKt.MICROS_MULTIPLIER;
                } else {
                    i14 = -1;
                    i15 = 250000;
                }
                if (i25 != i14) {
                    roundingMode = RoundingMode.CEILING;
                    roundingMode.getClass();
                    iM3330a = i25 / 8;
                    i16 = i25 - (8 * iM3330a);
                    if (i16 != 0) {
                        i17 = ((i25 ^ 8) >> 31) | 1;
                        switch (AbstractC13058c.f41487a[roundingMode.ordinal()]) {
                            case 1:
                                if (i16 != 0) {
                                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                }
                                break;
                            case 2:
                                break;
                            case 3:
                                if (i17 < 0) {
                                    iM3330a += i17;
                                }
                                break;
                            case 4:
                                iM3330a += i17;
                                break;
                            case 5:
                                if (i17 > 0) {
                                    iM3330a += i17;
                                }
                                break;
                            case 6:
                            case 7:
                            case 8:
                                int iAbs2 = Math.abs(i16);
                                iAbs = iAbs2 - (Math.abs(8) - iAbs2);
                                if (iAbs == 0) {
                                    if (roundingMode == RoundingMode.HALF_UP) {
                                        iM3330a += i17;
                                    } else {
                                        if (roundingMode == RoundingMode.HALF_EVEN) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if ((iM3330a & 1) != 0) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (z11 & z12) {
                                            iM3330a += i17;
                                        }
                                    }
                                } else if (iAbs > 0) {
                                    iM3330a += i17;
                                }
                                break;
                            default:
                                throw new AssertionError();
                        }
                    }
                } else {
                    iM3330a = C2269J.m3330a(iIntValue);
                }
                iM21408i = AbstractC8135l5.m8655c((((long) i15) * ((long) iM3330a)) / 1000000);
            }
            i14 = -1;
            if (i25 != i14) {
                roundingMode = RoundingMode.CEILING;
                roundingMode.getClass();
                iM3330a = i25 / 8;
                i16 = i25 - (8 * iM3330a);
                if (i16 != 0) {
                    i17 = ((i25 ^ 8) >> 31) | 1;
                    switch (AbstractC13058c.f41487a[roundingMode.ordinal()]) {
                        case 1:
                            if (i16 != 0) {
                                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                            }
                            break;
                        case 2:
                            break;
                        case 3:
                            if (i17 < 0) {
                                iM3330a += i17;
                            }
                            break;
                        case 4:
                            iM3330a += i17;
                            break;
                        case 5:
                            if (i17 > 0) {
                                iM3330a += i17;
                            }
                            break;
                        case 6:
                        case 7:
                        case 8:
                            int iAbs3 = Math.abs(i16);
                            iAbs = iAbs3 - (Math.abs(8) - iAbs3);
                            if (iAbs == 0) {
                                if (roundingMode == RoundingMode.HALF_UP) {
                                    iM3330a += i17;
                                } else {
                                    if (roundingMode == RoundingMode.HALF_EVEN) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if ((iM3330a & 1) != 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z11 & z12) {
                                        iM3330a += i17;
                                    }
                                }
                            } else if (iAbs > 0) {
                                iM3330a += i17;
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
            } else {
                iM3330a = C2269J.m3330a(iIntValue);
            }
            iM21408i = AbstractC8135l5.m8655c((((long) i15) * ((long) iM3330a)) / 1000000);
        }
        int iMax = (((Math.max(minBufferSize, (int) (((double) iM21408i) * d10)) + i26) - 1) / i26) * i26;
        this.f6980g0 = false;
        C2261B c2261b = new C2261B(c19788o, i12, i11, i13, i10, iIntValue2, iIntValue, iMax, c20098a, z6, z10, this.f6974d0);
        if (m3321l()) {
            this.f6998t = c2261b;
        } else {
            this.f6999u = c2261b;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3312c() throws C2293q {
        if (!this.f7000v.m20934e()) {
            ByteBuffer byteBuffer = this.f6959S;
            if (byteBuffer == null) {
                return true;
            }
            m3329u(Long.MIN_VALUE, byteBuffer);
            return this.f6959S == null;
        }
        C20098a c20098a = this.f7000v;
        if (c20098a.m20934e() && !c20098a.f63640d) {
            c20098a.f63640d = true;
            ((InterfaceC20101d) c20098a.f63638b.get(0)).mo20938f();
        }
        m3325q(Long.MIN_VALUE);
        if (!this.f7000v.m20933d()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.f6959S;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    /* JADX INFO: renamed from: d */
    public final void m3313d() {
        C2264E c2264e;
        if (m3321l()) {
            this.f6948H = 0L;
            this.f6949I = 0L;
            this.f6950J = 0L;
            this.f6951K = 0L;
            this.f6982h0 = false;
            this.f6952L = 0;
            this.f6943C = new C2262C(this.f6944D, 0L, 0L);
            this.f6955O = 0L;
            this.f6942B = null;
            this.f6985j.clear();
            this.f6957Q = null;
            this.f6958R = 0;
            this.f6959S = null;
            this.f6963W = false;
            this.f6962V = false;
            this.f6964X = false;
            this.f6946F = null;
            this.f6947G = 0;
            this.f6975e.f7046o = 0L;
            C20098a c20098a = this.f6999u.f6921i;
            this.f7000v = c20098a;
            c20098a.m20931b();
            AudioTrack audioTrack = this.f6983i.f7110c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f7001w.pause();
            }
            if (m3309m(this.f7001w)) {
                C2267H c2267h = this.f6991m;
                c2267h.getClass();
                c2267h.m3308b(this.f7001w);
            }
            int i10 = AbstractC20817s.f66106a;
            if (i10 < 21 && !this.f6966Z) {
                this.f6968a0 = 0;
            }
            this.f6999u.getClass();
            C2269J c2269j = new C2269J();
            C2261B c2261b = this.f6998t;
            if (c2261b != null) {
                this.f6999u = c2261b;
                this.f6998t = null;
            }
            C2297u c2297u = this.f6983i;
            c2297u.m3386d();
            c2297u.f7110c = null;
            c2297u.f7113f = null;
            if (i10 >= 24 && (c2264e = this.f7004z) != null) {
                c2264e.m3306c();
                this.f7004z = null;
            }
            AudioTrack audioTrack2 = this.f7001w;
            C0376k c0376k = this.f6981h;
            C13288c c13288c = this.f6997s;
            c0376k.m1012d();
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f6938m0) {
                try {
                    if (f6939n0 == null) {
                        f6939n0 = Executors.newSingleThreadExecutor(new ThreadFactoryC7209a("ExoPlayer:AudioTrackReleaseThread", 1));
                    }
                    f6940o0++;
                    f6939n0.execute(new RunnableC2301y(audioTrack2, c13288c, handler, c2269j, c0376k, 0));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f7001w = null;
        }
        this.f6993o.f5613o0 = null;
        this.f6992n.f5613o0 = null;
        this.f6986j0 = 0L;
        this.f6988k0 = 0L;
        Handler handler2 = this.f6990l0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final C2288l m3314e(C19788o c19788o) {
        int i10;
        boolean zBooleanValue;
        AudioManager audioManager;
        if (this.f6980g0) {
            return C2288l.f7073d;
        }
        C19778e c19778e = this.f6941A;
        C15384c c15384c = this.f6995q;
        c15384c.getClass();
        c19788o.getClass();
        c19778e.getClass();
        int i11 = AbstractC20817s.f66106a;
        if (i11 < 29 || (i10 = c19788o.f62730B) == -1) {
            return C2288l.f7073d;
        }
        Boolean bool = (Boolean) c15384c.f47968o0;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = (Context) c15384c.f47967Z;
            if (context == null || (audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)) == null) {
                c15384c.f47968o0 = Boolean.FALSE;
            } else {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                c15384c.f47968o0 = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            }
            zBooleanValue = ((Boolean) c15384c.f47968o0).booleanValue();
        }
        String str = c19788o.f62752m;
        str.getClass();
        int iM20703a = AbstractC19754D.m20703a(str, c19788o.f62749j);
        if (iM20703a == 0 || i11 < AbstractC20817s.m21413n(iM20703a)) {
            return C2288l.f7073d;
        }
        int iM21415p = AbstractC20817s.m21415p(c19788o.f62729A);
        if (iM21415p == 0) {
            return C2288l.f7073d;
        }
        try {
            AudioFormat audioFormatM21414o = AbstractC20817s.m21414o(i10, iM21415p, iM20703a);
            return i11 >= 31 ? AbstractC2300x.m3388a(audioFormatM21414o, (AudioAttributes) c19778e.m20736a().f45413Y, zBooleanValue) : AbstractC2299w.m3387a(audioFormatM21414o, (AudioAttributes) c19778e.m20736a().f45413Y, zBooleanValue);
        } catch (IllegalArgumentException unused) {
            return C2288l.f7073d;
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m3315f(C19788o c19788o) {
        m3322n();
        if (!"audio/raw".equals(c19788o.f62752m)) {
            return this.f7002x.m3374d(this.f6941A, c19788o) != null ? 2 : 0;
        }
        int i10 = c19788o.f62731C;
        if (AbstractC20817s.m21387A(i10)) {
            return (i10 == 2 || (this.f6971c && i10 == 4)) ? 2 : 1;
        }
        AbstractC20800b.m21332t("DefaultAudioSink", "Invalid PCM encoding: " + i10);
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final long m3316g() {
        C2261B c2261b = this.f6999u;
        return c2261b.f6915c == 0 ? this.f6948H / ((long) c2261b.f6914b) : this.f6949I;
    }

    /* JADX INFO: renamed from: h */
    public final long m3317h() {
        C2261B c2261b = this.f6999u;
        if (c2261b.f6915c != 0) {
            return this.f6951K;
        }
        long j10 = this.f6950J;
        long j11 = c2261b.f6916d;
        int i10 = AbstractC20817s.f66106a;
        return ((j10 + j11) - 1) / j11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:139:0x0237  */
    /* JADX WARN: Code duplicated, block: B:163:0x026e  */
    /* JADX WARN: Code duplicated, block: B:164:0x0270  */
    /* JADX WARN: Code duplicated, block: B:166:0x027e  */
    /* JADX WARN: Code duplicated, block: B:169:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:179:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:180:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:182:0x02d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:185:0x02da  */
    /* JADX WARN: Code duplicated, block: B:188:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:190:0x0300  */
    /* JADX WARN: Code duplicated, block: B:191:0x0311  */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0104, code lost:
    
        if (r9.m3384b() == 0) goto L72;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3318i(ByteBuffer byteBuffer, long j10, int i10) throws C2293q, C2291o {
        int i11;
        int iM6894j;
        int iPosition;
        byte b;
        int i12;
        byte b10;
        int i13;
        byte b11;
        int i14;
        int i15;
        int i16;
        int i17;
        C2295s c2295s;
        ByteBuffer byteBuffer2 = this.f6957Q;
        AbstractC20800b.m21316d(byteBuffer2 == null || byteBuffer == byteBuffer2);
        C2261B c2261b = this.f6998t;
        C2297u c2297u = this.f6983i;
        if (c2261b != null) {
            if (!m3312c()) {
                return false;
            }
            C2261B c2261b2 = this.f6998t;
            C2261B c2261b3 = this.f6999u;
            c2261b2.getClass();
            if (c2261b3.f6915c == c2261b2.f6915c && c2261b3.f6919g == c2261b2.f6919g && c2261b3.f6917e == c2261b2.f6917e && c2261b3.f6918f == c2261b2.f6918f && c2261b3.f6916d == c2261b2.f6916d && c2261b3.f6922j == c2261b2.f6922j && c2261b3.f6923k == c2261b2.f6923k) {
                this.f6999u = this.f6998t;
                this.f6998t = null;
                AudioTrack audioTrack = this.f7001w;
                if (audioTrack != null && m3309m(audioTrack) && this.f6999u.f6923k) {
                    if (this.f7001w.getPlayState() == 3) {
                        this.f7001w.setOffloadEndOfStream();
                        c2297u.f7105H = true;
                        C2296t c2296t = c2297u.f7113f;
                        if (c2296t != null && (c2295s = c2296t.f7092a) != null) {
                            c2295s.f7090f = true;
                        }
                    }
                    AudioTrack audioTrack2 = this.f7001w;
                    C19788o c19788o = this.f6999u.f6913a;
                    audioTrack2.setOffloadDelayPadding(c19788o.f62732D, c19788o.f62733E);
                    this.f6982h0 = true;
                }
            } else {
                m3324p();
                if (m3319j()) {
                    return false;
                }
                m3313d();
            }
            m3310a(j10);
        }
        boolean zM3321l = m3321l();
        C1918i c1918i = this.f6992n;
        if (!zM3321l) {
            try {
                if (!m3320k()) {
                    return false;
                }
            } catch (C2291o e10) {
                if (e10.f7081Z) {
                    throw e10;
                }
                c1918i.m3065w(e10);
                return false;
            }
        }
        c1918i.f5613o0 = null;
        if (this.f6954N) {
            this.f6955O = Math.max(0L, j10);
            this.f6953M = false;
            this.f6954N = false;
            if (m3328t()) {
                m3327s();
            }
            m3310a(j10);
            if (this.f6965Y) {
                m3323o();
            }
        }
        long jM3317h = m3317h();
        AudioTrack audioTrack3 = c2297u.f7110c;
        audioTrack3.getClass();
        int playState = audioTrack3.getPlayState();
        if (c2297u.f7115h) {
            if (playState == 2) {
                c2297u.f7123p = false;
            } else if (playState == 1) {
            }
            return false;
        }
        boolean z6 = c2297u.f7123p;
        boolean zM3385c = c2297u.m3385c(jM3317h);
        c2297u.f7123p = zM3385c;
        if (z6 && !zM3385c && playState != 1) {
            int i18 = c2297u.f7112e;
            long jM21399M = AbstractC20817s.m21399M(c2297u.f7116i);
            C2268I c2268i = (C2268I) c2297u.f7108a.f42000Z;
            if (c2268i.f6997s != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - c2268i.f6978f0;
                C21585H c21585h = ((C2271L) c2268i.f6997s.f42001Y).f7007R1;
                Handler handler = (Handler) c21585h.f68344Z;
                if (handler != null) {
                    handler.post(new RunnableC2289m(c21585h, i18, jM21399M, jElapsedRealtime));
                }
            }
        }
        if (this.f6957Q == null) {
            AbstractC20800b.m21316d(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            C2261B c2261b4 = this.f6999u;
            if (c2261b4.f6915c != 0 && this.f6952L == 0) {
                int i19 = c2261b4.f6919g;
                if (i19 != 20) {
                    iM6894j = 1024;
                    if (i19 != 30) {
                        switch (i19) {
                            case 5:
                            case 6:
                                if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                    i14 = AbstractC6320b.f20474c[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                                } else {
                                    i14 = 1536;
                                }
                                iM6894j = i14;
                                break;
                            case 7:
                            case 8:
                                if (byteBuffer.getInt(0) != -233094848 && byteBuffer.getInt(0) != -398277519) {
                                    if (byteBuffer.getInt(0) == 622876772) {
                                        iM6894j = 4096;
                                    } else {
                                        iPosition = byteBuffer.position();
                                        b = byteBuffer.get(iPosition);
                                        if (b != -2) {
                                            if (b != -1) {
                                                i12 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                                b11 = byteBuffer.get(iPosition + 7);
                                            } else if (b != 31) {
                                                i12 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                                b10 = byteBuffer.get(iPosition + 5);
                                            } else {
                                                i12 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                                b11 = byteBuffer.get(iPosition + 6);
                                            }
                                            i13 = b11 & 60;
                                            iM6894j = (((i13 >> 2) | i12) + 1) * 32;
                                        } else {
                                            i12 = (byteBuffer.get(iPosition + 5) & 1) << 6;
                                            b10 = byteBuffer.get(iPosition + 4);
                                        }
                                        i13 = b10 & 252;
                                        iM6894j = (((i13 >> 2) | i12) + 1) * 32;
                                    }
                                }
                                break;
                            case 9:
                                int iReverseBytes = byteBuffer.getInt(byteBuffer.position());
                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                    iReverseBytes = Integer.reverseBytes(iReverseBytes);
                                }
                                if ((iReverseBytes & (-2097152)) != -2097152 || (i15 = (iReverseBytes >>> 19) & 3) == 1 || (i16 = (iReverseBytes >>> 17) & 3) == 0) {
                                    iM6894j = -1;
                                } else {
                                    int i20 = (iReverseBytes >>> 12) & 15;
                                    int i21 = (iReverseBytes >>> 10) & 3;
                                    if (i20 == 0 || i20 == 15 || i21 == 3) {
                                        iM6894j = -1;
                                    } else {
                                        int i22 = 1152;
                                        if (i16 != 1) {
                                            if (i16 != 2) {
                                                if (i16 != 3) {
                                                    throw new IllegalArgumentException();
                                                }
                                                i22 = 384;
                                            }
                                        } else if (i15 != 3) {
                                            i22 = 576;
                                        }
                                        iM6894j = i22;
                                    }
                                }
                                if (iM6894j == -1) {
                                    throw new IllegalArgumentException();
                                }
                                break;
                            case 10:
                                break;
                            case 11:
                            case 12:
                                iM6894j = 2048;
                                break;
                            default:
                                switch (i19) {
                                    case 14:
                                        int iPosition2 = byteBuffer.position();
                                        int iLimit = byteBuffer.limit() - 10;
                                        int i23 = iPosition2;
                                        while (true) {
                                            if (i23 <= iLimit) {
                                                int iReverseBytes2 = byteBuffer.getInt(i23 + 4);
                                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                    iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                                }
                                                if ((iReverseBytes2 & (-2)) == -126718022) {
                                                    i17 = i23 - iPosition2;
                                                } else {
                                                    i23++;
                                                }
                                            } else {
                                                i17 = -1;
                                            }
                                        }
                                        if (i17 == -1) {
                                            iM6894j = 0;
                                        } else {
                                            i14 = (40 << ((byteBuffer.get((byteBuffer.position() + i17) + ((byteBuffer.get((byteBuffer.position() + i17) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                                            iM6894j = i14;
                                        }
                                        break;
                                    case 15:
                                        iM6894j = 512;
                                        break;
                                    case 16:
                                        break;
                                    case 17:
                                        byte[] bArr = new byte[16];
                                        int iPosition3 = byteBuffer.position();
                                        byteBuffer.get(bArr);
                                        byteBuffer.position(iPosition3);
                                        iM6894j = AbstractC6320b.m6897m(new C6318J(16, bArr)).f9094c;
                                        break;
                                    case 18:
                                        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                            i14 = AbstractC6320b.f20474c[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                                        } else {
                                            i14 = 1536;
                                        }
                                        iM6894j = i14;
                                        break;
                                    default:
                                        throw new IllegalStateException(AbstractC10763a.m11048f(i19, "Unexpected audio encoding: "));
                                }
                                break;
                        }
                    } else if (byteBuffer.getInt(0) != -233094848) {
                        if (byteBuffer.getInt(0) == 622876772) {
                            iM6894j = 4096;
                        } else {
                            iPosition = byteBuffer.position();
                            b = byteBuffer.get(iPosition);
                            if (b != -2) {
                                if (b != -1) {
                                    i12 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                    b11 = byteBuffer.get(iPosition + 7);
                                } else if (b != 31) {
                                    i12 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                    b10 = byteBuffer.get(iPosition + 5);
                                } else {
                                    i12 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                    b11 = byteBuffer.get(iPosition + 6);
                                }
                                i13 = b11 & 60;
                                iM6894j = (((i13 >> 2) | i12) + 1) * 32;
                            } else {
                                i12 = (byteBuffer.get(iPosition + 5) & 1) << 6;
                                b10 = byteBuffer.get(iPosition + 4);
                            }
                            i13 = b10 & 252;
                            iM6894j = (((i13 >> 2) | i12) + 1) * 32;
                        }
                    }
                } else {
                    if ((byteBuffer.get(5) & 2) == 0) {
                        i11 = 0;
                    } else {
                        byte b12 = byteBuffer.get(26);
                        int i24 = 28;
                        int i25 = 28;
                        for (int i26 = 0; i26 < b12; i26++) {
                            i25 += byteBuffer.get(i26 + 27);
                        }
                        byte b13 = byteBuffer.get(i25 + 26);
                        for (int i27 = 0; i27 < b13; i27++) {
                            i24 += byteBuffer.get(i25 + 27 + i27);
                        }
                        i11 = i25 + i24;
                    }
                    int i28 = byteBuffer.get(i11 + 26) + 27 + i11;
                    iM6894j = (int) ((AbstractC6320b.m6894j(byteBuffer.get(i28), byteBuffer.limit() - i28 > 1 ? byteBuffer.get(i28 + 1) : (byte) 0) * 48000) / 1000000);
                }
                this.f6952L = iM6894j;
                if (iM6894j == 0) {
                    return true;
                }
            }
            if (this.f6942B != null) {
                if (!m3312c()) {
                    return false;
                }
                m3310a(j10);
                this.f6942B = null;
            }
            long jM21394H = AbstractC20817s.m21394H(this.f6999u.f6913a.f62730B, m3316g() - this.f6975e.f7046o) + this.f6955O;
            if (!this.f6953M && Math.abs(jM21394H - j10) > 200000) {
                C13288c c13288c = this.f6997s;
                if (c13288c != null) {
                    StringBuilder sbM9894m = AbstractC9306j0.m9894m("Unexpected audio track timestamp discontinuity: expected ", jM21394H, ", got ");
                    sbM9894m.append(j10);
                    c13288c.m14919Y(new C2292p(sbM9894m.toString()));
                }
                this.f6953M = true;
            }
            if (this.f6953M) {
                if (!m3312c()) {
                    return false;
                }
                long j11 = j10 - jM21394H;
                this.f6955O += j11;
                this.f6953M = false;
                m3310a(j10);
                C13288c c13288c2 = this.f6997s;
                if (c13288c2 != null && j11 != 0) {
                    ((C2271L) c13288c2.f42001Y).f7015a2 = true;
                }
            }
            if (this.f6999u.f6915c == 0) {
                this.f6948H += (long) byteBuffer.remaining();
            } else {
                this.f6949I = (((long) this.f6952L) * ((long) i10)) + this.f6949I;
            }
            this.f6957Q = byteBuffer;
            this.f6958R = i10;
        }
        m3325q(j10);
        if (!this.f6957Q.hasRemaining()) {
            this.f6957Q = null;
            this.f6958R = 0;
            return true;
        }
        long jM3317h2 = m3317h();
        if (c2297u.f7133z == -9223372036854775807L || jM3317h2 <= 0) {
            return false;
        }
        c2297u.f7107J.getClass();
        if (SystemClock.elapsedRealtime() - c2297u.f7133z < 200) {
            return false;
        }
        AbstractC20800b.m21332t("DefaultAudioSink", "Resetting stalled audio track");
        m3313d();
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3319j() {
        return m3321l() && !(AbstractC20817s.f66106a >= 29 && this.f7001w.isOffloadedPlayback() && this.f6964X) && this.f6983i.m3385c(m3317h());
    }

    /* JADX WARN: Code duplicated, block: B:103:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0193  */
    /* JADX INFO: renamed from: k */
    public final boolean m3320k() throws C2291o {
        boolean z6;
        AudioTrack audioTrackM3302a;
        C2286j c2286j;
        C1875m c1875m;
        C0376k c0376k = this.f6981h;
        synchronized (c0376k) {
            z6 = c0376k.f1278Z;
        }
        if (!z6) {
            return false;
        }
        try {
            C2261B c2261b = this.f6999u;
            c2261b.getClass();
            try {
                audioTrackM3302a = c2261b.m3302a(this.f6941A, this.f6968a0);
            } catch (C2291o e10) {
                C13288c c13288c = this.f6997s;
                if (c13288c != null) {
                    c13288c.m14919Y(e10);
                }
                throw e10;
            }
        } catch (C2291o e11) {
            C2261B c2261b2 = this.f6999u;
            if (c2261b2.f6920h > 1000000) {
                C2261B c2261b3 = new C2261B(c2261b2.f6913a, c2261b2.f6914b, c2261b2.f6915c, c2261b2.f6916d, c2261b2.f6917e, c2261b2.f6918f, c2261b2.f6919g, UtilsKt.MICROS_MULTIPLIER, c2261b2.f6921i, c2261b2.f6922j, c2261b2.f6923k, c2261b2.f6924l);
                try {
                    try {
                        audioTrackM3302a = c2261b3.m3302a(this.f6941A, this.f6968a0);
                        this.f6999u = c2261b3;
                    } catch (C2291o e12) {
                        C13288c c13288c2 = this.f6997s;
                        if (c13288c2 != null) {
                            c13288c2.m14919Y(e12);
                        }
                        throw e12;
                    }
                } catch (C2291o e13) {
                    e11.addSuppressed(e13);
                    if (this.f6999u.f6915c == 1) {
                        throw e11;
                    }
                    this.f6980g0 = true;
                    throw e11;
                }
            }
            if (this.f6999u.f6915c == 1) {
                throw e11;
            }
            this.f6980g0 = true;
            throw e11;
        }
        this.f7001w = audioTrackM3302a;
        if (m3309m(audioTrackM3302a)) {
            AudioTrack audioTrack = this.f7001w;
            if (this.f6991m == null) {
                this.f6991m = new C2267H(this);
            }
            this.f6991m.m3307a(audioTrack);
            C2261B c2261b4 = this.f6999u;
            if (c2261b4.f6923k) {
                AudioTrack audioTrack2 = this.f7001w;
                C19788o c19788o = c2261b4.f6913a;
                audioTrack2.setOffloadDelayPadding(c19788o.f62732D, c19788o.f62733E);
            }
        }
        int i10 = AbstractC20817s.f66106a;
        if (i10 >= 31 && (c1875m = this.f6996r) != null) {
            AbstractC2260A.m3300a(this.f7001w, c1875m);
        }
        this.f6968a0 = this.f7001w.getAudioSessionId();
        AudioTrack audioTrack3 = this.f7001w;
        C2261B c2261b5 = this.f6999u;
        boolean z10 = c2261b5.f6915c == 2;
        int i11 = c2261b5.f6919g;
        int i12 = c2261b5.f6916d;
        int i13 = c2261b5.f6920h;
        C2297u c2297u = this.f6983i;
        c2297u.f7110c = audioTrack3;
        c2297u.f7111d = i12;
        c2297u.f7112e = i13;
        c2297u.f7113f = new C2296t(audioTrack3);
        c2297u.f7114g = audioTrack3.getSampleRate();
        c2297u.f7115h = z10 && i10 < 23 && (i11 == 5 || i11 == 6);
        boolean zM21387A = AbstractC20817s.m21387A(i11);
        c2297u.f7124q = zM21387A;
        c2297u.f7116i = zM21387A ? AbstractC20817s.m21394H(c2297u.f7114g, i13 / i12) : -9223372036854775807L;
        c2297u.f7127t = 0L;
        c2297u.f7128u = 0L;
        c2297u.f7105H = false;
        c2297u.f7106I = 0L;
        c2297u.f7129v = 0L;
        c2297u.f7123p = false;
        c2297u.f7132y = -9223372036854775807L;
        c2297u.f7133z = -9223372036854775807L;
        c2297u.f7125r = 0L;
        c2297u.f7122o = 0L;
        c2297u.f7117j = 1.0f;
        if (m3321l()) {
            if (i10 >= 21) {
                this.f7001w.setVolume(this.f6956P);
            } else {
                AudioTrack audioTrack4 = this.f7001w;
                float f10 = this.f6956P;
                audioTrack4.setStereoVolume(f10, f10);
            }
        }
        this.f6970b0.getClass();
        C2287k c2287k = this.f6972c0;
        if (c2287k != null && i10 >= 23) {
            AbstractC2302z.m3389a(this.f7001w, c2287k);
            C2286j c2286j2 = this.f7003y;
            if (c2286j2 != null) {
                c2286j2.m3380b(this.f6972c0.f7072a);
            }
        }
        if (i10 >= 24 && (c2286j = this.f7003y) != null) {
            this.f7004z = new C2264E(this.f7001w, c2286j);
        }
        this.f6954N = true;
        C13288c c13288c3 = this.f6997s;
        if (c13288c3 != null) {
            this.f6999u.getClass();
            C2269J c2269j = new C2269J();
            C21585H c21585h = ((C2271L) c13288c3.f42001Y).f7007R1;
            Handler handler = (Handler) c21585h.f68344Z;
            if (handler != null) {
                handler.post(new RunnableC2289m(c21585h, c2269j, 1));
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m3321l() {
        return this.f7001w != null;
    }

    /* JADX INFO: renamed from: n */
    public final void m3322n() {
        Context context;
        C2281e c2281eM3372b;
        C2283g c2283g;
        if (this.f7003y != null || (context = this.f6967a) == null) {
            return;
        }
        this.f6984i0 = Looper.myLooper();
        C2286j c2286j = new C2286j(context, new C0072l(this, 20), this.f6941A, this.f6972c0);
        this.f7003y = c2286j;
        if (c2286j.f7071j) {
            c2281eM3372b = c2286j.f7068g;
            c2281eM3372b.getClass();
        } else {
            c2286j.f7071j = true;
            C2284h c2284h = c2286j.f7067f;
            if (c2284h != null) {
                c2284h.f7057a.registerContentObserver(c2284h.f7058b, false, c2284h);
            }
            int i10 = AbstractC20817s.f66106a;
            Handler handler = c2286j.f7064c;
            Context context2 = c2286j.f7062a;
            if (i10 >= 23 && (c2283g = c2286j.f7065d) != null) {
                AbstractC2282f.m3376a(context2, c2283g, handler);
            }
            C2285i c2285i = c2286j.f7066e;
            c2281eM3372b = C2281e.m3372b(context2, c2285i != null ? context2.registerReceiver(c2285i, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler) : null, c2286j.f7070i, c2286j.f7069h);
            c2286j.f7068g = c2281eM3372b;
        }
        this.f7002x = c2281eM3372b;
    }

    /* JADX INFO: renamed from: o */
    public final void m3323o() {
        this.f6965Y = true;
        if (m3321l()) {
            C2297u c2297u = this.f6983i;
            if (c2297u.f7132y != -9223372036854775807L) {
                c2297u.f7107J.getClass();
                c2297u.f7132y = AbstractC20817s.m21390D(SystemClock.elapsedRealtime());
            }
            C2296t c2296t = c2297u.f7113f;
            c2296t.getClass();
            c2296t.m3381a();
            this.f7001w.play();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m3324p() {
        if (this.f6963W) {
            return;
        }
        this.f6963W = true;
        long jM3317h = m3317h();
        C2297u c2297u = this.f6983i;
        c2297u.f7098A = c2297u.m3384b();
        c2297u.f7107J.getClass();
        c2297u.f7132y = AbstractC20817s.m21390D(SystemClock.elapsedRealtime());
        c2297u.f7099B = jM3317h;
        if (m3309m(this.f7001w)) {
            this.f6964X = false;
        }
        this.f7001w.stop();
        this.f6947G = 0;
    }

    /* JADX INFO: renamed from: q */
    public final void m3325q(long j10) throws C2293q {
        ByteBuffer byteBuffer;
        if (!this.f7000v.m20934e()) {
            ByteBuffer byteBuffer2 = this.f6957Q;
            if (byteBuffer2 == null) {
                byteBuffer2 = InterfaceC20101d.f63646a;
            }
            m3329u(j10, byteBuffer2);
            return;
        }
        while (!this.f7000v.m20933d()) {
            do {
                C20098a c20098a = this.f7000v;
                if (c20098a.m20934e()) {
                    ByteBuffer byteBuffer3 = c20098a.f63639c[c20098a.m20932c()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        c20098a.m20935f(InterfaceC20101d.f63646a);
                        byteBuffer = c20098a.f63639c[c20098a.m20932c()];
                    }
                } else {
                    byteBuffer = InterfaceC20101d.f63646a;
                }
                if (byteBuffer.hasRemaining()) {
                    m3329u(j10, byteBuffer);
                } else {
                    ByteBuffer byteBuffer4 = this.f6957Q;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    C20098a c20098a2 = this.f7000v;
                    ByteBuffer byteBuffer5 = this.f6957Q;
                    if (c20098a2.m20934e() && !c20098a2.f63640d) {
                        c20098a2.m20935f(byteBuffer5);
                    }
                }
            } while (!byteBuffer.hasRemaining());
            return;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m3326r() {
        m3313d();
        C11276A c11276aListIterator = this.f6977f.listIterator(0);
        while (c11276aListIterator.hasNext()) {
            ((InterfaceC20101d) c11276aListIterator.next()).mo20936c();
        }
        C11276A c11276aListIterator2 = this.f6979g.listIterator(0);
        while (c11276aListIterator2.hasNext()) {
            ((InterfaceC20101d) c11276aListIterator2.next()).mo20936c();
        }
        C20098a c20098a = this.f7000v;
        if (c20098a != null) {
            int i10 = 0;
            while (true) {
                C11294T c11294t = c20098a.f63637a;
                if (i10 >= c11294t.size()) {
                    break;
                }
                InterfaceC20101d interfaceC20101d = (InterfaceC20101d) c11294t.get(i10);
                interfaceC20101d.flush();
                interfaceC20101d.mo20936c();
                i10++;
            }
            c20098a.f63639c = new ByteBuffer[0];
            C20099b c20099b = C20099b.f63641e;
            c20098a.f63640d = false;
        }
        this.f6965Y = false;
        this.f6980g0 = false;
    }

    /* JADX INFO: renamed from: s */
    public final void m3327s() {
        if (m3321l()) {
            try {
                this.f7001w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f6944D.f62564a).setPitch(this.f6944D.f62565b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                AbstractC20800b.m21333u("DefaultAudioSink", "Failed to set playback params", e10);
            }
            C19757G c19757g = new C19757G(this.f7001w.getPlaybackParams().getSpeed(), this.f7001w.getPlaybackParams().getPitch());
            this.f6944D = c19757g;
            C2297u c2297u = this.f6983i;
            c2297u.f7117j = c19757g.f62564a;
            C2296t c2296t = c2297u.f7113f;
            if (c2296t != null) {
                c2296t.m3381a();
            }
            c2297u.m3386d();
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m3328t() {
        C2261B c2261b = this.f6999u;
        return c2261b != null && c2261b.f6922j && AbstractC20817s.f66106a >= 23;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:74:0x0137  */
    /* JADX INFO: renamed from: u */
    public final void m3329u(long j10, ByteBuffer byteBuffer) throws C2293q {
        int iWrite;
        C13288c c13288c;
        C1527E c1527e;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f6959S;
            boolean z6 = true;
            if (byteBuffer2 != null) {
                AbstractC20800b.m21316d(byteBuffer2 == byteBuffer);
            } else {
                this.f6959S = byteBuffer;
                if (AbstractC20817s.f66106a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.f6960T;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.f6960T = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.f6960T, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.f6961U = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i10 = AbstractC20817s.f66106a;
            if (i10 < 21) {
                long j11 = this.f6950J;
                C2297u c2297u = this.f6983i;
                int iM3384b = c2297u.f7112e - ((int) (j11 - (c2297u.m3384b() * ((long) c2297u.f7111d))));
                if (iM3384b > 0) {
                    iWrite = this.f7001w.write(this.f6960T, this.f6961U, Math.min(iRemaining2, iM3384b));
                    if (iWrite > 0) {
                        this.f6961U += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
            } else if (this.f6974d0) {
                AbstractC20800b.m21320h(j10 != -9223372036854775807L);
                if (j10 == Long.MIN_VALUE) {
                    j10 = this.f6976e0;
                } else {
                    this.f6976e0 = j10;
                }
                AudioTrack audioTrack = this.f7001w;
                if (i10 >= 26) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining2, 1, j10 * 1000);
                } else {
                    if (this.f6946F == null) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                        this.f6946F = byteBufferAllocate;
                        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                        this.f6946F.putInt(1431633921);
                    }
                    if (this.f6947G == 0) {
                        this.f6946F.putInt(4, iRemaining2);
                        this.f6946F.putLong(8, j10 * 1000);
                        this.f6946F.position(0);
                        this.f6947G = iRemaining2;
                    }
                    int iRemaining3 = this.f6946F.remaining();
                    if (iRemaining3 <= 0) {
                        iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                        if (iWrite < 0) {
                            this.f6947G = 0;
                        } else {
                            this.f6947G -= iWrite;
                        }
                    } else {
                        int iWrite2 = audioTrack.write(this.f6946F, iRemaining3, 1);
                        if (iWrite2 < 0) {
                            this.f6947G = 0;
                            iWrite = iWrite2;
                        } else if (iWrite2 < iRemaining3) {
                            iWrite = 0;
                        } else {
                            iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                            if (iWrite < 0) {
                                this.f6947G = 0;
                            } else {
                                this.f6947G -= iWrite;
                            }
                        }
                    }
                }
            } else {
                iWrite = this.f7001w.write(byteBuffer, iRemaining2, 1);
            }
            this.f6978f0 = SystemClock.elapsedRealtime();
            C1918i c1918i = this.f6993o;
            if (iWrite < 0) {
                if ((i10 < 24 || iWrite != -6) && iWrite != -32) {
                    z6 = false;
                } else if (m3317h() <= 0) {
                    if (!m3309m(this.f7001w)) {
                        z6 = false;
                    } else if (this.f6999u.f6915c == 1) {
                        this.f6980g0 = true;
                    }
                }
                C2293q c2293q = new C2293q(iWrite, this.f6999u.f6913a, z6);
                C13288c c13288c2 = this.f6997s;
                if (c13288c2 != null) {
                    c13288c2.m14919Y(c2293q);
                }
                if (c2293q.f7083Z) {
                    this.f7002x = C2281e.f7051c;
                    throw c2293q;
                }
                c1918i.m3065w(c2293q);
                return;
            }
            c1918i.f5613o0 = null;
            if (m3309m(this.f7001w)) {
                if (this.f6951K > 0) {
                    this.f6982h0 = false;
                }
                if (this.f6965Y && (c13288c = this.f6997s) != null && iWrite < iRemaining2 && !this.f6982h0 && (c1527e = ((C2271L) c13288c.f42001Y).f9751R0) != null) {
                    c1527e.f4102a.f4143U0 = true;
                }
            }
            int i11 = this.f6999u.f6915c;
            if (i11 == 0) {
                this.f6950J += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i11 != 0) {
                    AbstractC20800b.m21320h(byteBuffer == this.f6957Q);
                    this.f6951K = (((long) this.f6952L) * ((long) this.f6958R)) + this.f6951K;
                }
                this.f6959S = null;
            }
        }
    }
}
