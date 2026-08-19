package sm;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0563B;
import p025An.C0624m;
import p153Fn.AbstractC2923a;
import p153Fn.C2928f;
import p972qm.C18771d;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18772e;
import p972qm.InterfaceC18774g;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: sm.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19687c extends AbstractC19685a {
    private final InterfaceC18776i _context;
    private transient InterfaceC18770c<Object> intercepted;

    public AbstractC19687c(InterfaceC18770c interfaceC18770c, InterfaceC18776i interfaceC18776i) {
        super(interfaceC18770c);
        this._context = interfaceC18776i;
    }

    @Override // p972qm.InterfaceC18770c
    public InterfaceC18776i getContext() {
        InterfaceC18776i interfaceC18776i = this._context;
        AbstractC16544l.m18091d(interfaceC18776i);
        return interfaceC18776i;
    }

    public final InterfaceC18770c<Object> intercepted() {
        InterfaceC18770c<Object> c2928f = this.intercepted;
        if (c2928f == null) {
            InterfaceC18772e interfaceC18772e = (InterfaceC18772e) getContext().get(C18771d.f59681Y);
            c2928f = interfaceC18772e != null ? new C2928f((AbstractC0563B) interfaceC18772e, this) : this;
            this.intercepted = c2928f;
        }
        return c2928f;
    }

    @Override // sm.AbstractC19685a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC18770c<Object> interfaceC18770c = this.intercepted;
        if (interfaceC18770c != null && interfaceC18770c != this) {
            InterfaceC18774g interfaceC18774g = getContext().get(C18771d.f59681Y);
            AbstractC16544l.m18091d(interfaceC18774g);
            C2928f c2928f = (C2928f) interfaceC18770c;
            do {
                atomicReferenceFieldUpdater = C2928f.f8772t0;
            } while (atomicReferenceFieldUpdater.get(c2928f) == AbstractC2923a.f8762c);
            Object obj = atomicReferenceFieldUpdater.get(c2928f);
            C0624m c0624m = obj instanceof C0624m ? (C0624m) obj : null;
            if (c0624m != null) {
                c0624m.m1258m();
            }
        }
        this.intercepted = C19686b.f62377Y;
    }

    public AbstractC19687c(InterfaceC18770c interfaceC18770c) {
        this(interfaceC18770c, interfaceC18770c != null ? interfaceC18770c.getContext() : null);
    }
}
