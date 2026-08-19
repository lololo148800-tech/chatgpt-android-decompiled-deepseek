package mk;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2153Q0;
import p222Ij.C3739d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: mk.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C17281b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f55092Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C17282c f55093Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C17280a f55094o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17281b(C17282c c17282c, C17280a c17280a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f55093Z = c17282c;
        this.f55094o0 = c17280a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17281b(this.f55093Z, this.f55094o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17281b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f55092Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2153Q0 c2153q0 = (C2153Q0) this.f55093Z.f55095a.f7160p0;
            C17280a c17280a = this.f55094o0;
            C3739d c3739d = new C3739d(c17280a.f55088Y, c17280a.f55089Z, c17280a.f55091p0);
            this.f55092Y = 1;
            c2153q0.getClass();
            c2153q0.m3251l(null, c3739d);
            if (c17296c == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
