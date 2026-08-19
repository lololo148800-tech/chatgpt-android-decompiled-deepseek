package ge;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p990rg.C18982i;

/* JADX INFO: renamed from: ge.C0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14020C0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44103Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f44104Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18982i f44105o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14020C0(InterfaceC1436k interfaceC1436k, C18982i c18982i, int i10) {
        super(0);
        this.f44103Y = i10;
        this.f44104Z = interfaceC1436k;
        this.f44105o0 = c18982i;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f44103Y) {
            case 0:
                this.f44104Z.invoke(this.f44105o0);
                break;
            default:
                this.f44104Z.invoke(this.f44105o0);
                break;
        }
        return C17296C.f55119a;
    }
}
