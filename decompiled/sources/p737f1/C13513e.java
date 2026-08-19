package p737f1;

import p003A1.C0283r;
import p003A1.C0292u;
import p692d0.AbstractC12958K;
import p692d0.C12954G;

/* JADX INFO: renamed from: f1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C13513e {

    /* JADX INFO: renamed from: a */
    public final C0292u f42776a;

    /* JADX INFO: renamed from: b */
    public final C0283r f42777b;

    /* JADX INFO: renamed from: c */
    public final C12954G f42778c;

    /* JADX INFO: renamed from: d */
    public final C12954G f42779d;

    /* JADX INFO: renamed from: e */
    public final C12954G f42780e;

    /* JADX INFO: renamed from: f */
    public final C12954G f42781f;

    public C13513e(C0292u c0292u, C0283r c0283r) {
        this.f42776a = c0292u;
        this.f42777b = c0283r;
        int i10 = AbstractC12958K.f41151a;
        this.f42778c = new C12954G();
        this.f42779d = new C12954G();
        this.f42780e = new C12954G();
        this.f42781f = new C12954G();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m15066a() {
        return this.f42778c.m14631h() || this.f42780e.m14631h() || this.f42779d.m14631h();
    }

    /* JADX INFO: renamed from: b */
    public final void m15067b(C12954G c12954g, Object obj) {
        if (c12954g.m14624a(obj) && this.f42778c.f41146d + this.f42779d.f41146d + this.f42780e.f41146d == 1) {
            this.f42776a.invoke(new C0283r(0, this, C13513e.class, "invalidateNodes", "invalidateNodes()V", 0, 6));
        }
    }
}
