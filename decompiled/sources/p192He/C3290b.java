package p192He;

import p092Dc.C2001r;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: He.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3290b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C3294f f10030Y;

    /* JADX INFO: renamed from: Z */
    public C2001r f10031Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f10032o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C3294f f10033p0;

    /* JADX INFO: renamed from: q0 */
    public int f10034q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3290b(C3294f c3294f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f10033p0 = c3294f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f10032o0 = obj;
        this.f10034q0 |= Integer.MIN_VALUE;
        return C3294f.m4164b(this.f10033p0, null, this);
    }
}
