package p338Ne;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ne.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C5714b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f18508Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5718f f18509Z;

    /* JADX INFO: renamed from: o0 */
    public int f18510o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5714b(C5718f c5718f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f18509Z = c5718f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f18508Y = obj;
        this.f18510o0 |= Integer.MIN_VALUE;
        return this.f18509Z.m6153b(null, this);
    }
}
