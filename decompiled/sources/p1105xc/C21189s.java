package p1105xc;

import gd.InterfaceC13849E;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import ni.C17629c;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0644w;
import p1061vb.C20513d;
import p1081wc.C20888g;
import p1081wc.InterfaceC20904w;
import p1111xl.C21296a;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p195Hh.C3430e;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6224C;
import p523V9.AbstractC8128k6;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p909nm.C17690x;
import p996rm.EnumC19250a;
import sk.C19665d;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: xc.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C21189s {

    /* JADX INFO: renamed from: a */
    public final C21185o f67342a;

    /* JADX INFO: renamed from: b */
    public final C17629c f67343b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC13849E f67344c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC20904w f67345d;

    /* JADX INFO: renamed from: e */
    public final long f67346e;

    /* JADX INFO: renamed from: f */
    public final int f67347f;

    /* JADX INFO: renamed from: g */
    public final C3430e f67348g;

    /* JADX INFO: renamed from: h */
    public final String f67349h;

    /* JADX INFO: renamed from: i */
    public final String f67350i;

    /* JADX INFO: renamed from: j */
    public final ReentrantLock f67351j;

    /* JADX INFO: renamed from: k */
    public C19665d f67352k;

    /* JADX INFO: renamed from: l */
    public boolean f67353l;

    /* JADX INFO: renamed from: m */
    public int f67354m;

    public C21189s(C21185o c21185o, C17629c c17629c, C20513d c20513d, InterfaceC13849E interfaceC13849E, InterfaceC20904w interfaceC20904w) {
        this.f67342a = c21185o;
        this.f67343b = c17629c;
        this.f67344c = interfaceC13849E;
        this.f67345d = interfaceC20904w;
        C21554a c21554a = C21555b.f68260Z;
        this.f67346e = C21555b.m21835e(AbstractC8128k6.m8644j(30, EnumC21557d.SECONDS));
        this.f67347f = 10;
        this.f67348g = AbstractC8168p6.m8749b("Statsc", null);
        this.f67349h = "android";
        this.f67350i = "post_errors";
        this.f67351j = new ReentrantLock();
        this.f67352k = new C19665d(5);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m21613a(C21189s c21189s, AbstractC19687c abstractC19687c) {
        C21187q c21187q;
        InterfaceC3777y interfaceC3777yM18075c;
        c21189s.getClass();
        if (abstractC19687c instanceof C21187q) {
            c21187q = (C21187q) abstractC19687c;
            int i10 = c21187q.f67339p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c21187q.f67339p0 = i10 - Integer.MIN_VALUE;
            } else {
                c21187q = new C21187q(c21189s, abstractC19687c);
            }
        } else {
            c21187q = new C21187q(c21189s, abstractC19687c);
        }
        Object objM9690b = c21187q.f67337Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c21187q.f67339p0;
        boolean z6 = true;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            ReentrantLock reentrantLock = c21189s.f67351j;
            reentrantLock.lock();
            try {
                C19665d c19665d = c21189s.f67352k;
                c21189s.f67352k = new C19665d(5);
                reentrantLock.unlock();
                ArrayList arrayListM19323D0 = AbstractC17680n.m19323D0(AbstractC17680n.m19322C0(((LinkedHashMap) c19665d.f62329Z).values()));
                if (c21189s.f67354m > 0) {
                    arrayListM19323D0.add(new C21173c(EnumC21180j.f67324o0, c21189s.f67350i, C17689w.f56480Y, c21189s.f67354m));
                }
                C21183m c21183m = new C21183m(arrayListM19323D0, AbstractC17680n.m19322C0(((LinkedHashMap) c19665d.f62330o0).values()), c21189s.f67349h);
                c21187q.f67336Y = c21189s;
                c21187q.f67339p0 = 1;
                C21185o c21185o = c21189s.f67342a;
                C21184n c21184n = new C21184n(c21185o, c21183m, null);
                InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
                try {
                    interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
                } catch (Throwable unused) {
                    interfaceC3777yM18075c = null;
                }
                objM9690b = AbstractC9144I.m9690b(c21185o.f67335a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c21184n, c21187q);
                if (objM9690b == enumC19250a) {
                    return enumC19250a;
                }
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c21189s = c21187q.f67336Y;
            AbstractC9233X.m9807c(objM9690b);
        }
        AbstractC21955Q1 abstractC21955Q1M6735b = ((AbstractC6224C) objM9690b).m6735b();
        if (!(abstractC21955Q1M6735b instanceof C21952P1)) {
            if (abstractC21955Q1M6735b instanceof AbstractC21933K1) {
                c21189s.f67345d.mo21447a(C20888g.f66545h, C17690x.f56481Y);
                ReentrantLock reentrantLock2 = c21189s.f67351j;
                reentrantLock2.lock();
                try {
                    int i12 = c21189s.f67354m + 1;
                    c21189s.f67354m = i12;
                    if (i12 > c21189s.f67347f) {
                        c21189s.f67354m = 0;
                    } else {
                        z6 = false;
                    }
                    reentrantLock2.unlock();
                    if (z6) {
                        AbstractC8160o6.m8731f(c21189s.f67348g, "Exceeded maximum number of post errors. Dropping metrics.", null, null, 6);
                    }
                    reentrantLock2.lock();
                    try {
                        c21189s.f67353l = false;
                        reentrantLock2.unlock();
                        c21189s.m21615c();
                    } catch (Throwable th3) {
                        reentrantLock2.unlock();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    reentrantLock2.unlock();
                    throw th4;
                }
            } else if (!(abstractC21955Q1M6735b instanceof C21929J1)) {
                throw new C0644w();
            }
            return C17296C.f55119a;
        }
        c21189s.m21614b();
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: b */
    public final void m21614b() {
        this.f67345d.mo21447a(C20888g.f66546i, C17690x.f56481Y);
        ReentrantLock reentrantLock = this.f67351j;
        reentrantLock.lock();
        try {
            this.f67354m = 0;
            reentrantLock.unlock();
            reentrantLock.lock();
            try {
                this.f67353l = false;
                reentrantLock.unlock();
                m21615c();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m21615c() {
        ReentrantLock reentrantLock = this.f67351j;
        reentrantLock.lock();
        try {
            if (((LinkedHashMap) this.f67352k.f62329Z).isEmpty() && ((LinkedHashMap) this.f67352k.f62330o0).isEmpty() && this.f67354m == 0) {
                reentrantLock.unlock();
                return;
            }
            if (this.f67353l) {
                reentrantLock.unlock();
                return;
            }
            this.f67353l = true;
            reentrantLock.unlock();
            C3516e c3516e = AbstractC0593T.f1824a;
            AbstractC0575H.m1156D(this.f67343b, ExecutorC3515d.f10633Z, null, new C21188r(this, null), 2);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
