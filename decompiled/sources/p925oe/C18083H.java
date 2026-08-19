package p925oe;

import p275Kn.InterfaceC4814a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: oe.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C18083H extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C18086K f57682Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC4814a f57683Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f57684o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C18086K f57685p0;

    /* JADX INFO: renamed from: q0 */
    public int f57686q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18083H(C18086K c18086k, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f57685p0 = c18086k;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f57684o0 = obj;
        this.f57686q0 |= Integer.MIN_VALUE;
        return this.f57685p0.m19708d(this);
    }
}
