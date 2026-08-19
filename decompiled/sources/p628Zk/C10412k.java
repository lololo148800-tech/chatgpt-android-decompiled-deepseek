package p628Zk;

import p857kl.C16452T;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Zk.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C10412k extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C10416o f30857Y;

    /* JADX INFO: renamed from: Z */
    public C16452T f30858Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f30859o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C10416o f30860p0;

    /* JADX INFO: renamed from: q0 */
    public int f30861q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10412k(C10416o c10416o, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f30860p0 = c10416o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f30859o0 = obj;
        this.f30861q0 |= Integer.MIN_VALUE;
        return this.f30860p0.m10903e(null, this);
    }
}
