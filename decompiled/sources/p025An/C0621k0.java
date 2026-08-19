package p025An;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: An.k0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0621k0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f1864Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1426a f1865Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0621k0(InterfaceC1426a interfaceC1426a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f1865Z = interfaceC1426a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C0621k0 c0621k0 = new C0621k0(this.f1865Z, interfaceC18770c);
        c0621k0.f1864Y = obj;
        return c0621k0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0621k0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InterfaceC18776i coroutineContext = ((InterfaceC0571F) this.f1864Y).getCoroutineContext();
        InterfaceC1426a interfaceC1426a = this.f1865Z;
        try {
            C0572F0 c0572f0 = new C0572F0();
            c0572f0.f1789r0 = AbstractC0575H.m1195x(AbstractC0575H.m1192u(coroutineContext), true, c0572f0);
            do {
                atomicIntegerFieldUpdater = C0572F0.f1787s0;
                i10 = atomicIntegerFieldUpdater.get(c0572f0);
                if (i10 != 0) {
                    if (i10 == 2 || i10 == 3) {
                        break;
                        break;
                    }
                    C0572F0.m1148m(i10);
                    throw null;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(c0572f0, i10, 0));
            try {
                return interfaceC1426a.invoke();
            } finally {
                c0572f0.m1151l();
            }
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
