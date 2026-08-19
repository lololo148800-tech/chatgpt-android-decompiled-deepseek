package io.ktor.utils.p815io;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: io.ktor.utils.io.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C15083i extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C15085k f46854Y;

    /* JADX INFO: renamed from: Z */
    public C15085k f46855Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f46856o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C15085k f46857p0;

    /* JADX INFO: renamed from: q0 */
    public int f46858q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15083i(C15085k c15085k, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f46857p0 = c15085k;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f46856o0 = obj;
        this.f46858q0 |= Integer.MIN_VALUE;
        return this.f46857p0.m16203h(this);
    }
}
