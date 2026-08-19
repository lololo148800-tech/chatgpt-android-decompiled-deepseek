package p1042uh;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p1107xh.EnumC21231V;
import p571X9.AbstractC9118D3;
import p909nm.AbstractC17681o;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;

/* JADX INFO: renamed from: uh.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C20246J implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C20246J f64058Y = new C20246J();

    /* JADX INFO: renamed from: Z */
    public static final List f64059Z = AbstractC17681o.m19382k("type", "displayName", "verified", "verifiedData");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C20281q value = (C20281q) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("type");
        writer.mo20544L(value.f64129a.f67539Y);
        writer.mo20545M0("displayName");
        AbstractC17850c.f56903a.mo369f(writer, customScalarAdapters, value.f64130b);
        writer.mo20545M0("verified");
        AbstractC17850c.f56905c.mo369f(writer, customScalarAdapters, Boolean.valueOf(value.f64131c));
        writer.mo20545M0("verifiedData");
        AbstractC17850c.m19594b(C20260Y.f64079Y, false).mo369f(writer, customScalarAdapters, value.f64132d);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        Object next;
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        EnumC21231V enumC21231V = null;
        String str = null;
        Boolean bool = null;
        C20240D c20240d = null;
        while (true) {
            int iMo20558B0 = reader.mo20558B0(f64059Z);
            if (iMo20558B0 == 0) {
                String strMo20582x = reader.mo20582x();
                AbstractC16544l.m18091d(strMo20582x);
                EnumC21231V.f67534Z.getClass();
                Iterator it = EnumC21231V.f67538r0.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((EnumC21231V) next).f67539Y.equals(strMo20582x));
                EnumC21231V enumC21231V2 = (EnumC21231V) next;
                enumC21231V = enumC21231V2 == null ? EnumC21231V.UNKNOWN__ : enumC21231V2;
            } else if (iMo20558B0 == 1) {
                str = (String) AbstractC17850c.f56903a.mo373j(reader, customScalarAdapters);
            } else if (iMo20558B0 == 2) {
                bool = (Boolean) AbstractC17850c.f56905c.mo373j(reader, customScalarAdapters);
            } else {
                if (iMo20558B0 != 3) {
                    break;
                }
                c20240d = (C20240D) AbstractC17850c.m19594b(C20260Y.f64079Y, false).mo373j(reader, customScalarAdapters);
            }
        }
        if (enumC21231V == null) {
            AbstractC9118D3.m9646a(reader, "type");
            throw null;
        }
        if (str == null) {
            AbstractC9118D3.m9646a(reader, "displayName");
            throw null;
        }
        if (bool == null) {
            AbstractC9118D3.m9646a(reader, "verified");
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        if (c20240d != null) {
            return new C20281q(enumC21231V, str, zBooleanValue, c20240d);
        }
        AbstractC9118D3.m9646a(reader, "verifiedData");
        throw null;
    }
}
