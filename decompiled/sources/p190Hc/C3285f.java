package p190Hc;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Hc.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C3285f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C3287h f10012Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC3283d f10013Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f10014o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C3287h f10015p0;

    /* JADX INFO: renamed from: q0 */
    public int f10016q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3285f(C3287h c3287h, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f10015p0 = c3287h;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f10014o0 = obj;
        this.f10016q0 |= Integer.MIN_VALUE;
        return C3287h.m4157d(this.f10015p0, null, this);
    }
}
