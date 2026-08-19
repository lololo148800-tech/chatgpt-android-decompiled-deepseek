package th;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p1042uh.AbstractC20249M;
import p1042uh.C20241E;
import p571X9.AbstractC9118D3;
import p571X9.AbstractC9393x3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19604U;

/* JADX INFO: renamed from: th.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C19955J implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19955J f63237Y = new C19955J();

    /* JADX INFO: renamed from: Z */
    public static final List f63238Z = AbstractC9393x3.m9974d("__typename");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19604U value = (C19604U) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("__typename");
        AbstractC17850c.f56903a.mo369f(writer, customScalarAdapters, value.f62219a);
        List list = AbstractC20249M.f64063Y;
        AbstractC20249M.m21018b(writer, customScalarAdapters, value.f62220b);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e interfaceC19455e, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(interfaceC19455e, HJrCuD.gcfhbNvkl);
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        String str = null;
        while (interfaceC19455e.mo20558B0(f63238Z) == 0) {
            str = (String) AbstractC17850c.f56903a.mo373j(interfaceC19455e, customScalarAdapters);
        }
        interfaceC19455e.mo20560D0();
        C20241E c20241eM21017a = AbstractC20249M.m21017a(interfaceC19455e, customScalarAdapters);
        if (str != null) {
            return new C19604U(str, c20241eM21017a);
        }
        AbstractC9118D3.m9646a(interfaceC19455e, "__typename");
        throw null;
    }
}
