package p086D6;

import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p826j6.C16137F;
import p917o6.C17851d;
import p917o6.C17852e;
import p917o6.InterfaceC17838F;
import p942p6.EnumC18300d;

/* JADX INFO: renamed from: D6.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1961e implements InterfaceC1957a {

    /* JADX INFO: renamed from: a */
    public final EnumC18300d f5806a;

    /* JADX INFO: renamed from: b */
    public final EnumC18300d f5807b;

    public C1961e(EnumC18300d enumC18300d, EnumC18300d enumC18300d2) {
        this.f5806a = enumC18300d;
        this.f5807b = enumC18300d2;
    }

    @Override // p086D6.InterfaceC1957a
    /* JADX INFO: renamed from: a */
    public final InterfaceC2184i mo3140a(C17852e request, C16137F c16137f) {
        AbstractC16544l.m18094g(request, "request");
        Boolean bool = request.f56928h;
        if (!(bool != null ? bool.booleanValue() : true)) {
            return c16137f.m17695n(request);
        }
        boolean z6 = request.f56921a instanceof InterfaceC17838F;
        C17851d c17851dM19597a = request.m19597a();
        c17851dM19597a.f56914d = z6 ? EnumC18300d.f58414Z : this.f5806a;
        c17851dM19597a.f56918h = Boolean.FALSE;
        c17851dM19597a.f56917g = Boolean.TRUE;
        return new C2219z0(new C1960d(c16137f, c17851dM19597a.m19596a(), this, z6, null));
    }
}
