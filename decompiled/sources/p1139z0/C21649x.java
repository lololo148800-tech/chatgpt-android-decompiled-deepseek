package p1139z0;

import kotlin.jvm.internal.C16558z;
import mm.C17296C;
import p002A0.C0132i;
import p003A1.C0205S1;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p086D6.C1971o;
import p103Dn.C2219z0;
import p1071w0.C20714I0;
import p349O0.C5997d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: z0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C21649x extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f68601Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21651y f68602Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21649x(C21651y c21651y, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f68602Z = c21651y;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C21649x(this.f68602Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C21649x) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f68601Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C21651y c21651y = this.f68602Z;
            C2219z0 c2219z0M6441a0 = C5997d.m6441a0(new C20714I0(c21651y, 5));
            C0205S1 c0205s1 = new C0205S1(c21651y, 11);
            this.f68601Y = 1;
            Object objMo3141d = c2219z0M6441a0.mo3141d(new C0132i(new C16558z(), 4, new C1971o(c0205s1, 3)), this);
            if (objMo3141d != EnumC19250a.f61036Y) {
                objMo3141d = c17296c;
            }
            if (objMo3141d != enumC19250a) {
                objMo3141d = c17296c;
            }
            if (objMo3141d == enumC19250a) {
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
