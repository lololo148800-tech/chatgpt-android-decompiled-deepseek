package th;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9393x3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19624h;
import sh.C19632l;

/* JADX INFO: renamed from: th.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C19974f implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19974f f63274Y = new C19974f();

    /* JADX INFO: renamed from: Z */
    public static final List f63275Z = AbstractC9393x3.m9974d("gizmoAboutLegacy");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19624h value = (C19624h) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("gizmoAboutLegacy");
        AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19978j.f63280Y, false)).mo369f(writer, customScalarAdapters, value.f62250a);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        C19632l c19632l = null;
        while (reader.mo20558B0(f63275Z) == 0) {
            c19632l = (C19632l) AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19978j.f63280Y, false)).mo373j(reader, customScalarAdapters);
        }
        return new C19624h(c19632l);
    }
}
