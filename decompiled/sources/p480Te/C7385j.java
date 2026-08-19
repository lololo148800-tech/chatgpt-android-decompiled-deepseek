package p480Te;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Te.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C7385j extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f23400Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C7392q f23401Z;

    /* JADX INFO: renamed from: o0 */
    public int f23402o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7385j(C7392q c7392q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f23401Z = c7392q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f23400Y = obj;
        this.f23402o0 |= Integer.MIN_VALUE;
        return this.f23401Z.m7793c(null, 0, null, this);
    }
}
