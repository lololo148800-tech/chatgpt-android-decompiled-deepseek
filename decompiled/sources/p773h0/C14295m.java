package p773h0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p544W9.AbstractC8717t4;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: h0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C14295m extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f44880Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f44881Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14297n f44882o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14295m(C14297n c14297n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44882o0 = c14297n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14295m c14295m = new C14295m(this.f44882o0, interfaceC18770c);
        c14295m.f44881Z = obj;
        return c14295m;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14295m) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44880Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19723A c19723a = (C19723A) this.f44881Z;
            C14293l c14293l = new C14293l(this.f44882o0, null);
            this.f44880Y = 1;
            if (AbstractC8717t4.m9428b(c19723a, c14293l, this) == enumC19250a) {
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
