package p278L0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1426a;
import p153Fn.C2925c;
import p229J0.C3899D4;

/* JADX INFO: renamed from: L0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C4897x extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f15954Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2925c f15955Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3899D4 f15956o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4897x(C2925c c2925c, C3899D4 c3899d4) {
        super(0);
        this.f15955Z = c2925c;
        this.f15956o0 = c3899d4;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f15954Y) {
            case 0:
                C3899D4 c3899d4 = this.f15956o0;
                if (c3899d4.m4608a()) {
                    AbstractC0575H.m1156D(this.f15955Z, null, null, new C4896w(c3899d4, null), 3);
                }
                return C17296C.f55119a;
            default:
                AbstractC0575H.m1156D(this.f15955Z, null, null, new C4898y(this.f15956o0, null), 3);
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4897x(C3899D4 c3899d4, C2925c c2925c) {
        super(0);
        this.f15956o0 = c3899d4;
        this.f15955Z = c2925c;
    }
}
