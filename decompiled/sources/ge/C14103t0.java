package ge;

import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p349O0.InterfaceC5985X;
import p936p0.C18265e;
import p953q0.InterfaceC18554L;
import p977r0.C18833e;

/* JADX INFO: renamed from: ge.t0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14103t0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44354Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f44355Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14103t0(InterfaceC5985X interfaceC5985X, int i10) {
        super(0);
        this.f44354Y = i10;
        this.f44355Z = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f44354Y) {
            case 0:
                this.f44355Z.setValue(Boolean.TRUE);
                return C17296C.f55119a;
            case 1:
                this.f44355Z.setValue(Boolean.TRUE);
                return C17296C.f55119a;
            case 2:
                this.f44355Z.setValue(Boolean.TRUE);
                return C17296C.f55119a;
            case 3:
                this.f44355Z.setValue(Boolean.TRUE);
                return C17296C.f55119a;
            case 4:
                this.f44355Z.setValue(Boolean.FALSE);
                return C17296C.f55119a;
            case 5:
                InterfaceC5985X interfaceC5985X = this.f44355Z;
                interfaceC5985X.setValue(Boolean.valueOf(!((Boolean) interfaceC5985X.getValue()).booleanValue()));
                return C17296C.f55119a;
            case 6:
                this.f44355Z.setValue(Boolean.FALSE);
                return C17296C.f55119a;
            case 7:
                this.f44355Z.setValue(Boolean.FALSE);
                return C17296C.f55119a;
            case 8:
                this.f44355Z.setValue(Boolean.FALSE);
                return C17296C.f55119a;
            case 9:
                return new C18265e((InterfaceC1436k) this.f44355Z.getValue());
            case 10:
                return (InterfaceC18554L) ((InterfaceC1426a) this.f44355Z.getValue()).invoke();
            case 11:
                return new C18833e((InterfaceC1436k) this.f44355Z.getValue());
            case 12:
                this.f44355Z.setValue(Boolean.TRUE);
                return C17296C.f55119a;
            case 13:
                this.f44355Z.setValue(Boolean.TRUE);
                return C17296C.f55119a;
            case 14:
                this.f44355Z.setValue(Boolean.TRUE);
                return C17296C.f55119a;
            case 15:
                this.f44355Z.setValue(Boolean.TRUE);
                return C17296C.f55119a;
            case 16:
                this.f44355Z.setValue(Boolean.FALSE);
                return C17296C.f55119a;
            case 17:
                this.f44355Z.setValue(Boolean.FALSE);
                return C17296C.f55119a;
            case 18:
                InterfaceC5985X interfaceC5985X2 = this.f44355Z;
                if (interfaceC5985X2 != null) {
                    return (List) interfaceC5985X2.getValue();
                }
                return null;
            case 19:
                Boolean bool = (Boolean) this.f44355Z.getValue();
                bool.booleanValue();
                return bool;
            default:
                this.f44355Z.setValue(Boolean.TRUE);
                return C17296C.f55119a;
        }
    }
}
