package p1013t0;

import io.sentry.android.replay.capture.C15272c;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21690f;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: t0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C19719g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f62424Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19721i f62425Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C15272c f62426o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19719g(C19721i c19721i, C15272c c15272c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f62425Z = c19721i;
        this.f62426o0 = c15272c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19719g(this.f62425Z, this.f62426o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19719g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC19713a c19722j;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f62424Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19721i c19721i = this.f62425Z;
            if (c19721i.f30972y0) {
                if (c19721i.f30960Y.f30972y0) {
                    c19722j = (InterfaceC19713a) AbstractC21690f.m22205j(c19721i, C19721i.f62432B0);
                    if (c19722j == null) {
                        c19722j = new C19722j(c19721i);
                    }
                } else {
                    c19722j = null;
                }
                if (c19722j != null) {
                    AbstractC21678Y abstractC21678YM22216u = AbstractC21690f.m22216u(c19721i);
                    this.f62424Y = 1;
                    if (c19722j.mo20664h0(abstractC21678YM22216u, this.f62426o0, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
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
