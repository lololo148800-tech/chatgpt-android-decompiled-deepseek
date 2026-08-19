package p1042uh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0095w0;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9118D3;
import p909nm.AbstractC17681o;
import p917o6.AbstractC17850c;
import p917o6.C17839G;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;

/* JADX INFO: renamed from: uh.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C20244H implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C20244H f64054Y = new C20244H();

    /* JADX INFO: renamed from: Z */
    public static final List f64055Z = AbstractC17681o.m19382k("displayName", "linkTo", "willReceiveSupportEmails", "displaySocials");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C20279o value = (C20279o) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("displayName");
        C17839G c17839g = AbstractC17850c.f56907e;
        c17839g.mo369f(writer, customScalarAdapters, value.f64120a);
        writer.mo20545M0("linkTo");
        c17839g.mo369f(writer, customScalarAdapters, value.f64121b);
        writer.mo20545M0("willReceiveSupportEmails");
        AbstractC17850c.f56909g.mo369f(writer, customScalarAdapters, value.f64122c);
        writer.mo20545M0("displaySocials");
        C0095w0 c0095w0M19594b = AbstractC17850c.m19594b(C20246J.f64058Y, false);
        ArrayList arrayList = value.f64123d;
        writer.mo20556q();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c0095w0M19594b.mo369f(writer, customScalarAdapters, it.next());
        }
        writer.mo20555p();
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        Boolean bool = null;
        ArrayList arrayList = null;
        while (true) {
            int iMo20558B0 = reader.mo20558B0(f64055Z);
            if (iMo20558B0 == 0) {
                str = (String) AbstractC17850c.f56907e.mo373j(reader, customScalarAdapters);
            } else if (iMo20558B0 == 1) {
                str2 = (String) AbstractC17850c.f56907e.mo373j(reader, customScalarAdapters);
            } else if (iMo20558B0 == 2) {
                bool = (Boolean) AbstractC17850c.f56909g.mo373j(reader, customScalarAdapters);
            } else {
                if (iMo20558B0 != 3) {
                    break;
                }
                C0095w0 c0095w0M19594b = AbstractC17850c.m19594b(C20246J.f64058Y, false);
                reader.mo20581q();
                ArrayList arrayList2 = new ArrayList();
                while (reader.hasNext()) {
                    arrayList2.add(c0095w0M19594b.mo373j(reader, customScalarAdapters));
                }
                reader.mo20580p();
                arrayList = arrayList2;
            }
        }
        if (arrayList != null) {
            return new C20279o(str, str2, bool, arrayList);
        }
        AbstractC9118D3.m9646a(reader, "displaySocials");
        throw null;
    }
}
