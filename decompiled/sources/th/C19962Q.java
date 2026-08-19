package th;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0095w0;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p571X9.AbstractC9118D3;
import p571X9.AbstractC9393x3;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import sh.C19619e0;

/* JADX INFO: renamed from: th.Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C19962Q implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final C19962Q f63251Y = new C19962Q();

    /* JADX INFO: renamed from: Z */
    public static final List f63252Z = AbstractC9393x3.m9974d("settings");

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C19619e0 value = (C19619e0) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0("settings");
        C0095w0 c0095w0M19594b = AbstractC17850c.m19594b(C19963S.f63253Y, false);
        ArrayList arrayList = value.f62244a;
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
        ArrayList arrayList = null;
        while (reader.mo20558B0(f63252Z) == 0) {
            C0095w0 c0095w0M19594b = AbstractC17850c.m19594b(C19963S.f63253Y, false);
            reader.mo20581q();
            ArrayList arrayList2 = new ArrayList();
            while (reader.hasNext()) {
                arrayList2.add(c0095w0M19594b.mo373j(reader, customScalarAdapters));
            }
            reader.mo20580p();
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            return new C19619e0(arrayList);
        }
        AbstractC9118D3.m9646a(reader, "settings");
        throw null;
    }
}
