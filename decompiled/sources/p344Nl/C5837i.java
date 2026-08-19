package p344Nl;

import p387Pl.C6487g;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Nl.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C5837i extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C5842n f19075Y;

    /* JADX INFO: renamed from: Z */
    public C6487g f19076Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f19077o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C5842n f19078p0;

    /* JADX INFO: renamed from: q0 */
    public int f19079q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5837i(C5842n c5842n, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f19078p0 = c5842n;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f19077o0 = obj;
        this.f19079q0 |= Integer.MIN_VALUE;
        return this.f19078p0.m6250r(null, null, this);
    }
}
