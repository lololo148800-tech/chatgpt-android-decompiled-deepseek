package p103Dn;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p077Cn.C1757y;
import p077Cn.EnumC1733a;
import p077Cn.InterfaceC1758z;
import p129En.AbstractC2596g;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C2172c extends C2176e {

    /* JADX INFO: renamed from: r0 */
    public final AbstractC19694j f6658r0;

    /* JADX WARN: Multi-variable type inference failed */
    public C2172c(InterfaceC1439n interfaceC1439n, InterfaceC18776i interfaceC18776i, int i10, EnumC1733a enumC1733a) {
        super(interfaceC1439n, interfaceC18776i, i10, enumC1733a);
        this.f6658r0 = (AbstractC19694j) interfaceC1439n;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p103Dn.C2176e, p129En.AbstractC2596g
    /* JADX INFO: renamed from: g */
    public final Object mo3253g(InterfaceC1758z interfaceC1758z, InterfaceC18770c interfaceC18770c) {
        C2170b c2170b;
        if (interfaceC18770c instanceof C2170b) {
            c2170b = (C2170b) interfaceC18770c;
            int i10 = c2170b.f6654p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2170b.f6654p0 = i10 - Integer.MIN_VALUE;
            } else {
                c2170b = new C2170b(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c2170b = new C2170b(this, (AbstractC19687c) interfaceC18770c);
        }
        Object obj = c2170b.f6652Z;
        Object obj2 = EnumC19250a.f61036Y;
        int i11 = c2170b.f6654p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c2170b.f6651Y = interfaceC1758z;
            c2170b.f6654p0 = 1;
            if (super.mo3253g(interfaceC1758z, c2170b) == obj2) {
                return obj2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1758z = c2170b.f6651Y;
            AbstractC9233X.m9807c(obj);
        }
        if (((C1757y) interfaceC1758z).f5030p0.m2535D()) {
            return C17296C.f55119a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.n, sm.j] */
    @Override // p103Dn.C2176e, p129En.AbstractC2596g
    /* JADX INFO: renamed from: h */
    public final AbstractC2596g mo3254h(InterfaceC18776i interfaceC18776i, int i10, EnumC1733a enumC1733a) {
        return new C2172c(this.f6658r0, interfaceC18776i, i10, enumC1733a);
    }
}
