package p1000s0;

import p049Bm.InterfaceC1439n;
import p773h0.EnumC14284g0;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: s0.C */
/* JADX INFO: loaded from: classes.dex */
public final class C19394C extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public AbstractC19397F f61420Y;

    /* JADX INFO: renamed from: Z */
    public EnumC14284g0 f61421Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC1439n f61422o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f61423p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC19397F f61424q0;

    /* JADX INFO: renamed from: r0 */
    public int f61425r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19394C(AbstractC19397F abstractC19397F, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f61424q0 = abstractC19397F;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f61423p0 = obj;
        this.f61425r0 |= Integer.MIN_VALUE;
        return AbstractC19397F.m20493r(this.f61424q0, null, null, this);
    }
}
