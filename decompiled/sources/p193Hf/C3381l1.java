package p193Hf;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Hf.l1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3381l1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C3414w1 f10313Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f10314Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3414w1 f10315o0;

    /* JADX INFO: renamed from: p0 */
    public int f10316p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3381l1(C3414w1 c3414w1, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f10315o0 = c3414w1;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f10314Z = obj;
        this.f10316p0 |= Integer.MIN_VALUE;
        return C3414w1.m4183a(this.f10315o0, null, this);
    }
}
