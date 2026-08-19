package p628Zk;

import p754fl.C13693c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Zk.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C10415n extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C13693c f30872Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f30873Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C10416o f30874o0;

    /* JADX INFO: renamed from: p0 */
    public int f30875p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10415n(C10416o c10416o, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f30874o0 = c10416o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f30873Z = obj;
        this.f30875p0 |= Integer.MIN_VALUE;
        return this.f30874o0.m10905m(null, this);
    }
}
