package ki;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p229J0.C4108p0;
import p349O0.AbstractC6012k0;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p382Pf.C6401d;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p588Y2.C9642z;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: ki.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16421b {

    /* JADX INFO: renamed from: a */
    public static final C5984W0 f50950a = new C5984W0(C16420a.f50949Y);

    /* JADX INFO: renamed from: a */
    public static final void m18008a(Object[] components, C8410b c8410b, C6021p c6021p, int i10) {
        Object obj;
        AbstractC16544l.m18094g(components, "components");
        c6021p.m6526U(-999670056);
        int i11 = (i10 & 48) == 0 ? (c6021p.m6545h(c8410b) ? 32 : 16) | i10 : i10;
        c6021p.m6521P(-264765832, Integer.valueOf(components.length));
        for (Object obj2 : components) {
            i11 |= c6021p.m6545h(obj2) ? 4 : 0;
        }
        c6021p.m6553p(false);
        if ((i11 & 14) == 0) {
            i11 |= 2;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC6012k0 abstractC6012k0 = f50950a;
            List list = (List) c6021p.m6548k(abstractC6012k0);
            C9642z c9642z = new C9642z(2);
            c9642z.m10200L(list);
            c9642z.m10201M(components);
            ArrayList arrayList = (ArrayList) c9642z.f29064Z;
            boolean zM6542f = false;
            for (Object obj3 : arrayList.toArray(new Object[arrayList.size()])) {
                zM6542f |= c6021p.m6542f(obj3);
            }
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                obj = objM6514H;
                List list2 = list;
                AbstractC16544l.m18094g(list2, "<this>");
                ArrayList arrayList2 = new ArrayList(list2.size() + components.length);
                arrayList2.addAll(list2);
                AbstractC17686t.m19399w(arrayList2, components);
                c6021p.m6537c0(arrayList2);
                obj = arrayList2;
            }
            obj = objM6514H;
            C5997d.m6440a(abstractC6012k0.mo6405a((List) obj), AbstractC8411c.m8969c(-1539128808, c6021p, new C4108p0(c8410b, 12)), c6021p, 56);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(components, c8410b, i10, 21);
        }
    }
}
