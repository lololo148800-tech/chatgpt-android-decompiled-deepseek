package p257K3;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import bb.AbstractC11278C;
import bb.C11294T;
import bb.C11333z;
import io.sentry.internal.debugmeta.C15384c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p001A.C0072l;
import p003A1.AbstractC0168G;
import p031B3.C0803g;
import p057C3.AbstractC1554d;
import p057C3.C1526D;
import p057C3.C1579x;
import p057C3.SurfaceHolderCallbackC1523A;
import p1016t3.AbstractC19754D;
import p1016t3.C19788o;
import p1053v3.C20422c;
import p1073w3.AbstractC20800b;
import p158G3.C2983b;
import p160G5.p161rK.TVCuK;
import p167Gb.C3032c;
import p571X9.AbstractC9306j0;
import p817j$.util.Objects;
import p849k7.C16349b;
import p885m4.C17151a;
import p885m4.C17153c;
import p885m4.C17155e;
import p885m4.C17156f;
import p885m4.C17159i;
import p885m4.C17160j;
import p885m4.InterfaceC17158h;
import p885m4.InterfaceC17163m;
import p898n4.C17478c;
import p898n4.C17481f;

/* JADX INFO: renamed from: K3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C4537e extends AbstractC1554d implements Handler.Callback {

    /* JADX INFO: renamed from: D0 */
    public final C17151a f14815D0;

    /* JADX INFO: renamed from: E0 */
    public final C0803g f14816E0;

    /* JADX INFO: renamed from: F0 */
    public InterfaceC4533a f14817F0;

    /* JADX INFO: renamed from: G0 */
    public final C3032c f14818G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f14819H0;

    /* JADX INFO: renamed from: I0 */
    public int f14820I0;

    /* JADX INFO: renamed from: J0 */
    public InterfaceC17158h f14821J0;

    /* JADX INFO: renamed from: K0 */
    public C17160j f14822K0;

    /* JADX INFO: renamed from: L0 */
    public C17156f f14823L0;

    /* JADX INFO: renamed from: M0 */
    public C17156f f14824M0;

    /* JADX INFO: renamed from: N0 */
    public int f14825N0;

    /* JADX INFO: renamed from: O0 */
    public final Handler f14826O0;

    /* JADX INFO: renamed from: P0 */
    public final SurfaceHolderCallbackC1523A f14827P0;

    /* JADX INFO: renamed from: Q0 */
    public final C15384c f14828Q0;

    /* JADX INFO: renamed from: R0 */
    public boolean f14829R0;

    /* JADX INFO: renamed from: S0 */
    public boolean f14830S0;

    /* JADX INFO: renamed from: T0 */
    public C19788o f14831T0;

    /* JADX INFO: renamed from: U0 */
    public long f14832U0;

    /* JADX INFO: renamed from: V0 */
    public long f14833V0;

    /* JADX INFO: renamed from: W0 */
    public long f14834W0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4537e(SurfaceHolderCallbackC1523A surfaceHolderCallbackC1523A, Looper looper) {
        super(3);
        C3032c c3032c = InterfaceC4536d.f14814N;
        this.f14827P0 = surfaceHolderCallbackC1523A;
        this.f14826O0 = looper == null ? null : new Handler(looper, this);
        this.f14818G0 = c3032c;
        this.f14815D0 = new C17151a();
        this.f14816E0 = new C0803g(1);
        this.f14828Q0 = new C15384c(3, false);
        this.f14834W0 = -9223372036854775807L;
        this.f14832U0 = -9223372036854775807L;
        this.f14833V0 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: B */
    public final void m5295B() {
        AbstractC20800b.m21319g("Legacy decoding is disabled, can't handle " + this.f14831T0.f62752m + " samples (expected application/x-media3-cues).", Objects.equals(this.f14831T0.f62752m, "application/cea-608") || Objects.equals(this.f14831T0.f62752m, "application/x-mp4-cea-608") || Objects.equals(this.f14831T0.f62752m, "application/cea-708"));
    }

    /* JADX INFO: renamed from: C */
    public final long m5296C() {
        if (this.f14825N0 == -1) {
            return Long.MAX_VALUE;
        }
        this.f14823L0.getClass();
        if (this.f14825N0 >= this.f14823L0.mo10560p()) {
            return Long.MAX_VALUE;
        }
        return this.f14823L0.mo10557h(this.f14825N0);
    }

    /* JADX INFO: renamed from: D */
    public final long m5297D(long j10) {
        AbstractC20800b.m21320h(j10 != -9223372036854775807L);
        AbstractC20800b.m21320h(this.f14832U0 != -9223372036854775807L);
        return j10 - this.f14832U0;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX INFO: renamed from: E */
    public final void m5298E() {
        C17155e c17155e;
        InterfaceC17158h c2983b;
        byte b = 1;
        this.f14819H0 = true;
        C19788o c19788o = this.f14831T0;
        c19788o.getClass();
        C3032c c3032c = this.f14818G0;
        c3032c.getClass();
        String str = c19788o.f62752m;
        if (str != null) {
            int i10 = c19788o.f62734F;
            switch (str.hashCode()) {
                case 930165504:
                    b = !str.equals("application/x-mp4-cea-608") ? (byte) -1 : (byte) 0;
                    break;
                case 1566015601:
                    if (!str.equals("application/cea-608")) {
                        b = -1;
                    }
                    break;
                case 1566016562:
                    b = !str.equals("application/cea-708") ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                    c2983b = new C17478c(str, i10);
                    break;
                case 2:
                    c2983b = new C17481f(i10, c19788o.f62755p);
                    break;
                default:
                    c17155e = (C17155e) c3032c.f9127Z;
                    if (c17155e.mo17937d(c19788o)) {
                        throw new IllegalArgumentException(AbstractC9306j0.m9889h("Attempted to create decoder for unsupported MIME type: ", str));
                    }
                    InterfaceC17163m interfaceC17163mMo17936b = c17155e.mo17936b(c19788o);
                    interfaceC17163mMo17936b.getClass().getSimpleName().concat("Decoder");
                    c2983b = new C2983b(interfaceC17163mMo17936b);
                    break;
                    break;
            }
        } else {
            c17155e = (C17155e) c3032c.f9127Z;
            if (c17155e.mo17937d(c19788o)) {
                throw new IllegalArgumentException(AbstractC9306j0.m9889h("Attempted to create decoder for unsupported MIME type: ", str));
            }
            InterfaceC17163m interfaceC17163mMo17936b2 = c17155e.mo17936b(c19788o);
            interfaceC17163mMo17936b2.getClass().getSimpleName().concat("Decoder");
            c2983b = new C2983b(interfaceC17163mMo17936b2);
        }
        this.f14821J0 = c2983b;
        c2983b.mo1831b(this.f4306x0);
    }

    /* JADX INFO: renamed from: F */
    public final void m5299F(C20422c c20422c) {
        AbstractC11278C abstractC11278C = c20422c.f64595a;
        SurfaceHolderCallbackC1523A surfaceHolderCallbackC1523A = this.f14827P0;
        surfaceHolderCallbackC1523A.f4046Y.f4100y0.m10694e(27, new C1579x(abstractC11278C));
        C1526D c1526d = surfaceHolderCallbackC1523A.f4046Y;
        c1526d.getClass();
        c1526d.f4100y0.m10694e(27, new C0072l(c20422c, 12));
    }

    /* JADX INFO: renamed from: G */
    public final void m5300G() {
        this.f14822K0 = null;
        this.f14825N0 = -1;
        C17156f c17156f = this.f14823L0;
        if (c17156f != null) {
            c17156f.mo1839o();
            this.f14823L0 = null;
        }
        C17156f c17156f2 = this.f14824M0;
        if (c17156f2 != null) {
            c17156f2.mo1839o();
            this.f14824M0 = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        m5299F((C20422c) message.obj);
        return true;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: i */
    public final String mo2392i() {
        return "TextRenderer";
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: k */
    public final boolean mo2394k() {
        return this.f14830S0;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: l */
    public final boolean mo2395l() {
        return true;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: m */
    public final void mo2396m() {
        this.f14831T0 = null;
        this.f14834W0 = -9223372036854775807L;
        C11294T c11294t = C11294T.f34185q0;
        m5297D(this.f14833V0);
        C20422c c20422c = new C20422c(c11294t);
        Handler handler = this.f14826O0;
        if (handler != null) {
            handler.obtainMessage(1, c20422c).sendToTarget();
        } else {
            m5299F(c20422c);
        }
        this.f14832U0 = -9223372036854775807L;
        this.f14833V0 = -9223372036854775807L;
        if (this.f14821J0 != null) {
            m5300G();
            InterfaceC17158h interfaceC17158h = this.f14821J0;
            interfaceC17158h.getClass();
            interfaceC17158h.release();
            this.f14821J0 = null;
            this.f14820I0 = 0;
        }
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: o */
    public final void mo2398o(long j10, boolean z6) {
        this.f14833V0 = j10;
        InterfaceC4533a interfaceC4533a = this.f14817F0;
        if (interfaceC4533a != null) {
            interfaceC4533a.clear();
        }
        C11294T c11294t = C11294T.f34185q0;
        m5297D(this.f14833V0);
        C20422c c20422c = new C20422c(c11294t);
        Handler handler = this.f14826O0;
        if (handler != null) {
            handler.obtainMessage(1, c20422c).sendToTarget();
        } else {
            m5299F(c20422c);
        }
        this.f14829R0 = false;
        this.f14830S0 = false;
        this.f14834W0 = -9223372036854775807L;
        C19788o c19788o = this.f14831T0;
        if (c19788o == null || Objects.equals(c19788o.f62752m, "application/x-media3-cues")) {
            return;
        }
        if (this.f14820I0 == 0) {
            m5300G();
            InterfaceC17158h interfaceC17158h = this.f14821J0;
            interfaceC17158h.getClass();
            interfaceC17158h.flush();
            interfaceC17158h.mo1831b(this.f4306x0);
            return;
        }
        m5300G();
        InterfaceC17158h interfaceC17158h2 = this.f14821J0;
        interfaceC17158h2.getClass();
        interfaceC17158h2.release();
        this.f14821J0 = null;
        this.f14820I0 = 0;
        m5298E();
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: t */
    public final void mo2403t(C19788o[] c19788oArr, long j10, long j11) {
        this.f14832U0 = j11;
        C19788o c19788o = c19788oArr[0];
        this.f14831T0 = c19788o;
        if (Objects.equals(c19788o.f62752m, "application/x-media3-cues")) {
            this.f14817F0 = this.f14831T0.f62735G == 1 ? new C4534b() : new C4535c(0);
            return;
        }
        m5295B();
        if (this.f14821J0 != null) {
            this.f14820I0 = 1;
        } else {
            m5298E();
        }
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: v */
    public final void mo2405v(long j10, long j11) {
        boolean z6;
        C15384c c15384c;
        boolean z10;
        long jMo10557h;
        if (this.f4308z0) {
            long j12 = this.f14834W0;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                m5300G();
                this.f14830S0 = true;
            }
        }
        if (this.f14830S0) {
            return;
        }
        C19788o c19788o = this.f14831T0;
        c19788o.getClass();
        boolean zEquals = Objects.equals(c19788o.f62752m, "application/x-media3-cues");
        Handler handler = this.f14826O0;
        boolean zMo5276b = false;
        zMo5276b = false;
        zMo5276b = false;
        C15384c c15384c2 = this.f14828Q0;
        if (zEquals) {
            this.f14817F0.getClass();
            if (!this.f14829R0) {
                C0803g c0803g = this.f14816E0;
                if (m2404u(c15384c2, c0803g, 0) == -4) {
                    if (c0803g.m1824d(4)) {
                        this.f14829R0 = true;
                    } else {
                        c0803g.m1837r();
                        ByteBuffer byteBuffer = c0803g.f2226q0;
                        byteBuffer.getClass();
                        long j13 = c0803g.f2228s0;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.f14815D0.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        C16349b c16349b = new C16349b(3);
                        C11333z c11333zM12690s = AbstractC11278C.m12690s();
                        for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i10);
                            bundle2.getClass();
                            c11333zM12690s.m12762a(c16349b.mo22421apply(bundle2));
                        }
                        C17153c c17153c = new C17153c(c11333zM12690s.m12768j(), j13, bundle.getLong("d"));
                        c0803g.mo1834n();
                        zMo5276b = this.f14817F0.mo5276b(c17153c, j10);
                    }
                }
            }
            long jMo5275a = this.f14817F0.mo5275a(this.f14833V0);
            if (jMo5275a == Long.MIN_VALUE && this.f14829R0 && !zMo5276b) {
                this.f14830S0 = true;
            }
            if (jMo5275a != Long.MIN_VALUE && jMo5275a <= j10) {
                zMo5276b = true;
            }
            if (zMo5276b) {
                AbstractC11278C abstractC11278CMo5277c = this.f14817F0.mo5277c(j10);
                long jMo5278d = this.f14817F0.mo5278d(j10);
                m5297D(jMo5278d);
                C20422c c20422c = new C20422c(abstractC11278CMo5277c);
                if (handler != null) {
                    handler.obtainMessage(1, c20422c).sendToTarget();
                } else {
                    m5299F(c20422c);
                }
                this.f14817F0.mo5279e(jMo5278d);
            }
            this.f14833V0 = j10;
            return;
        }
        m5295B();
        this.f14833V0 = j10;
        if (this.f14824M0 == null) {
            InterfaceC17158h interfaceC17158h = this.f14821J0;
            interfaceC17158h.getClass();
            interfaceC17158h.mo3815c(j10);
            try {
                InterfaceC17158h interfaceC17158h2 = this.f14821J0;
                interfaceC17158h2.getClass();
                this.f14824M0 = (C17156f) interfaceC17158h2.mo1832d();
            } catch (C17159i e10) {
                AbstractC20800b.m21325m("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f14831T0, e10);
                C11294T c11294t = C11294T.f34185q0;
                m5297D(this.f14833V0);
                C20422c c20422c2 = new C20422c(c11294t);
                if (handler != null) {
                    handler.obtainMessage(1, c20422c2).sendToTarget();
                } else {
                    m5299F(c20422c2);
                }
                m5300G();
                InterfaceC17158h interfaceC17158h3 = this.f14821J0;
                interfaceC17158h3.getClass();
                interfaceC17158h3.release();
                this.f14821J0 = null;
                this.f14820I0 = 0;
                m5298E();
                return;
            }
        }
        if (this.f4302t0 != 2) {
            return;
        }
        if (this.f14823L0 != null) {
            long jM5296C = m5296C();
            z6 = false;
            while (jM5296C <= j10) {
                this.f14825N0++;
                jM5296C = m5296C();
                z6 = true;
            }
        } else {
            z6 = false;
        }
        C17156f c17156f = this.f14824M0;
        if (c17156f == null) {
            c15384c = c15384c2;
            z10 = z6;
        } else if (c17156f.m1824d(4)) {
            if (!z6 && m5296C() == Long.MAX_VALUE) {
                if (this.f14820I0 == 2) {
                    m5300G();
                    InterfaceC17158h interfaceC17158h4 = this.f14821J0;
                    interfaceC17158h4.getClass();
                    interfaceC17158h4.release();
                    this.f14821J0 = null;
                    this.f14820I0 = 0;
                    m5298E();
                } else {
                    m5300G();
                    this.f14830S0 = true;
                }
            }
            c15384c = c15384c2;
            z10 = z6;
        } else {
            c15384c = c15384c2;
            if (c17156f.f2231o0 <= j10) {
                C17156f c17156f2 = this.f14823L0;
                if (c17156f2 != null) {
                    z10 = z6;
                    c17156f2.mo1839o();
                }
                z10 = z6;
                this.f14825N0 = c17156f.mo10555e(j10);
                this.f14823L0 = c17156f;
                this.f14824M0 = null;
                z10 = true;
            }
        }
        if (z10) {
            this.f14823L0.getClass();
            int iMo10555e = this.f14823L0.mo10555e(j10);
            if (iMo10555e == 0 || this.f14823L0.mo10560p() == 0) {
                jMo10557h = this.f14823L0.f2231o0;
            } else if (iMo10555e == -1) {
                C17156f c17156f3 = this.f14823L0;
                jMo10557h = c17156f3.mo10557h(c17156f3.mo10560p() - 1);
            } else {
                jMo10557h = this.f14823L0.mo10557h(iMo10555e - 1);
            }
            m5297D(jMo10557h);
            C20422c c20422c3 = new C20422c(this.f14823L0.mo10558k(j10));
            if (handler != null) {
                handler.obtainMessage(1, c20422c3).sendToTarget();
            } else {
                m5299F(c20422c3);
            }
        }
        if (this.f14820I0 == 2) {
            return;
        }
        while (!this.f14829R0) {
            try {
                C17160j c17160j = this.f14822K0;
                if (c17160j == null) {
                    InterfaceC17158h interfaceC17158h5 = this.f14821J0;
                    interfaceC17158h5.getClass();
                    c17160j = (C17160j) interfaceC17158h5.mo1833e();
                    if (c17160j == null) {
                        return;
                    } else {
                        this.f14822K0 = c17160j;
                    }
                }
                if (this.f14820I0 == 1) {
                    c17160j.f2213Z = 4;
                    InterfaceC17158h interfaceC17158h6 = this.f14821J0;
                    interfaceC17158h6.getClass();
                    interfaceC17158h6.mo1830a(c17160j);
                    this.f14822K0 = null;
                    this.f14820I0 = 2;
                    return;
                }
                C15384c c15384c3 = c15384c;
                int iM2404u = m2404u(c15384c3, c17160j, 0);
                if (iM2404u == -4) {
                    if (c17160j.m1824d(4)) {
                        this.f14829R0 = true;
                        this.f14819H0 = false;
                    } else {
                        C19788o c19788o2 = (C19788o) c15384c3.f47968o0;
                        if (c19788o2 == null) {
                            return;
                        }
                        c17160j.f54831v0 = c19788o2.f62757r;
                        c17160j.m1837r();
                        this.f14819H0 &= !c17160j.m1824d(1);
                    }
                    if (!this.f14819H0) {
                        InterfaceC17158h interfaceC17158h7 = this.f14821J0;
                        interfaceC17158h7.getClass();
                        interfaceC17158h7.mo1830a(c17160j);
                        this.f14822K0 = null;
                    }
                } else if (iM2404u == -3) {
                    return;
                }
                c15384c = c15384c3;
            } catch (C17159i e11) {
                AbstractC20800b.m21325m("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f14831T0, e11);
                C11294T c11294t2 = C11294T.f34185q0;
                m5297D(this.f14833V0);
                C20422c c20422c4 = new C20422c(c11294t2);
                if (handler != null) {
                    handler.obtainMessage(1, c20422c4).sendToTarget();
                } else {
                    m5299F(c20422c4);
                }
                m5300G();
                InterfaceC17158h interfaceC17158h8 = this.f14821J0;
                interfaceC17158h8.getClass();
                interfaceC17158h8.release();
                this.f14821J0 = null;
                this.f14820I0 = 0;
                m5298E();
                return;
            }
        }
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: z */
    public final int mo2409z(C19788o c19788o) {
        if (!Objects.equals(c19788o.f62752m, TVCuK.off)) {
            C3032c c3032c = this.f14818G0;
            c3032c.getClass();
            if (!((C17155e) c3032c.f9127Z).mo17937d(c19788o)) {
                String str = c19788o.f62752m;
                if (!Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                    return AbstractC19754D.m20709g(str) ? AbstractC0168G.m522k(1, 0, 0, 0) : AbstractC0168G.m522k(0, 0, 0, 0);
                }
            }
        }
        return AbstractC0168G.m522k(c19788o.f62738J == 0 ? 4 : 2, 0, 0, 0);
    }
}
