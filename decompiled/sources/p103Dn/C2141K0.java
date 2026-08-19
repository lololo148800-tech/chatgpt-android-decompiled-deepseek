package p103Dn;

import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import p002A0.C0132i;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.K0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2141K0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f6557Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f6558Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC2149O0 f6559o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2141K0(InterfaceC2149O0 interfaceC2149O0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f6559o0 = interfaceC2149O0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2141K0 c2141k0 = new C2141K0(this.f6559o0, interfaceC18770c);
        c2141k0.f6558Z = obj;
        return c2141k0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C2141K0) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f6557Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C0132i c0132i = new C0132i(new C16556x(), 7, (InterfaceC2186j) this.f6558Z);
            this.f6557Y = 1;
            if (this.f6559o0.mo3141d(c0132i, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        throw new C0644w();
    }
}
