package p708dh;

import p1155zi.AbstractC21933K1;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: dh.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C13155i extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f41760Y;

    /* JADX INFO: renamed from: Z */
    public Object f41761Z;

    /* JADX INFO: renamed from: o0 */
    public AbstractC21933K1 f41762o0;

    /* JADX INFO: renamed from: p0 */
    public C13158l f41763p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f41764q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C13158l f41765r0;

    /* JADX INFO: renamed from: s0 */
    public int f41766s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13155i(C13158l c13158l, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f41765r0 = c13158l;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f41764q0 = obj;
        this.f41766s0 |= Integer.MIN_VALUE;
        return this.f41765r0.m14823d(this);
    }
}
