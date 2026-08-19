package p523V9;

import p228J.AbstractC3794B0;
import p571X9.AbstractC9306j0;
import p961qb.C18662c;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18664e;

/* JADX INFO: renamed from: V9.V1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8008V1 implements InterfaceC18663d {

    /* JADX INFO: renamed from: a */
    public static final C8008V1 f25296a = new C8008V1();

    /* JADX INFO: renamed from: b */
    public static final C18662c f25297b = new C18662c("maxMs", AbstractC9306j0.m9899r(AbstractC3794B0.m4466A(InterfaceC7991T.class, new C7952O(1))));

    /* JADX INFO: renamed from: c */
    public static final C18662c f25298c = new C18662c("minMs", AbstractC9306j0.m9899r(AbstractC3794B0.m4466A(InterfaceC7991T.class, new C7952O(2))));

    /* JADX INFO: renamed from: d */
    public static final C18662c f25299d = new C18662c("avgMs", AbstractC9306j0.m9899r(AbstractC3794B0.m4466A(InterfaceC7991T.class, new C7952O(3))));

    /* JADX INFO: renamed from: e */
    public static final C18662c f25300e = new C18662c("firstQuartileMs", AbstractC9306j0.m9899r(AbstractC3794B0.m4466A(InterfaceC7991T.class, new C7952O(4))));

    /* JADX INFO: renamed from: f */
    public static final C18662c f25301f = new C18662c("medianMs", AbstractC9306j0.m9899r(AbstractC3794B0.m4466A(InterfaceC7991T.class, new C7952O(5))));

    /* JADX INFO: renamed from: g */
    public static final C18662c f25302g = new C18662c("thirdQuartileMs", AbstractC9306j0.m9899r(AbstractC3794B0.m4466A(InterfaceC7991T.class, new C7952O(6))));

    @Override // p961qb.InterfaceC18660a
    /* JADX INFO: renamed from: a */
    public final void mo3472a(Object obj, Object obj2) {
        C8182r4 c8182r4 = (C8182r4) obj;
        InterfaceC18664e interfaceC18664e = (InterfaceC18664e) obj2;
        interfaceC18664e.mo8316c(f25297b, c8182r4.f25625a);
        interfaceC18664e.mo8316c(f25298c, c8182r4.f25626b);
        interfaceC18664e.mo8316c(f25299d, c8182r4.f25627c);
        interfaceC18664e.mo8316c(f25300e, c8182r4.f25628d);
        interfaceC18664e.mo8316c(f25301f, c8182r4.f25629e);
        interfaceC18664e.mo8316c(f25302g, c8182r4.f25630f);
    }
}
