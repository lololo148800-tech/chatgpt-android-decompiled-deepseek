package p296Lk;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16557y;
import mm.C17296C;
import p039Bc.C0885s;
import p049Bm.InterfaceC1436k;
import p200Hm.C3508g;
import p321Mk.C5463a;
import p321Mk.C5464b;
import p321Mk.C5476n;
import p349O0.C6002f0;
import p530Vi.AbstractC8301I;
import p537W0.C8410b;
import p758g0.C13770k;
import p860l0.C16779t;
import p860l0.InterfaceC16694M0;
import p881m0.AbstractC17136m;
import p881m0.C17129f;
import p911o0.AbstractC17792x;
import p953q0.C18580g;

/* JADX INFO: renamed from: Lk.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C5109f extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16693Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f16694Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f16695o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ float f16696p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f16697q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5109f(float f10, Object obj, Object obj2, Serializable serializable, int i10) {
        super(1);
        this.f16693Y = i10;
        this.f16696p0 = f10;
        this.f16697q0 = obj;
        this.f16694Z = obj2;
        this.f16695o0 = serializable;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x027b  */
    /* JADX WARN: Type inference failed for: r0v5, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r5v13, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        float fM5673a;
        boolean z6;
        float fM8917h;
        switch (this.f16693Y) {
            case 0:
                C5107d c5107d = (C5107d) ((C5108e) ((C18580g) this.f16697q0).f59184c).f16689a.invoke(Integer.valueOf(((Number) obj).intValue()));
                AbstractC16544l.m18094g(c5107d, "<this>");
                C5113j c5113j = (C5113j) this.f16694Z;
                C5115l c5115l = (C5115l) this.f16695o0;
                int i10 = c5107d.f16685a;
                C3508g range = AbstractC8301I.m8929t(0, i10);
                AbstractC16544l.m18094g(range, "range");
                ArrayList arrayList = c5115l.f16714a;
                float fM5673a2 = C5115l.m5673a(arrayList, range);
                ArrayList arrayList2 = c5115l.f16715b;
                int i11 = c5107d.f16686b;
                boolean z10 = c5113j.f16713c;
                if (z10 && i11 == arrayList2.size() - 1) {
                    fM5673a = this.f16696p0 - ((Number) AbstractC17792x.m19532o(1, arrayList2)).floatValue();
                } else {
                    C3508g range2 = AbstractC8301I.m8929t(0, i11);
                    AbstractC16544l.m18094g(range2, "range");
                    fM5673a = C5115l.m5673a(arrayList2, range2);
                }
                C3508g range3 = AbstractC8301I.m8929t(i10, c5107d.f16687c + i10);
                AbstractC16544l.m18094g(range3, "range");
                float fM5673a3 = C5115l.m5673a(arrayList, range3);
                C3508g range4 = AbstractC8301I.m8929t(i11, c5107d.f16688d + i11);
                AbstractC16544l.m18094g(range4, "range");
                float fM5673a4 = C5115l.m5673a(arrayList2, range4);
                boolean z11 = i10 < ((Number) c5113j.f16711a.invoke(Integer.valueOf(i11))).intValue();
                if (z10 && i11 == arrayList2.size() - 1) {
                    z6 = true;
                } else {
                    if (i11 < ((Number) c5113j.f16712b.invoke(Integer.valueOf(i10))).intValue()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                return new C5463a(fM5673a2, fM5673a, fM5673a3, fM5673a4, z11, z6);
            case 1:
                C18580g interval = (C18580g) obj;
                AbstractC16544l.m18094g(interval, "interval");
                C5113j c5113j2 = (C5113j) this.f16694Z;
                C5109f c5109f = new C5109f(interval, c5113j2, (C5115l) this.f16695o0, this.f16696p0, 0);
                C5108e c5108e = (C5108e) interval.f59184c;
                InterfaceC1436k interfaceC1436k = c5108e.f16691c;
                C8410b c8410b = new C8410b(new C0885s(interval, 7, c5113j2), true, -274168141);
                C5476n c5476n = (C5476n) this.f16697q0;
                c5476n.getClass();
                c5476n.f17882a.m1047b(interval.f59183b, new C5464b(c5109f, c5108e.f16690b, interfaceC1436k, c8410b));
                return C17296C.f55119a;
            case 2:
                C13770k c13770k = (C13770k) obj;
                float fAbs = Math.abs(((Number) c13770k.f43484e.getValue()).floatValue());
                float f10 = this.f16696p0;
                float fAbs2 = Math.abs(f10);
                C16557y c16557y = (C16557y) this.f16695o0;
                C16557y c16557y2 = (C16557y) this.f16694Z;
                C6002f0 c6002f0 = c13770k.f43484e;
                C16779t c16779t = (C16779t) this.f16697q0;
                if (fAbs >= fAbs2) {
                    float fFloatValue = ((Number) c6002f0.getValue()).floatValue();
                    if (f10 == 0.0f) {
                        fM8917h = 0.0f;
                    } else {
                        fM8917h = f10 > 0.0f ? AbstractC8301I.m8917h(fFloatValue, f10) : AbstractC8301I.m8915f(fFloatValue, f10);
                    }
                    c16779t.m18544a(fM8917h, ((Number) c13770k.m15269b()).floatValue());
                    c16557y2.f51286Y = Float.isNaN(((Number) c13770k.m15269b()).floatValue()) ? 0.0f : ((Number) c13770k.m15269b()).floatValue();
                    c16557y.f51286Y = fM8917h;
                    c13770k.m15268a();
                } else {
                    c16779t.m18544a(((Number) c6002f0.getValue()).floatValue(), ((Number) c13770k.m15269b()).floatValue());
                    c16557y2.f51286Y = ((Number) c13770k.m15269b()).floatValue();
                    c16557y.f51286Y = ((Number) c6002f0.getValue()).floatValue();
                }
                return C17296C.f55119a;
            case 3:
                C13770k c13770k2 = (C13770k) obj;
                float fAbs3 = Math.abs(((Number) c13770k2.f43484e.getValue()).floatValue());
                float f11 = this.f16696p0;
                float fAbs4 = Math.abs(f11);
                C16557y c16557y3 = (C16557y) this.f16697q0;
                C6002f0 c6002f1 = c13770k2.f43484e;
                C17129f c17129f = (C17129f) this.f16695o0;
                InterfaceC16694M0 interfaceC16694M0 = (InterfaceC16694M0) this.f16694Z;
                if (fAbs3 >= fAbs4) {
                    float fM18902c = AbstractC17136m.m18902c(((Number) c6002f1.getValue()).floatValue(), f11);
                    float f12 = fM18902c - c16557y3.f51286Y;
                    float fMo18510a = interfaceC16694M0.mo18510a(f12);
                    c17129f.invoke(Float.valueOf(fMo18510a));
                    if (Math.abs(f12 - fMo18510a) > 0.5f) {
                        c13770k2.m15268a();
                    }
                    c13770k2.m15268a();
                    c16557y3.f51286Y = fM18902c;
                } else {
                    float fFloatValue2 = ((Number) c6002f1.getValue()).floatValue() - c16557y3.f51286Y;
                    float fMo18510a2 = interfaceC16694M0.mo18510a(fFloatValue2);
                    c17129f.invoke(Float.valueOf(fMo18510a2));
                    if (Math.abs(fFloatValue2 - fMo18510a2) > 0.5f) {
                        c13770k2.m15268a();
                    }
                    c16557y3.f51286Y = ((Number) c6002f1.getValue()).floatValue();
                }
                return C17296C.f55119a;
            default:
                C13770k c13770k3 = (C13770k) obj;
                float fM18902c2 = AbstractC17136m.m18902c(((Number) c13770k3.f43484e.getValue()).floatValue(), this.f16696p0);
                C16557y c16557y4 = (C16557y) this.f16697q0;
                float f13 = fM18902c2 - c16557y4.f51286Y;
                float fMo18510a3 = ((InterfaceC16694M0) this.f16694Z).mo18510a(f13);
                ((AbstractC16546n) this.f16695o0).invoke(Float.valueOf(fMo18510a3));
                if (Math.abs(f13 - fMo18510a3) > 0.5f || fM18902c2 != ((Number) c13770k3.f43484e.getValue()).floatValue()) {
                    c13770k3.m15268a();
                }
                c16557y4.f51286Y += fMo18510a3;
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5109f(float f10, C16557y c16557y, InterfaceC16694M0 interfaceC16694M0, InterfaceC1436k interfaceC1436k) {
        super(1);
        this.f16693Y = 4;
        this.f16696p0 = f10;
        this.f16697q0 = c16557y;
        this.f16694Z = interfaceC16694M0;
        this.f16695o0 = (AbstractC16546n) interfaceC1436k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5109f(Object obj, C5113j c5113j, C5115l c5115l, float f10, int i10) {
        super(1);
        this.f16693Y = i10;
        this.f16697q0 = obj;
        this.f16694Z = c5113j;
        this.f16695o0 = c5115l;
        this.f16696p0 = f10;
    }
}
