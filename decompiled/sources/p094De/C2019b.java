package p094De;

import p403Qd.C6636i;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: De.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2019b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C2029l f6189Y;

    /* JADX INFO: renamed from: Z */
    public C6636i f6190Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f6191o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2029l f6192p0;

    /* JADX INFO: renamed from: q0 */
    public int f6193q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2019b(C2029l c2029l, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f6192p0 = c2029l;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6191o0 = obj;
        this.f6193q0 |= Integer.MIN_VALUE;
        return this.f6192p0.m3173b(null, this);
    }
}
