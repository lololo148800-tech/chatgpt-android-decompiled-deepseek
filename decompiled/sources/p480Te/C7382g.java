package p480Te;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Te.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C7382g extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C7392q f23389Y;

    /* JADX INFO: renamed from: Z */
    public String f23390Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f23391o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C7392q f23392p0;

    /* JADX INFO: renamed from: q0 */
    public int f23393q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7382g(C7392q c7392q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f23392p0 = c7392q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f23391o0 = obj;
        this.f23393q0 |= Integer.MIN_VALUE;
        return this.f23392p0.m7792b(null, this);
    }
}
