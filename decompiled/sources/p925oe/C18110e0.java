package p925oe;

import p403Qd.C6636i;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: oe.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C18110e0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f57766Y;

    /* JADX INFO: renamed from: Z */
    public C6636i f57767Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f57768o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C18114g0 f57769p0;

    /* JADX INFO: renamed from: q0 */
    public int f57770q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18110e0(C18114g0 c18114g0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f57769p0 = c18114g0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f57768o0 = obj;
        this.f57770q0 |= Integer.MIN_VALUE;
        return this.f57769p0.m19714a(null, this);
    }
}
