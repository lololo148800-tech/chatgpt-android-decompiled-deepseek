package p341Ni;

import p172Gi.C3071d;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ni.Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C5760Q extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C5784h0 f18751Y;

    /* JADX INFO: renamed from: Z */
    public C3071d f18752Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f18753o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C5784h0 f18754p0;

    /* JADX INFO: renamed from: q0 */
    public int f18755q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5760Q(C5784h0 c5784h0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f18754p0 = c5784h0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f18753o0 = obj;
        this.f18755q0 |= Integer.MIN_VALUE;
        return C5784h0.m6168b(this.f18754p0, null, this);
    }
}
