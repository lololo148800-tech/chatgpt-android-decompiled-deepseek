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
import sh.C19636n;

/* JADX INFO: renamed from: th.l */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19980l implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final List f63283Y = AbstractC17681o.m19382k("categoryStr", "categoryRanking");

    /* JADX INFO: renamed from: a */
    public static C19636n m20800a(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        String str = null;
        Integer num = null;
        while (true) {
            int iMo20558B0 = reader.mo20558B0(f63283Y);
            if (iMo20558B0 == 0) {
                str = (String) AbstractC17850c.f56903a.mo373j(reader, customScalarAdapters);
            } else {
                if (iMo20558B0 != 1) {
                    break;
                }
                num = (Integer) AbstractC17850c.f56908f.mo373j(reader, customScalarAdapters);
            }
        }
        if (str != null) {
            return new C19636n(num, str);
        }
        AbstractC9118D3.m9646a(reader, "categoryStr");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static void m20801b(InterfaceC19456f writer, C17867t customScalarAdapters, C19636n value) {
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("categoryStr");
        AbstractC17850c.f56903a.mo369f(writer, customScalarAdapters, value.f62278a);
        writer.mo20545M0("categoryRanking");
        AbstractC17850c.f56908f.mo369f(writer, customScalarAdapters, value.f62279b);
    }
}
