package am;

import java.util.ArrayList;
import java.util.Iterator;
import p228J.AbstractC3794B0;
import p629Zl.C10424e;
import p629Zl.InterfaceC10420a;
import p658b5.C11238i;
import p690cp.AbstractC12935u;
import p690cp.C12912C;

/* JADX INFO: renamed from: am.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C10748b implements InterfaceC10420a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C10749c f31936a;

    public C10748b(C10749c c10749c) {
        this.f31936a = c10749c;
    }

    @Override // p629Zl.InterfaceC10420a
    /* JADX INFO: renamed from: a */
    public final void mo10907a(C11238i c11238i, AbstractC12935u abstractC12935u) {
        String str = ((C12912C) abstractC12935u).f41068g;
        ((C10424e) c11238i.f34010o0).f30890Y.append(str);
        ArrayList arrayList = this.f31936a.f31937a;
        if (arrayList.isEmpty()) {
            return;
        }
        c11238i.m12572q0();
        str.getClass();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw AbstractC3794B0.m4497v(it);
        }
    }
}
