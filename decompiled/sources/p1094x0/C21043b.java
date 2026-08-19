package p1094x0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p544W9.AbstractC8717t4;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: x0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C21043b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f66927Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f66928Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21044c f66929o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21043b(C21044c c21044c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f66929o0 = c21044c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C21043b c21043b = new C21043b(this.f66929o0, interfaceC18770c);
        c21043b.f66928Z = obj;
        return c21043b;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C21043b) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f66927Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19723A c19723a = (C19723A) this.f66928Z;
            C21042a c21042a = new C21042a(this.f66929o0, null);
            this.f66927Y = 1;
            if (AbstractC8717t4.m9428b(c19723a, c21042a, this) == enumC19250a) {
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
