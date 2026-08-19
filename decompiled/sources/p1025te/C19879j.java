package p1025te;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1155zi.InterfaceC21915G;

/* JADX INFO: renamed from: te.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C19879j extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f63019Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC21915G f63020Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f63021o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19879j(InterfaceC21915G interfaceC21915G, InterfaceC1436k interfaceC1436k, int i10) {
        super(0);
        this.f63019Y = i10;
        this.f63020Z = interfaceC21915G;
        this.f63021o0 = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f63019Y) {
            case 0:
                InterfaceC21915G interfaceC21915G = this.f63020Z;
                if (interfaceC21915G != null) {
                    this.f63021o0.invoke(new C19855F(interfaceC21915G));
                }
                break;
            default:
                InterfaceC21915G interfaceC21915G2 = this.f63020Z;
                if (interfaceC21915G2 != null) {
                    this.f63021o0.invoke(new C19855F(interfaceC21915G2));
                }
                break;
        }
        return C17296C.f55119a;
    }
}
