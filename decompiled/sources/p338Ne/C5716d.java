package p338Ne;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ne.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C5716d extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f18515Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5718f f18516Z;

    /* JADX INFO: renamed from: o0 */
    public int f18517o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5716d(C5718f c5718f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f18516Z = c5718f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f18515Y = obj;
        this.f18517o0 |= Integer.MIN_VALUE;
        return this.f18516Z.m6155d(null, null, this, false);
    }
}
