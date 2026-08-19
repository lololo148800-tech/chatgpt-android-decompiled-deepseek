package p586Y0;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p349O0.C5997d;
import p392Q0.C6546d;
import p402Qc.C6593i;
import p482Tg.C7443a0;
import p571X9.AbstractC9306j0;
import p658b5.C11242m;
import p692d0.C12951D;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Y0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C9571w {

    /* JADX INFO: renamed from: a */
    public final AbstractC16546n f28795a;

    /* JADX INFO: renamed from: c */
    public boolean f28797c;

    /* JADX INFO: renamed from: g */
    public C9555g f28801g;

    /* JADX INFO: renamed from: h */
    public C9570v f28802h;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f28796b = new AtomicReference(null);

    /* JADX INFO: renamed from: d */
    public final C7443a0 f28798d = new C7443a0(this, 4);

    /* JADX INFO: renamed from: e */
    public final C6593i f28799e = new C6593i(this, 26);

    /* JADX INFO: renamed from: f */
    public final C6546d f28800f = new C6546d(new C9570v[16]);

    /* JADX INFO: renamed from: i */
    public long f28803i = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public C9571w(InterfaceC1436k interfaceC1436k) {
        this.f28795a = (AbstractC16546n) interfaceC1436k;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m10121a(C9571w c9571w) {
        boolean z6;
        Set set;
        synchronized (c9571w.f28800f) {
            z6 = c9571w.f28797c;
        }
        if (z6) {
            return false;
        }
        boolean z10 = false;
        while (true) {
            AtomicReference atomicReference = c9571w.f28796b;
            Object obj = atomicReference.get();
            Set set2 = null;
            objSubList = null;
            Object objSubList = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        C5997d.m6414A("Unexpected notification");
                        throw null;
                    }
                    List list = (List) obj;
                    set = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                }
                Object obj2 = objSubList;
                while (true) {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set2 = set;
                    } else if (atomicReference.get() != obj) {
                    }
                }
            }
            if (set2 == null) {
                return z10;
            }
            synchronized (c9571w.f28800f) {
                C6546d c6546d = c9571w.f28800f;
                int i10 = c6546d.f21184o0;
                if (i10 > 0) {
                    Object[] objArr = c6546d.f21182Y;
                    int i11 = 0;
                    do {
                        z10 = ((C9570v) objArr[i11]).m10117b(set2) || z10;
                        i11++;
                    } while (i11 < i10);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10122b() {
        synchronized (this.f28800f) {
            C6546d c6546d = this.f28800f;
            int i10 = c6546d.f21184o0;
            if (i10 > 0) {
                Object[] objArr = c6546d.f21182Y;
                int i11 = 0;
                do {
                    C9570v c9570v = (C9570v) objArr[i11];
                    ((C12951D) c9570v.f28787e.f42001Y).m14615a();
                    c9570v.f28788f.m14615a();
                    ((C12951D) c9570v.f28793k.f42001Y).m14615a();
                    c9570v.f28794l.clear();
                    i11++;
                } while (i11 < i10);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10123c(Object obj, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a) {
        Object obj2;
        C9570v c9570v;
        synchronized (this.f28800f) {
            C6546d c6546d = this.f28800f;
            int i10 = c6546d.f21184o0;
            if (i10 <= 0) {
                obj2 = null;
                break;
            }
            Object[] objArr = c6546d.f21182Y;
            int i11 = 0;
            while (true) {
                obj2 = objArr[i11];
                if (((C9570v) obj2).f28783a == interfaceC1436k) {
                    break;
                }
                i11++;
                if (i11 >= i10) {
                    obj2 = null;
                    break;
                }
            }
            c9570v = (C9570v) obj2;
            if (c9570v == null) {
                AbstractC16544l.m18092e(interfaceC1436k, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                AbstractC16529F.m18081e(1, interfaceC1436k);
                c9570v = new C9570v(interfaceC1436k);
                c6546d.m7099c(c9570v);
            }
        }
        C9570v c9570v2 = this.f28802h;
        long j10 = this.f28803i;
        if (j10 == -1 || j10 == C5997d.m6418E()) {
            try {
                this.f28802h = c9570v;
                this.f28803i = C5997d.m6418E();
                c9570v.m10116a(obj, this.f28799e, interfaceC1426a);
                return;
            } finally {
                this.f28802h = c9570v2;
                this.f28803i = j10;
            }
        }
        StringBuilder sbM9894m = AbstractC9306j0.m9894m("Detected multithreaded access to SnapshotStateObserver: previousThreadId=", j10, "), currentThread={id=");
        sbM9894m.append(C5997d.m6418E());
        sbM9894m.append(", name=");
        sbM9894m.append(Thread.currentThread().getName());
        sbM9894m.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        C5997d.m6443b0(sbM9894m.toString());
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final void m10124d() {
        C7443a0 c7443a0 = this.f28798d;
        C11242m c11242m = AbstractC9562n.f28758a;
        AbstractC9562n.m10082f(C9561m.f28756o0);
        synchronized (AbstractC9562n.f28759b) {
            AbstractC9562n.f28764g = AbstractC17680n.m19362l0((Collection) AbstractC9562n.f28764g, c7443a0);
        }
        this.f28801g = new C9555g(c7443a0);
    }
}
