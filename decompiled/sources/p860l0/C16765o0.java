package p860l0;

import p894n0.C17396b;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: l0.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16765o0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public AbstractC16777s0 f53793Y;

    /* JADX INFO: renamed from: Z */
    public C16703Q f53794Z;

    /* JADX INFO: renamed from: o0 */
    public C17396b f53795o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f53796p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC16777s0 f53797q0;

    /* JADX INFO: renamed from: r0 */
    public int f53798r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16765o0(AbstractC16777s0 abstractC16777s0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f53797q0 = abstractC16777s0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f53796p0 = obj;
        this.f53798r0 |= Integer.MIN_VALUE;
        return AbstractC16777s0.m18540O0(this.f53797q0, null, this);
    }
}
