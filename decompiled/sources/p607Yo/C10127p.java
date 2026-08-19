package p607Yo;

import p690cp.AbstractC12915a;
import p690cp.AbstractC12933s;
import p690cp.C12934t;
import p756fp.AbstractC13719a;

/* JADX INFO: renamed from: Yo.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C10127p extends AbstractC13719a {

    /* JADX INFO: renamed from: a */
    public final AbstractC12933s f30025a;

    /* JADX INFO: renamed from: b */
    public boolean f30026b;

    /* JADX INFO: renamed from: c */
    public int f30027c;

    public C10127p(AbstractC12933s abstractC12933s) {
        this.f30025a = abstractC12933s;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: c */
    public final boolean mo10700c(AbstractC12915a abstractC12915a) {
        if (!(abstractC12915a instanceof C12934t)) {
            return false;
        }
        if (this.f30026b && this.f30027c == 1) {
            this.f30025a.f41091g = false;
            this.f30026b = false;
        }
        return true;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: f */
    public final AbstractC12915a mo7966f() {
        return this.f30025a;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: h */
    public final boolean mo10701h() {
        return true;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: j */
    public final C10112a mo7967j(C10119h c10119h) {
        if (c10119h.f29977i) {
            this.f30026b = true;
            this.f30027c = 0;
        } else if (this.f30026b) {
            this.f30027c++;
        }
        return C10112a.m10688a(c10119h.f29971c);
    }
}
