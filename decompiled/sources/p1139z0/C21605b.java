package p1139z0;

import mm.C17296C;
import p003A1.C0205S1;
import p025An.InterfaceC0571F;
import p046Bk.C1419y0;
import p049Bm.InterfaceC1439n;
import p103Dn.C2127D0;
import p103Dn.InterfaceC2211v0;
import p1071w0.AbstractC20734X;
import p349O0.C5997d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: z0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C21605b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f68429Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21611e f68430Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21585H f68431o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21605b(C21611e c21611e, C21585H c21585h, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f68430Z = c21611e;
        this.f68431o0 = c21585h;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C21605b(this.f68430Z, this.f68431o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C21605b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f68429Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C21603a c21603a = C21603a.f68418Z;
            this.f68429Y = 1;
            if (C5997d.m6424K(getContext()).mo876v0(new C1419y0(1, c21603a), this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw AbstractC20734X.m21252w(obj);
            }
            AbstractC9233X.m9807c(obj);
        }
        InterfaceC2211v0 interfaceC2211v0M21948i = this.f68430Z.m21948i();
        if (interfaceC2211v0M21948i == null) {
            return C17296C.f55119a;
        }
        C0205S1 c0205s1 = new C0205S1(this.f68431o0, 9);
        this.f68429Y = 2;
        C2127D0.m3228m((C2127D0) interfaceC2211v0M21948i, c0205s1, this);
        return enumC19250a;
    }
}
