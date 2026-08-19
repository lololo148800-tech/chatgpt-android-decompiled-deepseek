package p080D0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p1071w0.AbstractC20740b0;
import p1071w0.InterfaceC20772r0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: D0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1838x extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f5326Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f5327Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC20772r0 f5328o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1838x(InterfaceC20772r0 interfaceC20772r0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f5328o0 = interfaceC20772r0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1838x c1838x = new C1838x(this.f5328o0, interfaceC18770c);
        c1838x.f5327Z = obj;
        return c1838x;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1838x) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f5326Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19723A c19723a = (C19723A) this.f5327Z;
            this.f5326Y = 1;
            if (AbstractC20740b0.m21276q(c19723a, this.f5328o0, this) == enumC19250a) {
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
