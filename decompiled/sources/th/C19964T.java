package th;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9393x3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19625h0;
import sh.C19629j0;

/* JADX INFO: renamed from: th.T */
/* JADX INFO: loaded from: classes3.dex */
public final class C19964T implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19964T f63255Y = new C19964T();

    /* JADX INFO: renamed from: Z */
    public static final List f63256Z = AbstractC9393x3.m9974d("gizmoWithMemory");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19625h0 value = (C19625h0) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("gizmoWithMemory");
        AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19966V.f63259Y, false)).mo369f(writer, customScalarAdapters, value.f62251a);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        C19629j0 c19629j0 = null;
        while (reader.mo20558B0(f63256Z) == 0) {
            c19629j0 = (C19629j0) AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19966V.f63259Y, false)).mo373j(reader, customScalarAdapters);
        }
        return new C19625h0(c19629j0);
    }
}
