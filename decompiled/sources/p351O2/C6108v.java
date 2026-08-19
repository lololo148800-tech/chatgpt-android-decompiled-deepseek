package p351O2;

import p025An.C0636s;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: O2.v */
/* JADX INFO: loaded from: classes.dex */
public final class C6108v extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f19860Y;

    /* JADX INFO: renamed from: Z */
    public C6084G f19861Z;

    /* JADX INFO: renamed from: o0 */
    public C0636s f19862o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f19863p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C6084G f19864q0;

    /* JADX INFO: renamed from: r0 */
    public int f19865r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6108v(C6084G c6084g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f19864q0 = c6084g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f19863p0 = obj;
        this.f19865r0 |= Integer.MIN_VALUE;
        return C6084G.m6649c(this.f19864q0, null, this);
    }
}
