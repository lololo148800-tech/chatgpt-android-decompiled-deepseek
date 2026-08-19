package p086D6;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16556x;
import kotlin.jvm.internal.C16558z;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p826j6.C16137F;
import p917o6.C17852e;

/* JADX INFO: renamed from: D6.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1967k implements InterfaceC1957a {
    @Override // p086D6.InterfaceC1957a
    /* JADX INFO: renamed from: a */
    public final InterfaceC2184i mo3140a(C17852e request, C16137F c16137f) {
        AbstractC16544l.m18094g(request, "request");
        Boolean bool = request.f56930j;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = request.f56929i;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        if (!zBooleanValue && !zBooleanValue2) {
            return c16137f.m17695n(request);
        }
        C16558z c16558z = new C16558z();
        int i10 = AbstractC1973q.f5838a;
        C16556x c16556x = new C16556x();
        c16556x.f51285Y = true;
        return new C1970n(new C1970n(new C2219z0(new C1972p(new C1970n(new C2219z0(new C1968l(c16556x, request, null)), 0, new C1964h(zBooleanValue, this, request, c16137f, null)), null)), 5, new C1965i(zBooleanValue2, c16558z, null)), 2, new C1966j(c16558z, this, null));
    }
}
