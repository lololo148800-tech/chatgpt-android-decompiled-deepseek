package p1042uh;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9118D3;
import p909nm.AbstractC17681o;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;

/* JADX INFO: renamed from: uh.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20265b0 implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C20265b0 f64094Y = new C20265b0();

    /* JADX INFO: renamed from: Z */
    public static final List f64095Z = AbstractC17681o.m19382k(DiagnosticsEntry.NAME_KEY, "profilePictureUrl");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C20261Z value = (C20261Z) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0(DiagnosticsEntry.NAME_KEY);
        AbstractC17850c.f56903a.mo369f(writer, customScalarAdapters, value.f64081a);
        writer.mo20545M0("profilePictureUrl");
        AbstractC17850c.f56907e.mo369f(writer, customScalarAdapters, value.f64082b);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int iMo20558B0 = reader.mo20558B0(f64095Z);
            if (iMo20558B0 == 0) {
                str = (String) AbstractC17850c.f56903a.mo373j(reader, customScalarAdapters);
            } else {
                if (iMo20558B0 != 1) {
                    break;
                }
                str2 = (String) AbstractC17850c.f56907e.mo373j(reader, customScalarAdapters);
            }
        }
        if (str != null) {
            return new C20261Z(str, str2);
        }
        AbstractC9118D3.m9646a(reader, DiagnosticsEntry.NAME_KEY);
        throw null;
    }
}
