package p338Ne;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ne.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5715c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public String f18511Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f18512Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C5718f f18513o0;

    /* JADX INFO: renamed from: p0 */
    public int f18514p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5715c(C5718f c5718f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f18513o0 = c5718f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f18512Z = obj;
        this.f18514p0 |= Integer.MIN_VALUE;
        return this.f18513o0.m6154c(null, this);
    }
}
