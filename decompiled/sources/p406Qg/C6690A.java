package p406Qg;

import cd.C11709i;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p349O0.InterfaceC5985X;

/* JADX INFO: renamed from: Qg.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C6690A extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21515Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11709i f21516Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f21517o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6690A(C11709i c11709i, InterfaceC5985X interfaceC5985X, int i10) {
        super(0);
        this.f21515Y = i10;
        this.f21516Z = c11709i;
        this.f21517o0 = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f21515Y) {
            case 0:
                this.f21517o0.setValue(Boolean.TRUE);
                this.f21516Z.m13031a();
                break;
            default:
                this.f21517o0.setValue(Boolean.TRUE);
                this.f21516Z.m13031a();
                break;
        }
        return C17296C.f55119a;
    }
}
