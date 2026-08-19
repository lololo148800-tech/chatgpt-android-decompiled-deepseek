package ni;

import java.util.concurrent.atomic.AtomicInteger;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0631p0;
import p049Bm.InterfaceC1436k;
import p758g0.C13775m0;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ni.n */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17640n {

    /* JADX INFO: renamed from: a */
    public final C17629c f56425a;

    /* JADX INFO: renamed from: b */
    public final C0631p0 f56426b = AbstractC0575H.m1175d();

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f56427c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d */
    public final C0631p0 f56428d = AbstractC0575H.m1175d();

    public AbstractC17640n(C17629c c17629c) {
        this.f56425a = c17629c;
        m19237b(new C17638l(1, null));
    }

    /* JADX INFO: renamed from: a */
    public final Object m19236a(AbstractC19687c abstractC19687c) {
        this.f56426b.m1279g0();
        Object objMo1272P = this.f56428d.mo1272P(abstractC19687c);
        return objMo1272P == EnumC19250a.f61036Y ? objMo1272P : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: b */
    public final void m19237b(InterfaceC1436k interfaceC1436k) {
        this.f56427c.incrementAndGet();
        this.f56426b.mo1271H0(new C13775m0(this, interfaceC1436k));
    }
}
