package p708dh;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: dh.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C13126D extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f41660Y;

    /* JADX INFO: renamed from: Z */
    public boolean f41661Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f41662o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13132J f41663p0;

    /* JADX INFO: renamed from: q0 */
    public int f41664q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13126D(C13132J c13132j, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f41663p0 = c13132j;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f41662o0 = obj;
        this.f41664q0 |= Integer.MIN_VALUE;
        return this.f41663p0.m14811h(false, this);
    }
}
