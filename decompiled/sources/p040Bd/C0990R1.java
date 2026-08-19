package p040Bd;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Bd.R1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0990R1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f2774Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0996S1 f2775Z;

    /* JADX INFO: renamed from: o0 */
    public int f2776o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0990R1(C0996S1 c0996s1, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f2775Z = c0996s1;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f2774Y = obj;
        this.f2776o0 |= Integer.MIN_VALUE;
        return this.f2775Z.mo1965a(this);
    }
}
