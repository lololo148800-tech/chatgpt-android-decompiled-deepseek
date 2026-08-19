package p544W9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p346Nn.C5864D;
import p346Nn.InterfaceC5894e;
import p389Pn.C6519d;
import p857kl.AbstractC16455c;
import p857kl.C16445L;
import p857kl.C16446M;
import p857kl.InterfaceC16443J;
import p857kl.InterfaceC16444K;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: renamed from: W9.r4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8705r4 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC16443J m9411a(InterfaceC16444K parameters) {
        AbstractC16544l.m18094g(parameters, "parameters");
        C16445L c16445lM9346b = AbstractC8657j4.m9346b();
        for (String str : parameters.mo4527b()) {
            List listMo4528d = parameters.mo4528d(str);
            if (listMo4528d == null) {
                listMo4528d = C17689w.f56480Y;
            }
            String strM18031d = AbstractC16455c.m18031d(str, 0, 0, false, 15);
            List list = listMo4528d;
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC16455c.m18031d((String) it.next(), 0, 0, true, 11));
            }
            c16445lM9346b.mo4533m(strM18031d, arrayList);
        }
        Map values = (Map) c16445lM9346b.f11539Z;
        AbstractC16544l.m18094g(values, "values");
        return new C16446M(values);
    }

    /* JADX INFO: renamed from: b */
    public static void m9412b(InterfaceC5894e interfaceC5894e) {
        interfaceC5894e.mo6308o(new C6519d(new C5864D()));
    }
}
