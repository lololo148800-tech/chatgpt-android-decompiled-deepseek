package ni;

import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0566C0;
import p025An.InterfaceC0571F;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p334Na.AbstractC5695b;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: ni.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C17629c implements InterfaceC0571F {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC18776i f56414Y;

    public C17629c() {
        C0566C0 c0566c0M1176e = AbstractC0575H.m1176e();
        C3516e c3516e = AbstractC0593T.f1824a;
        this.f56414Y = AbstractC0575H.m1174c(AbstractC5695b.m6138e(c0566c0M1176e, AbstractC2935m.f8797a)).f8769Y;
    }

    @Override // p025An.InterfaceC0571F
    public final InterfaceC18776i getCoroutineContext() {
        return this.f56414Y;
    }
}
