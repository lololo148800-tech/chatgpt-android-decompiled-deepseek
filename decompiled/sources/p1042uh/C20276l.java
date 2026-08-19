package p1042uh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9118D3;
import p909nm.AbstractC17681o;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;

/* JADX INFO: renamed from: uh.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C20276l implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C20276l f64114Y = new C20276l();

    /* JADX INFO: renamed from: Z */
    public static final List f64115Z = AbstractC17681o.m19382k("endCursor", "hasNextPage");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C20269e value = (C20269e) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("endCursor");
        AbstractC17850c.f56910h.mo369f(writer, customScalarAdapters, value.f64101a);
        writer.mo20545M0("hasNextPage");
        AbstractC17850c.f56905c.mo369f(writer, customScalarAdapters, Boolean.valueOf(value.f64102b));
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        Object objMo373j = null;
        Boolean bool = null;
        while (true) {
            int iMo20558B0 = reader.mo20558B0(f64115Z);
            if (iMo20558B0 == 0) {
                objMo373j = AbstractC17850c.f56910h.mo373j(reader, customScalarAdapters);
            } else {
                if (iMo20558B0 != 1) {
                    break;
                }
                bool = (Boolean) AbstractC17850c.f56905c.mo373j(reader, customScalarAdapters);
            }
        }
        if (bool != null) {
            return new C20269e(objMo373j, bool.booleanValue());
        }
        AbstractC9118D3.m9646a(reader, "hasNextPage");
        throw null;
    }
}
