package p1099x6;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p909nm.C17691y;
import p917o6.C17852e;
import p917o6.C17853f;
import p917o6.C17867t;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: x6.j */
/* JADX INFO: loaded from: classes.dex */
public final class C21142j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f67184Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f67185Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21143k f67186o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C17852e f67187p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C17867t f67188q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21142j(C21143k c21143k, C17852e c17852e, C17867t c17867t, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f67186o0 = c21143k;
        this.f67187p0 = c17852e;
        this.f67188q0 = c17867t;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C21142j c21142j = new C21142j(this.f67186o0, this.f67187p0, this.f67188q0, interfaceC18770c);
        c21142j.f67185Z = obj;
        return c21142j;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C21142j) create((C17853f) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f67184Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C17853f c17853f = (C17853f) this.f67185Z;
            this.f67184Y = 1;
            if (this.f67186o0.m21591b(this.f67187p0, c17853f, this.f67188q0, C17691y.f56482Y, this) == enumC19250a) {
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
