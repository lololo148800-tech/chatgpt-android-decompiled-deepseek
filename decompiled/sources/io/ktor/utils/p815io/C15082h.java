package io.ktor.utils.p815io;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: io.ktor.utils.io.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C15082h extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C15085k f46848Y;

    /* JADX INFO: renamed from: Z */
    public C15085k f46849Z;

    /* JADX INFO: renamed from: o0 */
    public int f46850o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f46851p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C15085k f46852q0;

    /* JADX INFO: renamed from: r0 */
    public int f46853r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15082h(C15085k c15085k, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f46852q0 = c15085k;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f46851p0 = obj;
        this.f46853r0 |= Integer.MIN_VALUE;
        return this.f46852q0.mo1140d(0, this);
    }
}
