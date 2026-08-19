package gd;

import p038Ba.AbstractC0865o;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: gd.m2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13965m2 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C13969n2 f44017Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC0865o f44018Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f44019o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13969n2 f44020p0;

    /* JADX INFO: renamed from: q0 */
    public int f44021q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13965m2(C13969n2 c13969n2, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f44020p0 = c13969n2;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f44019o0 = obj;
        this.f44021q0 |= Integer.MIN_VALUE;
        return this.f44020p0.m15478b(null, this);
    }
}
