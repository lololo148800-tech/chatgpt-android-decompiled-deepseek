package p763g5;

import p825j5.C16127d;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: g5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C13818c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public AbstractC13819d f43816Y;

    /* JADX INFO: renamed from: Z */
    public Object f43817Z;

    /* JADX INFO: renamed from: o0 */
    public C16127d f43818o0;

    /* JADX INFO: renamed from: p0 */
    public Object f43819p0;

    /* JADX INFO: renamed from: q0 */
    public Object f43820q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f43821r0;

    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ Object f43822s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ AbstractC13819d f43823t0;

    /* JADX INFO: renamed from: u0 */
    public int f43824u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13818c(AbstractC13819d abstractC13819d, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f43823t0 = abstractC13819d;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f43822s0 = obj;
        this.f43824u0 |= Integer.MIN_VALUE;
        return this.f43823t0.m15420Q(false, null, this);
    }
}
