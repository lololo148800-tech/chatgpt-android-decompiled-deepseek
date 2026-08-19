package p1071w0;

import mm.C17296C;
import p002A0.C0118Q;
import p002A0.C0120T;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: w0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C20765o extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f65910Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f65911Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0120T f65912o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20765o(C0120T c0120t, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65912o0 = c0120t;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C20765o c20765o = new C20765o(this.f65912o0, interfaceC18770c);
        c20765o.f65911Z = obj;
        return c20765o;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20765o) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f65910Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19723A c19723a = (C19723A) this.f65911Z;
            this.f65910Y = 1;
            C0120T c0120t = this.f65912o0;
            c0120t.getClass();
            Object objM1183l = AbstractC0575H.m1183l(new C0118Q(c0120t, null, c19723a, true), this);
            if (objM1183l != enumC19250a) {
                objM1183l = c17296c;
            }
            if (objM1183l == enumC19250a) {
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
