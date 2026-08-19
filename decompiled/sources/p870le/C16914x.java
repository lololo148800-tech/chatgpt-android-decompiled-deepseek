package p870le;

import p324Mn.C5551u;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: le.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C16914x extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C16916z f54334Y;

    /* JADX INFO: renamed from: Z */
    public C5551u f54335Z;

    /* JADX INFO: renamed from: o0 */
    public Boolean f54336o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f54337p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16916z f54338q0;

    /* JADX INFO: renamed from: r0 */
    public int f54339r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16914x(C16916z c16916z, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f54338q0 = c16916z;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f54337p0 = obj;
        this.f54339r0 |= Integer.MIN_VALUE;
        return this.f54338q0.m18587b(null, null, this);
    }
}
