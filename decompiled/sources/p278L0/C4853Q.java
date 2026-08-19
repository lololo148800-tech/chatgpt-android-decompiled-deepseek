package p278L0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.C0625m0;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p275Kn.C4816c;
import p275Kn.InterfaceC4814a;
import p571X9.AbstractC9233X;
import p773h0.EnumC14284g0;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18774g;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: L0.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C4853Q extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public InterfaceC4814a f15805Y;

    /* JADX INFO: renamed from: Z */
    public Object f15806Z;

    /* JADX INFO: renamed from: o0 */
    public C4854S f15807o0;

    /* JADX INFO: renamed from: p0 */
    public int f15808p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f15809q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ EnumC14284g0 f15810r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C4854S f15811s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ AbstractC19694j f15812t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4853Q(EnumC14284g0 enumC14284g0, C4854S c4854s, InterfaceC1436k interfaceC1436k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15810r0 = enumC14284g0;
        this.f15811s0 = c4854s;
        this.f15812t0 = (AbstractC19694j) interfaceC1436k;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.k, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4853Q c4853q = new C4853Q(this.f15810r0, this.f15811s0, this.f15812t0, interfaceC18770c);
        c4853q.f15809q0 = obj;
        return c4853q;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4853Q) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [Bm.k] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C4854S c4854s;
        ?? r6;
        C4852P c4852p;
        InterfaceC4814a interfaceC4814a;
        InterfaceC4814a interfaceC4814a2;
        C4852P c4852p2;
        C4854S c4854s2;
        Throwable th2;
        AtomicReference atomicReference;
        InterfaceC4814a interfaceC4814a3;
        AtomicReference atomicReference2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        ?? r10 = this.f15808p0;
        try {
            try {
                if (r10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    InterfaceC18774g interfaceC18774g = ((InterfaceC0571F) this.f15809q0).getCoroutineContext().get(C0625m0.f1875Y);
                    AbstractC16544l.m18091d(interfaceC18774g);
                    C4852P c4852p3 = new C4852P(this.f15810r0, (InterfaceC0627n0) interfaceC18774g);
                    loop2: while (true) {
                        c4854s = this.f15811s0;
                        AtomicReference atomicReference3 = c4854s.f15813a;
                        C4852P c4852p4 = (C4852P) atomicReference3.get();
                        if (c4852p4 != null && c4852p3.f15803a.compareTo(c4852p4.f15803a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        do {
                            if (atomicReference3.compareAndSet(c4852p4, c4852p3)) {
                                if (c4852p4 != null) {
                                    c4852p4.f15804b.mo1275e(null);
                                }
                                this.f15809q0 = c4852p3;
                                C4816c c4816c = c4854s.f15814b;
                                this.f15805Y = c4816c;
                                AbstractC19694j abstractC19694j = this.f15812t0;
                                this.f15806Z = abstractC19694j;
                                this.f15807o0 = c4854s;
                                this.f15808p0 = 1;
                                if (c4816c.m5448e(null, this) != enumC19250a) {
                                    r6 = abstractC19694j;
                                    c4852p = c4852p3;
                                    interfaceC4814a = c4816c;
                                    break loop2;
                                }
                                return enumC19250a;
                            }
                        } while (atomicReference3.get() == c4852p4);
                    }
                } else {
                    if (r10 != 1) {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c4854s2 = (C4854S) this.f15806Z;
                        InterfaceC4814a interfaceC4814a4 = this.f15805Y;
                        c4852p2 = (C4852P) this.f15809q0;
                        try {
                            AbstractC9233X.m9807c(obj);
                            interfaceC4814a3 = interfaceC4814a4;
                            atomicReference2 = c4854s2.f15813a;
                            while (!atomicReference2.compareAndSet(c4852p2, null) && atomicReference2.get() == c4852p2) {
                            }
                            ((C4816c) interfaceC4814a3).m5450g(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            atomicReference = c4854s2.f15813a;
                            while (!atomicReference.compareAndSet(c4852p2, null)) {
                            }
                            throw th2;
                        }
                    }
                    C4854S c4854s3 = this.f15807o0;
                    InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f15806Z;
                    InterfaceC4814a interfaceC4814a5 = this.f15805Y;
                    c4852p = (C4852P) this.f15809q0;
                    AbstractC9233X.m9807c(obj);
                    c4854s = c4854s3;
                    r6 = interfaceC1436k;
                    interfaceC4814a = interfaceC4814a5;
                }
                this.f15809q0 = c4852p;
                this.f15805Y = interfaceC4814a2;
                this.f15806Z = c4854s;
                this.f15807o0 = null;
                this.f15808p0 = 2;
                Object objInvoke = r6.invoke(this);
                if (objInvoke == enumC19250a) {
                    return enumC19250a;
                }
                c4854s2 = c4854s;
                obj = objInvoke;
                c4852p2 = c4852p;
                interfaceC4814a3 = interfaceC4814a2;
                atomicReference2 = c4854s2.f15813a;
                while (!atomicReference2.compareAndSet(c4852p2, null)) {
                }
                ((C4816c) interfaceC4814a3).m5450g(null);
                return obj;
            } catch (Throwable th4) {
                c4852p2 = c4852p;
                c4854s2 = c4854s;
                th2 = th4;
                atomicReference = c4854s2.f15813a;
                while (!atomicReference.compareAndSet(c4852p2, null) && atomicReference.get() == c4852p2) {
                }
                throw th2;
            }
            interfaceC4814a2 = interfaceC4814a;
        } catch (Throwable th5) {
            ((C4816c) r10).m5450g(null);
            throw th5;
        }
    }
}
