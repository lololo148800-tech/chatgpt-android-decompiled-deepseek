package p1042uh;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p1107xh.EnumC21226P;
import p571X9.AbstractC9118D3;
import p909nm.AbstractC17681o;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;

/* JADX INFO: renamed from: uh.Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C20253Q implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C20253Q f64068Y = new C20253Q();

    /* JADX INFO: renamed from: Z */
    public static final List f64069Z = AbstractC17681o.m19382k(ParameterNames.f31999ID, "type", "metadata");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C20287w value = (C20287w) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0(ParameterNames.f31999ID);
        AbstractC17850c.f56903a.mo369f(writer, customScalarAdapters, value.f64144a);
        writer.mo20545M0("type");
        writer.mo20544L(value.f64145b.f67529Y);
        writer.mo20545M0("metadata");
        AbstractC17850c.m19593a(AbstractC17850c.m19594b(C20252P.f64066Y, false)).mo369f(writer, customScalarAdapters, value.f64146c);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        Object next;
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        String str = null;
        EnumC21226P enumC21226P = null;
        C20286v c20286v = null;
        while (true) {
            int iMo20558B0 = reader.mo20558B0(f64069Z);
            if (iMo20558B0 == 0) {
                str = (String) AbstractC17850c.f56903a.mo373j(reader, customScalarAdapters);
            } else if (iMo20558B0 == 1) {
                String strMo20582x = reader.mo20582x();
                AbstractC16544l.m18091d(strMo20582x);
                EnumC21226P.f67524Z.getClass();
                Iterator it = EnumC21226P.f67528r0.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((EnumC21226P) next).f67529Y.equals(strMo20582x));
                EnumC21226P enumC21226P2 = (EnumC21226P) next;
                enumC21226P = enumC21226P2 == null ? EnumC21226P.UNKNOWN__ : enumC21226P2;
            } else {
                if (iMo20558B0 != 2) {
                    break;
                }
                c20286v = (C20286v) AbstractC17850c.m19593a(AbstractC17850c.m19594b(C20252P.f64066Y, false)).mo373j(reader, customScalarAdapters);
            }
        }
        if (str == null) {
            AbstractC9118D3.m9646a(reader, ParameterNames.f31999ID);
            throw null;
        }
        if (enumC21226P != null) {
            return new C20287w(str, enumC21226P, c20286v);
        }
        AbstractC9118D3.m9646a(reader, "type");
        throw null;
    }
}
