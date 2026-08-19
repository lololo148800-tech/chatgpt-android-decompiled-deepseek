package p860l0;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: l0.H0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16679H0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C16685J0 f53422Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f53423Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16685J0 f53424o0;

    /* JADX INFO: renamed from: p0 */
    public int f53425p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16679H0(C16685J0 c16685j0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f53424o0 = c16685j0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f53423Z = obj;
        this.f53425p0 |= Integer.MIN_VALUE;
        return this.f53424o0.m18502b(this);
    }
}
