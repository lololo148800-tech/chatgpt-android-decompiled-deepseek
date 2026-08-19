package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import io.sentry.AbstractC15152P0;
import io.sentry.InterfaceC15154Q;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p110E4.C2315m;
import p444S4.C6998d;
import p444S4.C7001g;
import p444S4.C7008n;
import p444S4.C7011q;
import p444S4.EnumC7019y;
import p470T4.C7253r;
import p523V9.AbstractC7881F0;
import p523V9.AbstractC7910I5;
import p523V9.AbstractC7918J5;
import p658b5.C11238i;
import p658b5.C11241l;
import p658b5.C11245p;
import p658b5.C11246q;
import p658b5.C11248s;
import p741f5.AbstractC13544c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18067d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    /* JADX INFO: renamed from: f */
    public final C7008n mo12336f() throws Throwable {
        InterfaceC15154Q interfaceC15154Q;
        C2315m c2315m;
        C11238i c11238i;
        C11241l c11241l;
        C11248s c11248s;
        C7253r c7253rM7690f = C7253r.m7690f(this.f22416Y);
        WorkDatabase workDatabase = c7253rM7690f.f22998c;
        AbstractC16544l.m18093f(workDatabase, "workManager.workDatabase");
        C11246q c11246qMo12356t = workDatabase.mo12356t();
        C11241l c11241lMo12354r = workDatabase.mo12354r();
        C11248s c11248sMo12357u = workDatabase.mo12357u();
        C11238i c11238iMo12353p = workDatabase.mo12353p();
        c7253rM7690f.f22997b.f22379c.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        c11246qMo12356t.getClass();
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        C2315m c2315mM3418a = C2315m.m3418a(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        c2315mM3418a.mo3420V(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c11246qMo12356t.f34064a;
        workDatabase_Impl.m12339b();
        Cursor cursorM8212b = AbstractC7918J5.m8212b(workDatabase_Impl, c2315mM3418a, false);
        try {
            int iM8210c = AbstractC7910I5.m8210c(cursorM8212b, ParameterNames.f31999ID);
            int iM8210c2 = AbstractC7910I5.m8210c(cursorM8212b, "state");
            int iM8210c3 = AbstractC7910I5.m8210c(cursorM8212b, "worker_class_name");
            int iM8210c4 = AbstractC7910I5.m8210c(cursorM8212b, "input_merger_class_name");
            int iM8210c5 = AbstractC7910I5.m8210c(cursorM8212b, "input");
            int iM8210c6 = AbstractC7910I5.m8210c(cursorM8212b, "output");
            int iM8210c7 = AbstractC7910I5.m8210c(cursorM8212b, "initial_delay");
            int iM8210c8 = AbstractC7910I5.m8210c(cursorM8212b, "interval_duration");
            int iM8210c9 = AbstractC7910I5.m8210c(cursorM8212b, "flex_duration");
            int iM8210c10 = AbstractC7910I5.m8210c(cursorM8212b, "run_attempt_count");
            int iM8210c11 = AbstractC7910I5.m8210c(cursorM8212b, "backoff_policy");
            int iM8210c12 = AbstractC7910I5.m8210c(cursorM8212b, "backoff_delay_duration");
            int iM8210c13 = AbstractC7910I5.m8210c(cursorM8212b, "last_enqueue_time");
            c2315m = c2315mM3418a;
            try {
                int iM8210c14 = AbstractC7910I5.m8210c(cursorM8212b, "minimum_retention_duration");
                interfaceC15154Q = interfaceC15154QMo16291v;
                try {
                    int iM8210c15 = AbstractC7910I5.m8210c(cursorM8212b, "schedule_requested_at");
                    int iM8210c16 = AbstractC7910I5.m8210c(cursorM8212b, "run_in_foreground");
                    int iM8210c17 = AbstractC7910I5.m8210c(cursorM8212b, "out_of_quota_policy");
                    int iM8210c18 = AbstractC7910I5.m8210c(cursorM8212b, "period_count");
                    int iM8210c19 = AbstractC7910I5.m8210c(cursorM8212b, "generation");
                    int iM8210c20 = AbstractC7910I5.m8210c(cursorM8212b, "next_schedule_time_override");
                    int iM8210c21 = AbstractC7910I5.m8210c(cursorM8212b, "next_schedule_time_override_generation");
                    int iM8210c22 = AbstractC7910I5.m8210c(cursorM8212b, "stop_reason");
                    int iM8210c23 = AbstractC7910I5.m8210c(cursorM8212b, "required_network_type");
                    int iM8210c24 = AbstractC7910I5.m8210c(cursorM8212b, "requires_charging");
                    int iM8210c25 = AbstractC7910I5.m8210c(cursorM8212b, "requires_device_idle");
                    int iM8210c26 = AbstractC7910I5.m8210c(cursorM8212b, "requires_battery_not_low");
                    int iM8210c27 = AbstractC7910I5.m8210c(cursorM8212b, "requires_storage_not_low");
                    int iM8210c28 = AbstractC7910I5.m8210c(cursorM8212b, "trigger_content_update_delay");
                    int iM8210c29 = AbstractC7910I5.m8210c(cursorM8212b, "trigger_max_content_delay");
                    int iM8210c30 = AbstractC7910I5.m8210c(cursorM8212b, "content_uri_triggers");
                    int i10 = iM8210c14;
                    ArrayList arrayList = new ArrayList(cursorM8212b.getCount());
                    while (cursorM8212b.moveToNext()) {
                        String string = cursorM8212b.isNull(iM8210c) ? null : cursorM8212b.getString(iM8210c);
                        EnumC7019y enumC7019yM8171j = AbstractC7881F0.m8171j(cursorM8212b.getInt(iM8210c2));
                        String string2 = cursorM8212b.isNull(iM8210c3) ? null : cursorM8212b.getString(iM8210c3);
                        String string3 = cursorM8212b.isNull(iM8210c4) ? null : cursorM8212b.getString(iM8210c4);
                        C7001g c7001gM7401a = C7001g.m7401a(cursorM8212b.isNull(iM8210c5) ? null : cursorM8212b.getBlob(iM8210c5));
                        C7001g c7001gM7401a2 = C7001g.m7401a(cursorM8212b.isNull(iM8210c6) ? null : cursorM8212b.getBlob(iM8210c6));
                        long j10 = cursorM8212b.getLong(iM8210c7);
                        long j11 = cursorM8212b.getLong(iM8210c8);
                        long j12 = cursorM8212b.getLong(iM8210c9);
                        int i11 = cursorM8212b.getInt(iM8210c10);
                        int iM8168g = AbstractC7881F0.m8168g(cursorM8212b.getInt(iM8210c11));
                        long j13 = cursorM8212b.getLong(iM8210c12);
                        long j14 = cursorM8212b.getLong(iM8210c13);
                        int i12 = i10;
                        long j15 = cursorM8212b.getLong(i12);
                        int i13 = iM8210c;
                        int i14 = iM8210c15;
                        long j16 = cursorM8212b.getLong(i14);
                        iM8210c15 = i14;
                        iM8210c16 = iM8210c16;
                        boolean z6 = cursorM8212b.getInt(iM8210c16) != 0;
                        int iM8170i = AbstractC7881F0.m8170i(cursorM8212b.getInt(iM8210c17));
                        iM8210c17 = iM8210c17;
                        int i15 = iM8210c18;
                        int i16 = cursorM8212b.getInt(i15);
                        iM8210c18 = i15;
                        int i17 = iM8210c19;
                        int i18 = cursorM8212b.getInt(i17);
                        iM8210c19 = i17;
                        int i19 = iM8210c20;
                        long j17 = cursorM8212b.getLong(i19);
                        iM8210c20 = i19;
                        int i20 = iM8210c21;
                        int i21 = cursorM8212b.getInt(i20);
                        iM8210c21 = i20;
                        int i22 = iM8210c22;
                        int i23 = cursorM8212b.getInt(i22);
                        iM8210c22 = i22;
                        int i24 = iM8210c23;
                        int iM8169h = AbstractC7881F0.m8169h(cursorM8212b.getInt(i24));
                        iM8210c23 = i24;
                        iM8210c24 = iM8210c24;
                        boolean z10 = cursorM8212b.getInt(iM8210c24) != 0;
                        boolean z11 = cursorM8212b.getInt(iM8210c25) != 0;
                        boolean z12 = cursorM8212b.getInt(iM8210c26) != 0;
                        boolean z13 = cursorM8212b.getInt(iM8210c27) != 0;
                        long j18 = cursorM8212b.getLong(iM8210c28);
                        iM8210c28 = iM8210c28;
                        int i25 = iM8210c29;
                        long j19 = cursorM8212b.getLong(i25);
                        iM8210c29 = i25;
                        int i26 = iM8210c30;
                        iM8210c30 = i26;
                        arrayList.add(new C11245p(string, enumC7019yM8171j, string2, string3, c7001gM7401a, c7001gM7401a2, j10, j11, j12, new C6998d(iM8169h, z10, z11, z12, z13, j18, j19, AbstractC7881F0.m8166e(cursorM8212b.isNull(i26) ? null : cursorM8212b.getBlob(i26))), i11, iM8168g, j13, j14, j15, j16, z6, iM8170i, i16, i18, j17, i21, i23));
                        iM8210c = i13;
                        i10 = i12;
                    }
                    cursorM8212b.close();
                    if (interfaceC15154Q != null) {
                        interfaceC15154Q.mo16271b();
                    }
                    c2315m.m3425m();
                    ArrayList arrayListM12641k = c11246qMo12356t.m12641k();
                    ArrayList arrayListM12637g = c11246qMo12356t.m12637g();
                    if (arrayList.isEmpty()) {
                        c11238i = c11238iMo12353p;
                        c11241l = c11241lMo12354r;
                        c11248s = c11248sMo12357u;
                    } else {
                        C7011q c7011qM7408d = C7011q.m7408d();
                        String str = AbstractC13544c.f42867a;
                        c7011qM7408d.m7413e(str, "Recently completed work:\n\n");
                        c11238i = c11238iMo12353p;
                        c11241l = c11241lMo12354r;
                        c11248s = c11248sMo12357u;
                        C7011q.m7408d().m7413e(str, AbstractC13544c.m15086a(c11241l, c11248s, c11238i, arrayList));
                    }
                    if (!arrayListM12641k.isEmpty()) {
                        C7011q c7011qM7408d2 = C7011q.m7408d();
                        String str2 = AbstractC13544c.f42867a;
                        c7011qM7408d2.m7413e(str2, "Running work:\n\n");
                        C7011q.m7408d().m7413e(str2, AbstractC13544c.m15086a(c11241l, c11248s, c11238i, arrayListM12641k));
                    }
                    if (!arrayListM12637g.isEmpty()) {
                        C7011q c7011qM7408d3 = C7011q.m7408d();
                        String str3 = AbstractC13544c.f42867a;
                        c7011qM7408d3.m7413e(str3, "Enqueued work:\n\n");
                        C7011q.m7408d().m7413e(str3, AbstractC13544c.m15086a(c11241l, c11248s, c11238i, arrayListM12637g));
                    }
                    return new C7008n(C7001g.f22407c);
                } catch (Throwable th2) {
                    th = th2;
                    cursorM8212b.close();
                    if (interfaceC15154Q != null) {
                        interfaceC15154Q.mo16271b();
                    }
                    c2315m.m3425m();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                interfaceC15154Q = interfaceC15154QMo16291v;
            }
        } catch (Throwable th4) {
            th = th4;
            interfaceC15154Q = interfaceC15154QMo16291v;
            c2315m = c2315mM3418a;
        }
    }
}
