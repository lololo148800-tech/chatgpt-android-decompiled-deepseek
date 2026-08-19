package th;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p1042uh.AbstractC20272h;
import p1042uh.C20270f;
import p571X9.AbstractC9118D3;
import p571X9.AbstractC9393x3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19585A;

/* JADX INFO: renamed from: th.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C19990v implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19990v f63299Y = new C19990v();

    /* JADX INFO: renamed from: Z */
    public static final List f63300Z = AbstractC9393x3.m9974d("__typename");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19585A value = (C19585A) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("__typename");
        AbstractC17850c.f56903a.mo369f(writer, customScalarAdapters, value.f62188a);
        List list = AbstractC20272h.f64107Y;
        AbstractC20272h.m21026b(writer, customScalarAdapters, value.f62189b);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        String str = null;
        while (reader.mo20558B0(f63300Z) == 0) {
            str = (String) AbstractC17850c.f56903a.mo373j(reader, customScalarAdapters);
        }
        reader.mo20560D0();
        C20270f c20270fM21025a = AbstractC20272h.m21025a(reader, customScalarAdapters);
        if (str != null) {
            return new C19585A(str, c20270fM21025a);
        }
        AbstractC9118D3.m9646a(reader, "__typename");
        throw null;
    }
}
