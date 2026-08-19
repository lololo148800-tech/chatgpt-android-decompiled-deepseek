package p946pc;

import android.gov.nist.core.Separators;
import gf.C14127l;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p006A4.C0364y;
import p049Bm.InterfaceC1436k;
import p1095x1.InterfaceC21056J;
import p200Hm.C3504c;
import p204I1.C3578I;
import p537W0.C8410b;
import p571X9.AbstractC9388w4;
import p774h1.C14365u;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: pc.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C18335a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C18335a f58525Z = new C18335a(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C18335a f58526o0 = new C18335a(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C18335a f58527p0 = new C18335a(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C18335a f58528q0 = new C18335a(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C18335a f58529r0 = new C18335a(1, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C18335a f58530s0 = new C18335a(1, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C18335a f58531t0 = new C18335a(1, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C18335a f58532u0 = new C18335a(1, 7);

    /* JADX INFO: renamed from: v0 */
    public static final C18335a f58533v0 = new C18335a(1, 8);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58534Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18335a(int i10, int i11) {
        super(i10);
        this.f58534Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f58534Y) {
            case 0:
                return new C14365u(C14365u.m15774b(0.25f, ((C14365u) obj).f45062a));
            case 1:
                return (((Number) obj).intValue() + 1) + Separators.DOT;
            case 2:
                return ((Character) AbstractC17680n.m19341Q(AbstractC17680n.m19336L(new C3504c('a', 'z'), ((Number) obj).intValue() % 26))).charValue() + Separators.DOT;
            case 3:
                return (((Number) obj).intValue() + 1) + Separators.RPAREN;
            case 4:
                return ((Character) AbstractC17680n.m19341Q(AbstractC17680n.m19336L(new C3504c('a', 'z'), ((Number) obj).intValue() % 26))).charValue() + Separators.RPAREN;
            case 5:
                C18320E c18320e = (C18320E) obj;
                AbstractC16544l.m18094g(c18320e, "$this$null");
                InterfaceC1436k[] interfaceC1436kArr = {f58526o0, f58527p0, f58528q0, f58529r0};
                C18335a c18335a = AbstractC18351q.f58593d;
                return new C18359y(new C8410b(new C0364y(c18320e, 12, interfaceC1436kArr), true, -373393724));
            case 6:
                C18320E c18320e2 = (C18320E) obj;
                AbstractC16544l.m18094g(c18320e2, "$this$null");
                C18335a c18335a2 = AbstractC18351q.f58593d;
                return new C18334T(new C8410b(new C14127l(c18320e2, 9, new String[]{"•", "◦", "▸", "▹"}), true, 15273025));
            case 7:
                InterfaceC21056J marker = (InterfaceC21056J) obj;
                AbstractC16544l.m18094g(marker, "marker");
                return marker.mo21533p(AbstractC9388w4.m9959b(0, 0, 15));
            default:
                C3578I it = (C3578I) obj;
                AbstractC16544l.m18094g(it, "it");
                return C17296C.f55119a;
        }
    }
}
