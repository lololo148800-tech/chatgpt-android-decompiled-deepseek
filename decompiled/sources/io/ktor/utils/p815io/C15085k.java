package io.ktor.utils.p815io;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.C0624m;
import p025An.C0644w;
import p488Tn.C7518a;
import p488Tn.InterfaceC7526i;
import p523V9.AbstractC8154o0;
import p556Wk.C8919d0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: io.ktor.utils.io.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C15085k implements InterfaceC15088n, InterfaceC15066B {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f46863g = AtomicReferenceFieldUpdater.newUpdater(C15085k.class, Object.class, "suspensionSlot");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f46864h = AtomicReferenceFieldUpdater.newUpdater(C15085k.class, Object.class, "_closedCause");

    /* JADX INFO: renamed from: b */
    public final boolean f46865b;
    private volatile int flushBufferSize;

    /* JADX INFO: renamed from: c */
    public final C7518a f46866c = new C7518a();

    /* JADX INFO: renamed from: d */
    public final Object f46867d = new Object();
    volatile /* synthetic */ Object suspensionSlot = C15077c.f46842b;

    /* JADX INFO: renamed from: e */
    public final C7518a f46868e = new C7518a();

    /* JADX INFO: renamed from: f */
    public final C7518a f46869f = new C7518a();
    volatile /* synthetic */ Object _closedCause = null;

    public C15085k(boolean z6) {
        this.f46865b = z6;
    }

    @Override // io.ktor.utils.p815io.InterfaceC15088n
    /* JADX INFO: renamed from: a */
    public final Throwable mo1137a() {
        C15071G c15071g = (C15071G) this._closedCause;
        if (c15071g != null) {
            return c15071g.m16195a();
        }
        return null;
    }

    @Override // io.ktor.utils.p815io.InterfaceC15088n
    /* JADX INFO: renamed from: b */
    public final void mo1138b(Throwable th2) {
        if (this._closedCause != null) {
            return;
        }
        C15071G c15071g = new C15071G(th2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46864h;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c15071g) && atomicReferenceFieldUpdater.get(this) == null) {
        }
        m16202g(c15071g.m16195a());
    }

    @Override // io.ktor.utils.p815io.InterfaceC15088n
    /* JADX INFO: renamed from: c */
    public final InterfaceC7526i mo1139c() throws Throwable {
        Throwable thMo1137a = mo1137a();
        if (thMo1137a != null) {
            throw thMo1137a;
        }
        C7518a c7518a = this.f46868e;
        if (c7518a.mo7821g()) {
            m16208m();
        }
        return c7518a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00db  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3 A[SYNTHETIC] */
    @Override // io.ktor.utils.p815io.InterfaceC15088n
    /* JADX INFO: renamed from: d */
    public final Object mo1140d(int i10, AbstractC19687c abstractC19687c) throws Throwable {
        C15082h c15082h;
        C15085k c15085k;
        C15085k c15085k2;
        boolean z6;
        C15077c c15077c;
        InterfaceC15081g interfaceC15081g;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objM1261q;
        if (abstractC19687c instanceof C15082h) {
            c15082h = (C15082h) abstractC19687c;
            int i11 = c15082h.f46853r0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c15082h.f46853r0 = i11 - Integer.MIN_VALUE;
            } else {
                c15082h = new C15082h(this, abstractC19687c);
            }
        } else {
            c15082h = new C15082h(this, abstractC19687c);
        }
        Object obj = c15082h.f46851p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = c15082h.f46853r0;
        if (i12 == 0) {
            AbstractC9233X.m9807c(obj);
            Throwable thMo1137a = mo1137a();
            if (thMo1137a != null) {
                throw thMo1137a;
            }
            if (this.f46868e.f23841o0 >= i10) {
                return Boolean.TRUE;
            }
            c15085k = this;
            c15085k2 = c15085k;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = c15082h.f46850o0;
            c15085k = c15082h.f46849Z;
            c15085k2 = c15082h.f46848Y;
            AbstractC9233X.m9807c(obj);
        }
        do {
            long j10 = i10;
            if (((long) c15085k2.flushBufferSize) + c15085k2.f46868e.f23841o0 >= j10 || c15085k2._closedCause != null) {
                if (c15085k2.f46868e.f23841o0 < 1048576) {
                    c15085k2.m16208m();
                }
                return Boolean.valueOf(c15085k2.f46868e.f23841o0 >= j10);
            }
            c15082h.f46848Y = c15085k2;
            c15082h.f46849Z = c15085k;
            c15082h.f46850o0 = i10;
            c15082h.f46853r0 = 1;
            C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(c15082h));
            c0624m.m1262r();
            C15078d c15078d = new C15078d(c0624m);
            InterfaceC15081g interfaceC15081g2 = (InterfaceC15081g) c15085k.suspensionSlot;
            boolean z10 = interfaceC15081g2 instanceof C15075a;
            if (z10) {
                z6 = interfaceC15081g2 instanceof C15078d;
                c15077c = C15077c.f46842b;
                if (z6) {
                    InterfaceC15079e interfaceC15079e = (InterfaceC15079e) interfaceC15081g2;
                    interfaceC15079e.mo16197b(new C8919d0("read", interfaceC15079e.mo16198c()));
                } else if (interfaceC15081g2 instanceof InterfaceC15079e) {
                    ((InterfaceC15079e) interfaceC15081g2).mo16196a();
                } else if (z10) {
                    c15078d.mo16197b(((C15075a) interfaceC15081g2).f46839b);
                } else if (!AbstractC16544l.m18089b(interfaceC15081g2, c15077c)) {
                    throw new C0644w();
                }
                if (((long) c15085k2.flushBufferSize) + c15085k2.f46868e.f23841o0 < j10) {
                    interfaceC15081g = (InterfaceC15081g) c15085k.suspensionSlot;
                    if (interfaceC15081g instanceof C15078d) {
                        atomicReferenceFieldUpdater = f46863g;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(c15085k, interfaceC15081g, c15077c)) {
                                ((InterfaceC15079e) interfaceC15081g).mo16196a();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(c15085k) == interfaceC15081g);
                    }
                } else {
                    interfaceC15081g = (InterfaceC15081g) c15085k.suspensionSlot;
                    if (interfaceC15081g instanceof C15078d) {
                        atomicReferenceFieldUpdater = f46863g;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(c15085k, interfaceC15081g, c15077c)) {
                                ((InterfaceC15079e) interfaceC15081g).mo16196a();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(c15085k) == interfaceC15081g);
                    }
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f46863g;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(c15085k, interfaceC15081g2, c15078d)) {
                        z6 = interfaceC15081g2 instanceof C15078d;
                        c15077c = C15077c.f46842b;
                        if (z6) {
                            InterfaceC15079e interfaceC15079e2 = (InterfaceC15079e) interfaceC15081g2;
                            interfaceC15079e2.mo16197b(new C8919d0("read", interfaceC15079e2.mo16198c()));
                        } else if (interfaceC15081g2 instanceof InterfaceC15079e) {
                            ((InterfaceC15079e) interfaceC15081g2).mo16196a();
                        } else if (z10) {
                            c15078d.mo16197b(((C15075a) interfaceC15081g2).f46839b);
                        } else if (!AbstractC16544l.m18089b(interfaceC15081g2, c15077c)) {
                            throw new C0644w();
                        }
                        if (((long) c15085k2.flushBufferSize) + c15085k2.f46868e.f23841o0 < j10 || c15085k2._closedCause != null) {
                            interfaceC15081g = (InterfaceC15081g) c15085k.suspensionSlot;
                            if (interfaceC15081g instanceof C15078d) {
                                atomicReferenceFieldUpdater = f46863g;
                                do {
                                    if (atomicReferenceFieldUpdater.compareAndSet(c15085k, interfaceC15081g, c15077c)) {
                                        ((InterfaceC15079e) interfaceC15081g).mo16196a();
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(c15085k) == interfaceC15081g);
                            }
                        }
                    } else if (atomicReferenceFieldUpdater2.get(c15085k) != interfaceC15081g2) {
                        c15078d.mo16196a();
                    }
                }
            }
            objM1261q = c0624m.m1261q();
            EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
        } while (objM1261q != enumC19250a);
        return enumC19250a;
    }

    @Override // io.ktor.utils.p815io.InterfaceC15088n
    /* JADX INFO: renamed from: e */
    public final boolean mo1141e() {
        return mo1137a() != null || (m16207l() && this.flushBufferSize == 0 && this.f46868e.mo7821g());
    }

    /* JADX INFO: renamed from: f */
    public final void m16201f() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        m16205j();
        C15071G c15071g = AbstractC15072H.f46835a;
        do {
            atomicReferenceFieldUpdater = f46864h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, c15071g)) {
                m16202g(null);
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
    }

    /* JADX INFO: renamed from: g */
    public final void m16202g(Throwable th2) {
        C15075a c15075a;
        if (th2 != null) {
            c15075a = new C15075a(th2);
        } else {
            InterfaceC15081g.f46847a.getClass();
            c15075a = C15076b.f46841b;
        }
        InterfaceC15081g interfaceC15081g = (InterfaceC15081g) f46863g.getAndSet(this, c15075a);
        if (interfaceC15081g instanceof InterfaceC15079e) {
            ((InterfaceC15079e) interfaceC15081g).mo16197b(th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x009f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m16203h(AbstractC19687c abstractC19687c) {
        C15083i c15083i;
        C15085k c15085k;
        C15085k c15085k2;
        boolean z6;
        C15077c c15077c;
        InterfaceC15081g interfaceC15081g;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (abstractC19687c instanceof C15083i) {
            c15083i = (C15083i) abstractC19687c;
            int i10 = c15083i.f46858q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c15083i.f46858q0 = i10 - Integer.MIN_VALUE;
            } else {
                c15083i = new C15083i(this, abstractC19687c);
            }
        } else {
            c15083i = new C15083i(this, abstractC19687c);
        }
        Object obj = c15083i.f46856o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c15083i.f46858q0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            Throwable thMo1137a = mo1137a();
            if (thMo1137a != null) {
                throw thMo1137a;
            }
            m16205j();
            if (this.flushBufferSize < 1048576) {
                return c17296c;
            }
            c15085k = this;
            c15085k2 = c15085k;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c15085k = c15083i.f46855Z;
            c15085k2 = c15083i.f46854Y;
            AbstractC9233X.m9807c(obj);
        }
        while (c15085k2.flushBufferSize >= 1048576 && c15085k2._closedCause == null) {
            c15083i.f46854Y = c15085k2;
            c15083i.f46855Z = c15085k;
            c15083i.f46858q0 = 1;
            C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(c15083i));
            c0624m.m1262r();
            C15080f c15080f = new C15080f(c0624m);
            InterfaceC15081g interfaceC15081g2 = (InterfaceC15081g) c15085k.suspensionSlot;
            boolean z10 = interfaceC15081g2 instanceof C15075a;
            if (z10) {
                z6 = interfaceC15081g2 instanceof C15080f;
                c15077c = C15077c.f46842b;
                if (z6) {
                    InterfaceC15079e interfaceC15079e = (InterfaceC15079e) interfaceC15081g2;
                    interfaceC15079e.mo16197b(new C8919d0("write", interfaceC15079e.mo16198c()));
                } else if (interfaceC15081g2 instanceof InterfaceC15079e) {
                    ((InterfaceC15079e) interfaceC15081g2).mo16196a();
                } else if (z10) {
                    c15080f.mo16197b(((C15075a) interfaceC15081g2).f46839b);
                } else if (!AbstractC16544l.m18089b(interfaceC15081g2, c15077c)) {
                    throw new C0644w();
                }
                if (c15085k2.flushBufferSize >= 1048576) {
                    interfaceC15081g = (InterfaceC15081g) c15085k.suspensionSlot;
                    if (interfaceC15081g instanceof C15080f) {
                        atomicReferenceFieldUpdater = f46863g;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(c15085k, interfaceC15081g, c15077c)) {
                                ((InterfaceC15079e) interfaceC15081g).mo16196a();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(c15085k) == interfaceC15081g);
                    }
                } else {
                    interfaceC15081g = (InterfaceC15081g) c15085k.suspensionSlot;
                    if (interfaceC15081g instanceof C15080f) {
                        atomicReferenceFieldUpdater = f46863g;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(c15085k, interfaceC15081g, c15077c)) {
                                ((InterfaceC15079e) interfaceC15081g).mo16196a();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(c15085k) == interfaceC15081g);
                    }
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f46863g;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(c15085k, interfaceC15081g2, c15080f)) {
                        z6 = interfaceC15081g2 instanceof C15080f;
                        c15077c = C15077c.f46842b;
                        if (z6) {
                            InterfaceC15079e interfaceC15079e2 = (InterfaceC15079e) interfaceC15081g2;
                            interfaceC15079e2.mo16197b(new C8919d0("write", interfaceC15079e2.mo16198c()));
                        } else if (interfaceC15081g2 instanceof InterfaceC15079e) {
                            ((InterfaceC15079e) interfaceC15081g2).mo16196a();
                        } else if (z10) {
                            c15080f.mo16197b(((C15075a) interfaceC15081g2).f46839b);
                        } else if (!AbstractC16544l.m18089b(interfaceC15081g2, c15077c)) {
                            throw new C0644w();
                        }
                        if (c15085k2.flushBufferSize >= 1048576 || c15085k2._closedCause != null) {
                            interfaceC15081g = (InterfaceC15081g) c15085k.suspensionSlot;
                            if (interfaceC15081g instanceof C15080f) {
                                atomicReferenceFieldUpdater = f46863g;
                                do {
                                    if (atomicReferenceFieldUpdater.compareAndSet(c15085k, interfaceC15081g, c15077c)) {
                                        ((InterfaceC15079e) interfaceC15081g).mo16196a();
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(c15085k) == interfaceC15081g);
                            }
                        }
                    } else if (atomicReferenceFieldUpdater2.get(c15085k) != interfaceC15081g2) {
                        c15080f.mo16196a();
                    }
                }
            }
            Object objM1261q = c0624m.m1261q();
            EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
            if (objM1261q == enumC19250a) {
                return enumC19250a;
            }
        }
        return c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m16204i(InterfaceC18770c interfaceC18770c) {
        C15084j c15084j;
        C15085k c15085k;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C17296C c17296c;
        if (interfaceC18770c instanceof C15084j) {
            c15084j = (C15084j) interfaceC18770c;
            int i10 = c15084j.f46862p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c15084j.f46862p0 = i10 - Integer.MIN_VALUE;
            } else {
                c15084j = new C15084j(this, interfaceC18770c);
            }
        } else {
            c15084j = new C15084j(this, interfaceC18770c);
        }
        Object obj = c15084j.f46860Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c15084j.f46862p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            try {
                c15084j.f46859Y = this;
                c15084j.f46862p0 = 1;
                if (m16203h(c15084j) == enumC19250a) {
                    return enumC19250a;
                }
                c15085k = this;
            } catch (Throwable th2) {
                th = th2;
                c15085k = this;
                AbstractC9233X.m9806b(th);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c15085k = c15084j.f46859Y;
            try {
                AbstractC9233X.m9807c(obj);
            } catch (Throwable th3) {
                th = th3;
                AbstractC9233X.m9806b(th);
            }
        }
        C15071G c15071g = AbstractC15072H.f46835a;
        do {
            atomicReferenceFieldUpdater = f46864h;
            boolean zCompareAndSet = atomicReferenceFieldUpdater.compareAndSet(c15085k, null, c15071g);
            c17296c = C17296C.f55119a;
            if (zCompareAndSet) {
                c15085k.m16202g(null);
                return c17296c;
            }
        } while (atomicReferenceFieldUpdater.get(c15085k) == null);
        return c17296c;
    }

    /* JADX INFO: renamed from: j */
    public final void m16205j() {
        if (this.f46869f.mo7821g()) {
            return;
        }
        synchronized (this.f46867d) {
            C7518a c7518a = this.f46869f;
            int i10 = (int) c7518a.f23841o0;
            this.f46866c.m7822k(c7518a);
            this.flushBufferSize += i10;
        }
        InterfaceC15081g interfaceC15081g = (InterfaceC15081g) this.suspensionSlot;
        if (interfaceC15081g instanceof C15078d) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46863g;
            C15077c c15077c = C15077c.f46842b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC15081g, c15077c)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC15081g) {
                    return;
                }
            }
            ((InterfaceC15079e) interfaceC15081g).mo16196a();
        }
    }

    /* JADX INFO: renamed from: k */
    public final C7518a m16206k() {
        Throwable thMo1137a = mo1137a();
        if (thMo1137a != null) {
            throw thMo1137a;
        }
        if (m16207l()) {
            throw new IOException("Channel is closed for write");
        }
        return this.f46869f;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m16207l() {
        return this._closedCause != null;
    }

    /* JADX INFO: renamed from: m */
    public final void m16208m() {
        synchronized (this.f46867d) {
            this.f46866c.mo7826z(this.f46868e);
            this.flushBufferSize = 0;
        }
        InterfaceC15081g interfaceC15081g = (InterfaceC15081g) this.suspensionSlot;
        if (interfaceC15081g instanceof C15080f) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46863g;
            C15077c c15077c = C15077c.f46842b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC15081g, c15077c)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC15081g) {
                    return;
                }
            }
            ((InterfaceC15079e) interfaceC15081g).mo16196a();
        }
    }

    public final String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }
}
