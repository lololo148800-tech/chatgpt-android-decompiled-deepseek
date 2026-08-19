package p860l0;

import io.sentry.android.replay.capture.C15272c;
import mm.C17296C;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.D */
/* JADX INFO: loaded from: classes.dex */
public final class C16666D extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53370Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f53371Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16698N1 f53372o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16672F f53373p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC16794y f53374q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC0627n0 f53375r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16666D(C16698N1 c16698n1, C16672F c16672f, InterfaceC16794y interfaceC16794y, InterfaceC0627n0 interfaceC0627n0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53372o0 = c16698n1;
        this.f53373p0 = c16672f;
        this.f53374q0 = interfaceC16794y;
        this.f53375r0 = interfaceC0627n0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16666D c16666d = new C16666D(this.f53372o0, this.f53373p0, this.f53374q0, this.f53375r0, interfaceC18770c);
        c16666d.f53371Z = obj;
        return c16666d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16666D) create((C16748i1) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53370Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16748i1 c16748i1 = (C16748i1) this.f53371Z;
            InterfaceC16794y interfaceC16794y = this.f53374q0;
            C16672F c16672f = this.f53373p0;
            float fM18496K0 = C16672F.m18496K0(c16672f, interfaceC16794y);
            C16698N1 c16698n1 = this.f53372o0;
            c16698n1.f53512e = fM18496K0;
            C16663C c16663c = new C16663C(c16672f, this.f53375r0, c16748i1, 0);
            C15272c c15272c = new C15272c(c16672f, c16698n1, interfaceC16794y, 6);
            this.f53370Y = 1;
            if (c16698n1.m18511a(c16663c, c15272c, this) == enumC19250a) {
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
