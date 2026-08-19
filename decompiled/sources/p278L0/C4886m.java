package p278L0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17309l;
import p049Bm.InterfaceC1426a;
import p349O0.C5944C;
import p349O0.C5994b0;
import p349O0.C6002f0;
import p658b5.C11246q;

/* JADX INFO: renamed from: L0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C4886m extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f15926Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11246q f15927Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4886m(C11246q c11246q, int i10) {
        super(0);
        this.f15926Y = i10;
        this.f15927Z = c11246q;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        Object objM5500b;
        switch (this.f15926Y) {
            case 0:
                return this.f15927Z.m12638h();
            case 1:
                C11246q c11246q = this.f15927Z;
                return new C17309l(c11246q.m12638h(), ((C5944C) c11246q.f34071h).getValue());
            case 2:
                C11246q c11246q2 = this.f15927Z;
                Object value = ((C6002f0) c11246q2.f34075l).getValue();
                if (value != null) {
                    return value;
                }
                float fM6409g = ((C5994b0) c11246q2.f34073j).m6409g();
                boolean zIsNaN = Float.isNaN(fM6409g);
                C6002f0 c6002f0 = (C6002f0) c11246q2.f34070g;
                if (zIsNaN) {
                    return c6002f0.getValue();
                }
                Object value2 = c6002f0.getValue();
                C4855T c4855tM12638h = c11246q2.m12638h();
                float fM5502d = c4855tM12638h.m5502d(value2);
                if (fM5502d != fM6409g && !Float.isNaN(fM5502d) && (fM5502d >= fM6409g ? (objM5500b = c4855tM12638h.m5500b(fM6409g, false)) != null : (objM5500b = c4855tM12638h.m5500b(fM6409g, true)) != null)) {
                    value2 = objM5500b;
                }
                return value2;
            case 3:
                C11246q c11246q3 = this.f15927Z;
                float fM5502d2 = c11246q3.m12638h().m5502d(((C6002f0) c11246q3.f34070g).getValue());
                float fM5502d3 = c11246q3.m12638h().m5502d(((C5944C) c11246q3.f34072i).getValue()) - fM5502d2;
                float fAbs = Math.abs(fM5502d3);
                float f10 = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float fM12653w = (c11246q3.m12653w() - fM5502d2) / fM5502d3;
                    if (fM12653w < 1.0E-6f) {
                        f10 = 0.0f;
                    } else if (fM12653w <= 0.999999f) {
                        f10 = fM12653w;
                    }
                }
                return Float.valueOf(f10);
            default:
                C11246q c11246q4 = this.f15927Z;
                Object value3 = ((C6002f0) c11246q4.f34075l).getValue();
                if (value3 != null) {
                    return value3;
                }
                float fM6409g2 = ((C5994b0) c11246q4.f34073j).m6409g();
                boolean zIsNaN2 = Float.isNaN(fM6409g2);
                C6002f0 c6002f1 = (C6002f0) c11246q4.f34070g;
                return !zIsNaN2 ? c11246q4.m12635e(fM6409g2, 0.0f, c6002f1.getValue()) : c6002f1.getValue();
        }
    }
}
