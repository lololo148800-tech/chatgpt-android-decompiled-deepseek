package p1063vf;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: vf.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C20604l extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public String f65378Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f65379Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20608p f65380o0;

    /* JADX INFO: renamed from: p0 */
    public int f65381p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20604l(C20608p c20608p, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f65380o0 = c20608p;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f65379Z = obj;
        this.f65381p0 |= Integer.MIN_VALUE;
        return this.f65380o0.m21195a(null, this);
    }
}
