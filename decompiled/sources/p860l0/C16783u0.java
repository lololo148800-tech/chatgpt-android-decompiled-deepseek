package p860l0;

import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p571X9.AbstractC9233X;
import p759g1.C13800b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16783u0 extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f53873Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16783u0(int i10, InterfaceC18770c interfaceC18770c, int i11) {
        super(i10, interfaceC18770c);
        this.f53873Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f53873Y) {
            case 0:
                long j10 = ((C13800b) obj2).f43584a;
                C16783u0 c16783u0 = new C16783u0(3, (InterfaceC18770c) obj3, 0);
                C17296C c17296c = C17296C.f55119a;
                c16783u0.invokeSuspend(c17296c);
                return c17296c;
            case 1:
                ((Number) obj2).floatValue();
                C16783u0 c16783u1 = new C16783u0(3, (InterfaceC18770c) obj3, 1);
                C17296C c17296c2 = C17296C.f55119a;
                c16783u1.invokeSuspend(c17296c2);
                return c17296c2;
            case 2:
                long j11 = ((C13800b) obj2).f43584a;
                C16783u0 c16783u2 = new C16783u0(3, (InterfaceC18770c) obj3, 2);
                C17296C c17296c3 = C17296C.f55119a;
                c16783u2.invokeSuspend(c17296c3);
                return c17296c3;
            default:
                long j12 = ((C13800b) obj2).f43584a;
                C16783u0 c16783u3 = new C16783u0(3, (InterfaceC18770c) obj3, 3);
                C17296C c17296c4 = C17296C.f55119a;
                c16783u3.invokeSuspend(c17296c4);
                return c17296c4;
        }
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        switch (this.f53873Y) {
            case 0:
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                break;
            case 1:
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                break;
            case 2:
                EnumC19250a enumC19250a3 = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                break;
            default:
                EnumC19250a enumC19250a4 = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                break;
        }
        return c17296c;
    }
}
