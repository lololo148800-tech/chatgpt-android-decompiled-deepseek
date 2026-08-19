package p057C3;

import p232J3.C4241m;
import p232J3.InterfaceC4252x;
import p644ab.InterfaceC10536i;

/* JADX INFO: renamed from: C3.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1568m implements InterfaceC10536i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4390Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f4391Z;

    public /* synthetic */ C1568m(Object obj, int i10) {
        this.f4390Y = i10;
        this.f4391Z = obj;
    }

    @Override // p644ab.InterfaceC10536i
    public final Object get() {
        switch (this.f4390Y) {
            case 0:
                return (C4241m) this.f4391Z;
            case 1:
                return (C1566k) this.f4391Z;
            case 2:
                return Boolean.valueOf(((C1532J) this.f4391Z).f4134L0);
            default:
                try {
                    return (InterfaceC4252x) ((Class) this.f4391Z).getConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
