package p203I0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1140z1.AbstractC21690f;
import p571X9.AbstractC9233X;
import p894n0.C17409o;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: I0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3546c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f10746Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3559p f10747Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3547d f10748o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C17409o f10749p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3546c(C3559p c3559p, C3547d c3547d, C17409o c17409o, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10747Z = c3559p;
        this.f10748o0 = c3547d;
        this.f10749p0 = c17409o;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3546c(this.f10747Z, this.f10748o0, this.f10749p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3546c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f10746Y;
        C17409o c17409o = this.f10749p0;
        C3547d c3547d = this.f10748o0;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C3559p c3559p = this.f10747Z;
                this.f10746Y = 1;
                if (c3559p.m4233a(this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            c3547d.f10750I0.m14621g(c17409o);
            AbstractC21690f.m22209n(c3547d);
            return C17296C.f55119a;
        } catch (Throwable th2) {
            c3547d.f10750I0.m14621g(c17409o);
            AbstractC21690f.m22209n(c3547d);
            throw th2;
        }
    }
}
