package p571X9;

import p228J.AbstractC3794B0;
import p961qb.C18662c;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18664e;

/* JADX INFO: renamed from: X9.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9366t0 implements InterfaceC18663d {

    /* JADX INFO: renamed from: a */
    public static final C9366t0 f28213a = new C9366t0();

    /* JADX INFO: renamed from: b */
    public static final C18662c f28214b = new C18662c("logEventKey", AbstractC9306j0.m9899r(AbstractC3794B0.m4468C(InterfaceC9114D.class, new C9096A(1))));

    /* JADX INFO: renamed from: c */
    public static final C18662c f28215c = new C18662c("eventCount", AbstractC9306j0.m9899r(AbstractC3794B0.m4468C(InterfaceC9114D.class, new C9096A(2))));

    /* JADX INFO: renamed from: d */
    public static final C18662c f28216d = new C18662c("inferenceDurationStats", AbstractC9306j0.m9899r(AbstractC3794B0.m4468C(InterfaceC9114D.class, new C9096A(3))));

    @Override // p961qb.InterfaceC18660a
    /* JADX INFO: renamed from: a */
    public final void mo3472a(Object obj, Object obj2) {
        C9203S c9203s = (C9203S) obj;
        InterfaceC18664e interfaceC18664e = (InterfaceC18664e) obj2;
        interfaceC18664e.mo8316c(f28214b, c9203s.f27996a);
        interfaceC18664e.mo8316c(f28215c, c9203s.f27997b);
        interfaceC18664e.mo8316c(f28216d, c9203s.f27998c);
    }
}
