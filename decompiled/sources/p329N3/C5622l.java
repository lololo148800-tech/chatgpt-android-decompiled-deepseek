package p329N3;

import android.app.Application;
import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenTypes;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import bb.C11294T;
import com.statsig.androidsdk.StatsigLoggerKt;
import io.sentry.internal.debugmeta.C15384c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import livekit.LivekitInternal$NodeStats;
import p001A.C0042V0;
import p001A.C0072l;
import p003A1.AbstractC0168G;
import p031B3.C0803g;
import p051Bo.C1458d;
import p057C3.C1524B;
import p057C3.C1527E;
import p057C3.C1556e;
import p057C3.C1558f;
import p057C3.C1559f0;
import p057C3.C1567l;
import p057C3.SurfaceHolderCallbackC1523A;
import p080D0.C1817m0;
import p1016t3.AbstractC19754D;
import p1016t3.C19773X;
import p1016t3.C19781h;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20812n;
import p1073w3.C20813o;
import p1073w3.C20815q;
import p165G9.C3018d;
import p182H3.AbstractC3199A;
import p182H3.AbstractC3220u;
import p182H3.C3208i;
import p182H3.C3212m;
import p182H3.C3213n;
import p182H3.C3219t;
import p182H3.C3221v;
import p182H3.C3223x;
import p182H3.InterfaceC3209j;
import p182H3.InterfaceC3210k;
import p221Ii.RunnableC3724c;
import p315Me.Myis.CxcULo;
import p379Pb.LVf.efyhmdM;
import p477Tb.C7296c;
import p544W9.AbstractC8590Y3;
import p582Xk.HXHG.TfazcFv;
import p658b5.C11232c;
import p720e6.C13288c;
import p747fb.EnumC13607a;

/* JADX INFO: renamed from: N3.l */
/* JADX INFO: loaded from: classes.dex */
public final class C5622l extends AbstractC3220u {

    /* JADX INFO: renamed from: x2 */
    public static final int[] f18206x2 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: y2 */
    public static boolean f18207y2;

    /* JADX INFO: renamed from: z2 */
    public static boolean f18208z2;

    /* JADX INFO: renamed from: Q1 */
    public final Context f18209Q1;

    /* JADX INFO: renamed from: R1 */
    public final boolean f18210R1;

    /* JADX INFO: renamed from: S1 */
    public final C11232c f18211S1;

    /* JADX INFO: renamed from: U1 */
    public final int f18212U1;

    /* JADX INFO: renamed from: V1 */
    public final boolean f18213V1;

    /* JADX INFO: renamed from: W1 */
    public final C5625o f18214W1;

    /* JADX INFO: renamed from: X1 */
    public final C1458d f18215X1;

    /* JADX INFO: renamed from: Y1 */
    public C3018d f18216Y1;

    /* JADX INFO: renamed from: Z1 */
    public boolean f18217Z1;

    /* JADX INFO: renamed from: a2 */
    public boolean f18218a2;

    /* JADX INFO: renamed from: b2 */
    public C5615e f18219b2;

    /* JADX INFO: renamed from: c2 */
    public boolean f18220c2;

    /* JADX INFO: renamed from: d2 */
    public List f18221d2;

    /* JADX INFO: renamed from: e2 */
    public Surface f18222e2;

    /* JADX INFO: renamed from: f2 */
    public C5624n f18223f2;

    /* JADX INFO: renamed from: g2 */
    public C20812n f18224g2;

    /* JADX INFO: renamed from: h2 */
    public boolean f18225h2;

    /* JADX INFO: renamed from: i2 */
    public int f18226i2;

    /* JADX INFO: renamed from: j2 */
    public long f18227j2;

    /* JADX INFO: renamed from: k2 */
    public int f18228k2;

    /* JADX INFO: renamed from: l2 */
    public int f18229l2;

    /* JADX INFO: renamed from: m2 */
    public int f18230m2;

    /* JADX INFO: renamed from: n2 */
    public long f18231n2;

    /* JADX INFO: renamed from: o2 */
    public int f18232o2;

    /* JADX INFO: renamed from: p2 */
    public long f18233p2;

    /* JADX INFO: renamed from: q2 */
    public C19773X f18234q2;

    /* JADX INFO: renamed from: r2 */
    public C19773X f18235r2;

    /* JADX INFO: renamed from: s2 */
    public int f18236s2;

    /* JADX INFO: renamed from: t2 */
    public boolean f18237t2;

    /* JADX INFO: renamed from: u2 */
    public int f18238u2;

    /* JADX INFO: renamed from: v2 */
    public C5621k f18239v2;

    /* JADX INFO: renamed from: w2 */
    public C1524B f18240w2;

    public C5622l(Application application, InterfaceC3209j interfaceC3209j, Handler handler, SurfaceHolderCallbackC1523A surfaceHolderCallbackC1523A) {
        super(2, interfaceC3209j, 30.0f);
        Context applicationContext = application.getApplicationContext();
        this.f18209Q1 = applicationContext;
        this.f18212U1 = 50;
        this.f18211S1 = new C11232c(handler, surfaceHolderCallbackC1523A);
        this.f18210R1 = true;
        this.f18214W1 = new C5625o(applicationContext, this);
        this.f18215X1 = new C1458d();
        this.f18213V1 = "NVIDIA".equals(AbstractC20817s.f66108c);
        this.f18224g2 = C20812n.f66095c;
        this.f18226i2 = 1;
        this.f18234q2 = C19773X.f62650e;
        this.f18238u2 = 0;
        this.f18235r2 = null;
        this.f18236s2 = -1000;
    }

    /* JADX INFO: renamed from: v0 */
    public static int m6012v0(C3213n c3213n, C19788o c19788o) {
        int i10;
        int iIntValue;
        byte b = 2;
        int i11 = c19788o.f62758s;
        if (i11 == -1 || (i10 = c19788o.f62759t) == -1) {
            return -1;
        }
        String str = c19788o.f62752m;
        str.getClass();
        if ("video/dolby-vision".equals(str)) {
            Pair pairM4047d = AbstractC3199A.m4047d(c19788o);
            str = (pairM4047d == null || !((iIntValue = ((Integer) pairM4047d.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        switch (str.hashCode()) {
            case -1664118616:
                b = !str.equals("video/3gpp") ? (byte) -1 : (byte) 0;
                break;
            case -1662735862:
                b = !str.equals("video/av01") ? (byte) -1 : (byte) 1;
                break;
            case -1662541442:
                if (!str.equals("video/hevc")) {
                    b = -1;
                }
                break;
            case 1187890754:
                b = !str.equals("video/mp4v-es") ? (byte) -1 : (byte) 3;
                break;
            case 1331836730:
                b = !str.equals("video/avc") ? (byte) -1 : (byte) 4;
                break;
            case 1599127256:
                b = !str.equals("video/x-vnd.on2.vp8") ? (byte) -1 : (byte) 5;
                break;
            case 1599127257:
                b = !str.equals("video/x-vnd.on2.vp9") ? (byte) -1 : (byte) 6;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 3:
            case 5:
                return ((i11 * i10) * 3) / 4;
            case 2:
                return Math.max(2097152, ((i11 * i10) * 3) / 4);
            case 4:
                String str2 = AbstractC20817s.f66109d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(AbstractC20817s.f66108c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && c3213n.f9708f)))) {
                    return -1;
                }
                return ((AbstractC20817s.m21405f(i10, 16) * AbstractC20817s.m21405f(i11, 16)) * 768) / 4;
            case 6:
                return ((i11 * i10) * 3) / 8;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static List m6013w0(Context context, C3221v c3221v, C19788o c19788o, boolean z6, boolean z10) {
        List listM4048e;
        String str = c19788o.f62752m;
        if (str == null) {
            return C11294T.f34185q0;
        }
        if (AbstractC20817s.f66106a >= 26 && "video/dolby-vision".equals(str) && !AbstractC5620j.m6009a(context)) {
            String strM4045b = AbstractC3199A.m4045b(c19788o);
            if (strM4045b == null) {
                listM4048e = C11294T.f34185q0;
            } else {
                c3221v.getClass();
                listM4048e = AbstractC3199A.m4048e(strM4045b, z6, z10);
            }
            if (!listM4048e.isEmpty()) {
                return listM4048e;
            }
        }
        return AbstractC3199A.m4050g(c3221v, c19788o, z6, z10);
    }

    /* JADX INFO: renamed from: x0 */
    public static int m6014x0(C3213n c3213n, C19788o c19788o) {
        if (c19788o.f62753n == -1) {
            return m6012v0(c3213n, c19788o);
        }
        List list = c19788o.f62755p;
        int size = list.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += ((byte[]) list.get(i10)).length;
        }
        return c19788o.f62753n + length;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m6015A0() {
        int i10;
        InterfaceC3210k interfaceC3210k;
        if (!this.f18237t2 || (i10 = AbstractC20817s.f66106a) < 23 || (interfaceC3210k = this.f9756W0) == null) {
            return;
        }
        this.f18239v2 = new C5621k(this, interfaceC3210k);
        if (i10 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            interfaceC3210k.setParameters(bundle);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m6016B0() {
        Surface surface = this.f18222e2;
        C5624n c5624n = this.f18223f2;
        if (surface == c5624n) {
            this.f18222e2 = null;
        }
        if (c5624n != null) {
            c5624n.release();
            this.f18223f2 = null;
        }
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: C */
    public final C1558f mo3332C(C3213n c3213n, C19788o c19788o, C19788o c19788o2) {
        C1558f c1558fM4077b = c3213n.m4077b(c19788o, c19788o2);
        C3018d c3018d = this.f18216Y1;
        c3018d.getClass();
        int i10 = c19788o2.f62758s;
        int i11 = c3018d.f9092a;
        int i12 = c1558fM4077b.f4337e;
        if (i10 > i11 || c19788o2.f62759t > c3018d.f9093b) {
            i12 |= 256;
        }
        if (m6014x0(c3213n, c19788o2) > c3018d.f9094c) {
            i12 |= 64;
        }
        int i13 = i12;
        return new C1558f(c3213n.f9703a, c19788o, c19788o2, i13 != 0 ? 0 : c1558fM4077b.f4336d, i13);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m6017C0(InterfaceC3210k interfaceC3210k, int i10) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        interfaceC3210k.releaseOutputBuffer(i10, true);
        Trace.endSection();
        this.f9742L1.f4315e++;
        this.f18229l2 = 0;
        if (this.f18219b2 == null) {
            m6024z0(this.f18234q2);
            C5625o c5625o = this.f18214W1;
            boolean z6 = c5625o.f18254d != 3;
            c5625o.f18254d = 3;
            c5625o.f18261k.getClass();
            c5625o.f18256f = AbstractC20817s.m21390D(SystemClock.elapsedRealtime());
            if (!z6 || (surface = this.f18222e2) == null) {
                return;
            }
            C11232c c11232c = this.f18211S1;
            Handler handler = (Handler) c11232c.f33996Y;
            if (handler != null) {
                handler.post(new RunnableC5632v(c11232c, surface, SystemClock.elapsedRealtime(), 0));
            }
            this.f18225h2 = true;
        }
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: D */
    public final C3212m mo4087D(IllegalStateException illegalStateException, C3213n c3213n) {
        Surface surface = this.f18222e2;
        C5619i c5619i = new C5619i(illegalStateException, c3213n);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return c5619i;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m6018D0(InterfaceC3210k interfaceC3210k, int i10, long j10) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        interfaceC3210k.mo4059h(i10, j10);
        Trace.endSection();
        this.f9742L1.f4315e++;
        this.f18229l2 = 0;
        if (this.f18219b2 == null) {
            m6024z0(this.f18234q2);
            C5625o c5625o = this.f18214W1;
            boolean z6 = c5625o.f18254d != 3;
            c5625o.f18254d = 3;
            c5625o.f18261k.getClass();
            c5625o.f18256f = AbstractC20817s.m21390D(SystemClock.elapsedRealtime());
            if (!z6 || (surface = this.f18222e2) == null) {
                return;
            }
            C11232c c11232c = this.f18211S1;
            Handler handler = (Handler) c11232c.f33996Y;
            if (handler != null) {
                handler.post(new RunnableC5632v(c11232c, surface, SystemClock.elapsedRealtime(), 0));
            }
            this.f18225h2 = true;
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m6019E0(C3213n c3213n) {
        return AbstractC20817s.f66106a >= 23 && !this.f18237t2 && !m6011u0(c3213n.f9703a) && (!c3213n.f9708f || C5624n.m6027a(this.f18209Q1));
    }

    /* JADX INFO: renamed from: F0 */
    public final void m6020F0(InterfaceC3210k interfaceC3210k, int i10) {
        Trace.beginSection("skipVideoBuffer");
        interfaceC3210k.releaseOutputBuffer(i10, false);
        Trace.endSection();
        this.f9742L1.f4316f++;
    }

    /* JADX INFO: renamed from: G0 */
    public final void m6021G0(int i10, int i11) {
        C1556e c1556e = this.f9742L1;
        c1556e.f4318h += i10;
        int i12 = i10 + i11;
        c1556e.f4317g += i12;
        this.f18228k2 += i12;
        int i13 = this.f18229l2 + i12;
        this.f18229l2 = i13;
        c1556e.f4319i = Math.max(i13, c1556e.f4319i);
        int i14 = this.f18212U1;
        if (i14 <= 0 || this.f18228k2 < i14) {
            return;
        }
        m6023y0();
    }

    /* JADX INFO: renamed from: H0 */
    public final void m6022H0(long j10) {
        C1556e c1556e = this.f9742L1;
        c1556e.f4321k += j10;
        c1556e.f4322l++;
        this.f18231n2 += j10;
        this.f18232o2++;
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: L */
    public final int mo4095L(C0803g c0803g) {
        return (AbstractC20817s.f66106a < 34 || !this.f18237t2 || c0803g.f2228s0 >= this.f4306x0) ? 0 : 32;
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: M */
    public final boolean mo4096M() {
        return this.f18237t2 && AbstractC20817s.f66106a < 23;
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: N */
    public final float mo3333N(float f10, C19788o[] c19788oArr) {
        float fMax = -1.0f;
        for (C19788o c19788o : c19788oArr) {
            float f11 = c19788o.f62760u;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: O */
    public final ArrayList mo3334O(C3221v c3221v, C19788o c19788o, boolean z6) {
        List listM6013w0 = m6013w0(this.f18209Q1, c3221v, c19788o, z6, this.f18237t2);
        Pattern pattern = AbstractC3199A.f9651a;
        ArrayList arrayList = new ArrayList(listM6013w0);
        Collections.sort(arrayList, new C1817m0(new C0072l(c19788o, 27), 1));
        return arrayList;
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: P */
    public final C3208i mo3335P(C3213n c3213n, C19788o c19788o, MediaCrypto mediaCrypto, float f10) {
        boolean z6;
        int i10;
        int i11;
        C19781h c19781h;
        int iMax;
        C3018d c3018d;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Point point2;
        byte b;
        boolean z10;
        Pair pairM4047d;
        int iM6012v0;
        C5624n c5624n = this.f18223f2;
        boolean z11 = c3213n.f9708f;
        if (c5624n != null && c5624n.f18248Y != z11) {
            m6016B0();
        }
        String str = c3213n.f9705c;
        C19788o[] c19788oArr = this.f4304v0;
        c19788oArr.getClass();
        int iMax2 = c19788o.f62758s;
        int iM6014x0 = m6014x0(c3213n, c19788o);
        int length = c19788oArr.length;
        float f11 = c19788o.f62760u;
        int i12 = c19788o.f62758s;
        C19781h c19781h2 = c19788o.f62765z;
        int i13 = c19788o.f62759t;
        if (length == 1) {
            if (iM6014x0 != -1 && (iM6012v0 = m6012v0(c3213n, c19788o)) != -1) {
                iM6014x0 = Math.min((int) (iM6014x0 * 1.5f), iM6012v0);
            }
            c3018d = new C3018d(iMax2, i13, iM6014x0);
            z6 = z11;
            i10 = i13;
            i11 = i12;
            c19781h = c19781h2;
        } else {
            int length2 = c19788oArr.length;
            int iMax3 = i13;
            int i14 = 0;
            boolean z12 = false;
            while (i14 < length2) {
                C19788o c19788o2 = c19788oArr[i14];
                C19788o[] c19788oArr2 = c19788oArr;
                if (c19781h2 != null && c19788o2.f62765z == null) {
                    C19787n c19787nM20747a = c19788o2.m20747a();
                    c19787nM20747a.f62727y = c19781h2;
                    c19788o2 = new C19788o(c19787nM20747a);
                }
                if (c3213n.m4077b(c19788o, c19788o2).f4336d != 0) {
                    int i15 = c19788o2.f62759t;
                    int i16 = c19788o2.f62758s;
                    b = -1;
                    z12 |= i16 == -1 || i15 == -1;
                    iMax2 = Math.max(iMax2, i16);
                    iMax3 = Math.max(iMax3, i15);
                    iM6014x0 = Math.max(iM6014x0, m6014x0(c3213n, c19788o2));
                } else {
                    b = -1;
                }
                i14++;
                c19788oArr = c19788oArr2;
                length2 = length2;
                z11 = z11;
            }
            z6 = z11;
            int i17 = iMax3;
            if (z12) {
                AbstractC20800b.m21332t("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax2 + "x" + i17);
                boolean z13 = i13 > i12;
                int i18 = z13 ? i13 : i12;
                int i19 = z13 ? i12 : i13;
                c19781h = c19781h2;
                float f12 = i19 / i18;
                int[] iArr = f18206x2;
                i10 = i13;
                i11 = i12;
                int i20 = 0;
                while (true) {
                    if (i20 < 9) {
                        int i21 = iArr[i20];
                        int[] iArr2 = iArr;
                        int i22 = (int) (i21 * f12);
                        if (i21 > i18 && i22 > i19) {
                            int i23 = i19;
                            int i24 = i18;
                            if (AbstractC20817s.f66106a < 21) {
                                f12 = f12;
                                try {
                                    int iM21405f = AbstractC20817s.m21405f(i21, 16) * 16;
                                    int iM21405f2 = AbstractC20817s.m21405f(i22, 16) * 16;
                                    if (iM21405f * iM21405f2 <= AbstractC3199A.m4053j()) {
                                        int i25 = z13 ? iM21405f2 : iM21405f;
                                        if (!z13) {
                                            iM21405f = iM21405f2;
                                        }
                                        point = new Point(i25, iM21405f);
                                        break;
                                    }
                                    i20++;
                                    iArr = iArr2;
                                    i19 = i23;
                                    i18 = i24;
                                    f12 = f12;
                                } catch (C3223x unused) {
                                    point = null;
                                    break;
                                }
                            } else {
                                int i26 = z13 ? i22 : i21;
                                if (!z13) {
                                    i21 = i22;
                                }
                                MediaCodecInfo.CodecCapabilities codecCapabilities = c3213n.f9706d;
                                if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                    point2 = null;
                                } else {
                                    int widthAlignment = videoCapabilities.getWidthAlignment();
                                    int heightAlignment = videoCapabilities.getHeightAlignment();
                                    point2 = new Point(AbstractC20817s.m21405f(i26, widthAlignment) * widthAlignment, AbstractC20817s.m21405f(i21, heightAlignment) * heightAlignment);
                                }
                                if (point2 != null) {
                                    Point point3 = point2;
                                    if (c3213n.m4081f(point2.x, point2.y, f11)) {
                                        point = point3;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i20++;
                                iArr = iArr2;
                                i19 = i23;
                                i18 = i24;
                                f12 = f12;
                            }
                        }
                    }
                    point = null;
                    break;
                }
                if (point != null) {
                    iMax2 = Math.max(iMax2, point.x);
                    iMax = Math.max(i17, point.y);
                    C19787n c19787nM20747a2 = c19788o.m20747a();
                    c19787nM20747a2.f62720r = iMax2;
                    c19787nM20747a2.f62721s = iMax;
                    iM6014x0 = Math.max(iM6014x0, m6012v0(c3213n, new C19788o(c19787nM20747a2)));
                    AbstractC20800b.m21332t("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax2 + "x" + iMax);
                }
                c3018d = new C3018d(iMax2, iMax, iM6014x0);
            } else {
                i10 = i13;
                i11 = i12;
                c19781h = c19781h2;
            }
            iMax = i17;
            c3018d = new C3018d(iMax2, iMax, iM6014x0);
        }
        this.f18216Y1 = c3018d;
        int i27 = this.f18237t2 ? this.f18238u2 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i11);
        mediaFormat.setInteger("height", i10);
        AbstractC20800b.m21331s(mediaFormat, c19788o.f62755p);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        AbstractC20800b.m21330r(mediaFormat, "rotation-degrees", c19788o.f62761v);
        if (c19781h != null) {
            C19781h c19781h3 = c19781h;
            AbstractC20800b.m21330r(mediaFormat, "color-transfer", c19781h3.f62677c);
            AbstractC20800b.m21330r(mediaFormat, "color-standard", c19781h3.f62675a);
            AbstractC20800b.m21330r(mediaFormat, "color-range", c19781h3.f62676b);
            byte[] bArr = c19781h3.f62678d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c19788o.f62752m) && (pairM4047d = AbstractC3199A.m4047d(c19788o)) != null) {
            AbstractC20800b.m21330r(mediaFormat, "profile", ((Integer) pairM4047d.first).intValue());
        }
        mediaFormat.setInteger("max-width", c3018d.f9092a);
        mediaFormat.setInteger("max-height", c3018d.f9093b);
        AbstractC20800b.m21330r(mediaFormat, "max-input-size", c3018d.f9094c);
        int i28 = AbstractC20817s.f66106a;
        if (i28 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (this.f18213V1) {
            z10 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z10 = true;
        }
        if (i27 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z10);
            mediaFormat.setInteger("audio-session-id", i27);
        }
        if (i28 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f18236s2));
        }
        if (this.f18222e2 == null) {
            if (!m6019E0(c3213n)) {
                throw new IllegalStateException();
            }
            if (this.f18223f2 == null) {
                this.f18223f2 = C5624n.m6028b(this.f18209Q1, z6);
            }
            this.f18222e2 = this.f18223f2;
        }
        C5615e c5615e = this.f18219b2;
        if (c5615e != null && !AbstractC20817s.m21388B(c5615e.f18167a)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        if (this.f18219b2 == null) {
            return new C3208i(c3213n, mediaFormat, c19788o, this.f18222e2, mediaCrypto);
        }
        AbstractC20800b.m21320h(false);
        AbstractC20800b.m21321i(null);
        throw null;
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: Q */
    public final void mo3336Q(C0803g c0803g) {
        if (this.f18218a2) {
            ByteBuffer byteBuffer = c0803g.f2229t0;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b10 = byteBuffer.get();
                byte b11 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s10 == 60 && s11 == 1 && b10 == 4) {
                    if (b11 == 0 || b11 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        InterfaceC3210k interfaceC3210k = this.f9756W0;
                        interfaceC3210k.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        interfaceC3210k.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: V */
    public final void mo3337V(Exception exc) {
        AbstractC20800b.m21325m("MediaCodecVideoRenderer", "Video codec error", exc);
        C11232c c11232c = this.f18211S1;
        Handler handler = (Handler) c11232c.f33996Y;
        if (handler != null) {
            handler.post(new RunnableC5631u(c11232c, exc, 3));
        }
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: W */
    public final void mo3338W(long j10, long j11, String str) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C11232c c11232c = this.f18211S1;
        Handler handler = (Handler) c11232c.f33996Y;
        if (handler != null) {
            handler.post(new RunnableC5631u(c11232c, str, j10, j11));
        }
        this.f18217Z1 = m6011u0(str);
        C3213n c3213n = this.f9763d1;
        c3213n.getClass();
        boolean z6 = false;
        if (AbstractC20817s.f66106a >= 29 && "video/x-vnd.on2.vp9".equals(c3213n.f9704b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = c3213n.f9706d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z6 = true;
                    break;
                }
            }
        }
        this.f18218a2 = z6;
        m6015A0();
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: X */
    public final void mo3339X(String str) {
        C11232c c11232c = this.f18211S1;
        Handler handler = (Handler) c11232c.f33996Y;
        if (handler != null) {
            handler.post(new RunnableC5631u(c11232c, str, 6));
        }
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: Y */
    public final C1558f mo3340Y(C15384c c15384c) throws C1567l {
        C1558f c1558fMo3340Y = super.mo3340Y(c15384c);
        C19788o c19788o = (C19788o) c15384c.f47968o0;
        c19788o.getClass();
        C11232c c11232c = this.f18211S1;
        Handler handler = (Handler) c11232c.f33996Y;
        if (handler != null) {
            handler.post(new RunnableC5631u(c11232c, c19788o, c1558fMo3340Y));
        }
        return c1558fMo3340Y;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: Z */
    public final void mo3341Z(C19788o c19788o, MediaFormat mediaFormat) {
        int integer;
        int i10;
        int i11;
        InterfaceC3210k interfaceC3210k = this.f9756W0;
        if (interfaceC3210k != null) {
            interfaceC3210k.mo4064m(this.f18226i2);
        }
        if (this.f18237t2) {
            i10 = c19788o.f62758s;
            integer = c19788o.f62759t;
        } else {
            mediaFormat.getClass();
            boolean z6 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z6 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z6 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i10 = integer2;
        }
        float f10 = c19788o.f62762w;
        int i12 = AbstractC20817s.f66106a;
        int i13 = c19788o.f62761v;
        if (i12 >= 21) {
            if (i13 == 90 || i13 == 270) {
                f10 = 1.0f / f10;
                i13 = 0;
                int i14 = integer;
                integer = i10;
                i10 = i14;
            } else {
                i13 = 0;
            }
        } else if (this.f18219b2 != null) {
            i13 = 0;
        }
        this.f18234q2 = new C19773X(i10, integer, i13, f10);
        C5615e c5615e = this.f18219b2;
        if (c5615e == null) {
            this.f18214W1.m6034f(c19788o.f62760u);
            return;
        }
        C19787n c19787nM20747a = c19788o.m20747a();
        c19787nM20747a.f62720r = i10;
        c19787nM20747a.f62721s = integer;
        c19787nM20747a.f62723u = i13;
        c19787nM20747a.f62724v = f10;
        C19788o c19788o2 = new C19788o(c19787nM20747a);
        AbstractC20800b.m21320h(false);
        c5615e.f18176j.f18179b.m6034f(c19788o2.f62760u);
        if (i12 < 21 && (i11 = c19788o2.f62761v) != -1 && i11 != 0) {
            float f11 = i11;
            try {
                AbstractC8590Y3.m9255b();
                Object objNewInstance = AbstractC8590Y3.f26413a.newInstance(null);
                AbstractC8590Y3.f26414b.invoke(objNewInstance, Float.valueOf(f11));
                AbstractC8590Y3.f26415c.invoke(objNewInstance, null).getClass();
                throw new ClassCastException();
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
        c5615e.f18170d = c19788o2;
        if (c5615e.f18172f) {
            AbstractC20800b.m21320h(c5615e.f18171e != -9223372036854775807L);
            c5615e.f18173g = c5615e.f18171e;
        } else {
            c5615e.m6002c();
            c5615e.f18172f = true;
            c5615e.f18173g = -9223372036854775807L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10, types: [N3.n] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r2v1, types: [H3.k] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p057C3.AbstractC1554d, p057C3.InterfaceC1551b0
    /* JADX INFO: renamed from: a */
    public final void mo2224a(int i10, Object obj) throws C1567l {
        ?? M6028b;
        Handler handler;
        Surface surface;
        C5625o c5625o = this.f18214W1;
        if (i10 == 1) {
            if (obj instanceof Surface) {
                surface = (Surface) obj;
            } else {
                M6028b = 0;
            }
            if (M6028b == 0) {
                C5624n c5624n = this.f18223f2;
                if (c5624n != null) {
                    M6028b = surface;
                    M6028b = c5624n;
                } else {
                    C3213n c3213n = this.f9763d1;
                    if (c3213n != null && m6019E0(c3213n)) {
                        M6028b = surface;
                        M6028b = C5624n.m6028b(this.f18209Q1, c3213n.f9708f);
                        this.f18223f2 = M6028b;
                    }
                }
            }
            M6028b = surface;
            M6028b = surface;
            M6028b = surface;
            Surface surface2 = this.f18222e2;
            C11232c c11232c = this.f18211S1;
            if (surface2 == M6028b) {
                if (M6028b == 0 || M6028b == this.f18223f2) {
                    return;
                }
                C19773X c19773x = this.f18235r2;
                if (c19773x != null) {
                    c11232c.m12495s(c19773x);
                }
                Surface surface3 = this.f18222e2;
                if (surface3 == null || !this.f18225h2 || (handler = (Handler) c11232c.f33996Y) == null) {
                    return;
                }
                handler.post(new RunnableC5632v(c11232c, surface3, SystemClock.elapsedRealtime(), 0));
                return;
            }
            this.f18222e2 = M6028b;
            if (this.f18219b2 == null) {
                C5629s c5629s = c5625o.f18252b;
                c5629s.getClass();
                ?? r6 = M6028b instanceof C5624n ? 0 : M6028b;
                if (c5629s.f18273e != r6) {
                    c5629s.m6037b();
                    c5629s.f18273e = r6;
                    c5629s.m6039d(true);
                }
                c5625o.m6031c(1);
            }
            this.f18225h2 = false;
            int i11 = this.f4302t0;
            ?? r10 = this.f9756W0;
            if (r10 != 0 && this.f18219b2 == null) {
                if (AbstractC20817s.f66106a < 23 || M6028b == 0 || this.f18217Z1) {
                    m4106i0();
                    m4099T();
                } else {
                    r10.mo4065p(M6028b);
                }
            }
            if (M6028b == 0 || M6028b == this.f18223f2) {
                this.f18235r2 = null;
                C5615e c5615e = this.f18219b2;
                if (c5615e != null) {
                    C5616f c5616f = c5615e.f18176j;
                    c5616f.getClass();
                    int i12 = C20812n.f66095c.f66096a;
                    c5616f.f18187j = null;
                }
            } else {
                C19773X c19773x2 = this.f18235r2;
                if (c19773x2 != null) {
                    c11232c.m12495s(c19773x2);
                }
                if (i11 == 2) {
                    c5625o.m6030b(true);
                }
            }
            m6015A0();
            return;
        }
        if (i10 == 7) {
            obj.getClass();
            C1524B c1524b = (C1524B) obj;
            this.f18240w2 = c1524b;
            C5615e c5615e2 = this.f18219b2;
            if (c5615e2 != null) {
                c5615e2.f18176j.f18185h = c1524b;
                return;
            }
            return;
        }
        if (i10 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f18238u2 != iIntValue) {
                this.f18238u2 = iIntValue;
                if (this.f18237t2) {
                    m4106i0();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 16) {
            obj.getClass();
            this.f18236s2 = ((Integer) obj).intValue();
            InterfaceC3210k interfaceC3210k = this.f9756W0;
            if (interfaceC3210k != null && AbstractC20817s.f66106a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f18236s2));
                interfaceC3210k.setParameters(bundle);
                return;
            }
            return;
        }
        if (i10 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f18226i2 = iIntValue2;
            InterfaceC3210k interfaceC3210k2 = this.f9756W0;
            if (interfaceC3210k2 != null) {
                interfaceC3210k2.mo4064m(iIntValue2);
                return;
            }
            return;
        }
        if (i10 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            C5629s c5629s2 = c5625o.f18252b;
            if (c5629s2.f18278j == iIntValue3) {
                return;
            }
            c5629s2.f18278j = iIntValue3;
            c5629s2.m6039d(true);
            return;
        }
        if (i10 == 13) {
            obj.getClass();
            List list = (List) obj;
            this.f18221d2 = list;
            C5615e c5615e3 = this.f18219b2;
            if (c5615e3 != null) {
                ArrayList arrayList = c5615e3.f18169c;
                if (arrayList.equals(list)) {
                    return;
                }
                arrayList.clear();
                arrayList.addAll(list);
                c5615e3.m6002c();
                return;
            }
            return;
        }
        if (i10 != 14) {
            if (i10 == 11) {
                this.f9751R0 = (C1527E) obj;
                return;
            }
            return;
        }
        obj.getClass();
        C20812n c20812n = (C20812n) obj;
        if (c20812n.f66096a == 0 || c20812n.f66097b == 0) {
            return;
        }
        this.f18224g2 = c20812n;
        C5615e c5615e4 = this.f18219b2;
        if (c5615e4 != null) {
            Surface surface4 = this.f18222e2;
            AbstractC20800b.m21321i(surface4);
            c5615e4.m6004e(surface4, c20812n);
        }
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: b0 */
    public final void mo4101b0(long j10) {
        super.mo4101b0(j10);
        if (this.f18237t2) {
            return;
        }
        this.f18230m2--;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: c */
    public final void mo2390c() {
        C5615e c5615e = this.f18219b2;
        if (c5615e != null) {
            C5625o c5625o = c5615e.f18176j.f18179b;
            if (c5625o.f18254d == 0) {
                c5625o.f18254d = 1;
                return;
            }
            return;
        }
        C5625o c5625o2 = this.f18214W1;
        if (c5625o2.f18254d == 0) {
            c5625o2.f18254d = 1;
        }
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: c0 */
    public final void mo3343c0() {
        if (this.f18219b2 != null) {
            long j10 = this.f9744M1.f9719c;
        } else {
            this.f18214W1.m6031c(2);
        }
        m6015A0();
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: d0 */
    public final void mo4102d0(C0803g c0803g) {
        Surface surface;
        boolean z6 = this.f18237t2;
        if (!z6) {
            this.f18230m2++;
        }
        if (AbstractC20817s.f66106a >= 23 || !z6) {
            return;
        }
        long j10 = c0803g.f2228s0;
        m4114t0(j10);
        m6024z0(this.f18234q2);
        this.f9742L1.f4315e++;
        C5625o c5625o = this.f18214W1;
        boolean z10 = c5625o.f18254d != 3;
        c5625o.f18254d = 3;
        c5625o.f18261k.getClass();
        c5625o.f18256f = AbstractC20817s.m21390D(SystemClock.elapsedRealtime());
        if (z10 && (surface = this.f18222e2) != null) {
            C11232c c11232c = this.f18211S1;
            Handler handler = (Handler) c11232c.f33996Y;
            if (handler != null) {
                handler.post(new RunnableC5632v(c11232c, surface, SystemClock.elapsedRealtime(), 0));
            }
            this.f18225h2 = true;
        }
        mo4101b0(j10);
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: e0 */
    public final void mo4103e0(C19788o c19788o) throws C1567l {
        C5615e c5615e = this.f18219b2;
        if (c5615e == null) {
            return;
        }
        try {
            c5615e.m6001b(c19788o);
            throw null;
        } catch (C5634x e10) {
            throw m2389b(e10, c19788o, false, 7000);
        }
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: g0 */
    public final boolean mo3344g0(long j10, long j11, InterfaceC3210k interfaceC3210k, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z6, boolean z10, C19788o c19788o) throws C1567l {
        interfaceC3210k.getClass();
        C3219t c3219t = this.f9744M1;
        long j13 = j12 - c3219t.f9719c;
        int iM6029a = this.f18214W1.m6029a(j12, j10, j11, c3219t.f9718b, z10, this.f18215X1);
        if (iM6029a == 4) {
            return false;
        }
        if (z6 && !z10) {
            m6020F0(interfaceC3210k, i10);
            return true;
        }
        Surface surface = this.f18222e2;
        C5624n c5624n = this.f18223f2;
        C1458d c1458d = this.f18215X1;
        if (surface == c5624n && this.f18219b2 == null) {
            if (c1458d.f3833b >= 30000) {
                return false;
            }
            m6020F0(interfaceC3210k, i10);
            m6022H0(c1458d.f3833b);
            return true;
        }
        C5615e c5615e = this.f18219b2;
        if (c5615e != null) {
            try {
                c5615e.m6003d(j10, j11);
                C5615e c5615e2 = this.f18219b2;
                c5615e2.getClass();
                AbstractC20800b.m21320h(false);
                AbstractC20800b.m21320h(c5615e2.f18168b != -1);
                long j14 = c5615e2.f18173g;
                if (j14 != -9223372036854775807L) {
                    C5616f c5616f = c5615e2.f18176j;
                    if (c5616f.f18188k == 0) {
                        long j15 = c5616f.f18180c.f18295j;
                        if (j15 != -9223372036854775807L && j15 >= j14) {
                            c5615e2.m6002c();
                            c5615e2.f18173g = -9223372036854775807L;
                        }
                    }
                    return false;
                }
                AbstractC20800b.m21321i(null);
                throw null;
            } catch (C5634x e10) {
                throw m2389b(e10, e10.f18303Y, false, 7001);
            }
        }
        if (iM6029a == 0) {
            this.f4301s0.getClass();
            long jNanoTime = System.nanoTime();
            C1524B c1524b = this.f18240w2;
            if (c1524b != null) {
                c1524b.m2227d(j13, jNanoTime);
            }
            if (AbstractC20817s.f66106a >= 21) {
                m6018D0(interfaceC3210k, i10, jNanoTime);
            } else {
                m6017C0(interfaceC3210k, i10);
            }
            m6022H0(c1458d.f3833b);
            return true;
        }
        if (iM6029a != 1) {
            if (iM6029a == 2) {
                Trace.beginSection("dropVideoBuffer");
                interfaceC3210k.releaseOutputBuffer(i10, false);
                Trace.endSection();
                m6021G0(0, 1);
                m6022H0(c1458d.f3833b);
                return true;
            }
            if (iM6029a != 3) {
                if (iM6029a == 5) {
                    return false;
                }
                throw new IllegalStateException(String.valueOf(iM6029a));
            }
            m6020F0(interfaceC3210k, i10);
            m6022H0(c1458d.f3833b);
            return true;
        }
        long j16 = c1458d.f3834c;
        long j17 = c1458d.f3833b;
        if (AbstractC20817s.f66106a >= 21) {
            if (j16 == this.f18233p2) {
                m6020F0(interfaceC3210k, i10);
            } else {
                C1524B c1524b2 = this.f18240w2;
                if (c1524b2 != null) {
                    c1524b2.m2227d(j13, j16);
                }
                m6018D0(interfaceC3210k, i10, j16);
            }
            m6022H0(j17);
            this.f18233p2 = j16;
        } else {
            if (j17 >= 30000) {
                return false;
            }
            if (j17 > 11000) {
                try {
                    Thread.sleep((j17 - 10000) / 1000);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            C1524B c1524b3 = this.f18240w2;
            if (c1524b3 != null) {
                c1524b3.m2227d(j13, j16);
            }
            m6017C0(interfaceC3210k, i10);
            m6022H0(j17);
        }
        return true;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: i */
    public final String mo2392i() {
        return "MediaCodecVideoRenderer";
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: k */
    public final boolean mo2394k() {
        return this.f9734H1 && this.f18219b2 == null;
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: k0 */
    public final void mo4107k0() {
        super.mo4107k0();
        this.f18230m2 = 0;
    }

    @Override // p182H3.AbstractC3220u, p057C3.AbstractC1554d
    /* JADX INFO: renamed from: l */
    public final boolean mo2395l() {
        C5624n c5624n;
        boolean z6 = super.mo2395l() && this.f18219b2 == null;
        if (z6 && (((c5624n = this.f18223f2) != null && this.f18222e2 == c5624n) || this.f9756W0 == null || this.f18237t2)) {
            return true;
        }
        C5625o c5625o = this.f18214W1;
        if (z6 && c5625o.f18254d == 3) {
            c5625o.f18258h = -9223372036854775807L;
        } else {
            if (c5625o.f18258h == -9223372036854775807L) {
                return false;
            }
            c5625o.f18261k.getClass();
            if (SystemClock.elapsedRealtime() >= c5625o.f18258h) {
                c5625o.f18258h = -9223372036854775807L;
                return false;
            }
        }
        return true;
    }

    @Override // p182H3.AbstractC3220u, p057C3.AbstractC1554d
    /* JADX INFO: renamed from: m */
    public final void mo2396m() {
        C11232c c11232c = this.f18211S1;
        this.f18235r2 = null;
        C5615e c5615e = this.f18219b2;
        if (c5615e != null) {
            c5615e.f18176j.f18179b.m6031c(0);
        } else {
            this.f18214W1.m6031c(0);
        }
        m6015A0();
        this.f18225h2 = false;
        this.f18239v2 = null;
        try {
            super.mo2396m();
            C1556e c1556e = this.f9742L1;
            c11232c.getClass();
            synchronized (c1556e) {
            }
            Handler handler = (Handler) c11232c.f33996Y;
            if (handler != null) {
                handler.post(new RunnableC3724c(c11232c, 9, c1556e));
            }
        } finally {
            c11232c.m12486j(this.f9742L1);
            c11232c.m12495s(C19773X.f62650e);
        }
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: n */
    public final void mo2397n(boolean z6, boolean z10) {
        this.f9742L1 = new C1556e();
        C1559f0 c1559f0 = this.f4298p0;
        c1559f0.getClass();
        boolean z11 = c1559f0.f4340b;
        AbstractC20800b.m21320h((z11 && this.f18238u2 == 0) ? false : true);
        if (this.f18237t2 != z11) {
            this.f18237t2 = z11;
            m4106i0();
        }
        C1556e c1556e = this.f9742L1;
        C11232c c11232c = this.f18211S1;
        Handler handler = (Handler) c11232c.f33996Y;
        if (handler != null) {
            handler.post(new RunnableC5631u(c11232c, c1556e, 4));
        }
        boolean z12 = this.f18220c2;
        C5625o c5625o = this.f18214W1;
        if (!z12) {
            if ((this.f18221d2 != null || !this.f18210R1) && this.f18219b2 == null) {
                C0042V0 c0042v0 = new C0042V0(this.f18209Q1, c5625o);
                C20813o c20813o = this.f4301s0;
                c20813o.getClass();
                c0042v0.f209r0 = c20813o;
                AbstractC20800b.m21320h(!c0042v0.f204Y);
                if (((C5613c) c0042v0.f208q0) == null) {
                    if (((C5612b) c0042v0.f207p0) == null) {
                        c0042v0.f207p0 = new C5612b();
                    }
                    c0042v0.f208q0 = new C5613c((C5612b) c0042v0.f207p0);
                }
                C5616f c5616f = new C5616f(c0042v0);
                c0042v0.f204Y = true;
                this.f18219b2 = c5616f.f18178a;
            }
            this.f18220c2 = true;
        }
        C5615e c5615e = this.f18219b2;
        if (c5615e == null) {
            C20813o c20813o2 = this.f4301s0;
            c20813o2.getClass();
            c5625o.f18261k = c20813o2;
            c5625o.f18254d = z10 ? 1 : 0;
            return;
        }
        C13288c c13288c = new C13288c(this);
        EnumC13607a enumC13607a = EnumC13607a.f42988Y;
        c5615e.f18174h = c13288c;
        c5615e.f18175i = enumC13607a;
        C1524B c1524b = this.f18240w2;
        if (c1524b != null) {
            c5615e.f18176j.f18185h = c1524b;
        }
        if (this.f18222e2 != null && !this.f18224g2.equals(C20812n.f66095c)) {
            this.f18219b2.m6004e(this.f18222e2, this.f18224g2);
        }
        C5615e c5615e2 = this.f18219b2;
        float f10 = this.f9754U0;
        C5630t c5630t = c5615e2.f18176j.f18180c;
        c5630t.getClass();
        AbstractC20800b.m21316d(f10 > 0.0f);
        C5625o c5625o2 = c5630t.f18287b;
        if (f10 != c5625o2.f18260j) {
            c5625o2.f18260j = f10;
            C5629s c5629s = c5625o2.f18252b;
            c5629s.f18277i = f10;
            c5629s.f18281m = 0L;
            c5629s.f18284p = -1L;
            c5629s.f18282n = -1L;
            c5629s.m6039d(false);
        }
        List list = this.f18221d2;
        if (list != null) {
            C5615e c5615e3 = this.f18219b2;
            ArrayList arrayList = c5615e3.f18169c;
            if (!arrayList.equals(list)) {
                arrayList.clear();
                arrayList.addAll(list);
                c5615e3.m6002c();
            }
        }
        this.f18219b2.f18176j.f18179b.f18254d = z10 ? 1 : 0;
    }

    @Override // p182H3.AbstractC3220u, p057C3.AbstractC1554d
    /* JADX INFO: renamed from: o */
    public final void mo2398o(long j10, boolean z6) throws C1567l {
        C5615e c5615e = this.f18219b2;
        if (c5615e != null) {
            c5615e.m6000a(true);
            C5615e c5615e2 = this.f18219b2;
            long j11 = this.f9744M1.f9719c;
            c5615e2.getClass();
        }
        super.mo2398o(j10, z6);
        C5615e c5615e3 = this.f18219b2;
        C5625o c5625o = this.f18214W1;
        if (c5615e3 == null) {
            C5629s c5629s = c5625o.f18252b;
            c5629s.f18281m = 0L;
            c5629s.f18284p = -1L;
            c5629s.f18282n = -1L;
            c5625o.f18257g = -9223372036854775807L;
            c5625o.f18255e = -9223372036854775807L;
            c5625o.m6031c(1);
            c5625o.f18258h = -9223372036854775807L;
        }
        if (z6) {
            c5625o.m6030b(false);
        }
        m6015A0();
        this.f18229l2 = 0;
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: o0 */
    public final boolean mo4111o0(C3213n c3213n) {
        return this.f18222e2 != null || m6019E0(c3213n);
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: p */
    public final void mo2399p() {
        C5615e c5615e = this.f18219b2;
        if (c5615e == null || !this.f18210R1) {
            return;
        }
        C5616f c5616f = c5615e.f18176j;
        if (c5616f.f18189l == 2) {
            return;
        }
        C20815q c20815q = c5616f.f18186i;
        if (c20815q != null) {
            c20815q.f66101a.removeCallbacksAndMessages(null);
        }
        c5616f.f18187j = null;
        c5616f.f18189l = 2;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: q */
    public final void mo2400q() {
        try {
            try {
                m4088E();
                m4106i0();
                C7296c c7296c = this.f9750Q0;
                if (c7296c != null) {
                    c7296c.m7754F(null);
                }
                this.f9750Q0 = null;
                this.f18220c2 = false;
                if (this.f18223f2 != null) {
                    m6016B0();
                }
            } catch (Throwable th2) {
                C7296c c7296c2 = this.f9750Q0;
                if (c7296c2 != null) {
                    c7296c2.m7754F(null);
                }
                this.f9750Q0 = null;
                throw th2;
            }
        } catch (Throwable th3) {
            this.f18220c2 = false;
            if (this.f18223f2 != null) {
                m6016B0();
            }
            throw th3;
        }
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: q0 */
    public final int mo3347q0(C3221v c3221v, C19788o c19788o) {
        boolean z6;
        int i10 = 1;
        int i11 = 0;
        if (!AbstractC19754D.m20710h(c19788o.f62752m)) {
            return AbstractC0168G.m522k(0, 0, 0, 0);
        }
        boolean z10 = c19788o.f62756q != null;
        Context context = this.f18209Q1;
        List listM6013w0 = m6013w0(context, c3221v, c19788o, z10, false);
        if (z10 && listM6013w0.isEmpty()) {
            listM6013w0 = m6013w0(context, c3221v, c19788o, false, false);
        }
        if (listM6013w0.isEmpty()) {
            return AbstractC0168G.m522k(1, 0, 0, 0);
        }
        int i12 = c19788o.f62738J;
        if (i12 != 0 && i12 != 2) {
            return AbstractC0168G.m522k(2, 0, 0, 0);
        }
        C3213n c3213n = (C3213n) listM6013w0.get(0);
        boolean zM4079d = c3213n.m4079d(c19788o);
        if (!zM4079d) {
            int i13 = 1;
            while (true) {
                if (i13 >= listM6013w0.size()) {
                    z6 = true;
                    break;
                }
                C3213n c3213n2 = (C3213n) listM6013w0.get(i13);
                if (c3213n2.m4079d(c19788o)) {
                    zM4079d = true;
                    z6 = false;
                    c3213n = c3213n2;
                    break;
                }
                i13++;
            }
        } else {
            z6 = true;
            break;
        }
        int i14 = zM4079d ? 4 : 3;
        int i15 = c3213n.m4080e(c19788o) ? 16 : 8;
        int i16 = c3213n.f9709g ? 64 : 0;
        int i17 = z6 ? 128 : 0;
        if (AbstractC20817s.f66106a >= 26 && "video/dolby-vision".equals(c19788o.f62752m) && !AbstractC5620j.m6009a(context)) {
            i17 = 256;
        }
        if (zM4079d) {
            List listM6013w1 = m6013w0(context, c3221v, c19788o, z10, true);
            if (!listM6013w1.isEmpty()) {
                Pattern pattern = AbstractC3199A.f9651a;
                ArrayList arrayList = new ArrayList(listM6013w1);
                Collections.sort(arrayList, new C1817m0(new C0072l(c19788o, 27), i10));
                C3213n c3213n3 = (C3213n) arrayList.get(0);
                if (c3213n3.m4079d(c19788o) && c3213n3.m4080e(c19788o)) {
                    i11 = 32;
                }
            }
        }
        return i14 | i15 | i11 | i16 | i17;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: r */
    public final void mo2401r() {
        this.f18228k2 = 0;
        this.f4301s0.getClass();
        this.f18227j2 = SystemClock.elapsedRealtime();
        this.f18231n2 = 0L;
        this.f18232o2 = 0;
        C5615e c5615e = this.f18219b2;
        if (c5615e != null) {
            c5615e.f18176j.f18179b.m6032d();
        } else {
            this.f18214W1.m6032d();
        }
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: s */
    public final void mo2402s() {
        m6023y0();
        int i10 = this.f18232o2;
        if (i10 != 0) {
            long j10 = this.f18231n2;
            C11232c c11232c = this.f18211S1;
            Handler handler = (Handler) c11232c.f33996Y;
            if (handler != null) {
                handler.post(new RunnableC5631u(c11232c, j10, i10));
            }
            this.f18231n2 = 0L;
            this.f18232o2 = 0;
        }
        C5615e c5615e = this.f18219b2;
        if (c5615e != null) {
            c5615e.f18176j.f18179b.m6033e();
        } else {
            this.f18214W1.m6033e();
        }
    }

    @Override // p182H3.AbstractC3220u, p057C3.AbstractC1554d
    /* JADX INFO: renamed from: v */
    public final void mo2405v(long j10, long j11) throws C1567l {
        super.mo2405v(j10, j11);
        C5615e c5615e = this.f18219b2;
        if (c5615e != null) {
            try {
                c5615e.m6003d(j10, j11);
            } catch (C5634x e10) {
                throw m2389b(e10, e10.f18303Y, false, 7001);
            }
        }
    }

    @Override // p182H3.AbstractC3220u, p057C3.AbstractC1554d
    /* JADX INFO: renamed from: y */
    public final void mo2408y(float f10, float f11) throws C1567l {
        super.mo2408y(f10, f11);
        C5615e c5615e = this.f18219b2;
        if (c5615e == null) {
            C5625o c5625o = this.f18214W1;
            if (f10 == c5625o.f18260j) {
                return;
            }
            c5625o.f18260j = f10;
            C5629s c5629s = c5625o.f18252b;
            c5629s.f18277i = f10;
            c5629s.f18281m = 0L;
            c5629s.f18284p = -1L;
            c5629s.f18282n = -1L;
            c5629s.m6039d(false);
            return;
        }
        C5630t c5630t = c5615e.f18176j.f18180c;
        c5630t.getClass();
        AbstractC20800b.m21316d(f10 > 0.0f);
        C5625o c5625o2 = c5630t.f18287b;
        if (f10 == c5625o2.f18260j) {
            return;
        }
        c5625o2.f18260j = f10;
        C5629s c5629s2 = c5625o2.f18252b;
        c5629s2.f18277i = f10;
        c5629s2.f18281m = 0L;
        c5629s2.f18284p = -1L;
        c5629s2.f18282n = -1L;
        c5629s2.m6039d(false);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m6023y0() {
        if (this.f18228k2 > 0) {
            this.f4301s0.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f18227j2;
            int i10 = this.f18228k2;
            C11232c c11232c = this.f18211S1;
            Handler handler = (Handler) c11232c.f33996Y;
            if (handler != null) {
                handler.post(new RunnableC5631u(c11232c, i10, j10));
            }
            this.f18228k2 = 0;
            this.f18227j2 = jElapsedRealtime;
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m6024z0(C19773X c19773x) {
        if (c19773x.equals(C19773X.f62650e) || c19773x.equals(this.f18235r2)) {
            return;
        }
        this.f18235r2 = c19773x;
        this.f18211S1.m12495s(c19773x);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0126  */
    /* JADX WARN: Code duplicated, block: B:103:0x012f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0133  */
    /* JADX WARN: Code duplicated, block: B:107:0x013c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0140  */
    /* JADX WARN: Code duplicated, block: B:111:0x0149  */
    /* JADX WARN: Code duplicated, block: B:112:0x014d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0156  */
    /* JADX WARN: Code duplicated, block: B:116:0x015a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0163  */
    /* JADX WARN: Code duplicated, block: B:120:0x0167  */
    /* JADX WARN: Code duplicated, block: B:123:0x0170  */
    /* JADX WARN: Code duplicated, block: B:124:0x0174  */
    /* JADX WARN: Code duplicated, block: B:127:0x017d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0181  */
    /* JADX WARN: Code duplicated, block: B:131:0x018a  */
    /* JADX WARN: Code duplicated, block: B:132:0x018e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0197  */
    /* JADX WARN: Code duplicated, block: B:136:0x019b  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:151:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:155:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:159:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:163:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:164:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:167:0x0208  */
    /* JADX WARN: Code duplicated, block: B:168:0x020c  */
    /* JADX WARN: Code duplicated, block: B:171:0x0216  */
    /* JADX WARN: Code duplicated, block: B:172:0x021a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0224  */
    /* JADX WARN: Code duplicated, block: B:176:0x0228  */
    /* JADX WARN: Code duplicated, block: B:179:0x0232  */
    /* JADX WARN: Code duplicated, block: B:180:0x0236  */
    /* JADX WARN: Code duplicated, block: B:183:0x0240  */
    /* JADX WARN: Code duplicated, block: B:184:0x0244  */
    /* JADX WARN: Code duplicated, block: B:187:0x024e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0252  */
    /* JADX WARN: Code duplicated, block: B:191:0x025c  */
    /* JADX WARN: Code duplicated, block: B:192:0x0260  */
    /* JADX WARN: Code duplicated, block: B:195:0x026a  */
    /* JADX WARN: Code duplicated, block: B:196:0x026e  */
    /* JADX WARN: Code duplicated, block: B:199:0x0278  */
    /* JADX WARN: Code duplicated, block: B:200:0x027c  */
    /* JADX WARN: Code duplicated, block: B:203:0x0286  */
    /* JADX WARN: Code duplicated, block: B:204:0x028a  */
    /* JADX WARN: Code duplicated, block: B:207:0x0294  */
    /* JADX WARN: Code duplicated, block: B:208:0x0298  */
    /* JADX WARN: Code duplicated, block: B:211:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:212:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:215:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:216:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:219:0x02be  */
    /* JADX WARN: Code duplicated, block: B:220:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:223:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:224:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:227:0x02da  */
    /* JADX WARN: Code duplicated, block: B:228:0x02de  */
    /* JADX WARN: Code duplicated, block: B:231:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:232:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:235:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:236:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:239:0x0304  */
    /* JADX WARN: Code duplicated, block: B:240:0x0308  */
    /* JADX WARN: Code duplicated, block: B:243:0x0312  */
    /* JADX WARN: Code duplicated, block: B:244:0x0316  */
    /* JADX WARN: Code duplicated, block: B:247:0x0320  */
    /* JADX WARN: Code duplicated, block: B:248:0x0324  */
    /* JADX WARN: Code duplicated, block: B:251:0x032f  */
    /* JADX WARN: Code duplicated, block: B:252:0x0333  */
    /* JADX WARN: Code duplicated, block: B:255:0x033d  */
    /* JADX WARN: Code duplicated, block: B:256:0x0341  */
    /* JADX WARN: Code duplicated, block: B:259:0x034b  */
    /* JADX WARN: Code duplicated, block: B:260:0x034f  */
    /* JADX WARN: Code duplicated, block: B:263:0x0359  */
    /* JADX WARN: Code duplicated, block: B:264:0x035d  */
    /* JADX WARN: Code duplicated, block: B:267:0x0367  */
    /* JADX WARN: Code duplicated, block: B:268:0x036b  */
    /* JADX WARN: Code duplicated, block: B:271:0x0375  */
    /* JADX WARN: Code duplicated, block: B:272:0x0379  */
    /* JADX WARN: Code duplicated, block: B:275:0x0383  */
    /* JADX WARN: Code duplicated, block: B:276:0x0387  */
    /* JADX WARN: Code duplicated, block: B:279:0x0391  */
    /* JADX WARN: Code duplicated, block: B:280:0x0395  */
    /* JADX WARN: Code duplicated, block: B:283:0x039f  */
    /* JADX WARN: Code duplicated, block: B:284:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:287:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:288:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:291:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:292:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:295:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:296:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:299:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:300:0x03db  */
    /* JADX WARN: Code duplicated, block: B:303:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:304:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:307:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:308:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:311:0x0401  */
    /* JADX WARN: Code duplicated, block: B:312:0x0405  */
    /* JADX WARN: Code duplicated, block: B:315:0x040f  */
    /* JADX WARN: Code duplicated, block: B:316:0x0413  */
    /* JADX WARN: Code duplicated, block: B:319:0x041d  */
    /* JADX WARN: Code duplicated, block: B:320:0x0421  */
    /* JADX WARN: Code duplicated, block: B:323:0x042b  */
    /* JADX WARN: Code duplicated, block: B:324:0x042f  */
    /* JADX WARN: Code duplicated, block: B:327:0x0439  */
    /* JADX WARN: Code duplicated, block: B:328:0x043d  */
    /* JADX WARN: Code duplicated, block: B:331:0x0447  */
    /* JADX WARN: Code duplicated, block: B:332:0x044b  */
    /* JADX WARN: Code duplicated, block: B:335:0x0455  */
    /* JADX WARN: Code duplicated, block: B:336:0x0459  */
    /* JADX WARN: Code duplicated, block: B:339:0x0463  */
    /* JADX WARN: Code duplicated, block: B:340:0x0467  */
    /* JADX WARN: Code duplicated, block: B:343:0x0471  */
    /* JADX WARN: Code duplicated, block: B:344:0x0475  */
    /* JADX WARN: Code duplicated, block: B:347:0x047f  */
    /* JADX WARN: Code duplicated, block: B:348:0x0483  */
    /* JADX WARN: Code duplicated, block: B:351:0x048d  */
    /* JADX WARN: Code duplicated, block: B:352:0x0491  */
    /* JADX WARN: Code duplicated, block: B:355:0x049b  */
    /* JADX WARN: Code duplicated, block: B:356:0x049f  */
    /* JADX WARN: Code duplicated, block: B:359:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:360:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:363:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:364:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:367:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:368:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:371:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:372:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:375:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:376:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:379:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:380:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:383:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:384:0x0501  */
    /* JADX WARN: Code duplicated, block: B:387:0x050b  */
    /* JADX WARN: Code duplicated, block: B:388:0x050f  */
    /* JADX WARN: Code duplicated, block: B:391:0x0519  */
    /* JADX WARN: Code duplicated, block: B:392:0x051d  */
    /* JADX WARN: Code duplicated, block: B:395:0x0527  */
    /* JADX WARN: Code duplicated, block: B:396:0x052b  */
    /* JADX WARN: Code duplicated, block: B:399:0x0535  */
    /* JADX WARN: Code duplicated, block: B:400:0x0539  */
    /* JADX WARN: Code duplicated, block: B:403:0x0543  */
    /* JADX WARN: Code duplicated, block: B:404:0x0547  */
    /* JADX WARN: Code duplicated, block: B:407:0x0551  */
    /* JADX WARN: Code duplicated, block: B:408:0x0555  */
    /* JADX WARN: Code duplicated, block: B:411:0x055f  */
    /* JADX WARN: Code duplicated, block: B:412:0x0563  */
    /* JADX WARN: Code duplicated, block: B:415:0x056d  */
    /* JADX WARN: Code duplicated, block: B:416:0x0571  */
    /* JADX WARN: Code duplicated, block: B:419:0x057b  */
    /* JADX WARN: Code duplicated, block: B:420:0x057f  */
    /* JADX WARN: Code duplicated, block: B:423:0x0589  */
    /* JADX WARN: Code duplicated, block: B:424:0x058d  */
    /* JADX WARN: Code duplicated, block: B:427:0x0597  */
    /* JADX WARN: Code duplicated, block: B:428:0x059b  */
    /* JADX WARN: Code duplicated, block: B:431:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:432:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:435:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:436:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:439:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:440:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:443:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:444:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:447:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:448:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:451:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:452:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:455:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:456:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:459:0x0608  */
    /* JADX WARN: Code duplicated, block: B:460:0x060c  */
    /* JADX WARN: Code duplicated, block: B:463:0x0616  */
    /* JADX WARN: Code duplicated, block: B:464:0x061a  */
    /* JADX WARN: Code duplicated, block: B:467:0x0624  */
    /* JADX WARN: Code duplicated, block: B:468:0x0628  */
    /* JADX WARN: Code duplicated, block: B:471:0x0632  */
    /* JADX WARN: Code duplicated, block: B:472:0x0636  */
    /* JADX WARN: Code duplicated, block: B:475:0x0640  */
    /* JADX WARN: Code duplicated, block: B:476:0x0644  */
    /* JADX WARN: Code duplicated, block: B:479:0x064e  */
    /* JADX WARN: Code duplicated, block: B:480:0x0652  */
    /* JADX WARN: Code duplicated, block: B:483:0x065c  */
    /* JADX WARN: Code duplicated, block: B:484:0x0660  */
    /* JADX WARN: Code duplicated, block: B:487:0x066a  */
    /* JADX WARN: Code duplicated, block: B:488:0x066e  */
    /* JADX WARN: Code duplicated, block: B:491:0x0678  */
    /* JADX WARN: Code duplicated, block: B:492:0x067c  */
    /* JADX WARN: Code duplicated, block: B:495:0x0686  */
    /* JADX WARN: Code duplicated, block: B:496:0x068a  */
    /* JADX WARN: Code duplicated, block: B:499:0x0694  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:500:0x0698  */
    /* JADX WARN: Code duplicated, block: B:503:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:504:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:507:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:508:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:511:0x06be  */
    /* JADX WARN: Code duplicated, block: B:512:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:515:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:516:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:519:0x06da  */
    /* JADX WARN: Code duplicated, block: B:520:0x06de  */
    /* JADX WARN: Code duplicated, block: B:523:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:524:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:527:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:528:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:531:0x0705  */
    /* JADX WARN: Code duplicated, block: B:532:0x0709  */
    /* JADX WARN: Code duplicated, block: B:535:0x0713  */
    /* JADX WARN: Code duplicated, block: B:536:0x0717  */
    /* JADX WARN: Code duplicated, block: B:539:0x0721  */
    /* JADX WARN: Code duplicated, block: B:540:0x0725  */
    /* JADX WARN: Code duplicated, block: B:543:0x072f  */
    /* JADX WARN: Code duplicated, block: B:544:0x0733  */
    /* JADX WARN: Code duplicated, block: B:547:0x073d  */
    /* JADX WARN: Code duplicated, block: B:548:0x0740  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f A[Catch: all -> 0x08c2, TRY_LEAVE, TryCatch #0 {all -> 0x08c2, blocks: (B:7:0x001d, B:9:0x0021, B:11:0x0025, B:662:0x08bd, B:51:0x0094, B:54:0x009f, B:96:0x0117, B:665:0x08c4), top: B:670:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:551:0x074a  */
    /* JADX WARN: Code duplicated, block: B:552:0x074d  */
    /* JADX WARN: Code duplicated, block: B:555:0x0757  */
    /* JADX WARN: Code duplicated, block: B:558:0x0761  */
    /* JADX WARN: Code duplicated, block: B:559:0x0765  */
    /* JADX WARN: Code duplicated, block: B:562:0x076f  */
    /* JADX WARN: Code duplicated, block: B:563:0x0773  */
    /* JADX WARN: Code duplicated, block: B:566:0x077d  */
    /* JADX WARN: Code duplicated, block: B:567:0x0781  */
    /* JADX WARN: Code duplicated, block: B:570:0x078b  */
    /* JADX WARN: Code duplicated, block: B:571:0x078f  */
    /* JADX WARN: Code duplicated, block: B:574:0x0799  */
    /* JADX WARN: Code duplicated, block: B:575:0x079d  */
    /* JADX WARN: Code duplicated, block: B:578:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:579:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:582:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:583:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:586:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:587:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:590:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:591:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:594:0x07df  */
    /* JADX WARN: Code duplicated, block: B:595:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:598:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:599:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:602:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:603:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:606:0x0809  */
    /* JADX WARN: Code duplicated, block: B:607:0x080d  */
    /* JADX WARN: Code duplicated, block: B:610:0x0817  */
    /* JADX WARN: Code duplicated, block: B:611:0x081b  */
    /* JADX WARN: Code duplicated, block: B:614:0x0825  */
    /* JADX WARN: Code duplicated, block: B:615:0x0829  */
    /* JADX WARN: Code duplicated, block: B:618:0x0833  */
    /* JADX WARN: Code duplicated, block: B:619:0x0837  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:622:0x0841  */
    /* JADX WARN: Code duplicated, block: B:623:0x0845  */
    /* JADX WARN: Code duplicated, block: B:626:0x084f  */
    /* JADX WARN: Code duplicated, block: B:627:0x0853  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:630:0x085d  */
    /* JADX WARN: Code duplicated, block: B:631:0x085f  */
    /* JADX WARN: Code duplicated, block: B:634:0x0869  */
    /* JADX WARN: Code duplicated, block: B:635:0x086b  */
    /* JADX WARN: Code duplicated, block: B:638:0x0875  */
    /* JADX WARN: Code duplicated, block: B:639:0x0877  */
    /* JADX WARN: Code duplicated, block: B:642:0x0881  */
    /* JADX WARN: Code duplicated, block: B:643:0x0883  */
    /* JADX WARN: Code duplicated, block: B:646:0x088d  */
    /* JADX WARN: Code duplicated, block: B:647:0x088f  */
    /* JADX WARN: Code duplicated, block: B:650:0x0899  */
    /* JADX WARN: Code duplicated, block: B:651:0x089b  */
    /* JADX WARN: Code duplicated, block: B:654:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:655:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:658:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:660:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:680:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:700:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:710:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:720:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:726:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:740:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:749:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:750:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:751:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:752:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:756:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:760:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:779:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:780:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:782:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:783:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:784:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:785:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:786:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:787:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:788:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:789:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:790:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:791:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:792:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:796:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:797:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:798:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:799:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:800:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:801:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:802:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:803:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:804:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:805:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:806:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:808:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:809:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:810:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:811:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:812:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:813:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:814:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:815:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:816:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:817:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:818:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:819:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:820:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:821:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:822:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:823:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:824:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:825:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:826:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:827:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:828:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x0108  */
    /* JADX WARN: Code duplicated, block: B:93:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0117 A[Catch: all -> 0x08c2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x08c2, blocks: (B:7:0x001d, B:9:0x0021, B:11:0x0025, B:662:0x08bd, B:51:0x0094, B:54:0x009f, B:96:0x0117, B:665:0x08c4), top: B:670:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0123  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: u0 */
    public static boolean m6011u0(String str) {
        String str2;
        byte b;
        String str3;
        byte b10;
        byte b11 = 26;
        boolean z6 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C5622l.class) {
            try {
                if (!f18207y2) {
                    int i10 = AbstractC20817s.f66106a;
                    if (i10 <= 28) {
                        String str4 = AbstractC20817s.f66107b;
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case -1339091551:
                                b10 = !str4.equals("dangal") ? (byte) -1 : (byte) 0;
                                break;
                            case -1220081023:
                                b10 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 1;
                                break;
                            case -1220066608:
                                b10 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                                break;
                            case -1012436106:
                                b10 = !str4.equals("oneday") ? (byte) -1 : (byte) 3;
                                break;
                            case -760312546:
                                b10 = !str4.equals("aquaman") ? (byte) -1 : (byte) 4;
                                break;
                            case -64886864:
                                b10 = !str4.equals("magnolia") ? (byte) -1 : (byte) 5;
                                break;
                            case 3415681:
                                b10 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                                break;
                            case 825323514:
                                b10 = !str4.equals("machuca") ? (byte) -1 : (byte) 7;
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        switch (b10) {
                            default:
                                if (i10 <= 27 || !"HWEML".equals(AbstractC20817s.f66107b)) {
                                    str2 = AbstractC20817s.f66109d;
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -349662828:
                                            if (!str2.equals("AFTJMST12")) {
                                                b = 0;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -321033677:
                                            if (!str2.equals("AFTKMST12")) {
                                                b = 1;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006354:
                                            if (!str2.equals("AFTA")) {
                                                b = 2;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006367:
                                            if (!str2.equals("AFTN")) {
                                                b = 3;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006371:
                                            if (!str2.equals("AFTR")) {
                                                b = 4;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1785421873:
                                            if (!str2.equals("AFTEU011")) {
                                                b = 5;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1785421876:
                                            if (!str2.equals("AFTEU014")) {
                                                b = 6;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1798172390:
                                            if (!str2.equals("AFTSO001")) {
                                                b = 7;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2119412532:
                                            if (!str2.equals("AFTEUFF014")) {
                                                b = 8;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    switch (b) {
                                        default:
                                            if (i10 <= 26) {
                                                str3 = AbstractC20817s.f66107b;
                                                str3.getClass();
                                                switch (str3.hashCode()) {
                                                    case -2144781245:
                                                        if (!str3.equals("GIONEE_SWW1609")) {
                                                            b11 = 0;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -2144781185:
                                                        if (!str3.equals("GIONEE_SWW1627")) {
                                                            b11 = 1;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -2144781160:
                                                        if (!str3.equals("GIONEE_SWW1631")) {
                                                            b11 = 2;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -2097309513:
                                                        if (!str3.equals("K50a40")) {
                                                            b11 = 3;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -2022874474:
                                                        if (!str3.equals("CP8676_I02")) {
                                                            b11 = 4;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1978993182:
                                                        if (!str3.equals("NX541J")) {
                                                            b11 = 5;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1978990237:
                                                        if (!str3.equals("NX573J")) {
                                                            b11 = 6;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1936688988:
                                                        if (!str3.equals("PGN528")) {
                                                            b11 = 7;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1936688066:
                                                        if (!str3.equals("PGN610")) {
                                                            b11 = 8;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1936688065:
                                                        if (!str3.equals("PGN611")) {
                                                            b11 = 9;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1931988508:
                                                        if (!str3.equals("AquaPowerM")) {
                                                            b11 = 10;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1885099851:
                                                        if (!str3.equals("RAIJIN")) {
                                                            b11 = 11;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1696512866:
                                                        if (!str3.equals("XT1663")) {
                                                            b11 = 12;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1680025915:
                                                        if (!str3.equals("ComioS1")) {
                                                            b11 = 13;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1615810839:
                                                        if (!str3.equals("Phantom6")) {
                                                            b11 = 14;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1600724499:
                                                        if (!str3.equals("pacificrim")) {
                                                            b11 = 15;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1554255044:
                                                        if (!str3.equals("vernee_M5")) {
                                                            b11 = 16;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1481772737:
                                                        if (!str3.equals("panell_dl")) {
                                                            b11 = 17;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1481772730:
                                                        if (!str3.equals("panell_ds")) {
                                                            b11 = 18;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1481772729:
                                                        if (!str3.equals("panell_dt")) {
                                                            b11 = 19;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1320080169:
                                                        if (!str3.equals("GiONEE_GBL7319")) {
                                                            b11 = 20;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1217592143:
                                                        if (!str3.equals("BRAVIA_ATV2")) {
                                                            b11 = 21;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1180384755:
                                                        if (!str3.equals("iris60")) {
                                                            b11 = 22;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1139198265:
                                                        if (!str3.equals("Slate_Pro")) {
                                                            b11 = 23;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1052835013:
                                                        if (!str3.equals("namath")) {
                                                            b11 = 24;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -993250464:
                                                        if (!str3.equals("A10-70F")) {
                                                            b11 = 25;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -993250458:
                                                        if (!str3.equals("A10-70L")) {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -965403638:
                                                        if (!str3.equals("s905x018")) {
                                                            b11 = 27;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -958336948:
                                                        if (!str3.equals("ELUGA_Ray_X")) {
                                                            b11 = 28;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -879245230:
                                                        if (!str3.equals("tcl_eu")) {
                                                            b11 = 29;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -842500323:
                                                        if (!str3.equals("nicklaus_f")) {
                                                            b11 = 30;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -821392978:
                                                        if (!str3.equals("A7000-a")) {
                                                            b11 = 31;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -797483286:
                                                        if (!str3.equals(TfazcFv.GPmBYE)) {
                                                            b11 = 32;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -794946968:
                                                        if (!str3.equals("watson")) {
                                                            b11 = 33;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -788334647:
                                                        if (!str3.equals("whyred")) {
                                                            b11 = 34;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -782144577:
                                                        if (!str3.equals("OnePlus5T")) {
                                                            b11 = 35;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -575125681:
                                                        if (!str3.equals("GiONEE_CBL7513")) {
                                                            b11 = 36;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -521118391:
                                                        if (!str3.equals("GIONEE_GBL7360")) {
                                                            b11 = 37;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -430914369:
                                                        if (!str3.equals("Pixi4-7_3G")) {
                                                            b11 = 38;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -290434366:
                                                        if (!str3.equals("taido_row")) {
                                                            b11 = 39;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -282781963:
                                                        if (!str3.equals("BLACK-1X")) {
                                                            b11 = 40;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -277133239:
                                                        if (!str3.equals("Z12_PRO")) {
                                                            b11 = 41;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -173639913:
                                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                                            b11 = 42;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -56598463:
                                                        if (!str3.equals("woods_fn")) {
                                                            b11 = 43;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case TokenTypes.PRIVACY /* 2126 */:
                                                        if (!str3.equals("C1")) {
                                                            b11 = 44;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2564:
                                                        if (!str3.equals("Q5")) {
                                                            b11 = 45;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2715:
                                                        if (!str3.equals("V1")) {
                                                            b11 = 46;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2719:
                                                        if (!str3.equals("V5")) {
                                                            b11 = 47;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 3091:
                                                        if (!str3.equals("b5")) {
                                                            b11 = 48;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 3483:
                                                        if (!str3.equals("mh")) {
                                                            b11 = 49;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 73405:
                                                        if (!str3.equals(efyhmdM.gpZSZuOj)) {
                                                            b11 = 50;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 75537:
                                                        if (!str3.equals("M04")) {
                                                            b11 = 51;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 75739:
                                                        if (!str3.equals("M5c")) {
                                                            b11 = 52;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 76779:
                                                        if (!str3.equals("MX6")) {
                                                            b11 = 53;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 78669:
                                                        if (!str3.equals("P85")) {
                                                            b11 = 54;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 79305:
                                                        if (!str3.equals("PLE")) {
                                                            b11 = 55;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 80618:
                                                        if (!str3.equals("QX1")) {
                                                            b11 = 56;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 88274:
                                                        if (!str3.equals("Z80")) {
                                                            b11 = 57;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 98846:
                                                        if (!str3.equals("cv1")) {
                                                            b11 = 58;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 98848:
                                                        if (!str3.equals("cv3")) {
                                                            b11 = 59;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 99329:
                                                        if (!str3.equals("deb")) {
                                                            b11 = 60;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 101481:
                                                        if (!str3.equals("flo")) {
                                                            b11 = 61;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1513190:
                                                        if (!str3.equals("1601")) {
                                                            b11 = 62;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1514184:
                                                        if (!str3.equals("1713")) {
                                                            b11 = 63;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1514185:
                                                        if (!str3.equals("1714")) {
                                                            b11 = 64;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2133089:
                                                        if (!str3.equals("F01H")) {
                                                            b11 = 65;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2133091:
                                                        if (!str3.equals("F01J")) {
                                                            b11 = 66;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2133120:
                                                        if (!str3.equals("F02H")) {
                                                            b11 = 67;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2133151:
                                                        if (!str3.equals("F03H")) {
                                                            b11 = 68;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2133182:
                                                        if (!str3.equals("F04H")) {
                                                            b11 = 69;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2133184:
                                                        if (!str3.equals("F04J")) {
                                                            b11 = 70;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2436959:
                                                        if (!str3.equals("P681")) {
                                                            b11 = 71;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2463773:
                                                        if (!str3.equals("Q350")) {
                                                            b11 = 72;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2464648:
                                                        if (!str3.equals("Q427")) {
                                                            b11 = 73;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2689555:
                                                        if (!str3.equals("XE2X")) {
                                                            b11 = 74;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 3154429:
                                                        if (!str3.equals("fugu")) {
                                                            b11 = 75;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 3284551:
                                                        if (!str3.equals("kate")) {
                                                            b11 = 76;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 3351335:
                                                        if (!str3.equals("mido")) {
                                                            b11 = 77;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 3386211:
                                                        if (!str3.equals("p212")) {
                                                            b11 = 78;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 41325051:
                                                        if (!str3.equals("MEIZU_M5")) {
                                                            b11 = 79;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 51349633:
                                                        if (!str3.equals("601LV")) {
                                                            b11 = 80;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 51350594:
                                                        if (!str3.equals("602LV")) {
                                                            b11 = 81;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 55178625:
                                                        if (!str3.equals("Aura_Note_2")) {
                                                            b11 = 82;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 61542055:
                                                        if (!str3.equals("A1601")) {
                                                            b11 = 83;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 65355429:
                                                        if (!str3.equals("E5643")) {
                                                            b11 = 84;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 66214468:
                                                        if (!str3.equals("F3111")) {
                                                            b11 = 85;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 66214470:
                                                        if (!str3.equals("F3113")) {
                                                            b11 = 86;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 66214473:
                                                        if (!str3.equals("F3116")) {
                                                            b11 = 87;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 66215429:
                                                        if (!str3.equals("F3211")) {
                                                            b11 = 88;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 66215431:
                                                        if (!str3.equals("F3213")) {
                                                            b11 = 89;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 66215433:
                                                        if (!str3.equals("F3215")) {
                                                            b11 = 90;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 66216390:
                                                        if (!str3.equals("F3311")) {
                                                            b11 = 91;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 76402249:
                                                        if (!str3.equals("PRO7S")) {
                                                            b11 = 92;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 76404105:
                                                        if (!str3.equals("Q4260")) {
                                                            b11 = 93;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 76404911:
                                                        if (!str3.equals("Q4310")) {
                                                            b11 = 94;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 80963634:
                                                        if (!str3.equals("V23GB")) {
                                                            b11 = 95;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 82882791:
                                                        if (!str3.equals("X3_HK")) {
                                                            b11 = 96;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 98715550:
                                                        if (!str3.equals("i9031")) {
                                                            b11 = 97;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 101370885:
                                                        if (!str3.equals("l5460")) {
                                                            b11 = 98;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 102844228:
                                                        if (!str3.equals("le_x6")) {
                                                            b11 = 99;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 165221241:
                                                        if (!str3.equals("A2016a40")) {
                                                            b11 = 100;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 182191441:
                                                        if (!str3.equals("CPY83_I00")) {
                                                            b11 = 101;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 245388979:
                                                        if (!str3.equals(CxcULo.ZldurPqTHvNEK)) {
                                                            b11 = 102;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 287431619:
                                                        if (!str3.equals("griffin")) {
                                                            b11 = 103;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 307593612:
                                                        if (!str3.equals("A7010a48")) {
                                                            b11 = 104;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 308517133:
                                                        if (!str3.equals("A7020a48")) {
                                                            b11 = 105;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 316215098:
                                                        if (!str3.equals("TB3-730F")) {
                                                            b11 = 106;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 316215116:
                                                        if (!str3.equals("TB3-730X")) {
                                                            b11 = 107;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 316246811:
                                                        if (!str3.equals("TB3-850F")) {
                                                            b11 = 108;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 316246818:
                                                        if (!str3.equals("TB3-850M")) {
                                                            b11 = 109;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 407160593:
                                                        if (!str3.equals("Pixi5-10_4G")) {
                                                            b11 = 110;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 507412548:
                                                        if (!str3.equals("QM16XE_U")) {
                                                            b11 = 111;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 793982701:
                                                        if (!str3.equals("GIONEE_WBL5708")) {
                                                            b11 = 112;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 794038622:
                                                        if (!str3.equals("GIONEE_WBL7365")) {
                                                            b11 = 113;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 794040393:
                                                        if (!str3.equals("GIONEE_WBL7519")) {
                                                            b11 = 114;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 835649806:
                                                        if (!str3.equals("manning")) {
                                                            b11 = 115;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 917340916:
                                                        if (!str3.equals("A7000plus")) {
                                                            b11 = 116;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 958008161:
                                                        if (!str3.equals("j2xlteins")) {
                                                            b11 = 117;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1060579533:
                                                        if (!str3.equals("panell_d")) {
                                                            b11 = 118;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1150207623:
                                                        if (!str3.equals("LS-5017")) {
                                                            b11 = 119;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1176899427:
                                                        if (!str3.equals("itel_S41")) {
                                                            b11 = 120;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1280332038:
                                                        if (!str3.equals("hwALE-H")) {
                                                            b11 = 121;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1306947716:
                                                        if (!str3.equals("EverStar_S")) {
                                                            b11 = 122;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1349174697:
                                                        if (!str3.equals("htc_e56ml_dtul")) {
                                                            b11 = 123;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1522194893:
                                                        if (!str3.equals("woods_f")) {
                                                            b11 = 124;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1691543273:
                                                        if (!str3.equals(HJrCuD.gPQvSSO)) {
                                                            b11 = 125;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1691544261:
                                                        if (!str3.equals("CPH1715")) {
                                                            b11 = 126;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1709443163:
                                                        if (!str3.equals("iball8735_9806")) {
                                                            b11 = 127;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1865889110:
                                                        if (!str3.equals("santoni")) {
                                                            b11 = 128;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1906253259:
                                                        if (!str3.equals("PB2-670M")) {
                                                            b11 = 129;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1977196784:
                                                        if (!str3.equals("Infinix-X572")) {
                                                            b11 = 130;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2006372676:
                                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                            b11 = 131;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2019281702:
                                                        if (!str3.equals("DM-01K")) {
                                                            b11 = 132;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2029784656:
                                                        if (!str3.equals("HWBLN-H")) {
                                                            b11 = 133;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2030379515:
                                                        if (!str3.equals("HWCAM-H")) {
                                                            b11 = 134;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2033393791:
                                                        if (!str3.equals("ASUS_X00AD_2")) {
                                                            b11 = 135;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2047190025:
                                                        if (!str3.equals("ELUGA_Note")) {
                                                            b11 = 136;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2047252157:
                                                        if (!str3.equals("ELUGA_Prim")) {
                                                            b11 = 137;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2048319463:
                                                        if (!str3.equals("HWVNS-H")) {
                                                            b11 = 138;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2048855701:
                                                        if (!str3.equals("HWWAS-H")) {
                                                            b11 = 139;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        b11 = -1;
                                                        break;
                                                }
                                                switch (b11) {
                                                    default:
                                                        if (str2.equals("JSN-L21")) {
                                                        }
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                    case 10:
                                                    case 11:
                                                    case 12:
                                                    case 13:
                                                    case 14:
                                                    case 15:
                                                    case 16:
                                                    case 17:
                                                    case 18:
                                                    case 19:
                                                    case 20:
                                                    case 21:
                                                    case 22:
                                                    case 23:
                                                    case 24:
                                                    case 25:
                                                    case 26:
                                                    case 27:
                                                    case 28:
                                                    case 29:
                                                    case 30:
                                                    case 31:
                                                    case 32:
                                                    case 33:
                                                    case 34:
                                                    case 35:
                                                    case 36:
                                                    case 37:
                                                    case 38:
                                                    case 39:
                                                    case 40:
                                                    case 41:
                                                    case 42:
                                                    case 43:
                                                    case 44:
                                                    case 45:
                                                    case 46:
                                                    case 47:
                                                    case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                                                    case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                                                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                                    case 51:
                                                    case 52:
                                                    case 53:
                                                    case 54:
                                                    case 55:
                                                    case 56:
                                                    case 57:
                                                    case 58:
                                                    case 59:
                                                    case 60:
                                                    case 61:
                                                    case 62:
                                                    case 63:
                                                    case 64:
                                                    case 65:
                                                    case 66:
                                                    case 67:
                                                    case 68:
                                                    case 69:
                                                    case 70:
                                                    case 71:
                                                    case 72:
                                                    case 73:
                                                    case 74:
                                                    case 75:
                                                    case 76:
                                                    case 77:
                                                    case 78:
                                                    case 79:
                                                    case 80:
                                                    case 81:
                                                    case 82:
                                                    case 83:
                                                    case 84:
                                                    case 85:
                                                    case 86:
                                                    case 87:
                                                    case 88:
                                                    case 89:
                                                    case 90:
                                                    case 91:
                                                    case 92:
                                                    case 93:
                                                    case 94:
                                                    case 95:
                                                    case 96:
                                                    case 97:
                                                    case 98:
                                                    case 99:
                                                    case 100:
                                                    case 101:
                                                    case 102:
                                                    case 103:
                                                    case 104:
                                                    case 105:
                                                    case 106:
                                                    case 107:
                                                    case 108:
                                                    case 109:
                                                    case 110:
                                                    case 111:
                                                    case 112:
                                                    case 113:
                                                    case 114:
                                                    case 115:
                                                    case 116:
                                                    case 117:
                                                    case 118:
                                                    case 119:
                                                    case 120:
                                                    case 121:
                                                    case 122:
                                                    case 123:
                                                    case 124:
                                                    case 125:
                                                    case 126:
                                                    case 127:
                                                    case 128:
                                                    case 129:
                                                    case 130:
                                                    case 131:
                                                    case 132:
                                                    case 133:
                                                    case 134:
                                                    case 135:
                                                    case 136:
                                                    case 137:
                                                    case 138:
                                                    case 139:
                                                        z6 = true;
                                                        break;
                                                }
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            z6 = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                z6 = true;
                                break;
                        }
                    } else if (i10 <= 27) {
                        str2 = AbstractC20817s.f66109d;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b = 3;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b = 4;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b = 5;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b = 6;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b = 7;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b = 8;
                                } else {
                                    b = -1;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            default:
                                if (i10 <= 26) {
                                    str3 = AbstractC20817s.f66107b;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b11 = 0;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b11 = 1;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b11 = 2;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b11 = 3;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b11 = 4;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b11 = 5;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b11 = 6;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b11 = 7;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b11 = 8;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b11 = 9;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b11 = 10;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b11 = 11;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b11 = 12;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b11 = 13;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b11 = 14;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b11 = 15;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b11 = 16;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b11 = 17;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b11 = 18;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b11 = 19;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b11 = 20;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b11 = 21;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b11 = 22;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b11 = 23;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b11 = 24;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b11 = 25;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b11 = -1;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b11 = 27;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b11 = 28;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b11 = 29;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b11 = 30;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b11 = 31;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals(TfazcFv.GPmBYE)) {
                                                b11 = 32;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b11 = 33;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b11 = 34;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b11 = 35;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b11 = 36;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b11 = 37;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b11 = 38;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b11 = 39;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b11 = 40;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b11 = 41;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b11 = 42;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b11 = 43;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case TokenTypes.PRIVACY /* 2126 */:
                                            if (!str3.equals("C1")) {
                                                b11 = 44;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b11 = 45;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b11 = 46;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b11 = 47;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b11 = 48;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b11 = 49;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals(efyhmdM.gpZSZuOj)) {
                                                b11 = 50;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b11 = 51;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b11 = 52;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b11 = 53;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b11 = 54;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b11 = 55;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b11 = 56;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b11 = 57;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b11 = 58;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b11 = 59;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b11 = 60;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b11 = 61;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b11 = 62;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b11 = 63;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b11 = 64;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b11 = 65;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b11 = 66;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b11 = 67;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b11 = 68;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b11 = 69;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b11 = 70;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b11 = 71;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b11 = 72;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b11 = 73;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b11 = 74;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b11 = 75;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b11 = 76;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b11 = 77;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b11 = 78;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b11 = 79;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b11 = 80;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b11 = 81;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b11 = 82;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b11 = 83;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b11 = 84;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b11 = 85;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b11 = 86;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b11 = 87;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b11 = 88;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b11 = 89;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b11 = 90;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b11 = 91;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b11 = 92;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b11 = 93;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b11 = 94;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b11 = 95;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b11 = 96;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b11 = 97;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b11 = 98;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b11 = 99;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b11 = 100;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b11 = 101;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals(CxcULo.ZldurPqTHvNEK)) {
                                                b11 = 102;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b11 = 103;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b11 = 104;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b11 = 105;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b11 = 106;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b11 = 107;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b11 = 108;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b11 = 109;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b11 = 110;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b11 = 111;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b11 = 112;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b11 = 113;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b11 = 114;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b11 = 115;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b11 = 116;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b11 = 117;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b11 = 118;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b11 = 119;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b11 = 120;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b11 = 121;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b11 = 122;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b11 = 123;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b11 = 124;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals(HJrCuD.gPQvSSO)) {
                                                b11 = 125;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b11 = 126;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b11 = 127;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b11 = 128;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b11 = 129;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b11 = 130;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b11 = 131;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b11 = 132;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b11 = 133;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b11 = 134;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b11 = 135;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b11 = 136;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b11 = 137;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b11 = 138;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b11 = 139;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        default:
                                            b11 = -1;
                                            break;
                                    }
                                    switch (b11) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case 26:
                                        case 27:
                                        case 28:
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                                        case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                                        case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z6 = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z6 = true;
                                break;
                        }
                    } else {
                        str2 = AbstractC20817s.f66109d;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b = -1;
                                } else {
                                    b = 0;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b = -1;
                                } else {
                                    b = 3;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b = -1;
                                } else {
                                    b = 4;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b = -1;
                                } else {
                                    b = 5;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b = -1;
                                } else {
                                    b = 6;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b = -1;
                                } else {
                                    b = 7;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b = -1;
                                } else {
                                    b = 8;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            default:
                                if (i10 <= 26) {
                                    str3 = AbstractC20817s.f66107b;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 0;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 2;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 3;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 4;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 5;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 6;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 7;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 8;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 9;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 10;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 11;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 12;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 13;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 14;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 15;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 16;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 17;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 18;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 19;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 20;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 21;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 22;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 23;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 24;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 25;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b11 = -1;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 27;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 28;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 29;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 30;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 31;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals(TfazcFv.GPmBYE)) {
                                                b11 = -1;
                                            } else {
                                                b11 = 32;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 33;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 34;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 35;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 36;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 37;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 38;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 39;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 40;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 41;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 42;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 43;
                                            }
                                            break;
                                        case TokenTypes.PRIVACY /* 2126 */:
                                            if (!str3.equals("C1")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 44;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 45;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 46;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 47;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 48;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 49;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals(efyhmdM.gpZSZuOj)) {
                                                b11 = -1;
                                            } else {
                                                b11 = 50;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 51;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 52;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 53;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 54;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 55;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 56;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 57;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 58;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 59;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 60;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 61;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 62;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 63;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 64;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 65;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 66;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 67;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 68;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 69;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 70;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 71;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 72;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 73;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 74;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 75;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 76;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 77;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 78;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 79;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 80;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 81;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 82;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 83;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 84;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 85;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 86;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 87;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 88;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 89;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 90;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 91;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 92;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 93;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 94;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 95;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 96;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 97;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 98;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 99;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 100;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 101;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals(CxcULo.ZldurPqTHvNEK)) {
                                                b11 = -1;
                                            } else {
                                                b11 = 102;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 103;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 104;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 105;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 106;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 107;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 108;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 109;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 110;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 111;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 112;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 113;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 114;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 115;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 116;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 117;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 118;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 119;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 120;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 121;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 122;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 123;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 124;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals(HJrCuD.gPQvSSO)) {
                                                b11 = -1;
                                            } else {
                                                b11 = 125;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 126;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 127;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 128;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 129;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 130;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 131;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 132;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 133;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 134;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 135;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 136;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 137;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 138;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 139;
                                            }
                                            break;
                                        default:
                                            b11 = -1;
                                            break;
                                    }
                                    switch (b11) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case 26:
                                        case 27:
                                        case 28:
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                                        case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                                        case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z6 = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z6 = true;
                                break;
                        }
                    }
                    f18208z2 = z6;
                    f18207y2 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f18208z2;
    }
}
