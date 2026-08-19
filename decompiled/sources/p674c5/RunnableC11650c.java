package p674c5;

import android.database.Cursor;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import io.sentry.AbstractC15152P0;
import io.sentry.EnumC15147N1;
import io.sentry.InterfaceC15154Q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import p110E4.C2315m;
import p114E8.C2354a;
import p444S4.C6998d;
import p444S4.C7001g;
import p444S4.C7011q;
import p444S4.C7013s;
import p444S4.C7014t;
import p444S4.EnumC7019y;
import p444S4.InterfaceC7017w;
import p470T4.AbstractC7245j;
import p470T4.C7247l;
import p470T4.C7253r;
import p523V9.AbstractC7918J5;
import p523V9.AbstractC8126k4;
import p658b5.C11230a;
import p658b5.C11231b;
import p658b5.C11232c;
import p658b5.C11240k;
import p658b5.C11241l;
import p658b5.C11243n;
import p658b5.C11245p;
import p658b5.C11246q;
import p658b5.C11247r;
import p658b5.C11248s;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: c5.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11650c implements Runnable {

    /* JADX INFO: renamed from: o0 */
    public static final String f35291o0 = C7011q.m7409f("EnqueueRunnable");

    /* JADX INFO: renamed from: Y */
    public final C7247l f35292Y;

    /* JADX INFO: renamed from: Z */
    public final C11232c f35293Z;

    public RunnableC11650c(C7247l c7247l) {
        C11232c c11232c = new C11232c(8);
        this.f35292Y = c7247l;
        this.f35293Z = c11232c;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0200  */
    /* JADX WARN: Code duplicated, block: B:123:0x021e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0227  */
    /* JADX WARN: Code duplicated, block: B:129:0x0241  */
    /* JADX WARN: Code duplicated, block: B:138:0x0312  */
    /* JADX WARN: Code duplicated, block: B:142:0x0328  */
    /* JADX WARN: Code duplicated, block: B:143:0x0332  */
    /* JADX WARN: Code duplicated, block: B:147:0x034d A[Catch: all -> 0x0353, TRY_LEAVE, TryCatch #0 {all -> 0x0353, blocks: (B:145:0x0341, B:147:0x034d), top: B:226:0x0341 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x035b  */
    /* JADX WARN: Code duplicated, block: B:156:0x0364  */
    /* JADX WARN: Code duplicated, block: B:158:0x0368  */
    /* JADX WARN: Code duplicated, block: B:160:0x0385  */
    /* JADX WARN: Code duplicated, block: B:161:0x038a  */
    /* JADX WARN: Code duplicated, block: B:165:0x03a2 A[Catch: all -> 0x03a8, TRY_LEAVE, TryCatch #2 {all -> 0x03a8, blocks: (B:163:0x0396, B:165:0x03a2), top: B:230:0x0396 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x03af  */
    /* JADX WARN: Code duplicated, block: B:180:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:182:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:183:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:187:0x0413 A[Catch: all -> 0x0419, TRY_LEAVE, TryCatch #3 {all -> 0x0419, blocks: (B:185:0x0407, B:187:0x0413), top: B:232:0x0407 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x042f  */
    /* JADX WARN: Code duplicated, block: B:201:0x044a  */
    /* JADX WARN: Code duplicated, block: B:202:0x0451  */
    /* JADX WARN: Code duplicated, block: B:206:0x0469 A[Catch: all -> 0x046f, TRY_LEAVE, TryCatch #4 {all -> 0x046f, blocks: (B:204:0x045d, B:206:0x0469), top: B:234:0x045d }] */
    /* JADX WARN: Code duplicated, block: B:212:0x0476  */
    /* JADX WARN: Code duplicated, block: B:217:0x0483  */
    /* JADX WARN: Code duplicated, block: B:248:0x0485 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x03b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x0420 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x03dd A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static boolean m13009a(C7247l c7247l) throws Throwable {
        boolean z6;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        String str2;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Iterator it;
        boolean z17;
        boolean z18;
        C11245p c11245p;
        long j10;
        C7253r c7253r;
        EnumC7019y enumC7019y;
        InterfaceC15154Q interfaceC15154QM16332f;
        String str3;
        InterfaceC15154Q interfaceC15154QMo16291v;
        WorkDatabase_Impl workDatabase_Impl;
        UUID uuid;
        C11248s c11248sMo12357u;
        String string;
        Iterator it2;
        String str4;
        InterfaceC15154Q interfaceC15154QM16332f2;
        InterfaceC15154Q interfaceC15154QMo16291v2;
        WorkDatabase_Impl workDatabase_Impl2;
        InterfaceC15154Q interfaceC15154QM16332f3;
        InterfaceC15154Q interfaceC15154QMo16291v3;
        WorkDatabase_Impl workDatabase_Impl3;
        int length;
        int i10;
        InterfaceC15154Q interfaceC15154QM16332f4;
        String str5;
        InterfaceC15154Q interfaceC15154QMo16291v4;
        WorkDatabase_Impl workDatabase_Impl4;
        String name;
        String str6;
        C7247l c7247l2 = c7247l;
        c7247l.getClass();
        String[] strArr = (String[]) C7247l.m7656c(c7247l).toArray(new String[0]);
        C7253r c7253r2 = c7247l2.f22981a;
        c7253r2.f22997b.f22379c.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z19 = strArr != null && strArr.length > 0;
        EnumC7019y enumC7019y2 = EnumC7019y.f22434o0;
        EnumC7019y enumC7019y3 = EnumC7019y.f22437r0;
        EnumC7019y enumC7019y4 = EnumC7019y.f22435p0;
        WorkDatabase workDatabase = c7253r2.f22998c;
        if (z19) {
            int length2 = strArr.length;
            int i11 = 0;
            z10 = false;
            z11 = false;
            z6 = true;
            while (true) {
                if (i11 < length2) {
                    String str7 = strArr[i11];
                    C11245p c11245pM12646p = workDatabase.mo12356t().m12646p(str7);
                    if (c11245pM12646p == null) {
                        C7011q.m7408d().m7411b(f35291o0, AbstractC10763a.m11054l("Prerequisite ", str7, " doesn't exist; not enqueuing"));
                    } else {
                        EnumC7019y enumC7019y5 = c11245pM12646p.f34042b;
                        z6 &= enumC7019y5 == enumC7019y2;
                        if (enumC7019y5 == enumC7019y4) {
                            z11 = true;
                        } else if (enumC7019y5 == enumC7019y3) {
                            z10 = true;
                        }
                        i11++;
                    }
                }
                z17 = true;
                z18 = false;
                c7247l2.f22987g = z17;
                return z18;
            }
        }
        z6 = true;
        z10 = false;
        z11 = false;
        String str8 = c7247l2.f22982b;
        boolean zIsEmpty = TextUtils.isEmpty(str8);
        EnumC7019y enumC7019y6 = EnumC7019y.f22432Y;
        String str9 = "androidx.work.impl.model.DependencyDao";
        boolean z20 = z6;
        String str10 = "db.sql.room";
        if (!zIsEmpty && !z19) {
            z12 = z19;
            ArrayList arrayListM12647q = workDatabase.mo12356t().m12647q(str8);
            if (!arrayListM12647q.isEmpty()) {
                z13 = z10;
                zIsEmpty = zIsEmpty;
                int i12 = 4;
                jCurrentTimeMillis = jCurrentTimeMillis;
                int i13 = c7247l2.f22983c;
                if (i13 == 3 || i13 == 4) {
                    C11232c c11232cMo12343f = workDatabase.mo12343f();
                    ArrayList arrayList = new ArrayList();
                    Iterator it3 = arrayListM12647q.iterator();
                    while (it3.hasNext()) {
                        C11243n c11243n = (C11243n) it3.next();
                        Iterator it4 = it3;
                        String str11 = c11243n.f34021a;
                        c11232cMo12343f.getClass();
                        C7253r c7253r3 = c7253r2;
                        InterfaceC15154Q interfaceC15154QM16332f5 = AbstractC15152P0.m16332f();
                        InterfaceC15154Q interfaceC15154QMo16291v5 = interfaceC15154QM16332f5 != null ? interfaceC15154QM16332f5.mo16291v(str10, str9) : null;
                        String str12 = str10;
                        C2315m c2315mM3418a = C2315m.m3418a(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                        if (str11 == null) {
                            c2315mM3418a.mo3426s0(1);
                        } else {
                            c2315mM3418a.mo3422c(1, str11);
                        }
                        WorkDatabase_Impl workDatabase_Impl5 = (WorkDatabase_Impl) c11232cMo12343f.f33996Y;
                        workDatabase_Impl5.m12339b();
                        Cursor cursorM8212b = AbstractC7918J5.m8212b(workDatabase_Impl5, c2315mM3418a, false);
                        try {
                            boolean z21 = cursorM8212b.moveToFirst() && cursorM8212b.getInt(0) != 0;
                            cursorM8212b.close();
                            if (interfaceC15154QMo16291v5 != null) {
                                interfaceC15154QMo16291v5.mo16271b();
                            }
                            c2315mM3418a.m3425m();
                            if (!z21) {
                                EnumC7019y enumC7019y7 = c11243n.f34022b;
                                boolean z22 = z20 & (enumC7019y7 == enumC7019y2);
                                if (enumC7019y7 == enumC7019y4) {
                                    z11 = true;
                                } else if (enumC7019y7 == enumC7019y3) {
                                    z13 = true;
                                }
                                arrayList.add(c11243n.f34021a);
                                z20 = z22;
                            }
                            it3 = it4;
                            c7253r2 = c7253r3;
                            str9 = str9;
                            str10 = str12;
                            i12 = 4;
                        } catch (Throwable th2) {
                            cursorM8212b.close();
                            if (interfaceC15154QMo16291v5 != null) {
                                interfaceC15154QMo16291v5.mo16271b();
                            }
                            c2315mM3418a.m3425m();
                            throw th2;
                        }
                    }
                    c7253r2 = c7253r2;
                    str = str9;
                    str2 = str10;
                    List listEmptyList = arrayList;
                    listEmptyList = arrayList;
                    if (i13 == i12 && (z13 || z11)) {
                        C11246q c11246qMo12356t = workDatabase.mo12356t();
                        Iterator it5 = c11246qMo12356t.m12647q(str8).iterator();
                        while (it5.hasNext()) {
                            c11246qMo12356t.m12636f(((C11243n) it5.next()).f34021a);
                        }
                        z11 = false;
                        z13 = false;
                        listEmptyList = Collections.emptyList();
                    }
                    strArr = (String[]) listEmptyList.toArray(strArr);
                    z15 = strArr.length > 0;
                    z14 = false;
                    z16 = z13;
                } else {
                    if (i13 == 2) {
                        Iterator it6 = arrayListM12647q.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                EnumC7019y enumC7019y8 = ((C11243n) it6.next()).f34022b;
                                if (enumC7019y8 == enumC7019y6 || enumC7019y8 == EnumC7019y.f22433Z) {
                                    z17 = true;
                                    z18 = false;
                                    c7247l2.f22987g = z17;
                                    return z18;
                                }
                            }
                        }
                    }
                    new RunnableC11649b(c7253r2, str8, 1).run();
                    C11246q c11246qMo12356t2 = workDatabase.mo12356t();
                    Iterator it7 = arrayListM12647q.iterator();
                    while (it7.hasNext()) {
                        c11246qMo12356t2.m12636f(((C11243n) it7.next()).f34021a);
                    }
                    c7253r2 = c7253r2;
                    str = "androidx.work.impl.model.DependencyDao";
                    str2 = "db.sql.room";
                    z15 = z12;
                    z16 = z13;
                    z14 = true;
                }
            }
            it = c7247l2.f22984d.iterator();
            while (it.hasNext()) {
                C7013s c7013s = (C7013s) it.next();
                c11245p = c7013s.f22425b;
                if (z15 || z20) {
                    j10 = jCurrentTimeMillis;
                    c11245p.f34054n = j10;
                } else {
                    if (z11) {
                        c11245p.f34042b = enumC7019y4;
                    } else if (z16) {
                        c11245p.f34042b = enumC7019y3;
                    } else {
                        c11245p.f34042b = EnumC7019y.f22436q0;
                    }
                    j10 = jCurrentTimeMillis;
                }
                if (c11245p.f34042b == enumC7019y6) {
                    z14 = true;
                }
                C11246q c11246qMo12356t3 = workDatabase.mo12356t();
                boolean z23 = z14;
                Iterator it8 = it;
                boolean z24 = z16;
                c7253r = c7253r2;
                List schedulers = c7253r.f23000e;
                AbstractC16544l.m18094g(schedulers, "schedulers");
                try {
                    if (Build.VERSION.SDK_INT < 26) {
                        C6998d c6998d = c11245p.f34050j;
                        c7253r2 = c7253r;
                        name = ConstraintTrackingWorker.class.getName();
                        enumC7019y = enumC7019y3;
                        str6 = c11245p.f34043c;
                        if (AbstractC16544l.m18089b(str6, name) && (c6998d.f22395d || c6998d.f22396e)) {
                            C2354a c2354a = new C2354a(1);
                            c2354a.m3441d(c11245p.f34045e.f22408a);
                            c2354a.f7308b.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str6);
                            C7001g c7001g = new C7001g(c2354a.f7308b);
                            C7001g.m7402b(c7001g);
                            String name2 = ConstraintTrackingWorker.class.getName();
                            EnumC7019y state = c11245p.f34042b;
                            long j11 = c11245p.f34047g;
                            C6998d constraints = c11245p.f34050j;
                            long j12 = c11245p.f34054n;
                            boolean z25 = c11245p.f34057q;
                            str8 = str8;
                            String id2 = c11245p.f34041a;
                            AbstractC16544l.m18094g(id2, "id");
                            AbstractC16544l.m18094g(state, "state");
                            String inputMergerClassName = c11245p.f34044d;
                            AbstractC16544l.m18094g(inputMergerClassName, "inputMergerClassName");
                            C7001g output = c11245p.f34046f;
                            AbstractC16544l.m18094g(output, "output");
                            AbstractC16544l.m18094g(constraints, "constraints");
                            int i14 = c11245p.f34052l;
                            AbstractC14376f.m15825D(i14, "backoffPolicy");
                            int i15 = c11245p.f34058r;
                            AbstractC14376f.m15825D(i15, "outOfQuotaPolicy");
                            c11245p = new C11245p(id2, state, name2, inputMergerClassName, c7001g, output, j11, c11245p.f34048h, c11245p.f34049i, constraints, c11245p.f34051k, i14, c11245p.f34053m, j12, c11245p.f34055o, c11245p.f34056p, z25, i15, c11245p.f34059s, c11245p.f34060t, c11245p.f34061u, c11245p.f34062v, c11245p.f34063w);
                        }
                        c11246qMo12356t3.getClass();
                        interfaceC15154QM16332f = AbstractC15152P0.m16332f();
                        if (interfaceC15154QM16332f != null) {
                            str3 = str2;
                            interfaceC15154QMo16291v = interfaceC15154QM16332f.mo16291v(str3, "androidx.work.impl.model.WorkSpecDao");
                        } else {
                            str3 = str2;
                            interfaceC15154QMo16291v = null;
                        }
                        workDatabase_Impl = (WorkDatabase_Impl) c11246qMo12356t3.f34064a;
                        workDatabase_Impl.m12339b();
                        workDatabase_Impl.m12340c();
                        ((C11231b) c11246qMo12356t3.f34065b).m12485t(c11245p);
                        workDatabase_Impl.m12352o();
                        if (interfaceC15154QMo16291v != null) {
                            interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
                        }
                        workDatabase_Impl.m12348k();
                        if (interfaceC15154QMo16291v != null) {
                            interfaceC15154QMo16291v.mo16271b();
                        }
                        uuid = c7013s.f22424a;
                        if (z15) {
                            length = strArr.length;
                            i10 = 0;
                            while (i10 < length) {
                                String str13 = strArr[i10];
                                String string2 = uuid.toString();
                                AbstractC16544l.m18093f(string2, "id.toString()");
                                C11230a c11230a = new C11230a(string2, str13);
                                C11232c c11232cMo12343f2 = workDatabase.mo12343f();
                                c11232cMo12343f2.getClass();
                                interfaceC15154QM16332f4 = AbstractC15152P0.m16332f();
                                str5 = str;
                                if (interfaceC15154QM16332f4 != null) {
                                    interfaceC15154QMo16291v4 = interfaceC15154QM16332f4.mo16291v(str3, str5);
                                } else {
                                    interfaceC15154QMo16291v4 = null;
                                }
                                workDatabase_Impl4 = (WorkDatabase_Impl) c11232cMo12343f2.f33996Y;
                                workDatabase_Impl4.m12339b();
                                workDatabase_Impl4.m12340c();
                                try {
                                    ((C11231b) c11232cMo12343f2.f33997Z).m12485t(c11230a);
                                    workDatabase_Impl4.m12352o();
                                    if (interfaceC15154QMo16291v4 != null) {
                                        interfaceC15154QMo16291v4.mo16272c(EnumC15147N1.OK);
                                    }
                                    workDatabase_Impl4.m12348k();
                                    if (interfaceC15154QMo16291v4 != null) {
                                        interfaceC15154QMo16291v4.mo16271b();
                                    }
                                    i10++;
                                    str = str5;
                                } catch (Throwable th3) {
                                    workDatabase_Impl4.m12348k();
                                    if (interfaceC15154QMo16291v4 != null) {
                                        interfaceC15154QMo16291v4.mo16271b();
                                    }
                                    throw th3;
                                }
                            }
                        }
                        String str14 = str;
                        c11248sMo12357u = workDatabase.mo12357u();
                        string = uuid.toString();
                        AbstractC16544l.m18093f(string, "id.toString()");
                        c11248sMo12357u.getClass();
                        Set tags = c7013s.f22426c;
                        AbstractC16544l.m18094g(tags, "tags");
                        it2 = tags.iterator();
                        while (it2.hasNext()) {
                            C11247r c11247r = new C11247r((String) it2.next(), string);
                            interfaceC15154QM16332f3 = AbstractC15152P0.m16332f();
                            if (interfaceC15154QM16332f3 != null) {
                                interfaceC15154QMo16291v3 = interfaceC15154QM16332f3.mo16291v(str3, "androidx.work.impl.model.WorkTagDao");
                            } else {
                                interfaceC15154QMo16291v3 = null;
                            }
                            workDatabase_Impl3 = (WorkDatabase_Impl) c11248sMo12357u.f34081Z;
                            workDatabase_Impl3.m12339b();
                            workDatabase_Impl3.m12340c();
                            try {
                                ((C11231b) c11248sMo12357u.f34082o0).m12485t(c11247r);
                                workDatabase_Impl3.m12352o();
                                if (interfaceC15154QMo16291v3 != null) {
                                    interfaceC15154QMo16291v3.mo16272c(EnumC15147N1.OK);
                                }
                                workDatabase_Impl3.m12348k();
                                if (interfaceC15154QMo16291v3 != null) {
                                    interfaceC15154QMo16291v3.mo16271b();
                                }
                            } catch (Throwable th4) {
                                workDatabase_Impl3.m12348k();
                                if (interfaceC15154QMo16291v3 != null) {
                                    interfaceC15154QMo16291v3.mo16271b();
                                }
                                throw th4;
                            }
                        }
                        if (zIsEmpty) {
                            str4 = str8;
                        } else {
                            C11241l c11241lMo12354r = workDatabase.mo12354r();
                            String string3 = uuid.toString();
                            AbstractC16544l.m18093f(string3, "id.toString()");
                            str4 = str8;
                            C11240k c11240k = new C11240k(str4, string3);
                            c11241lMo12354r.getClass();
                            interfaceC15154QM16332f2 = AbstractC15152P0.m16332f();
                            if (interfaceC15154QM16332f2 != null) {
                                interfaceC15154QMo16291v2 = interfaceC15154QM16332f2.mo16291v(str3, "androidx.work.impl.model.WorkNameDao");
                            } else {
                                interfaceC15154QMo16291v2 = null;
                            }
                            workDatabase_Impl2 = (WorkDatabase_Impl) c11241lMo12354r.f34016Y;
                            workDatabase_Impl2.m12339b();
                            workDatabase_Impl2.m12340c();
                            try {
                                ((C11231b) c11241lMo12354r.f34017Z).m12485t(c11240k);
                                workDatabase_Impl2.m12352o();
                                if (interfaceC15154QMo16291v2 != null) {
                                    interfaceC15154QMo16291v2.mo16272c(EnumC15147N1.OK);
                                }
                                workDatabase_Impl2.m12348k();
                                if (interfaceC15154QMo16291v2 != null) {
                                    interfaceC15154QMo16291v2.mo16271b();
                                }
                            } catch (Throwable th5) {
                                workDatabase_Impl2.m12348k();
                                if (interfaceC15154QMo16291v2 != null) {
                                    interfaceC15154QMo16291v2.mo16271b();
                                }
                                throw th5;
                            }
                        }
                        strArr = strArr;
                        str2 = str3;
                        str = str14;
                        z14 = z23;
                        it = it8;
                        z16 = z24;
                        enumC7019y3 = enumC7019y;
                        enumC7019y4 = enumC7019y4;
                        jCurrentTimeMillis = j10;
                        enumC7019y6 = enumC7019y6;
                        str8 = str4;
                    } else {
                        c7253r2 = c7253r;
                        enumC7019y = enumC7019y3;
                    }
                    ((C11231b) c11246qMo12356t3.f34065b).m12485t(c11245p);
                    workDatabase_Impl.m12352o();
                    if (interfaceC15154QMo16291v != null) {
                        interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
                    }
                    workDatabase_Impl.m12348k();
                    if (interfaceC15154QMo16291v != null) {
                        interfaceC15154QMo16291v.mo16271b();
                    }
                    uuid = c7013s.f22424a;
                    if (z15) {
                        length = strArr.length;
                        i10 = 0;
                        while (i10 < length) {
                            String str15 = strArr[i10];
                            String string4 = uuid.toString();
                            AbstractC16544l.m18093f(string4, "id.toString()");
                            C11230a c11230a2 = new C11230a(string4, str15);
                            C11232c c11232cMo12343f3 = workDatabase.mo12343f();
                            c11232cMo12343f3.getClass();
                            interfaceC15154QM16332f4 = AbstractC15152P0.m16332f();
                            str5 = str;
                            if (interfaceC15154QM16332f4 != null) {
                                interfaceC15154QMo16291v4 = interfaceC15154QM16332f4.mo16291v(str3, str5);
                            } else {
                                interfaceC15154QMo16291v4 = null;
                            }
                            workDatabase_Impl4 = (WorkDatabase_Impl) c11232cMo12343f3.f33996Y;
                            workDatabase_Impl4.m12339b();
                            workDatabase_Impl4.m12340c();
                            ((C11231b) c11232cMo12343f3.f33997Z).m12485t(c11230a2);
                            workDatabase_Impl4.m12352o();
                            if (interfaceC15154QMo16291v4 != null) {
                                interfaceC15154QMo16291v4.mo16272c(EnumC15147N1.OK);
                            }
                            workDatabase_Impl4.m12348k();
                            if (interfaceC15154QMo16291v4 != null) {
                                interfaceC15154QMo16291v4.mo16271b();
                            }
                            i10++;
                            str = str5;
                        }
                    }
                    String str16 = str;
                    c11248sMo12357u = workDatabase.mo12357u();
                    string = uuid.toString();
                    AbstractC16544l.m18093f(string, "id.toString()");
                    c11248sMo12357u.getClass();
                    Set tags2 = c7013s.f22426c;
                    AbstractC16544l.m18094g(tags2, "tags");
                    it2 = tags2.iterator();
                    while (it2.hasNext()) {
                        C11247r c11247r2 = new C11247r((String) it2.next(), string);
                        interfaceC15154QM16332f3 = AbstractC15152P0.m16332f();
                        if (interfaceC15154QM16332f3 != null) {
                            interfaceC15154QMo16291v3 = interfaceC15154QM16332f3.mo16291v(str3, "androidx.work.impl.model.WorkTagDao");
                        } else {
                            interfaceC15154QMo16291v3 = null;
                        }
                        workDatabase_Impl3 = (WorkDatabase_Impl) c11248sMo12357u.f34081Z;
                        workDatabase_Impl3.m12339b();
                        workDatabase_Impl3.m12340c();
                        ((C11231b) c11248sMo12357u.f34082o0).m12485t(c11247r2);
                        workDatabase_Impl3.m12352o();
                        if (interfaceC15154QMo16291v3 != null) {
                            interfaceC15154QMo16291v3.mo16272c(EnumC15147N1.OK);
                        }
                        workDatabase_Impl3.m12348k();
                        if (interfaceC15154QMo16291v3 != null) {
                            interfaceC15154QMo16291v3.mo16271b();
                        }
                    }
                    if (zIsEmpty) {
                        C11241l c11241lMo12354r2 = workDatabase.mo12354r();
                        String string5 = uuid.toString();
                        AbstractC16544l.m18093f(string5, "id.toString()");
                        str4 = str8;
                        C11240k c11240k2 = new C11240k(str4, string5);
                        c11241lMo12354r2.getClass();
                        interfaceC15154QM16332f2 = AbstractC15152P0.m16332f();
                        if (interfaceC15154QM16332f2 != null) {
                            interfaceC15154QMo16291v2 = interfaceC15154QM16332f2.mo16291v(str3, "androidx.work.impl.model.WorkNameDao");
                        } else {
                            interfaceC15154QMo16291v2 = null;
                        }
                        workDatabase_Impl2 = (WorkDatabase_Impl) c11241lMo12354r2.f34016Y;
                        workDatabase_Impl2.m12339b();
                        workDatabase_Impl2.m12340c();
                        ((C11231b) c11241lMo12354r2.f34017Z).m12485t(c11240k2);
                        workDatabase_Impl2.m12352o();
                        if (interfaceC15154QMo16291v2 != null) {
                            interfaceC15154QMo16291v2.mo16272c(EnumC15147N1.OK);
                        }
                        workDatabase_Impl2.m12348k();
                        if (interfaceC15154QMo16291v2 != null) {
                            interfaceC15154QMo16291v2.mo16271b();
                        }
                    } else {
                        str4 = str8;
                    }
                    strArr = strArr;
                    str2 = str3;
                    str = str16;
                    z14 = z23;
                    it = it8;
                    z16 = z24;
                    enumC7019y3 = enumC7019y;
                    enumC7019y4 = enumC7019y4;
                    jCurrentTimeMillis = j10;
                    enumC7019y6 = enumC7019y6;
                    str8 = str4;
                } catch (Throwable th6) {
                    workDatabase_Impl.m12348k();
                    if (interfaceC15154QMo16291v != null) {
                        interfaceC15154QMo16291v.mo16271b();
                    }
                    throw th6;
                }
                c11246qMo12356t3.getClass();
                interfaceC15154QM16332f = AbstractC15152P0.m16332f();
                if (interfaceC15154QM16332f != null) {
                    str3 = str2;
                    interfaceC15154QMo16291v = interfaceC15154QM16332f.mo16291v(str3, "androidx.work.impl.model.WorkSpecDao");
                } else {
                    str3 = str2;
                    interfaceC15154QMo16291v = null;
                }
                workDatabase_Impl = (WorkDatabase_Impl) c11246qMo12356t3.f34064a;
                workDatabase_Impl.m12339b();
                workDatabase_Impl.m12340c();
            }
            z17 = true;
            c7247l2 = c7247l;
            z18 = z14;
            c7247l2.f22987g = z17;
            return z18;
        }
        z12 = z19;
        str = "androidx.work.impl.model.DependencyDao";
        str2 = "db.sql.room";
        z13 = z10;
        z14 = false;
        z15 = z12;
        z16 = z13;
        it = c7247l2.f22984d.iterator();
        while (it.hasNext()) {
            C7013s c7013s2 = (C7013s) it.next();
            c11245p = c7013s2.f22425b;
            if (z15) {
                j10 = jCurrentTimeMillis;
                c11245p.f34054n = j10;
            } else {
                j10 = jCurrentTimeMillis;
                c11245p.f34054n = j10;
            }
            if (c11245p.f34042b == enumC7019y6) {
                z14 = true;
            }
            C11246q c11246qMo12356t4 = workDatabase.mo12356t();
            boolean z26 = z14;
            Iterator it9 = it;
            boolean z27 = z16;
            c7253r = c7253r2;
            List schedulers2 = c7253r.f23000e;
            AbstractC16544l.m18094g(schedulers2, "schedulers");
            if (Build.VERSION.SDK_INT < 26) {
                C6998d c6998d2 = c11245p.f34050j;
                c7253r2 = c7253r;
                name = ConstraintTrackingWorker.class.getName();
                enumC7019y = enumC7019y3;
                str6 = c11245p.f34043c;
                if (AbstractC16544l.m18089b(str6, name)) {
                }
            } else {
                c7253r2 = c7253r;
                enumC7019y = enumC7019y3;
            }
            c11246qMo12356t4.getClass();
            interfaceC15154QM16332f = AbstractC15152P0.m16332f();
            if (interfaceC15154QM16332f != null) {
                str3 = str2;
                interfaceC15154QMo16291v = interfaceC15154QM16332f.mo16291v(str3, "androidx.work.impl.model.WorkSpecDao");
            } else {
                str3 = str2;
                interfaceC15154QMo16291v = null;
            }
            workDatabase_Impl = (WorkDatabase_Impl) c11246qMo12356t4.f34064a;
            workDatabase_Impl.m12339b();
            workDatabase_Impl.m12340c();
            ((C11231b) c11246qMo12356t4.f34065b).m12485t(c11245p);
            workDatabase_Impl.m12352o();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
            }
            workDatabase_Impl.m12348k();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            uuid = c7013s2.f22424a;
            if (z15) {
                length = strArr.length;
                i10 = 0;
                while (i10 < length) {
                    String str17 = strArr[i10];
                    String string6 = uuid.toString();
                    AbstractC16544l.m18093f(string6, "id.toString()");
                    C11230a c11230a3 = new C11230a(string6, str17);
                    C11232c c11232cMo12343f4 = workDatabase.mo12343f();
                    c11232cMo12343f4.getClass();
                    interfaceC15154QM16332f4 = AbstractC15152P0.m16332f();
                    str5 = str;
                    if (interfaceC15154QM16332f4 != null) {
                        interfaceC15154QMo16291v4 = interfaceC15154QM16332f4.mo16291v(str3, str5);
                    } else {
                        interfaceC15154QMo16291v4 = null;
                    }
                    workDatabase_Impl4 = (WorkDatabase_Impl) c11232cMo12343f4.f33996Y;
                    workDatabase_Impl4.m12339b();
                    workDatabase_Impl4.m12340c();
                    ((C11231b) c11232cMo12343f4.f33997Z).m12485t(c11230a3);
                    workDatabase_Impl4.m12352o();
                    if (interfaceC15154QMo16291v4 != null) {
                        interfaceC15154QMo16291v4.mo16272c(EnumC15147N1.OK);
                    }
                    workDatabase_Impl4.m12348k();
                    if (interfaceC15154QMo16291v4 != null) {
                        interfaceC15154QMo16291v4.mo16271b();
                    }
                    i10++;
                    str = str5;
                }
            }
            String str18 = str;
            c11248sMo12357u = workDatabase.mo12357u();
            string = uuid.toString();
            AbstractC16544l.m18093f(string, "id.toString()");
            c11248sMo12357u.getClass();
            Set tags3 = c7013s2.f22426c;
            AbstractC16544l.m18094g(tags3, "tags");
            it2 = tags3.iterator();
            while (it2.hasNext()) {
                C11247r c11247r3 = new C11247r((String) it2.next(), string);
                interfaceC15154QM16332f3 = AbstractC15152P0.m16332f();
                if (interfaceC15154QM16332f3 != null) {
                    interfaceC15154QMo16291v3 = interfaceC15154QM16332f3.mo16291v(str3, "androidx.work.impl.model.WorkTagDao");
                } else {
                    interfaceC15154QMo16291v3 = null;
                }
                workDatabase_Impl3 = (WorkDatabase_Impl) c11248sMo12357u.f34081Z;
                workDatabase_Impl3.m12339b();
                workDatabase_Impl3.m12340c();
                ((C11231b) c11248sMo12357u.f34082o0).m12485t(c11247r3);
                workDatabase_Impl3.m12352o();
                if (interfaceC15154QMo16291v3 != null) {
                    interfaceC15154QMo16291v3.mo16272c(EnumC15147N1.OK);
                }
                workDatabase_Impl3.m12348k();
                if (interfaceC15154QMo16291v3 != null) {
                    interfaceC15154QMo16291v3.mo16271b();
                }
            }
            if (zIsEmpty) {
                C11241l c11241lMo12354r3 = workDatabase.mo12354r();
                String string7 = uuid.toString();
                AbstractC16544l.m18093f(string7, "id.toString()");
                str4 = str8;
                C11240k c11240k3 = new C11240k(str4, string7);
                c11241lMo12354r3.getClass();
                interfaceC15154QM16332f2 = AbstractC15152P0.m16332f();
                if (interfaceC15154QM16332f2 != null) {
                    interfaceC15154QMo16291v2 = interfaceC15154QM16332f2.mo16291v(str3, "androidx.work.impl.model.WorkNameDao");
                } else {
                    interfaceC15154QMo16291v2 = null;
                }
                workDatabase_Impl2 = (WorkDatabase_Impl) c11241lMo12354r3.f34016Y;
                workDatabase_Impl2.m12339b();
                workDatabase_Impl2.m12340c();
                ((C11231b) c11241lMo12354r3.f34017Z).m12485t(c11240k3);
                workDatabase_Impl2.m12352o();
                if (interfaceC15154QMo16291v2 != null) {
                    interfaceC15154QMo16291v2.mo16272c(EnumC15147N1.OK);
                }
                workDatabase_Impl2.m12348k();
                if (interfaceC15154QMo16291v2 != null) {
                    interfaceC15154QMo16291v2.mo16271b();
                }
            } else {
                str4 = str8;
            }
            strArr = strArr;
            str2 = str3;
            str = str18;
            z14 = z26;
            it = it9;
            z16 = z27;
            enumC7019y3 = enumC7019y;
            enumC7019y4 = enumC7019y4;
            jCurrentTimeMillis = j10;
            enumC7019y6 = enumC7019y6;
            str8 = str4;
        }
        z17 = true;
        c7247l2 = c7247l;
        z18 = z14;
        c7247l2.f22987g = z17;
        return z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        C11232c c11232c = this.f35293Z;
        C7247l c7247l = this.f35292Y;
        try {
            c7247l.getClass();
            HashSet hashSet = new HashSet();
            hashSet.addAll(c7247l.f22985e);
            HashSet hashSetM7656c = C7247l.m7656c(c7247l);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(c7247l.f22985e);
                    z6 = false;
                    break;
                } else if (hashSetM7656c.contains((String) it.next())) {
                    z6 = true;
                    break;
                }
            }
            if (z6) {
                throw new IllegalStateException("WorkContinuation has cycles (" + c7247l + Separators.RPAREN);
            }
            C7253r c7253r = c7247l.f22981a;
            WorkDatabase workDatabase = c7253r.f22998c;
            workDatabase.m12340c();
            try {
                AbstractC8126k4.m8630a(workDatabase, c7253r.f22997b, c7247l);
                boolean zM13009a = m13009a(c7247l);
                workDatabase.m12352o();
                workDatabase.m12348k();
                if (zM13009a) {
                    AbstractC11655h.m13018a(c7253r.f22996a, RescheduleReceiver.class, true);
                    AbstractC7245j.m7655b(c7253r.f22997b, c7253r.f22998c, c7253r.f23000e);
                }
                c11232c.m12490n(InterfaceC7017w.f22428g0);
            } catch (Throwable th2) {
                workDatabase.m12348k();
                throw th2;
            }
        } catch (Throwable th3) {
            c11232c.m12490n(new C7014t(th3));
        }
    }
}
