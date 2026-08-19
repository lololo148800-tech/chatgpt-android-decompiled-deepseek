package th;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9118D3;
import p571X9.AbstractC9393x3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19645w;
import sh.C19646x;

/* JADX INFO: renamed from: th.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C19988t implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19988t f63295Y = new C19988t();

    /* JADX INFO: renamed from: Z */
    public static final List f63296Z = AbstractC9393x3.m9974d("gizmo");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19646x value = (C19646x) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("gizmo");
        AbstractC17850c.m19594b(C19987s.f63293Y, true).mo369f(writer, customScalarAdapters, value.f62298a);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        C19645w c19645w = null;
        while (reader.mo20558B0(f63296Z) == 0) {
            c19645w = (C19645w) AbstractC17850c.m19594b(C19987s.f63293Y, true).mo373j(reader, customScalarAdapters);
        }
        if (c19645w != null) {
            return new C19646x(c19645w);
        }
        AbstractC9118D3.m9646a(reader, "gizmo");
        throw null;
    }
}
