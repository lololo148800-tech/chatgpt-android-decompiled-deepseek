package th;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9393x3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19592H;
import sh.C19593I;

/* JADX INFO: renamed from: th.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C19946A implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19946A f63219Y = new C19946A();

    /* JADX INFO: renamed from: Z */
    public static final List f63220Z = AbstractC9393x3.m9974d("gizmoDiscovery");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19592H value = (C19592H) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("gizmoDiscovery");
        AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19947B.f63221Y, false)).mo369f(writer, customScalarAdapters, value.f62202a);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        C19593I c19593i = null;
        while (reader.mo20558B0(f63220Z) == 0) {
            c19593i = (C19593I) AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19947B.f63221Y, false)).mo373j(reader, customScalarAdapters);
        }
        return new C19592H(c19593i);
    }
}
