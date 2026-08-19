package p860l0;

import kotlin.jvm.internal.C16524A;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: l0.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16739f1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C16524A f53679Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f53680Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16757l1 f53681o0;

    /* JADX INFO: renamed from: p0 */
    public int f53682p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16739f1(C16757l1 c16757l1, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f53681o0 = c16757l1;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f53680Z = obj;
        this.f53682p0 |= Integer.MIN_VALUE;
        return this.f53681o0.m18532b(0L, this);
    }
}
