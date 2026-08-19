package p384Ph;

import io.sentry.hints.C15370i;
import p556Wk.C8915b0;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ph.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C6411a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C8915b0 f20851Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f20852Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C15370i f20853o0;

    /* JADX INFO: renamed from: p0 */
    public int f20854p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6411a(C15370i c15370i, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f20853o0 = c15370i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f20852Z = obj;
        this.f20854p0 |= Integer.MIN_VALUE;
        return this.f20853o0.m16628p(null, this);
    }
}
