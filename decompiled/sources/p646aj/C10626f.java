package p646aj;

import p049Bm.InterfaceC1426a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: aj.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C10626f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C10627g f31527Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC1426a f31528Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f31529o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C10627g f31530p0;

    /* JADX INFO: renamed from: q0 */
    public int f31531q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10626f(C10627g c10627g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f31530p0 = c10627g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f31529o0 = obj;
        this.f31531q0 |= Integer.MIN_VALUE;
        return this.f31530p0.m10997c(null, this);
    }
}
