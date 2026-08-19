package p481Tf;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Tf.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C7406k extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C7409n f23459Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f23460Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C7409n f23461o0;

    /* JADX INFO: renamed from: p0 */
    public int f23462p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7406k(C7409n c7409n, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f23461o0 = c7409n;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f23460Z = obj;
        this.f23462p0 |= Integer.MIN_VALUE;
        return this.f23461o0.m7796b(this);
    }
}
