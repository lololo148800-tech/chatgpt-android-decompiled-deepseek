package th;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9118D3;
import p909nm.AbstractC17681o;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19605V;

/* JADX INFO: renamed from: th.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C19956K implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19956K f63239Y = new C19956K();

    /* JADX INFO: renamed from: Z */
    public static final List f63240Z = AbstractC17681o.m19382k("endCursor", "hasNextPage");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19605V value = (C19605V) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("endCursor");
        AbstractC17850c.f56910h.mo369f(writer, customScalarAdapters, value.f62221a);
        writer.mo20545M0("hasNextPage");
        AbstractC17850c.f56905c.mo369f(writer, customScalarAdapters, Boolean.valueOf(value.f62222b));
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        Object objMo373j = null;
        Boolean bool = null;
        while (true) {
            int iMo20558B0 = reader.mo20558B0(f63240Z);
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
            return new C19605V(objMo373j, bool.booleanValue());
        }
        AbstractC9118D3.m9646a(reader, "hasNextPage");
        throw null;
    }
}
