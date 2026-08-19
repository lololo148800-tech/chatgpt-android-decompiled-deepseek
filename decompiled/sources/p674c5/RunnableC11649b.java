package p674c5;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import io.sentry.AbstractC15152P0;
import io.sentry.EnumC15147N1;
import io.sentry.InterfaceC15154Q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import p233J4.C4262h;
import p444S4.C7011q;
import p444S4.C7014t;
import p444S4.EnumC7019y;
import p444S4.InterfaceC7017w;
import p470T4.AbstractC7245j;
import p470T4.C7241f;
import p470T4.C7253r;
import p470T4.InterfaceC7243h;
import p470T4.RunnableC7256u;
import p658b5.C11232c;
import p658b5.C11237h;
import p658b5.C11246q;

/* JADX INFO: renamed from: c5.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11649b implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final C11232c f35287Y = new C11232c(8);

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f35288Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C7253r f35289o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f35290p0;

    public RunnableC11649b(C7253r c7253r, Object obj, int i10) {
        this.f35288Z = i10;
        this.f35289o0 = c7253r;
        this.f35290p0 = obj;
    }

    /* JADX INFO: renamed from: a */
    public static void m13007a(C7253r c7253r, String str) {
        RunnableC7256u runnableC7256uM7642b;
        WorkDatabase workDatabase = c7253r.f22998c;
        C11246q c11246qMo12356t = workDatabase.mo12356t();
        C11232c c11232cMo12343f = workDatabase.mo12343f();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            EnumC7019y enumC7019yM12643m = c11246qMo12356t.m12643m(str2);
            if (enumC7019yM12643m != EnumC7019y.f22434o0 && enumC7019yM12643m != EnumC7019y.f22435p0) {
                InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
                InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c11246qMo12356t.f34064a;
                workDatabase_Impl.m12339b();
                C11237h c11237h = (C11237h) c11246qMo12356t.f34068e;
                C4262h c4262hM1928a = c11237h.m1928a();
                if (str2 == null) {
                    c4262hM1928a.mo3426s0(1);
                } else {
                    c4262hM1928a.mo3422c(1, str2);
                }
                workDatabase_Impl.m12340c();
                try {
                    c4262hM1928a.m5034e();
                    workDatabase_Impl.m12352o();
                    if (interfaceC15154QMo16291v != null) {
                        interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
                    }
                    workDatabase_Impl.m12348k();
                    if (interfaceC15154QMo16291v != null) {
                        interfaceC15154QMo16291v.mo16271b();
                    }
                    c11237h.m1942o(c4262hM1928a);
                } catch (Throwable th2) {
                    workDatabase_Impl.m12348k();
                    if (interfaceC15154QMo16291v != null) {
                        interfaceC15154QMo16291v.mo16271b();
                    }
                    c11237h.m1942o(c4262hM1928a);
                    throw th2;
                }
            }
            linkedList.addAll(c11232cMo12343f.m12487k(str2));
        }
        C7241f c7241f = c7253r.f23001f;
        synchronized (c7241f.f22971k) {
            C7011q.m7408d().m7410a(C7241f.f22960l, "Processor cancelling " + str);
            c7241f.f22969i.add(str);
            runnableC7256uM7642b = c7241f.m7642b(str);
        }
        C7241f.m7640e(str, runnableC7256uM7642b, 1);
        Iterator it = c7253r.f23000e.iterator();
        while (it.hasNext()) {
            ((InterfaceC7243h) it.next()).mo7653e(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13008b() {
        switch (this.f35288Z) {
            case 0:
                C7253r c7253r = this.f35289o0;
                WorkDatabase workDatabase = c7253r.f22998c;
                workDatabase.m12340c();
                try {
                    Iterator it = workDatabase.mo12356t().m12645o((String) this.f35290p0).iterator();
                    while (it.hasNext()) {
                        m13007a(c7253r, (String) it.next());
                    }
                    workDatabase.m12352o();
                    workDatabase.m12348k();
                    AbstractC7245j.m7655b(c7253r.f22997b, c7253r.f22998c, c7253r.f23000e);
                    return;
                } catch (Throwable th2) {
                    workDatabase.m12348k();
                    throw th2;
                }
            case 1:
                C7253r c7253r2 = this.f35289o0;
                WorkDatabase workDatabase2 = c7253r2.f22998c;
                workDatabase2.m12340c();
                try {
                    Iterator it2 = workDatabase2.mo12356t().m12644n((String) this.f35290p0).iterator();
                    while (it2.hasNext()) {
                        m13007a(c7253r2, (String) it2.next());
                    }
                    workDatabase2.m12352o();
                    return;
                } finally {
                    workDatabase2.m12348k();
                }
            default:
                C7253r c7253r3 = this.f35289o0;
                WorkDatabase workDatabase3 = c7253r3.f22998c;
                workDatabase3.m12340c();
                try {
                    m13007a(c7253r3, ((UUID) this.f35290p0).toString());
                    workDatabase3.m12352o();
                    workDatabase3.m12348k();
                    AbstractC7245j.m7655b(c7253r3.f22997b, c7253r3.f22998c, c7253r3.f23000e);
                    return;
                } catch (Throwable th3) {
                    workDatabase3.m12348k();
                    throw th3;
                }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11232c c11232c = this.f35287Y;
        try {
            m13008b();
            c11232c.m12490n(InterfaceC7017w.f22428g0);
        } catch (Throwable th2) {
            c11232c.m12490n(new C7014t(th2));
        }
    }
}
