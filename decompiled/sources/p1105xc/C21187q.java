package p1105xc;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: xc.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C21187q extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C21189s f67336Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f67337Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21189s f67338o0;

    /* JADX INFO: renamed from: p0 */
    public int f67339p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21187q(C21189s c21189s, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f67338o0 = c21189s;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f67337Z = obj;
        this.f67339p0 |= Integer.MIN_VALUE;
        return C21189s.m21613a(this.f67338o0, this);
    }
}
