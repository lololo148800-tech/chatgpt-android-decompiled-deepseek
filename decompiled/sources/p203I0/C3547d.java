package p203I0;

import androidx.compose.material.ripple.RippleNode;
import androidx.compose.material3.C10856a;
import androidx.compose.material3.C10857b;
import com.google.protobuf.AbstractC12107L1;
import fo.C13711h;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p1140z1.AbstractC21690f;
import p1140z1.C21660F;
import p523V9.AbstractC8088f6;
import p594Y9.AbstractC9930m3;
import p604Yk.C10077b;
import p692d0.C12951D;
import p758g0.C13756d;
import p759g1.C13800b;
import p759g1.C13803e;
import p774h1.C14365u;
import p821j1.C16037b;
import p821j1.C16042g;
import p894n0.C17409o;
import p894n0.InterfaceC17406l;

/* JADX INFO: renamed from: I0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3547d extends RippleNode {

    /* JADX INFO: renamed from: I0 */
    public final C12951D f10750I0;

    public C3547d(InterfaceC17406l interfaceC17406l, boolean z6, float f10, C10856a c10856a, C10857b c10857b) {
        super(interfaceC17406l, z6, f10, c10856a, c10857b);
        this.f10750I0 = new C12951D();
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: D0 */
    public final void mo4226D0() {
        this.f10750I0.m14615a();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0058 A[LOOP:0: B:5:0x0012->B:15:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x005b A[EDGE_INSN: B:23:0x005b->B:16:0x005b BREAK  A[LOOP:0: B:5:0x0012->B:15:0x0058], SYNTHETIC] */
    @Override // androidx.compose.material.ripple.RippleNode
    /* JADX INFO: renamed from: K0 */
    public final void mo4227K0(C17409o c17409o, long j10, float f10) {
        C12951D c12951d = this.f10750I0;
        Object[] objArr = c12951d.f41124b;
        Object[] objArr2 = c12951d.f41125c;
        long[] jArr = c12951d.f41123a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j11 = jArr[i10];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j11) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            C3559p c3559p = (C3559p) objArr2[i13];
                            c3559p.f10789k.setValue(Boolean.TRUE);
                            c3559p.f10787i.m1298O(C17296C.f55119a);
                        }
                        j11 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        boolean z6 = this.f32638A0;
        C3559p c3559p2 = new C3559p(z6 ? new C13800b(c17409o.f55604a) : null, f10, z6);
        c12951d.m14623i(c17409o, c3559p2);
        AbstractC0575H.m1156D(m10935y0(), null, null, new C3546c(c3559p2, this, c17409o, null), 3);
        AbstractC21690f.m22209n(this);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    /* JADX INFO: renamed from: L0 */
    public final void mo4228L0(C21660F c21660f) {
        float f10;
        long[] jArr;
        Object[] objArr;
        Object[] objArr2;
        float f11;
        long[] jArr2;
        Object[] objArr3;
        int i10;
        float f12 = ((C3551h) this.f32640C0.invoke()).f10762d;
        if (f12 == 0.0f) {
            return;
        }
        C12951D c12951d = this.f10750I0;
        Object[] objArr4 = c12951d.f41124b;
        Object[] objArr5 = c12951d.f41125c;
        long[] jArr3 = c12951d.f41123a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j10 = jArr3[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j10) < 128) {
                        int i15 = (i11 << 3) + i14;
                        Object obj = objArr4[i15];
                        C3559p c3559p = (C3559p) objArr5[i15];
                        long jM15774b = C14365u.m15774b(f12, m11278M0());
                        if (c3559p.f10782d == null) {
                            long jMo17602i = c21660f.mo17602i();
                            float f13 = AbstractC3560q.f10790a;
                            c3559p.f10782d = Float.valueOf(Math.max(C13803e.m15333e(jMo17602i), C13803e.m15331c(jMo17602i)) * 0.3f);
                        }
                        C13800b c13800b = c3559p.f10779a;
                        f11 = f12;
                        C16037b c16037b = c21660f.f68674Y;
                        if (c13800b == null) {
                            c3559p.f10779a = new C13800b(c16037b.mo17604o0());
                        }
                        if (c3559p.f10783e == null) {
                            c3559p.f10783e = new C13800b(AbstractC8088f6.m8536b(C13803e.m15333e(c21660f.mo17602i()) / 2.0f, C13803e.m15331c(c21660f.mo17602i()) / 2.0f));
                        }
                        float fFloatValue = (!((Boolean) c3559p.f10789k.getValue()).booleanValue() || ((Boolean) c3559p.f10788j.getValue()).booleanValue()) ? ((Number) c3559p.f10784f.m15224e()).floatValue() : 1.0f;
                        Float f14 = c3559p.f10782d;
                        AbstractC16544l.m18091d(f14);
                        objArr3 = objArr5;
                        float fM10589c = AbstractC9930m3.m10589c(f14.floatValue(), c3559p.f10780b, ((Number) c3559p.f10785g.m15224e()).floatValue());
                        C13800b c13800b2 = c3559p.f10779a;
                        AbstractC16544l.m18091d(c13800b2);
                        float fM15306g = C13800b.m15306g(c13800b2.f43584a);
                        C13800b c13800b3 = c3559p.f10783e;
                        AbstractC16544l.m18091d(c13800b3);
                        float fM15306g2 = C13800b.m15306g(c13800b3.f43584a);
                        C13756d c13756d = c3559p.f10786h;
                        jArr2 = jArr3;
                        float fM10589c2 = AbstractC9930m3.m10589c(fM15306g, fM15306g2, ((Number) c13756d.m15224e()).floatValue());
                        C13800b c13800b4 = c3559p.f10779a;
                        AbstractC16544l.m18091d(c13800b4);
                        i10 = length;
                        float fM15307h = C13800b.m15307h(c13800b4.f43584a);
                        C13800b c13800b5 = c3559p.f10783e;
                        AbstractC16544l.m18091d(c13800b5);
                        long jM8536b = AbstractC8088f6.m8536b(fM10589c2, AbstractC9930m3.m10589c(fM15307h, C13800b.m15307h(c13800b5.f43584a), ((Number) c13756d.m15224e()).floatValue()));
                        long jM15774b2 = C14365u.m15774b(C14365u.m15776d(jM15774b) * fFloatValue, jM15774b);
                        if (c3559p.f10781c) {
                            float fM15333e = C13803e.m15333e(c21660f.mo17602i());
                            float fM15331c = C13803e.m15331c(c21660f.mo17602i());
                            C13711h c13711h = c16037b.f49479Z;
                            long jM15202x = c13711h.m15202x();
                            c13711h.m15196m().mo15706e();
                            try {
                                ((C10077b) c13711h.f43259Z).m10675z(0.0f, 0.0f, fM15333e, fM15331c, 1);
                                c21660f.mo17591U(jM15774b2, (112 & 2) != 0 ? C13803e.m15332d(c21660f.mo17602i()) / 2.0f : fM10589c, (112 & 4) != 0 ? c21660f.mo17604o0() : jM8536b, (112 & 8) != 0 ? 1.0f : 0.0f, (112 & 16) != 0 ? C16042g.f49483a : null, null, 3);
                                AbstractC12107L1.m13830u(c13711h, jM15202x);
                            } catch (Throwable th2) {
                                AbstractC12107L1.m13830u(c13711h, jM15202x);
                                throw th2;
                            }
                        } else {
                            c21660f.mo17591U(jM15774b2, (112 & 2) != 0 ? C13803e.m15332d(c21660f.mo17602i()) / 2.0f : fM10589c, (112 & 4) != 0 ? c21660f.mo17604o0() : jM8536b, (112 & 8) != 0 ? 1.0f : 0.0f, (112 & 16) != 0 ? C16042g.f49483a : null, null, 3);
                        }
                    } else {
                        f11 = f12;
                        jArr2 = jArr3;
                        objArr4 = objArr4;
                        objArr3 = objArr5;
                        i10 = length;
                    }
                    j10 >>= 8;
                    i14++;
                    i12 = 8;
                    f12 = f11;
                    objArr4 = objArr4;
                    objArr5 = objArr3;
                    jArr3 = jArr2;
                    length = i10;
                }
                f10 = f12;
                jArr = jArr3;
                objArr = objArr4;
                objArr2 = objArr5;
                int i16 = length;
                if (i13 != i12) {
                    return;
                } else {
                    length = i16;
                }
            } else {
                f10 = f12;
                jArr = jArr3;
                objArr = objArr4;
                objArr2 = objArr5;
            }
            if (i11 == length) {
                return;
            }
            i11++;
            f12 = f10;
            objArr4 = objArr;
            objArr5 = objArr2;
            jArr3 = jArr;
        }
    }

    @Override // androidx.compose.material.ripple.RippleNode
    /* JADX INFO: renamed from: O0 */
    public final void mo4229O0(C17409o c17409o) {
        C3559p c3559p = (C3559p) this.f10750I0.m14619e(c17409o);
        if (c3559p != null) {
            c3559p.f10789k.setValue(Boolean.TRUE);
            c3559p.f10787i.m1298O(C17296C.f55119a);
        }
    }
}
