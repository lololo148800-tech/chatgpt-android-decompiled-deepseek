package p787he;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: he.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C14449E extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C14459O f45436Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f45437Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14459O f45438o0;

    /* JADX INFO: renamed from: p0 */
    public int f45439p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14449E(C14459O c14459o, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f45438o0 = c14459o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f45437Z = obj;
        this.f45439p0 |= Integer.MIN_VALUE;
        return this.f45438o0.m15985n(null, this);
    }
}
