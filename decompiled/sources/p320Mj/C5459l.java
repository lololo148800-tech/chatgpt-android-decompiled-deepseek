package p320Mj;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Mj.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C5459l extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C5461n f17823Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f17824Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C5461n f17825o0;

    /* JADX INFO: renamed from: p0 */
    public int f17826p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5459l(C5461n c5461n, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f17825o0 = c5461n;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f17824Z = obj;
        this.f17826p0 |= Integer.MIN_VALUE;
        return this.f17825o0.m5908a(null, this);
    }
}
