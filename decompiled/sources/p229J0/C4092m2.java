package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p153Fn.C2925c;
import p429Re.C6868b;

/* JADX INFO: renamed from: J0.m2 */
/* JADX INFO: loaded from: classes.dex */
public final class C4092m2 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f13107Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2925c f13108Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3880A3 f13109o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1426a f13110p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4092m2(C2925c c2925c, C3880A3 c3880a3, InterfaceC1426a interfaceC1426a) {
        super(0);
        this.f13108Z = c2925c;
        this.f13109o0 = c3880a3;
        this.f13110p0 = interfaceC1426a;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f13107Y) {
            case 0:
                C3880A3 c3880a3 = this.f13109o0;
                if (((Boolean) ((InterfaceC1436k) c3880a3.f11737c.f34067d).invoke(EnumC3886B3.f11777Y)).booleanValue()) {
                    AbstractC0575H.m1156D(this.f13108Z, null, null, new C4080k2(c3880a3, null), 3).mo1271H0(new C4086l2(c3880a3, this.f13110p0, 0));
                }
                break;
            default:
                AbstractC0575H.m1156D(this.f13108Z, null, null, new C6868b(this.f13109o0, this.f13110p0, null), 3);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4092m2(C3880A3 c3880a3, C2925c c2925c, InterfaceC1426a interfaceC1426a) {
        super(0);
        this.f13109o0 = c3880a3;
        this.f13108Z = c2925c;
        this.f13110p0 = interfaceC1426a;
    }
}
