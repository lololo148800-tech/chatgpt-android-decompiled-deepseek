package p860l0;

import androidx.compose.foundation.gestures.AbstractC10840a;
import mm.C17296C;
import p049Bm.InterfaceC1441p;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C16728c extends AbstractC19694j implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public int f53614Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ C16779t f53615Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ C16670E0 f53616o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f53617p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16782u f53618q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16728c(C16782u c16782u, InterfaceC18770c interfaceC18770c) {
        super(4, interfaceC18770c);
        this.f53618q0 = c16782u;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        C16728c c16728c = new C16728c(this.f53618q0, (InterfaceC18770c) obj4);
        c16728c.f53615Z = (C16779t) obj;
        c16728c.f53616o0 = (C16670E0) obj2;
        c16728c.f53617p0 = obj3;
        return c16728c.invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53614Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16779t c16779t = this.f53615Z;
            C16670E0 c16670e0 = this.f53616o0;
            Object obj2 = this.f53617p0;
            C16782u c16782u = this.f53618q0;
            float fM6409g = c16782u.f53869k.m6409g();
            this.f53615Z = null;
            this.f53616o0 = null;
            this.f53614Y = 1;
            if (AbstractC10840a.m11215a(c16782u, fM6409g, c16779t, c16670e0, obj2, this) == enumC19250a) {
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
