package p1156zj;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p003A1.C0205S1;
import p025An.InterfaceC0571F;
import p041Be.C1217J;
import p049Bm.InterfaceC1439n;
import p103Dn.C2153Q0;
import p103Dn.C2167Z;
import p103Dn.C2219z0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: zj.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C22149e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f70022Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22170l f70023Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22149e(C22170l c22170l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f70023Z = c22170l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C22149e(this.f70023Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C22149e) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f70022Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C22170l c22170l = this.f70023Z;
            C2153Q0 c2153q0Mo209b = c22170l.f70152b.mo209b();
            AbstractC16544l.m18094g(c2153q0Mo209b, "<this>");
            C2219z0 c2219z0 = new C2219z0(new C2167Z(c2153q0Mo209b, new C1217J(3, (InterfaceC18770c) null, 13), null));
            C0205S1 c0205s1 = new C0205S1(c22170l, 12);
            this.f70022Y = 1;
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
