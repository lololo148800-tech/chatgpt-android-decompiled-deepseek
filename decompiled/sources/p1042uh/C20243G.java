package p1042uh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p1107xh.EnumC21225O;
import p1129yh.C21541a;
import p571X9.AbstractC9393x3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;

/* JADX INFO: renamed from: uh.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C20243G implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C20243G f64052Y = new C20243G();

    /* JADX INFO: renamed from: Z */
    public static final List f64053Z = AbstractC9393x3.m9974d("type");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C20278n value = (C20278n) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("type");
        AbstractC17850c.m19593a(C21541a.f68232s0).mo369f(writer, customScalarAdapters, value.f64119a);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        EnumC21225O enumC21225O = null;
        while (reader.mo20558B0(f64053Z) == 0) {
            enumC21225O = (EnumC21225O) AbstractC17850c.m19593a(C21541a.f68232s0).mo373j(reader, customScalarAdapters);
        }
        return new C20278n(enumC21225O);
    }
}
