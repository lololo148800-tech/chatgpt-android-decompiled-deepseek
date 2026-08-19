package p993rj;

import mm.C17296C;
import p001A.C0042V0;
import p003A1.C0205S1;
import p025An.InterfaceC0571F;
import p041Be.C1217J;
import p049Bm.InterfaceC1439n;
import p103Dn.C2167Z;
import p103Dn.C2219z0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: rj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C19039a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f60695Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0042V0 f60696Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19039a(C0042V0 c0042v0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f60696Z = c0042v0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19039a(this.f60696Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19039a) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f60695Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C0042V0 c0042v0 = this.f60696Z;
            C2219z0 c2219z0 = new C2219z0(new C2167Z(((C19024D) c0042v0.f207p0).f60638w, new C1217J(3, (InterfaceC18770c) null, 14), null));
            C0205S1 c0205s1 = new C0205S1(c0042v0, 7);
            this.f60695Y = 1;
            if (c2219z0.mo3141d(c0205s1, this) == enumC19250a) {
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
