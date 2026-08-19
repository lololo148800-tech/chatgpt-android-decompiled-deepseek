package p607Yo;

import p690cp.AbstractC12915a;
import p690cp.C12913D;
import p690cp.C12922h;
import p712dp.C13191g;
import p756fp.AbstractC13719a;

/* JADX INFO: renamed from: Yo.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C10117f extends AbstractC13719a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29963a;

    /* JADX INFO: renamed from: b */
    public final AbstractC12915a f29964b;

    public C10117f(int i10) {
        this.f29963a = i10;
        switch (i10) {
            case 1:
                this.f29964b = new C12913D();
                break;
            default:
                this.f29964b = new C12922h();
                break;
        }
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: a */
    public void mo7964a(C13191g c13191g) {
        int i10 = this.f29963a;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: c */
    public boolean mo10700c(AbstractC12915a abstractC12915a) {
        switch (this.f29963a) {
            case 0:
                return true;
            default:
                return super.mo10700c(abstractC12915a);
        }
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: f */
    public final AbstractC12915a mo7966f() {
        switch (this.f29963a) {
            case 0:
                return (C12922h) this.f29964b;
            default:
                return (C12913D) this.f29964b;
        }
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: h */
    public boolean mo10701h() {
        switch (this.f29963a) {
            case 0:
                return true;
            default:
                return super.mo10701h();
        }
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: j */
    public final C10112a mo7967j(C10119h c10119h) {
        switch (this.f29963a) {
            case 0:
                return C10112a.m10688a(c10119h.f29971c);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m10699k(C13191g c13191g) {
    }
}
