package th;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9393x3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19595K;
import sh.C19596L;

/* JADX INFO: renamed from: th.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C19948C implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19948C f63223Y = new C19948C();

    /* JADX INFO: renamed from: Z */
    public static final List f63224Z = AbstractC9393x3.m9974d("gizmoGetReviewLegacy");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19595K value = (C19595K) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("gizmoGetReviewLegacy");
        AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19949D.f63225Y, false)).mo369f(writer, customScalarAdapters, value.f62206a);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        C19596L c19596l = null;
        while (reader.mo20558B0(f63224Z) == 0) {
            c19596l = (C19596L) AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19949D.f63225Y, false)).mo373j(reader, customScalarAdapters);
        }
        return new C19595K(c19596l);
    }
}
