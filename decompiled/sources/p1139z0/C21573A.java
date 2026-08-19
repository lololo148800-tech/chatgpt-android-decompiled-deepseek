package p1139z0;

import java.util.concurrent.atomic.AtomicReference;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: z0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C21573A extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f68311Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21575B f68312Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21573A(C21575B c21575b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f68312Z = c21575b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C21573A c21573a = new C21573A(this.f68312Z, interfaceC18770c);
        c21573a.f68311Y = obj;
        return c21573a;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C21573A) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        boolean z6;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f68311Y;
        C21575B c21575b = this.f68312Z;
        InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) c21575b.f68321a.getAndSet(null);
        AtomicReference atomicReference = c21575b.f68321a;
        C0564B0 c0564b0M1156D = AbstractC0575H.m1156D(interfaceC0571F, null, null, new C21653z(interfaceC0627n0, c21575b, null), 3);
        while (!atomicReference.compareAndSet(null, c0564b0M1156D)) {
            if (atomicReference.get() != null) {
                z6 = false;
                return Boolean.valueOf(z6);
            }
        }
        z6 = true;
        return Boolean.valueOf(z6);
    }
}
