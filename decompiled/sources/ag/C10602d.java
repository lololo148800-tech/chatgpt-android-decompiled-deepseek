package ag;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p911o0.C17794y;

/* JADX INFO: renamed from: ag.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C10602d extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C10602d f31469Z = new C10602d(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C10602d f31470o0 = new C10602d(3, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31471Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10602d(int i10, int i11) {
        super(i10);
        this.f31471Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f31471Y) {
            case 0:
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g((C17794y) obj, "$this$null");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                }
                break;
            default:
                C17794y BaseOnboardingScreen = (C17794y) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(BaseOnboardingScreen, "$this$BaseOnboardingScreen");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC4124r4.m4768b("More Onboarding Content", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 6, 0, 131070);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
