package p341Ni;

import p172Gi.EnumC3068a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ni.O */
/* JADX INFO: loaded from: classes3.dex */
public final class C5758O extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C5784h0 f18742Y;

    /* JADX INFO: renamed from: Z */
    public EnumC3068a f18743Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f18744o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C5784h0 f18745p0;

    /* JADX INFO: renamed from: q0 */
    public int f18746q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5758O(C5784h0 c5784h0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f18745p0 = c5784h0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f18744o0 = obj;
        this.f18746q0 |= Integer.MIN_VALUE;
        return this.f18745p0.m6176i(null, this);
    }
}
