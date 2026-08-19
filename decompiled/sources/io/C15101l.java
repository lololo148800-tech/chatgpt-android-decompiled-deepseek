package io;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: io.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C15101l extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C15105o f46926Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f46927Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C15105o f46928o0;

    /* JADX INFO: renamed from: p0 */
    public int f46929p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15101l(C15105o c15105o, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f46928o0 = c15105o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f46927Z = obj;
        this.f46929p0 |= Integer.MIN_VALUE;
        return this.f46928o0.m16228a(this);
    }
}
