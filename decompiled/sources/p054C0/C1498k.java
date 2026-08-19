package p054C0;

import p1095x1.InterfaceC21098s;
import p1140z1.AbstractC21678Y;
import p204I1.C3578I;

/* JADX INFO: renamed from: C0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1498k {

    /* JADX INFO: renamed from: c */
    public static final C1498k f3974c = new C1498k(null, null);

    /* JADX INFO: renamed from: a */
    public final InterfaceC21098s f3975a;

    /* JADX INFO: renamed from: b */
    public final C3578I f3976b;

    public C1498k(C3578I c3578i, InterfaceC21098s interfaceC21098s) {
        this.f3975a = interfaceC21098s;
        this.f3976b = c3578i;
    }

    /* JADX INFO: renamed from: a */
    public static C1498k m2160a(C1498k c1498k, AbstractC21678Y abstractC21678Y, C3578I c3578i, int i10) {
        InterfaceC21098s interfaceC21098s = abstractC21678Y;
        if ((i10 & 1) != 0) {
            interfaceC21098s = c1498k.f3975a;
        }
        if ((i10 & 2) != 0) {
            c3578i = c1498k.f3976b;
        }
        c1498k.getClass();
        return new C1498k(c3578i, interfaceC21098s);
    }
}
