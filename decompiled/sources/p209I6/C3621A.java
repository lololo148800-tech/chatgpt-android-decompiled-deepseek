package p209I6;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: I6.A */
/* JADX INFO: loaded from: classes.dex */
public final class C3621A extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public AbstractC3622B f11038Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC3622B f11039Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f11040o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC3622B f11041p0;

    /* JADX INFO: renamed from: q0 */
    public int f11042q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3621A(AbstractC3622B abstractC3622B, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f11041p0 = abstractC3622B;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f11040o0 = obj;
        this.f11042q0 |= Integer.MIN_VALUE;
        return AbstractC3622B.m4329e(this.f11041p0, this);
    }
}
