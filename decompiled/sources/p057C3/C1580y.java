package p057C3;

import p083D3.C1863a;
import p083D3.C1873k;
import p1016t3.C19773X;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1016t3.InterfaceC19759I;
import p1073w3.InterfaceC20806h;
import p658b5.C11248s;

/* JADX INFO: renamed from: C3.y */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1580y implements InterfaceC20806h {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4426Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19773X f4427Z;

    public /* synthetic */ C1580y(C1863a c1863a, C19773X c19773x) {
        this.f4427Z = c19773x;
    }

    @Override // p1073w3.InterfaceC20806h
    public final void invoke(Object obj) {
        switch (this.f4426Y) {
            case 0:
                ((InterfaceC19759I) obj).mo2765m(this.f4427Z);
                break;
            default:
                C1873k c1873k = (C1873k) obj;
                C11248s c11248s = c1873k.f5404o;
                C19773X c19773x = this.f4427Z;
                if (c11248s != null) {
                    C19788o c19788o = (C19788o) c11248s.f34081Z;
                    if (c19788o.f62759t == -1) {
                        C19787n c19787nM20747a = c19788o.m20747a();
                        c19787nM20747a.f62720r = c19773x.f62651a;
                        c19787nM20747a.f62721s = c19773x.f62652b;
                        c1873k.f5404o = new C11248s(new C19788o(c19787nM20747a), (String) c11248s.f34082o0, false, 3);
                    }
                }
                int i10 = c19773x.f62651a;
                break;
        }
    }

    public /* synthetic */ C1580y(C19773X c19773x) {
        this.f4427Z = c19773x;
    }
}
