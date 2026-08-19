package io.ktor.utils.p815io;

import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: io.ktor.utils.io.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C15084j extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C15085k f46859Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f46860Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C15085k f46861o0;

    /* JADX INFO: renamed from: p0 */
    public int f46862p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15084j(C15085k c15085k, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f46861o0 = c15085k;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f46860Z = obj;
        this.f46862p0 |= Integer.MIN_VALUE;
        return this.f46861o0.m16204i(this);
    }
}
