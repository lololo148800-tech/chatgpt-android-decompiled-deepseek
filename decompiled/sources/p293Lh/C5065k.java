package p293Lh;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC3996V3;
import p229J0.AbstractC4124r4;
import p229J0.C3934J3;
import p229J0.InterfaceC4006X3;
import p349O0.C6021p;
import p553Wh.C8872h;
import p911o0.AbstractC17792x;
import p911o0.C17794y;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: Lh.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C5065k extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C5065k f16565Z = new C5065k(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C5065k f16566o0 = new C5065k(3, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C5065k f16567p0 = new C5065k(3, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C5065k f16568q0 = new C5065k(3, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C5065k f16569r0 = new C5065k(3, 4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16570Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5065k(int i10, int i11) {
        super(i10);
        this.f16570Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f16570Y) {
            case 0:
                C3934J3 data = (C3934J3) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(data, "data");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6021p.m6542f(data) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    InterfaceC4006X3 interfaceC4006X3 = data.f12112a;
                    if (interfaceC4006X3 instanceof C8872h) {
                        c6021p.m6524S(1621997004);
                        AbstractC17792x.m19538u(0, ((C8872h) interfaceC4006X3).f27156b, c6021p, false);
                    } else {
                        c6021p.m6524S(1621997876);
                        AbstractC3996V3.m4713b(data, null, false, null, 0L, 0L, 0L, 0L, 0L, c6021p, iIntValue & 14);
                        c6021p.m6553p(false);
                    }
                }
                break;
            case 1:
                InterfaceC17783s0 Button = (InterfaceC17783s0) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button, "$this$Button");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC4124r4.m4768b("Footer Button", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 6, 0, 131070);
                }
                break;
            case 2:
                C17794y ScrollableContentScreen = (C17794y) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(ScrollableContentScreen, "$this$ScrollableContentScreen");
                if ((iIntValue3 & 17) == 16 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC4124r4.m4768b("More Onboarding Content", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p3, 6, 0, 131070);
                }
                break;
            case 3:
                C6021p c6021p4 = (C6021p) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g((C17794y) obj, "$this$null");
                if ((iIntValue4 & 17) == 16 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                }
                break;
            default:
                C6021p c6021p5 = (C6021p) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g((C17794y) obj, "$this$null");
                if ((iIntValue5 & 17) == 16 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                }
                break;
        }
        return C17296C.f55119a;
    }
}
