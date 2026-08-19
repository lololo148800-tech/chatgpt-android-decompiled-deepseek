package p179H0;

import android.text.Layout;
import com.google.protobuf.AbstractC12107L1;
import fo.C13711h;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16557y;
import kotlin.jvm.internal.C16558z;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1140z1.C21660F;
import p131F1.C2633k;
import p204I1.C3581L;
import p204I1.C3585a;
import p204I1.C3601q;
import p230J1.C4199z;
import p349O0.InterfaceC5982V0;
import p523V9.AbstractC8112i6;
import p544W9.AbstractC8676n;
import p604Yk.C10077b;
import p759g1.C13800b;
import p759g1.C13801c;
import p774h1.C14351g;
import p774h1.C14356l;
import p774h1.InterfaceC14333K;
import p775h2.AbstractC14376f;
import p821j1.C16037b;
import p821j1.C16043h;
import p821j1.InterfaceC16039d;

/* JADX INFO: renamed from: H0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3186d extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9600Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f9601Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f9602o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f9603p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f9604q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3186d(long j10, float[] fArr, C16558z c16558z, C16557y c16557y) {
        super(1);
        this.f9600Y = 1;
        this.f9601Z = j10;
        this.f9602o0 = fArr;
        this.f9603p0 = c16558z;
        this.f9604q0 = c16557y;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) throws Throwable {
        long j10;
        C13711h c13711h;
        C4199z c4199z;
        Layout layout;
        float fM3621a;
        float fM3621a2;
        float f10;
        switch (this.f9600Y) {
            case 0:
                InterfaceC16039d interfaceC16039d = (InterfaceC16039d) obj;
                C3196n c3196n = (C3196n) this.f9602o0;
                float fM4042a = c3196n.m4042a() / c3196n.f9644g.m6409g();
                float fMax = (Math.max(Math.min(1.0f, fM4042a) - 0.4f, 0.0f) * 5) / 3;
                float fAbs = Math.abs(fM4042a) - 1.0f;
                float f11 = fAbs >= 0.0f ? fAbs : 0.0f;
                if (f11 > 2.0f) {
                    f11 = 2.0f;
                }
                float fPow = (((0.4f * fMax) - 0.25f) + (f11 - (((float) Math.pow(f11, 2)) / 4))) * 0.5f;
                float f12 = 360;
                float f13 = fPow * f12;
                float f14 = ((0.8f * fMax) + fPow) * f12;
                float fMin = Math.min(1.0f, fMax);
                C3183a c3183a = new C3183a();
                c3183a.f9593Y = f14;
                c3183a.f9594Z = fMin;
                float fFloatValue = ((Number) ((InterfaceC5982V0) this.f9603p0).getValue()).floatValue();
                long j11 = this.f9601Z;
                InterfaceC14333K interfaceC14333K = (InterfaceC14333K) this.f9604q0;
                long jMo17604o0 = interfaceC16039d.mo17604o0();
                C13711h c13711hMo17601f0 = interfaceC16039d.mo17601f0();
                long jM15202x = c13711hMo17601f0.m15202x();
                c13711hMo17601f0.m15196m().mo15706e();
                try {
                    ((C10077b) c13711hMo17601f0.f43259Z).m10662J(fPow, jMo17604o0);
                    float fMo7864b0 = interfaceC16039d.mo7864b0(AbstractC3189g.f9616c);
                    float f15 = AbstractC3189g.f9617d;
                    float fMo7864b1 = (interfaceC16039d.mo7864b0(f15) / 2.0f) + fMo7864b0;
                    C13801c c13801c = new C13801c(C13800b.m15306g(AbstractC8112i6.m8605c(interfaceC16039d.mo17602i())) - fMo7864b1, C13800b.m15307h(AbstractC8112i6.m8605c(interfaceC16039d.mo17602i())) - fMo7864b1, C13800b.m15306g(AbstractC8112i6.m8605c(interfaceC16039d.mo17602i())) + fMo7864b1, C13800b.m15307h(AbstractC8112i6.m8605c(interfaceC16039d.mo17602i())) + fMo7864b1);
                    try {
                        interfaceC16039d.mo17606v(j11, f13, f14 - f13, c13801c.m15320g(), c13801c.m15319f(), (832 & 64) != 0 ? 1.0f : fFloatValue, new C16043h(interfaceC16039d.mo7864b0(f15), 0.0f, 2, 0, 26), null, 3);
                        AbstractC3189g.m4037c(interfaceC16039d, interfaceC14333K, c13801c, j11, fFloatValue, c3183a);
                        AbstractC12107L1.m13830u(c13711hMo17601f0, jM15202x);
                        return C17296C.f55119a;
                    } catch (Throwable th2) {
                        th = th2;
                        j10 = jM15202x;
                        c13711h = c13711hMo17601f0;
                        AbstractC12107L1.m13830u(c13711h, j10);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    j10 = jM15202x;
                    c13711h = c13711hMo17601f0;
                }
                break;
            case 1:
                C3601q c3601q = (C3601q) obj;
                int i10 = c3601q.f10969b;
                long j12 = this.f9601Z;
                int iM4270f = i10 > C3581L.m4270f(j12) ? c3601q.f10969b : C3581L.m4270f(j12);
                int iM4269e = C3581L.m4269e(j12);
                int iM4269e2 = c3601q.f10970c;
                if (iM4269e2 >= iM4269e) {
                    iM4269e2 = C3581L.m4269e(j12);
                }
                long jM9365b = AbstractC8676n.m9365b(c3601q.m4319b(iM4270f), c3601q.m4319b(iM4269e2));
                C16558z c16558z = (C16558z) this.f9603p0;
                int i11 = c16558z.f51287Y;
                C3585a c3585a = c3601q.f10968a;
                int iM4270f2 = C3581L.m4270f(jM9365b);
                int iM4269e3 = C3581L.m4269e(jM9365b);
                C4199z c4199z2 = c3585a.f10918d;
                Layout layout2 = c4199z2.f13640f;
                int length = layout2.getText().length();
                if (iM4270f2 < 0) {
                    throw new IllegalArgumentException("startOffset must be > 0");
                }
                if (iM4270f2 >= length) {
                    throw new IllegalArgumentException("startOffset must be less than text length");
                }
                if (iM4269e3 <= iM4270f2) {
                    throw new IllegalArgumentException("endOffset must be greater than startOffset");
                }
                if (iM4269e3 > length) {
                    throw new IllegalArgumentException("endOffset must be smaller or equal to text length");
                }
                int i12 = (iM4269e3 - iM4270f2) * 4;
                float[] fArr = (float[]) this.f9602o0;
                if (fArr.length - i11 < i12) {
                    throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout2.getLineForOffset(iM4270f2);
                int lineForOffset2 = layout2.getLineForOffset(iM4269e3 - 1);
                C2633k c2633k = new C2633k(c4199z2);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout2.getLineStart(lineForOffset);
                        int iM4899f = c4199z2.m4899f(lineForOffset);
                        int iMax = Math.max(iM4270f2, lineStart);
                        int iMin = Math.min(iM4269e3, iM4899f);
                        float fM4900g = c4199z2.m4900g(lineForOffset);
                        float fM4898e = c4199z2.m4898e(lineForOffset);
                        int i13 = i11;
                        int i14 = iM4270f2;
                        int i15 = iM4269e3;
                        boolean z6 = false;
                        boolean z10 = layout2.getParagraphDirection(lineForOffset) == 1;
                        int i16 = iMax;
                        int i17 = i13;
                        while (i16 < iMin) {
                            boolean zIsRtlCharAt = layout2.isRtlCharAt(i16);
                            if (!z10 || zIsRtlCharAt) {
                                c4199z = c4199z2;
                                if (z10 && zIsRtlCharAt) {
                                    z6 = false;
                                    float fM3621a3 = c2633k.m3621a(i16, false, false, false);
                                    layout = layout2;
                                    fM3621a = c2633k.m3621a(i16 + 1, true, true, false);
                                    fM3621a2 = fM3621a3;
                                } else {
                                    layout = layout2;
                                    z6 = false;
                                    if (z10 || !zIsRtlCharAt) {
                                        fM3621a = c2633k.m3621a(i16, false, false, false);
                                        fM3621a2 = c2633k.m3621a(i16 + 1, true, true, false);
                                    } else {
                                        fM3621a2 = c2633k.m3621a(i16, false, false, true);
                                        fM3621a = c2633k.m3621a(i16 + 1, true, true, true);
                                        z6 = false;
                                    }
                                }
                            } else {
                                c4199z = c4199z2;
                                fM3621a = c2633k.m3621a(i16, z6, z6, true);
                                fM3621a2 = c2633k.m3621a(i16 + 1, true, true, true);
                                layout = layout2;
                                z6 = false;
                            }
                            fArr[i17] = fM3621a;
                            fArr[i17 + 1] = fM4900g;
                            fArr[i17 + 2] = fM3621a2;
                            fArr[i17 + 3] = fM4898e;
                            i17 += 4;
                            i16++;
                            c4199z2 = c4199z;
                            layout2 = layout;
                        }
                        C4199z c4199z3 = c4199z2;
                        Layout layout3 = layout2;
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            i11 = i17;
                            iM4270f2 = i14;
                            iM4269e3 = i15;
                            c4199z2 = c4199z3;
                            layout2 = layout3;
                        }
                    }
                }
                int iM4268d = (C3581L.m4268d(jM9365b) * 4) + c16558z.f51287Y;
                int i18 = c16558z.f51287Y;
                while (true) {
                    C16557y c16557y = (C16557y) this.f9604q0;
                    if (i18 >= iM4268d) {
                        c16558z.f51287Y = iM4268d;
                        c16557y.f51286Y = c3585a.m4282b() + c16557y.f51286Y;
                        return C17296C.f55119a;
                    }
                    int i19 = i18 + 1;
                    float f16 = fArr[i19];
                    float f17 = c16557y.f51286Y;
                    fArr[i19] = f16 + f17;
                    int i20 = i18 + 3;
                    fArr[i20] = fArr[i20] + f17;
                    i18 += 4;
                }
                break;
            default:
                C21660F c21660f = (C21660F) obj;
                c21660f.m22080a();
                C13801c c13801c2 = (C13801c) this.f9602o0;
                C16525B c16525b = (C16525B) this.f9603p0;
                long j13 = this.f9601Z;
                C14356l c14356l = (C14356l) this.f9604q0;
                C16037b c16037b = c21660f.f68674Y;
                C10077b c10077b = (C10077b) c16037b.f49479Z.f43259Z;
                float f18 = c13801c2.f43586a;
                float f19 = c13801c2.f43587b;
                c10077b.m10665M(f18, f19);
                try {
                    f10 = f19;
                    try {
                        AbstractC14376f.m15843i(c21660f, (C14351g) c16525b.f51262Y, 0L, j13, 0L, 0.0f, c14356l, 0, 890);
                        ((C10077b) c16037b.f49479Z.f43259Z).m10665M(-f18, -f10);
                        return C17296C.f55119a;
                    } catch (Throwable th4) {
                        th = th4;
                        ((C10077b) c16037b.f49479Z.f43259Z).m10665M(-f18, -f10);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    f10 = f19;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3186d(Object obj, Object obj2, long j10, Object obj3, int i10) {
        super(1);
        this.f9600Y = i10;
        this.f9602o0 = obj;
        this.f9603p0 = obj2;
        this.f9601Z = j10;
        this.f9604q0 = obj3;
    }
}
