package p111E5;

import p275Kn.C4822i;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: E5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2320d extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f7213Y;

    /* JADX INFO: renamed from: Z */
    public C4822i f7214Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f7215o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2321e f7216p0;

    /* JADX INFO: renamed from: q0 */
    public int f7217q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2320d(C2321e c2321e, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f7216p0 = c2321e;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f7215o0 = obj;
        this.f7217q0 |= Integer.MIN_VALUE;
        return this.f7216p0.mo3428a(this);
    }
}
