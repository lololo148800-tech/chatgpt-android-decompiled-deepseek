package p1042uh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p909nm.AbstractC17681o;
import p917o6.AbstractC17850c;
import p917o6.C17839G;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;

/* JADX INFO: renamed from: uh.Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C20260Y implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C20260Y f64079Y = new C20260Y();

    /* JADX INFO: renamed from: Z */
    public static final List f64080Z = AbstractC17681o.m19382k("username", "linkTo");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C20240D value = (C20240D) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("username");
        C17839G c17839g = AbstractC17850c.f56907e;
        c17839g.mo369f(writer, customScalarAdapters, value.f64034a);
        writer.mo20545M0("linkTo");
        c17839g.mo369f(writer, customScalarAdapters, value.f64035b);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int iMo20558B0 = reader.mo20558B0(f64080Z);
            if (iMo20558B0 == 0) {
                str = (String) AbstractC17850c.f56907e.mo373j(reader, customScalarAdapters);
            } else {
                if (iMo20558B0 != 1) {
                    return new C20240D(str, str2);
                }
                str2 = (String) AbstractC17850c.f56907e.mo373j(reader, customScalarAdapters);
            }
        }
    }
}
