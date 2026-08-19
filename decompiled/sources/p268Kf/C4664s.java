package p268Kf;

import p403Qd.C6617X;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kf.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C4664s extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C4666u f15185Y;

    /* JADX INFO: renamed from: Z */
    public C6617X f15186Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f15187o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C4666u f15188p0;

    /* JADX INFO: renamed from: q0 */
    public int f15189q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4664s(C4666u c4666u, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f15188p0 = c4666u;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f15187o0 = obj;
        this.f15189q0 |= Integer.MIN_VALUE;
        return this.f15188p0.m5388n(null, null, this);
    }
}
