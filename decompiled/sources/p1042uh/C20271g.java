package p1042uh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9393x3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;

/* JADX INFO: renamed from: uh.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C20271g implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C20271g f64105Y = new C20271g();

    /* JADX INFO: renamed from: Z */
    public static final List f64106Z = AbstractC9393x3.m9974d("node");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C20262a value = (C20262a) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("node");
        AbstractC17850c.m19593a(AbstractC17850c.m19594b(C20275k.f64112Y, true)).mo369f(writer, customScalarAdapters, value.f64083a);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        C20268d c20268d = null;
        while (reader.mo20558B0(f64106Z) == 0) {
            c20268d = (C20268d) AbstractC17850c.m19593a(AbstractC17850c.m19594b(C20275k.f64112Y, true)).mo373j(reader, customScalarAdapters);
        }
        return new C20262a(c20268d);
    }
}
