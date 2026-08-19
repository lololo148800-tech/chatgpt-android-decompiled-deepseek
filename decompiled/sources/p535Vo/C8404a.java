package p535Vo;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import gp.InterfaceC14208a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p513Uo.C7725a;
import p607Yo.C10116e;
import p690cp.AbstractC12935u;
import p690cp.C12910A;
import p690cp.C12912C;
import p690cp.C12936v;

/* JADX INFO: renamed from: Vo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C8404a implements InterfaceC14208a {
    @Override // gp.InterfaceC14208a
    /* JADX INFO: renamed from: a */
    public final char mo8901a() {
        return '~';
    }

    @Override // gp.InterfaceC14208a
    /* JADX INFO: renamed from: b */
    public final int mo8902b(C10116e c10116e, C10116e c10116e2) {
        String strM11052j;
        ArrayList arrayList = c10116e.f29956a;
        int size = arrayList.size();
        ArrayList arrayList2 = c10116e2.f29956a;
        if (size != arrayList2.size() || arrayList.size() > 2) {
            return 0;
        }
        C12912C c12912cM10697b = c10116e.m10697b();
        if (arrayList.size() == 1) {
            strM11052j = c12912cM10697b.f41068g;
        } else {
            String str = c12912cM10697b.f41068g;
            strM11052j = AbstractC10763a.m11052j(str, str);
        }
        C7725a c7725a = new C7725a();
        c7725a.f24350g = strM11052j;
        C12910A c12910a = new C12910A();
        c12910a.m14587b(c10116e.m10698c(arrayList.size()));
        C12936v c12936v = new C12936v(c12912cM10697b.f41096e, (C12912C) arrayList2.get(0));
        while (c12936v.hasNext()) {
            AbstractC12935u abstractC12935u = (AbstractC12935u) c12936v.next();
            c7725a.m14593c(abstractC12935u);
            c12910a.m14586a(abstractC12935u.m14594e());
        }
        c12910a.m14587b(c10116e2.m10696a(arrayList2.size()));
        List listEmptyList = c12910a.f41066a;
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        c7725a.m14597i(listEmptyList);
        c12912cM10697b.m14595f(c7725a);
        return arrayList.size();
    }

    @Override // gp.InterfaceC14208a
    /* JADX INFO: renamed from: c */
    public final int mo8903c() {
        return 1;
    }

    @Override // gp.InterfaceC14208a
    /* JADX INFO: renamed from: d */
    public final char mo8904d() {
        return '~';
    }
}
