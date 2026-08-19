package p905nd;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2153Q0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: nd.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C17573a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C2153Q0 f56217Y;

    /* JADX INFO: renamed from: Z */
    public int f56218Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C17589q f56219o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17573a(C17589q c17589q, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f56219o0 = c17589q;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17573a(this.f56219o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17573a) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C2153Q0 c2153q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f56218Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C17589q c17589q = this.f56219o0;
            C2153Q0 c2153q1 = c17589q.f56309p;
            this.f56217Y = c2153q1;
            this.f56218Z = 1;
            obj = c17589q.m19225k(this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            c2153q0 = c2153q1;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2153q0 = this.f56217Y;
            AbstractC9233X.m9807c(obj);
        }
        c2153q0.setValue(obj);
        return C17296C.f55119a;
    }
}
