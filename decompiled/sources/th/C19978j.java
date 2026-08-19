package th;

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
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19626i;
import sh.C19632l;
import sh.C19640r;

/* JADX INFO: renamed from: th.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C19978j implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19978j f63280Y = new C19978j();

    /* JADX INFO: renamed from: Z */
    public static final List f63281Z = AbstractC17681o.m19382k("gizmo", "aboutBlocks", "reviewStats");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19632l value = (C19632l) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("gizmo");
        AbstractC17850c.m19594b(C19975g.f63276Y, true).mo369f(writer, customScalarAdapters, value.f62267a);
        writer.mo20545M0("aboutBlocks");
        C0095w0 c0095w0M19594b = AbstractC17850c.m19594b(C19973e.f63273Y, true);
        ArrayList arrayList = value.f62268b;
        writer.mo20556q();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c0095w0M19594b.mo369f(writer, customScalarAdapters, it.next());
        }
        writer.mo20555p();
        writer.mo20545M0("reviewStats");
        AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19984p.f63287Y, false)).mo369f(writer, customScalarAdapters, value.f62269c);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        C19626i c19626i = null;
        ArrayList arrayList = null;
        C19640r c19640r = null;
        while (true) {
            int iMo20558B0 = reader.mo20558B0(f63281Z);
            if (iMo20558B0 == 0) {
                c19626i = (C19626i) AbstractC17850c.m19594b(C19975g.f63276Y, true).mo373j(reader, customScalarAdapters);
            } else if (iMo20558B0 == 1) {
                C0095w0 c0095w0M19594b = AbstractC17850c.m19594b(C19973e.f63273Y, true);
                reader.mo20581q();
                ArrayList arrayList2 = new ArrayList();
                while (reader.hasNext()) {
                    arrayList2.add(c0095w0M19594b.mo373j(reader, customScalarAdapters));
                }
                reader.mo20580p();
                arrayList = arrayList2;
            } else {
                if (iMo20558B0 != 2) {
                    break;
                }
                c19640r = (C19640r) AbstractC17850c.m19593a(AbstractC17850c.m19594b(C19984p.f63287Y, false)).mo373j(reader, customScalarAdapters);
            }
        }
        if (c19626i == null) {
            AbstractC9118D3.m9646a(reader, "gizmo");
            throw null;
        }
        if (arrayList != null) {
            return new C19632l(c19626i, arrayList, c19640r);
        }
        AbstractC9118D3.m9646a(reader, "aboutBlocks");
        throw null;
    }
}
