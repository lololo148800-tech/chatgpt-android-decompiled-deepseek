package th;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9118D3;
import p594Y9.C9895g4;
import p909nm.AbstractC17681o;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19603T;
import sh.C19605V;

/* JADX INFO: renamed from: th.I */
/* JADX INFO: loaded from: classes3.dex */
public final class C19954I implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19954I f63235Y = new C19954I();

    /* JADX INFO: renamed from: Z */
    public static final List f63236Z = AbstractC17681o.m19382k("pageInfo", "edges");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19603T value = (C19603T) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("pageInfo");
        AbstractC17850c.m19594b(C19956K.f63239Y, false).mo369f(writer, customScalarAdapters, value.f62217a);
        writer.mo20545M0("edges");
        AbstractC17850c.m19593a(new C9895g4(AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19953H.f63233Y, false)))).mo369f(writer, customScalarAdapters, value.f62218b);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        C19605V c19605v = null;
        List list = null;
        while (true) {
            int iMo20558B0 = reader.mo20558B0(f63236Z);
            if (iMo20558B0 == 0) {
                c19605v = (C19605V) AbstractC17850c.m19594b(C19956K.f63239Y, false).mo373j(reader, customScalarAdapters);
            } else {
                if (iMo20558B0 != 1) {
                    break;
                }
                list = (List) AbstractC17850c.m19593a(new C9895g4(AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19953H.f63233Y, false)))).mo373j(reader, customScalarAdapters);
            }
        }
        if (c19605v != null) {
            return new C19603T(c19605v, list);
        }
        AbstractC9118D3.m9646a(reader, "pageInfo");
        throw null;
    }
}
