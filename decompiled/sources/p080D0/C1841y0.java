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

/* JADX INFO: renamed from: D0.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1841y0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f5333Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f5334Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC20772r0 f5335o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1841y0(InterfaceC20772r0 interfaceC20772r0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f5335o0 = interfaceC20772r0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1841y0 c1841y0 = new C1841y0(this.f5335o0, interfaceC18770c);
        c1841y0.f5334Z = obj;
        return c1841y0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1841y0) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f5333Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19723A c19723a = (C19723A) this.f5334Z;
            this.f5333Y = 1;
            if (AbstractC20740b0.m21276q(c19723a, this.f5335o0, this) == enumC19250a) {
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
