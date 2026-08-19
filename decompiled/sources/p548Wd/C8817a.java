package p548Wd;

import gp.InterfaceC14208a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p040Bd.AbstractC0985Q1;
import p1113xn.AbstractC21329w;
import p607Yo.C10116e;
import p690cp.AbstractC12935u;
import p690cp.C12912C;

/* JADX INFO: renamed from: Wd.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C8817a implements InterfaceC14208a {

    /* JADX INFO: renamed from: a */
    public final List f27001a;

    public C8817a(List references) {
        AbstractC16544l.m18094g(references, "references");
        this.f27001a = references;
    }

    @Override // gp.InterfaceC14208a
    /* JADX INFO: renamed from: a */
    public final char mo8901a() {
        return (char) 59906;
    }

    @Override // gp.InterfaceC14208a
    /* JADX INFO: renamed from: b */
    public final int mo8902b(C10116e c10116e, C10116e c10116e2) {
        String str;
        Integer numM21736w;
        ArrayList arrayList = c10116e.f29956a;
        int size = arrayList.size();
        ArrayList arrayList2 = c10116e2.f29956a;
        if (size != arrayList2.size()) {
            return 0;
        }
        C12912C c12912cM10697b = c10116e.m10697b();
        C12912C c12912c = (C12912C) arrayList2.get(0);
        AbstractC12935u abstractC12935u = c12912cM10697b.f41096e;
        C12912C c12912c2 = abstractC12935u instanceof C12912C ? (C12912C) abstractC12935u : null;
        if (c12912c2 == null || (str = c12912c2.f41068g) == null || (numM21736w = AbstractC21329w.m21736w(str)) == null) {
            return 0;
        }
        C8818b c8818b = new C8818b((AbstractC0985Q1) this.f27001a.get(numM21736w.intValue()));
        AbstractC12935u abstractC12935u2 = c12912cM10697b.f41096e;
        while (true) {
            if (!((abstractC12935u2 == null || abstractC12935u2 == c12912c) ? false : true)) {
                c12912cM10697b.m14595f(c8818b);
                c12912c.m14596g(c8818b);
                return arrayList.size();
            }
            AbstractC12935u abstractC12935u3 = abstractC12935u2.f41096e;
            if (!abstractC12935u2.equals(c12912c)) {
                abstractC12935u2.m14598k();
            }
            abstractC12935u2 = abstractC12935u3;
        }
    }

    @Override // gp.InterfaceC14208a
    /* JADX INFO: renamed from: c */
    public final int mo8903c() {
        return 1;
    }

    @Override // gp.InterfaceC14208a
    /* JADX INFO: renamed from: d */
    public final char mo8904d() {
        return (char) 59905;
    }
}
