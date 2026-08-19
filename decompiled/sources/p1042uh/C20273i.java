package p1042uh;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p1107xh.EnumC21254q;
import p1129yh.C21541a;
import p571X9.AbstractC9118D3;
import p909nm.AbstractC17681o;
import p917o6.AbstractC17850c;
import p917o6.C17839G;
import p917o6.C17849b;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;

/* JADX INFO: renamed from: uh.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C20273i implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C20273i f64108Y = new C20273i();

    /* JADX INFO: renamed from: Z */
    public static final List f64109Z = AbstractC17681o.m19382k(ParameterNames.f31999ID, UiComponentConfig.Title.type, "description", "displayType", "displayGroup");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C20264b value = (C20264b) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0(ParameterNames.f31999ID);
        C17849b c17849b = AbstractC17850c.f56903a;
        c17849b.mo369f(writer, customScalarAdapters, value.f64089a);
        writer.mo20545M0(UiComponentConfig.Title.type);
        c17849b.mo369f(writer, customScalarAdapters, value.f64090b);
        writer.mo20545M0("description");
        C17839G c17839g = AbstractC17850c.f56907e;
        c17839g.mo369f(writer, customScalarAdapters, value.f64091c);
        writer.mo20545M0("displayType");
        AbstractC17850c.m19593a(C21541a.f68229p0).mo369f(writer, customScalarAdapters, value.f64092d);
        writer.mo20545M0("displayGroup");
        c17839g.mo369f(writer, customScalarAdapters, value.f64093e);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        EnumC21254q enumC21254q = null;
        String str4 = null;
        while (true) {
            int iMo20558B0 = reader.mo20558B0(f64109Z);
            if (iMo20558B0 == 0) {
                str = (String) AbstractC17850c.f56903a.mo373j(reader, customScalarAdapters);
            } else if (iMo20558B0 == 1) {
                str2 = (String) AbstractC17850c.f56903a.mo373j(reader, customScalarAdapters);
            } else if (iMo20558B0 == 2) {
                str3 = (String) AbstractC17850c.f56907e.mo373j(reader, customScalarAdapters);
            } else if (iMo20558B0 == 3) {
                enumC21254q = (EnumC21254q) AbstractC17850c.m19593a(C21541a.f68229p0).mo373j(reader, customScalarAdapters);
            } else {
                if (iMo20558B0 != 4) {
                    break;
                }
                str4 = (String) AbstractC17850c.f56907e.mo373j(reader, customScalarAdapters);
            }
        }
        if (str == null) {
            AbstractC9118D3.m9646a(reader, ParameterNames.f31999ID);
            throw null;
        }
        if (str2 != null) {
            return new C20264b(str, str2, str3, enumC21254q, str4);
        }
        AbstractC9118D3.m9646a(reader, UiComponentConfig.Title.type);
        throw null;
    }
}
