package p226In;

import mm.C17296C;
import p025An.AbstractC0563B;
import p025An.C0624m;
import p025An.C0642v;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p153Fn.C2928f;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: In.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C3781c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f11420Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3782d f11421Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3781c(C3782d c3782d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f11421Z = c3782d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3781c(this.f11421Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3781c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f11420Y;
        C17296C c17296c = C17296C.f55119a;
        C3782d c3782d = this.f11421Z;
        C0624m c0624m = c3782d.f11422s0;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                this.f11420Y = 1;
                obj = C3785g.f11436r0.get(c3782d) instanceof C3783e ? c3782d.m4454c(this) : c3782d.m4455d(this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            AbstractC0563B abstractC0563B = (AbstractC0563B) c0624m.f1874q0.get(AbstractC0563B.f1782Y);
            if (abstractC0563B != null) {
                c0624m.m1253D(abstractC0563B, obj);
            } else {
                c0624m.resumeWith(obj);
            }
            return c17296c;
        } catch (Throwable th2) {
            AbstractC0563B abstractC0563B2 = (AbstractC0563B) c0624m.f1874q0.get(AbstractC0563B.f1782Y);
            if (abstractC0563B2 != null) {
                InterfaceC18770c interfaceC18770c = c0624m.f1873p0;
                C2928f c2928f = interfaceC18770c instanceof C2928f ? (C2928f) interfaceC18770c : null;
                c0624m.m1252C(new C0642v(th2, false), (c2928f != null ? c2928f.f8773p0 : null) == abstractC0563B2 ? 4 : c0624m.f1822o0, null);
            } else {
                c0624m.resumeWith(AbstractC9233X.m9806b(th2));
            }
            return c17296c;
        }
    }
}
