package p351O2;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: O2.A */
/* JADX INFO: loaded from: classes.dex */
public final class C6078A extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C6084G f19779Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f19780Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6084G f19781o0;

    /* JADX INFO: renamed from: p0 */
    public int f19782p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6078A(C6084G c6084g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f19781o0 = c6084g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f19780Z = obj;
        this.f19782p0 |= Integer.MIN_VALUE;
        return this.f19781o0.m6655g(this);
    }
}
