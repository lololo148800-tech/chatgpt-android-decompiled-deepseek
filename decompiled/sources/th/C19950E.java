package th;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9393x3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19598N;
import sh.C19599O;

/* JADX INFO: renamed from: th.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C19950E implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19950E f63227Y = new C19950E();

    /* JADX INFO: renamed from: Z */
    public static final List f63228Z = AbstractC9393x3.m9974d("gizmoOauthRedirectLegacy");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19598N value = (C19598N) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("gizmoOauthRedirectLegacy");
        AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19951F.f63229Y, false)).mo369f(writer, customScalarAdapters, value.f62209a);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        C19599O c19599o = null;
        while (reader.mo20558B0(f63228Z) == 0) {
            c19599o = (C19599O) AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19951F.f63229Y, false)).mo373j(reader, customScalarAdapters);
        }
        return new C19598N(c19599o);
    }
}
