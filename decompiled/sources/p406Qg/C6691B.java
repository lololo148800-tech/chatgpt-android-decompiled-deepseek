package p406Qg;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p349O0.InterfaceC5985X;

/* JADX INFO: renamed from: Qg.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C6691B extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21518Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f21519Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f21520o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6691B(InterfaceC1426a interfaceC1426a, InterfaceC5985X interfaceC5985X) {
        super(0);
        this.f21520o0 = interfaceC1426a;
        this.f21519Z = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f21518Y) {
            case 0:
                this.f21519Z.setValue(Boolean.FALSE);
                this.f21520o0.invoke();
                break;
            default:
                InterfaceC5985X interfaceC5985X = this.f21519Z;
                if (!((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                    interfaceC5985X.setValue(Boolean.TRUE);
                    this.f21520o0.invoke();
                }
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6691B(InterfaceC5985X interfaceC5985X, InterfaceC1426a interfaceC1426a) {
        super(0);
        this.f21519Z = interfaceC5985X;
        this.f21520o0 = interfaceC1426a;
    }
}
