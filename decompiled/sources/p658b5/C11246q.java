package p658b5;

import android.database.Cursor;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.compose.material3.internal.AbstractC10860a;
import androidx.work.impl.WorkDatabase_Impl;
import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import io.sentry.AbstractC15152P0;
import io.sentry.EnumC15147N1;
import io.sentry.InterfaceC15154Q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p041Be.C1217J;
import p049Bm.InterfaceC1436k;
import p1053v3.p1054lN.IGDwkYw;
import p110E4.C2315m;
import p197Hj.C3457c;
import p229J0.C4171z3;
import p229J0.EnumC3886B3;
import p233J4.C4262h;
import p278L0.C4853Q;
import p278L0.C4854S;
import p278L0.C4855T;
import p278L0.C4872f;
import p278L0.C4884l;
import p278L0.C4886m;
import p278L0.C4888o;
import p278L0.C4889p;
import p278L0.C4891r;
import p278L0.C4892s;
import p278L0.C4894u;
import p349O0.C5975S;
import p349O0.C5994b0;
import p349O0.C5997d;
import p349O0.C6002f0;
import p379Pb.LVf.efyhmdM;
import p444S4.C6998d;
import p444S4.C7001g;
import p444S4.EnumC7019y;
import p523V9.AbstractC7881F0;
import p523V9.AbstractC7910I5;
import p523V9.AbstractC7918J5;
import p523V9.AbstractC7926K5;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p758g0.C13781p0;
import p773h0.EnumC14284g0;
import p861l1.xapn.suYVq;
import p909nm.AbstractC17680n;
import p909nm.C17690x;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: b5.q */
/* JADX INFO: loaded from: classes.dex */
public final class C11246q {

    /* JADX INFO: renamed from: a */
    public final Object f34064a;

    /* JADX INFO: renamed from: b */
    public final Object f34065b;

    /* JADX INFO: renamed from: c */
    public final Object f34066c;

    /* JADX INFO: renamed from: d */
    public final Object f34067d;

    /* JADX INFO: renamed from: e */
    public final Object f34068e;

    /* JADX INFO: renamed from: f */
    public final Object f34069f;

    /* JADX INFO: renamed from: g */
    public final Object f34070g;

    /* JADX INFO: renamed from: h */
    public final Object f34071h;

    /* JADX INFO: renamed from: i */
    public final Object f34072i;

    /* JADX INFO: renamed from: j */
    public final Object f34073j;

    /* JADX INFO: renamed from: k */
    public final Object f34074k;

    /* JADX INFO: renamed from: l */
    public final Object f34075l;

    /* JADX INFO: renamed from: m */
    public final Object f34076m;

    /* JADX INFO: renamed from: n */
    public final Object f34077n;

    public C11246q(WorkDatabase_Impl workDatabase_Impl) {
        this.f34064a = workDatabase_Impl;
        this.f34065b = new C11231b(workDatabase_Impl, 5);
        new C11237h(workDatabase_Impl, 12);
        this.f34066c = new C11237h(workDatabase_Impl, 13);
        this.f34067d = new C11237h(workDatabase_Impl, 14);
        this.f34068e = new C11237h(workDatabase_Impl, 15);
        this.f34069f = new C11237h(workDatabase_Impl, 16);
        this.f34070g = new C11237h(workDatabase_Impl, 17);
        this.f34071h = new C11237h(workDatabase_Impl, 18);
        this.f34072i = new C11237h(workDatabase_Impl, 19);
        this.f34073j = new C11237h(workDatabase_Impl, 4);
        new C11237h(workDatabase_Impl, 5);
        this.f34074k = new C11237h(workDatabase_Impl, 6);
        this.f34075l = new C11237h(workDatabase_Impl, 7);
        this.f34076m = new C11237h(workDatabase_Impl, 8);
        new C11237h(workDatabase_Impl, 9);
        new C11237h(workDatabase_Impl, 10);
        this.f34077n = new C11237h(workDatabase_Impl, 11);
    }

    /* JADX INFO: renamed from: A */
    public void m12625A(Object obj) {
        ((C6002f0) this.f34075l).setValue(obj);
    }

    /* JADX INFO: renamed from: C */
    public void m12627C(String str, C7001g c7001g) throws Throwable {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34064a;
        workDatabase_Impl.m12339b();
        C11237h c11237h = (C11237h) this.f34070g;
        C4262h c4262hM1928a = c11237h.m1928a();
        byte[] bArrM7402b = C7001g.m7402b(c7001g);
        if (bArrM7402b == null) {
            c4262hM1928a.mo3426s0(1);
        } else {
            c4262hM1928a.mo3421Y(1, bArrM7402b);
        }
        if (str == null) {
            c4262hM1928a.mo3426s0(2);
        } else {
            c4262hM1928a.mo3422c(2, str);
        }
        workDatabase_Impl.m12340c();
        try {
            c4262hM1928a.m5034e();
            workDatabase_Impl.m12352o();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
            }
        } finally {
            workDatabase_Impl.m12348k();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c11237h.m1942o(c4262hM1928a);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m12628D(EnumC7019y enumC7019y, String str) {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34064a;
        workDatabase_Impl.m12339b();
        C11237h c11237h = (C11237h) this.f34067d;
        C4262h c4262hM1928a = c11237h.m1928a();
        c4262hM1928a.mo3420V(1, AbstractC7881F0.m8172k(enumC7019y));
        if (str == null) {
            c4262hM1928a.mo3426s0(2);
        } else {
            c4262hM1928a.mo3422c(2, str);
        }
        workDatabase_Impl.m12340c();
        try {
            c4262hM1928a.m5034e();
            workDatabase_Impl.m12352o();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
            }
        } finally {
            workDatabase_Impl.m12348k();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c11237h.m1942o(c4262hM1928a);
        }
    }

    /* JADX INFO: renamed from: F */
    public Object m12630F(float f10, AbstractC19694j abstractC19694j) {
        Object value = ((C6002f0) this.f34070g).getValue();
        Object objM12635e = m12635e(m12653w(), f10, value);
        boolean zBooleanValue = ((Boolean) ((InterfaceC1436k) this.f34067d).invoke(objM12635e)).booleanValue();
        C17296C c17296c = C17296C.f55119a;
        if (zBooleanValue) {
            Object objM11287b = AbstractC10860a.m11287b(this, objM12635e, f10, abstractC19694j);
            return objM11287b == EnumC19250a.f61036Y ? objM11287b : c17296c;
        }
        Object objM11287b2 = AbstractC10860a.m11287b(this, value, f10, abstractC19694j);
        return objM11287b2 == EnumC19250a.f61036Y ? objM11287b2 : c17296c;
    }

    /* JADX INFO: renamed from: a */
    public void m12631a(HashMap map) {
        int i10;
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            HashMap map2 = new HashMap(999);
            Iterator it = setKeySet.iterator();
            loop0: while (true) {
                i10 = 0;
                do {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    String str = (String) it.next();
                    map2.put(str, (ArrayList) map.get(str));
                    i10++;
                } while (i10 != 999);
                m12631a(map2);
                map2 = new HashMap(999);
            }
            if (i10 > 0) {
                m12631a(map2);
                return;
            }
            return;
        }
        StringBuilder sbM9893l = AbstractC9306j0.m9893l("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        AbstractC7926K5.m8222b(size, sbM9893l);
        sbM9893l.append(Separators.RPAREN);
        C2315m c2315mM3418a = C2315m.m3418a(size, sbM9893l.toString());
        int i11 = 1;
        for (String str2 : setKeySet) {
            if (str2 == null) {
                c2315mM3418a.mo3426s0(i11);
            } else {
                c2315mM3418a.mo3422c(i11, str2);
            }
            i11++;
        }
        Cursor cursorM8212b = AbstractC7918J5.m8212b((WorkDatabase_Impl) this.f34064a, c2315mM3418a, false);
        try {
            int iM8209b = AbstractC7910I5.m8209b(cursorM8212b, "work_spec_id");
            if (iM8209b == -1) {
                return;
            }
            while (cursorM8212b.moveToNext()) {
                ArrayList arrayList = (ArrayList) map.get(cursorM8212b.getString(iM8209b));
                if (arrayList != null) {
                    arrayList.add(C7001g.m7401a(cursorM8212b.isNull(0) ? null : cursorM8212b.getBlob(0)));
                }
            }
        } finally {
            cursorM8212b.close();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m12632b(HashMap map) {
        int i10;
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            HashMap map2 = new HashMap(999);
            Iterator it = setKeySet.iterator();
            loop0: while (true) {
                i10 = 0;
                do {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    String str = (String) it.next();
                    map2.put(str, (ArrayList) map.get(str));
                    i10++;
                } while (i10 != 999);
                m12632b(map2);
                map2 = new HashMap(999);
            }
            if (i10 > 0) {
                m12632b(map2);
                return;
            }
            return;
        }
        StringBuilder sbM9893l = AbstractC9306j0.m9893l("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        AbstractC7926K5.m8222b(size, sbM9893l);
        sbM9893l.append(Separators.RPAREN);
        C2315m c2315mM3418a = C2315m.m3418a(size, sbM9893l.toString());
        int i11 = 1;
        for (String str2 : setKeySet) {
            if (str2 == null) {
                c2315mM3418a.mo3426s0(i11);
            } else {
                c2315mM3418a.mo3422c(i11, str2);
            }
            i11++;
        }
        Cursor cursorM8212b = AbstractC7918J5.m8212b((WorkDatabase_Impl) this.f34064a, c2315mM3418a, false);
        try {
            int iM8209b = AbstractC7910I5.m8209b(cursorM8212b, "work_spec_id");
            if (iM8209b == -1) {
                return;
            }
            while (cursorM8212b.moveToNext()) {
                ArrayList arrayList = (ArrayList) map.get(cursorM8212b.getString(iM8209b));
                if (arrayList != null) {
                    arrayList.add(cursorM8212b.isNull(0) ? null : cursorM8212b.getString(0));
                }
            }
        } finally {
            cursorM8212b.close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Object m12633c(EnumC14284g0 enumC14284g0, C1217J c1217j, AbstractC19687c abstractC19687c) throws Throwable {
        C4884l c4884l;
        Throwable th2;
        C11246q c11246q;
        Object objM5499a;
        Object objM5499a2;
        if (abstractC19687c instanceof C4884l) {
            c4884l = (C4884l) abstractC19687c;
            int i10 = c4884l.f15923p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4884l.f15923p0 = i10 - Integer.MIN_VALUE;
            } else {
                c4884l = new C4884l(this, abstractC19687c);
            }
        } else {
            c4884l = new C4884l(this, abstractC19687c);
        }
        Object obj = c4884l.f15921Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4884l.f15923p0;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c11246q = c4884l.f15920Y;
            try {
                AbstractC9233X.m9807c(obj);
                C4855T c4855tM12638h = c11246q.m12638h();
                C5994b0 c5994b0 = (C5994b0) c11246q.f34073j;
                objM5499a2 = c4855tM12638h.m5499a(c5994b0.m6409g());
                if (objM5499a2 != null && Math.abs(c5994b0.m6409g() - c11246q.m12638h().m5502d(objM5499a2)) <= 0.5f && ((Boolean) ((InterfaceC1436k) c11246q.f34067d).invoke(objM5499a2)).booleanValue()) {
                    c11246q.m12656z(objM5499a2);
                }
                return C17296C.f55119a;
            } catch (Throwable th3) {
                th2 = th3;
                C4855T c4855tM12638h2 = c11246q.m12638h();
                C5994b0 c5994b1 = (C5994b0) c11246q.f34073j;
                objM5499a = c4855tM12638h2.m5499a(c5994b1.m6409g());
                if (objM5499a != null) {
                    c11246q.m12656z(objM5499a);
                }
                throw th2;
            }
        }
        AbstractC9233X.m9807c(obj);
        try {
            C4854S c4854s = (C4854S) this.f34068e;
            try {
                C4888o c4888o = new C4888o(c1217j, this, null);
                c4884l.f15920Y = this;
                c4884l.f15923p0 = 1;
                try {
                    c4854s.getClass();
                    if (AbstractC0575H.m1183l(new C4853Q(enumC14284g0, c4854s, c4888o, null), c4884l) == enumC19250a) {
                        return enumC19250a;
                    }
                    c11246q = this;
                    C4855T c4855tM12638h3 = c11246q.m12638h();
                    C5994b0 c5994b2 = (C5994b0) c11246q.f34073j;
                    objM5499a2 = c4855tM12638h3.m5499a(c5994b2.m6409g());
                    if (objM5499a2 != null) {
                        c11246q.m12656z(objM5499a2);
                    }
                    return C17296C.f55119a;
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    c11246q = this;
                    C4855T c4855tM12638h4 = c11246q.m12638h();
                    C5994b0 c5994b3 = (C5994b0) c11246q.f34073j;
                    objM5499a = c4855tM12638h4.m5499a(c5994b3.m6409g());
                    if (objM5499a != null && Math.abs(c5994b3.m6409g() - c11246q.m12638h().m5502d(objM5499a)) <= 0.5f && ((Boolean) ((InterfaceC1436k) c11246q.f34067d).invoke(objM5499a)).booleanValue()) {
                        c11246q.m12656z(objM5499a);
                    }
                    throw th2;
                }
            } catch (Throwable th5) {
                th2 = th5;
                c11246q = this;
                C4855T c4855tM12638h5 = c11246q.m12638h();
                C5994b0 c5994b4 = (C5994b0) c11246q.f34073j;
                objM5499a = c4855tM12638h5.m5499a(c5994b4.m6409g());
                if (objM5499a != null) {
                    c11246q.m12656z(objM5499a);
                }
                throw th2;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: d */
    public Object m12634d(Object obj, EnumC14284g0 enumC14284g0, C4872f c4872f, AbstractC19687c abstractC19687c) {
        C4889p c4889p;
        Throwable th2;
        C11246q c11246q;
        Object objM5499a;
        Object objM5499a2;
        if (abstractC19687c instanceof C4889p) {
            c4889p = (C4889p) abstractC19687c;
            int i10 = c4889p.f15938p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4889p.f15938p0 = i10 - Integer.MIN_VALUE;
            } else {
                c4889p = new C4889p(this, abstractC19687c);
            }
        } else {
            c4889p = new C4889p(this, abstractC19687c);
        }
        Object obj2 = c4889p.f15936Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4889p.f15938p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj2);
            if (m12638h().f15815a.containsKey(obj)) {
                try {
                    C4854S c4854s = (C4854S) this.f34068e;
                    try {
                        C4891r c4891r = new C4891r(this, obj, c4872f, null);
                        c4889p.f15935Y = this;
                        c4889p.f15938p0 = 1;
                        try {
                            c4854s.getClass();
                            if (AbstractC0575H.m1183l(new C4853Q(enumC14284g0, c4854s, c4891r, null), c4889p) == enumC19250a) {
                                return enumC19250a;
                            }
                            c11246q = this;
                            c11246q.m12625A(null);
                            C4855T c4855tM12638h = c11246q.m12638h();
                            C5994b0 c5994b0 = (C5994b0) c11246q.f34073j;
                            objM5499a2 = c4855tM12638h.m5499a(c5994b0.m6409g());
                            if (objM5499a2 != null) {
                                c11246q.m12656z(objM5499a2);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            th2 = th;
                            c11246q = this;
                            c11246q.m12625A(null);
                            C4855T c4855tM12638h2 = c11246q.m12638h();
                            C5994b0 c5994b1 = (C5994b0) c11246q.f34073j;
                            objM5499a = c4855tM12638h2.m5499a(c5994b1.m6409g());
                            if (objM5499a != null && Math.abs(c5994b1.m6409g() - c11246q.m12638h().m5502d(objM5499a)) <= 0.5f && ((Boolean) ((InterfaceC1436k) c11246q.f34067d).invoke(objM5499a)).booleanValue()) {
                                c11246q.m12656z(objM5499a);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        c11246q = this;
                        c11246q.m12625A(null);
                        C4855T c4855tM12638h3 = c11246q.m12638h();
                        C5994b0 c5994b2 = (C5994b0) c11246q.f34073j;
                        objM5499a = c4855tM12638h3.m5499a(c5994b2.m6409g());
                        if (objM5499a != null) {
                            c11246q.m12656z(objM5499a);
                        }
                        throw th2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } else {
                m12656z(obj);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c11246q = c4889p.f15935Y;
            try {
                AbstractC9233X.m9807c(obj2);
                c11246q.m12625A(null);
                C4855T c4855tM12638h4 = c11246q.m12638h();
                C5994b0 c5994b3 = (C5994b0) c11246q.f34073j;
                objM5499a2 = c4855tM12638h4.m5499a(c5994b3.m6409g());
                if (objM5499a2 != null && Math.abs(c5994b3.m6409g() - c11246q.m12638h().m5502d(objM5499a2)) <= 0.5f && ((Boolean) ((InterfaceC1436k) c11246q.f34067d).invoke(objM5499a2)).booleanValue()) {
                    c11246q.m12656z(objM5499a2);
                }
            } catch (Throwable th6) {
                th2 = th6;
                c11246q.m12625A(null);
                C4855T c4855tM12638h5 = c11246q.m12638h();
                C5994b0 c5994b4 = (C5994b0) c11246q.f34073j;
                objM5499a = c4855tM12638h5.m5499a(c5994b4.m6409g());
                if (objM5499a != null) {
                    c11246q.m12656z(objM5499a);
                }
                throw th2;
            }
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: e */
    public Object m12635e(float f10, float f11, Object obj) {
        Object objM5500b;
        C4855T c4855tM12638h = m12638h();
        float fM5502d = c4855tM12638h.m5502d(obj);
        float fFloatValue = ((Number) ((C3457c) this.f34065b).invoke()).floatValue();
        if (fM5502d == f10 || Float.isNaN(fM5502d)) {
            return obj;
        }
        C4171z3 c4171z3 = (C4171z3) this.f34064a;
        if (fM5502d < f10) {
            if (f11 >= fFloatValue) {
                Object objM5500b2 = c4855tM12638h.m5500b(f10, true);
                AbstractC16544l.m18091d(objM5500b2);
                return objM5500b2;
            }
            objM5500b = c4855tM12638h.m5500b(f10, true);
            AbstractC16544l.m18091d(objM5500b);
            if (f10 < Math.abs(Math.abs(((Number) c4171z3.invoke(Float.valueOf(Math.abs(c4855tM12638h.m5502d(objM5500b) - fM5502d)))).floatValue()) + fM5502d)) {
                return obj;
            }
        } else {
            if (f11 <= (-fFloatValue)) {
                Object objM5500b3 = c4855tM12638h.m5500b(f10, false);
                AbstractC16544l.m18091d(objM5500b3);
                return objM5500b3;
            }
            objM5500b = c4855tM12638h.m5500b(f10, false);
            AbstractC16544l.m18091d(objM5500b);
            float fAbs = Math.abs(fM5502d - Math.abs(((Number) c4171z3.invoke(Float.valueOf(Math.abs(fM5502d - c4855tM12638h.m5502d(objM5500b))))).floatValue()));
            if (f10 < 0.0f) {
                if (Math.abs(f10) < fAbs) {
                    return obj;
                }
            } else if (f10 > fAbs) {
                return obj;
            }
        }
        return objM5500b;
    }

    /* JADX INFO: renamed from: f */
    public void m12636f(String str) {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34064a;
        workDatabase_Impl.m12339b();
        C11237h c11237h = (C11237h) this.f34066c;
        C4262h c4262hM1928a = c11237h.m1928a();
        if (str == null) {
            c4262hM1928a.mo3426s0(1);
        } else {
            c4262hM1928a.mo3422c(1, str);
        }
        workDatabase_Impl.m12340c();
        try {
            c4262hM1928a.m5034e();
            workDatabase_Impl.m12352o();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
            }
        } finally {
            workDatabase_Impl.m12348k();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c11237h.m1942o(c4262hM1928a);
        }
    }

    /* JADX INFO: renamed from: g */
    public ArrayList m12637g() throws Throwable {
        InterfaceC15154Q interfaceC15154Q;
        C2315m c2315m;
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        C2315m c2315mM3418a = C2315m.m3418a(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        c2315mM3418a.mo3420V(1, RCHTTPStatusCodes.SUCCESS);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34064a;
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
                    return arrayList;
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

    /* JADX INFO: renamed from: h */
    public C4855T m12638h() {
        return (C4855T) ((C6002f0) this.f34076m).getValue();
    }

    /* JADX INFO: renamed from: i */
    public ArrayList m12639i(int i10) throws Throwable {
        InterfaceC15154Q interfaceC15154Q;
        C2315m c2315m;
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        C2315m c2315mM3418a = C2315m.m3418a(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        c2315mM3418a.mo3420V(1, i10);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34064a;
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
                    int i11 = iM8210c14;
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
                        int i12 = cursorM8212b.getInt(iM8210c10);
                        int iM8168g = AbstractC7881F0.m8168g(cursorM8212b.getInt(iM8210c11));
                        long j13 = cursorM8212b.getLong(iM8210c12);
                        long j14 = cursorM8212b.getLong(iM8210c13);
                        int i13 = i11;
                        long j15 = cursorM8212b.getLong(i13);
                        int i14 = iM8210c;
                        int i15 = iM8210c15;
                        long j16 = cursorM8212b.getLong(i15);
                        iM8210c15 = i15;
                        iM8210c16 = iM8210c16;
                        boolean z6 = cursorM8212b.getInt(iM8210c16) != 0;
                        int iM8170i = AbstractC7881F0.m8170i(cursorM8212b.getInt(iM8210c17));
                        iM8210c17 = iM8210c17;
                        int i16 = iM8210c18;
                        int i17 = cursorM8212b.getInt(i16);
                        iM8210c18 = i16;
                        int i18 = iM8210c19;
                        int i19 = cursorM8212b.getInt(i18);
                        iM8210c19 = i18;
                        int i20 = iM8210c20;
                        long j17 = cursorM8212b.getLong(i20);
                        iM8210c20 = i20;
                        int i21 = iM8210c21;
                        int i22 = cursorM8212b.getInt(i21);
                        iM8210c21 = i21;
                        int i23 = iM8210c22;
                        int i24 = cursorM8212b.getInt(i23);
                        iM8210c22 = i23;
                        int i25 = iM8210c23;
                        int iM8169h = AbstractC7881F0.m8169h(cursorM8212b.getInt(i25));
                        iM8210c23 = i25;
                        iM8210c24 = iM8210c24;
                        boolean z10 = cursorM8212b.getInt(iM8210c24) != 0;
                        boolean z11 = cursorM8212b.getInt(iM8210c25) != 0;
                        boolean z12 = cursorM8212b.getInt(iM8210c26) != 0;
                        boolean z13 = cursorM8212b.getInt(iM8210c27) != 0;
                        long j18 = cursorM8212b.getLong(iM8210c28);
                        iM8210c28 = iM8210c28;
                        int i26 = iM8210c29;
                        long j19 = cursorM8212b.getLong(i26);
                        iM8210c29 = i26;
                        int i27 = iM8210c30;
                        iM8210c30 = i27;
                        arrayList.add(new C11245p(string, enumC7019yM8171j, string2, string3, c7001gM7401a, c7001gM7401a2, j10, j11, j12, new C6998d(iM8169h, z10, z11, z12, z13, j18, j19, AbstractC7881F0.m8166e(cursorM8212b.isNull(i27) ? null : cursorM8212b.getBlob(i27))), i12, iM8168g, j13, j14, j15, j16, z6, iM8170i, i17, i19, j17, i22, i24));
                        iM8210c = i14;
                        i11 = i13;
                    }
                    cursorM8212b.close();
                    if (interfaceC15154Q != null) {
                        interfaceC15154Q.mo16271b();
                    }
                    c2315m.m3425m();
                    return arrayList;
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

    /* JADX INFO: renamed from: l */
    public ArrayList m12642l() throws Throwable {
        InterfaceC15154Q interfaceC15154Q;
        C2315m c2315m;
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        C2315m c2315mM3418a = C2315m.m3418a(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34064a;
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
                    return arrayList;
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

    /* JADX INFO: renamed from: m */
    public EnumC7019y m12643m(String str) {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        EnumC7019y enumC7019yM8171j = null;
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        C2315m c2315mM3418a = C2315m.m3418a(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            c2315mM3418a.mo3426s0(1);
        } else {
            c2315mM3418a.mo3422c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34064a;
        workDatabase_Impl.m12339b();
        Cursor cursorM8212b = AbstractC7918J5.m8212b(workDatabase_Impl, c2315mM3418a, false);
        try {
            if (cursorM8212b.moveToFirst()) {
                Integer numValueOf = cursorM8212b.isNull(0) ? null : Integer.valueOf(cursorM8212b.getInt(0));
                if (numValueOf != null) {
                    enumC7019yM8171j = AbstractC7881F0.m8171j(numValueOf.intValue());
                }
            }
            return enumC7019yM8171j;
        } finally {
            cursorM8212b.close();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c2315mM3418a.m3425m();
        }
    }

    /* JADX INFO: renamed from: n */
    public ArrayList m12644n(String str) {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        C2315m c2315mM3418a = C2315m.m3418a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            c2315mM3418a.mo3426s0(1);
        } else {
            c2315mM3418a.mo3422c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34064a;
        workDatabase_Impl.m12339b();
        Cursor cursorM8212b = AbstractC7918J5.m8212b(workDatabase_Impl, c2315mM3418a, false);
        try {
            ArrayList arrayList = new ArrayList(cursorM8212b.getCount());
            while (cursorM8212b.moveToNext()) {
                arrayList.add(cursorM8212b.isNull(0) ? null : cursorM8212b.getString(0));
            }
            return arrayList;
        } finally {
            cursorM8212b.close();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c2315mM3418a.m3425m();
        }
    }

    /* JADX INFO: renamed from: o */
    public ArrayList m12645o(String str) {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        C2315m c2315mM3418a = C2315m.m3418a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (str == null) {
            c2315mM3418a.mo3426s0(1);
        } else {
            c2315mM3418a.mo3422c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34064a;
        workDatabase_Impl.m12339b();
        Cursor cursorM8212b = AbstractC7918J5.m8212b(workDatabase_Impl, c2315mM3418a, false);
        try {
            ArrayList arrayList = new ArrayList(cursorM8212b.getCount());
            while (cursorM8212b.moveToNext()) {
                arrayList.add(cursorM8212b.isNull(0) ? null : cursorM8212b.getString(0));
            }
            return arrayList;
        } finally {
            cursorM8212b.close();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c2315mM3418a.m3425m();
        }
    }

    /* JADX INFO: renamed from: q */
    public ArrayList m12647q(String str) {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        C2315m c2315mM3418a = C2315m.m3418a(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            c2315mM3418a.mo3426s0(1);
        } else {
            c2315mM3418a.mo3422c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34064a;
        workDatabase_Impl.m12339b();
        Cursor cursorM8212b = AbstractC7918J5.m8212b(workDatabase_Impl, c2315mM3418a, false);
        try {
            ArrayList arrayList = new ArrayList(cursorM8212b.getCount());
            while (cursorM8212b.moveToNext()) {
                String id2 = cursorM8212b.isNull(0) ? null : cursorM8212b.getString(0);
                EnumC7019y enumC7019yM8171j = AbstractC7881F0.m8171j(cursorM8212b.getInt(1));
                AbstractC16544l.m18094g(id2, "id");
                C11243n c11243n = new C11243n();
                c11243n.f34021a = id2;
                c11243n.f34022b = enumC7019yM8171j;
                arrayList.add(c11243n);
            }
            return arrayList;
        } finally {
            cursorM8212b.close();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c2315mM3418a.m3425m();
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m12648r() {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        boolean z6 = false;
        C2315m c2315mM3418a = C2315m.m3418a(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34064a;
        workDatabase_Impl.m12339b();
        Cursor cursorM8212b = AbstractC7918J5.m8212b(workDatabase_Impl, c2315mM3418a, false);
        try {
            if (cursorM8212b.moveToFirst() && cursorM8212b.getInt(0) != 0) {
                z6 = true;
            }
            return z6;
        } finally {
            cursorM8212b.close();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c2315mM3418a.m3425m();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m12649s(String str) {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34064a;
        workDatabase_Impl.m12339b();
        C11237h c11237h = (C11237h) this.f34069f;
        C4262h c4262hM1928a = c11237h.m1928a();
        if (str == null) {
            c4262hM1928a.mo3426s0(1);
        } else {
            c4262hM1928a.mo3422c(1, str);
        }
        workDatabase_Impl.m12340c();
        try {
            c4262hM1928a.m5034e();
            workDatabase_Impl.m12352o();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
            }
        } finally {
            workDatabase_Impl.m12348k();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c11237h.m1942o(c4262hM1928a);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m12650t(String str) {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34064a;
        workDatabase_Impl.m12339b();
        C11237h c11237h = (C11237h) this.f34072i;
        C4262h c4262hM1928a = c11237h.m1928a();
        if (str == null) {
            c4262hM1928a.mo3426s0(1);
        } else {
            c4262hM1928a.mo3422c(1, str);
        }
        workDatabase_Impl.m12340c();
        try {
            c4262hM1928a.m5034e();
            workDatabase_Impl.m12352o();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
            }
        } finally {
            workDatabase_Impl.m12348k();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c11237h.m1942o(c4262hM1928a);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m12651u(long j10, String str) {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34064a;
        workDatabase_Impl.m12339b();
        C11237h c11237h = (C11237h) this.f34075l;
        C4262h c4262hM1928a = c11237h.m1928a();
        c4262hM1928a.mo3420V(1, j10);
        if (str == null) {
            c4262hM1928a.mo3426s0(2);
        } else {
            c4262hM1928a.mo3422c(2, str);
        }
        workDatabase_Impl.m12340c();
        try {
            c4262hM1928a.m5034e();
            workDatabase_Impl.m12352o();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
            }
        } finally {
            workDatabase_Impl.m12348k();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c11237h.m1942o(c4262hM1928a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: v */
    public float m12652v(float f10) {
        C5994b0 c5994b0 = (C5994b0) this.f34073j;
        float fM6409g = (Float.isNaN(c5994b0.m6409g()) ? 0.0f : c5994b0.m6409g()) + f10;
        float fM5501c = m12638h().m5501c();
        Float fM19355e0 = AbstractC17680n.m19355e0(m12638h().f15815a.values());
        return AbstractC8301I.m8920k(fM6409g, fM5501c, fM19355e0 != null ? fM19355e0.floatValue() : Float.NaN);
    }

    /* JADX INFO: renamed from: w */
    public float m12653w() {
        C5994b0 c5994b0 = (C5994b0) this.f34073j;
        if (Float.isNaN(c5994b0.m6409g())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return c5994b0.m6409g();
    }

    /* JADX INFO: renamed from: x */
    public void m12654x(int i10, String str) {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34064a;
        workDatabase_Impl.m12339b();
        C11237h c11237h = (C11237h) this.f34074k;
        C4262h c4262hM1928a = c11237h.m1928a();
        if (str == null) {
            c4262hM1928a.mo3426s0(1);
        } else {
            c4262hM1928a.mo3422c(1, str);
        }
        c4262hM1928a.mo3420V(2, i10);
        workDatabase_Impl.m12340c();
        try {
            c4262hM1928a.m5034e();
            workDatabase_Impl.m12352o();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
            }
        } finally {
            workDatabase_Impl.m12348k();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c11237h.m1942o(c4262hM1928a);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m12655y(String str) {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34064a;
        workDatabase_Impl.m12339b();
        C11237h c11237h = (C11237h) this.f34073j;
        C4262h c4262hM1928a = c11237h.m1928a();
        if (str == null) {
            c4262hM1928a.mo3426s0(1);
        } else {
            c4262hM1928a.mo3422c(1, str);
        }
        workDatabase_Impl.m12340c();
        try {
            c4262hM1928a.m5034e();
            workDatabase_Impl.m12352o();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
            }
        } finally {
            workDatabase_Impl.m12348k();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c11237h.m1942o(c4262hM1928a);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m12656z(Object obj) {
        ((C6002f0) this.f34070g).setValue(obj);
    }

    /* JADX INFO: renamed from: p */
    public C11245p m12646p(String str) {
        InterfaceC15154Q interfaceC15154Q;
        C2315m c2315m;
        C11245p c11245p;
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        C2315m c2315mM3418a = C2315m.m3418a(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            c2315mM3418a.mo3426s0(1);
        } else {
            c2315mM3418a.mo3422c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34064a;
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
                    int iM8210c18 = AbstractC7910I5.m8210c(cursorM8212b, qffLJgOYizGmMj.gGQMGNmA);
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
                    if (cursorM8212b.moveToFirst()) {
                        c11245p = new C11245p(cursorM8212b.isNull(iM8210c) ? null : cursorM8212b.getString(iM8210c), AbstractC7881F0.m8171j(cursorM8212b.getInt(iM8210c2)), cursorM8212b.isNull(iM8210c3) ? null : cursorM8212b.getString(iM8210c3), cursorM8212b.isNull(iM8210c4) ? null : cursorM8212b.getString(iM8210c4), C7001g.m7401a(cursorM8212b.isNull(iM8210c5) ? null : cursorM8212b.getBlob(iM8210c5)), C7001g.m7401a(cursorM8212b.isNull(iM8210c6) ? null : cursorM8212b.getBlob(iM8210c6)), cursorM8212b.getLong(iM8210c7), cursorM8212b.getLong(iM8210c8), cursorM8212b.getLong(iM8210c9), new C6998d(AbstractC7881F0.m8169h(cursorM8212b.getInt(iM8210c23)), cursorM8212b.getInt(iM8210c24) != 0, cursorM8212b.getInt(iM8210c25) != 0, cursorM8212b.getInt(iM8210c26) != 0, cursorM8212b.getInt(iM8210c27) != 0, cursorM8212b.getLong(iM8210c28), cursorM8212b.getLong(iM8210c29), AbstractC7881F0.m8166e(cursorM8212b.isNull(iM8210c30) ? null : cursorM8212b.getBlob(iM8210c30))), cursorM8212b.getInt(iM8210c10), AbstractC7881F0.m8168g(cursorM8212b.getInt(iM8210c11)), cursorM8212b.getLong(iM8210c12), cursorM8212b.getLong(iM8210c13), cursorM8212b.getLong(iM8210c14), cursorM8212b.getLong(iM8210c15), cursorM8212b.getInt(iM8210c16) != 0, AbstractC7881F0.m8170i(cursorM8212b.getInt(iM8210c17)), cursorM8212b.getInt(iM8210c18), cursorM8212b.getInt(iM8210c19), cursorM8212b.getLong(iM8210c20), cursorM8212b.getInt(iM8210c21), cursorM8212b.getInt(iM8210c22));
                    } else {
                        c11245p = null;
                    }
                    cursorM8212b.close();
                    if (interfaceC15154Q != null) {
                        interfaceC15154Q.mo16271b();
                    }
                    c2315m.m3425m();
                    return c11245p;
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

    /* JADX INFO: renamed from: B */
    public void m12626B(long j10, String str) {
        InterfaceC15154Q interfaceC15154QMo16291v;
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        if (interfaceC15154QM16332f != null) {
            interfaceC15154QMo16291v = interfaceC15154QM16332f.mo16291v("db.sql.room", qffLJgOYizGmMj.ZftadBtXAHqKfa);
        } else {
            interfaceC15154QMo16291v = null;
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34064a;
        workDatabase_Impl.m12339b();
        C11237h c11237h = (C11237h) this.f34071h;
        C4262h c4262hM1928a = c11237h.m1928a();
        c4262hM1928a.mo3420V(1, j10);
        if (str == null) {
            c4262hM1928a.mo3426s0(2);
        } else {
            c4262hM1928a.mo3422c(2, str);
        }
        workDatabase_Impl.m12340c();
        try {
            c4262hM1928a.m5034e();
            workDatabase_Impl.m12352o();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
            }
        } finally {
            workDatabase_Impl.m12348k();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c11237h.m1942o(c4262hM1928a);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m12629E(int i10, String str) {
        InterfaceC15154Q interfaceC15154QMo16291v;
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        if (interfaceC15154QM16332f != null) {
            interfaceC15154QMo16291v = interfaceC15154QM16332f.mo16291v("db.sql.room", efyhmdM.CyujNjryKLqw);
        } else {
            interfaceC15154QMo16291v = null;
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34064a;
        workDatabase_Impl.m12339b();
        C11237h c11237h = (C11237h) this.f34077n;
        C4262h c4262hM1928a = c11237h.m1928a();
        c4262hM1928a.mo3420V(1, i10);
        if (str == null) {
            c4262hM1928a.mo3426s0(2);
        } else {
            c4262hM1928a.mo3422c(2, str);
        }
        workDatabase_Impl.m12340c();
        try {
            c4262hM1928a.m5034e();
            workDatabase_Impl.m12352o();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
            }
        } finally {
            workDatabase_Impl.m12348k();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c11237h.m1942o(c4262hM1928a);
        }
    }

    /* JADX INFO: renamed from: j */
    public ArrayList m12640j() throws Throwable {
        InterfaceC15154Q interfaceC15154QMo16291v;
        InterfaceC15154Q interfaceC15154Q;
        C2315m c2315m;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        boolean z6;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        byte[] blob3;
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        if (interfaceC15154QM16332f != null) {
            interfaceC15154QMo16291v = interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            interfaceC15154QMo16291v = null;
        }
        C2315m c2315mM3418a = C2315m.m3418a(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34064a;
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
                    int iM8210c17 = AbstractC7910I5.m8210c(cursorM8212b, suYVq.QjngHCbGooh);
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
                        if (cursorM8212b.isNull(iM8210c)) {
                            string = null;
                        } else {
                            string = cursorM8212b.getString(iM8210c);
                        }
                        EnumC7019y enumC7019yM8171j = AbstractC7881F0.m8171j(cursorM8212b.getInt(iM8210c2));
                        if (cursorM8212b.isNull(iM8210c3)) {
                            string2 = null;
                        } else {
                            string2 = cursorM8212b.getString(iM8210c3);
                        }
                        if (cursorM8212b.isNull(iM8210c4)) {
                            string3 = null;
                        } else {
                            string3 = cursorM8212b.getString(iM8210c4);
                        }
                        if (cursorM8212b.isNull(iM8210c5)) {
                            blob = null;
                        } else {
                            blob = cursorM8212b.getBlob(iM8210c5);
                        }
                        C7001g c7001gM7401a = C7001g.m7401a(blob);
                        if (cursorM8212b.isNull(iM8210c6)) {
                            blob2 = null;
                        } else {
                            blob2 = cursorM8212b.getBlob(iM8210c6);
                        }
                        C7001g c7001gM7401a2 = C7001g.m7401a(blob2);
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
                        if (cursorM8212b.getInt(iM8210c16) != 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
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
                        if (cursorM8212b.getInt(iM8210c24) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (cursorM8212b.getInt(iM8210c25) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (cursorM8212b.getInt(iM8210c26) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (cursorM8212b.getInt(iM8210c27) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        long j18 = cursorM8212b.getLong(iM8210c28);
                        iM8210c28 = iM8210c28;
                        int i25 = iM8210c29;
                        long j19 = cursorM8212b.getLong(i25);
                        iM8210c29 = i25;
                        int i26 = iM8210c30;
                        if (cursorM8212b.isNull(i26)) {
                            blob3 = null;
                        } else {
                            blob3 = cursorM8212b.getBlob(i26);
                        }
                        C6998d c6998d = new C6998d(iM8169h, z10, z11, z12, z13, j18, j19, AbstractC7881F0.m8166e(blob3));
                        iM8210c30 = i26;
                        arrayList.add(new C11245p(string, enumC7019yM8171j, string2, string3, c7001gM7401a, c7001gM7401a2, j10, j11, j12, c6998d, i11, iM8168g, j13, j14, j15, j16, z6, iM8170i, i16, i18, j17, i21, i23));
                        iM8210c = i13;
                        i10 = i12;
                    }
                    cursorM8212b.close();
                    if (interfaceC15154Q != null) {
                        interfaceC15154Q.mo16271b();
                    }
                    c2315m.m3425m();
                    return arrayList;
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

    /* JADX INFO: renamed from: k */
    public ArrayList m12641k() throws Throwable {
        InterfaceC15154Q interfaceC15154QMo16291v;
        InterfaceC15154Q interfaceC15154Q;
        C2315m c2315m;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        boolean z6;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        byte[] blob3;
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        if (interfaceC15154QM16332f != null) {
            interfaceC15154QMo16291v = interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            interfaceC15154QMo16291v = null;
        }
        C2315m c2315mM3418a = C2315m.m3418a(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34064a;
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
                int iM8210c14 = AbstractC7910I5.m8210c(cursorM8212b, IGDwkYw.bJNBDHeBieC);
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
                        if (cursorM8212b.isNull(iM8210c)) {
                            string = null;
                        } else {
                            string = cursorM8212b.getString(iM8210c);
                        }
                        EnumC7019y enumC7019yM8171j = AbstractC7881F0.m8171j(cursorM8212b.getInt(iM8210c2));
                        if (cursorM8212b.isNull(iM8210c3)) {
                            string2 = null;
                        } else {
                            string2 = cursorM8212b.getString(iM8210c3);
                        }
                        if (cursorM8212b.isNull(iM8210c4)) {
                            string3 = null;
                        } else {
                            string3 = cursorM8212b.getString(iM8210c4);
                        }
                        if (cursorM8212b.isNull(iM8210c5)) {
                            blob = null;
                        } else {
                            blob = cursorM8212b.getBlob(iM8210c5);
                        }
                        C7001g c7001gM7401a = C7001g.m7401a(blob);
                        if (cursorM8212b.isNull(iM8210c6)) {
                            blob2 = null;
                        } else {
                            blob2 = cursorM8212b.getBlob(iM8210c6);
                        }
                        C7001g c7001gM7401a2 = C7001g.m7401a(blob2);
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
                        if (cursorM8212b.getInt(iM8210c16) != 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
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
                        if (cursorM8212b.getInt(iM8210c24) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (cursorM8212b.getInt(iM8210c25) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (cursorM8212b.getInt(iM8210c26) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (cursorM8212b.getInt(iM8210c27) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        long j18 = cursorM8212b.getLong(iM8210c28);
                        iM8210c28 = iM8210c28;
                        int i25 = iM8210c29;
                        long j19 = cursorM8212b.getLong(i25);
                        iM8210c29 = i25;
                        int i26 = iM8210c30;
                        if (cursorM8212b.isNull(i26)) {
                            blob3 = null;
                        } else {
                            blob3 = cursorM8212b.getBlob(i26);
                        }
                        C6998d c6998d = new C6998d(iM8169h, z10, z11, z12, z13, j18, j19, AbstractC7881F0.m8166e(blob3));
                        iM8210c30 = i26;
                        arrayList.add(new C11245p(string, enumC7019yM8171j, string2, string3, c7001gM7401a, c7001gM7401a2, j10, j11, j12, c6998d, i11, iM8168g, j13, j14, j15, j16, z6, iM8170i, i16, i18, j17, i21, i23));
                        iM8210c = i13;
                        i10 = i12;
                    }
                    cursorM8212b.close();
                    if (interfaceC15154Q != null) {
                        interfaceC15154Q.mo16271b();
                    }
                    c2315m.m3425m();
                    return arrayList;
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

    public C11246q(EnumC3886B3 enumC3886B3, C4171z3 c4171z3, C3457c c3457c, C13781p0 c13781p0, InterfaceC1436k interfaceC1436k) {
        this.f34064a = c4171z3;
        this.f34065b = c3457c;
        this.f34066c = c13781p0;
        this.f34067d = interfaceC1436k;
        this.f34068e = new C4854S();
        this.f34069f = new C4894u(this);
        C5975S c5975s = C5975S.f19448r0;
        this.f34070g = C5997d.m6430Q(enumC3886B3, c5975s);
        this.f34071h = C5997d.m6421H(new C4886m(this, 4));
        this.f34072i = C5997d.m6421H(new C4886m(this, 2));
        this.f34073j = C5997d.m6428O(Float.NaN);
        C5997d.m6422I(new C4886m(this, 3), c5975s);
        this.f34074k = C5997d.m6428O(0.0f);
        this.f34075l = C5997d.m6430Q(null, c5975s);
        this.f34076m = C5997d.m6430Q(new C4855T(C17690x.f56481Y), c5975s);
        this.f34077n = new C4892s(this);
    }
}
