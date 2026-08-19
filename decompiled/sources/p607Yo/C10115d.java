package p607Yo;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;
import p001A.C0095w0;
import p001A.RunnableC0078o;
import p030B2.C0781s;
import p1016t3.C19786m;
import p1073w3.AbstractC20800b;
import p1073w3.C20808j;
import p1073w3.C20813o;
import p1073w3.C20814p;
import p1073w3.C20815q;
import p1073w3.InterfaceC20806h;
import p1073w3.InterfaceC20807i;
import p607Yo.C10115d;
import p690cp.C12912C;

/* JADX INFO: renamed from: Yo.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C10115d {

    /* JADX INFO: renamed from: a */
    public boolean f29947a;

    /* JADX INFO: renamed from: b */
    public boolean f29948b;

    /* JADX INFO: renamed from: c */
    public final Object f29949c;

    /* JADX INFO: renamed from: d */
    public final Object f29950d;

    /* JADX INFO: renamed from: e */
    public final Object f29951e;

    /* JADX INFO: renamed from: f */
    public final Object f29952f;

    /* JADX INFO: renamed from: g */
    public final Object f29953g;

    /* JADX INFO: renamed from: h */
    public final Object f29954h;

    /* JADX INFO: renamed from: i */
    public final Object f29955i;

    public C10115d(C12912C c12912c, C0781s c0781s, C12912C c12912c2, C0781s c0781s2, C0781s c0781s3, C10115d c10115d, C10116e c10116e) {
        this.f29947a = true;
        this.f29948b = false;
        this.f29949c = c12912c;
        this.f29951e = c0781s;
        this.f29950d = c12912c2;
        this.f29952f = c0781s2;
        this.f29953g = c0781s3;
        this.f29954h = c10115d;
        this.f29955i = c10116e;
    }

    /* JADX INFO: renamed from: a */
    public void m10690a(Object obj) {
        obj.getClass();
        synchronized (this.f29955i) {
            try {
                if (this.f29947a) {
                    return;
                }
                ((CopyOnWriteArraySet) this.f29952f).add(new C20808j(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m10691b() {
        m10695f();
        ArrayDeque arrayDeque = (ArrayDeque) this.f29954h;
        if (arrayDeque.isEmpty()) {
            return;
        }
        C20815q c20815q = (C20815q) this.f29950d;
        if (!c20815q.f66101a.hasMessages(1)) {
            c20815q.getClass();
            C20814p c20814pM21375b = C20815q.m21375b();
            c20814pM21375b.f66099a = c20815q.f66101a.obtainMessage(1);
            c20815q.getClass();
            Message message = c20814pM21375b.f66099a;
            message.getClass();
            c20815q.f66101a.sendMessageAtFrontOfQueue(message);
            c20814pM21375b.m21373a();
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) this.f29953g;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m10692c(int i10, InterfaceC20806h interfaceC20806h) {
        m10695f();
        ((ArrayDeque) this.f29954h).add(new RunnableC0078o(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f29952f), i10, interfaceC20806h, 8));
    }

    /* JADX INFO: renamed from: d */
    public void m10693d() {
        m10695f();
        synchronized (this.f29955i) {
            this.f29947a = true;
        }
        for (C20808j c20808j : (CopyOnWriteArraySet) this.f29952f) {
            InterfaceC20807i interfaceC20807i = (InterfaceC20807i) this.f29951e;
            c20808j.f66082d = true;
            if (c20808j.f66081c) {
                c20808j.f66081c = false;
                interfaceC20807i.mo394j(c20808j.f66079a, c20808j.f66080b.m367d());
            }
        }
        ((CopyOnWriteArraySet) this.f29952f).clear();
    }

    /* JADX INFO: renamed from: e */
    public void m10694e(int i10, InterfaceC20806h interfaceC20806h) {
        m10692c(i10, interfaceC20806h);
        m10691b();
    }

    /* JADX INFO: renamed from: f */
    public void m10695f() {
        if (this.f29948b) {
            AbstractC20800b.m21320h(Thread.currentThread() == ((C20815q) this.f29950d).f66101a.getLooper().getThread());
        }
    }

    public C10115d(Looper looper, C20813o c20813o, InterfaceC20807i interfaceC20807i) {
        this(new CopyOnWriteArraySet(), looper, c20813o, interfaceC20807i, true);
    }

    public C10115d(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, C20813o c20813o, InterfaceC20807i interfaceC20807i, boolean z6) {
        this.f29949c = c20813o;
        this.f29952f = copyOnWriteArraySet;
        this.f29951e = interfaceC20807i;
        this.f29955i = new Object();
        this.f29953g = new ArrayDeque();
        this.f29954h = new ArrayDeque();
        this.f29950d = c20813o.m21372a(looper, new Handler.Callback() { // from class: w3.g
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C10115d c10115d = this.f66078Y;
                for (C20808j c20808j : (CopyOnWriteArraySet) c10115d.f29952f) {
                    if (!c20808j.f66082d && c20808j.f66081c) {
                        C19786m c19786mM367d = c20808j.f66080b.m367d();
                        c20808j.f66080b = new C0095w0(12);
                        c20808j.f66081c = false;
                        ((InterfaceC20807i) c10115d.f29951e).mo394j(c20808j.f66079a, c19786mM367d);
                    }
                    if (((C20815q) c10115d.f29950d).f66101a.hasMessages(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.f29948b = z6;
    }
}
