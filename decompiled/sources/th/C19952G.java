package th;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9393x3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19601Q;
import sh.C19603T;

/* JADX INFO: renamed from: th.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C19952G implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19952G f63231Y = new C19952G();

    /* JADX INFO: renamed from: Z */
    public static final List f63232Z = AbstractC9393x3.m9974d("gizmoSearch");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19601Q value = (C19601Q) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("gizmoSearch");
        AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19954I.f63235Y, false)).mo369f(writer, customScalarAdapters, value.f62215a);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        C19603T c19603t = null;
        while (reader.mo20558B0(f63232Z) == 0) {
            c19603t = (C19603T) AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19954I.f63235Y, false)).mo373j(reader, customScalarAdapters);
        }
        return new C19601Q(c19603t);
    }
}
