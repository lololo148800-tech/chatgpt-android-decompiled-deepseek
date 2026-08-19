package p361Oe;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Oe.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C6184k extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f20140Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6185l f20141Z;

    /* JADX INFO: renamed from: o0 */
    public int f20142o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6184k(C6185l c6185l, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f20141Z = c6185l;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f20140Y = obj;
        this.f20142o0 |= Integer.MIN_VALUE;
        return this.f20141Z.m6723a(null, null, null, 0, this);
    }
}
