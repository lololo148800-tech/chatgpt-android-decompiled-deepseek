package p817j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.L */
/* JADX INFO: loaded from: classes4.dex */
final class C15802L extends AbstractC15888c {

    /* JADX INFO: renamed from: j */
    private final C15767E f49109j;

    /* JADX INFO: renamed from: k */
    private final boolean f49110k;

    C15802L(C15767E c15767e, boolean z6, AbstractC15882b abstractC15882b, Spliterator spliterator) {
        super(abstractC15882b, spliterator);
        this.f49110k = z6;
        this.f49109j = c15767e;
    }

    C15802L(C15802L c15802l, Spliterator spliterator) {
        super(c15802l, spliterator);
        this.f49110k = c15802l.f49110k;
        this.f49109j = c15802l.f49109j;
    }

    @Override // p817j$.util.stream.AbstractC15900e
    /* JADX INFO: renamed from: e */
    protected final AbstractC15900e mo17411e(Spliterator spliterator) {
        return new C15802L(this, spliterator);
    }

    @Override // p817j$.util.stream.AbstractC15888c
    /* JADX INFO: renamed from: j */
    protected final Object mo17412j() {
        return this.f49109j.f49055b;
    }

    @Override // p817j$.util.stream.AbstractC15900e
    /* JADX INFO: renamed from: a */
    protected final Object mo17410a() {
        AbstractC15882b abstractC15882b = this.f49257a;
        InterfaceC15811M3 interfaceC15811M3 = (InterfaceC15811M3) this.f49109j.f49057d.get();
        abstractC15882b.m17453U(this.f49258b, interfaceC15811M3);
        Object obj = interfaceC15811M3.get();
        if (!this.f49110k) {
            if (obj != null) {
                AtomicReference atomicReference = this.f49241h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            }
            return null;
        }
        if (obj == null) {
            return null;
        }
        AbstractC15900e abstractC15900e = this;
        while (abstractC15900e != null) {
            AbstractC15900e abstractC15900e2 = (AbstractC15900e) abstractC15900e.getCompleter();
            if (abstractC15900e2 != null && abstractC15900e2.f49260d != abstractC15900e) {
                m17461i();
                return obj;
            }
            abstractC15900e = abstractC15900e2;
        }
        AtomicReference atomicReference2 = this.f49241h;
        while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
        }
        return obj;
    }

    @Override // p817j$.util.stream.AbstractC15900e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.f49110k) {
            C15802L c15802l = (C15802L) this.f49260d;
            C15802L c15802l2 = null;
            while (c15802l != c15802l2) {
                Object objMo17458c = c15802l.mo17458c();
                if (objMo17458c != null && this.f49109j.f49056c.test(objMo17458c)) {
                    mo17459f(objMo17458c);
                    AbstractC15900e abstractC15900e = this;
                    while (abstractC15900e != null) {
                        AbstractC15900e abstractC15900e2 = (AbstractC15900e) abstractC15900e.getCompleter();
                        if (abstractC15900e2 != null && abstractC15900e2.f49260d != abstractC15900e) {
                            m17461i();
                            break;
                        }
                        abstractC15900e = abstractC15900e2;
                    }
                    AtomicReference atomicReference = this.f49241h;
                    while (!atomicReference.compareAndSet(null, objMo17458c) && atomicReference.get() == null) {
                    }
                    break;
                }
                c15802l2 = c15802l;
                c15802l = (C15802L) this.f49261e;
            }
        }
        super.onCompletion(countedCompleter);
    }
}
