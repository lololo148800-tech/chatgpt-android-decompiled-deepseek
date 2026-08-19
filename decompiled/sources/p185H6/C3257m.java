package p185H6;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: H6.m */
/* JADX INFO: loaded from: classes.dex */
public final class C3257m extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C3248d f9915Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f9916Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3258n f9917o0;

    /* JADX INFO: renamed from: p0 */
    public int f9918p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3257m(C3258n c3258n, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f9917o0 = c3258n;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f9916Z = obj;
        this.f9918p0 |= Integer.MIN_VALUE;
        return this.f9917o0.mo4137w(null, this);
    }
}
