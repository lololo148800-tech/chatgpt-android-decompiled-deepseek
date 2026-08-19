package p221Ii;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ii.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C3733l extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C3734m f11334Y;

    /* JADX INFO: renamed from: Z */
    public int f11335Z;

    /* JADX INFO: renamed from: o0 */
    public int f11336o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f11337p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C3734m f11338q0;

    /* JADX INFO: renamed from: r0 */
    public int f11339r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3733l(C3734m c3734m, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f11338q0 = c3734m;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f11337p0 = obj;
        this.f11339r0 |= Integer.MIN_VALUE;
        return C3734m.m4431a(this.f11338q0, this);
    }
}
