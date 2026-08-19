package p925oe;

import p275Kn.InterfaceC4814a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: oe.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C18079D extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C18086K f57662Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC4814a f57663Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f57664o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C18086K f57665p0;

    /* JADX INFO: renamed from: q0 */
    public int f57666q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18079D(C18086K c18086k, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f57665p0 = c18086k;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f57664o0 = obj;
        this.f57666q0 |= Integer.MIN_VALUE;
        return this.f57665p0.m19705a(this);
    }
}
