package p1140z1;

import androidx.compose.p650ui.platform.AndroidComposeView;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p392Q0.C6546d;
import p774h1.C14343V;

/* JADX INFO: renamed from: z1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C21688e extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C21688e f68832Z = new C21688e(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C21688e f68833o0 = new C21688e(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C21688e f68834p0 = new C21688e(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C21688e f68835q0 = new C21688e(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C21688e f68836r0 = new C21688e(1, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C21688e f68837s0 = new C21688e(1, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C21688e f68838t0 = new C21688e(1, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C21688e f68839u0 = new C21688e(1, 7);

    /* JADX INFO: renamed from: v0 */
    public static final C21688e f68840v0 = new C21688e(1, 8);

    /* JADX INFO: renamed from: w0 */
    public static final C21688e f68841w0 = new C21688e(1, 9);

    /* JADX INFO: renamed from: x0 */
    public static final C21688e f68842x0 = new C21688e(1, 10);

    /* JADX INFO: renamed from: y0 */
    public static final C21688e f68843y0 = new C21688e(1, 11);

    /* JADX INFO: renamed from: z0 */
    public static final C21688e f68844z0 = new C21688e(1, 12);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f68845Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21688e(int i10, int i11) {
        super(i10);
        this.f68845Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f68845Y) {
            case 0:
                ((C21684c) obj).m22194M0();
                return C17296C.f55119a;
            case 1:
                C21695h0 c21695h0 = (C21695h0) obj;
                if (c21695h0.mo874u()) {
                    c21695h0.f68863Z.m22118e0(c21695h0);
                }
                return C17296C.f55119a;
            case 2:
                InterfaceC21687d0 interfaceC21687d0 = ((AbstractC21678Y) obj).f68817P0;
                if (interfaceC21687d0 != null) {
                    interfaceC21687d0.invalidate();
                }
                return C17296C.f55119a;
            case 3:
                AbstractC21678Y abstractC21678Y = (AbstractC21678Y) obj;
                if (abstractC21678Y.mo874u()) {
                    C21716u c21716u = abstractC21678Y.f68813L0;
                    if (c21716u == null) {
                        abstractC21678Y.m22180f1(true);
                    } else {
                        C21716u c21716u2 = AbstractC21678Y.f68798S0;
                        c21716u2.getClass();
                        c21716u2.f68894a = c21716u.f68894a;
                        c21716u2.f68895b = c21716u.f68895b;
                        c21716u2.f68896c = c21716u.f68896c;
                        c21716u2.f68897d = c21716u.f68897d;
                        c21716u2.f68898e = c21716u.f68898e;
                        c21716u2.f68899f = c21716u.f68899f;
                        c21716u2.f68900g = c21716u.f68900g;
                        c21716u2.f68901h = c21716u.f68901h;
                        c21716u2.f68902i = c21716u.f68902i;
                        abstractC21678Y.m22180f1(true);
                        if (c21716u2.f68894a != c21716u.f68894a || c21716u2.f68895b != c21716u.f68895b || c21716u2.f68896c != c21716u.f68896c || c21716u2.f68897d != c21716u.f68897d || c21716u2.f68898e != c21716u.f68898e || c21716u2.f68899f != c21716u.f68899f || c21716u2.f68900g != c21716u.f68900g || c21716u2.f68901h != c21716u.f68901h || !C14343V.m15667a(c21716u2.f68902i, c21716u.f68902i)) {
                            C21658D c21658d = abstractC21678Y.f68819x0;
                            C21665K c21665kM22060t = c21658d.m22060t();
                            if (c21665kM22060t.f68742n > 0) {
                                if (c21665kM22060t.f68741m || c21665kM22060t.f68740l) {
                                    c21658d.m22058r0(false);
                                }
                                c21665kM22060t.f68746r.m22101h0();
                            }
                            AndroidComposeView androidComposeView = c21658d.f68658u0;
                            if (androidComposeView != null) {
                                ((C6546d) androidComposeView.f32781V0.f68775e.f63875Z).m7099c(c21658d);
                                c21658d.f68646Q0 = true;
                                androidComposeView.m11333D(null);
                            }
                        }
                    }
                }
                return C17296C.f55119a;
            case 4:
                C21683b0 c21683b0 = (C21683b0) obj;
                if (c21683b0.mo874u()) {
                    c21683b0.f68825Y.mo2488j0();
                }
                return C17296C.f55119a;
            case 5:
                AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                return Boolean.valueOf(!((InterfaceC21689e0) obj).mo874u());
            case 6:
                C21658D c21658d2 = (C21658D) obj;
                if (c21658d2.m22024V()) {
                    c21658d2.m22058r0(false);
                }
                return C17296C.f55119a;
            case 7:
                C21658D c21658d3 = (C21658D) obj;
                if (c21658d3.m22024V()) {
                    c21658d3.m22058r0(false);
                }
                return C17296C.f55119a;
            case 8:
                C21658D c21658d4 = (C21658D) obj;
                if (c21658d4.m22024V()) {
                    c21658d4.m22055p0(false);
                }
                return C17296C.f55119a;
            case 9:
                C21658D c21658d5 = (C21658D) obj;
                if (c21658d5.m22024V()) {
                    c21658d5.m22055p0(false);
                }
                return C17296C.f55119a;
            case 10:
                C21658D c21658d6 = (C21658D) obj;
                if (c21658d6.m22024V()) {
                    C21658D.m22000q0(c21658d6, false, 7);
                }
                return C17296C.f55119a;
            case 11:
                C21658D c21658d7 = (C21658D) obj;
                if (c21658d7.m22024V()) {
                    C21658D.m22001s0(c21658d7, false, 7);
                }
                return C17296C.f55119a;
            default:
                C21658D c21658d8 = (C21658D) obj;
                if (c21658d8.m22024V()) {
                    c21658d8.m22022T();
                }
                return C17296C.f55119a;
        }
    }
}
