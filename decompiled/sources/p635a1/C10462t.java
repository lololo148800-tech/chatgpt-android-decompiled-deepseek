package p635a1;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: a1.t */
/* JADX INFO: loaded from: classes.dex */
public final class C10462t extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f30975Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f30976Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC16546n f30977o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AtomicReference f30978p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC19694j f30979q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C10462t(InterfaceC1436k interfaceC1436k, AtomicReference atomicReference, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f30977o0 = (AbstractC16546n) interfaceC1436k;
        this.f30978p0 = atomicReference;
        this.f30979q0 = (AbstractC19694j) interfaceC1439n;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Bm.n, sm.j] */
    /* JADX WARN: Type inference failed for: r3v0, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C10462t c10462t = new C10462t(this.f30977o0, this.f30978p0, this.f30979q0, interfaceC18770c);
        c10462t.f30976Z = obj;
        return c10462t;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C10462t) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r9v9, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C10461s c10461s;
        C10461s c10461s2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f30975Y;
        AtomicReference atomicReference = this.f30978p0;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f30976Z;
                c10461s = new C10461s(AbstractC0575H.m1192u(interfaceC0571F.getCoroutineContext()), this.f30977o0.invoke(interfaceC0571F));
                C10461s c10461s3 = (C10461s) atomicReference.getAndSet(c10461s);
                if (c10461s3 != null) {
                    InterfaceC0627n0 interfaceC0627n0 = c10461s3.f30973a;
                    this.f30976Z = c10461s;
                    this.f30975Y = 1;
                    if (AbstractC0575H.m1182k(interfaceC0627n0, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c10461s2 = (C10461s) this.f30976Z;
                    try {
                        AbstractC9233X.m9807c(obj);
                        while (!atomicReference.compareAndSet(c10461s2, null) && atomicReference.get() == c10461s2) {
                        }
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        while (!atomicReference.compareAndSet(c10461s2, null)) {
                        }
                        throw th;
                    }
                }
                c10461s = (C10461s) this.f30976Z;
                AbstractC9233X.m9807c(obj);
            }
            ?? r10 = this.f30979q0;
            Object obj2 = c10461s.f30974b;
            this.f30976Z = c10461s;
            this.f30975Y = 2;
            obj = r10.invoke(obj2, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            c10461s2 = c10461s;
            while (!atomicReference.compareAndSet(c10461s2, null)) {
            }
            return obj;
        } catch (Throwable th3) {
            th = th3;
            c10461s2 = c10461s;
            while (!atomicReference.compareAndSet(c10461s2, null) && atomicReference.get() == c10461s2) {
            }
            throw th;
        }
    }
}
