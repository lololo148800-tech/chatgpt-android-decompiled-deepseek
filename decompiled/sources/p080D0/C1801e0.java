package p080D0;

import mm.C17296C;
import p003A1.C0254h0;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p544W9.AbstractC8717t4;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: D0.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1801e0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f5169Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f5170Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1803f0 f5171o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C1840y f5172p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1801e0(C1803f0 c1803f0, C1840y c1840y, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f5171o0 = c1803f0;
        this.f5172p0 = c1840y;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1801e0 c1801e0 = new C1801e0(this.f5171o0, this.f5172p0, interfaceC18770c);
        c1801e0.f5170Z = obj;
        return c1801e0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1801e0) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f5169Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19723A c19723a = (C19723A) this.f5170Z;
            C0254h0 c0254h0 = new C0254h0(this.f5172p0, 14);
            this.f5169Y = 1;
            Object objM9428b = AbstractC8717t4.m9428b(c19723a, new C1797c0(c0254h0, null), this);
            if (objM9428b != enumC19250a) {
                objM9428b = c17296c;
            }
            if (objM9428b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
