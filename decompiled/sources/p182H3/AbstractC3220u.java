package p182H3;

import android.gov.nist.core.Separators;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import bb.AbstractC11278C;
import io.sentry.internal.debugmeta.C15384c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import p001A.AbstractC0010F;
import p031B3.C0799c;
import p031B3.C0802f;
import p031B3.C0803g;
import p031B3.InterfaceC0798b;
import p057C3.AbstractC1554d;
import p057C3.C1527E;
import p057C3.C1556e;
import p057C3.C1558f;
import p057C3.C1567l;
import p083D3.C1875m;
import p1016t3.AbstractC19780g;
import p1016t3.C19781h;
import p1016t3.C19785l;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1031u3.InterfaceC20101d;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p109E3.C2272M;
import p133F3.AbstractC2662h;
import p133F3.C2656b;
import p232J3.InterfaceC4220U;
import p239Ja.C4312o;
import p372P3.AbstractC6320b;
import p477Tb.C7296c;
import p523V9.AbstractC8020X;
import p571X9.AbstractC9306j0;
import p588Y2.C9642z;
import p817j$.util.Objects;

/* JADX INFO: renamed from: H3.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3220u extends AbstractC1554d {

    /* JADX INFO: renamed from: P1 */
    public static final byte[] f9721P1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: A1 */
    public int f9722A1;

    /* JADX INFO: renamed from: B1 */
    public boolean f9723B1;

    /* JADX INFO: renamed from: C1 */
    public boolean f9724C1;

    /* JADX INFO: renamed from: D0 */
    public final InterfaceC3209j f9725D0;

    /* JADX INFO: renamed from: D1 */
    public boolean f9726D1;

    /* JADX INFO: renamed from: E0 */
    public final C3221v f9727E0;

    /* JADX INFO: renamed from: E1 */
    public long f9728E1;

    /* JADX INFO: renamed from: F0 */
    public final float f9729F0;

    /* JADX INFO: renamed from: F1 */
    public long f9730F1;

    /* JADX INFO: renamed from: G0 */
    public final C0803g f9731G0;

    /* JADX INFO: renamed from: G1 */
    public boolean f9732G1;

    /* JADX INFO: renamed from: H0 */
    public final C0803g f9733H0;

    /* JADX INFO: renamed from: H1 */
    public boolean f9734H1;

    /* JADX INFO: renamed from: I0 */
    public final C0803g f9735I0;

    /* JADX INFO: renamed from: I1 */
    public boolean f9736I1;

    /* JADX INFO: renamed from: J0 */
    public final C3207h f9737J0;

    /* JADX INFO: renamed from: J1 */
    public boolean f9738J1;

    /* JADX INFO: renamed from: K0 */
    public final MediaCodec.BufferInfo f9739K0;

    /* JADX INFO: renamed from: K1 */
    public C1567l f9740K1;

    /* JADX INFO: renamed from: L0 */
    public final ArrayDeque f9741L0;

    /* JADX INFO: renamed from: L1 */
    public C1556e f9742L1;

    /* JADX INFO: renamed from: M0 */
    public final C2272M f9743M0;

    /* JADX INFO: renamed from: M1 */
    public C3219t f9744M1;

    /* JADX INFO: renamed from: N0 */
    public C19788o f9745N0;

    /* JADX INFO: renamed from: N1 */
    public long f9746N1;

    /* JADX INFO: renamed from: O0 */
    public C19788o f9747O0;

    /* JADX INFO: renamed from: O1 */
    public boolean f9748O1;

    /* JADX INFO: renamed from: P0 */
    public C7296c f9749P0;

    /* JADX INFO: renamed from: Q0 */
    public C7296c f9750Q0;

    /* JADX INFO: renamed from: R0 */
    public C1527E f9751R0;

    /* JADX INFO: renamed from: S0 */
    public MediaCrypto f9752S0;

    /* JADX INFO: renamed from: T0 */
    public final long f9753T0;

    /* JADX INFO: renamed from: U0 */
    public float f9754U0;

    /* JADX INFO: renamed from: V0 */
    public float f9755V0;

    /* JADX INFO: renamed from: W0 */
    public InterfaceC3210k f9756W0;

    /* JADX INFO: renamed from: X0 */
    public C19788o f9757X0;

    /* JADX INFO: renamed from: Y0 */
    public MediaFormat f9758Y0;

    /* JADX INFO: renamed from: Z0 */
    public boolean f9759Z0;

    /* JADX INFO: renamed from: a1 */
    public float f9760a1;

    /* JADX INFO: renamed from: b1 */
    public ArrayDeque f9761b1;

    /* JADX INFO: renamed from: c1 */
    public C3217r f9762c1;

    /* JADX INFO: renamed from: d1 */
    public C3213n f9763d1;

    /* JADX INFO: renamed from: e1 */
    public int f9764e1;

    /* JADX INFO: renamed from: f1 */
    public boolean f9765f1;

    /* JADX INFO: renamed from: g1 */
    public boolean f9766g1;

    /* JADX INFO: renamed from: h1 */
    public boolean f9767h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f9768i1;

    /* JADX INFO: renamed from: j1 */
    public boolean f9769j1;

    /* JADX INFO: renamed from: k1 */
    public boolean f9770k1;

    /* JADX INFO: renamed from: l1 */
    public boolean f9771l1;

    /* JADX INFO: renamed from: m1 */
    public boolean f9772m1;

    /* JADX INFO: renamed from: n1 */
    public boolean f9773n1;

    /* JADX INFO: renamed from: o1 */
    public long f9774o1;

    /* JADX INFO: renamed from: p1 */
    public int f9775p1;

    /* JADX INFO: renamed from: q1 */
    public int f9776q1;

    /* JADX INFO: renamed from: r1 */
    public ByteBuffer f9777r1;

    /* JADX INFO: renamed from: s1 */
    public boolean f9778s1;

    /* JADX INFO: renamed from: t1 */
    public boolean f9779t1;

    /* JADX INFO: renamed from: u1 */
    public boolean f9780u1;

    /* JADX INFO: renamed from: v1 */
    public boolean f9781v1;

    /* JADX INFO: renamed from: w1 */
    public boolean f9782w1;

    /* JADX INFO: renamed from: x1 */
    public boolean f9783x1;

    /* JADX INFO: renamed from: y1 */
    public int f9784y1;

    /* JADX INFO: renamed from: z1 */
    public int f9785z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3220u(int i10, InterfaceC3209j interfaceC3209j, float f10) {
        super(i10);
        C3221v c3221v = C3221v.f9786Z;
        this.f9725D0 = interfaceC3209j;
        this.f9727E0 = c3221v;
        this.f9729F0 = f10;
        this.f9731G0 = new C0803g(0);
        this.f9733H0 = new C0803g(0);
        this.f9735I0 = new C0803g(2);
        C3207h c3207h = new C3207h(2);
        c3207h.f9696x0 = 32;
        this.f9737J0 = c3207h;
        this.f9739K0 = new MediaCodec.BufferInfo();
        this.f9754U0 = 1.0f;
        this.f9755V0 = 1.0f;
        this.f9753T0 = -9223372036854775807L;
        this.f9741L0 = new ArrayDeque();
        this.f9744M1 = C3219t.f9716e;
        c3207h.m1836q(0);
        c3207h.f2226q0.order(ByteOrder.nativeOrder());
        C2272M c2272m = new C2272M();
        c2272m.f7021a = InterfaceC20101d.f63646a;
        c2272m.f7023c = 0;
        c2272m.f7022b = 2;
        this.f9743M0 = c2272m;
        this.f9760a1 = -1.0f;
        this.f9764e1 = 0;
        this.f9784y1 = 0;
        this.f9775p1 = -1;
        this.f9776q1 = -1;
        this.f9774o1 = -9223372036854775807L;
        this.f9728E1 = -9223372036854775807L;
        this.f9730F1 = -9223372036854775807L;
        this.f9746N1 = -9223372036854775807L;
        this.f9785z1 = 0;
        this.f9722A1 = 0;
        this.f9742L1 = new C1556e();
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: A */
    public final int mo2388A() {
        return 8;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0302  */
    /* JADX WARN: Code duplicated, block: B:122:0x031a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0322 A[LOOP:0: B:26:0x0096->B:125:0x0322, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:145:0x0320 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r26v0, types: [C3.d, H3.u] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX INFO: renamed from: B */
    public final boolean m4086B(long j10, long j11) throws C1567l {
        boolean z6;
        C3207h c3207h;
        ?? r10;
        boolean z10;
        ?? r11;
        ?? r12;
        boolean z11;
        AbstractC20800b.m21320h(!this.f9734H1);
        C3207h c3207h2 = this.f9737J0;
        if (c3207h2.m4074t()) {
            ByteBuffer byteBuffer = c3207h2.f2226q0;
            int i10 = this.f9776q1;
            int i11 = c3207h2.f9695w0;
            long j12 = c3207h2.f2228s0;
            boolean zM4098S = m4098S(this.f4306x0, c3207h2.f9694v0);
            boolean zM1824d = c3207h2.m1824d(4);
            C19788o c19788o = this.f9747O0;
            c19788o.getClass();
            if (!mo3344g0(j10, j11, null, byteBuffer, i10, 0, i11, j12, zM4098S, zM1824d, c19788o)) {
                return false;
            }
            c3207h = c3207h2;
            mo4101b0(c3207h.f9694v0);
            c3207h.mo1834n();
            z6 = false;
        } else {
            z6 = false;
            c3207h = c3207h2;
        }
        if (this.f9732G1) {
            this.f9734H1 = true;
            return z6;
        }
        boolean z12 = true;
        boolean z13 = this.f9781v1;
        C0803g c0803g = this.f9735I0;
        if (z13) {
            AbstractC20800b.m21320h(c3207h.m4073s(c0803g));
            this.f9781v1 = z6;
        }
        if (this.f9782w1) {
            if (c3207h.m4074t()) {
                return true;
            }
            m4088E();
            this.f9782w1 = z6;
            m4099T();
            if (!this.f9780u1) {
                return z6;
            }
        }
        AbstractC20800b.m21320h(!this.f9732G1);
        C15384c c15384c = this.f4297o0;
        c15384c.m16638m();
        c0803g.mo1834n();
        ?? r6 = z6;
        while (true) {
            c0803g.mo1834n();
            int iM2404u = m2404u(c15384c, c0803g, r6);
            if (iM2404u != -5) {
                if (iM2404u != -4) {
                    if (iM2404u != -3) {
                        throw new IllegalStateException();
                    }
                    if (m2393j()) {
                        this.f9730F1 = this.f9728E1;
                    }
                } else if (c0803g.m1824d(4)) {
                    this.f9732G1 = z12;
                    this.f9730F1 = this.f9728E1;
                } else {
                    this.f9728E1 = Math.max(this.f9728E1, c0803g.f2228s0);
                    if (m2393j() || this.f9733H0.m1824d(536870912)) {
                        this.f9730F1 = this.f9728E1;
                    }
                    byte[] bArr = null;
                    if (this.f9736I1) {
                        C19788o c19788o2 = this.f9745N0;
                        c19788o2.getClass();
                        this.f9747O0 = c19788o2;
                        if (Objects.equals(c19788o2.f62752m, "audio/opus") && !this.f9747O0.f62755p.isEmpty()) {
                            byte[] bArr2 = (byte[]) this.f9747O0.f62755p.get(r6);
                            int i12 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                            C19788o c19788o3 = this.f9747O0;
                            c19788o3.getClass();
                            C19787n c19787nM20747a = c19788o3.m20747a();
                            c19787nM20747a.f62696C = i12;
                            this.f9747O0 = new C19788o(c19787nM20747a);
                        }
                        mo3341Z(this.f9747O0, null);
                        this.f9736I1 = r6;
                    }
                    c0803g.m1837r();
                    C19788o c19788o4 = this.f9747O0;
                    if (c19788o4 == null || !Objects.equals(c19788o4.f62752m, "audio/opus")) {
                        r11 = r6;
                    } else {
                        if (c0803g.m1824d(268435456)) {
                            c0803g.f2224o0 = this.f9747O0;
                            mo3336Q(c0803g);
                        }
                        if (this.f4306x0 - c0803g.f2228s0 <= 80000) {
                            C19788o c19788o5 = this.f9747O0;
                            c19788o5.getClass();
                            C2272M c2272m = this.f9743M0;
                            c2272m.getClass();
                            c0803g.f2226q0.getClass();
                            if (c0803g.f2226q0.limit() - c0803g.f2226q0.position() == 0) {
                                r11 = r6;
                            } else {
                                if (c2272m.f7022b == 2) {
                                    ?? r13 = c19788o5.f62755p;
                                    if (r13.size() == z12 || r13.size() == 3) {
                                        bArr = (byte[]) r13.get(r6);
                                    }
                                }
                                ByteBuffer byteBuffer2 = c0803g.f2226q0;
                                int iPosition = byteBuffer2.position();
                                int iLimit = byteBuffer2.limit();
                                int i13 = iLimit - iPosition;
                                int i14 = (i13 + 255) / 255;
                                int i15 = i14 + 27 + i13;
                                if (c2272m.f7022b == 2) {
                                    int length = bArr != null ? bArr.length + 28 : 47;
                                    i15 = (length == true ? 1 : 0) + 44 + i15;
                                    r12 = length;
                                } else {
                                    r12 = r6;
                                }
                                int i16 = i15;
                                if (c2272m.f7021a.capacity() < i16) {
                                    c2272m.f7021a = ByteBuffer.allocate(i16).order(ByteOrder.LITTLE_ENDIAN);
                                } else {
                                    c2272m.f7021a.clear();
                                }
                                ByteBuffer byteBuffer3 = c2272m.f7021a;
                                if (c2272m.f7022b == 2) {
                                    if (bArr != null) {
                                        C2272M.m3351a(byteBuffer3, 0L, 0, 1, true);
                                        long length2 = bArr.length;
                                        AbstractC8020X.m8352b((length2 >> 8) == 0, "out of range: %s", length2);
                                        byteBuffer3.put((byte) length2);
                                        byteBuffer3.put(bArr);
                                        byteBuffer3.putInt(22, AbstractC20817s.m21410k(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                        byteBuffer3.position(bArr.length + 28);
                                    } else {
                                        byteBuffer3.put(C2272M.f7019d);
                                    }
                                    byteBuffer3.put(C2272M.f7020e);
                                } else {
                                    iLimit = iLimit;
                                }
                                int iM6894j = c2272m.f7023c + ((int) ((AbstractC6320b.m6894j(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
                                c2272m.f7023c = iM6894j;
                                C2272M.m3351a(byteBuffer3, iM6894j, c2272m.f7022b, i14, false);
                                for (int i17 = 0; i17 < i14; i17++) {
                                    if (i13 >= 255) {
                                        byteBuffer3.put((byte) -1);
                                        i13 -= 255;
                                    } else {
                                        byteBuffer3.put((byte) i13);
                                        i13 = 0;
                                    }
                                }
                                int i18 = iLimit;
                                while (iPosition < i18) {
                                    byteBuffer3.put(byteBuffer2.get(iPosition));
                                    iPosition++;
                                }
                                byteBuffer2.position(byteBuffer2.limit());
                                byteBuffer3.flip();
                                if (c2272m.f7022b == 2) {
                                    z11 = false;
                                    byteBuffer3.putInt(r12 + 66, AbstractC20817s.m21410k(byteBuffer3.arrayOffset() + r12 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                                } else {
                                    z11 = false;
                                    byteBuffer3.putInt(22, AbstractC20817s.m21410k(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                                }
                                c2272m.f7022b++;
                                c2272m.f7021a = byteBuffer3;
                                c0803g.mo1834n();
                                c0803g.m1836q(c2272m.f7021a.remaining());
                                c0803g.f2226q0.put(c2272m.f7021a);
                                c0803g.m1837r();
                                r11 = z11;
                            }
                        } else {
                            r11 = r6;
                        }
                    }
                    if (c3207h.m4074t()) {
                        long j13 = this.f4306x0;
                        if (m4098S(j13, c3207h.f9694v0) == m4098S(j13, c0803g.f2228s0)) {
                            if (!c3207h.m4073s(c0803g)) {
                                r6 = r11 == true ? 1 : 0;
                                z12 = true;
                            }
                        }
                    } else if (!c3207h.m4073s(c0803g)) {
                        r6 = r11 == true ? 1 : 0;
                        z12 = true;
                    }
                    z10 = true;
                    this.f9781v1 = true;
                    r10 = r11;
                }
                r10 = r6;
                z10 = z12;
            } else {
                r10 = r6;
                z10 = z12;
                mo3340Y(c15384c);
            }
            if (c3207h.m4074t()) {
                c3207h.m1837r();
            }
            return (c3207h.m4074t() || this.f9732G1 || this.f9782w1) ? z10 : r10;
        }
    }

    /* JADX INFO: renamed from: C */
    public abstract C1558f mo3332C(C3213n c3213n, C19788o c19788o, C19788o c19788o2);

    /* JADX INFO: renamed from: D */
    public C3212m mo4087D(IllegalStateException illegalStateException, C3213n c3213n) {
        return new C3212m(illegalStateException, c3213n);
    }

    /* JADX INFO: renamed from: E */
    public final void m4088E() {
        this.f9782w1 = false;
        this.f9737J0.mo1834n();
        this.f9735I0.mo1834n();
        this.f9781v1 = false;
        this.f9780u1 = false;
        C2272M c2272m = this.f9743M0;
        c2272m.getClass();
        c2272m.f7021a = InterfaceC20101d.f63646a;
        c2272m.f7023c = 0;
        c2272m.f7022b = 2;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m4089F() throws C1567l {
        if (this.f9723B1) {
            this.f9785z1 = 1;
            if (this.f9766g1 || this.f9768i1) {
                this.f9722A1 = 3;
                return false;
            }
            this.f9722A1 = 2;
        } else {
            m4113s0();
        }
        return true;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m4090G(long j10, long j11) throws C1567l {
        boolean z6;
        MediaCodec.BufferInfo bufferInfo;
        boolean zMo3344g0;
        int iMo4062k;
        InterfaceC3210k interfaceC3210k = this.f9756W0;
        interfaceC3210k.getClass();
        boolean z10 = this.f9776q1 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.f9739K0;
        if (!z10) {
            if (this.f9769j1 && this.f9724C1) {
                try {
                    iMo4062k = interfaceC3210k.mo4062k(bufferInfo2);
                } catch (IllegalStateException unused) {
                    m4104f0();
                    if (this.f9734H1) {
                        m4106i0();
                    }
                    return false;
                }
            } else {
                iMo4062k = interfaceC3210k.mo4062k(bufferInfo2);
            }
            if (iMo4062k < 0) {
                if (iMo4062k != -2) {
                    if (this.f9773n1 && (this.f9732G1 || this.f9785z1 == 2)) {
                        m4104f0();
                    }
                    return false;
                }
                this.f9726D1 = true;
                InterfaceC3210k interfaceC3210k2 = this.f9756W0;
                interfaceC3210k2.getClass();
                MediaFormat outputFormat = interfaceC3210k2.getOutputFormat();
                if (this.f9764e1 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.f9772m1 = true;
                } else {
                    this.f9758Y0 = outputFormat;
                    this.f9759Z0 = true;
                }
                return true;
            }
            if (this.f9772m1) {
                this.f9772m1 = false;
                interfaceC3210k.releaseOutputBuffer(iMo4062k, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                m4104f0();
                return false;
            }
            this.f9776q1 = iMo4062k;
            ByteBuffer outputBuffer = interfaceC3210k.getOutputBuffer(iMo4062k);
            this.f9777r1 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo2.offset);
                this.f9777r1.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f9770k1 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0 && this.f9728E1 != -9223372036854775807L) {
                bufferInfo2.presentationTimeUs = this.f9730F1;
            }
            long j12 = bufferInfo2.presentationTimeUs;
            this.f9778s1 = j12 < this.f4306x0;
            long j13 = this.f9730F1;
            this.f9779t1 = j13 != -9223372036854775807L && j13 <= j12;
            m4114t0(j12);
        }
        if (this.f9769j1 && this.f9724C1) {
            try {
                ByteBuffer byteBuffer = this.f9777r1;
                int i10 = this.f9776q1;
                int i11 = bufferInfo2.flags;
                long j14 = bufferInfo2.presentationTimeUs;
                boolean z11 = this.f9778s1;
                boolean z12 = this.f9779t1;
                C19788o c19788o = this.f9747O0;
                c19788o.getClass();
                z6 = false;
                try {
                    zMo3344g0 = mo3344g0(j10, j11, interfaceC3210k, byteBuffer, i10, i11, 1, j14, z11, z12, c19788o);
                    bufferInfo = bufferInfo2;
                } catch (IllegalStateException unused2) {
                    m4104f0();
                    if (this.f9734H1) {
                        m4106i0();
                    }
                    return z6;
                }
            } catch (IllegalStateException unused3) {
                z6 = false;
            }
        } else {
            z6 = false;
            ByteBuffer byteBuffer2 = this.f9777r1;
            int i12 = this.f9776q1;
            int i13 = bufferInfo2.flags;
            long j15 = bufferInfo2.presentationTimeUs;
            boolean z13 = this.f9778s1;
            boolean z14 = this.f9779t1;
            C19788o c19788o2 = this.f9747O0;
            c19788o2.getClass();
            bufferInfo = bufferInfo2;
            zMo3344g0 = mo3344g0(j10, j11, interfaceC3210k, byteBuffer2, i12, i13, 1, j15, z13, z14, c19788o2);
        }
        if (zMo3344g0) {
            mo4101b0(bufferInfo.presentationTimeUs);
            boolean z15 = (bufferInfo.flags & 4) != 0 ? true : z6;
            this.f9776q1 = -1;
            this.f9777r1 = null;
            if (!z15) {
                return r13;
            }
            m4104f0();
        }
        return z6;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m4091H() throws C1567l {
        InterfaceC3210k interfaceC3210k = this.f9756W0;
        if (interfaceC3210k == null || this.f9785z1 == 2 || this.f9732G1) {
            return false;
        }
        int i10 = this.f9775p1;
        C0803g c0803g = this.f9733H0;
        if (i10 < 0) {
            int iMo4060i = interfaceC3210k.mo4060i();
            this.f9775p1 = iMo4060i;
            if (iMo4060i < 0) {
                return false;
            }
            c0803g.f2226q0 = interfaceC3210k.getInputBuffer(iMo4060i);
            c0803g.mo1834n();
        }
        if (this.f9785z1 == 1) {
            if (!this.f9773n1) {
                this.f9724C1 = true;
                interfaceC3210k.mo4058e(this.f9775p1, 0, 4, 0L);
                this.f9775p1 = -1;
                c0803g.f2226q0 = null;
            }
            this.f9785z1 = 2;
            return false;
        }
        if (this.f9771l1) {
            this.f9771l1 = false;
            ByteBuffer byteBuffer = c0803g.f2226q0;
            byteBuffer.getClass();
            byteBuffer.put(f9721P1);
            interfaceC3210k.mo4058e(this.f9775p1, 38, 0, 0L);
            this.f9775p1 = -1;
            c0803g.f2226q0 = null;
            this.f9723B1 = true;
            return true;
        }
        if (this.f9784y1 == 1) {
            int i11 = 0;
            while (true) {
                C19788o c19788o = this.f9757X0;
                c19788o.getClass();
                if (i11 >= c19788o.f62755p.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.f9757X0.f62755p.get(i11);
                ByteBuffer byteBuffer2 = c0803g.f2226q0;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i11++;
            }
            this.f9784y1 = 2;
        }
        ByteBuffer byteBuffer3 = c0803g.f2226q0;
        byteBuffer3.getClass();
        int iPosition = byteBuffer3.position();
        C15384c c15384c = this.f4297o0;
        c15384c.m16638m();
        try {
            int iM2404u = m2404u(c15384c, c0803g, 0);
            if (iM2404u == -3) {
                if (m2393j()) {
                    this.f9730F1 = this.f9728E1;
                }
                return false;
            }
            if (iM2404u == -5) {
                if (this.f9784y1 == 2) {
                    c0803g.mo1834n();
                    this.f9784y1 = 1;
                }
                mo3340Y(c15384c);
                return true;
            }
            if (c0803g.m1824d(4)) {
                this.f9730F1 = this.f9728E1;
                if (this.f9784y1 == 2) {
                    c0803g.mo1834n();
                    this.f9784y1 = 1;
                }
                this.f9732G1 = true;
                if (!this.f9723B1) {
                    m4104f0();
                    return false;
                }
                try {
                    if (!this.f9773n1) {
                        this.f9724C1 = true;
                        interfaceC3210k.mo4058e(this.f9775p1, 0, 4, 0L);
                        this.f9775p1 = -1;
                        c0803g.f2226q0 = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    throw m2389b(e10, this.f9745N0, false, AbstractC20817s.m21416q(e10.getErrorCode()));
                }
            }
            if (!this.f9723B1 && !c0803g.m1824d(1)) {
                c0803g.mo1834n();
                if (this.f9784y1 == 2) {
                    this.f9784y1 = 1;
                }
                return true;
            }
            boolean zM1824d = c0803g.m1824d(1073741824);
            if (zM1824d) {
                C0799c c0799c = c0803g.f2225p0;
                if (iPosition == 0) {
                    c0799c.getClass();
                } else {
                    if (c0799c.f2217d == null) {
                        int[] iArr = new int[1];
                        c0799c.f2217d = iArr;
                        c0799c.f2222i.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = c0799c.f2217d;
                    iArr2[0] = iArr2[0] + iPosition;
                }
            }
            if (this.f9765f1 && !zM1824d) {
                ByteBuffer byteBuffer4 = c0803g.f2226q0;
                byteBuffer4.getClass();
                int iPosition2 = byteBuffer4.position();
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    int i14 = i12 + 1;
                    if (i14 >= iPosition2) {
                        byteBuffer4.clear();
                        break;
                    }
                    int i15 = byteBuffer4.get(i12) & 255;
                    if (i13 == 3) {
                        if (i15 == 1 && (byteBuffer4.get(i14) & 31) == 7) {
                            ByteBuffer byteBufferDuplicate = byteBuffer4.duplicate();
                            byteBufferDuplicate.position(i12 - 3);
                            byteBufferDuplicate.limit(iPosition2);
                            byteBuffer4.position(0);
                            byteBuffer4.put(byteBufferDuplicate);
                            break;
                        }
                    } else if (i15 == 0) {
                        i13++;
                    }
                    if (i15 != 0) {
                        i13 = 0;
                    }
                    i12 = i14;
                }
                ByteBuffer byteBuffer5 = c0803g.f2226q0;
                byteBuffer5.getClass();
                if (byteBuffer5.position() == 0) {
                    return true;
                }
                this.f9765f1 = false;
            }
            long j10 = c0803g.f2228s0;
            if (this.f9736I1) {
                ArrayDeque arrayDeque = this.f9741L0;
                if (arrayDeque.isEmpty()) {
                    C4312o c4312o = this.f9744M1.f9720d;
                    C19788o c19788o2 = this.f9745N0;
                    c19788o2.getClass();
                    c4312o.m5087f(j10, c19788o2);
                } else {
                    C4312o c4312o2 = ((C3219t) arrayDeque.peekLast()).f9720d;
                    C19788o c19788o3 = this.f9745N0;
                    c19788o3.getClass();
                    c4312o2.m5087f(j10, c19788o3);
                }
                this.f9736I1 = false;
            }
            this.f9728E1 = Math.max(this.f9728E1, j10);
            if (m2393j() || c0803g.m1824d(536870912)) {
                this.f9730F1 = this.f9728E1;
            }
            c0803g.m1837r();
            if (c0803g.m1824d(268435456)) {
                mo3336Q(c0803g);
            }
            mo4102d0(c0803g);
            int iMo4095L = mo4095L(c0803g);
            try {
                if (zM1824d) {
                    interfaceC3210k.mo4057c(this.f9775p1, c0803g.f2225p0, j10, iMo4095L);
                } else {
                    int i16 = this.f9775p1;
                    ByteBuffer byteBuffer6 = c0803g.f2226q0;
                    byteBuffer6.getClass();
                    interfaceC3210k.mo4058e(i16, byteBuffer6.limit(), iMo4095L, j10);
                }
                this.f9775p1 = -1;
                c0803g.f2226q0 = null;
                this.f9723B1 = true;
                this.f9784y1 = 0;
                this.f9742L1.f4313c++;
                return true;
            } catch (MediaCodec.CryptoException e11) {
                throw m2389b(e11, this.f9745N0, false, AbstractC20817s.m21416q(e11.getErrorCode()));
            }
        } catch (C0802f e12) {
            mo3337V(e12);
            m4105h0(0);
            m4092I();
            return true;
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m4092I() {
        try {
            InterfaceC3210k interfaceC3210k = this.f9756W0;
            AbstractC20800b.m21321i(interfaceC3210k);
            interfaceC3210k.flush();
        } finally {
            mo4107k0();
        }
    }

    /* JADX INFO: renamed from: J */
    public final boolean m4093J() {
        if (this.f9756W0 == null) {
            return false;
        }
        int i10 = this.f9722A1;
        if (i10 == 3 || this.f9766g1 || ((this.f9767h1 && !this.f9726D1) || (this.f9768i1 && this.f9724C1))) {
            m4106i0();
            return true;
        }
        if (i10 == 2) {
            int i11 = AbstractC20817s.f66106a;
            AbstractC20800b.m21320h(i11 >= 23);
            if (i11 >= 23) {
                try {
                    m4113s0();
                } catch (C1567l e10) {
                    AbstractC20800b.m21333u("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    m4106i0();
                    return true;
                }
            }
        }
        m4092I();
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final List m4094K(boolean z6) {
        C19788o c19788o = this.f9745N0;
        c19788o.getClass();
        C3221v c3221v = this.f9727E0;
        ArrayList arrayListMo3334O = mo3334O(c3221v, c19788o, z6);
        if (arrayListMo3334O.isEmpty() && z6) {
            arrayListMo3334O = mo3334O(c3221v, c19788o, false);
            if (!arrayListMo3334O.isEmpty()) {
                AbstractC20800b.m21332t("MediaCodecRenderer", "Drm session requires secure decoder for " + c19788o.f62752m + ", but no secure decoder available. Trying to proceed with " + arrayListMo3334O + Separators.DOT);
            }
        }
        return arrayListMo3334O;
    }

    /* JADX INFO: renamed from: L */
    public int mo4095L(C0803g c0803g) {
        return 0;
    }

    /* JADX INFO: renamed from: M */
    public boolean mo4096M() {
        return false;
    }

    /* JADX INFO: renamed from: N */
    public abstract float mo3333N(float f10, C19788o[] c19788oArr);

    /* JADX INFO: renamed from: O */
    public abstract ArrayList mo3334O(C3221v c3221v, C19788o c19788o, boolean z6);

    /* JADX INFO: renamed from: P */
    public abstract C3208i mo3335P(C3213n c3213n, C19788o c19788o, MediaCrypto mediaCrypto, float f10);

    /* JADX INFO: renamed from: Q */
    public abstract void mo3336Q(C0803g c0803g);

    /* JADX WARN: Code duplicated, block: B:164:0x0377  */
    /* JADX WARN: Code duplicated, block: B:179:0x03af  */
    /* JADX WARN: Code duplicated, block: B:217:0x0432  */
    /* JADX WARN: Code duplicated, block: B:244:0x0490  */
    /* JADX INFO: renamed from: R */
    public final void m4097R(C3213n c3213n, MediaCrypto mediaCrypto) {
        float fMo3333N;
        int i10;
        boolean z6;
        boolean z10;
        String str;
        int i11;
        C19788o c19788o = this.f9745N0;
        c19788o.getClass();
        String str2 = c3213n.f9703a;
        int i12 = AbstractC20817s.f66106a;
        if (i12 < 23) {
            fMo3333N = -1.0f;
        } else {
            float f10 = this.f9755V0;
            C19788o[] c19788oArr = this.f4304v0;
            c19788oArr.getClass();
            fMo3333N = mo3333N(f10, c19788oArr);
        }
        if (fMo3333N <= this.f9729F0) {
            fMo3333N = -1.0f;
        }
        mo4103e0(c19788o);
        this.f4301s0.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C3208i c3208iMo3335P = mo3335P(c3213n, c19788o, mediaCrypto, fMo3333N);
        if (i12 >= 31) {
            C1875m c1875m = this.f4300r0;
            c1875m.getClass();
            AbstractC3216q.m4085a(c3208iMo3335P, c1875m);
        }
        try {
            Trace.beginSection("createCodec:" + str2);
            InterfaceC3210k interfaceC3210kMo3448z = this.f9725D0.mo3448z(c3208iMo3335P);
            this.f9756W0 = interfaceC3210kMo3448z;
            if (i12 >= 21) {
                AbstractC3215p.m4084a(interfaceC3210kMo3448z, new C3218s(this));
            }
            Trace.endSection();
            this.f4301s0.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!c3213n.m4079d(c19788o)) {
                StringBuilder sbM9893l = AbstractC9306j0.m9893l("id=");
                sbM9893l.append(c19788o.f62740a);
                sbM9893l.append(", mimeType=");
                sbM9893l.append(c19788o.f62752m);
                String str3 = c19788o.f62751l;
                if (str3 != null) {
                    sbM9893l.append(", container=");
                    sbM9893l.append(str3);
                }
                int i13 = c19788o.f62748i;
                if (i13 != -1) {
                    sbM9893l.append(", bitrate=");
                    sbM9893l.append(i13);
                }
                String str4 = c19788o.f62749j;
                if (str4 != null) {
                    sbM9893l.append(", codecs=");
                    sbM9893l.append(str4);
                }
                C19785l c19785l = c19788o.f62756q;
                if (c19785l != null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (int i14 = 0; i14 < c19785l.f62692p0; i14++) {
                        UUID uuid = c19785l.f62689Y[i14].f62685Z;
                        if (uuid.equals(AbstractC19780g.f62670b)) {
                            linkedHashSet.add("cenc");
                        } else if (uuid.equals(AbstractC19780g.f62671c)) {
                            linkedHashSet.add("clearkey");
                        } else if (uuid.equals(AbstractC19780g.f62673e)) {
                            linkedHashSet.add("playready");
                        } else if (uuid.equals(AbstractC19780g.f62672d)) {
                            linkedHashSet.add("widevine");
                        } else if (uuid.equals(AbstractC19780g.f62669a)) {
                            linkedHashSet.add("universal");
                        } else {
                            linkedHashSet.add("unknown (" + uuid + Separators.RPAREN);
                        }
                    }
                    sbM9893l.append(", drm=[");
                    new C9642z(String.valueOf(',')).m10202O(sbM9893l, linkedHashSet.iterator());
                    sbM9893l.append(']');
                }
                int i15 = c19788o.f62758s;
                if (i15 != -1 && (i11 = c19788o.f62759t) != -1) {
                    sbM9893l.append(", res=");
                    sbM9893l.append(i15);
                    sbM9893l.append("x");
                    sbM9893l.append(i11);
                }
                C19781h c19781h = c19788o.f62765z;
                if (c19781h != null) {
                    int i16 = c19781h.f62680f;
                    int i17 = c19781h.f62679e;
                    if ((i17 != -1 && i16 != -1) || c19781h.m20743d()) {
                        sbM9893l.append(", color=");
                        if (c19781h.m20743d()) {
                            String strM20738b = C19781h.m20738b(c19781h.f62675a);
                            String strM20737a = C19781h.m20737a(c19781h.f62676b);
                            String strM20739c = C19781h.m20739c(c19781h.f62677c);
                            Locale locale = Locale.US;
                            str = strM20738b + Separators.SLASH + strM20737a + Separators.SLASH + strM20739c;
                        } else {
                            str = "NA/NA/NA";
                        }
                        sbM9893l.append(str + Separators.SLASH + ((i17 == -1 || i16 == -1) ? "NA/NA" : i17 + Separators.SLASH + i16));
                    }
                }
                float f11 = c19788o.f62760u;
                if (f11 != -1.0f) {
                    sbM9893l.append(", fps=");
                    sbM9893l.append(f11);
                }
                int i18 = c19788o.f62729A;
                if (i18 != -1) {
                    sbM9893l.append(", channels=");
                    sbM9893l.append(i18);
                }
                int i19 = c19788o.f62730B;
                if (i19 != -1) {
                    sbM9893l.append(", sample_rate=");
                    sbM9893l.append(i19);
                }
                String str5 = c19788o.f62743d;
                if (str5 != null) {
                    sbM9893l.append(", language=");
                    sbM9893l.append(str5);
                }
                AbstractC11278C abstractC11278C = c19788o.f62742c;
                if (!abstractC11278C.isEmpty()) {
                    sbM9893l.append(", labels=[");
                    new C9642z(String.valueOf(',')).m10202O(sbM9893l, abstractC11278C.iterator());
                    sbM9893l.append("]");
                }
                int i20 = c19788o.f62744e;
                if (i20 != 0) {
                    sbM9893l.append(", selectionFlags=[");
                    C9642z c9642z = new C9642z(String.valueOf(','));
                    int i21 = AbstractC20817s.f66106a;
                    ArrayList arrayList = new ArrayList();
                    if ((i20 & 4) != 0) {
                        arrayList.add("auto");
                    }
                    if ((i20 & 1) != 0) {
                        arrayList.add("default");
                    }
                    if ((i20 & 2) != 0) {
                        arrayList.add("forced");
                    }
                    c9642z.m10202O(sbM9893l, arrayList.iterator());
                    sbM9893l.append("]");
                }
                int i22 = c19788o.f62745f;
                if (i22 != 0) {
                    sbM9893l.append(", roleFlags=[");
                    C9642z c9642z2 = new C9642z(String.valueOf(','));
                    int i23 = AbstractC20817s.f66106a;
                    ArrayList arrayList2 = new ArrayList();
                    if ((i22 & 1) != 0) {
                        arrayList2.add("main");
                    }
                    if ((i22 & 2) != 0) {
                        arrayList2.add("alt");
                    }
                    if ((i22 & 4) != 0) {
                        arrayList2.add("supplementary");
                    }
                    if ((i22 & 8) != 0) {
                        arrayList2.add("commentary");
                    }
                    if ((i22 & 16) != 0) {
                        arrayList2.add("dub");
                    }
                    if ((i22 & 32) != 0) {
                        arrayList2.add("emergency");
                    }
                    if ((i22 & 64) != 0) {
                        arrayList2.add("caption");
                    }
                    if ((i22 & 128) != 0) {
                        arrayList2.add("subtitle");
                    }
                    if ((i22 & 256) != 0) {
                        arrayList2.add("sign");
                    }
                    if ((i22 & 512) != 0) {
                        arrayList2.add("describes-video");
                    }
                    if ((i22 & 1024) != 0) {
                        arrayList2.add("describes-music");
                    }
                    if ((i22 & 2048) != 0) {
                        arrayList2.add("enhanced-intelligibility");
                    }
                    if ((i22 & 4096) != 0) {
                        arrayList2.add("transcribes-dialog");
                    }
                    if ((i22 & 8192) != 0) {
                        arrayList2.add("easy-read");
                    }
                    if ((i22 & 16384) != 0) {
                        arrayList2.add("trick-play");
                    }
                    c9642z2.m10202O(sbM9893l, arrayList2.iterator());
                    sbM9893l.append("]");
                }
                String string = sbM9893l.toString();
                Locale locale2 = Locale.US;
                AbstractC20800b.m21332t("MediaCodecRenderer", AbstractC0010F.m20d("Format exceeds selected codec's capabilities [", string, ", ", str2, "]"));
            }
            this.f9763d1 = c3213n;
            this.f9760a1 = fMo3333N;
            this.f9757X0 = c19788o;
            int i24 = AbstractC20817s.f66106a;
            if (i24 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str2)) {
                String str6 = AbstractC20817s.f66109d;
                if (str6.startsWith("SM-T585") || str6.startsWith("SM-A510") || str6.startsWith("SM-A520") || str6.startsWith("SM-J700")) {
                    i10 = 2;
                } else if (i24 < 24) {
                    i10 = 0;
                } else {
                    i10 = 0;
                }
            } else if (i24 < 24 || !("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2))) {
                i10 = 0;
            } else {
                String str7 = AbstractC20817s.f66107b;
                if ("flounder".equals(str7) || "flounder_lte".equals(str7) || "grouper".equals(str7) || "tilapia".equals(str7)) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
            }
            this.f9764e1 = i10;
            C19788o c19788o2 = this.f9757X0;
            c19788o2.getClass();
            this.f9765f1 = i24 < 21 && c19788o2.f62755p.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
            this.f9766g1 = i24 == 19 && AbstractC20817s.f66109d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2));
            this.f9767h1 = i24 == 29 && "c2.android.aac.decoder".equals(str2);
            if (i24 > 23 || !"OMX.google.vorbis.decoder".equals(str2)) {
                if (i24 == 19) {
                    String str8 = AbstractC20817s.f66107b;
                    z6 = ("hb2000".equals(str8) || "stvm8".equals(str8)) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2));
                }
            }
            this.f9768i1 = z6;
            this.f9769j1 = i24 == 21 && "OMX.google.aac.decoder".equals(str2);
            if (i24 < 21 && "OMX.SEC.mp3.dec".equals(str2) && "samsung".equals(AbstractC20817s.f66108c)) {
                String str9 = AbstractC20817s.f66107b;
                if (str9.startsWith("baffin") || str9.startsWith("grand") || str9.startsWith("fortuna") || str9.startsWith("gprimelte") || str9.startsWith("j2y18lte") || str9.startsWith("ms01")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            this.f9770k1 = z10;
            String str10 = c3213n.f9703a;
            this.f9773n1 = (i24 <= 25 && "OMX.rk.video_decoder.avc".equals(str10)) || (i24 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str10) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str10) || "OMX.bcm.vdec.avc.tunnel".equals(str10) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str10) || "OMX.bcm.vdec.hevc.tunnel".equals(str10) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str10))) || (("Amazon".equals(AbstractC20817s.f66108c) && "AFTS".equals(AbstractC20817s.f66109d) && c3213n.f9708f) || mo4096M());
            this.f9756W0.getClass();
            if (this.f4302t0 == 2) {
                this.f4301s0.getClass();
                this.f9774o1 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f9742L1.f4311a++;
            mo3338W(jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime, str2);
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: S */
    public final boolean m4098S(long j10, long j11) {
        C19788o c19788o;
        return j11 < j10 && ((c19788o = this.f9747O0) == null || !Objects.equals(c19788o.f62752m, "audio/opus") || j10 - j11 > 80000);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0 A[Catch: r -> 0x00ba, TryCatch #0 {r -> 0x00ba, blocks: (B:56:0x00ac, B:58:0x00b0, B:64:0x00bd), top: B:74:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX INFO: renamed from: T */
    public final void m4099T() throws C1567l {
        C19788o c19788o;
        C7296c c7296c;
        if (this.f9756W0 != null || this.f9780u1 || (c19788o = this.f9745N0) == null) {
            return;
        }
        boolean z6 = true;
        boolean z10 = this.f9750Q0 == null && mo3346p0(c19788o);
        String str = c19788o.f62752m;
        if (z10) {
            m4088E();
            boolean zEquals = "audio/mp4a-latm".equals(str);
            C3207h c3207h = this.f9737J0;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                c3207h.getClass();
                c3207h.f9696x0 = 32;
            } else {
                c3207h.getClass();
                c3207h.f9696x0 = 1;
            }
            this.f9780u1 = true;
            return;
        }
        m4109m0(this.f9750Q0);
        if (this.f9749P0 == null) {
            try {
                c7296c = this.f9749P0;
                if (c7296c != null) {
                    AbstractC20800b.m21321i(str);
                    if (!c7296c.m7755G(str)) {
                        z6 = false;
                    }
                } else {
                    z6 = false;
                }
                m4100U(this.f9752S0, z6);
            } catch (C3217r e10) {
                throw m2389b(e10, c19788o, false, 4001);
            }
        } else {
            AbstractC20800b.m21320h(this.f9752S0 == null);
            C7296c c7296c2 = this.f9749P0;
            InterfaceC0798b interfaceC0798bM7763w = c7296c2.m7763w();
            if (AbstractC2662h.f8173a && (interfaceC0798bM7763w instanceof AbstractC2662h)) {
                int iM7749A = c7296c2.m7749A();
                if (iM7749A == 1) {
                    C2656b c2656bM7764x = c7296c2.m7764x();
                    c2656bM7764x.getClass();
                    throw m2389b(c2656bM7764x, this.f9745N0, false, c2656bM7764x.f8166Y);
                }
                if (iM7749A == 4) {
                    if (interfaceC0798bM7763w == null) {
                        if (c7296c2.m7764x() != null) {
                        }
                    } else if (interfaceC0798bM7763w instanceof AbstractC2662h) {
                        this.f9752S0 = new MediaCrypto(null, null);
                    }
                    c7296c = this.f9749P0;
                    if (c7296c != null) {
                        AbstractC20800b.m21321i(str);
                        if (!c7296c.m7755G(str)) {
                            z6 = false;
                        }
                    } else {
                        z6 = false;
                    }
                    m4100U(this.f9752S0, z6);
                }
            } else {
                if (interfaceC0798bM7763w == null) {
                    if (c7296c2.m7764x() != null) {
                    }
                } else if (interfaceC0798bM7763w instanceof AbstractC2662h) {
                    try {
                        this.f9752S0 = new MediaCrypto(null, null);
                    } catch (MediaCryptoException e11) {
                        throw m2389b(e11, this.f9745N0, false, 6006);
                    }
                }
                c7296c = this.f9749P0;
                if (c7296c != null) {
                    AbstractC20800b.m21321i(str);
                    if (!c7296c.m7755G(str)) {
                        z6 = false;
                    }
                } else {
                    z6 = false;
                }
                m4100U(this.f9752S0, z6);
            }
        }
        MediaCrypto mediaCrypto = this.f9752S0;
        if (mediaCrypto == null || this.f9756W0 != null) {
            return;
        }
        mediaCrypto.release();
        this.f9752S0 = null;
    }

    /* JADX INFO: renamed from: U */
    public final void m4100U(MediaCrypto mediaCrypto, boolean z6) throws C3217r {
        String diagnosticInfo;
        C19788o c19788o = this.f9745N0;
        c19788o.getClass();
        if (this.f9761b1 == null) {
            try {
                List listM4094K = m4094K(z6);
                this.f9761b1 = new ArrayDeque();
                if (!listM4094K.isEmpty()) {
                    this.f9761b1.add((C3213n) listM4094K.get(0));
                }
                this.f9762c1 = null;
            } catch (C3223x e10) {
                throw new C3217r(c19788o, e10, z6, -49998);
            }
        }
        if (this.f9761b1.isEmpty()) {
            throw new C3217r(c19788o, null, z6, -49999);
        }
        ArrayDeque arrayDeque = this.f9761b1;
        arrayDeque.getClass();
        while (this.f9756W0 == null) {
            C3213n c3213n = (C3213n) arrayDeque.peekFirst();
            c3213n.getClass();
            if (!mo4111o0(c3213n)) {
                return;
            }
            try {
                m4097R(c3213n, mediaCrypto);
            } catch (Exception e11) {
                AbstractC20800b.m21333u("MediaCodecRenderer", "Failed to initialize decoder: " + c3213n, e11);
                arrayDeque.removeFirst();
                String str = "Decoder init failed: " + c3213n.f9703a + ", " + c19788o;
                if (AbstractC20817s.f66106a >= 21) {
                    diagnosticInfo = e11 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e11).getDiagnosticInfo() : null;
                } else {
                    diagnosticInfo = null;
                }
                C3217r c3217r = new C3217r(str, e11, c19788o.f62752m, z6, c3213n, diagnosticInfo);
                mo3337V(c3217r);
                C3217r c3217r2 = this.f9762c1;
                if (c3217r2 == null) {
                    this.f9762c1 = c3217r;
                } else {
                    this.f9762c1 = new C3217r(c3217r2.getMessage(), c3217r2.getCause(), c3217r2.f9711Y, c3217r2.f9712Z, c3217r2.f9713o0, c3217r2.f9714p0);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.f9762c1;
                }
            }
        }
        this.f9761b1 = null;
    }

    /* JADX INFO: renamed from: V */
    public abstract void mo3337V(Exception exc);

    /* JADX INFO: renamed from: W */
    public abstract void mo3338W(long j10, long j11, String str);

    /* JADX INFO: renamed from: X */
    public abstract void mo3339X(String str);

    /* JADX WARN: Code duplicated, block: B:76:0x0100  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cf, code lost:
    
        if (r4.m7755G(r3) != false) goto L131;
     */
    /* JADX INFO: renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1558f mo3340Y(C15384c c15384c) throws C1567l {
        C19788o c19788o;
        int i10;
        InterfaceC0798b interfaceC0798bM7763w;
        InterfaceC0798b interfaceC0798bM7763w2;
        boolean z6 = true;
        this.f9736I1 = true;
        C19788o c19788o2 = (C19788o) c15384c.f47968o0;
        c19788o2.getClass();
        String str = c19788o2.f62752m;
        if (str == null) {
            throw m2389b(new IllegalArgumentException("Sample MIME type is null."), c19788o2, false, 4005);
        }
        if (!str.equals("video/av01") || c19788o2.f62755p.isEmpty()) {
            c19788o = c19788o2;
        } else {
            C19787n c19787nM20747a = c19788o2.m20747a();
            c19787nM20747a.f62717o = null;
            c19788o = new C19788o(c19787nM20747a);
        }
        C7296c c7296c = (C7296c) c15384c.f47967Z;
        C7296c c7296c2 = this.f9750Q0;
        if (c7296c2 != c7296c) {
            if (c7296c != null) {
                c7296c.m7760s(null);
            }
            if (c7296c2 != null) {
                c7296c2.m7754F(null);
            }
        }
        this.f9750Q0 = c7296c;
        this.f9745N0 = c19788o;
        if (this.f9780u1) {
            this.f9782w1 = true;
            return null;
        }
        InterfaceC3210k interfaceC3210k = this.f9756W0;
        if (interfaceC3210k == null) {
            this.f9761b1 = null;
            m4099T();
            return null;
        }
        C3213n c3213n = this.f9763d1;
        c3213n.getClass();
        C19788o c19788o3 = this.f9757X0;
        c19788o3.getClass();
        C7296c c7296c3 = this.f9749P0;
        C7296c c7296c4 = this.f9750Q0;
        if (c7296c3 != c7296c4) {
            if (c7296c4 != null && c7296c3 != null && (interfaceC0798bM7763w = c7296c4.m7763w()) != null && (interfaceC0798bM7763w2 = c7296c3.m7763w()) != null && interfaceC0798bM7763w.getClass().equals(interfaceC0798bM7763w2.getClass())) {
                if (interfaceC0798bM7763w instanceof AbstractC2662h) {
                    if (c7296c4.m7766z().equals(c7296c3.m7766z()) && AbstractC20817s.f66106a >= 23) {
                        UUID uuid = AbstractC19780g.f62673e;
                        if (!uuid.equals(c7296c3.m7766z()) && !uuid.equals(c7296c4.m7766z())) {
                            if (!c3213n.f9708f) {
                                String str2 = c19788o.f62752m;
                                str2.getClass();
                            }
                        }
                    }
                }
            }
            if (this.f9723B1) {
                this.f9785z1 = 1;
                this.f9722A1 = 3;
            } else {
                m4106i0();
                m4099T();
            }
            return new C1558f(c3213n.f9703a, c19788o3, c19788o, 0, 128);
        }
        boolean z10 = this.f9750Q0 != this.f9749P0;
        AbstractC20800b.m21320h(!z10 || AbstractC20817s.f66106a >= 23);
        C1558f c1558fMo3332C = mo3332C(c3213n, c19788o3, c19788o);
        int i11 = c1558fMo3332C.f4336d;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (m4112r0(c19788o)) {
                        this.f9757X0 = c19788o;
                        if (!z10 || m4089F()) {
                        }
                    } else {
                        i10 = 16;
                    }
                } else if (m4112r0(c19788o)) {
                    this.f9783x1 = true;
                    this.f9784y1 = 1;
                    int i12 = this.f9764e1;
                    if (i12 != 2 && (i12 != 1 || c19788o.f62758s != c19788o3.f62758s || c19788o.f62759t != c19788o3.f62759t)) {
                        z6 = false;
                    }
                    this.f9771l1 = z6;
                    this.f9757X0 = c19788o;
                    if (!z10 || m4089F()) {
                    }
                } else {
                    i10 = 16;
                }
            } else if (m4112r0(c19788o)) {
                this.f9757X0 = c19788o;
                if (z10) {
                    if (m4089F()) {
                    }
                } else if (this.f9723B1) {
                    this.f9785z1 = 1;
                    if (this.f9766g1 || this.f9768i1) {
                        this.f9722A1 = 3;
                    } else {
                        this.f9722A1 = 1;
                    }
                }
            } else {
                i10 = 16;
            }
            return (i11 != 0 || (this.f9756W0 == interfaceC3210k && this.f9722A1 != 3)) ? c1558fMo3332C : new C1558f(c3213n.f9703a, c19788o3, c19788o, 0, i10);
        }
        if (this.f9723B1) {
            this.f9785z1 = 1;
            this.f9722A1 = 3;
        } else {
            m4106i0();
            m4099T();
        }
        i10 = 0;
        if (i11 != 0) {
        }
    }

    /* JADX INFO: renamed from: Z */
    public abstract void mo3341Z(C19788o c19788o, MediaFormat mediaFormat);

    /* JADX INFO: renamed from: b0 */
    public void mo4101b0(long j10) {
        this.f9746N1 = j10;
        while (true) {
            ArrayDeque arrayDeque = this.f9741L0;
            if (arrayDeque.isEmpty() || j10 < ((C3219t) arrayDeque.peek()).f9717a) {
                return;
            }
            C3219t c3219t = (C3219t) arrayDeque.poll();
            c3219t.getClass();
            m4110n0(c3219t);
            mo3343c0();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public abstract void mo3343c0();

    /* JADX INFO: renamed from: f0 */
    public final void m4104f0() throws C1567l {
        int i10 = this.f9722A1;
        if (i10 == 1) {
            m4092I();
            return;
        }
        if (i10 == 2) {
            m4092I();
            m4113s0();
        } else if (i10 != 3) {
            this.f9734H1 = true;
            mo3345j0();
        } else {
            m4106i0();
            m4099T();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public abstract boolean mo3344g0(long j10, long j11, InterfaceC3210k interfaceC3210k, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z6, boolean z10, C19788o c19788o);

    /* JADX INFO: renamed from: h0 */
    public final boolean m4105h0(int i10) throws C1567l {
        C15384c c15384c = this.f4297o0;
        c15384c.m16638m();
        C0803g c0803g = this.f9731G0;
        c0803g.mo1834n();
        int iM2404u = m2404u(c15384c, c0803g, i10 | 4);
        if (iM2404u == -5) {
            mo3340Y(c15384c);
            return true;
        }
        if (iM2404u != -4 || !c0803g.m1824d(4)) {
            return false;
        }
        this.f9732G1 = true;
        m4104f0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public final void m4106i0() {
        try {
            InterfaceC3210k interfaceC3210k = this.f9756W0;
            if (interfaceC3210k != null) {
                interfaceC3210k.release();
                this.f9742L1.f4312b++;
                C3213n c3213n = this.f9763d1;
                c3213n.getClass();
                mo3339X(c3213n.f9703a);
            }
            this.f9756W0 = null;
            try {
                MediaCrypto mediaCrypto = this.f9752S0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f9752S0 = null;
                m4109m0(null);
                m4108l0();
            }
        } catch (Throwable th2) {
            this.f9756W0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f9752S0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
                this.f9752S0 = null;
                m4109m0(null);
                m4108l0();
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void mo4107k0() {
        this.f9775p1 = -1;
        this.f9733H0.f2226q0 = null;
        this.f9776q1 = -1;
        this.f9777r1 = null;
        this.f9774o1 = -9223372036854775807L;
        this.f9724C1 = false;
        this.f9723B1 = false;
        this.f9771l1 = false;
        this.f9772m1 = false;
        this.f9778s1 = false;
        this.f9779t1 = false;
        this.f9728E1 = -9223372036854775807L;
        this.f9730F1 = -9223372036854775807L;
        this.f9746N1 = -9223372036854775807L;
        this.f9785z1 = 0;
        this.f9722A1 = 0;
        this.f9784y1 = this.f9783x1 ? 1 : 0;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: l */
    public boolean mo2395l() {
        boolean zMo4941a;
        if (this.f9745N0 == null) {
            return false;
        }
        if (m2393j()) {
            zMo4941a = this.f4308z0;
        } else {
            InterfaceC4220U interfaceC4220U = this.f4303u0;
            interfaceC4220U.getClass();
            zMo4941a = interfaceC4220U.mo4941a();
        }
        if (!zMo4941a) {
            if (!(this.f9776q1 >= 0)) {
                if (this.f9774o1 == -9223372036854775807L) {
                    return false;
                }
                this.f4301s0.getClass();
                if (SystemClock.elapsedRealtime() >= this.f9774o1) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m4108l0() {
        mo4107k0();
        this.f9740K1 = null;
        this.f9761b1 = null;
        this.f9763d1 = null;
        this.f9757X0 = null;
        this.f9758Y0 = null;
        this.f9759Z0 = false;
        this.f9726D1 = false;
        this.f9760a1 = -1.0f;
        this.f9764e1 = 0;
        this.f9765f1 = false;
        this.f9766g1 = false;
        this.f9767h1 = false;
        this.f9768i1 = false;
        this.f9769j1 = false;
        this.f9770k1 = false;
        this.f9773n1 = false;
        this.f9783x1 = false;
        this.f9784y1 = 0;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: m */
    public void mo2396m() {
        this.f9745N0 = null;
        m4110n0(C3219t.f9716e);
        this.f9741L0.clear();
        m4093J();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m4109m0(C7296c c7296c) {
        C7296c c7296c2 = this.f9749P0;
        if (c7296c2 != c7296c) {
            if (c7296c != null) {
                c7296c.m7760s(null);
            }
            if (c7296c2 != null) {
                c7296c2.m7754F(null);
            }
        }
        this.f9749P0 = c7296c;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m4110n0(C3219t c3219t) {
        this.f9744M1 = c3219t;
        if (c3219t.f9719c != -9223372036854775807L) {
            this.f9748O1 = true;
            mo3342a0();
        }
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: o */
    public void mo2398o(long j10, boolean z6) throws C1567l {
        this.f9732G1 = false;
        this.f9734H1 = false;
        this.f9738J1 = false;
        if (this.f9780u1) {
            this.f9737J0.mo1834n();
            this.f9735I0.mo1834n();
            this.f9781v1 = false;
            C2272M c2272m = this.f9743M0;
            c2272m.getClass();
            c2272m.f7021a = InterfaceC20101d.f63646a;
            c2272m.f7023c = 0;
            c2272m.f7022b = 2;
        } else if (m4093J()) {
            m4099T();
        }
        if (this.f9744M1.f9720d.m5079K() > 0) {
            this.f9736I1 = true;
        }
        this.f9744M1.f9720d.m5093l();
        this.f9741L0.clear();
    }

    /* JADX INFO: renamed from: o0 */
    public boolean mo4111o0(C3213n c3213n) {
        return true;
    }

    /* JADX INFO: renamed from: p0 */
    public boolean mo3346p0(C19788o c19788o) {
        return false;
    }

    /* JADX INFO: renamed from: q0 */
    public abstract int mo3347q0(C3221v c3221v, C19788o c19788o);

    /* JADX INFO: renamed from: r0 */
    public final boolean m4112r0(C19788o c19788o) throws C1567l {
        if (AbstractC20817s.f66106a >= 23 && this.f9756W0 != null && this.f9722A1 != 3 && this.f4302t0 != 0) {
            float f10 = this.f9755V0;
            c19788o.getClass();
            C19788o[] c19788oArr = this.f4304v0;
            c19788oArr.getClass();
            float fMo3333N = mo3333N(f10, c19788oArr);
            float f11 = this.f9760a1;
            if (f11 == fMo3333N) {
                return true;
            }
            if (fMo3333N == -1.0f) {
                if (this.f9723B1) {
                    this.f9785z1 = 1;
                    this.f9722A1 = 3;
                    return false;
                }
                m4106i0();
                m4099T();
                return false;
            }
            if (f11 == -1.0f && fMo3333N <= this.f9729F0) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fMo3333N);
            InterfaceC3210k interfaceC3210k = this.f9756W0;
            interfaceC3210k.getClass();
            interfaceC3210k.setParameters(bundle);
            this.f9760a1 = fMo3333N;
        }
        return true;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m4113s0() throws C1567l {
        C7296c c7296c = this.f9750Q0;
        c7296c.getClass();
        InterfaceC0798b interfaceC0798bM7763w = c7296c.m7763w();
        if (interfaceC0798bM7763w instanceof AbstractC2662h) {
            try {
                MediaCrypto mediaCrypto = this.f9752S0;
                mediaCrypto.getClass();
                ((AbstractC2662h) interfaceC0798bM7763w).getClass();
                mediaCrypto.setMediaDrmSession(null);
            } catch (MediaCryptoException e10) {
                throw m2389b(e10, this.f9745N0, false, 6006);
            }
        }
        m4109m0(this.f9750Q0);
        this.f9785z1 = 0;
        this.f9722A1 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r7 >= r5) goto L13;
     */
    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2403t(C19788o[] c19788oArr, long j10, long j11) {
        if (this.f9744M1.f9719c == -9223372036854775807L) {
            m4110n0(new C3219t(-9223372036854775807L, j10, j11));
            return;
        }
        ArrayDeque arrayDeque = this.f9741L0;
        if (arrayDeque.isEmpty()) {
            long j12 = this.f9728E1;
            if (j12 != -9223372036854775807L) {
                long j13 = this.f9746N1;
                if (j13 != -9223372036854775807L) {
                }
            }
            m4110n0(new C3219t(-9223372036854775807L, j10, j11));
            if (this.f9744M1.f9719c != -9223372036854775807L) {
                mo3343c0();
                return;
            }
            return;
        }
        arrayDeque.add(new C3219t(this.f9728E1, j10, j11));
    }

    /* JADX INFO: renamed from: t0 */
    public final void m4114t0(long j10) {
        C19788o c19788o = (C19788o) this.f9744M1.f9720d.m5075G(j10);
        if (c19788o == null && this.f9748O1 && this.f9758Y0 != null) {
            c19788o = (C19788o) this.f9744M1.f9720d.m5074F();
        }
        if (c19788o != null) {
            this.f9747O0 = c19788o;
        } else if (!this.f9759Z0 || this.f9747O0 == null) {
            return;
        }
        C19788o c19788o2 = this.f9747O0;
        c19788o2.getClass();
        mo3341Z(c19788o2, this.f9758Y0);
        this.f9759Z0 = false;
        this.f9748O1 = false;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: v */
    public void mo2405v(long j10, long j11) throws C1567l {
        boolean z6;
        boolean z10;
        boolean z11 = false;
        if (this.f9738J1) {
            this.f9738J1 = false;
            m4104f0();
        }
        C1567l c1567l = this.f9740K1;
        if (c1567l != null) {
            this.f9740K1 = null;
            throw c1567l;
        }
        try {
            if (this.f9734H1) {
                mo3345j0();
                return;
            }
            if (this.f9745N0 != null || m4105h0(2)) {
                m4099T();
                if (this.f9780u1) {
                    Trace.beginSection("bypassRender");
                    while (m4086B(j10, j11)) {
                    }
                    Trace.endSection();
                } else if (this.f9756W0 != null) {
                    this.f4301s0.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (m4090G(j10, j11)) {
                        long j12 = this.f9753T0;
                        if (j12 != -9223372036854775807L) {
                            this.f4301s0.getClass();
                            z10 = SystemClock.elapsedRealtime() - jElapsedRealtime < j12;
                        }
                        if (!z10) {
                            break;
                        }
                    }
                    while (m4091H()) {
                        long j13 = this.f9753T0;
                        if (j13 != -9223372036854775807L) {
                            this.f4301s0.getClass();
                            z6 = SystemClock.elapsedRealtime() - jElapsedRealtime < j13;
                        }
                        if (!z6) {
                            break;
                        }
                    }
                    Trace.endSection();
                } else {
                    C1556e c1556e = this.f9742L1;
                    int i10 = c1556e.f4314d;
                    InterfaceC4220U interfaceC4220U = this.f4303u0;
                    interfaceC4220U.getClass();
                    c1556e.f4314d = i10 + interfaceC4220U.mo4943c(j10 - this.f4305w0);
                    m4105h0(1);
                }
                synchronized (this.f9742L1) {
                }
            }
        } catch (IllegalStateException e10) {
            int i11 = AbstractC20817s.f66106a;
            if (i11 < 21 || !(e10 instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e10.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e10;
                }
            }
            mo3337V(e10);
            if (i11 >= 21) {
                if (e10 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e10).isRecoverable() : false) {
                    z11 = true;
                }
            }
            if (z11) {
                m4106i0();
            }
            C3212m c3212mMo4087D = mo4087D(e10, this.f9763d1);
            throw m2389b(c3212mMo4087D, this.f9745N0, z11, c3212mMo4087D.f9702Y == 1101 ? 4006 : 4003);
        }
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: y */
    public void mo2408y(float f10, float f11) throws C1567l {
        this.f9754U0 = f10;
        this.f9755V0 = f11;
        m4112r0(this.f9757X0);
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: z */
    public final int mo2409z(C19788o c19788o) throws C1567l {
        try {
            return mo3347q0(this.f9727E0, c19788o);
        } catch (C3223x e10) {
            throw m2389b(e10, c19788o, false, 4002);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void mo3342a0() {
    }

    /* JADX INFO: renamed from: j0 */
    public void mo3345j0() {
    }

    /* JADX INFO: renamed from: d0 */
    public void mo4102d0(C0803g c0803g) {
    }

    /* JADX INFO: renamed from: e0 */
    public void mo4103e0(C19788o c19788o) {
    }
}
