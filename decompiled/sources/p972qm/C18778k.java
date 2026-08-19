package p972qm;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import mm.C17311n;
import p996rm.EnumC19250a;
import sm.InterfaceC19688d;

/* JADX INFO: renamed from: qm.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C18778k implements InterfaceC18770c, InterfaceC19688d {

    /* JADX INFO: renamed from: Z */
    public static final AtomicReferenceFieldUpdater f59683Z = AtomicReferenceFieldUpdater.newUpdater(C18778k.class, Object.class, "result");

    /* JADX INFO: renamed from: Y */
    public final InterfaceC18770c f59684Y;
    private volatile Object result;

    public C18778k(InterfaceC18770c interfaceC18770c, EnumC19250a enumC19250a) {
        this.f59684Y = interfaceC18770c;
        this.result = enumC19250a;
    }

    /* JADX INFO: renamed from: a */
    public final Object m20051a() {
        Object obj = this.result;
        EnumC19250a enumC19250a = EnumC19250a.f61037Z;
        if (obj == enumC19250a) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59683Z;
            EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC19250a, enumC19250a2)) {
                if (atomicReferenceFieldUpdater.get(this) != enumC19250a) {
                    obj = this.result;
                }
            }
            return EnumC19250a.f61036Y;
        }
        if (obj == EnumC19250a.f61038o0) {
            return EnumC19250a.f61036Y;
        }
        if (obj instanceof C17311n) {
            throw ((C17311n) obj).f55138Y;
        }
        return obj;
    }

    @Override // sm.InterfaceC19688d
    public final InterfaceC19688d getCallerFrame() {
        InterfaceC18770c interfaceC18770c = this.f59684Y;
        if (interfaceC18770c instanceof InterfaceC19688d) {
            return (InterfaceC19688d) interfaceC18770c;
        }
        return null;
    }

    @Override // p972qm.InterfaceC18770c
    public final InterfaceC18776i getContext() {
        return this.f59684Y.getContext();
    }

    @Override // p972qm.InterfaceC18770c
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC19250a enumC19250a = EnumC19250a.f61037Z;
            if (obj2 == enumC19250a) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59683Z;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC19250a, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC19250a) {
                    }
                }
                return;
            }
            EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
            if (obj2 != enumC19250a2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f59683Z;
            EnumC19250a enumC19250a3 = EnumC19250a.f61038o0;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, enumC19250a2, enumC19250a3)) {
                    this.f59684Y.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == enumC19250a2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f59684Y;
    }

    public C18778k(InterfaceC18770c interfaceC18770c) {
        EnumC19250a enumC19250a = EnumC19250a.f61037Z;
        this.f59684Y = interfaceC18770c;
        this.result = enumC19250a;
    }
}
