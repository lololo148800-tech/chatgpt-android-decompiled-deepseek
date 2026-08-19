package th;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p1107xh.EnumC21212B;
import p1129yh.C21541a;
import p571X9.AbstractC9118D3;
import p909nm.AbstractC17681o;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19615c0;
import sh.C19621f0;

/* JADX INFO: renamed from: th.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C19963S implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19963S f63253Y = new C19963S();

    /* JADX INFO: renamed from: Z */
    public static final List f63254Z = AbstractC17681o.m19382k("actionId", "oauthStatus", "actionSettings");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19621f0 value = (C19621f0) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("actionId");
        AbstractC17850c.f56903a.mo369f(writer, customScalarAdapters, value.f62246a);
        writer.mo20545M0("oauthStatus");
        AbstractC17850c.m19593a(C21541a.f68230q0).mo369f(writer, customScalarAdapters, value.f62247b);
        writer.mo20545M0("actionSettings");
        AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19960O.f63247Y, false)).mo369f(writer, customScalarAdapters, value.f62248c);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        String str = null;
        EnumC21212B enumC21212B = null;
        C19615c0 c19615c0 = null;
        while (true) {
            int iMo20558B0 = reader.mo20558B0(f63254Z);
            if (iMo20558B0 == 0) {
                str = (String) AbstractC17850c.f56903a.mo373j(reader, customScalarAdapters);
            } else if (iMo20558B0 == 1) {
                enumC21212B = (EnumC21212B) AbstractC17850c.m19593a(C21541a.f68230q0).mo373j(reader, customScalarAdapters);
            } else {
                if (iMo20558B0 != 2) {
                    break;
                }
                c19615c0 = (C19615c0) AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19960O.f63247Y, false)).mo373j(reader, customScalarAdapters);
            }
        }
        if (str != null) {
            return new C19621f0(str, enumC21212B, c19615c0);
        }
        AbstractC9118D3.m9646a(reader, "actionId");
        throw null;
    }
}
