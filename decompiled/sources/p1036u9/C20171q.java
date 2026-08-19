package p1036u9;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import ca.C11692a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC11852a;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.android.core.RunnableC15195M;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p001A.C0042V0;
import p003A1.AbstractC0168G;
import p011A9.C0415f;
import p1009s9.C19499b;
import p1009s9.C19501d;
import p1009s9.C19502e;
import p1022t9.AbstractC19821f;
import p1022t9.InterfaceC19818c;
import p1022t9.InterfaceC19822g;
import p1022t9.InterfaceC19823h;
import p1060v9.AbstractC20502t;
import p1060v9.C20485c;
import p1060v9.C20491i;
import p1102x9.C21159c;
import p1139z0.C21585H;
import p377P9.HandlerC6378d;
import p434Rk.C6912d;
import p468T2.RunnableC7216h;
import p588Y2.C9642z;
import p692d0.C12966e;
import p692d0.C12967f;
import p702da.C13049a;
import p746fa.C13599h;
import p935p.RunnableC18260f;
import p999s.C19341c1;
import sk.C19662a;

/* JADX INFO: renamed from: u9.q */
/* JADX INFO: loaded from: classes.dex */
public final class C20171q implements InterfaceC19822g, InterfaceC19823h {

    /* JADX INFO: renamed from: b */
    public final InterfaceC19818c f63885b;

    /* JADX INFO: renamed from: c */
    public final C20155a f63886c;

    /* JADX INFO: renamed from: d */
    public final C21585H f63887d;

    /* JADX INFO: renamed from: g */
    public final int f63890g;

    /* JADX INFO: renamed from: h */
    public final BinderC20179y f63891h;

    /* JADX INFO: renamed from: i */
    public boolean f63892i;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C20159e f63896m;

    /* JADX INFO: renamed from: a */
    public final LinkedList f63884a = new LinkedList();

    /* JADX INFO: renamed from: e */
    public final HashSet f63888e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final HashMap f63889f = new HashMap();

    /* JADX INFO: renamed from: j */
    public final ArrayList f63893j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public C19499b f63894k = null;

    /* JADX INFO: renamed from: l */
    public int f63895l = 0;

    public C20171q(C20159e c20159e, AbstractC19821f abstractC19821f) {
        this.f63896m = c20159e;
        Looper looper = c20159e.f63870z0.getLooper();
        C20485c c20485cM20769a = abstractC19821f.m20769a();
        C19341c1 c19341c1 = new C19341c1((String) c20485cM20769a.f65030b, (String) c20485cM20769a.f65031c, (C12967f) c20485cM20769a.f65029a);
        C0415f c0415f = (C0415f) abstractC19821f.f62876c.f33996Y;
        AbstractC20502t.m21157h(c0415f);
        InterfaceC19818c interfaceC19818cM1027c = c0415f.m1027c(abstractC19821f.f62874a, looper, c19341c1, abstractC19821f.f62877d, this, this);
        String str = abstractC19821f.f62875b;
        if (str != null && (interfaceC19818cM1027c instanceof AbstractC11852a)) {
            ((AbstractC11852a) interfaceC19818cM1027c).f36085r = str;
        }
        if (str != null && (interfaceC19818cM1027c instanceof AbstractServiceConnectionC20164j)) {
            AbstractC0168G.m507B(interfaceC19818cM1027c);
            throw null;
        }
        this.f63885b = interfaceC19818cM1027c;
        this.f63886c = abstractC19821f.f62878e;
        this.f63887d = new C21585H(19, (byte) 0);
        this.f63890g = abstractC19821f.f62880g;
        if (!interfaceC19818cM1027c.mo13208m()) {
            this.f63891h = null;
            return;
        }
        Context context = c20159e.f63861q0;
        HandlerC6378d handlerC6378d = c20159e.f63870z0;
        C20485c c20485cM20769a2 = abstractC19821f.m20769a();
        this.f63891h = new BinderC20179y(context, handlerC6378d, new C19341c1((String) c20485cM20769a2.f65030b, (String) c20485cM20769a2.f65031c, (C12967f) c20485cM20769a2.f65029a));
    }

    /* JADX INFO: renamed from: a */
    public final void m20993a(C19499b c19499b) {
        HashSet hashSet = this.f63888e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (AbstractC20502t.m21161l(c19499b, C19499b.f61938q0)) {
                this.f63885b.mo13201e();
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20994b(Status status) {
        AbstractC20502t.m21152c(this.f63896m.f63870z0);
        m20995c(status, null, false);
    }

    /* JADX INFO: renamed from: c */
    public final void m20995c(Status status, RuntimeException runtimeException, boolean z6) {
        AbstractC20502t.m21152c(this.f63896m.f63870z0);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f63884a.iterator();
        while (it.hasNext()) {
            AbstractC20151C abstractC20151C = (AbstractC20151C) it.next();
            if (!z6 || abstractC20151C.f63832a == 2) {
                if (status != null) {
                    abstractC20151C.mo20963a(status);
                } else {
                    abstractC20151C.mo20964b(runtimeException);
                }
                it.remove();
            }
        }
    }

    @Override // p1022t9.InterfaceC19823h
    /* JADX INFO: renamed from: d */
    public final void mo20772d(C19499b c19499b) {
        m21004n(c19499b, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m20996e() {
        LinkedList linkedList = this.f63884a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC20151C abstractC20151C = (AbstractC20151C) arrayList.get(i10);
            if (!this.f63885b.mo13197a()) {
                return;
            }
            if (m21000j(abstractC20151C)) {
                linkedList.remove(abstractC20151C);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m20997f() {
        C20159e c20159e = this.f63896m;
        AbstractC20502t.m21152c(c20159e.f63870z0);
        this.f63894k = null;
        m20993a(C19499b.f61938q0);
        if (this.f63892i) {
            HandlerC6378d handlerC6378d = c20159e.f63870z0;
            C20155a c20155a = this.f63886c;
            handlerC6378d.removeMessages(11, c20155a);
            c20159e.f63870z0.removeMessages(9, c20155a);
            this.f63892i = false;
        }
        Iterator it = this.f63889f.values().iterator();
        if (it.hasNext()) {
            throw null;
        }
        m20996e();
        m20999h();
    }

    /* JADX INFO: renamed from: g */
    public final void m20998g(int i10) {
        C20159e c20159e = this.f63896m;
        AbstractC20502t.m21152c(c20159e.f63870z0);
        this.f63894k = null;
        this.f63892i = true;
        String strMo13207l = this.f63885b.mo13207l();
        C21585H c21585h = this.f63887d;
        c21585h.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (strMo13207l != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(strMo13207l);
        }
        c21585h.m21922C(true, new Status(20, sb2.toString(), null, null));
        HandlerC6378d handlerC6378d = c20159e.f63870z0;
        C20155a c20155a = this.f63886c;
        handlerC6378d.sendMessageDelayed(Message.obtain(handlerC6378d, 9, c20155a), 5000L);
        HandlerC6378d handlerC6378d2 = c20159e.f63870z0;
        handlerC6378d2.sendMessageDelayed(Message.obtain(handlerC6378d2, 11, c20155a), 120000L);
        ((SparseIntArray) c20159e.f63863s0.f62320Y).clear();
        Iterator it = this.f63889f.values().iterator();
        while (it.hasNext()) {
            ((AbstractC20178x) it.next()).getClass();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m20999h() {
        C20159e c20159e = this.f63896m;
        HandlerC6378d handlerC6378d = c20159e.f63870z0;
        C20155a c20155a = this.f63886c;
        handlerC6378d.removeMessages(12, c20155a);
        HandlerC6378d handlerC6378d2 = c20159e.f63870z0;
        handlerC6378d2.sendMessageDelayed(handlerC6378d2.obtainMessage(12, c20155a), c20159e.f63857Y);
    }

    @Override // p1022t9.InterfaceC19822g
    /* JADX INFO: renamed from: i */
    public final void mo20771i(int i10) {
        Looper looperMyLooper = Looper.myLooper();
        C20159e c20159e = this.f63896m;
        if (looperMyLooper == c20159e.f63870z0.getLooper()) {
            m20998g(i10);
        } else {
            c20159e.f63870z0.post(new RunnableC7216h(this, i10, 4));
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m21000j(AbstractC20151C abstractC20151C) {
        C19501d c19501d;
        if (!(abstractC20151C instanceof AbstractC20174t)) {
            InterfaceC19818c interfaceC19818c = this.f63885b;
            abstractC20151C.mo20966d(this.f63887d, interfaceC19818c.mo13208m());
            try {
                abstractC20151C.mo20965c(this);
            } catch (DeadObjectException unused) {
                mo20771i(1);
                interfaceC19818c.mo13199c("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        AbstractC20174t abstractC20174t = (AbstractC20174t) abstractC20151C;
        C19501d[] c19501dArrMo20968g = abstractC20174t.mo20968g(this);
        if (c19501dArrMo20968g == null || c19501dArrMo20968g.length == 0) {
            c19501d = null;
            break;
        }
        C19501d[] c19501dArrMo13206k = this.f63885b.mo13206k();
        if (c19501dArrMo13206k == null) {
            c19501dArrMo13206k = new C19501d[0];
        }
        C12966e c12966e = new C12966e(c19501dArrMo13206k.length);
        for (C19501d c19501d2 : c19501dArrMo13206k) {
            c12966e.put(c19501d2.f61946Y, Long.valueOf(c19501d2.m20594b()));
        }
        int length = c19501dArrMo20968g.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                c19501d = null;
                break;
            }
            c19501d = c19501dArrMo20968g[i10];
            Long l4 = (Long) c12966e.get(c19501d.f61946Y);
            if (l4 == null || l4.longValue() < c19501d.m20594b()) {
                break;
            }
            i10++;
        }
        if (c19501d == null) {
            InterfaceC19818c interfaceC19818c2 = this.f63885b;
            abstractC20151C.mo20966d(this.f63887d, interfaceC19818c2.mo13208m());
            try {
                abstractC20151C.mo20965c(this);
            } catch (DeadObjectException unused2) {
                mo20771i(1);
                interfaceC19818c2.mo13199c("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        AbstractC15256t.m16482t("GoogleApiManager", this.f63885b.getClass().getName() + " could not execute call because it requires feature (" + c19501d.f61946Y + ", " + c19501d.m20594b() + ").");
        if (!this.f63896m.f63856A0 || !abstractC20174t.mo20967f(this)) {
            abstractC20174t.mo20964b(new C6912d(c19501d));
            return true;
        }
        C20172r c20172r = new C20172r(this.f63886c, c19501d);
        int iIndexOf = this.f63893j.indexOf(c20172r);
        if (iIndexOf >= 0) {
            C20172r c20172r2 = (C20172r) this.f63893j.get(iIndexOf);
            this.f63896m.f63870z0.removeMessages(15, c20172r2);
            HandlerC6378d handlerC6378d = this.f63896m.f63870z0;
            handlerC6378d.sendMessageDelayed(Message.obtain(handlerC6378d, 15, c20172r2), 5000L);
        } else {
            this.f63893j.add(c20172r);
            HandlerC6378d handlerC6378d2 = this.f63896m.f63870z0;
            handlerC6378d2.sendMessageDelayed(Message.obtain(handlerC6378d2, 15, c20172r), 5000L);
            HandlerC6378d handlerC6378d3 = this.f63896m.f63870z0;
            handlerC6378d3.sendMessageDelayed(Message.obtain(handlerC6378d3, 16, c20172r), 120000L);
            C19499b c19499b = new C19499b(2, null);
            if (!m21001k(c19499b)) {
                this.f63896m.m20982d(c19499b, this.f63890g);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m21001k(C19499b c19499b) {
        AtomicReference atomicReference;
        synchronized (C20159e.f63854D0) {
            try {
                C20159e c20159e = this.f63896m;
                if (c20159e.f63867w0 == null || !c20159e.f63868x0.contains(this.f63886c)) {
                    return false;
                }
                DialogInterfaceOnCancelListenerC20169o dialogInterfaceOnCancelListenerC20169o = this.f63896m.f63867w0;
                int i10 = this.f63890g;
                dialogInterfaceOnCancelListenerC20169o.getClass();
                C20152D c20152d = new C20152D(c19499b, i10);
                loop0: do {
                    atomicReference = dialogInterfaceOnCancelListenerC20169o.f63878o0;
                    do {
                        if (atomicReference.compareAndSet(null, c20152d)) {
                            dialogInterfaceOnCancelListenerC20169o.f63879p0.post(new RunnableC15195M(dialogInterfaceOnCancelListenerC20169o, 18, c20152d));
                            break loop0;
                        }
                    } while (atomicReference.get() == null);
                } while (atomicReference.get() == null);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m21002l() {
        C20159e c20159e = this.f63896m;
        AbstractC20502t.m21152c(c20159e.f63870z0);
        InterfaceC19818c interfaceC19818c = this.f63885b;
        if (interfaceC19818c.mo13197a() || interfaceC19818c.mo13200d()) {
            return;
        }
        try {
            C19662a c19662a = c20159e.f63863s0;
            Context context = c20159e.f63861q0;
            c19662a.getClass();
            AbstractC20502t.m21157h(context);
            int iMo1030j = interfaceC19818c.mo1030j();
            SparseIntArray sparseIntArray = (SparseIntArray) c19662a.f62320Y;
            int iM20602c = sparseIntArray.get(iMo1030j, -1);
            if (iM20602c == -1) {
                iM20602c = 0;
                int i10 = 0;
                while (true) {
                    if (i10 >= sparseIntArray.size()) {
                        iM20602c = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i10);
                    if (iKeyAt > iMo1030j && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (iM20602c == -1) {
                    iM20602c = ((C19502e) c19662a.f62321Z).m20602c(context, iMo1030j);
                }
                sparseIntArray.put(iMo1030j, iM20602c);
            }
            if (iM20602c != 0) {
                C19499b c19499b = new C19499b(iM20602c, null);
                AbstractC15256t.m16482t("GoogleApiManager", "The service for " + interfaceC19818c.getClass().getName() + " is not available: " + c19499b.toString());
                m21004n(c19499b, null);
                return;
            }
            C0042V0 c0042v0 = new C0042V0(c20159e, interfaceC19818c, this.f63886c);
            if (interfaceC19818c.mo13208m()) {
                BinderC20179y binderC20179y = this.f63891h;
                AbstractC20502t.m21157h(binderC20179y);
                C13049a c13049a = binderC20179y.f63918g;
                if (c13049a != null) {
                    c13049a.mo13203g();
                }
                Integer numValueOf = Integer.valueOf(System.identityHashCode(binderC20179y));
                C19341c1 c19341c1 = binderC20179y.f63917f;
                c19341c1.f61260s0 = numValueOf;
                HandlerC6378d handlerC6378d = binderC20179y.f63914c;
                binderC20179y.f63918g = (C13049a) binderC20179y.f63915d.m1027c(binderC20179y.f63913b, handlerC6378d.getLooper(), c19341c1, (C11692a) c19341c1.f61259r0, binderC20179y, binderC20179y);
                binderC20179y.f63919h = c0042v0;
                Set set = binderC20179y.f63916e;
                if (set == null || set.isEmpty()) {
                    handlerC6378d.post(new RunnableC18260f(binderC20179y, 9));
                } else {
                    C13049a c13049a2 = binderC20179y.f63918g;
                    c13049a2.getClass();
                    c13049a2.mo13205i(new C20491i(c13049a2));
                }
            }
            try {
                interfaceC19818c.mo13205i(c0042v0);
            } catch (SecurityException e10) {
                m21004n(new C19499b(10), e10);
            }
        } catch (IllegalStateException e11) {
            m21004n(new C19499b(10), e11);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m21003m(AbstractC20151C abstractC20151C) {
        AbstractC20502t.m21152c(this.f63896m.f63870z0);
        boolean zMo13197a = this.f63885b.mo13197a();
        LinkedList linkedList = this.f63884a;
        if (zMo13197a) {
            if (m21000j(abstractC20151C)) {
                m20999h();
                return;
            } else {
                linkedList.add(abstractC20151C);
                return;
            }
        }
        linkedList.add(abstractC20151C);
        C19499b c19499b = this.f63894k;
        if (c19499b == null || c19499b.f61940Z == 0 || c19499b.f61941o0 == null) {
            m21002l();
        } else {
            m21004n(c19499b, null);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m21004n(C19499b c19499b, RuntimeException runtimeException) {
        C13049a c13049a;
        AbstractC20502t.m21152c(this.f63896m.f63870z0);
        BinderC20179y binderC20179y = this.f63891h;
        if (binderC20179y != null && (c13049a = binderC20179y.f63918g) != null) {
            c13049a.mo13203g();
        }
        AbstractC20502t.m21152c(this.f63896m.f63870z0);
        this.f63894k = null;
        ((SparseIntArray) this.f63896m.f63863s0.f62320Y).clear();
        m20993a(c19499b);
        if ((this.f63885b instanceof C21159c) && c19499b.f61940Z != 24) {
            C20159e c20159e = this.f63896m;
            c20159e.f63858Z = true;
            HandlerC6378d handlerC6378d = c20159e.f63870z0;
            handlerC6378d.sendMessageDelayed(handlerC6378d.obtainMessage(19), 300000L);
        }
        if (c19499b.f61940Z == 4) {
            m20994b(C20159e.f63853C0);
            return;
        }
        if (this.f63884a.isEmpty()) {
            this.f63894k = c19499b;
            return;
        }
        if (runtimeException != null) {
            AbstractC20502t.m21152c(this.f63896m.f63870z0);
            m20995c(null, runtimeException, false);
            return;
        }
        if (!this.f63896m.f63856A0) {
            m20994b(C20159e.m20978e(this.f63886c, c19499b));
            return;
        }
        m20995c(C20159e.m20978e(this.f63886c, c19499b), null, true);
        if (this.f63884a.isEmpty() || m21001k(c19499b) || this.f63896m.m20982d(c19499b, this.f63890g)) {
            return;
        }
        if (c19499b.f61940Z == 18) {
            this.f63892i = true;
        }
        if (!this.f63892i) {
            m20994b(C20159e.m20978e(this.f63886c, c19499b));
            return;
        }
        C20159e c20159e2 = this.f63896m;
        C20155a c20155a = this.f63886c;
        HandlerC6378d handlerC6378d2 = c20159e2.f63870z0;
        handlerC6378d2.sendMessageDelayed(Message.obtain(handlerC6378d2, 9, c20155a), 5000L);
    }

    /* JADX INFO: renamed from: o */
    public final void m21005o(C19499b c19499b) {
        AbstractC20502t.m21152c(this.f63896m.f63870z0);
        InterfaceC19818c interfaceC19818c = this.f63885b;
        interfaceC19818c.mo13199c("onSignInFailed for " + interfaceC19818c.getClass().getName() + " with " + String.valueOf(c19499b));
        m21004n(c19499b, null);
    }

    @Override // p1022t9.InterfaceC19822g
    public final void onConnected() {
        Looper looperMyLooper = Looper.myLooper();
        C20159e c20159e = this.f63896m;
        if (looperMyLooper == c20159e.f63870z0.getLooper()) {
            m20997f();
        } else {
            c20159e.f63870z0.post(new RunnableC18260f(this, 7));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m21006p() {
        AbstractC20502t.m21152c(this.f63896m.f63870z0);
        Status status = C20159e.f63852B0;
        m20994b(status);
        this.f63887d.m21922C(false, status);
        for (AbstractC20163i abstractC20163i : (AbstractC20163i[]) this.f63889f.keySet().toArray(new AbstractC20163i[0])) {
            m21003m(new C20150B(abstractC20163i, new C13599h()));
        }
        m20993a(new C19499b(4));
        InterfaceC19818c interfaceC19818c = this.f63885b;
        if (interfaceC19818c.mo13197a()) {
            interfaceC19818c.mo13204h(new C9642z(this, 23));
        }
    }
}
