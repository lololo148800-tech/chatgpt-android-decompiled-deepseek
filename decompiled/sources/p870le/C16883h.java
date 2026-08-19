package p870le;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1140z1.C21660F;
import p156G1.AbstractC2973t;
import p156G1.C2963j;
import p269Kh.C4679f;
import p269Kh.C4688o;
import p492U1.C7543h;
import p492U1.C7545j;
import p523V9.AbstractC8223w5;
import p571X9.AbstractC9101A4;
import p736f0.AbstractC13508z;
import p736f0.C13467E;
import p736f0.C13468F;
import p736f0.C13479Q;
import p736f0.C13493k;
import p736f0.C13502t;
import p758g0.AbstractC13758e;
import p774h1.C14365u;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: le.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C16883h extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54214Y;

    /* JADX INFO: renamed from: Z */
    public static final C16883h f54201Z = new C16883h(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C16883h f54202o0 = new C16883h(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C16883h f54203p0 = new C16883h(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C16883h f54204q0 = new C16883h(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C16883h f54205r0 = new C16883h(1, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C16883h f54206s0 = new C16883h(1, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C16883h f54207t0 = new C16883h(1, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C16883h f54208u0 = new C16883h(1, 7);

    /* JADX INFO: renamed from: v0 */
    public static final C16883h f54209v0 = new C16883h(1, 8);

    /* JADX INFO: renamed from: w0 */
    public static final C16883h f54210w0 = new C16883h(1, 9);

    /* JADX INFO: renamed from: x0 */
    public static final C16883h f54211x0 = new C16883h(1, 10);

    /* JADX INFO: renamed from: y0 */
    public static final C16883h f54212y0 = new C16883h(1, 11);

    /* JADX INFO: renamed from: z0 */
    public static final C16883h f54213z0 = new C16883h(1, 12);

    /* JADX INFO: renamed from: A0 */
    public static final C16883h f54197A0 = new C16883h(1, 13);

    /* JADX INFO: renamed from: B0 */
    public static final C16883h f54198B0 = new C16883h(1, 14);

    /* JADX INFO: renamed from: C0 */
    public static final C16883h f54199C0 = new C16883h(1, 15);

    /* JADX INFO: renamed from: D0 */
    public static final C16883h f54200D0 = new C16883h(1, 16);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16883h(int i10, int i11) {
        super(i10);
        this.f54214Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        switch (this.f54214Y) {
            case 0:
                C4688o it = (C4688o) obj;
                AbstractC16544l.m18094g(it, "it");
                return c17296c;
            case 1:
                C4679f it2 = (C4679f) obj;
                AbstractC16544l.m18094g(it2, "it");
                return c17296c;
            case 2:
                C21660F drawWithContent = (C21660F) obj;
                AbstractC16544l.m18094g(drawWithContent, "$this$drawWithContent");
                drawWithContent.m22080a();
                return c17296c;
            case 3:
                return new C7543h(AbstractC9101A4.m9631a(0, -((int) (((C7545j) obj).f23903a & 4294967295L))));
            case 4:
                return new C7543h(AbstractC9101A4.m9631a(0, -((int) (((C7545j) obj).f23903a & 4294967295L))));
            case 5:
                C13493k AnimatedContent = (C13493k) obj;
                AbstractC16544l.m18094g(AnimatedContent, "$this$AnimatedContent");
                return AbstractC8223w5.m8852d(AbstractC13508z.m15013e(AbstractC13758e.m15255t(250, 0, null, 6), 2).m14995a(AbstractC13508z.m15021m(f54204q0, AbstractC13758e.m15255t(250, 0, null, 6))), AbstractC13508z.m15014f(AbstractC13758e.m15255t(250, 0, null, 6), 2).m14996a(AbstractC13508z.m15023o(f54205r0, AbstractC13758e.m15255t(250, 0, null, 6))));
            case 6:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 7:
                return new C7543h(AbstractC9101A4.m9631a((-((int) (((C7545j) obj).f23903a >> 32))) / 3, 0));
            case 8:
                return new C7543h(AbstractC9101A4.m9631a((-((int) (((C7545j) obj).f23903a >> 32))) / 3, 0));
            case 9:
                C13493k c13493k = (C13493k) obj;
                AbstractC16544l.m18094g(c13493k, "$this$null");
                C13468F c13468fM15014f = AbstractC13508z.m15014f(AbstractC13758e.m15254s(0.0f, 0.0f, null, 7), 2);
                C13467E c13467eM15013e = AbstractC13508z.m15013e(AbstractC13758e.m15254s(0.0f, 0.0f, null, 7), 2);
                C13468F c13468fM14996a = AbstractC13508z.m15023o(f54209v0, AbstractC13758e.m15254s(0.0f, 0.0f, null, 7)).m14996a(AbstractC13508z.m15016h(AbstractC13758e.m15254s(0.0f, 0.0f, null, 7), 6)).m14996a(AbstractC13508z.m15014f(AbstractC13758e.m15254s(0.0f, 0.0f, null, 7), 2));
                C13467E c13467eM14995a = AbstractC13508z.m15021m(f54208u0, AbstractC13758e.m15254s(0.0f, 0.0f, null, 7)).m14995a(AbstractC13508z.m15015g(AbstractC13758e.m15254s(0.0f, 0.0f, null, 7), 0.0f, 0L, 6)).m14995a(AbstractC13508z.m15013e(AbstractC13758e.m15254s(0.0f, 0.0f, null, 7), 2));
                boolean zBooleanValue = ((Boolean) c13493k.mo15006c()).booleanValue();
                return new C13502t(zBooleanValue ? c13467eM14995a : c13467eM15013e, zBooleanValue ? c13468fM15014f : c13468fM14996a, 0.0f, new C13479Q(false, C16869a.f54129F0), 4);
            case 10:
                return Integer.valueOf(((Number) obj).intValue() / 3);
            case 11:
                return Integer.valueOf(((Number) obj).intValue() / 3);
            case 12:
                C13493k AnimatedContent2 = (C13493k) obj;
                AbstractC16544l.m18094g(AnimatedContent2, "$this$AnimatedContent");
                return new C13502t(AbstractC13508z.m15015g(AbstractC13758e.m15255t(150, 0, null, 6), 0.0f, 0L, 6), AbstractC13508z.m15016h(AbstractC13758e.m15255t(150, 0, null, 6), 6), 0.0f, null, 12);
            case 13:
                C2963j semantics = (C2963j) obj;
                AbstractC16544l.m18094g(semantics, "$this$semantics");
                AbstractC2973t.m3808c(semantics);
                return c17296c;
            case 14:
                C2963j semantics2 = (C2963j) obj;
                AbstractC16544l.m18094g(semantics2, "$this$semantics");
                AbstractC2973t.m3808c(semantics2);
                return c17296c;
            case 15:
                C21660F drawWithContent2 = (C21660F) obj;
                AbstractC16544l.m18094g(drawWithContent2, "$this$drawWithContent");
                drawWithContent2.m22080a();
                AbstractC14376f.m15850p(drawWithContent2, C14365u.m15774b(0.5f, C14365u.f45052b), 0L, 0L, 0.0f, 126);
                return c17296c;
            case 16:
                C13493k AnimatedContent3 = (C13493k) obj;
                AbstractC16544l.m18094g(AnimatedContent3, "$this$AnimatedContent");
                return new C13502t(AbstractC13508z.m15015g(AbstractC13758e.m15255t(150, 0, null, 6), 0.0f, 0L, 6), AbstractC13508z.m15016h(AbstractC13758e.m15255t(150, 0, null, 6), 6), 0.0f, null, 12);
            default:
                C13493k AnimatedContent4 = (C13493k) obj;
                AbstractC16544l.m18094g(AnimatedContent4, "$this$AnimatedContent");
                return (C13502t) C16881g.f54184p0.invoke();
        }
    }
}
