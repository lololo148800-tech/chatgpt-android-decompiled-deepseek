package p1014t1;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0624m;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: t1.w */
/* JADX INFO: loaded from: classes.dex */
public final class C19746w extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f62517Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f62518Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19748y f62519o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19746w(long j10, C19748y c19748y, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f62518Z = j10;
        this.f62519o0 = c19748y;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19746w(this.f62518Z, this.f62519o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19746w) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C0624m c0624m;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f62517Y;
        long j10 = this.f62518Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            c0624m = this.f62519o0.f62525o0;
            if (c0624m != null) {
                c0624m.resumeWith(AbstractC9233X.m9806b(new C19731h(j10)));
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        this.f62517Y = 1;
        if (AbstractC0575H.m1184m(j10 - 1, this) == enumC19250a) {
            return enumC19250a;
        }
        this.f62517Y = 2;
        if (AbstractC0575H.m1184m(1L, this) == enumC19250a) {
            return enumC19250a;
        }
        c0624m = this.f62519o0.f62525o0;
        if (c0624m != null) {
            c0624m.resumeWith(AbstractC9233X.m9806b(new C19731h(j10)));
        }
        return C17296C.f55119a;
    }
}
