package p296Lk;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16558z;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1113xn.C21317k;
import p953q0.C18580g;

/* JADX INFO: renamed from: Lk.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C5111h extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16707Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16558z f16708Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16558z f16709o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5111h(C16558z c16558z, C16558z c16558z2, int i10) {
        super(1);
        this.f16707Y = i10;
        this.f16708Z = c16558z;
        this.f16709o0 = c16558z2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f16707Y) {
            case 0:
                C18580g interval = (C18580g) obj;
                AbstractC16544l.m18094g(interval, "interval");
                for (int i10 = 0; i10 < interval.f59183b; i10++) {
                    C5107d c5107d = (C5107d) ((C5108e) interval.f59184c).f16689a.invoke(Integer.valueOf(i10));
                    C16558z c16558z = this.f16708Z;
                    c16558z.f51287Y = Math.max(c16558z.f51287Y, c5107d.f16685a + c5107d.f16687c);
                    C16558z c16558z2 = this.f16709o0;
                    c16558z2.f51287Y = Math.max(c16558z2.f51287Y, c5107d.f16686b + c5107d.f16688d);
                }
                return C17296C.f55119a;
            case 1:
                C21317k c21317k = (C21317k) obj;
                C16558z c16558z3 = this.f16708Z;
                if (c16558z3.f51287Y == -1) {
                    c16558z3.f51287Y = c21317k.m21658b().f10591Y;
                }
                this.f16709o0.f51287Y = c21317k.m21658b().f10592Z + 1;
                return "";
            default:
                C21317k c21317k2 = (C21317k) obj;
                C16558z c16558z4 = this.f16708Z;
                if (c16558z4.f51287Y == -1) {
                    c16558z4.f51287Y = c21317k2.m21658b().f10591Y;
                }
                this.f16709o0.f51287Y = c21317k2.m21658b().f10592Z + 1;
                return "";
        }
    }
}
