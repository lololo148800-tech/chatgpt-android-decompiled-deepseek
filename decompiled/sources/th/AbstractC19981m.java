package th;

import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9118D3;
import p909nm.AbstractC17681o;
import p917o6.AbstractC17850c;
import p917o6.C17849b;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19637o;

/* JADX INFO: renamed from: th.m */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19981m implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final List f63284Y = AbstractC17681o.m19382k(UiComponentConfig.Title.type, "subtitle");

    /* JADX INFO: renamed from: a */
    public static C19637o m20802a(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int iMo20558B0 = reader.mo20558B0(f63284Y);
            if (iMo20558B0 == 0) {
                str = (String) AbstractC17850c.f56903a.mo373j(reader, customScalarAdapters);
            } else {
                if (iMo20558B0 != 1) {
                    break;
                }
                str2 = (String) AbstractC17850c.f56903a.mo373j(reader, customScalarAdapters);
            }
        }
        if (str == null) {
            AbstractC9118D3.m9646a(reader, UiComponentConfig.Title.type);
            throw null;
        }
        if (str2 != null) {
            return new C19637o(str, str2);
        }
        AbstractC9118D3.m9646a(reader, "subtitle");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static void m20803b(InterfaceC19456f writer, C17867t customScalarAdapters, C19637o value) {
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0(UiComponentConfig.Title.type);
        C17849b c17849b = AbstractC17850c.f56903a;
        c17849b.mo369f(writer, customScalarAdapters, value.f62280a);
        writer.mo20545M0("subtitle");
        c17849b.mo369f(writer, customScalarAdapters, value.f62281b);
    }
}
