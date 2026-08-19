package p926of;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: of.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C18167d extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f57943Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f57944Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18162Z f57945o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18167d(InterfaceC1436k interfaceC1436k, C18162Z c18162z, int i10) {
        super(0);
        this.f57943Y = i10;
        this.f57944Z = interfaceC1436k;
        this.f57945o0 = c18162z;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f57943Y) {
            case 0:
                C18162Z c18162z = this.f57945o0;
                this.f57944Z.invoke(new C18147J(c18162z.f57926a, c18162z.f57927b));
                break;
            default:
                C18162Z c18162z2 = this.f57945o0;
                this.f57944Z.invoke(new C18185v(c18162z2.f57926a, c18162z2.f57927b));
                break;
        }
        return C17296C.f55119a;
    }
}
