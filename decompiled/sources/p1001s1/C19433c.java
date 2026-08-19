package p1001s1;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: s1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C19433c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f61620Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19434d f61621Z;

    /* JADX INFO: renamed from: o0 */
    public int f61622o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19433c(C19434d c19434d, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f61621Z = c19434d;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f61620Y = obj;
        this.f61622o0 |= Integer.MIN_VALUE;
        return this.f61621Z.m20513b(0L, this);
    }
}
