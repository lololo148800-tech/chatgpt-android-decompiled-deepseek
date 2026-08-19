package p1042uh;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p138F8.vJO.vRJidSveZHcTw;
import p571X9.AbstractC9118D3;
import p909nm.AbstractC17681o;
import p917o6.AbstractC17850c;
import p917o6.C17839G;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sj.hJY.CsqksqyPE;

/* JADX INFO: renamed from: uh.S */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20254S implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final List f64070Y = AbstractC17681o.m19382k(ParameterNames.f31999ID, "fileId", DiagnosticsEntry.NAME_KEY, "type");

    /* JADX INFO: renamed from: a */
    public static C20288x m21019a(InterfaceC19455e reader, C17867t c17867t) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(c17867t, vRJidSveZHcTw.vlsyDrTsJ);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int iMo20558B0 = reader.mo20558B0(f64070Y);
            if (iMo20558B0 == 0) {
                str = (String) AbstractC17850c.f56903a.mo373j(reader, c17867t);
            } else if (iMo20558B0 == 1) {
                str2 = (String) AbstractC17850c.f56907e.mo373j(reader, c17867t);
            } else if (iMo20558B0 == 2) {
                str3 = (String) AbstractC17850c.f56907e.mo373j(reader, c17867t);
            } else {
                if (iMo20558B0 != 3) {
                    break;
                }
                str4 = (String) AbstractC17850c.f56907e.mo373j(reader, c17867t);
            }
        }
        if (str != null) {
            return new C20288x(str, str2, str3, str4);
        }
        AbstractC9118D3.m9646a(reader, ParameterNames.f31999ID);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static void m21020b(InterfaceC19456f writer, C17867t customScalarAdapters, C20288x value) {
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0(ParameterNames.f31999ID);
        AbstractC17850c.f56903a.mo369f(writer, customScalarAdapters, value.f64147a);
        writer.mo20545M0("fileId");
        C17839G c17839g = AbstractC17850c.f56907e;
        c17839g.mo369f(writer, customScalarAdapters, value.f64148b);
        writer.mo20545M0(DiagnosticsEntry.NAME_KEY);
        c17839g.mo369f(writer, customScalarAdapters, value.f64149c);
        writer.mo20545M0(CsqksqyPE.zQlktZJZvg);
        c17839g.mo369f(writer, customScalarAdapters, value.f64150d);
    }
}
