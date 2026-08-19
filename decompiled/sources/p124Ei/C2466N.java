package p124Ei;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p478Tc.C7299c;
import p492U1.C7543h;

/* JADX INFO: renamed from: Ei.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C2466N extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7674Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f7675Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C7299c f7676o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2466N(InterfaceC1436k interfaceC1436k, C7299c c7299c, int i10) {
        super(0);
        this.f7674Y = i10;
        this.f7675Z = interfaceC1436k;
        this.f7676o0 = c7299c;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f7674Y) {
            case 0:
                C7543h c7543h = (C7543h) this.f7676o0.f23109b.getValue();
                this.f7675Z.invoke(new C7543h(c7543h != null ? c7543h.f23897a : 0L));
                break;
            default:
                C7543h c7543h2 = (C7543h) this.f7676o0.f23109b.getValue();
                this.f7675Z.invoke(new C7543h(c7543h2 != null ? c7543h2.f23897a : 0L));
                break;
        }
        return C17296C.f55119a;
    }
}
