package p1042uh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p909nm.AbstractC17681o;
import p917o6.AbstractC17850c;
import p917o6.C17839G;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;

/* JADX INFO: renamed from: uh.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C20252P implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C20252P f64066Y = new C20252P();

    /* JADX INFO: renamed from: Z */
    public static final List f64067Z = AbstractC17681o.m19382k("actionId", "domain", "auth", "privacyPolicyUrl");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C20286v value = (C20286v) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("actionId");
        C17839G c17839g = AbstractC17850c.f56907e;
        c17839g.mo369f(writer, customScalarAdapters, value.f64140a);
        writer.mo20545M0("domain");
        c17839g.mo369f(writer, customScalarAdapters, value.f64141b);
        writer.mo20545M0("auth");
        AbstractC17850c.m19593a(AbstractC17850c.m19594b(C20243G.f64052Y, false)).mo369f(writer, customScalarAdapters, value.f64142c);
        writer.mo20545M0("privacyPolicyUrl");
        c17839g.mo369f(writer, customScalarAdapters, value.f64143d);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        C20278n c20278n = null;
        String str3 = null;
        while (true) {
            int iMo20558B0 = reader.mo20558B0(f64067Z);
            if (iMo20558B0 == 0) {
                str = (String) AbstractC17850c.f56907e.mo373j(reader, customScalarAdapters);
            } else if (iMo20558B0 == 1) {
                str2 = (String) AbstractC17850c.f56907e.mo373j(reader, customScalarAdapters);
            } else if (iMo20558B0 == 2) {
                c20278n = (C20278n) AbstractC17850c.m19593a(AbstractC17850c.m19594b(C20243G.f64052Y, false)).mo373j(reader, customScalarAdapters);
            } else {
                if (iMo20558B0 != 3) {
                    return new C20286v(str, str2, c20278n, str3);
                }
                str3 = (String) AbstractC17850c.f56907e.mo373j(reader, customScalarAdapters);
            }
        }
    }
}
