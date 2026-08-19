package p1156zj;

import androidx.lifecycle.C11107p;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0564B0;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p571X9.AbstractC9233X;
import p949pj.InterfaceC18483p;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: zj.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C22167k extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f70130Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22170l f70131Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C22172l1 f70132o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11107p f70133p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ long f70134q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22167k(C22170l c22170l, C22172l1 c22172l1, C11107p c11107p, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f70131Z = c22170l;
        this.f70132o0 = c22172l1;
        this.f70133p0 = c11107p;
        this.f70134q0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C22167k(this.f70131Z, this.f70132o0, this.f70133p0, this.f70134q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C22167k) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f70130Y;
        C22170l c22170l = this.f70131Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC18483p interfaceC18483p = c22170l.f70152b;
            this.f70130Y = 1;
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
            int i11 = C22170l.f70150n;
            C11107p c11107p = this.f70133p0;
            C0564B0 c0564b0 = c22170l.f70157g;
            if (c0564b0 != null) {
                c0564b0.mo1275e(null);
            }
            C3516e c3516e = AbstractC0593T.f1824a;
            c22170l.f70157g = AbstractC0575H.m1156D(c11107p, ExecutorC3515d.f10633Z, null, new C22152f(this.f70134q0, this.f70132o0, c22170l, null), 2);
        }
        return C17296C.f55119a;
    }
}
