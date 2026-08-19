package p278L0;

import mm.C17296C;
import p041Be.C1217J;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p658b5.C11246q;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: L0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C4887n extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15928Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f15929Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1217J f15930o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11246q f15931p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4887n(C1217J c1217j, C11246q c11246q, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15930o0 = c1217j;
        this.f15931p0 = c11246q;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4887n c4887n = new C4887n(this.f15930o0, this.f15931p0, interfaceC18770c);
        c4887n.f15929Z = obj;
        return c4887n;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4887n) create((C4855T) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15928Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C4855T c4855t = (C4855T) this.f15929Z;
            C4892s c4892s = (C4892s) this.f15931p0.f34077n;
            this.f15928Y = 1;
            if (this.f15930o0.invoke(c4892s, c4855t, this) == enumC19250a) {
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
