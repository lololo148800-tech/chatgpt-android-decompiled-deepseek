package bg;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: bg.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C11417q extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C11422v f34471Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f34472Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11422v f34473o0;

    /* JADX INFO: renamed from: p0 */
    public int f34474p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11417q(C11422v c11422v, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f34473o0 = c11422v;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f34472Z = obj;
        this.f34474p0 |= Integer.MIN_VALUE;
        return this.f34473o0.m12788c(this);
    }
}
