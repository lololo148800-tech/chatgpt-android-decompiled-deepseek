package ni;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0566C0;
import p025An.C0625m0;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p153Fn.C2925c;
import p334Na.AbstractC5695b;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ni.e */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17631e implements InterfaceC0571F {

    /* JADX INFO: renamed from: Y */
    public final C0566C0 f56416Y;

    /* JADX INFO: renamed from: Z */
    public final C2925c f56417Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC18776i f56418o0;

    public AbstractC17631e(InterfaceC0571F parentScope) {
        AbstractC16544l.m18094g(parentScope, "parentScope");
        InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) parentScope.getCoroutineContext().get(C0625m0.f1875Y);
        if (interfaceC0627n0 == null) {
            throw new IllegalStateException("Parent scope has no job!");
        }
        C0566C0 c0566c0 = new C0566C0(interfaceC0627n0);
        this.f56416Y = c0566c0;
        C2925c c2925cM1174c = AbstractC0575H.m1174c(AbstractC5695b.m6138e(c0566c0, AbstractC0593T.f1824a));
        this.f56417Z = c2925cM1174c;
        this.f56418o0 = c2925cM1174c.f8769Y;
    }

    /* JADX INFO: renamed from: a */
    public final Object m19232a(AbstractC19687c abstractC19687c) {
        AbstractC0575H.m1180i(this.f56417Z, null);
        Object objMo1272P = this.f56416Y.mo1272P(abstractC19687c);
        return objMo1272P == EnumC19250a.f61036Y ? objMo1272P : C17296C.f55119a;
    }

    @Override // p025An.InterfaceC0571F
    public final InterfaceC18776i getCoroutineContext() {
        return this.f56418o0;
    }
}
