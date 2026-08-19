package p470T4;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p444S4.C6995a;
import p444S4.C7011q;
import p444S4.C7012r;
import p658b5.C11245p;
import p658b5.C11246q;

/* JADX INFO: renamed from: T4.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7245j {

    /* JADX INFO: renamed from: a */
    public static final String f22978a = C7011q.m7409f("Schedulers");

    /* JADX INFO: renamed from: a */
    public static void m7654a(C11246q c11246q, C7012r c7012r, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            c7012r.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c11246q.m12651u(jCurrentTimeMillis, ((C11245p) it.next()).f34041a);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7655b(C6995a c6995a, WorkDatabase workDatabase, List list) {
        ArrayList arrayListM12640j;
        if (list == null || list.size() == 0) {
            return;
        }
        C11246q c11246qMo12356t = workDatabase.mo12356t();
        workDatabase.m12340c();
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                arrayListM12640j = c11246qMo12356t.m12640j();
                m7654a(c11246qMo12356t, c6995a.f22379c, arrayListM12640j);
            } else {
                arrayListM12640j = null;
            }
            ArrayList arrayListM12639i = c11246qMo12356t.m12639i(c6995a.f22386j);
            m7654a(c11246qMo12356t, c6995a.f22379c, arrayListM12639i);
            if (arrayListM12640j != null) {
                arrayListM12639i.addAll(arrayListM12640j);
            }
            ArrayList arrayListM12637g = c11246qMo12356t.m12637g();
            workDatabase.m12352o();
            workDatabase.m12348k();
            if (arrayListM12639i.size() > 0) {
                C11245p[] c11245pArr = (C11245p[]) arrayListM12639i.toArray(new C11245p[arrayListM12639i.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC7243h interfaceC7243h = (InterfaceC7243h) it.next();
                    if (interfaceC7243h.mo7651a()) {
                        interfaceC7243h.mo7652c(c11245pArr);
                    }
                }
            }
            if (arrayListM12637g.size() > 0) {
                C11245p[] c11245pArr2 = (C11245p[]) arrayListM12637g.toArray(new C11245p[arrayListM12637g.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC7243h interfaceC7243h2 = (InterfaceC7243h) it2.next();
                    if (!interfaceC7243h2.mo7651a()) {
                        interfaceC7243h2.mo7652c(c11245pArr2);
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.m12348k();
            throw th2;
        }
    }
}
