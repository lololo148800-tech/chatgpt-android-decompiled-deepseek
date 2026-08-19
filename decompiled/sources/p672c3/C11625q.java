package p672c3;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1439n;
import p077Cn.InterfaceC1758z;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: c3.q */
/* JADX INFO: loaded from: classes.dex */
public final class C11625q extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f35226Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f35227Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC11579L f35228o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Context f35229p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C11597c f35230q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11625q(AbstractC11579L abstractC11579L, Context context, C11597c c11597c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35228o0 = abstractC11579L;
        this.f35229p0 = context;
        this.f35230q0 = c11597c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11625q c11625q = new C11625q(this.f35228o0, this.f35229p0, this.f35230q0, interfaceC18770c);
        c11625q.f35227Z = obj;
        return c11625q;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11625q) create((InterfaceC1758z) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f35226Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C11623p c11623p = new C11623p(new AtomicReference(null), (InterfaceC1758z) this.f35227Z);
            C11619n c11619n = new C11619n(this.f35228o0, this.f35229p0, this.f35230q0, null);
            this.f35226Y = 1;
            if (AbstractC0575H.m1168P(c11623p, c11619n, this) == enumC19250a) {
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
