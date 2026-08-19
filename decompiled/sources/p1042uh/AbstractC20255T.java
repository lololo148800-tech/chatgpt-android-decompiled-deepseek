package p1042uh;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9118D3;
import p909nm.AbstractC17681o;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;

/* JADX INFO: renamed from: uh.T */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20255T implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final List f64071Y = AbstractC17681o.m19382k(ParameterNames.f31999ID, "type");

    /* JADX INFO: renamed from: a */
    public static C20289y m21021a(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int iMo20558B0 = reader.mo20558B0(f64071Y);
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
            return new C20289y(str, str2);
        }
        AbstractC9118D3.m9646a(reader, ParameterNames.f31999ID);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static void m21022b(InterfaceC19456f writer, C17867t customScalarAdapters, C20289y value) {
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0(ParameterNames.f31999ID);
        AbstractC17850c.f56903a.mo369f(writer, customScalarAdapters, value.f64151a);
        writer.mo20545M0("type");
        AbstractC17850c.f56907e.mo369f(writer, customScalarAdapters, value.f64152b);
    }
}
