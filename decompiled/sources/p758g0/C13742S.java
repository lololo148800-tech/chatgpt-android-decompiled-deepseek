package p758g0;

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
import p349O0.C5972Q;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18774g;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: g0.S */
/* JADX INFO: loaded from: classes.dex */
public final class C13742S extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public InterfaceC4814a f43334Y;

    /* JADX INFO: renamed from: Z */
    public Object f43335Z;

    /* JADX INFO: renamed from: o0 */
    public C13743T f43336o0;

    /* JADX INFO: renamed from: p0 */
    public int f43337p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f43338q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f43339r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C13743T f43340s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ AbstractC19694j f43341t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C13742S(int i10, C13743T c13743t, InterfaceC1436k interfaceC1436k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f43339r0 = i10;
        this.f43340s0 = c13743t;
        this.f43341t0 = (AbstractC19694j) interfaceC1436k;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.k, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C13742S c13742s = new C13742S(this.f43339r0, this.f43340s0, this.f43341t0, interfaceC18770c);
        c13742s.f43338q0 = obj;
        return c13742s;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13742S) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [Bm.k] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C13743T c13743t;
        ?? r6;
        C13741Q c13741q;
        InterfaceC4814a interfaceC4814a;
        InterfaceC4814a interfaceC4814a2;
        C13741Q c13741q2;
        C13743T c13743t2;
        Throwable th2;
        AtomicReference atomicReference;
        InterfaceC4814a interfaceC4814a3;
        AtomicReference atomicReference2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        ?? r10 = this.f43337p0;
        try {
            try {
                if (r10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    InterfaceC18774g interfaceC18774g = ((InterfaceC0571F) this.f43338q0).getCoroutineContext().get(C0625m0.f1875Y);
                    AbstractC16544l.m18091d(interfaceC18774g);
                    C13741Q c13741q3 = new C13741Q(this.f43339r0, (InterfaceC0627n0) interfaceC18774g);
                    loop2: while (true) {
                        c13743t = this.f43340s0;
                        AtomicReference atomicReference3 = c13743t.f43342a;
                        C13741Q c13741q4 = (C13741Q) atomicReference3.get();
                        if (c13741q4 != null) {
                            int i10 = c13741q3.f43332a;
                            int i11 = c13741q4.f43332a;
                            if (i10 == 0 || i11 == 0) {
                                throw null;
                            }
                            if (i10 - i11 < 0) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                        do {
                            if (atomicReference3.compareAndSet(c13741q4, c13741q3)) {
                                if (c13741q4 != null) {
                                    c13741q4.f43333b.mo1275e(new C5972Q("Mutation interrupted", 3));
                                }
                                this.f43338q0 = c13741q3;
                                C4816c c4816c = c13743t.f43343b;
                                this.f43334Y = c4816c;
                                AbstractC19694j abstractC19694j = this.f43341t0;
                                this.f43335Z = abstractC19694j;
                                this.f43336o0 = c13743t;
                                this.f43337p0 = 1;
                                if (c4816c.m5448e(null, this) != enumC19250a) {
                                    r6 = abstractC19694j;
                                    c13741q = c13741q3;
                                    interfaceC4814a = c4816c;
                                    break loop2;
                                }
                                return enumC19250a;
                            }
                        } while (atomicReference3.get() == c13741q4);
                    }
                } else {
                    if (r10 != 1) {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c13743t2 = (C13743T) this.f43335Z;
                        InterfaceC4814a interfaceC4814a4 = this.f43334Y;
                        c13741q2 = (C13741Q) this.f43338q0;
                        try {
                            AbstractC9233X.m9807c(obj);
                            interfaceC4814a3 = interfaceC4814a4;
                            atomicReference2 = c13743t2.f43342a;
                            while (!atomicReference2.compareAndSet(c13741q2, null) && atomicReference2.get() == c13741q2) {
                            }
                            ((C4816c) interfaceC4814a3).m5450g(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            atomicReference = c13743t2.f43342a;
                            while (!atomicReference.compareAndSet(c13741q2, null) && atomicReference.get() == c13741q2) {
                            }
                            throw th2;
                        }
                    }
                    C13743T c13743t3 = this.f43336o0;
                    InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f43335Z;
                    InterfaceC4814a interfaceC4814a5 = this.f43334Y;
                    c13741q = (C13741Q) this.f43338q0;
                    AbstractC9233X.m9807c(obj);
                    c13743t = c13743t3;
                    r6 = interfaceC1436k;
                    interfaceC4814a = interfaceC4814a5;
                }
                this.f43338q0 = c13741q;
                this.f43334Y = interfaceC4814a2;
                this.f43335Z = c13743t;
                this.f43336o0 = null;
                this.f43337p0 = 2;
                Object objInvoke = r6.invoke(this);
                if (objInvoke == enumC19250a) {
                    return enumC19250a;
                }
                c13743t2 = c13743t;
                obj = objInvoke;
                c13741q2 = c13741q;
                interfaceC4814a3 = interfaceC4814a2;
                atomicReference2 = c13743t2.f43342a;
                while (!atomicReference2.compareAndSet(c13741q2, null)) {
                }
                ((C4816c) interfaceC4814a3).m5450g(null);
                return obj;
            } catch (Throwable th4) {
                c13741q2 = c13741q;
                c13743t2 = c13743t;
                th2 = th4;
                atomicReference = c13743t2.f43342a;
                while (!atomicReference.compareAndSet(c13741q2, null)) {
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
