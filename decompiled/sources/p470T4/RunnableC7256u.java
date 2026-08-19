package p470T4;

import android.content.Context;
import android.database.Cursor;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import io.sentry.AbstractC15152P0;
import io.sentry.InterfaceC15154Q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC16544l;
import p110E4.C2315m;
import p221Ii.RunnableC3724c;
import p277L.ExecutorC4828a;
import p301M.RunnableC5228j;
import p444S4.AbstractC7003i;
import p444S4.AbstractC7004j;
import p444S4.AbstractC7009o;
import p444S4.AbstractC7010p;
import p444S4.C6994B;
import p444S4.C6995a;
import p444S4.C7001g;
import p444S4.C7006l;
import p444S4.C7007m;
import p444S4.C7008n;
import p444S4.C7011q;
import p444S4.C7012r;
import p444S4.EnumC7019y;
import p523V9.AbstractC7918J5;
import p658b5.C11232c;
import p658b5.C11245p;
import p658b5.C11246q;
import p674c5.AbstractC11655h;
import p674c5.C11661n;
import p674c5.RunnableC11660m;
import p697d5.C13027j;
import p719e5.C13285a;
import p999s.C19341c1;

/* JADX INFO: renamed from: T4.u */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7256u implements Runnable {

    /* JADX INFO: renamed from: D0 */
    public static final String f23007D0 = C7011q.m7409f("WorkerWrapper");

    /* JADX INFO: renamed from: Y */
    public final Context f23011Y;

    /* JADX INFO: renamed from: Z */
    public final String f23012Z;

    /* JADX INFO: renamed from: o0 */
    public final C11245p f23013o0;

    /* JADX INFO: renamed from: p0 */
    public AbstractC7010p f23014p0;

    /* JADX INFO: renamed from: q0 */
    public final C13285a f23015q0;

    /* JADX INFO: renamed from: s0 */
    public final C6995a f23017s0;

    /* JADX INFO: renamed from: t0 */
    public final C7012r f23018t0;

    /* JADX INFO: renamed from: u0 */
    public final C7241f f23019u0;

    /* JADX INFO: renamed from: v0 */
    public final WorkDatabase f23020v0;

    /* JADX INFO: renamed from: w0 */
    public final C11246q f23021w0;

    /* JADX INFO: renamed from: x0 */
    public final C11232c f23022x0;

    /* JADX INFO: renamed from: y0 */
    public final ArrayList f23023y0;

    /* JADX INFO: renamed from: z0 */
    public String f23024z0;

    /* JADX INFO: renamed from: r0 */
    public AbstractC7009o f23016r0 = new C7006l();

    /* JADX INFO: renamed from: A0 */
    public final C13027j f23008A0 = new C13027j();

    /* JADX INFO: renamed from: B0 */
    public final C13027j f23009B0 = new C13027j();

    /* JADX INFO: renamed from: C0 */
    public volatile int f23010C0 = -256;

    public RunnableC7256u(C19341c1 c19341c1) {
        this.f23011Y = (Context) c19341c1.f61254Y;
        this.f23015q0 = (C13285a) c19341c1.f61256o0;
        this.f23019u0 = (C7241f) c19341c1.f61255Z;
        C11245p c11245p = (C11245p) c19341c1.f61259r0;
        this.f23013o0 = c11245p;
        this.f23012Z = c11245p.f34041a;
        this.f23014p0 = null;
        C6995a c6995a = (C6995a) c19341c1.f61257p0;
        this.f23017s0 = c6995a;
        this.f23018t0 = c6995a.f22379c;
        WorkDatabase workDatabase = (WorkDatabase) c19341c1.f61258q0;
        this.f23020v0 = workDatabase;
        this.f23021w0 = workDatabase.mo12356t();
        this.f23022x0 = workDatabase.mo12343f();
        this.f23023y0 = (ArrayList) c19341c1.f61260s0;
    }

    /* JADX INFO: renamed from: a */
    public final void m7698a(AbstractC7009o abstractC7009o) {
        boolean z6 = abstractC7009o instanceof C7008n;
        C11245p c11245p = this.f23013o0;
        String str = f23007D0;
        if (!z6) {
            if (abstractC7009o instanceof C7007m) {
                C7011q.m7408d().m7413e(str, "Worker result RETRY for " + this.f23024z0);
                m7700c();
                return;
            }
            C7011q.m7408d().m7413e(str, "Worker result FAILURE for " + this.f23024z0);
            if (c11245p.m12624c()) {
                m7701d();
                return;
            } else {
                m7704g();
                return;
            }
        }
        C7011q.m7408d().m7413e(str, "Worker result SUCCESS for " + this.f23024z0);
        if (c11245p.m12624c()) {
            m7701d();
            return;
        }
        C11232c c11232c = this.f23022x0;
        String str2 = this.f23012Z;
        C11246q c11246q = this.f23021w0;
        WorkDatabase workDatabase = this.f23020v0;
        workDatabase.m12340c();
        try {
            c11246q.m12628D(EnumC7019y.f22434o0, str2);
            c11246q.m12627C(str2, ((C7008n) this.f23016r0).f22415a);
            this.f23018t0.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str3 : c11232c.m12487k(str2)) {
                if (c11246q.m12643m(str3) == EnumC7019y.f22436q0 && c11232c.m12489m(str3)) {
                    C7011q.m7408d().m7413e(str, "Setting status to enqueued for " + str3);
                    c11246q.m12628D(EnumC7019y.f22432Y, str3);
                    c11246q.m12626B(jCurrentTimeMillis, str3);
                }
            }
            workDatabase.m12352o();
        } finally {
            workDatabase.m12348k();
            m7702e(false);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7699b() {
        if (m7705h()) {
            return;
        }
        this.f23020v0.m12340c();
        try {
            EnumC7019y enumC7019yM12643m = this.f23021w0.m12643m(this.f23012Z);
            this.f23020v0.mo12355s().m12616u(this.f23012Z);
            if (enumC7019yM12643m == null) {
                m7702e(false);
            } else if (enumC7019yM12643m == EnumC7019y.f22433Z) {
                m7698a(this.f23016r0);
            } else if (!enumC7019yM12643m.m7415a()) {
                this.f23010C0 = -512;
                m7700c();
            }
            this.f23020v0.m12352o();
        } finally {
            this.f23020v0.m12348k();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7700c() {
        String str = this.f23012Z;
        C11246q c11246q = this.f23021w0;
        WorkDatabase workDatabase = this.f23020v0;
        workDatabase.m12340c();
        try {
            c11246q.m12628D(EnumC7019y.f22432Y, str);
            this.f23018t0.getClass();
            c11246q.m12626B(System.currentTimeMillis(), str);
            c11246q.m12654x(this.f23013o0.f34062v, str);
            c11246q.m12651u(-1L, str);
            workDatabase.m12352o();
        } finally {
            workDatabase.m12348k();
            m7702e(true);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7701d() {
        String str = this.f23012Z;
        C11246q c11246q = this.f23021w0;
        WorkDatabase workDatabase = this.f23020v0;
        workDatabase.m12340c();
        try {
            this.f23018t0.getClass();
            c11246q.m12626B(System.currentTimeMillis(), str);
            c11246q.m12628D(EnumC7019y.f22432Y, str);
            c11246q.m12655y(str);
            c11246q.m12654x(this.f23013o0.f34062v, str);
            c11246q.m12649s(str);
            c11246q.m12651u(-1L, str);
            workDatabase.m12352o();
        } finally {
            workDatabase.m12348k();
            m7702e(false);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7702e(boolean z6) {
        this.f23020v0.m12340c();
        try {
            if (!this.f23020v0.mo12356t().m12648r()) {
                AbstractC11655h.m13018a(this.f23011Y, RescheduleReceiver.class, false);
            }
            if (z6) {
                this.f23021w0.m12628D(EnumC7019y.f22432Y, this.f23012Z);
                this.f23021w0.m12629E(this.f23010C0, this.f23012Z);
                this.f23021w0.m12651u(-1L, this.f23012Z);
            }
            this.f23020v0.m12352o();
            this.f23020v0.m12348k();
            this.f23008A0.m14769k(Boolean.valueOf(z6));
        } catch (Throwable th2) {
            this.f23020v0.m12348k();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7703f() {
        C11246q c11246q = this.f23021w0;
        String str = this.f23012Z;
        EnumC7019y enumC7019yM12643m = c11246q.m12643m(str);
        EnumC7019y enumC7019y = EnumC7019y.f22433Z;
        String str2 = f23007D0;
        if (enumC7019yM12643m == enumC7019y) {
            C7011q.m7408d().m7410a(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            m7702e(true);
            return;
        }
        C7011q.m7408d().m7410a(str2, "Status for " + str + " is " + enumC7019yM12643m + " ; not doing any work");
        m7702e(false);
    }

    /* JADX INFO: renamed from: g */
    public final void m7704g() {
        String str = this.f23012Z;
        WorkDatabase workDatabase = this.f23020v0;
        workDatabase.m12340c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean zIsEmpty = linkedList.isEmpty();
                C11246q c11246q = this.f23021w0;
                if (zIsEmpty) {
                    C7001g c7001g = ((C7006l) this.f23016r0).f22414a;
                    c11246q.m12654x(this.f23013o0.f34062v, str);
                    c11246q.m12627C(str, c7001g);
                    workDatabase.m12352o();
                    return;
                }
                String str2 = (String) linkedList.remove();
                if (c11246q.m12643m(str2) != EnumC7019y.f22437r0) {
                    c11246q.m12628D(EnumC7019y.f22435p0, str2);
                }
                linkedList.addAll(this.f23022x0.m12487k(str2));
            }
        } finally {
            workDatabase.m12348k();
            m7702e(false);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m7705h() {
        if (this.f23010C0 == -256) {
            return false;
        }
        C7011q.m7408d().m7410a(f23007D0, "Work interrupted for " + this.f23024z0);
        EnumC7019y enumC7019yM12643m = this.f23021w0.m12643m(this.f23012Z);
        if (enumC7019yM12643m == null) {
            m7702e(false);
        } else {
            m7702e(!enumC7019yM12643m.m7415a());
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0093 A[Catch: all -> 0x007d, TryCatch #3 {all -> 0x007d, blocks: (B:14:0x0050, B:17:0x005a, B:21:0x0080, B:23:0x0086, B:25:0x008a, B:33:0x00c3, B:30:0x0093, B:32:0x00a4), top: B:108:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4 A[Catch: all -> 0x007d, TryCatch #3 {all -> 0x007d, blocks: (B:14:0x0050, B:17:0x005a, B:21:0x0080, B:23:0x0086, B:25:0x008a, B:33:0x00c3, B:30:0x0093, B:32:0x00a4), top: B:108:0x0050 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00a4, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC7003i abstractC7003i;
        C7001g c7001gMo7403a;
        boolean z6;
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        String str = this.f23012Z;
        sb2.append(str);
        sb2.append(", tags={ ");
        ArrayList<String> arrayList = this.f23023y0;
        boolean z10 = true;
        for (String str2 : arrayList) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str2);
        }
        sb2.append(" } ]");
        this.f23024z0 = sb2.toString();
        C11245p c11245p = this.f23013o0;
        if (m7705h()) {
            return;
        }
        WorkDatabase workDatabase = this.f23020v0;
        workDatabase.m12340c();
        try {
            EnumC7019y enumC7019y = c11245p.f34042b;
            EnumC7019y enumC7019y2 = EnumC7019y.f22432Y;
            String str3 = c11245p.f34043c;
            String str4 = f23007D0;
            if (enumC7019y == enumC7019y2) {
                if (c11245p.m12624c()) {
                    this.f23018t0.getClass();
                    if (System.currentTimeMillis() < c11245p.m12622a()) {
                        C7011q.m7408d().m7410a(str4, "Delaying execution for " + str3 + " because it is being executed before schedule.");
                        m7702e(true);
                        workDatabase.m12352o();
                    }
                } else if (c11245p.f34042b == enumC7019y2 && c11245p.f34051k > 0) {
                    this.f23018t0.getClass();
                    if (System.currentTimeMillis() < c11245p.m12622a()) {
                        C7011q.m7408d().m7410a(str4, "Delaying execution for " + str3 + " because it is being executed before schedule.");
                        m7702e(true);
                        workDatabase.m12352o();
                    }
                }
                workDatabase.m12352o();
                workDatabase.m12348k();
                boolean zM12624c = c11245p.m12624c();
                C11246q c11246q = this.f23021w0;
                C6995a c6995a = this.f23017s0;
                if (zM12624c) {
                    c7001gMo7403a = c11245p.f34045e;
                } else {
                    c6995a.f22381e.getClass();
                    String className = c11245p.f34044d;
                    AbstractC16544l.m18094g(className, "className");
                    String str5 = AbstractC7004j.f22412a;
                    try {
                        Object objNewInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
                        AbstractC16544l.m18092e(objNewInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
                        abstractC7003i = (AbstractC7003i) objNewInstance;
                    } catch (Exception e10) {
                        C7011q.m7408d().m7412c(AbstractC7004j.f22412a, "Trouble instantiating ".concat(className), e10);
                        abstractC7003i = null;
                    }
                    if (abstractC7003i == null) {
                        C7011q.m7408d().m7411b(str4, "Could not create Input Merger ".concat(className));
                        m7704g();
                        return;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(c11245p.f34045e);
                    c11246q.getClass();
                    InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
                    InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
                    C2315m c2315mM3418a = C2315m.m3418a(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                    if (str == null) {
                        c2315mM3418a.mo3426s0(1);
                    } else {
                        c2315mM3418a.mo3422c(1, str);
                    }
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c11246q.f34064a;
                    workDatabase_Impl.m12339b();
                    Cursor cursorM8212b = AbstractC7918J5.m8212b(workDatabase_Impl, c2315mM3418a, false);
                    try {
                        ArrayList arrayList3 = new ArrayList(cursorM8212b.getCount());
                        while (cursorM8212b.moveToNext()) {
                            arrayList3.add(C7001g.m7401a(cursorM8212b.isNull(0) ? null : cursorM8212b.getBlob(0)));
                        }
                        cursorM8212b.close();
                        if (interfaceC15154QMo16291v != null) {
                            interfaceC15154QMo16291v.mo16271b();
                        }
                        c2315mM3418a.m3425m();
                        arrayList2.addAll(arrayList3);
                        c7001gMo7403a = abstractC7003i.mo7403a(arrayList2);
                    } catch (Throwable th2) {
                        cursorM8212b.close();
                        if (interfaceC15154QMo16291v != null) {
                            interfaceC15154QMo16291v.mo16271b();
                        }
                        c2315mM3418a.m3425m();
                        throw th2;
                    }
                }
                UUID uuidFromString = UUID.fromString(str);
                ExecutorService executorService = c6995a.f22377a;
                C7241f c7241f = this.f23019u0;
                C13285a c13285a = this.f23015q0;
                C11661n c11661n = new C11661n(workDatabase, c7241f, c13285a);
                WorkerParameters workerParameters = new WorkerParameters();
                workerParameters.f33696a = uuidFromString;
                workerParameters.f33697b = c7001gMo7403a;
                new HashSet(arrayList);
                workerParameters.f33698c = c11245p.f34051k;
                workerParameters.f33699d = executorService;
                workerParameters.f33700e = c13285a;
                C6994B c6994b = c6995a.f22380d;
                workerParameters.f33701f = c6994b;
                if (this.f23014p0 == null) {
                    Context context = this.f23011Y;
                    c6994b.getClass();
                    this.f23014p0 = C6994B.m7399a(context, str3, workerParameters);
                }
                AbstractC7010p abstractC7010p = this.f23014p0;
                if (abstractC7010p == null) {
                    C7011q.m7408d().m7411b(str4, "Could not create Worker " + str3);
                    m7704g();
                    return;
                }
                if (abstractC7010p.f22419p0) {
                    C7011q.m7408d().m7411b(str4, "Received an already-used Worker " + str3 + "; Worker Factory should return new instances");
                    m7704g();
                    return;
                }
                abstractC7010p.f22419p0 = true;
                workDatabase.m12340c();
                try {
                    if (c11246q.m12643m(str) == enumC7019y2) {
                        c11246q.m12628D(EnumC7019y.f22433Z, str);
                        c11246q.m12650t(str);
                        c11246q.m12629E(-256, str);
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    workDatabase.m12352o();
                    workDatabase.m12348k();
                    if (!z6) {
                        m7703f();
                        return;
                    }
                    if (m7705h()) {
                        return;
                    }
                    RunnableC11660m runnableC11660m = new RunnableC11660m(this.f23011Y, this.f23013o0, this.f23014p0, c11661n, this.f23015q0);
                    c13285a.f41993d.execute(runnableC11660m);
                    C13027j c13027j = runnableC11660m.f35310Y;
                    RunnableC3724c runnableC3724c = new RunnableC3724c(this, 18, c13027j);
                    ExecutorC4828a executorC4828a = new ExecutorC4828a(1);
                    C13027j c13027j2 = this.f23009B0;
                    c13027j2.mo5766a(runnableC3724c, executorC4828a);
                    boolean z11 = false;
                    c13027j.mo5766a(new RunnableC5228j(this, c13027j, z11, 8), c13285a.f41993d);
                    c13027j2.mo5766a(new RunnableC5228j(this, this.f23024z0, z11, 9), c13285a.f41990a);
                    return;
                } catch (Throwable th3) {
                    workDatabase.m12348k();
                    throw th3;
                }
            }
            m7703f();
            workDatabase.m12352o();
            C7011q.m7408d().m7410a(str4, str3 + " is not in ENQUEUED state. Nothing more to do");
            workDatabase.m12348k();
        } catch (Throwable th4) {
            workDatabase.m12348k();
            throw th4;
        }
    }
}
