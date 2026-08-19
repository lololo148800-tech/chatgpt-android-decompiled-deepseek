package th;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p138F8.vJO.anhfj;
import p160G5.p161rK.TVCuK;
import p571X9.AbstractC9118D3;
import p594Y9.C9895g4;
import p909nm.AbstractC17681o;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19629j0;
import sh.C19633l0;

/* JADX INFO: renamed from: th.V */
/* JADX INFO: loaded from: classes3.dex */
public final class C19966V implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19966V f63259Y = new C19966V();

    /* JADX INFO: renamed from: Z */
    public static final List f63260Z = AbstractC17681o.m19382k("pageInfo", anhfj.pMEacxWOcvG);

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19629j0 value = (C19629j0) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("pageInfo");
        AbstractC17850c.m19594b(C19968X.f63263Y, false).mo369f(writer, customScalarAdapters, value.f62259a);
        writer.mo20545M0("edges");
        AbstractC17850c.m19593a(new C9895g4(AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19965U.f63257Y, false)))).mo369f(writer, customScalarAdapters, value.f62260b);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        C19633l0 c19633l0 = null;
        List list = null;
        while (true) {
            int iMo20558B0 = reader.mo20558B0(f63260Z);
            if (iMo20558B0 == 0) {
                c19633l0 = (C19633l0) AbstractC17850c.m19594b(C19968X.f63263Y, false).mo373j(reader, customScalarAdapters);
            } else {
                if (iMo20558B0 != 1) {
                    break;
                }
                list = (List) AbstractC17850c.m19593a(new C9895g4(AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19965U.f63257Y, false)))).mo373j(reader, customScalarAdapters);
            }
        }
        if (c19633l0 != null) {
            return new C19629j0(c19633l0, list);
        }
        AbstractC9118D3.m9646a(reader, TVCuK.ODrFHUP);
        throw null;
    }
}
