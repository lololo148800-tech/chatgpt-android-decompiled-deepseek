package p858ko;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: ko.B */
/* JADX INFO: loaded from: classes2.dex */
public final class C16483B extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C16484C f51129Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f51130Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16484C f51131o0;

    /* JADX INFO: renamed from: p0 */
    public int f51132p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16483B(C16484C c16484c, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f51131o0 = c16484c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f51130Z = obj;
        this.f51132p0 |= Integer.MIN_VALUE;
        return this.f51131o0.m18059l(0.0f, 0L, null, this);
    }
}
