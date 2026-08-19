package p1041uf;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: uf.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C20213b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f63991Y;

    /* JADX INFO: renamed from: Z */
    public Object f63992Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f63993o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C20217f f63994p0;

    /* JADX INFO: renamed from: q0 */
    public int f63995q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20213b(C20217f c20217f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f63994p0 = c20217f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f63993o0 = obj;
        this.f63995q0 |= Integer.MIN_VALUE;
        return this.f63994p0.m21015b(null, null, null, this);
    }
}
