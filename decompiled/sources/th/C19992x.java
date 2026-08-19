package th;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9393x3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19588D;
import sh.C19589E;

/* JADX INFO: renamed from: th.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C19992x implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19992x f63303Y = new C19992x();

    /* JADX INFO: renamed from: Z */
    public static final List f63304Z = AbstractC9393x3.m9974d("gizmoDiscoveryForViewer");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19588D value = (C19588D) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("gizmoDiscoveryForViewer");
        AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19993y.f63305Y, false)).mo369f(writer, customScalarAdapters, value.f62196a);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        C19589E c19589e = null;
        while (reader.mo20558B0(f63304Z) == 0) {
            c19589e = (C19589E) AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19993y.f63305Y, false)).mo373j(reader, customScalarAdapters);
        }
        return new C19588D(c19589e);
    }
}
