package p953q0;

import p349O0.C5975S;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C6002f0;

/* JADX INFO: renamed from: q0.U */
/* JADX INFO: loaded from: classes.dex */
public final class C18562U {

    /* JADX INFO: renamed from: a */
    public final Object f59135a;

    /* JADX INFO: renamed from: b */
    public final C18563V f59136b;

    /* JADX INFO: renamed from: c */
    public final C5996c0 f59137c = C5997d.m6429P(-1);

    /* JADX INFO: renamed from: d */
    public final C5996c0 f59138d = C5997d.m6429P(0);

    /* JADX INFO: renamed from: e */
    public final C6002f0 f59139e;

    /* JADX INFO: renamed from: f */
    public final C6002f0 f59140f;

    public C18562U(Object obj, C18563V c18563v) {
        this.f59135a = obj;
        this.f59136b = c18563v;
        C5975S c5975s = C5975S.f19448r0;
        this.f59139e = C5997d.m6430Q(null, c5975s);
        this.f59140f = C5997d.m6430Q(null, c5975s);
    }

    /* JADX INFO: renamed from: a */
    public final C18562U m19940a() {
        C5996c0 c5996c0 = this.f59138d;
        if (c5996c0.m6412g() == 0) {
            this.f59136b.f59141Y.add(this);
            C18562U c18562u = (C18562U) this.f59140f.getValue();
            if (c18562u != null) {
                c18562u.m19940a();
            } else {
                c18562u = null;
            }
            this.f59139e.setValue(c18562u);
        }
        c5996c0.m6413h(c5996c0.m6412g() + 1);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m19941b() {
        C5996c0 c5996c0 = this.f59138d;
        if (c5996c0.m6412g() <= 0) {
            throw new IllegalStateException("Release should only be called once");
        }
        c5996c0.m6413h(c5996c0.m6412g() - 1);
        if (c5996c0.m6412g() == 0) {
            this.f59136b.f59141Y.remove(this);
            C6002f0 c6002f0 = this.f59139e;
            C18562U c18562u = (C18562U) c6002f0.getValue();
            if (c18562u != null) {
                c18562u.m19941b();
            }
            c6002f0.setValue(null);
        }
    }
}
