package p775h2;

import p760g2.C13807d;
import p760g2.C13811h;

/* JADX INFO: renamed from: h2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C14380j extends AbstractC14386p {
    @Override // p775h2.InterfaceC14375e
    /* JADX INFO: renamed from: a */
    public final void mo15814a(InterfaceC14375e interfaceC14375e) {
        C14377g c14377g = this.f45111h;
        if (c14377g.f45081c && !c14377g.f45088j) {
            c14377g.mo15863d((int) ((((C14377g) c14377g.f45090l.get(0)).f45085g * ((C13811h) this.f45105b).f43774r0) + 0.5f));
        }
    }

    @Override // p775h2.AbstractC14386p
    /* JADX INFO: renamed from: d */
    public final void mo15815d() {
        C13807d c13807d = this.f45105b;
        C13811h c13811h = (C13811h) c13807d;
        int i10 = c13811h.f43775s0;
        int i11 = c13811h.f43776t0;
        int i12 = c13811h.f43778v0;
        C14377g c14377g = this.f45111h;
        if (i12 == 1) {
            if (i10 != -1) {
                c14377g.f45090l.add(c13807d.f43649U.f43661d.f45111h);
                this.f45105b.f43649U.f43661d.f45111h.f45089k.add(c14377g);
                c14377g.f45084f = i10;
            } else if (i11 != -1) {
                c14377g.f45090l.add(c13807d.f43649U.f43661d.f45112i);
                this.f45105b.f43649U.f43661d.f45112i.f45089k.add(c14377g);
                c14377g.f45084f = -i11;
            } else {
                c14377g.f45080b = true;
                c14377g.f45090l.add(c13807d.f43649U.f43661d.f45112i);
                this.f45105b.f43649U.f43661d.f45112i.f45089k.add(c14377g);
            }
            m15873m(this.f45105b.f43661d.f45111h);
            m15873m(this.f45105b.f43661d.f45112i);
            return;
        }
        if (i10 != -1) {
            c14377g.f45090l.add(c13807d.f43649U.f43663e.f45111h);
            this.f45105b.f43649U.f43663e.f45111h.f45089k.add(c14377g);
            c14377g.f45084f = i10;
        } else if (i11 != -1) {
            c14377g.f45090l.add(c13807d.f43649U.f43663e.f45112i);
            this.f45105b.f43649U.f43663e.f45112i.f45089k.add(c14377g);
            c14377g.f45084f = -i11;
        } else {
            c14377g.f45080b = true;
            c14377g.f45090l.add(c13807d.f43649U.f43663e.f45112i);
            this.f45105b.f43649U.f43663e.f45112i.f45089k.add(c14377g);
        }
        m15873m(this.f45105b.f43663e.f45111h);
        m15873m(this.f45105b.f43663e.f45112i);
    }

    @Override // p775h2.AbstractC14386p
    /* JADX INFO: renamed from: e */
    public final void mo15816e() {
        C13807d c13807d = this.f45105b;
        int i10 = ((C13811h) c13807d).f43778v0;
        C14377g c14377g = this.f45111h;
        if (i10 == 1) {
            c13807d.f43654Z = c14377g.f45085g;
        } else {
            c13807d.f43656a0 = c14377g.f45085g;
        }
    }

    @Override // p775h2.AbstractC14386p
    /* JADX INFO: renamed from: f */
    public final void mo15817f() {
        this.f45111h.m15862c();
    }

    @Override // p775h2.AbstractC14386p
    /* JADX INFO: renamed from: k */
    public final boolean mo15819k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m15873m(C14377g c14377g) {
        C14377g c14377g2 = this.f45111h;
        c14377g2.f45089k.add(c14377g);
        c14377g.f45090l.add(c14377g2);
    }
}
