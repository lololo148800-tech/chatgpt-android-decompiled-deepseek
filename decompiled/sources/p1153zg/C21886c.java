package p1153zg;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.C3949M0;
import p349O0.C6021p;
import p467T1.C7199i;
import p478Tc.AbstractC7313q;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8479G;
import p544W9.AbstractC8512L2;
import p594Y9.AbstractC9733G3;
import p635a1.C10456n;
import p911o0.C17794y;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: zg.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C21886c extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f69391Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f69392Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f69393o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1426a f69394p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21886c(String str, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, int i10) {
        super(3);
        this.f69391Y = i10;
        this.f69392Z = str;
        this.f69393o0 = interfaceC1426a;
        this.f69394p0 = interfaceC1426a2;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f69391Y) {
            case 0:
                C17794y HeroContent = (C17794y) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(HeroContent, "$this$HeroContent");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6021p.m6542f(HeroContent) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    long j10 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12231m;
                    C10456n c10456n = C10456n.f30959Y;
                    AbstractC4124r4.m4768b(this.f69392Z, AbstractC8479G.m9126g(HeroContent.m19544b(c10456n, false), AbstractC8479G.m9124e(c6021p), 14), j10, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 130552);
                    AbstractC3984T1.m4685d(this.f69393o0, AbstractC10842a.m11237o(AbstractC10844c.m11244d(c10456n, 1.0f), 0.0f, AbstractC7313q.f23201f, 0.0f, 0.0f, 13), false, null, null, null, null, null, null, AbstractC21885b.f69389a, c6021p, 805306368, 508);
                    AbstractC3984T1.m4695n(this.f69394p0, AbstractC10844c.m11244d(c10456n, 1.0f), false, null, null, null, null, null, null, AbstractC21885b.f69390b, c6021p, 805306416, 508);
                }
                break;
            default:
                InterfaceC17763i0 paddings = (InterfaceC17763i0) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddings, "paddings");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6021p2.m6542f(paddings) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC9733G3.m10320a(AbstractC10842a.m11232j(AbstractC10844c.f32512c, paddings), AbstractC8512L2.m9171a(), null, null, AbstractC8411c.m8969c(-2117861015, c6021p2, new C21886c(this.f69392Z, this.f69393o0, this.f69394p0, 0)), c6021p2, 24576, 12);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
