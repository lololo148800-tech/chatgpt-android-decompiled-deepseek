package p775h2;

import java.util.Iterator;
import p760g2.C13804a;
import p760g2.C13807d;

/* JADX INFO: renamed from: h2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C14381k extends AbstractC14386p {
    @Override // p775h2.InterfaceC14375e
    /* JADX INFO: renamed from: a */
    public final void mo15814a(InterfaceC14375e interfaceC14375e) {
        C13804a c13804a = (C13804a) this.f45105b;
        int i10 = c13804a.f43599t0;
        C14377g c14377g = this.f45111h;
        Iterator it = c14377g.f45090l.iterator();
        int i11 = 0;
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = ((C14377g) it.next()).f45085g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (i10 == 0 || i10 == 2) {
            c14377g.mo15863d(i12 + c13804a.f43601v0);
        } else {
            c14377g.mo15863d(i11 + c13804a.f43601v0);
        }
    }

    @Override // p775h2.AbstractC14386p
    /* JADX INFO: renamed from: d */
    public final void mo15815d() {
        C13807d c13807d = this.f45105b;
        if (c13807d instanceof C13804a) {
            C14377g c14377g = this.f45111h;
            c14377g.f45080b = true;
            C13804a c13804a = (C13804a) c13807d;
            int i10 = c13804a.f43599t0;
            boolean z6 = c13804a.f43600u0;
            int i11 = 0;
            if (i10 == 0) {
                c14377g.f45083e = 4;
                while (i11 < c13804a.f43781s0) {
                    C13807d c13807d2 = c13804a.f43780r0[i11];
                    if (z6 || c13807d2.f43670h0 != 8) {
                        C14377g c14377g2 = c13807d2.f43661d.f45111h;
                        c14377g2.f45089k.add(c14377g);
                        c14377g.f45090l.add(c14377g2);
                    }
                    i11++;
                }
                m15874m(this.f45105b.f43661d.f45111h);
                m15874m(this.f45105b.f43661d.f45112i);
                return;
            }
            if (i10 == 1) {
                c14377g.f45083e = 5;
                while (i11 < c13804a.f43781s0) {
                    C13807d c13807d3 = c13804a.f43780r0[i11];
                    if (z6 || c13807d3.f43670h0 != 8) {
                        C14377g c14377g3 = c13807d3.f43661d.f45112i;
                        c14377g3.f45089k.add(c14377g);
                        c14377g.f45090l.add(c14377g3);
                    }
                    i11++;
                }
                m15874m(this.f45105b.f43661d.f45111h);
                m15874m(this.f45105b.f43661d.f45112i);
                return;
            }
            if (i10 == 2) {
                c14377g.f45083e = 6;
                while (i11 < c13804a.f43781s0) {
                    C13807d c13807d4 = c13804a.f43780r0[i11];
                    if (z6 || c13807d4.f43670h0 != 8) {
                        C14377g c14377g4 = c13807d4.f43663e.f45111h;
                        c14377g4.f45089k.add(c14377g);
                        c14377g.f45090l.add(c14377g4);
                    }
                    i11++;
                }
                m15874m(this.f45105b.f43663e.f45111h);
                m15874m(this.f45105b.f43663e.f45112i);
                return;
            }
            if (i10 != 3) {
                return;
            }
            c14377g.f45083e = 7;
            while (i11 < c13804a.f43781s0) {
                C13807d c13807d5 = c13804a.f43780r0[i11];
                if (z6 || c13807d5.f43670h0 != 8) {
                    C14377g c14377g5 = c13807d5.f43663e.f45112i;
                    c14377g5.f45089k.add(c14377g);
                    c14377g.f45090l.add(c14377g5);
                }
                i11++;
            }
            m15874m(this.f45105b.f43663e.f45111h);
            m15874m(this.f45105b.f43663e.f45112i);
        }
    }

    @Override // p775h2.AbstractC14386p
    /* JADX INFO: renamed from: e */
    public final void mo15816e() {
        C13807d c13807d = this.f45105b;
        if (c13807d instanceof C13804a) {
            int i10 = ((C13804a) c13807d).f43599t0;
            C14377g c14377g = this.f45111h;
            if (i10 == 0 || i10 == 1) {
                c13807d.f43654Z = c14377g.f45085g;
            } else {
                c13807d.f43656a0 = c14377g.f45085g;
            }
        }
    }

    @Override // p775h2.AbstractC14386p
    /* JADX INFO: renamed from: f */
    public final void mo15817f() {
        this.f45106c = null;
        this.f45111h.m15862c();
    }

    @Override // p775h2.AbstractC14386p
    /* JADX INFO: renamed from: k */
    public final boolean mo15819k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m15874m(C14377g c14377g) {
        C14377g c14377g2 = this.f45111h;
        c14377g2.f45089k.add(c14377g);
        c14377g.f45090l.add(c14377g2);
    }
}
