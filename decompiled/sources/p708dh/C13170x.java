package p708dh;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: dh.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C13170x extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f41806Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13132J f41807Z;

    /* JADX INFO: renamed from: o0 */
    public int f41808o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13170x(C13132J c13132j, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f41807Z = c13132j;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f41806Y = obj;
        this.f41808o0 |= Integer.MIN_VALUE;
        return this.f41807Z.m14806c(null, this);
    }
}
