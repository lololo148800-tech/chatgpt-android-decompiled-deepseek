package p414R;

import android.gov.nist.core.Separators;
import android.util.Size;
import p003A1.AbstractC0168G;
import p228J.AbstractC3810L;
import p239Ja.C4307j;
import p283L5.AbstractC4941g;
import p301M.AbstractC5229k;
import p329N3.RunnableC5611a;
import p544W9.AbstractC8488H2;
import p544W9.AbstractC8577W2;
import p610Z1.C10142i;
import p610Z1.C10145l;
import p747fb.InterfaceFutureC13608b;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: R.k */
/* JADX INFO: loaded from: classes.dex */
public final class C6777k extends AbstractC3810L {

    /* JADX INFO: renamed from: o */
    public final C10145l f21758o;

    /* JADX INFO: renamed from: p */
    public C10142i f21759p;

    /* JADX INFO: renamed from: q */
    public AbstractC3810L f21760q;

    /* JADX INFO: renamed from: r */
    public C6779m f21761r;

    public C6777k(Size size, int i10) {
        super(size, i10);
        this.f21758o = AbstractC16347a.m17947b(new C4307j(this, 3));
    }

    @Override // p228J.AbstractC3810L
    /* JADX INFO: renamed from: a */
    public final void mo4507a() {
        super.mo4507a();
        AbstractC8488H2.m9142c(new RunnableC6775i(this, 2));
    }

    @Override // p228J.AbstractC3810L
    /* JADX INFO: renamed from: f */
    public final InterfaceFutureC13608b mo3992f() {
        return this.f21758o;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m7222g(AbstractC3810L abstractC3810L, Runnable runnable) {
        boolean z6;
        AbstractC8488H2.m9140a();
        abstractC3810L.getClass();
        AbstractC3810L abstractC3810L2 = this.f21760q;
        if (abstractC3810L2 == abstractC3810L) {
            return false;
        }
        AbstractC4941g.m5559R("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", abstractC3810L2 == null);
        Size size = this.f11533h;
        Size size2 = abstractC3810L.f11533h;
        AbstractC4941g.m5554M("The provider's size(" + size + ") must match the parent(" + size2 + Separators.RPAREN, size.equals(size2));
        int i10 = abstractC3810L.f11534i;
        int i11 = this.f11534i;
        AbstractC4941g.m5554M(AbstractC0168G.m532u("The provider's format(", i11, ") must match the parent(", i10, Separators.RPAREN), i11 == i10);
        synchronized (this.f11526a) {
            z6 = this.f11528c;
        }
        AbstractC4941g.m5559R("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z6);
        this.f21760q = abstractC3810L;
        AbstractC5229k.m5781e(true, abstractC3810L.m4509c(), this.f21759p, AbstractC8577W2.m9240b());
        abstractC3810L.m4510d();
        AbstractC5229k.m5780d(this.f11530e).mo5766a(new RunnableC5611a(abstractC3810L, 5), AbstractC8577W2.m9240b());
        AbstractC5229k.m5780d(abstractC3810L.f11532g).mo5766a(runnable, AbstractC8577W2.m9243e());
        return true;
    }
}
