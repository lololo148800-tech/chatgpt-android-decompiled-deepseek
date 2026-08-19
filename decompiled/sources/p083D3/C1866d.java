package p083D3;

import p1016t3.C19760J;
import p1073w3.InterfaceC20806h;
import p802i6.InterfaceC14937c;

/* JADX INFO: renamed from: D3.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1866d implements InterfaceC20806h, InterfaceC14937c {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5359Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f5360Z;

    public /* synthetic */ C1866d(int i10, int i11) {
        this.f5359Y = i11;
        this.f5360Z = i10;
    }

    @Override // p802i6.InterfaceC14937c
    public Integer getValue() {
        switch (this.f5359Y) {
            case 1:
                break;
        }
        return Integer.valueOf(this.f5360Z);
    }

    @Override // p1073w3.InterfaceC20806h
    public void invoke(Object obj) {
        C1873k c1873k = (C1873k) obj;
        c1873k.getClass();
        int i10 = this.f5360Z;
        if (i10 == 1) {
            c1873k.f5410u = true;
        }
        c1873k.f5400k = i10;
    }

    public /* synthetic */ C1866d(C1863a c1863a, int i10, C19760J c19760j, C19760J c19760j2) {
        this.f5359Y = 0;
        this.f5360Z = i10;
    }
}
