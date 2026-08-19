package p787he;

import p067Cd.C1632f;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: he.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C14481j extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C14459O f45619Y;

    /* JADX INFO: renamed from: Z */
    public C1632f f45620Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f45621o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C14459O f45622p0;

    /* JADX INFO: renamed from: q0 */
    public int f45623q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14481j(C14459O c14459o, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f45622p0 = c14459o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f45621o0 = obj;
        this.f45623q0 |= Integer.MIN_VALUE;
        return this.f45622p0.m15978g(null, this);
    }
}
