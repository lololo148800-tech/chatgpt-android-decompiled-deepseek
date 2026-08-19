package p832jb;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0187M0;
import p003A1.C0178J0;
import p349O0.C6018n0;
import p349O0.C6021p;
import p492U1.C7548m;
import p492U1.InterfaceC7537b;
import p610Z1.AbstractC10141h;
import p610Z1.C10137d;
import p610Z1.C10140g;
import p635a1.C10456n;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p911o0.AbstractC17780r;
import p946pc.AbstractC18319D;
import p946pc.AbstractC18322G;
import p946pc.C18320E;

/* JADX INFO: renamed from: jb.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16182b {
    /* JADX INFO: renamed from: a */
    public static final void m17789a(C18320E c18320e, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(c18320e, "<this>");
        c6021p.m6526U(1642175075);
        if ((i10 & 14) == 0) {
            i11 = (c6021p.m6542f(c18320e) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            long jM15774b = C14365u.m15774b(0.2f, AbstractC18319D.m19845d(c18320e, c6021p));
            c6021p.m6525T(-1530749204);
            InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
            C7548m c7548m = AbstractC18322G.m19850c(AbstractC18322G.m19849b(c18320e, c6021p)).f58481a;
            AbstractC16544l.m18091d(c7548m);
            float fMo7870w = interfaceC7537b.mo7870w(c7548m.f23910a);
            c6021p.m6553p(false);
            AbstractC17780r.m19507a(AbstractC10833a.m11207b(AbstractC10844c.m11245e(AbstractC10844c.m11244d(AbstractC10842a.m11237o(C10456n.f30959Y, 0.0f, fMo7870w, 0.0f, fMo7870w, 5), 1.0f), 1), jM15774b, AbstractC14334L.f44973a), c6021p, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0178J0(c18320e, i10, 24);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo10732b(AbstractC10141h abstractC10141h, C10137d c10137d, C10137d c10137d2);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo10733c(AbstractC10141h abstractC10141h, Object obj, Object obj2);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo10734d(AbstractC10141h abstractC10141h, C10140g c10140g, C10140g c10140g2);

    /* JADX INFO: renamed from: e */
    public abstract void mo10735e(C10140g c10140g, C10140g c10140g2);

    /* JADX INFO: renamed from: f */
    public abstract void mo10736f(C10140g c10140g, Thread thread);
}
