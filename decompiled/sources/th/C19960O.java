package th;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p1107xh.EnumC21249l;
import p1129yh.C21541a;
import p548Wd.p549VF.zakks;
import p571X9.AbstractC9393x3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19615c0;

/* JADX INFO: renamed from: th.O */
/* JADX INFO: loaded from: classes3.dex */
public final class C19960O implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19960O f63247Y = new C19960O();

    /* JADX INFO: renamed from: Z */
    public static final List f63248Z = AbstractC9393x3.m9974d("all");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19615c0 value = (C19615c0) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("all");
        AbstractC17850c.m19593a(C21541a.f68227Z).mo369f(writer, customScalarAdapters, value.f62239a);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t c17867t) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(c17867t, zakks.QgcKZtQfxsXX);
        EnumC21249l enumC21249l = null;
        while (reader.mo20558B0(f63248Z) == 0) {
            enumC21249l = (EnumC21249l) AbstractC17850c.m19593a(C21541a.f68227Z).mo373j(reader, c17867t);
        }
        return new C19615c0(enumC21249l);
    }
}
