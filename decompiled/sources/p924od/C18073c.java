package p924od;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: od.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C18073c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C18075e f57636Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f57637Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18075e f57638o0;

    /* JADX INFO: renamed from: p0 */
    public int f57639p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18073c(C18075e c18075e, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f57638o0 = c18075e;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f57637Z = obj;
        this.f57639p0 |= Integer.MIN_VALUE;
        return this.f57638o0.m19694a(null, this);
    }
}
