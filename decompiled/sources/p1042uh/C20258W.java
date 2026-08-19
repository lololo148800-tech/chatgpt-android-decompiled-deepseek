package p1042uh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9393x3;
import p594Y9.C9895g4;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;

/* JADX INFO: renamed from: uh.W */
/* JADX INFO: loaded from: classes3.dex */
public final class C20258W implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C20258W f64075Y = new C20258W();

    /* JADX INFO: renamed from: Z */
    public static final List f64076Z = AbstractC9393x3.m9974d("edges");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C20238B value = (C20238B) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("edges");
        AbstractC17850c.m19593a(new C9895g4(AbstractC17850c.m19593a(AbstractC17850c.m19594b(C20247K.f64060Y, false)))).mo369f(writer, customScalarAdapters, value.f64032a);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        List list = null;
        while (reader.mo20558B0(f64076Z) == 0) {
            list = (List) AbstractC17850c.m19593a(new C9895g4(AbstractC17850c.m19593a(AbstractC17850c.m19594b(C20247K.f64060Y, false)))).mo373j(reader, customScalarAdapters);
        }
        return new C20238B(list);
    }
}
