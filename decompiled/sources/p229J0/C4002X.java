package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p153Fn.C2925c;

/* JADX INFO: renamed from: J0.X */
/* JADX INFO: loaded from: classes.dex */
public final class C4002X extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f12555Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2925c f12556Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3880A3 f12557o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4002X(C2925c c2925c, C3880A3 c3880a3, int i10) {
        super(0);
        this.f12555Y = i10;
        this.f12556Z = c2925c;
        this.f12557o0 = c3880a3;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f12555Y) {
            case 0:
                AbstractC0575H.m1156D(this.f12556Z, null, null, new C3997W(this.f12557o0, null), 3);
                break;
            case 1:
                AbstractC0575H.m1156D(this.f12556Z, null, null, new C4007Y(this.f12557o0, null), 3);
                break;
            case 2:
                AbstractC0575H.m1156D(this.f12556Z, null, null, new C4012Z(this.f12557o0, null), 3);
                break;
            default:
                C3880A3 c3880a3 = this.f12557o0;
                if (((Boolean) ((InterfaceC1436k) c3880a3.f11737c.f34067d).invoke(EnumC3886B3.f11779o0)).booleanValue()) {
                    AbstractC0575H.m1156D(this.f12556Z, null, null, new C4122r2(c3880a3, null), 3);
                }
                break;
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4002X(C3880A3 c3880a3, C2925c c2925c) {
        super(0);
        this.f12555Y = 3;
        this.f12557o0 = c3880a3;
        this.f12556Z = c2925c;
    }
}
