package p758g0;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: g0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C13760f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f43442Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f43443Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13756d f43444o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f43445p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC5985X f43446q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13760f(Object obj, C13756d c13756d, InterfaceC5985X interfaceC5985X, InterfaceC5985X interfaceC5985X2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f43443Z = obj;
        this.f43444o0 = c13756d;
        this.f43445p0 = interfaceC5985X;
        this.f43446q0 = interfaceC5985X2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C13760f(this.f43443Z, this.f43444o0, this.f43445p0, this.f43446q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13760f) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f43442Y;
        C13756d c13756d = this.f43444o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            if (!AbstractC16544l.m18089b(this.f43443Z, c13756d.f43413e.getValue())) {
                C13746W c13746w = AbstractC13764h.f43457a;
                InterfaceC13772l interfaceC13772l = (InterfaceC13772l) this.f43445p0.getValue();
                this.f43442Y = 1;
                if (C13756d.m15222c(this.f43444o0, this.f43443Z, interfaceC13772l, null, this, 12) == enumC19250a) {
                    return enumC19250a;
                }
            }
            return C17296C.f55119a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        C13746W c13746w2 = AbstractC13764h.f43457a;
        InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f43446q0.getValue();
        if (interfaceC1436k != null) {
            interfaceC1436k.invoke(c13756d.m15224e());
        }
        return C17296C.f55119a;
    }
}
