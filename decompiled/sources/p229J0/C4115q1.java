package p229J0;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: J0.q1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4115q1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C4121r1 f13249Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f13250Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4121r1 f13251o0;

    /* JADX INFO: renamed from: p0 */
    public int f13252p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4115q1(C4121r1 c4121r1, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f13251o0 = c4121r1;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f13250Z = obj;
        this.f13252p0 |= Integer.MIN_VALUE;
        return this.f13251o0.m4766b(this);
    }
}
