package p905nd;

import fo.C13711h;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p432Rh.C6901n;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: nd.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C17594v extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f56329Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C17595w f56330Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13711h f56331o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f56332p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17594v(C17595w c17595w, C13711h c13711h, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f56330Z = c17595w;
        this.f56331o0 = c13711h;
        this.f56332p0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17594v(this.f56330Z, this.f56331o0, this.f56332p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17594v) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f56329Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6901n c6901n = this.f56330Z.f56333a;
            C17593u c17593u = new C17593u(this.f56331o0, this.f56332p0, null);
            this.f56329Y = 1;
            obj = AbstractC9144I.m9691c(c6901n, c17593u, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
