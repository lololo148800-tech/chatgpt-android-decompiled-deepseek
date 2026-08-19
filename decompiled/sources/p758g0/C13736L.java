package p758g0;

import p003A1.C0178J0;
import p049Bm.InterfaceC1439n;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p392Q0.C6546d;

/* JADX INFO: renamed from: g0.L */
/* JADX INFO: loaded from: classes.dex */
public final class C13736L {

    /* JADX INFO: renamed from: a */
    public final C6546d f43319a = new C6546d(new C13733I[16]);

    /* JADX INFO: renamed from: b */
    public final C6002f0 f43320b;

    /* JADX INFO: renamed from: c */
    public long f43321c;

    /* JADX INFO: renamed from: d */
    public final C6002f0 f43322d;

    public C13736L() {
        Boolean bool = Boolean.FALSE;
        C5975S c5975s = C5975S.f19448r0;
        this.f43320b = C5997d.m6430Q(bool, c5975s);
        this.f43321c = Long.MIN_VALUE;
        this.f43322d = C5997d.m6430Q(Boolean.TRUE, c5975s);
    }

    /* JADX INFO: renamed from: a */
    public final void m15215a(int i10, C6021p c6021p) {
        int i11;
        c6021p.m6526U(-318043801);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6430Q(null, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
            if (((Boolean) this.f43322d.getValue()).booleanValue() || ((Boolean) this.f43320b.getValue()).booleanValue()) {
                c6021p.m6524S(1719915818);
                boolean zM6545h = c6021p.m6545h(this);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6545h || objM6514H2 == c5975s) {
                    objM6514H2 = new C13735K(interfaceC5985X, this, null);
                    c6021p.m6537c0(objM6514H2);
                }
                C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, this);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(1721436120);
                c6021p.m6553p(false);
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0178J0(this, i10, 18);
        }
    }
}
