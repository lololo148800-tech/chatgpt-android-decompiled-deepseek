package p628Zk;

import java.util.Iterator;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Zk.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C10413l extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C10416o f30862Y;

    /* JADX INFO: renamed from: Z */
    public Iterator f30863Z;

    /* JADX INFO: renamed from: o0 */
    public int f30864o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C10416o f30865p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10413l(C10416o c10416o, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f30865p0 = c10416o;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C10413l(this.f30865p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C10413l) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        C10416o c10416o;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f30864o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C10416o c10416o2 = this.f30865p0;
            it = c10416o2.f30879Z.iterator();
            c10416o = c10416o2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f30863Z;
            c10416o = this.f30862Y;
            AbstractC9233X.m9807c(obj);
        }
        while (it.hasNext()) {
            InterfaceC1439n interfaceC1439n = (InterfaceC1439n) it.next();
            InterfaceC10407f interfaceC10407f = c10416o.f30878Y;
            this.f30862Y = c10416o;
            this.f30863Z = it;
            this.f30864o0 = 1;
            if (interfaceC1439n.invoke(interfaceC10407f, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
