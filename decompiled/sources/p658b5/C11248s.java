package p658b5;

import android.database.Cursor;
import android.view.WindowInsetsAnimation;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.work.impl.WorkDatabase_Impl;
import ao.C11136J;
import ao.C11150Y;
import ao.InterfaceC11151Z;
import com.auth0.android.result.Credentials;
import io.sentry.AbstractC15152P0;
import io.sentry.C15524y1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15154Q;
import io.sentry.InterfaceC15523y0;
import io.sentry.protocol.C15452y;
import io.sentry.protocol.C15453z;
import io.sentry.vendor.gson.stream.C15515c;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import mm.C17296C;
import mm.C17312o;
import p001A.AbstractC0010F;
import p001A.C0018J;
import p001A.C0087s0;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.InterfaceC0571F;
import p033B5.InterfaceC0829m;
import p049Bm.InterfaceC1439n;
import p054C0.C1497j;
import p079D.AbstractC1762b;
import p1027tp.C20069m;
import p1027tp.C20077u;
import p1027tp.InterfaceC20061e;
import p103Dn.AbstractC2124C;
import p103Dn.C2127D0;
import p103Dn.C2146N;
import p103Dn.C2153Q0;
import p103Dn.C2215x0;
import p105E.C2223b;
import p110E4.C2315m;
import p113E7.InterfaceC2353a;
import p117Eb.C2392v;
import p149Fj.InterfaceC2881o;
import p199Hl.C3476a;
import p199Hl.C3477b;
import p210I7.InterfaceC3649a;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p248Jk.C4474e;
import p259K5.C4539a;
import p259K5.C4540b;
import p259K5.C4542d;
import p259K5.C4544f;
import p259K5.InterfaceC4545g;
import p301M.InterfaceC5221c;
import p379Pb.LVf.efyhmdM;
import p414R.C6778l;
import p414R.C6779m;
import p414R.InterfaceC6780n;
import p421R6.C6815a;
import p422R7.C6825j;
import p446S6.C7023b;
import p470T4.C7246k;
import p497U6.InterfaceC7569a;
import p521V6.C7829v;
import p523V9.AbstractC7855B6;
import p523V9.AbstractC7918J5;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8138m0;
import p523V9.AbstractC8230x4;
import p544W9.AbstractC8483G3;
import p571X9.AbstractC9189P2;
import p571X9.AbstractC9233X;
import p594Y9.C9895g4;
import p661b7.InterfaceC11256c;
import p729ej.C13414e;
import p743f7.C13579e;
import p743f7.InterfaceC13575a;
import p743f7.InterfaceC13576b;
import p775h2.AbstractC14376f;
import p813ij.C15026j;
import p817j$.util.concurrent.ConcurrentHashMap;
import p856kk.C16433a;
import p876lm.InterfaceC17068a;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p918o7.C17878e;
import p972qm.InterfaceC18770c;
import p979r2.C18862c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: b5.s */
/* JADX INFO: loaded from: classes.dex */
public final class C11248s implements InterfaceC5221c, InterfaceC2353a, InterfaceC4545g, InterfaceC13575a, InterfaceC7569a, InterfaceC11151Z, InterfaceC15523y0, InterfaceC20061e {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f34080Y;

    /* JADX INFO: renamed from: Z */
    public Object f34081Z;

    /* JADX INFO: renamed from: o0 */
    public Object f34082o0;

    public /* synthetic */ C11248s(int i10, boolean z6) {
        this.f34080Y = i10;
    }

    /* JADX INFO: renamed from: A */
    public C11248s m12658A(Boolean bool) throws IOException {
        C15515c c15515c = (C15515c) this.f34081Z;
        if (bool == null) {
            c15515c.m16726m();
        } else {
            c15515c.m16722S();
            c15515c.m16723a();
            c15515c.f48457Y.write(bool.booleanValue() ? "true" : "false");
        }
        return this;
    }

    @Override // p1027tp.InterfaceC20061e
    /* JADX INFO: renamed from: C */
    public Object mo10193C(C20077u c20077u) {
        Executor executor = (Executor) this.f34082o0;
        return executor == null ? c20077u : new C20069m(executor, c20077u);
    }

    /* JADX INFO: renamed from: D */
    public C11248s m12660D(String str) {
        C15515c c15515c = (C15515c) this.f34081Z;
        if (str == null) {
            c15515c.m16726m();
        } else {
            c15515c.m16722S();
            c15515c.m16723a();
            c15515c.m16721P(str);
        }
        return this;
    }

    /* JADX INFO: renamed from: E */
    public C11248s m12661E(boolean z6) throws IOException {
        C15515c c15515c = (C15515c) this.f34081Z;
        c15515c.m16722S();
        c15515c.m16723a();
        c15515c.f48457Y.write(z6 ? "true" : "false");
        return this;
    }

    @Override // p301M.InterfaceC5221c
    /* JADX INFO: renamed from: J */
    public void mo3912J(Throwable th2) {
        switch (this.f34080Y) {
            case 1:
                break;
            default:
                int i10 = ((C6778l) this.f34081Z).f21767f;
                if (i10 == 2 && (th2 instanceof CancellationException)) {
                    AbstractC8072d6.m8486c("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                } else {
                    AbstractC8072d6.m8493j("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + AbstractC9189P2.m9750b(i10), th2);
                }
                break;
        }
    }

    @Override // p743f7.InterfaceC13575a
    /* JADX INFO: renamed from: a */
    public boolean mo12662a(InterfaceC13576b writer, Object obj, int i10) {
        boolean zMo15101a;
        C6825j element = (C6825j) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(element, "element");
        AbstractC14376f.m15825D(i10, "eventType");
        byte[] bArrM8864b = AbstractC8230x4.m8864b((C11248s) this.f34081Z, element, (InterfaceC11256c) this.f34082o0);
        if (bArrM8864b == null) {
            return false;
        }
        synchronized (this) {
            zMo15101a = writer.mo15101a(new C13579e(bArrM8864b, C13579e.f42928c), i10);
        }
        return zMo15101a;
    }

    @Override // p259K5.InterfaceC4545g
    /* JADX INFO: renamed from: b */
    public long mo5312b() {
        return ((C1497j) this.f34082o0).m2157f();
    }

    @Override // ao.InterfaceC11151Z
    /* JADX INFO: renamed from: c */
    public Object mo12376c(InterfaceC3756d interfaceC3756d, ArrayList arrayList) {
        Object objM9806b;
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f34082o0;
        Class clsM8667b = AbstractC8138m0.m8667b(interfaceC3756d);
        Object c11150y = concurrentHashMap.get(clsM8667b);
        if (c11150y == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsM8667b, (c11150y = new C11150Y()))) != null) {
            c11150y = objPutIfAbsent;
        }
        C11150Y c11150y2 = (C11150Y) c11150y;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C11136J((InterfaceC3777y) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = c11150y2.f33788a;
        Object obj = concurrentHashMap2.get(arrayList2);
        if (obj == null) {
            try {
                objM9806b = (KSerializer) ((InterfaceC1439n) this.f34081Z).invoke(interfaceC3756d, arrayList);
            } catch (Throwable th2) {
                objM9806b = AbstractC9233X.m9806b(th2);
            }
            C17312o c17312o = new C17312o(objM9806b);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, c17312o);
            obj = objPutIfAbsent2 == null ? c17312o : objPutIfAbsent2;
        }
        return ((C17312o) obj).f55139Y;
    }

    @Override // p259K5.InterfaceC4545g
    public void clear() {
        ((C1497j) this.f34082o0).m2159i(-1L);
    }

    /* JADX INFO: renamed from: d */
    public C11248s m12663d() {
        C15515c c15515c = (C15515c) this.f34081Z;
        c15515c.m16722S();
        c15515c.m16723a();
        int i10 = c15515c.f48459o0;
        int[] iArr = c15515c.f48458Z;
        if (i10 == iArr.length) {
            c15515c.f48458Z = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = c15515c.f48458Z;
        int i11 = c15515c.f48459o0;
        c15515c.f48459o0 = i11 + 1;
        iArr2[i11] = 3;
        c15515c.f48457Y.write(123);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public boolean m12664e(C11239j c11239j) {
        boolean zContainsKey;
        synchronized (this.f34081Z) {
            zContainsKey = ((LinkedHashMap) this.f34082o0).containsKey(c11239j);
        }
        return zContainsKey;
    }

    @Override // p497U6.InterfaceC7569a
    /* JADX INFO: renamed from: f */
    public void mo7759f(C6815a error) {
        AbstractC16544l.m18094g(error, "error");
        ((C7829v) this.f34081Z).f24718a.mo7759f(new C7023b("Could not verify the ID token", error));
    }

    @Override // p113E7.InterfaceC2353a
    /* JADX INFO: renamed from: g */
    public String mo3437g(Object model) {
        AbstractC16544l.m18094g(model, "model");
        Object objMo4356h = ((InterfaceC3649a) this.f34081Z).mo4356h(model);
        if (objMo4356h == null) {
            return null;
        }
        return ((InterfaceC2353a) this.f34082o0).mo3437g(objMo4356h);
    }

    /* JADX INFO: renamed from: h */
    public C11248s m12665h() {
        ((C15515c) this.f34081Z).m16724e('}', 3, 5);
        return this;
    }

    @Override // p259K5.InterfaceC4545g
    /* JADX INFO: renamed from: i */
    public void mo5313i(long j10) {
        ((C1497j) this.f34082o0).m2159i(j10);
    }

    @Override // p259K5.InterfaceC4545g
    /* JADX INFO: renamed from: j */
    public C4540b mo5314j(C4539a c4539a) {
        C4542d c4542d = (C4542d) ((LinkedHashMap) ((C1497j) this.f34082o0).f3972o0).get(c4539a);
        if (c4542d != null) {
            return new C4540b(c4542d.f14847a, c4542d.f14848b);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public ArrayList m12666k(Map map, ArrayList arrayList, boolean z6) {
        Thread threadCurrentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!map.containsKey(threadCurrentThread)) {
            map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (Map.Entry entry : map.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            boolean z10 = (thread == threadCurrentThread && !z6) || (arrayList != null && arrayList.contains(Long.valueOf(thread.getId())));
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
            Thread thread2 = (Thread) entry.getKey();
            C15453z c15453z = new C15453z();
            c15453z.f48263o0 = thread2.getName();
            c15453z.f48262Z = Integer.valueOf(thread2.getPriority());
            c15453z.f48261Y = Long.valueOf(thread2.getId());
            c15453z.f48267s0 = Boolean.valueOf(thread2.isDaemon());
            c15453z.f48264p0 = thread2.getState().name();
            c15453z.f48265q0 = Boolean.valueOf(z10);
            ArrayList arrayListM10563z = ((C9895g4) this.f34081Z).m10563z(stackTraceElementArr, false);
            if (((C15524y1) this.f34082o0).isAttachStacktrace() && arrayListM10563z != null && !arrayListM10563z.isEmpty()) {
                C15452y c15452y = new C15452y(arrayListM10563z);
                c15452y.f48259o0 = Boolean.TRUE;
                c15453z.f48269u0 = c15452y;
            }
            arrayList2.add(c15453z);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: l */
    public ArrayList m12667l(String str) {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkTagDao") : null;
        C2315m c2315mM3418a = C2315m.m3418a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            c2315mM3418a.mo3426s0(1);
        } else {
            c2315mM3418a.mo3422c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34081Z;
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

    @Override // p1027tp.InterfaceC20061e
    /* JADX INFO: renamed from: m */
    public Type mo10217m() {
        return (Type) this.f34081Z;
    }

    @Override // p259K5.InterfaceC4545g
    /* JADX INFO: renamed from: n */
    public boolean mo5315n(C4539a c4539a) {
        C1497j c1497j = (C1497j) this.f34082o0;
        Object objRemove = ((LinkedHashMap) c1497j.f3972o0).remove(c4539a);
        if (objRemove != null) {
            c1497j.f3971Z = c1497j.m2157f() - c1497j.m2158h(c4539a, objRemove);
            c1497j.m2155d(c4539a, objRemove, null);
        }
        return objRemove != null;
    }

    /* JADX INFO: renamed from: o */
    public C11248s m12668o(String str) {
        C15515c c15515c = (C15515c) this.f34081Z;
        if (str == null) {
            c15515c.getClass();
            throw new NullPointerException("name == null");
        }
        if (c15515c.f48463s0 != null) {
            throw new IllegalStateException();
        }
        if (c15515c.f48459o0 == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        c15515c.f48463s0 = str;
        return this;
    }

    @Override // p301M.InterfaceC5221c, p746fa.InterfaceC13596e
    public void onSuccess(Object obj) {
        switch (this.f34080Y) {
            case 1:
                ((C0018J) this.f34082o0).f102y0.remove((C0087s0) this.f34081Z);
                int iM24h = AbstractC0010F.m24h(((C0018J) this.f34082o0).f89T0);
                if (iM24h != 1 && iM24h != 4) {
                    if (iM24h == 5 || (iM24h == 6 && ((C0018J) this.f34082o0).f100w0 != 0)) {
                        ((C0018J) this.f34082o0).m126v("Camera reopen required. Checking if the current camera can be closed safely.", null);
                    }
                }
                if (((C0018J) this.f34082o0).f102y0.isEmpty()) {
                    C0018J c0018j = (C0018J) this.f34082o0;
                    if (c0018j.f99v0 != null) {
                        c0018j.m126v("closing camera", null);
                        ((C0018J) this.f34082o0).f99v0.close();
                        ((C0018J) this.f34082o0).f99v0 = null;
                    }
                }
                break;
            case 12:
                C6779m c6779m = (C6779m) obj;
                c6779m.getClass();
                ((InterfaceC6780n) ((C2392v) this.f34082o0).f7436Z).mo7202b(c6779m);
                break;
            default:
                ((C7829v) this.f34081Z).f24718a.onSuccess((Credentials) this.f34082o0);
                break;
        }
    }

    @Override // p259K5.InterfaceC4545g
    /* JADX INFO: renamed from: q */
    public void mo5316q(C4539a c4539a, InterfaceC0829m interfaceC0829m, Map map, long j10) {
        C1497j c1497j = (C1497j) this.f34082o0;
        long j11 = c1497j.f3970Y;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c1497j.f3972o0;
        if (j10 > j11) {
            Object objRemove = linkedHashMap.remove(c4539a);
            if (objRemove != null) {
                c1497j.f3971Z = c1497j.m2157f() - c1497j.m2158h(c4539a, objRemove);
                c1497j.m2155d(c4539a, objRemove, null);
            }
            ((C4544f) this.f34081Z).m5309c(c4539a, interfaceC0829m, map, j10);
            return;
        }
        C4542d c4542d = new C4542d(interfaceC0829m, map, j10);
        Object objPut = linkedHashMap.put(c4539a, c4542d);
        c1497j.f3971Z = c1497j.m2158h(c4539a, c4542d) + c1497j.m2157f();
        if (objPut != null) {
            c1497j.f3971Z = c1497j.m2157f() - c1497j.m2158h(c4539a, objPut);
            c1497j.m2155d(c4539a, objPut, c4542d);
        }
        c1497j.m2159i(c1497j.f3970Y);
    }

    /* JADX INFO: renamed from: r */
    public C0564B0 m12669r(AbstractC7855B6 abstractC7855B6, InterfaceC0571F scope) {
        AbstractC16544l.m18094g(scope, "scope");
        return AbstractC0575H.m1156D(scope, null, null, new C3476a(this, abstractC7855B6, null), 3);
    }

    /* JADX INFO: renamed from: s */
    public Object m12670s(AbstractC7855B6 abstractC7855B6, InterfaceC18770c interfaceC18770c) {
        Object objMo395a = ((C2127D0) this.f34081Z).mo395a(abstractC7855B6, interfaceC18770c);
        return objMo395a == EnumC19250a.f61036Y ? objMo395a : C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: t */
    public Object m12671t(ArrayList arrayList, AbstractC19687c abstractC19687c) {
        C3477b c3477b;
        Iterator it;
        C11248s c11248s;
        if (abstractC19687c instanceof C3477b) {
            c3477b = (C3477b) abstractC19687c;
            int i10 = c3477b.f10546q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3477b.f10546q0 = i10 - Integer.MIN_VALUE;
            } else {
                c3477b = new C3477b(this, abstractC19687c);
            }
        } else {
            c3477b = new C3477b(this, abstractC19687c);
        }
        Object obj = c3477b.f10544o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c3477b.f10546q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            it = arrayList.iterator();
            c11248s = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c3477b.f10543Z;
            c11248s = c3477b.f10542Y;
            AbstractC9233X.m9807c(obj);
        }
        while (it.hasNext()) {
            Object next = it.next();
            C2127D0 c2127d0 = (C2127D0) c11248s.f34081Z;
            c3477b.f10542Y = c11248s;
            c3477b.f10543Z = it;
            c3477b.f10546q0 = 1;
            if (c2127d0.mo395a(next, c3477b) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }

    public String toString() {
        switch (this.f34080Y) {
            case 2:
                return "Bounds{lower=" + ((C18862c) this.f34081Z) + " upper=" + ((C18862c) this.f34082o0) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public C7246k m12672u(C11239j c11239j) {
        C7246k c7246k;
        synchronized (this.f34081Z) {
            c7246k = (C7246k) ((LinkedHashMap) this.f34082o0).remove(c11239j);
        }
        return c7246k;
    }

    /* JADX INFO: renamed from: v */
    public List m12673v(String workSpecId) {
        List listM19322C0;
        AbstractC16544l.m18094g(workSpecId, "workSpecId");
        synchronized (this.f34081Z) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f34082o0;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (AbstractC16544l.m18089b(((C11239j) entry.getKey()).f34012a, workSpecId)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.f34082o0).remove((C11239j) it.next());
                }
                listM19322C0 = AbstractC17680n.m19322C0(linkedHashMap2.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listM19322C0;
    }

    /* JADX INFO: renamed from: w */
    public C7246k m12674w(C11239j c11239j) {
        C7246k c7246k;
        synchronized (this.f34081Z) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f34082o0;
                Object c7246k2 = linkedHashMap.get(c11239j);
                if (c7246k2 == null) {
                    c7246k2 = new C7246k(c11239j);
                    linkedHashMap.put(c11239j, c7246k2);
                }
                c7246k = (C7246k) c7246k2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c7246k;
    }

    /* JADX INFO: renamed from: x */
    public C11248s m12675x(double d10) throws IOException {
        C15515c c15515c = (C15515c) this.f34081Z;
        c15515c.m16722S();
        if (c15515c.f48462r0 || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            c15515c.m16723a();
            c15515c.f48457Y.append((CharSequence) Double.toString(d10));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
    }

    /* JADX INFO: renamed from: y */
    public C11248s m12676y(long j10) throws IOException {
        C15515c c15515c = (C15515c) this.f34081Z;
        c15515c.m16722S();
        c15515c.m16723a();
        c15515c.f48457Y.write(Long.toString(j10));
        return this;
    }

    /* JADX INFO: renamed from: z */
    public C11248s m12677z(InterfaceC15127H interfaceC15127H, Object obj) {
        ((C13414e) this.f34082o0).m14954G(this, interfaceC15127H, obj);
        return this;
    }

    public /* synthetic */ C11248s(Object obj, int i10, Object obj2) {
        this.f34080Y = i10;
        this.f34082o0 = obj;
        this.f34081Z = obj2;
    }

    /* JADX INFO: renamed from: B */
    public C11248s m12659B(Number number) throws IOException {
        C15515c c15515c = (C15515c) this.f34081Z;
        if (number == null) {
            c15515c.m16726m();
        } else {
            c15515c.m16722S();
            String string = number.toString();
            if (!c15515c.f48462r0 && (string.equals("-Infinity") || string.equals("Infinity") || string.equals(efyhmdM.PKKnCULRHfbEqIx))) {
                throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
            }
            c15515c.m16723a();
            c15515c.f48457Y.append((CharSequence) string);
        }
        return this;
    }

    public /* synthetic */ C11248s(Object obj, Object obj2, boolean z6, int i10) {
        this.f34080Y = i10;
        this.f34081Z = obj;
        this.f34082o0 = obj2;
    }

    public C11248s(Number number) {
        this.f34080Y = 28;
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(number);
        this.f34081Z = c2153q0M3204c;
        this.f34082o0 = new C2146N(c2153q0M3204c, 0);
    }

    public C11248s(Writer writer, int i10) {
        this.f34080Y = 23;
        this.f34081Z = new C15515c(writer);
        this.f34082o0 = new C13414e(i10);
    }

    public C11248s(C17878e internalLogger) {
        this.f34080Y = 26;
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f34081Z = internalLogger;
        this.f34082o0 = new LinkedHashMap();
    }

    public C11248s(C4474e context, InterfaceC17068a hapticEngine) {
        this.f34080Y = 21;
        AbstractC16544l.m18094g(hapticEngine, "hapticEngine");
        AbstractC16544l.m18094g(context, "context");
        this.f34081Z = hapticEngine;
        this.f34082o0 = context;
    }

    public C11248s(C11248s c11248s, InterfaceC11256c internalLogger) {
        this.f34080Y = 11;
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f34081Z = c11248s;
        this.f34082o0 = internalLogger;
    }

    public C11248s(Object obj) {
        this.f34080Y = 27;
        this.f34081Z = obj;
        this.f34082o0 = Thread.currentThread();
    }

    public C11248s(int i10) {
        this.f34080Y = i10;
        switch (i10) {
            case 13:
                this.f34081Z = new Object();
                this.f34082o0 = new LinkedHashMap();
                break;
            case 18:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f34081Z = byteArrayOutputStream;
                this.f34082o0 = new DataOutputStream(byteArrayOutputStream);
                break;
            case 20:
                this.f34081Z = new C15026j();
                this.f34082o0 = new C15026j();
                break;
            default:
                C2127D0 c2127d0M3203b = AbstractC2124C.m3203b(0, Integer.MAX_VALUE, null, 5);
                this.f34081Z = c2127d0M3203b;
                this.f34082o0 = new C2215x0(c2127d0M3203b);
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m12657p(Throwable th2) {
    }

    public C11248s(WorkDatabase_Impl workDatabase_Impl) {
        this.f34080Y = 0;
        this.f34081Z = workDatabase_Impl;
        this.f34082o0 = new C11231b(workDatabase_Impl, 6);
        new C11237h(workDatabase_Impl, 20);
    }

    public C11248s(C9895g4 c9895g4, C15524y1 c15524y1) {
        this.f34080Y = 24;
        this.f34081Z = c9895g4;
        AbstractC8483G3.m9133c(c15524y1, "The SentryOptions is required");
        this.f34082o0 = c15524y1;
    }

    public C11248s(InterfaceC2881o service, C16433a imageHelper) {
        this.f34080Y = 5;
        AbstractC16544l.m18094g(service, "service");
        AbstractC16544l.m18094g(imageHelper, "imageHelper");
        this.f34081Z = service;
        this.f34082o0 = imageHelper;
    }

    public C11248s(String str) {
        this.f34080Y = 4;
        this.f34081Z = (ExtraSupportedOutputSizeQuirk) AbstractC1762b.f5032a.m4579f(ExtraSupportedOutputSizeQuirk.class);
        this.f34082o0 = new C2223b(str);
    }

    public C11248s(long j10, C4544f c4544f) {
        this.f34080Y = 8;
        this.f34081Z = c4544f;
        C1497j c1497j = new C1497j();
        c1497j.f3973p0 = this;
        c1497j.f3970Y = j10;
        c1497j.f3972o0 = new LinkedHashMap(0, 0.75f, true);
        if (j10 > 0) {
            this.f34082o0 = c1497j;
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public C11248s(InterfaceC1439n interfaceC1439n) {
        this.f34080Y = 19;
        this.f34081Z = interfaceC1439n;
        this.f34082o0 = new ConcurrentHashMap();
    }

    public C11248s(WindowInsetsAnimation.Bounds bounds) {
        this.f34080Y = 2;
        this.f34081Z = C18862c.m20172c(bounds.getLowerBound());
        this.f34082o0 = C18862c.m20172c(bounds.getUpperBound());
    }
}
