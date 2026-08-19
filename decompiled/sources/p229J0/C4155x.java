package p229J0;

import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p571X9.AbstractC9233X;
import p758g0.C13796x;
import p758g0.InterfaceC13772l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C4155x extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f13461Y;

    /* JADX INFO: renamed from: Z */
    public int f13462Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ float f13463o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC3923H4 f13464p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4155x(InterfaceC3923H4 interfaceC3923H4, InterfaceC18770c interfaceC18770c, int i10) {
        super(3, interfaceC18770c);
        this.f13461Y = i10;
        this.f13464p0 = interfaceC3923H4;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10 = this.f13461Y;
        float fFloatValue = ((Number) obj2).floatValue();
        InterfaceC18770c interfaceC18770c = (InterfaceC18770c) obj3;
        switch (i10) {
            case 0:
                C4155x c4155x = new C4155x(this.f13464p0, interfaceC18770c, 0);
                c4155x.f13463o0 = fFloatValue;
                return c4155x.invokeSuspend(C17296C.f55119a);
            default:
                C4155x c4155x2 = new C4155x(this.f13464p0, interfaceC18770c, 1);
                c4155x2.f13463o0 = fFloatValue;
                return c4155x2.invokeSuspend(C17296C.f55119a);
        }
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        switch (this.f13461Y) {
            case 0:
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.f13462Z;
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    float f10 = this.f13463o0;
                    InterfaceC3923H4 interfaceC3923H4 = this.f13464p0;
                    C3935J4 state = interfaceC3923H4.getState();
                    C13796x c13796xMo3545b = interfaceC3923H4.mo3545b();
                    InterfaceC13772l interfaceC13772lMo3547d = interfaceC3923H4.mo3547d();
                    this.f13462Z = 1;
                    if (AbstractC3918H.m4625g(state, f10, c13796xMo3545b, interfaceC13772lMo3547d, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
            default:
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i11 = this.f13462Z;
                if (i11 == 0) {
                    AbstractC9233X.m9807c(obj);
                    float f11 = this.f13463o0;
                    InterfaceC3923H4 interfaceC3923H5 = this.f13464p0;
                    C3935J4 state2 = interfaceC3923H5.getState();
                    C13796x c13796xMo3545b2 = interfaceC3923H5.mo3545b();
                    InterfaceC13772l interfaceC13772lMo3547d2 = interfaceC3923H5.mo3547d();
                    this.f13462Z = 1;
                    if (AbstractC3918H.m4625g(state2, f11, c13796xMo3545b2, interfaceC13772lMo3547d2, this) == enumC19250a2) {
                        return enumC19250a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
        }
    }
}
