package p328N1;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: N1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5585a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C5586b f18092Y;

    /* JADX INFO: renamed from: Z */
    public C5576C f18093Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f18094o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C5586b f18095p0;

    /* JADX INFO: renamed from: q0 */
    public int f18096q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5585a(C5586b c5586b, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f18095p0 = c5586b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f18094o0 = obj;
        this.f18096q0 |= Integer.MIN_VALUE;
        return this.f18095p0.m5986a(null, this);
    }
}
