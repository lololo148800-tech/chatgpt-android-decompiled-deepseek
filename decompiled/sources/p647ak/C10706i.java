package p647ak;

import androidx.lifecycle.C11107p;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0564B0;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p523V9.AbstractC8170q0;
import p571X9.AbstractC9233X;
import p949pj.InterfaceC18483p;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ak.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C10706i extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f31816Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C10713l f31817Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11107p f31818o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC8170q0 f31819p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10706i(C10713l c10713l, C11107p c11107p, AbstractC8170q0 abstractC8170q0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f31817Z = c10713l;
        this.f31818o0 = c11107p;
        this.f31819p0 = abstractC8170q0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C10706i(this.f31817Z, this.f31818o0, this.f31819p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C10706i) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f31816Y;
        C10713l c10713l = this.f31817Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC18483p interfaceC18483p = c10713l.f31834b;
            this.f31816Y = 1;
            obj = interfaceC18483p.mo221o(this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            C0564B0 c0564b0 = c10713l.f31836d;
            if (c0564b0 != null) {
                c0564b0.mo1275e(null);
            }
            C3516e c3516e = AbstractC0593T.f1824a;
            c10713l.f31836d = AbstractC0575H.m1156D(this.f31818o0, ExecutorC3515d.f10633Z, null, new C10703h(this.f31819p0, c10713l, null), 2);
        }
        return C17296C.f55119a;
    }
}
