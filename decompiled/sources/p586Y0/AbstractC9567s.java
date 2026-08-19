package p586Y0;

import java.util.Collection;
import p003A1.C0227a;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p349O0.C5997d;
import p658b5.C11242m;
import p692d0.C12954G;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Y0.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9567s {

    /* JADX INFO: renamed from: a */
    public static final Object f28775a = new Object();

    /* JADX INFO: renamed from: b */
    public static final Object f28776b = new Object();

    /* JADX INFO: renamed from: a */
    public static final void m10106a(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException("index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
    }

    /* JADX INFO: renamed from: b */
    public static final int m10107b(int[] iArr, int i10) {
        int length = iArr.length - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (i11 + length) >>> 1;
            int i13 = iArr[i12];
            if (i10 > i13) {
                i11 = i12 + 1;
            } else {
                if (i10 >= i13) {
                    return i12;
                }
                length = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC9556h m10108d() {
        return (AbstractC9556h) AbstractC9562n.f28758a.m12621z();
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC9556h m10109e(AbstractC9556h abstractC9556h) {
        if (abstractC9556h instanceof C9547F) {
            C9547F c9547f = (C9547F) abstractC9556h;
            if (c9547f.f28716t == C5997d.m6418E()) {
                c9547f.f28714r = null;
                return abstractC9556h;
            }
        }
        if (abstractC9556h instanceof C9548G) {
            C9548G c9548g = (C9548G) abstractC9556h;
            if (c9548g.f28720h == C5997d.m6418E()) {
                c9548g.f28719g = null;
                return abstractC9556h;
            }
        }
        AbstractC9556h abstractC9556hM10084h = AbstractC9562n.m10084h(abstractC9556h, null, false);
        abstractC9556hM10084h.m10070j();
        return abstractC9556hM10084h;
    }

    /* JADX INFO: renamed from: f */
    public static Object m10110f(InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k) {
        AbstractC9556h c9547f;
        if (interfaceC1436k == null) {
            return interfaceC1426a.invoke();
        }
        AbstractC9556h abstractC9556h = (AbstractC9556h) AbstractC9562n.f28758a.m12621z();
        if (abstractC9556h instanceof C9547F) {
            C9547F c9547f2 = (C9547F) abstractC9556h;
            if (c9547f2.f28716t == C5997d.m6418E()) {
                InterfaceC1436k interfaceC1436k2 = c9547f2.f28714r;
                InterfaceC1436k interfaceC1436k3 = c9547f2.f28715s;
                try {
                    ((C9547F) abstractC9556h).f28714r = AbstractC9562n.m10088l(true, interfaceC1436k, interfaceC1436k2);
                    ((C9547F) abstractC9556h).f28715s = AbstractC9562n.m10078b(null, interfaceC1436k3);
                    return interfaceC1426a.invoke();
                } finally {
                    c9547f2.f28714r = interfaceC1436k2;
                    c9547f2.f28715s = interfaceC1436k3;
                }
            }
        }
        if (abstractC9556h == null || (abstractC9556h instanceof C9550b)) {
            c9547f = new C9547F(abstractC9556h instanceof C9550b ? (C9550b) abstractC9556h : null, interfaceC1436k, null, true, false);
        } else {
            if (interfaceC1436k == null) {
                return interfaceC1426a.invoke();
            }
            c9547f = abstractC9556h.mo10057t(interfaceC1436k);
        }
        try {
            AbstractC9556h abstractC9556hM10070j = c9547f.m10070j();
            try {
                Object objInvoke = interfaceC1426a.invoke();
                AbstractC9556h.m10068p(abstractC9556hM10070j);
                c9547f.mo10043c();
                return objInvoke;
            } catch (Throwable th2) {
                AbstractC9556h.m10068p(abstractC9556hM10070j);
                throw th2;
            }
        } catch (Throwable th3) {
            c9547f.mo10043c();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: g */
    public static C9555g m10111g(C0227a c0227a) {
        C11242m c11242m = AbstractC9562n.f28758a;
        AbstractC9562n.m10082f(C9561m.f28756o0);
        synchronized (AbstractC9562n.f28759b) {
            AbstractC9562n.f28764g = AbstractC17680n.m19362l0((Collection) AbstractC9562n.f28764g, c0227a);
        }
        return new C9555g(c0227a);
    }

    /* JADX INFO: renamed from: i */
    public static void m10113i() {
        boolean z6;
        synchronized (AbstractC9562n.f28759b) {
            C12954G c12954g = ((C9549a) AbstractC9562n.f28766i.get()).f28725h;
            z6 = false;
            if (c12954g != null && c12954g.m14631h()) {
                z6 = true;
            }
        }
        if (z6) {
            AbstractC9562n.m10077a();
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m10114j() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo10071c();

    /* JADX INFO: renamed from: h */
    public static void m10112h(AbstractC9556h abstractC9556h, AbstractC9556h abstractC9556h2, InterfaceC1436k interfaceC1436k) {
        if (abstractC9556h != abstractC9556h2) {
            abstractC9556h2.getClass();
            AbstractC9556h.m10068p(abstractC9556h);
            abstractC9556h2.mo10043c();
        } else if (abstractC9556h instanceof C9547F) {
            ((C9547F) abstractC9556h).f28714r = interfaceC1436k;
        } else if (abstractC9556h instanceof C9548G) {
            ((C9548G) abstractC9556h).f28719g = interfaceC1436k;
        } else {
            throw new IllegalStateException((QzvfuIgrngtl.xNqDEEln + abstractC9556h).toString());
        }
    }
}
