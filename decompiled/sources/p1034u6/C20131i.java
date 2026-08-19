package p1034u6;

import kotlin.jvm.internal.AbstractC16544l;
import p086D6.InterfaceC1957a;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p826j6.C16137F;
import p917o6.C17851d;
import p917o6.C17852e;

/* JADX INFO: renamed from: u6.i */
/* JADX INFO: loaded from: classes.dex */
public final class C20131i implements InterfaceC1957a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63767a;

    @Override // p086D6.InterfaceC1957a
    /* JADX INFO: renamed from: a */
    public final InterfaceC2184i mo3140a(C17852e request, C16137F c16137f) {
        switch (this.f63767a) {
            case 0:
                AbstractC16544l.m18094g(request, "request");
                return new C2219z0(new C20130h(c16137f, request, null));
            case 1:
                AbstractC16544l.m18094g(request, "request");
                return new C2219z0(new C20132j(c16137f, request, null));
            case 2:
                AbstractC16544l.m18094g(request, "request");
                C17851d c17851dM19597a = request.m19597a();
                AbstractC20136n.m20961a(c17851dM19597a);
                return c16137f.m17695n(c17851dM19597a.m19596a());
            case 3:
                AbstractC16544l.m18094g(request, "request");
                return new C2219z0(new C20135m(c16137f, request, null));
            default:
                AbstractC16544l.m18094g(request, "request");
                return c16137f.m17695n(request);
        }
    }
}
