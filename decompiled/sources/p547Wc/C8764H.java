package p547Wc;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p324Mn.C5554x;
import p349O0.InterfaceC5985X;
import p810ig.AbstractC14982a;

/* JADX INFO: renamed from: Wc.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C8764H extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26713Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f26714Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f26715o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f26716p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8764H(InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, InterfaceC5985X interfaceC5985X) {
        super(0);
        this.f26713Y = 0;
        this.f26715o0 = interfaceC1426a;
        this.f26714Z = interfaceC1436k;
        this.f26716p0 = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C17296C c17296c = C17296C.f55119a;
        InterfaceC1426a interfaceC1426a = this.f26715o0;
        InterfaceC1436k interfaceC1436k = this.f26714Z;
        InterfaceC5985X interfaceC5985X = this.f26716p0;
        switch (this.f26713Y) {
            case 0:
                interfaceC1426a.invoke();
                Object value = interfaceC5985X.getValue();
                if (value != null) {
                    interfaceC1436k.invoke(value);
                }
                break;
            case 1:
                interfaceC1436k.invoke((C5554x) interfaceC5985X.getValue());
                interfaceC1426a.invoke();
                break;
            default:
                float f10 = AbstractC14982a.f46641a;
                interfaceC1436k.invoke((C5554x) interfaceC5985X.getValue());
                interfaceC1426a.invoke();
                break;
        }
        return c17296c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8764H(InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, InterfaceC5985X interfaceC5985X, int i10) {
        super(0);
        this.f26713Y = i10;
        this.f26714Z = interfaceC1436k;
        this.f26715o0 = interfaceC1426a;
        this.f26716p0 = interfaceC5985X;
    }
}
