package p1139z0;

import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1071w0.EnumC20729S;
import p1095x1.InterfaceC21098s;
import p1116y0.C21358g;
import p204I1.C3578I;
import p204I1.C3590f;
import p544W9.AbstractC8501J3;
import p544W9.AbstractC8676n;
import p693d1.C12989b;
import p759g1.C13800b;
import p820j0.AbstractC16033d;
import p820j0.C16031b;
import p894n0.C17402h;

/* JADX INFO: renamed from: z0.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21618h0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f68487Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21640s0 f68488Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21618h0(C21640s0 c21640s0, int i10) {
        super(1);
        this.f68487Y = i10;
        this.f68488Z = c21640s0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f68487Y) {
            case 0:
                List list = (List) obj;
                C3578I c3578iM21849b = this.f68488Z.f68551C0.m21849b();
                return Boolean.valueOf(c3578iM21849b != null ? list.add(c3578iM21849b) : false);
            case 1:
                C3590f c3590f = (C3590f) obj;
                C21640s0 c21640s0 = this.f68488Z;
                if (!c21640s0.m21988Q0()) {
                    return Boolean.FALSE;
                }
                C21358g c21358g = c21640s0.f68550B0.f68337a;
                c21358g.f67827b.f68325b.m20988c();
                C21577C c21577c = c21358g.f67827b;
                c21577c.m21858f(0, c21577c.f68324a.length(), "");
                AbstractC21627m.m21963k(c21577c, c3590f.f10934Y, 1);
                C21358g.m21749a(c21358g, true, 1);
                return Boolean.TRUE;
            case 2:
                C3590f c3590f2 = (C3590f) obj;
                C21640s0 c21640s1 = this.f68488Z;
                if (!c21640s1.m21988Q0()) {
                    return Boolean.FALSE;
                }
                C21582E0.m21877f(c21640s1.f68550B0, c3590f2, true, 0, 4);
                return Boolean.TRUE;
            case 3:
                C12989b c12989b = (C12989b) obj;
                C21640s0 c21640s2 = this.f68488Z;
                if (AbstractC16033d.m17588a(c21640s2) != null) {
                    AbstractC8501J3.m9166b(c21640s2, c12989b);
                }
                return C17296C.f55119a;
            case 4:
                C17402h c17402h = new C17402h();
                C21640s0 c21640s3 = this.f68488Z;
                c21640s3.f68557I0.mo7767a(c17402h);
                c21640s3.f68561M0 = c17402h;
                C16031b c16031bM17588a = AbstractC16033d.m17588a(c21640s3);
                if (c16031bM17588a != null) {
                    c16031bM17588a.f49468b.mo9534d();
                }
                return C17296C.f55119a;
            case 5:
                long jMo21526q = ((C13800b) obj).f43584a;
                C21640s0 c21640s4 = this.f68488Z;
                InterfaceC21098s interfaceC21098s = (InterfaceC21098s) c21640s4.f68551C0.f68318f.getValue();
                if (interfaceC21098s != null && interfaceC21098s.mo21522h()) {
                    jMo21526q = interfaceC21098s.mo21526q(jMo21526q);
                }
                int iM21850c = c21640s4.f68551C0.m21850c(jMo21526q, true);
                c21640s4.f68550B0.m21884h(AbstractC8676n.m9365b(iM21850c, iM21850c));
                c21640s4.f68552D0.m420y(EnumC20729S.f65724Y, jMo21526q);
                return C17296C.f55119a;
            case 6:
                C21640s0 c21640s5 = this.f68488Z;
                C21640s0.m21985N0(c21640s5);
                c21640s5.f68552D0.m402e();
                C16031b c16031bM17588a2 = AbstractC16033d.m17588a(c21640s5);
                if (c16031bM17588a2 != null) {
                    c16031bM17588a2.f49468b.mo9533c();
                }
                return C17296C.f55119a;
            default:
                C21640s0.m21985N0(this.f68488Z);
                return C17296C.f55119a;
        }
    }
}
