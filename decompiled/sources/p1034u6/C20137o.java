package p1034u6;

import kotlin.jvm.internal.AbstractC16544l;
import p086D6.InterfaceC1957a;
import p103Dn.InterfaceC2184i;
import p826j6.C16137F;
import p900n6.AbstractC17511h;
import p900n6.C17508e;
import p917o6.C17852e;
import p917o6.InterfaceC17835C;
import p917o6.InterfaceC17846N;

/* JADX INFO: renamed from: u6.o */
/* JADX INFO: loaded from: classes.dex */
public final class C20137o implements InterfaceC1957a, InterfaceC20123a {

    /* JADX INFO: renamed from: a */
    public static final C20137o f63786a = new C20137o();

    @Override // p086D6.InterfaceC1957a
    /* JADX INFO: renamed from: a */
    public final InterfaceC2184i mo3140a(C17852e request, C16137F c16137f) {
        AbstractC16544l.m18094g(request, "request");
        if (!(request.f56921a instanceof InterfaceC17846N)) {
            return c16137f.m17695n(request);
        }
        C17508e c17508e = AbstractC17511h.f56008a;
        InterfaceC17835C interfaceC17835C = request.f56923c;
        if (interfaceC17835C.mo4141d(c17508e) != null) {
            throw new ClassCastException();
        }
        C20129g c20129g = (C20129g) interfaceC17835C.mo4141d(C20129g.f63761b);
        return (c20129g != null ? c20129g.f63762a : AbstractC20136n.f63784b).mo3140a(request, c16137f);
    }
}
