package p894n0;

import java.util.ArrayList;
import mm.C17296C;
import p103Dn.InterfaceC2186j;
import p349O0.InterfaceC5985X;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: n0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C17400f implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f55592Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ArrayList f55593Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f55594o0;

    public /* synthetic */ C17400f(ArrayList arrayList, InterfaceC5985X interfaceC5985X, int i10) {
        this.f55592Y = i10;
        this.f55593Z = arrayList;
        this.f55594o0 = interfaceC5985X;
    }

    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        switch (this.f55592Y) {
            case 0:
                InterfaceC17405k interfaceC17405k = (InterfaceC17405k) obj;
                boolean z6 = interfaceC17405k instanceof C17398d;
                ArrayList arrayList = this.f55593Z;
                if (z6) {
                    arrayList.add(interfaceC17405k);
                } else if (interfaceC17405k instanceof C17399e) {
                    arrayList.remove(((C17399e) interfaceC17405k).f55591a);
                }
                this.f55594o0.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 1:
                InterfaceC17405k interfaceC17405k2 = (InterfaceC17405k) obj;
                boolean z10 = interfaceC17405k2 instanceof C17402h;
                ArrayList arrayList2 = this.f55593Z;
                if (z10) {
                    arrayList2.add(interfaceC17405k2);
                } else if (interfaceC17405k2 instanceof C17403i) {
                    arrayList2.remove(((C17403i) interfaceC17405k2).f55598a);
                }
                this.f55594o0.setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                break;
            default:
                InterfaceC17405k interfaceC17405k3 = (InterfaceC17405k) obj;
                boolean z11 = interfaceC17405k3 instanceof C17409o;
                ArrayList arrayList3 = this.f55593Z;
                if (z11) {
                    arrayList3.add(interfaceC17405k3);
                } else if (interfaceC17405k3 instanceof C17410p) {
                    arrayList3.remove(((C17410p) interfaceC17405k3).f55605a);
                } else if (interfaceC17405k3 instanceof C17408n) {
                    arrayList3.remove(((C17408n) interfaceC17405k3).f55603a);
                }
                this.f55594o0.setValue(Boolean.valueOf(!arrayList3.isEmpty()));
                break;
        }
        return C17296C.f55119a;
    }
}
