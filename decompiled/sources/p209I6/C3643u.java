package p209I6;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: I6.u */
/* JADX INFO: loaded from: classes.dex */
public final class C3643u extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f11111Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16525B f11112Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3643u(C16525B c16525b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f11112Z = c16525b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3643u(this.f11112Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3643u) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f11111Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            Object obj2 = this.f11112Z.f51262Y;
            AbstractC16544l.m18091d(obj2);
            this.f11111Y = 1;
            if (((AbstractC3622B) obj2).mo4333d(this) == enumC19250a) {
                return enumC19250a;
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
