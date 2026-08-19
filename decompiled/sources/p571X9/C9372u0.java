package p571X9;

import p228J.AbstractC3794B0;
import p961qb.C18662c;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18664e;

/* JADX INFO: renamed from: X9.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9372u0 implements InterfaceC18663d {

    /* JADX INFO: renamed from: a */
    public static final C9372u0 f28230a = new C9372u0();

    /* JADX INFO: renamed from: b */
    public static final C18662c f28231b = new C18662c("errorCode", AbstractC9306j0.m9899r(AbstractC3794B0.m4468C(InterfaceC9114D.class, new C9096A(1))));

    /* JADX INFO: renamed from: c */
    public static final C18662c f28232c = new C18662c("isColdCall", AbstractC9306j0.m9899r(AbstractC3794B0.m4468C(InterfaceC9114D.class, new C9096A(2))));

    /* JADX INFO: renamed from: d */
    public static final C18662c f28233d = new C18662c("imageInfo", AbstractC9306j0.m9899r(AbstractC3794B0.m4468C(InterfaceC9114D.class, new C9096A(3))));

    /* JADX INFO: renamed from: e */
    public static final C18662c f28234e = new C18662c("detectorOptions", AbstractC9306j0.m9899r(AbstractC3794B0.m4468C(InterfaceC9114D.class, new C9096A(4))));

    /* JADX INFO: renamed from: f */
    public static final C18662c f28235f = new C18662c("contourDetectedFaces", AbstractC9306j0.m9899r(AbstractC3794B0.m4468C(InterfaceC9114D.class, new C9096A(5))));

    /* JADX INFO: renamed from: g */
    public static final C18662c f28236g = new C18662c("nonContourDetectedFaces", AbstractC9306j0.m9899r(AbstractC3794B0.m4468C(InterfaceC9114D.class, new C9096A(6))));

    @Override // p961qb.InterfaceC18660a
    /* JADX INFO: renamed from: a */
    public final void mo3472a(Object obj, Object obj2) {
        C9192Q c9192q = (C9192Q) obj;
        InterfaceC18664e interfaceC18664e = (InterfaceC18664e) obj2;
        interfaceC18664e.mo8316c(f28231b, c9192q.f27978a);
        interfaceC18664e.mo8316c(f28232c, c9192q.f27979b);
        interfaceC18664e.mo8316c(f28233d, null);
        interfaceC18664e.mo8316c(f28234e, c9192q.f27980c);
        interfaceC18664e.mo8316c(f28235f, c9192q.f27981d);
        interfaceC18664e.mo8316c(f28236g, c9192q.f27982e);
    }
}
