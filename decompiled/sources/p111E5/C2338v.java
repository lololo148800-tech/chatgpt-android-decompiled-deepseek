package p111E5;

import p275Kn.C4822i;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: E5.v */
/* JADX INFO: loaded from: classes.dex */
public final class C2338v extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C2340x f7257Y;

    /* JADX INFO: renamed from: Z */
    public C4822i f7258Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f7259o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2340x f7260p0;

    /* JADX INFO: renamed from: q0 */
    public int f7261q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2338v(C2340x c2340x, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f7260p0 = c2340x;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f7259o0 = obj;
        this.f7261q0 |= Integer.MIN_VALUE;
        return this.f7260p0.mo3428a(this);
    }
}
