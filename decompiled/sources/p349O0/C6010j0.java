package p349O0;

import p025An.InterfaceC0571F;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: O0.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6010j0 implements InterfaceC5985X, InterfaceC0571F {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC18776i f19510Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f19511Z;

    public C6010j0(InterfaceC5985X interfaceC5985X, InterfaceC18776i interfaceC18776i) {
        this.f19510Y = interfaceC18776i;
        this.f19511Z = interfaceC5985X;
    }

    @Override // p025An.InterfaceC0571F
    public final InterfaceC18776i getCoroutineContext() {
        return this.f19510Y;
    }

    @Override // p349O0.InterfaceC5982V0
    public final Object getValue() {
        return this.f19511Z.getValue();
    }

    @Override // p349O0.InterfaceC5985X
    public final void setValue(Object obj) {
        this.f19511Z.setValue(obj);
    }
}
