package p320Mj;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Mj.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C5460m extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f17827Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5461n f17828Z;

    /* JADX INFO: renamed from: o0 */
    public int f17829o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5460m(C5461n c5461n, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f17828Z = c5461n;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f17827Y = obj;
        this.f17829o0 |= Integer.MIN_VALUE;
        return this.f17828Z.m5909b(null, null, this);
    }
}
