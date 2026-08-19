package p594Y9;

import p571X9.AbstractC9306j0;
import p961qb.C18662c;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18664e;

/* JADX INFO: renamed from: Y9.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C9916k1 implements InterfaceC18663d {

    /* JADX INFO: renamed from: a */
    public static final C9916k1 f29446a = new C9916k1();

    /* JADX INFO: renamed from: b */
    public static final C18662c f29447b = new C18662c("maxMs", AbstractC9306j0.m9899r(AbstractC9306j0.m9897p(InterfaceC9735H.class, new C9717E(1))));

    /* JADX INFO: renamed from: c */
    public static final C18662c f29448c = new C18662c("minMs", AbstractC9306j0.m9899r(AbstractC9306j0.m9897p(InterfaceC9735H.class, new C9717E(2))));

    /* JADX INFO: renamed from: d */
    public static final C18662c f29449d = new C18662c("avgMs", AbstractC9306j0.m9899r(AbstractC9306j0.m9897p(InterfaceC9735H.class, new C9717E(3))));

    /* JADX INFO: renamed from: e */
    public static final C18662c f29450e = new C18662c("firstQuartileMs", AbstractC9306j0.m9899r(AbstractC9306j0.m9897p(InterfaceC9735H.class, new C9717E(4))));

    /* JADX INFO: renamed from: f */
    public static final C18662c f29451f = new C18662c("medianMs", AbstractC9306j0.m9899r(AbstractC9306j0.m9897p(InterfaceC9735H.class, new C9717E(5))));

    /* JADX INFO: renamed from: g */
    public static final C18662c f29452g = new C18662c("thirdQuartileMs", AbstractC9306j0.m9899r(AbstractC9306j0.m9897p(InterfaceC9735H.class, new C9717E(6))));

    @Override // p961qb.InterfaceC18660a
    /* JADX INFO: renamed from: a */
    public final void mo3472a(Object obj, Object obj2) {
        C9887f3 c9887f3 = (C9887f3) obj;
        InterfaceC18664e interfaceC18664e = (InterfaceC18664e) obj2;
        interfaceC18664e.mo8316c(f29447b, c9887f3.f29395a);
        interfaceC18664e.mo8316c(f29448c, c9887f3.f29396b);
        interfaceC18664e.mo8316c(f29449d, c9887f3.f29397c);
        interfaceC18664e.mo8316c(f29450e, c9887f3.f29398d);
        interfaceC18664e.mo8316c(f29451f, c9887f3.f29399e);
        interfaceC18664e.mo8316c(f29452g, c9887f3.f29400f);
    }
}
