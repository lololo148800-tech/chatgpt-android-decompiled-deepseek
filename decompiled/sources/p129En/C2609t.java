package p129En;

import java.util.concurrent.atomic.AtomicInteger;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p077Cn.C1743k;
import p103Dn.InterfaceC2184i;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: En.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C2609t extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f8082Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2184i[] f8083Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f8084o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AtomicInteger f8085p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C1743k f8086q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2609t(InterfaceC2184i[] interfaceC2184iArr, int i10, AtomicInteger atomicInteger, C1743k c1743k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f8083Z = interfaceC2184iArr;
        this.f8084o0 = i10;
        this.f8085p0 = atomicInteger;
        this.f8086q0 = c1743k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2609t(this.f8083Z, this.f8084o0, this.f8085p0, this.f8086q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2609t) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f8082Y;
        AtomicInteger atomicInteger = this.f8085p0;
        C1743k c1743k = this.f8086q0;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                InterfaceC2184i[] interfaceC2184iArr = this.f8083Z;
                int i11 = this.f8084o0;
                InterfaceC2184i interfaceC2184i = interfaceC2184iArr[i11];
                C2608s c2608s = new C2608s(c1743k, i11);
                this.f8082Y = 1;
                if (interfaceC2184i.mo3141d(c2608s, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                c1743k.mo2522l(null);
            }
            return C17296C.f55119a;
        } catch (Throwable th2) {
            if (atomicInteger.decrementAndGet() == 0) {
                c1743k.mo2522l(null);
            }
            throw th2;
        }
    }
}
