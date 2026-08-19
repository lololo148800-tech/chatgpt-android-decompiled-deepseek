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

/* JADX INFO: renamed from: uh.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20272h implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final List f64107Y = AbstractC17681o.m19382k(ParameterNames.INFO, "items");

    /* JADX INFO: renamed from: a */
    public static C20270f m21025a(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        C20264b c20264b = null;
        C20266c c20266c = null;
        while (true) {
            int iMo20558B0 = reader.mo20558B0(f64107Y);
            if (iMo20558B0 == 0) {
                c20264b = (C20264b) AbstractC17850c.m19594b(C20273i.f64108Y, false).mo373j(reader, customScalarAdapters);
            } else {
                if (iMo20558B0 != 1) {
                    break;
                }
                c20266c = (C20266c) AbstractC17850c.m19593a(AbstractC17850c.m19594b(C20274j.f64110Y, false)).mo373j(reader, customScalarAdapters);
            }
        }
        if (c20264b != null) {
            return new C20270f(c20264b, c20266c);
        }
        AbstractC9118D3.m9646a(reader, ParameterNames.INFO);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static void m21026b(InterfaceC19456f writer, C17867t customScalarAdapters, C20270f value) {
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0(ParameterNames.INFO);
        AbstractC17850c.m19594b(C20273i.f64108Y, false).mo369f(writer, customScalarAdapters, value.f64103a);
        writer.mo20545M0("items");
        AbstractC17850c.m19593a(AbstractC17850c.m19594b(C20274j.f64110Y, false)).mo369f(writer, customScalarAdapters, value.f64104b);
    }
}
