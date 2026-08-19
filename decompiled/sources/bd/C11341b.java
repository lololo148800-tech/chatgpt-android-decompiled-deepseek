package bd;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p492U1.C7545j;
import p571X9.AbstractC9233X;
import p758g0.C13756d;
import p758g0.C13768j;
import p758g0.InterfaceC13772l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: bd.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C11341b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f34283Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11340a f34284Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f34285o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11343d f34286p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11341b(C11340a c11340a, long j10, C11343d c11343d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f34284Z = c11340a;
        this.f34285o0 = j10;
        this.f34286p0 = c11343d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C11341b(this.f34284Z, this.f34285o0, this.f34286p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11341b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1439n interfaceC1439n;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f34283Y;
        C11340a c11340a = this.f34284Z;
        C11343d c11343d = this.f34286p0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13756d c13756d = c11340a.f34281a;
            C7545j c7545j = new C7545j(this.f34285o0);
            InterfaceC13772l interfaceC13772l = c11343d.f34297z0;
            this.f34283Y = 1;
            obj = C13756d.m15222c(c13756d, c7545j, interfaceC13772l, null, this, 12);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        C13768j c13768j = (C13768j) obj;
        if (c13768j.f43475b == 2 && (interfaceC1439n = c11343d.f34292A0) != null) {
            interfaceC1439n.invoke(new C7545j(c11340a.f34282b), c13768j.f43474a.f43502Z.getValue());
        }
        return C17296C.f55119a;
    }
}
