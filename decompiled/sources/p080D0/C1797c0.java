package p080D0;

import mm.C17296C;
import p003A1.C0254h0;
import p049Bm.InterfaceC1439n;
import p1014t1.C19738o;
import p1014t1.C19748y;
import p1014t1.EnumC19730g;
import p571X9.AbstractC9233X;
import p860l0.AbstractC16689K1;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: D0.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1797c0 extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public int f5152Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f5153o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C0254h0 f5154p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1797c0(C0254h0 c0254h0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f5154p0 = c0254h0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1797c0 c1797c0 = new C1797c0(this.f5154p0, interfaceC18770c);
        c1797c0.f5153o0 = obj;
        return c1797c0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1797c0) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f5152Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19748y c19748y = (C19748y) this.f5153o0;
            this.f5152Z = 1;
            obj = AbstractC16689K1.m18509f(c19748y, EnumC19730g.f62466Z, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        if (((C19738o) obj) != null) {
            ((C1840y) this.f5154p0.f959Z).invoke();
        }
        return C17296C.f55119a;
    }
}
