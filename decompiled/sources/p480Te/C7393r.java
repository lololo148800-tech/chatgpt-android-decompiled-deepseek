package p480Te;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Te.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C7393r extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f23424Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C7395t f23425Z;

    /* JADX INFO: renamed from: o0 */
    public int f23426o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7393r(C7395t c7395t, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f23425Z = c7395t;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f23424Y = obj;
        this.f23426o0 |= Integer.MIN_VALUE;
        return this.f23425Z.m7794a(null, null, null, this);
    }
}
