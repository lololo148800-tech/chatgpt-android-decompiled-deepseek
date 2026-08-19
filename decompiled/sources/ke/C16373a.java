package ke;

import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p1155zi.C21936L0;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9393x3;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ke.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C16373a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f50846Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f50847Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f50848o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16373a(String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f50848o0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16373a c16373a = new C16373a(this.f50848o0, interfaceC18770c);
        c16373a.f50847Z = obj;
        return c16373a;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16373a) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f50846Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC2186j interfaceC2186j = (InterfaceC2186j) this.f50847Z;
            String str = this.f50848o0;
            if (str != null) {
                C17309l c17309l = new C17309l(AbstractC9393x3.m9974d(new C21936L0(str)), new C21936L0(str));
                this.f50846Y = 1;
                if (interfaceC2186j.mo395a(c17309l, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
