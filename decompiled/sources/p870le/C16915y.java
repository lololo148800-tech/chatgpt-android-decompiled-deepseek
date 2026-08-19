package p870le;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: le.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C16915y extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C16916z f54340Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f54341Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16916z f54342o0;

    /* JADX INFO: renamed from: p0 */
    public int f54343p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16915y(C16916z c16916z, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f54342o0 = c16916z;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f54341Z = obj;
        this.f54343p0 |= Integer.MIN_VALUE;
        return this.f54342o0.m18589d(null, null, this);
    }
}
