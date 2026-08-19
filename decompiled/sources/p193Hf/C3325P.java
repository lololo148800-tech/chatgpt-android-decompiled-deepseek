package p193Hf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1095x1.InterfaceC21098s;
import p1113xn.AbstractC21322p;
import p349O0.InterfaceC5985X;
import p350O1.C6045C;
import p552Wg.C8854p;
import p749fd.AbstractC13620e;

/* JADX INFO: renamed from: Hf.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C3325P extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10144Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f10145Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f10146o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3325P(InterfaceC1436k interfaceC1436k, InterfaceC5985X interfaceC5985X, int i10) {
        super(0);
        this.f10144Y = i10;
        this.f10145Z = interfaceC1436k;
        this.f10146o0 = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C17296C c17296c = C17296C.f55119a;
        InterfaceC1436k interfaceC1436k = this.f10145Z;
        InterfaceC5985X interfaceC5985X = this.f10146o0;
        switch (this.f10144Y) {
            case 0:
                interfaceC1436k.invoke((InterfaceC21098s) interfaceC5985X.getValue());
                break;
            case 1:
                interfaceC5985X.setValue(Boolean.FALSE);
                interfaceC1436k.invoke(null);
                break;
            case 2:
                interfaceC1436k.invoke(AbstractC21322p.m21711s0(((C6045C) interfaceC5985X.getValue()).f19682a.f10934Y).toString());
                break;
            case 3:
                interfaceC5985X.setValue("");
                interfaceC1436k.invoke("");
                break;
            case 4:
                interfaceC1436k.invoke(C8854p.f27109a);
                interfaceC5985X.setValue(Boolean.FALSE);
                break;
            case 5:
                int i10 = AbstractC13620e.f43030c;
                Boolean bool = Boolean.FALSE;
                interfaceC5985X.setValue(bool);
                interfaceC1436k.invoke(bool);
                break;
            case 6:
                interfaceC1436k.invoke(AbstractC21322p.m21711s0(((C6045C) interfaceC5985X.getValue()).f19682a.f10934Y).toString());
                break;
            default:
                Boolean bool2 = (Boolean) interfaceC5985X.getValue();
                bool2.booleanValue();
                interfaceC1436k.invoke(bool2);
                break;
        }
        return c17296c;
    }
}
