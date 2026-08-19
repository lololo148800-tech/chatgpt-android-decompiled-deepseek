package p571X9;

import p228J.AbstractC3794B0;
import p961qb.C18662c;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18664e;

/* JADX INFO: renamed from: X9.i1 */
/* JADX INFO: loaded from: classes.dex */
public final class C9301i1 implements InterfaceC18663d {

    /* JADX INFO: renamed from: a */
    public static final C9301i1 f28090a = new C9301i1();

    /* JADX INFO: renamed from: b */
    public static final C18662c f28091b = new C18662c("maxMs", AbstractC9306j0.m9899r(AbstractC3794B0.m4468C(InterfaceC9114D.class, new C9096A(1))));

    /* JADX INFO: renamed from: c */
    public static final C18662c f28092c = new C18662c("minMs", AbstractC9306j0.m9899r(AbstractC3794B0.m4468C(InterfaceC9114D.class, new C9096A(2))));

    /* JADX INFO: renamed from: d */
    public static final C18662c f28093d = new C18662c("avgMs", AbstractC9306j0.m9899r(AbstractC3794B0.m4468C(InterfaceC9114D.class, new C9096A(3))));

    /* JADX INFO: renamed from: e */
    public static final C18662c f28094e = new C18662c("firstQuartileMs", AbstractC9306j0.m9899r(AbstractC3794B0.m4468C(InterfaceC9114D.class, new C9096A(4))));

    /* JADX INFO: renamed from: f */
    public static final C18662c f28095f = new C18662c("medianMs", AbstractC9306j0.m9899r(AbstractC3794B0.m4468C(InterfaceC9114D.class, new C9096A(5))));

    /* JADX INFO: renamed from: g */
    public static final C18662c f28096g = new C18662c("thirdQuartileMs", AbstractC9306j0.m9899r(AbstractC3794B0.m4468C(InterfaceC9114D.class, new C9096A(6))));

    @Override // p961qb.InterfaceC18660a
    /* JADX INFO: renamed from: a */
    public final void mo3472a(Object obj, Object obj2) {
        C9255a3 c9255a3 = (C9255a3) obj;
        InterfaceC18664e interfaceC18664e = (InterfaceC18664e) obj2;
        interfaceC18664e.mo8316c(f28091b, c9255a3.f28037a);
        interfaceC18664e.mo8316c(f28092c, c9255a3.f28038b);
        interfaceC18664e.mo8316c(f28093d, c9255a3.f28039c);
        interfaceC18664e.mo8316c(f28094e, c9255a3.f28040d);
        interfaceC18664e.mo8316c(f28095f, c9255a3.f28041e);
        interfaceC18664e.mo8316c(f28096g, c9255a3.f28042f);
    }
}
