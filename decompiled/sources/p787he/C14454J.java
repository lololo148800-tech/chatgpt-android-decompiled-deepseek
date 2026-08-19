package p787he;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: he.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C14454J extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C14459O f45476Y;

    /* JADX INFO: renamed from: Z */
    public String f45477Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f45478o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f45479p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C14459O f45480q0;

    /* JADX INFO: renamed from: r0 */
    public int f45481r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14454J(C14459O c14459o, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f45480q0 = c14459o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f45479p0 = obj;
        this.f45481r0 |= Integer.MIN_VALUE;
        return this.f45480q0.m15990s(null, false, this);
    }
}
