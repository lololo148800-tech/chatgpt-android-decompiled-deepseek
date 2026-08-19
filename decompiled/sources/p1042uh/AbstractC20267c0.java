package p1042uh;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p1129yh.C21541a;
import p571X9.AbstractC9118D3;
import p909nm.AbstractC17681o;
import p917o6.AbstractC17850c;
import p917o6.C17849b;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;

/* JADX INFO: renamed from: uh.c0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20267c0 implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final List f64098Y = AbstractC17681o.m19382k(ParameterNames.f31999ID, "legacyId", "display", "tags", "gizmoType");

    /* JADX INFO: renamed from: a */
    public static C20263a0 m21023a(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        C20261Z c20261z = null;
        ArrayList arrayList = null;
        String str3 = null;
        while (true) {
            int iMo20558B0 = reader.mo20558B0(f64098Y);
            if (iMo20558B0 == 0) {
                str = (String) AbstractC17850c.f56903a.mo373j(reader, customScalarAdapters);
            } else if (iMo20558B0 == 1) {
                str2 = (String) AbstractC17850c.f56903a.mo373j(reader, customScalarAdapters);
            } else if (iMo20558B0 == 2) {
                c20261z = (C20261Z) AbstractC17850c.m19594b(C20265b0.f64094Y, false).mo373j(reader, customScalarAdapters);
            } else if (iMo20558B0 == 3) {
                C21541a c21541a = C21541a.f68231r0;
                C17849b c17849b = AbstractC17850c.f56903a;
                reader.mo20581q();
                arrayList = new ArrayList();
                while (reader.hasNext()) {
                    arrayList.add(c21541a.mo373j(reader, customScalarAdapters));
                }
                reader.mo20580p();
            } else {
                if (iMo20558B0 != 4) {
                    break;
                }
                str3 = (String) AbstractC17850c.f56907e.mo373j(reader, customScalarAdapters);
            }
        }
        if (str == null) {
            AbstractC9118D3.m9646a(reader, ParameterNames.f31999ID);
            throw null;
        }
        if (str2 == null) {
            AbstractC9118D3.m9646a(reader, "legacyId");
            throw null;
        }
        if (c20261z == null) {
            AbstractC9118D3.m9646a(reader, "display");
            throw null;
        }
        if (arrayList != null) {
            return new C20263a0(str, str2, c20261z, arrayList, str3);
        }
        AbstractC9118D3.m9646a(reader, "tags");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static void m21024b(InterfaceC19456f writer, C17867t customScalarAdapters, C20263a0 value) {
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0(ParameterNames.f31999ID);
        C17849b c17849b = AbstractC17850c.f56903a;
        c17849b.mo369f(writer, customScalarAdapters, value.f64084a);
        writer.mo20545M0("legacyId");
        c17849b.mo369f(writer, customScalarAdapters, value.f64085b);
        writer.mo20545M0("display");
        AbstractC17850c.m19594b(C20265b0.f64094Y, false).mo369f(writer, customScalarAdapters, value.f64086c);
        writer.mo20545M0("tags");
        C21541a c21541a = C21541a.f68231r0;
        ArrayList arrayList = value.f64087d;
        writer.mo20556q();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c21541a.mo369f(writer, customScalarAdapters, it.next());
        }
        writer.mo20555p();
        writer.mo20545M0("gizmoType");
        AbstractC17850c.f56907e.mo369f(writer, customScalarAdapters, value.f64088e);
    }
}
