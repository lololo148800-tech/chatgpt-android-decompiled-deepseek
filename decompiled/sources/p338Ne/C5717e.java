package p338Ne;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ne.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C5717e extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f18518Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5718f f18519Z;

    /* JADX INFO: renamed from: o0 */
    public int f18520o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5717e(C5718f c5718f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f18519Z = c5718f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f18518Y = obj;
        this.f18520o0 |= Integer.MIN_VALUE;
        return this.f18519Z.m6156e(null, null, this);
    }
}
