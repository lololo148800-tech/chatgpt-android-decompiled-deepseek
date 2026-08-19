package th;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9393x3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19627i0;
import sh.C19631k0;

/* JADX INFO: renamed from: th.U */
/* JADX INFO: loaded from: classes3.dex */
public final class C19965U implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19965U f63257Y = new C19965U();

    /* JADX INFO: renamed from: Z */
    public static final List f63258Z = AbstractC9393x3.m9974d("node");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19627i0 value = (C19627i0) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("node");
        AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19967W.f63261Y, true)).mo369f(writer, customScalarAdapters, value.f62254a);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        C19631k0 c19631k0 = null;
        while (reader.mo20558B0(f63258Z) == 0) {
            c19631k0 = (C19631k0) AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19967W.f63261Y, true)).mo373j(reader, customScalarAdapters);
        }
        return new C19627i0(c19631k0);
    }
}
