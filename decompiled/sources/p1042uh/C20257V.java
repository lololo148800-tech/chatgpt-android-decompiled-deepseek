package p1042uh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9393x3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;

/* JADX INFO: renamed from: uh.V */
/* JADX INFO: loaded from: classes3.dex */
public final class C20257V implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C20257V f64073Y = new C20257V();

    /* JADX INFO: renamed from: Z */
    public static final List f64074Z = AbstractC9393x3.m9974d("attachments");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C20237A value = (C20237A) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("attachments");
        AbstractC17850c.m19593a(AbstractC17850c.m19594b(C20242F.f64050Y, false)).mo369f(writer, customScalarAdapters, value.f64031a);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        C20277m c20277m = null;
        while (reader.mo20558B0(f64074Z) == 0) {
            c20277m = (C20277m) AbstractC17850c.m19593a(AbstractC17850c.m19594b(C20242F.f64050Y, false)).mo373j(reader, customScalarAdapters);
        }
        return new C20237A(c20277m);
    }
}
