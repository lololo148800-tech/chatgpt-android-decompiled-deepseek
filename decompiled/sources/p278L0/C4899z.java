package p278L0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1014t1.C19748y;
import p1014t1.EnumC19730g;
import p571X9.AbstractC9233X;
import p860l0.AbstractC16689K1;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: L0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C4899z extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public int f15959Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f15960o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ EnumC19730g f15961p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4899z(EnumC19730g enumC19730g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15961p0 = enumC19730g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4899z c4899z = new C4899z(this.f15961p0, interfaceC18770c);
        c4899z.f15960o0 = obj;
        return c4899z;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4899z) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15959Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19748y c19748y = (C19748y) this.f15960o0;
            this.f15959Z = 1;
            obj = AbstractC16689K1.m18509f(c19748y, this.f15961p0, this);
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
