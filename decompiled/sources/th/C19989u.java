package th;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9393x3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19585A;
import sh.C19648z;

/* JADX INFO: renamed from: th.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C19989u implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19989u f63297Y = new C19989u();

    /* JADX INFO: renamed from: Z */
    public static final List f63298Z = AbstractC9393x3.m9974d("gizmoDiscoveryCut");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19648z value = (C19648z) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("gizmoDiscoveryCut");
        AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19990v.f63299Y, true)).mo369f(writer, customScalarAdapters, value.f62299a);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        C19585A c19585a = null;
        while (reader.mo20558B0(f63298Z) == 0) {
            c19585a = (C19585A) AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19990v.f63299Y, true)).mo373j(reader, customScalarAdapters);
        }
        return new C19648z(c19585a);
    }
}
