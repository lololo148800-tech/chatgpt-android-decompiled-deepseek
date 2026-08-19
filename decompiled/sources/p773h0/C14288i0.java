package p773h0;

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
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18774g;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: h0.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C14288i0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public InterfaceC4814a f44831Y;

    /* JADX INFO: renamed from: Z */
    public Object f44832Z;

    /* JADX INFO: renamed from: o0 */
    public C14292k0 f44833o0;

    /* JADX INFO: renamed from: p0 */
    public int f44834p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f44835q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ EnumC14284g0 f44836r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C14292k0 f44837s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ AbstractC19694j f44838t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C14288i0(EnumC14284g0 enumC14284g0, C14292k0 c14292k0, InterfaceC1436k interfaceC1436k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44836r0 = enumC14284g0;
        this.f44837s0 = c14292k0;
        this.f44838t0 = (AbstractC19694j) interfaceC1436k;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.k, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14288i0 c14288i0 = new C14288i0(this.f44836r0, this.f44837s0, this.f44838t0, interfaceC18770c);
        c14288i0.f44835q0 = obj;
        return c14288i0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14288i0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [Bm.k] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C14292k0 c14292k0;
        ?? r6;
        C14286h0 c14286h0;
        InterfaceC4814a interfaceC4814a;
        InterfaceC4814a interfaceC4814a2;
        C14286h0 c14286h1;
        C14292k0 c14292k1;
        Throwable th2;
        AtomicReference atomicReference;
        InterfaceC4814a interfaceC4814a3;
        AtomicReference atomicReference2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        ?? r10 = this.f44834p0;
        try {
            try {
                if (r10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    InterfaceC18774g interfaceC18774g = ((InterfaceC0571F) this.f44835q0).getCoroutineContext().get(C0625m0.f1875Y);
                    AbstractC16544l.m18091d(interfaceC18774g);
                    C14286h0 c14286h2 = new C14286h0(this.f44836r0, (InterfaceC0627n0) interfaceC18774g);
                    c14292k0 = this.f44837s0;
                    C14292k0.m15578a(c14292k0, c14286h2);
                    this.f44835q0 = c14286h2;
                    C4816c c4816c = c14292k0.f44873b;
                    this.f44831Y = c4816c;
                    AbstractC19694j abstractC19694j = this.f44838t0;
                    this.f44832Z = abstractC19694j;
                    this.f44833o0 = c14292k0;
                    this.f44834p0 = 1;
                    if (c4816c.m5448e(null, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    r6 = abstractC19694j;
                    c14286h0 = c14286h2;
                    interfaceC4814a = c4816c;
                } else {
                    if (r10 != 1) {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c14292k1 = (C14292k0) this.f44832Z;
                        InterfaceC4814a interfaceC4814a4 = this.f44831Y;
                        c14286h1 = (C14286h0) this.f44835q0;
                        try {
                            AbstractC9233X.m9807c(obj);
                            interfaceC4814a3 = interfaceC4814a4;
                            atomicReference2 = c14292k1.f44872a;
                            while (!atomicReference2.compareAndSet(c14286h1, null) && atomicReference2.get() == c14286h1) {
                            }
                            ((C4816c) interfaceC4814a3).m5450g(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            atomicReference = c14292k1.f44872a;
                            while (!atomicReference.compareAndSet(c14286h1, null)) {
                            }
                            throw th2;
                        }
                    }
                    C14292k0 c14292k2 = this.f44833o0;
                    InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f44832Z;
                    InterfaceC4814a interfaceC4814a5 = this.f44831Y;
                    c14286h0 = (C14286h0) this.f44835q0;
                    AbstractC9233X.m9807c(obj);
                    c14292k0 = c14292k2;
                    r6 = interfaceC1436k;
                    interfaceC4814a = interfaceC4814a5;
                }
                this.f44835q0 = c14286h0;
                this.f44831Y = interfaceC4814a2;
                this.f44832Z = c14292k0;
                this.f44833o0 = null;
                this.f44834p0 = 2;
                Object objInvoke = r6.invoke(this);
                if (objInvoke == enumC19250a) {
                    return enumC19250a;
                }
                c14292k1 = c14292k0;
                obj = objInvoke;
                c14286h1 = c14286h0;
                interfaceC4814a3 = interfaceC4814a2;
                atomicReference2 = c14292k1.f44872a;
                while (!atomicReference2.compareAndSet(c14286h1, null)) {
                }
                ((C4816c) interfaceC4814a3).m5450g(null);
                return obj;
            } catch (Throwable th4) {
                c14286h1 = c14286h0;
                c14292k1 = c14292k0;
                th2 = th4;
                atomicReference = c14292k1.f44872a;
                while (!atomicReference.compareAndSet(c14286h1, null) && atomicReference.get() == c14286h1) {
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
