package p254K0;

import java.util.ArrayList;
import p200Hm.C3507f;
import p523V9.AbstractC7965P4;
import p530Vi.AbstractC8301I;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: K0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C4522s {

    /* JADX INFO: renamed from: b */
    public float f14779b;

    /* JADX INFO: renamed from: a */
    public int f14778a = -1;

    /* JADX INFO: renamed from: c */
    public final ArrayList f14780c = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x010d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0110  */
    /* JADX WARN: Code duplicated, block: B:51:0x0119  */
    /* JADX WARN: Code duplicated, block: B:56:0x0124  */
    /* JADX INFO: renamed from: b */
    public static ArrayList m5263b(int i10, float f10, int i11, int i12, float f11, float f12, float f13, ArrayList arrayList) {
        float f14;
        float f15;
        boolean z6;
        float f16;
        float f17;
        C3507f c3507f;
        float f18;
        float f19;
        C3507f it;
        float f20;
        int iMo4199a;
        float f21;
        float f22;
        float f23;
        boolean z10;
        float f24;
        boolean z11;
        int iMo4199a2;
        float f25;
        float f26;
        float f27;
        boolean z12;
        float fAbs;
        boolean z13;
        C4521r c4521r = (C4521r) arrayList.get(i10);
        ArrayList arrayList2 = new ArrayList();
        float f28 = c4521r.f14776a;
        float f29 = 2;
        float f30 = f28 / f29;
        if (!(f10 - f30 < 0.0f && f10 + f30 > 0.0f)) {
            float f31 = f28 / f29;
            if (f10 - f31 >= f12 || f10 + f31 <= f12) {
                f14 = 0.0f;
            } else {
                f15 = (f31 + f10) - f12;
            }
            if (i11 <= i10 || i10 > i12) {
                z6 = false;
            } else {
                z6 = true;
            }
            arrayList2.add(new C4519p(f28, f10, f10, z6, c4521r.f14777b, true, f14));
            f16 = f11 / f29;
            f17 = (f10 - f16) - f13;
            int i13 = i10 - 1;
            c3507f = new C3507f(i13, AbstractC7965P4.m8252c(i13, 0, -1), -1);
            f18 = f17;
            while (c3507f.f10596o0) {
                iMo4199a2 = c3507f.mo4199a();
                C4521r c4521r2 = (C4521r) arrayList.get(iMo4199a2);
                f25 = c4521r2.f14776a;
                f26 = f25 / f29;
                f27 = f17 - f26;
                float f32 = f18 - f16;
                if (f27 - f26 < 0.0f || f27 + f26 <= 0.0f) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    fAbs = Math.abs(f27 - (f25 / f29));
                } else {
                    fAbs = 0.0f;
                }
                if (i11 <= iMo4199a2 || iMo4199a2 > i12) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                arrayList2.add(0, new C4519p(c4521r2.f14776a, f27, f32, z13, c4521r2.f14777b, false, fAbs));
                f17 -= f25 + f13;
                f18 -= f11 + f13;
            }
            f19 = f10 + f16 + f13;
            it = AbstractC8301I.m8929t(i10 + 1, arrayList.size()).iterator();
            f20 = f19;
            while (it.f10596o0) {
                iMo4199a = it.mo4199a();
                C4521r c4521r3 = (C4521r) arrayList.get(iMo4199a);
                f21 = c4521r3.f14776a;
                f22 = f21 / f29;
                f23 = f22 + f19;
                float f33 = f20 + f16;
                if (f23 - f22 < f12 || f23 + f22 <= f12) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    f24 = ((f21 / f29) + f23) - f12;
                } else {
                    f24 = 0.0f;
                }
                if (i11 <= iMo4199a || iMo4199a > i12) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                arrayList2.add(new C4519p(f21, f23, f33, z11, c4521r3.f14777b, false, f24));
                f19 += f21 + f13;
                f20 += f11 + f13;
            }
            return arrayList2;
        }
        f15 = f10 - (f28 / f29);
        f14 = f15;
        if (i11 <= i10) {
            z6 = false;
        } else {
            z6 = false;
        }
        arrayList2.add(new C4519p(f28, f10, f10, z6, c4521r.f14777b, true, f14));
        f16 = f11 / f29;
        f17 = (f10 - f16) - f13;
        int i14 = i10 - 1;
        c3507f = new C3507f(i14, AbstractC7965P4.m8252c(i14, 0, -1), -1);
        f18 = f17;
        while (c3507f.f10596o0) {
            iMo4199a2 = c3507f.mo4199a();
            C4521r c4521r4 = (C4521r) arrayList.get(iMo4199a2);
            f25 = c4521r4.f14776a;
            f26 = f25 / f29;
            f27 = f17 - f26;
            float f34 = f18 - f16;
            if (f27 - f26 < 0.0f) {
                z12 = false;
            } else {
                z12 = false;
            }
            if (z12) {
                fAbs = Math.abs(f27 - (f25 / f29));
            } else {
                fAbs = 0.0f;
            }
            if (i11 <= iMo4199a2) {
                z13 = false;
            } else {
                z13 = false;
            }
            arrayList2.add(0, new C4519p(c4521r4.f14776a, f27, f34, z13, c4521r4.f14777b, false, fAbs));
            f17 -= f25 + f13;
            f18 -= f11 + f13;
        }
        f19 = f10 + f16 + f13;
        it = AbstractC8301I.m8929t(i10 + 1, arrayList.size()).iterator();
        f20 = f19;
        while (it.f10596o0) {
            iMo4199a = it.mo4199a();
            C4521r c4521r5 = (C4521r) arrayList.get(iMo4199a);
            f21 = c4521r5.f14776a;
            f22 = f21 / f29;
            f23 = f22 + f19;
            float f35 = f20 + f16;
            if (f23 - f22 < f12) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (z10) {
                f24 = ((f21 / f29) + f23) - f12;
            } else {
                f24 = 0.0f;
            }
            if (i11 <= iMo4199a) {
                z11 = false;
            } else {
                z11 = false;
            }
            arrayList2.add(new C4519p(f21, f23, f35, z11, c4521r5.f14777b, false, f24));
            f19 += f21 + f13;
            f20 += f11 + f13;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: a */
    public final void m5264a(float f10, boolean z6) {
        ArrayList arrayList = this.f14780c;
        arrayList.add(new C4521r(f10, z6));
        if (f10 > this.f14779b) {
            this.f14778a = AbstractC17681o.m19381j(arrayList);
            this.f14779b = f10;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m5265c() {
        int i10 = this.f14778a;
        while (true) {
            ArrayList arrayList = this.f14780c;
            if (i10 >= AbstractC17681o.m19381j(arrayList)) {
                break;
            }
            int i11 = i10 + 1;
            if (((C4521r) arrayList.get(i11)).f14776a != this.f14779b) {
                break;
            }
            i10 = i11;
        }
        return i10;
    }
}
