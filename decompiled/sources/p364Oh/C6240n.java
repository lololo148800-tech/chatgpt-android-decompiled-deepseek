package p364Oh;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p086D6.InterfaceC1957a;
import p1034u6.AbstractC20136n;
import p1034u6.C20130h;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p138F8.vJO.anhfj;
import p826j6.C16137F;
import p917o6.C17851d;
import p917o6.C17852e;
import tl.C20004d;

/* JADX INFO: renamed from: Oh.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C6240n implements InterfaceC1957a {

    /* JADX INFO: renamed from: a */
    public static final C20004d f20318a = new C20004d();

    @Override // p086D6.InterfaceC1957a
    /* JADX INFO: renamed from: a */
    public final InterfaceC2184i mo3140a(C17852e c17852e, C16137F c16137f) {
        AbstractC16544l.m18094g(c17852e, anhfj.BftdwvKjb);
        boolean zAdd = f20318a.add(c17852e.f56921a.mo19590c());
        if (zAdd) {
            return new C2219z0(new C20130h(c16137f, c17852e, null));
        }
        if (zAdd) {
            throw new C0644w();
        }
        C17851d c17851dM19597a = c17852e.m19597a();
        AbstractC20136n.m20961a(c17851dM19597a);
        return c16137f.m17695n(c17851dM19597a.m19596a());
    }
}
