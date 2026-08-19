package p103Dn;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p129En.AbstractC2592c;
import p153Fn.C2942t;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C2200q extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f6742Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2186j f6743Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16525B f6744o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2200q(InterfaceC2186j interfaceC2186j, C16525B c16525b, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f6743Z = interfaceC2186j;
        this.f6744o0 = c16525b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C2200q(this.f6743Z, this.f6744o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C2200q) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f6742Y;
        C16525B c16525b = this.f6744o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2942t c2942t = AbstractC2592c.f8037b;
            Object obj2 = c16525b.f51262Y;
            if (obj2 == c2942t) {
                obj2 = null;
            }
            this.f6742Y = 1;
            if (this.f6743Z.mo395a(obj2, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        c16525b.f51262Y = null;
        return C17296C.f55119a;
    }
}
