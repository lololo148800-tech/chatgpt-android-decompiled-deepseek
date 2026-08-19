package p1055v4;

import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p1073w3.C20816r;
import p372P3.InterfaceC6335q;
import p734ep.C13458b;

/* JADX INFO: renamed from: v4.z */
/* JADX INFO: loaded from: classes.dex */
public final class C20455z implements InterfaceC20429C {

    /* JADX INFO: renamed from: a */
    public final InterfaceC20454y f64925a;

    /* JADX INFO: renamed from: b */
    public final C20811m f64926b = new C20811m(32);

    /* JADX INFO: renamed from: c */
    public int f64927c;

    /* JADX INFO: renamed from: d */
    public int f64928d;

    /* JADX INFO: renamed from: e */
    public boolean f64929e;

    /* JADX INFO: renamed from: f */
    public boolean f64930f;

    public C20455z(InterfaceC20454y interfaceC20454y) {
        this.f64925a = interfaceC20454y;
    }

    @Override // p1055v4.InterfaceC20429C
    /* JADX INFO: renamed from: a */
    public final void mo21083a(int i10, C20811m c20811m) {
        int iM21365t;
        boolean z6 = (i10 & 1) != 0;
        if (z6) {
            iM21365t = c20811m.f66093b + c20811m.m21365t();
        } else {
            iM21365t = -1;
        }
        if (this.f64930f) {
            if (!z6) {
                return;
            }
            this.f64930f = false;
            c20811m.m21344F(iM21365t);
            this.f64928d = 0;
        }
        while (c20811m.m21346a() > 0) {
            int i11 = this.f64928d;
            C20811m c20811m2 = this.f64926b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iM21365t2 = c20811m.m21365t();
                    c20811m.m21344F(c20811m.f66093b - 1);
                    if (iM21365t2 == 255) {
                        this.f64930f = true;
                        return;
                    }
                }
                int iMin = Math.min(c20811m.m21346a(), 3 - this.f64928d);
                c20811m.m21350e(c20811m2.f66092a, this.f64928d, iMin);
                int i12 = this.f64928d + iMin;
                this.f64928d = i12;
                if (i12 == 3) {
                    c20811m2.m21344F(0);
                    c20811m2.m21343E(3);
                    c20811m2.m21345G(1);
                    int iM21365t3 = c20811m2.m21365t();
                    int iM21365t4 = c20811m2.m21365t();
                    this.f64929e = (iM21365t3 & 128) != 0;
                    int i13 = (((iM21365t3 & 15) << 8) | iM21365t4) + 3;
                    this.f64927c = i13;
                    byte[] bArr = c20811m2.f66092a;
                    if (bArr.length < i13) {
                        c20811m2.m21347b(Math.min(4098, Math.max(i13, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c20811m.m21346a(), this.f64927c - this.f64928d);
                c20811m.m21350e(c20811m2.f66092a, this.f64928d, iMin2);
                int i14 = this.f64928d + iMin2;
                this.f64928d = i14;
                int i15 = this.f64927c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f64929e) {
                        c20811m2.m21343E(i15);
                    } else {
                        if (AbstractC20817s.m21410k(0, i15, -1, c20811m2.f66092a) != 0) {
                            this.f64930f = true;
                            return;
                        }
                        c20811m2.m21343E(this.f64927c - 4);
                    }
                    c20811m2.m21344F(0);
                    this.f64925a.mo3067b(c20811m2);
                    this.f64928d = 0;
                }
            }
        }
    }

    @Override // p1055v4.InterfaceC20429C
    /* JADX INFO: renamed from: c */
    public final void mo21084c() {
        this.f64930f = true;
    }

    @Override // p1055v4.InterfaceC20429C
    /* JADX INFO: renamed from: d */
    public final void mo21085d(C20816r c20816r, InterfaceC6335q interfaceC6335q, C13458b c13458b) {
        this.f64925a.mo3069d(c20816r, interfaceC6335q, c13458b);
        this.f64930f = true;
    }
}
