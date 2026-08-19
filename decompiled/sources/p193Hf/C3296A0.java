package p193Hf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p349O0.InterfaceC5985X;

/* JADX INFO: renamed from: Hf.A0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3296A0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10051Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f10052Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f10053o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3296A0(InterfaceC5985X interfaceC5985X, InterfaceC5985X interfaceC5985X2, int i10) {
        super(0);
        this.f10051Y = i10;
        this.f10052Z = interfaceC5985X;
        this.f10053o0 = interfaceC5985X2;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f10051Y) {
            case 0:
                Boolean bool = Boolean.FALSE;
                this.f10053o0.setValue(bool);
                this.f10052Z.setValue(bool);
                break;
            case 1:
                this.f10052Z.setValue(Boolean.TRUE);
                this.f10053o0.setValue(Boolean.FALSE);
                break;
            default:
                this.f10052Z.setValue(Boolean.FALSE);
                this.f10053o0.setValue(Boolean.TRUE);
                break;
        }
        return C17296C.f55119a;
    }
}
