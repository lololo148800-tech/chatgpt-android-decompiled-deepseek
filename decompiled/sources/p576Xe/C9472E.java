package p576Xe;

import bf.C11349D;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Xe.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C9472E extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C9473F f28506Y;

    /* JADX INFO: renamed from: Z */
    public C11349D f28507Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f28508o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C9473F f28509p0;

    /* JADX INFO: renamed from: q0 */
    public int f28510q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9472E(C9473F c9473f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f28509p0 = c9473f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f28508o0 = obj;
        this.f28510q0 |= Integer.MIN_VALUE;
        return this.f28509p0.m10023v(null, this);
    }
}
