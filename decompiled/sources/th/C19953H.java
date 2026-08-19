package th;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9393x3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19602S;
import sh.C19604U;

/* JADX INFO: renamed from: th.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C19953H implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19953H f63233Y = new C19953H();

    /* JADX INFO: renamed from: Z */
    public static final List f63234Z = AbstractC9393x3.m9974d("node");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19602S value = (C19602S) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("node");
        AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19955J.f63237Y, true)).mo369f(writer, customScalarAdapters, value.f62216a);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        C19604U c19604u = null;
        while (reader.mo20558B0(f63234Z) == 0) {
            c19604u = (C19604U) AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19955J.f63237Y, true)).mo373j(reader, customScalarAdapters);
        }
        return new C19602S(c19604u);
    }
}
