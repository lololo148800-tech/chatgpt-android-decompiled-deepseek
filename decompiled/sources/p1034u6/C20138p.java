package p1034u6;

import p066Cc.C1625b;
import p917o6.C17853f;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: u6.p */
/* JADX INFO: loaded from: classes.dex */
public final class C20138p extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C1625b f63787Y;

    /* JADX INFO: renamed from: Z */
    public C17853f f63788Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f63789o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C1625b f63790p0;

    /* JADX INFO: renamed from: q0 */
    public int f63791q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20138p(C1625b c1625b, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f63790p0 = c1625b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f63789o0 = obj;
        this.f63791q0 |= Integer.MIN_VALUE;
        return this.f63790p0.m2486b(null, this);
    }
}
