package p124Ei;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p021Aj.C0537v;
import p049Bm.InterfaceC1436k;
import p1140z1.C21660F;
import p156G1.AbstractC2973t;
import p156G1.C2963j;
import p178H.InterfaceC3153k;
import p228J.InterfaceC3866v;
import p523V9.AbstractC8223w5;
import p715e1.C13257c;
import p736f0.AbstractC13508z;
import p736f0.C13479Q;
import p736f0.C13486d;
import p736f0.C13493k;
import p736f0.C13502t;
import p758g0.AbstractC13758e;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Ei.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C2527m extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C2527m f7846Z = new C2527m(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C2527m f7847o0 = new C2527m(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C2527m f7848p0 = new C2527m(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C2527m f7849q0 = new C2527m(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C2527m f7850r0 = new C2527m(1, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C2527m f7851s0 = new C2527m(1, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C2527m f7852t0 = new C2527m(1, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C2527m f7853u0 = new C2527m(1, 7);

    /* JADX INFO: renamed from: v0 */
    public static final C2527m f7854v0 = new C2527m(1, 8);

    /* JADX INFO: renamed from: w0 */
    public static final C2527m f7855w0 = new C2527m(1, 9);

    /* JADX INFO: renamed from: x0 */
    public static final C2527m f7856x0 = new C2527m(1, 10);

    /* JADX INFO: renamed from: y0 */
    public static final C2527m f7857y0 = new C2527m(1, 11);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7858Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2527m(int i10, int i11) {
        super(i10);
        this.f7858Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InterfaceC3866v interfaceC3866vMo105a;
        switch (this.f7858Y) {
            case 0:
                InterfaceC3153k interfaceC3153k = (InterfaceC3153k) obj;
                if (interfaceC3153k == null || (interfaceC3866vMo105a = interfaceC3153k.mo105a()) == null) {
                    return null;
                }
                return Boolean.valueOf(interfaceC3866vMo105a.mo144i());
            case 1:
                C21660F onDrawWithContent = (C21660F) obj;
                AbstractC16544l.m18094g(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.m22080a();
                AbstractC14376f.m15849o(onDrawWithContent, AbstractC2448E.f7604a, 0L, 0L, 0.0f, null, 9, 62);
                return C17296C.f55119a;
            case 2:
                C13257c drawWithCache = (C13257c) obj;
                AbstractC16544l.m18094g(drawWithCache, "$this$drawWithCache");
                return drawWithCache.m14856a(f7847o0);
            case 3:
                C2963j semantics = (C2963j) obj;
                AbstractC16544l.m18094g(semantics, "$this$semantics");
                AbstractC2973t.m3812g(semantics, 0);
                return C17296C.f55119a;
            case 4:
                return Integer.valueOf(((Number) obj).intValue());
            case 5:
                return Integer.valueOf(((Number) obj).intValue());
            case 6:
                C13493k AnimatedContent = (C13493k) obj;
                AbstractC16544l.m18094g(AnimatedContent, "$this$AnimatedContent");
                C13502t c13502tM8852d = ((Boolean) AnimatedContent.mo15006c()).booleanValue() ? AbstractC8223w5.m8852d(AbstractC13508z.m15013e(AbstractC13758e.m15255t(600, RCHTTPStatusCodes.UNSUCCESSFUL, null, 4), 2), AbstractC13508z.m15023o(new C0537v(24, f7850r0), AbstractC13758e.m15255t(RCHTTPStatusCodes.UNSUCCESSFUL, 0, null, 6)).m14996a(AbstractC13508z.m15014f(AbstractC13758e.m15255t(RCHTTPStatusCodes.UNSUCCESSFUL, 0, null, 6), 2))) : AbstractC8223w5.m8852d(AbstractC13508z.m15021m(new C0537v(22, f7851s0), AbstractC13758e.m15255t(600, RCHTTPStatusCodes.UNSUCCESSFUL, null, 4)).m14995a(AbstractC13508z.m15013e(AbstractC13758e.m15255t(600, RCHTTPStatusCodes.UNSUCCESSFUL, null, 4), 2)), AbstractC13508z.m15014f(AbstractC13758e.m15255t(RCHTTPStatusCodes.UNSUCCESSFUL, 0, null, 6), 2));
                c13502tM8852d.f42751d = new C13479Q(false, C13486d.f42694Z);
                return c13502tM8852d;
            case 7:
                AbstractC16544l.m18094g((C13493k) obj, "$this$AnimatedContent");
                return AbstractC8223w5.m8852d(AbstractC13508z.m15015g(null, 0.0f, 0L, 7), AbstractC13508z.m15016h(null, 7));
            case 8:
                AbstractC16544l.m18094g((C13493k) obj, "$this$AnimatedContent");
                return AbstractC8223w5.m8852d(AbstractC13508z.m15013e(AbstractC13758e.m15255t(600, 0, null, 6), 2), AbstractC13508z.m15014f(AbstractC13758e.m15255t(RCHTTPStatusCodes.UNSUCCESSFUL, 0, null, 6), 2));
            case 9:
                AbstractC16544l.m18094g((C13493k) obj, "$this$AnimatedContent");
                return AbstractC8223w5.m8852d(AbstractC13508z.m15013e(AbstractC13758e.m15255t(600, 0, null, 6), 2), AbstractC13508z.m15014f(AbstractC13758e.m15255t(RCHTTPStatusCodes.UNSUCCESSFUL, 0, null, 6), 2));
            case 10:
                AbstractC16544l.m18094g((C13493k) obj, "$this$AnimatedContent");
                return AbstractC8223w5.m8852d(AbstractC13508z.m15013e(AbstractC13758e.m15255t(600, 0, null, 6), 2), AbstractC13508z.m15014f(AbstractC13758e.m15255t(RCHTTPStatusCodes.UNSUCCESSFUL, 0, null, 6), 2));
            default:
                AbstractC16544l.m18094g((C13493k) obj, "$this$AnimatedContent");
                return AbstractC8223w5.m8852d(AbstractC13508z.m15013e(AbstractC13758e.m15255t(600, 0, null, 6), 2), AbstractC13508z.m15014f(AbstractC13758e.m15255t(RCHTTPStatusCodes.UNSUCCESSFUL, 0, null, 6), 2));
        }
    }
}
