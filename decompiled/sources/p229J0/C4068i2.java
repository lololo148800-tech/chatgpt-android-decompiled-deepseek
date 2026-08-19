package p229J0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p278L0.C4855T;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.i2 */
/* JADX INFO: loaded from: classes.dex */
public final class C4068i2 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f12942Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3880A3 f12943Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4068i2(C3880A3 c3880a3, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f12943Z = c3880a3;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4068i2(this.f12943Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4068i2) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f12942Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f12942Y = 1;
            C3880A3 c3880a3 = this.f12943Z;
            C4855T c4855tM12638h = c3880a3.f11737c.m12638h();
            EnumC3886B3 enumC3886B3 = EnumC3886B3.f11779o0;
            if (!c4855tM12638h.f15815a.containsKey(enumC3886B3)) {
                enumC3886B3 = EnumC3886B3.f11778Z;
            }
            Object objM4601a = C3880A3.m4601a(c3880a3, enumC3886B3, this);
            if (objM4601a != enumC19250a) {
                objM4601a = c17296c;
            }
            if (objM4601a == enumC19250a) {
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
