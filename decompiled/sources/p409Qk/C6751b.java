package p409Qk;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Qk.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C6751b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f21662Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6752c f21663Z;

    /* JADX INFO: renamed from: o0 */
    public int f21664o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6751b(C6752c c6752c, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f21663Z = c6752c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f21662Y = obj;
        this.f21664o0 |= Integer.MIN_VALUE;
        return this.f21663Z.m7189e(null, this);
    }
}
