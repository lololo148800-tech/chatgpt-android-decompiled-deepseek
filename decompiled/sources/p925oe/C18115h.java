package p925oe;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: oe.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C18115h extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C18127p f57786Y;

    /* JADX INFO: renamed from: Z */
    public String f57787Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f57788o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C18127p f57789p0;

    /* JADX INFO: renamed from: q0 */
    public int f57790q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18115h(C18127p c18127p, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f57789p0 = c18127p;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f57788o0 = obj;
        this.f57790q0 |= Integer.MIN_VALUE;
        return C18127p.m19716a(this.f57789p0, null, this);
    }
}
