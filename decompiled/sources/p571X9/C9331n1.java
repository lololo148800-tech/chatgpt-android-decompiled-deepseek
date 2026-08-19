package p571X9;

import p228J.AbstractC3794B0;
import p961qb.C18662c;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18664e;

/* JADX INFO: renamed from: X9.n1 */
/* JADX INFO: loaded from: classes.dex */
public final class C9331n1 implements InterfaceC18663d {

    /* JADX INFO: renamed from: a */
    public static final C9331n1 f28149a = new C9331n1();

    /* JADX INFO: renamed from: b */
    public static final C18662c f28150b = new C18662c("imageFormat", AbstractC9306j0.m9899r(AbstractC3794B0.m4468C(InterfaceC9114D.class, new C9096A(1))));

    /* JADX INFO: renamed from: c */
    public static final C18662c f28151c = new C18662c("originalImageSize", AbstractC9306j0.m9899r(AbstractC3794B0.m4468C(InterfaceC9114D.class, new C9096A(2))));

    /* JADX INFO: renamed from: d */
    public static final C18662c f28152d = new C18662c("compressedImageSize", AbstractC9306j0.m9899r(AbstractC3794B0.m4468C(InterfaceC9114D.class, new C9096A(3))));

    /* JADX INFO: renamed from: e */
    public static final C18662c f28153e = new C18662c("isOdmlImage", AbstractC9306j0.m9899r(AbstractC3794B0.m4468C(InterfaceC9114D.class, new C9096A(4))));

    @Override // p961qb.InterfaceC18660a
    /* JADX INFO: renamed from: a */
    public final void mo3472a(Object obj, Object obj2) {
        C9309j3 c9309j3 = (C9309j3) obj;
        InterfaceC18664e interfaceC18664e = (InterfaceC18664e) obj2;
        interfaceC18664e.mo8316c(f28150b, c9309j3.f28110a);
        interfaceC18664e.mo8316c(f28151c, c9309j3.f28111b);
        interfaceC18664e.mo8316c(f28152d, null);
        interfaceC18664e.mo8316c(f28153e, null);
    }
}
