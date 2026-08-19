package p632Zo;

import gp.InterfaceC14208a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p607Yo.C10116e;
import p690cp.AbstractC12935u;
import p690cp.C12910A;
import p690cp.C12911B;
import p690cp.C12912C;
import p690cp.C12923i;
import p690cp.C12936v;

/* JADX INFO: renamed from: Zo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C10430a implements InterfaceC14208a {

    /* JADX INFO: renamed from: a */
    public final char f30903a;

    public C10430a(char c9) {
        this.f30903a = c9;
    }

    @Override // gp.InterfaceC14208a
    /* JADX INFO: renamed from: a */
    public final char mo8901a() {
        return this.f30903a;
    }

    @Override // gp.InterfaceC14208a
    /* JADX INFO: renamed from: b */
    public final int mo8902b(C10116e c10116e, C10116e c10116e2) {
        AbstractC12935u abstractC12935u;
        if (c10116e.f29960e || c10116e2.f29959d) {
            int i10 = c10116e2.f29958c;
            if (i10 % 3 != 0 && (c10116e.f29958c + i10) % 3 == 0) {
                return 0;
            }
        }
        int size = c10116e.f29956a.size();
        ArrayList arrayList = c10116e2.f29956a;
        char c9 = this.f30903a;
        int i11 = 2;
        if (size < 2 || arrayList.size() < 2) {
            String strValueOf = String.valueOf(c9);
            C12923i c12923i = new C12923i();
            c12923i.f41073g = strValueOf;
            i11 = 1;
            abstractC12935u = c12923i;
        } else {
            String str = String.valueOf(c9) + c9;
            C12911B c12911b = new C12911B();
            c12911b.f41067g = str;
            abstractC12935u = c12911b;
        }
        C12910A c12910a = new C12910A();
        c12910a.m14587b(c10116e.m10698c(i11));
        C12912C c12912cM10697b = c10116e.m10697b();
        C12936v c12936v = new C12936v(c12912cM10697b.f41096e, (C12912C) arrayList.get(0));
        while (c12936v.hasNext()) {
            AbstractC12935u abstractC12935u2 = (AbstractC12935u) c12936v.next();
            abstractC12935u.m14593c(abstractC12935u2);
            c12910a.m14586a(abstractC12935u2.m14594e());
        }
        c12910a.m14587b(c10116e2.m10696a(i11));
        List listEmptyList = c12910a.f41066a;
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        abstractC12935u.m14597i(listEmptyList);
        c12912cM10697b.m14595f(abstractC12935u);
        return i11;
    }

    @Override // gp.InterfaceC14208a
    /* JADX INFO: renamed from: c */
    public final int mo8903c() {
        return 1;
    }

    @Override // gp.InterfaceC14208a
    /* JADX INFO: renamed from: d */
    public final char mo8904d() {
        return this.f30903a;
    }
}
