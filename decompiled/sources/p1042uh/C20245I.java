package p1042uh;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9118D3;
import p594Y9.C9895g4;
import p909nm.AbstractC17681o;
import p917o6.AbstractC17850c;
import p917o6.C17839G;
import p917o6.C17849b;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;

/* JADX INFO: renamed from: uh.I */
/* JADX INFO: loaded from: classes3.dex */
public final class C20245I implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C20245I f64056Y = new C20245I();

    /* JADX INFO: renamed from: Z */
    public static final List f64057Z = AbstractC17681o.m19382k(DiagnosticsEntry.NAME_KEY, "description", "theme", "profilePictureUrl", "promptStarters");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C20280p value = (C20280p) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0(DiagnosticsEntry.NAME_KEY);
        C17849b c17849b = AbstractC17850c.f56903a;
        c17849b.mo369f(writer, customScalarAdapters, value.f64124a);
        writer.mo20545M0("description");
        C17839G c17839g = AbstractC17850c.f56907e;
        c17839g.mo369f(writer, customScalarAdapters, value.f64125b);
        writer.mo20545M0("theme");
        c17839g.mo369f(writer, customScalarAdapters, value.f64126c);
        writer.mo20545M0("profilePictureUrl");
        c17839g.mo369f(writer, customScalarAdapters, value.f64127d);
        writer.mo20545M0("promptStarters");
        AbstractC17850c.m19593a(new C9895g4(c17849b)).mo369f(writer, customScalarAdapters, value.f64128e);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        while (true) {
            int iMo20558B0 = reader.mo20558B0(f64057Z);
            if (iMo20558B0 == 0) {
                str = (String) AbstractC17850c.f56903a.mo373j(reader, customScalarAdapters);
            } else if (iMo20558B0 == 1) {
                str2 = (String) AbstractC17850c.f56907e.mo373j(reader, customScalarAdapters);
            } else if (iMo20558B0 == 2) {
                str3 = (String) AbstractC17850c.f56907e.mo373j(reader, customScalarAdapters);
            } else if (iMo20558B0 == 3) {
                str4 = (String) AbstractC17850c.f56907e.mo373j(reader, customScalarAdapters);
            } else {
                if (iMo20558B0 != 4) {
                    break;
                }
                list = (List) AbstractC17850c.m19593a(new C9895g4(AbstractC17850c.f56903a)).mo373j(reader, customScalarAdapters);
            }
        }
        if (str != null) {
            return new C20280p(str, str2, str3, str4, list);
        }
        AbstractC9118D3.m9646a(reader, DiagnosticsEntry.NAME_KEY);
        throw null;
    }
}
