package p567X5;

import java.util.ArrayList;
import java.util.List;
import p591Y5.C9656g;
import p591Y5.InterfaceC9650a;
import p675c6.C11681p;
import p698d6.AbstractC13029b;

/* JADX INFO: renamed from: X5.t */
/* JADX INFO: loaded from: classes.dex */
public final class C9070t implements InterfaceC9053c, InterfaceC9650a {

    /* JADX INFO: renamed from: a */
    public final boolean f27769a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f27770b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final int f27771c;

    /* JADX INFO: renamed from: d */
    public final C9656g f27772d;

    /* JADX INFO: renamed from: e */
    public final C9656g f27773e;

    /* JADX INFO: renamed from: f */
    public final C9656g f27774f;

    public C9070t(AbstractC13029b abstractC13029b, C11681p c11681p) {
        c11681p.getClass();
        this.f27769a = c11681p.f35408e;
        this.f27771c = c11681p.f35404a;
        C9656g c9656gMo10670p = c11681p.f35405b.mo10670p();
        this.f27772d = c9656gMo10670p;
        C9656g c9656gMo10670p2 = c11681p.f35406c.mo10670p();
        this.f27773e = c9656gMo10670p2;
        C9656g c9656gMo10670p3 = c11681p.f35407d.mo10670p();
        this.f27774f = c9656gMo10670p3;
        abstractC13029b.m14772d(c9656gMo10670p);
        abstractC13029b.m14772d(c9656gMo10670p2);
        abstractC13029b.m14772d(c9656gMo10670p3);
        c9656gMo10670p.m10230a(this);
        c9656gMo10670p2.m10230a(this);
        c9656gMo10670p3.m10230a(this);
    }

    @Override // p591Y5.InterfaceC9650a
    /* JADX INFO: renamed from: a */
    public final void mo9610a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f27770b;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((InterfaceC9650a) arrayList.get(i10)).mo9610a();
            i10++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m9625d(InterfaceC9650a interfaceC9650a) {
        this.f27770b.add(interfaceC9650a);
    }

    @Override // p567X5.InterfaceC9053c
    /* JADX INFO: renamed from: b */
    public final void mo9611b(List list, List list2) {
    }
}
