package th;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9393x3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19610a;
import sh.C19612b;

/* JADX INFO: renamed from: th.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C19969a implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19969a f63265Y = new C19969a();

    /* JADX INFO: renamed from: Z */
    public static final List f63266Z = AbstractC9393x3.m9974d("gizmoLegacy");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19610a value = (C19610a) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("gizmoLegacy");
        AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19970b.f63267Y, true)).mo369f(writer, customScalarAdapters, value.f62230a);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        C19612b c19612b = null;
        while (reader.mo20558B0(f63266Z) == 0) {
            c19612b = (C19612b) AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19970b.f63267Y, true)).mo373j(reader, customScalarAdapters);
        }
        return new C19610a(c19612b);
    }
}
