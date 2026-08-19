package bh;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: bh.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C11428b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C11431e f34519Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f34520Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11431e f34521o0;

    /* JADX INFO: renamed from: p0 */
    public int f34522p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11428b(C11431e c11431e, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f34521o0 = c11431e;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f34520Z = obj;
        this.f34522p0 |= Integer.MIN_VALUE;
        return this.f34521o0.m12794c(null, this);
    }
}
