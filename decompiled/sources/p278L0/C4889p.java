package p278L0;

import p658b5.C11246q;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: L0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C4889p extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C11246q f15935Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f15936Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11246q f15937o0;

    /* JADX INFO: renamed from: p0 */
    public int f15938p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4889p(C11246q c11246q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f15937o0 = c11246q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f15936Z = obj;
        this.f15938p0 |= Integer.MIN_VALUE;
        return this.f15937o0.m12634d(null, null, null, this);
    }
}
