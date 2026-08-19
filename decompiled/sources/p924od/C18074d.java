package p924od;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: od.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C18074d extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C18075e f57640Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f57641Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18075e f57642o0;

    /* JADX INFO: renamed from: p0 */
    public int f57643p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18074d(C18075e c18075e, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f57642o0 = c18075e;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f57641Z = obj;
        this.f57643p0 |= Integer.MIN_VALUE;
        return this.f57642o0.m19695b(this);
    }
}
