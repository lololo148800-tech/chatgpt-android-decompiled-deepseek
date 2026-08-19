package p229J0;

import p894n0.InterfaceC17405k;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: J0.p1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4109p1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C4121r1 f13198Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC17405k f13199Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f13200o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C4121r1 f13201p0;

    /* JADX INFO: renamed from: q0 */
    public int f13202q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4109p1(C4121r1 c4121r1, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f13201p0 = c4121r1;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f13200o0 = obj;
        this.f13202q0 |= Integer.MIN_VALUE;
        return this.f13201p0.m4765a(null, this);
    }
}
