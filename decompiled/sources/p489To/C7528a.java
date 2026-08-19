package p489To;

import java.util.List;
import mp.C17360a;
import p523V9.AbstractC7877E4;
import p571X9.AbstractC9306j0;
import p658b5.C11242m;
import p690cp.AbstractC12935u;
import p690cp.C12912C;
import p690cp.C12931q;
import p690cp.C12940z;
import p879lp.C17118a;
import p879lp.C17119b;
import p879lp.EnumC17120c;
import p879lp.InterfaceC17121d;

/* JADX INFO: renamed from: To.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7528a extends AbstractC7877E4 {

    /* JADX INFO: renamed from: Y */
    public int f23869Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C7529b f23870Z;

    public C7528a(C7529b c7529b) {
        this.f23870Z = c7529b;
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: J */
    public final void mo5148J(C12931q c12931q) {
        this.f23869Y++;
        mo8159r(c12931q);
        this.f23869Y--;
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: f */
    public final void mo3708f(C12912C c12912c) {
        if (this.f23869Y == 0) {
            C7529b c7529b = this.f23870Z;
            c7529b.getClass();
            String str = c12912c.f41068g;
            List listM14594e = c12912c.m14594e();
            C12940z c12940z = listM14594e.size() == 1 ? (C12940z) listM14594e.get(0) : null;
            C11242m c11242m = c7529b.f23871a;
            c11242m.getClass();
            if (str == null) {
                throw new NullPointerException("input must not be null");
            }
            C17119b c17119b = new C17119b(str, new C17118a(c11242m, str));
            AbstractC12935u abstractC12935u = c12912c;
            while (c17119b.hasNext()) {
                InterfaceC17121d interfaceC17121d = (InterfaceC17121d) c17119b.next();
                if (abstractC12935u == c12912c && !c17119b.hasNext() && !(interfaceC17121d instanceof C17360a)) {
                    return;
                }
                int beginIndex = interfaceC17121d.getBeginIndex();
                int endIndex = interfaceC17121d.getEndIndex();
                C12912C c12912c2 = new C12912C(str.substring(beginIndex, endIndex));
                if (c12940z != null) {
                    c12912c2.m14592b(c12940z.m14600a(beginIndex, endIndex));
                }
                if (interfaceC17121d instanceof C17360a) {
                    String strM9889h = c12912c2.f41068g;
                    if (((C17360a) interfaceC17121d).f55388a == EnumC17120c.f54727Z) {
                        strM9889h = AbstractC9306j0.m9889h("mailto:", strM9889h);
                    }
                    C12931q c12931q = new C12931q(strM9889h, null);
                    c12931q.m14593c(c12912c2);
                    c12931q.m14597i(c12912c2.m14594e());
                    abstractC12935u.m14595f(c12931q);
                    abstractC12935u = c12931q;
                } else {
                    abstractC12935u.m14595f(c12912c2);
                    abstractC12935u = c12912c2;
                }
            }
            c12912c.m14598k();
        }
    }
}
