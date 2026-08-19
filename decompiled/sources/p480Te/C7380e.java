package p480Te;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Te.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C7380e extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C7392q f23381Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f23382Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C7392q f23383o0;

    /* JADX INFO: renamed from: p0 */
    public int f23384p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7380e(C7392q c7392q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f23383o0 = c7392q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f23382Z = obj;
        this.f23384p0 |= Integer.MIN_VALUE;
        return this.f23383o0.m7791a(null, null, this);
    }
}
