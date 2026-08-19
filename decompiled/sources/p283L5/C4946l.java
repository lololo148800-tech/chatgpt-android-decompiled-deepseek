package p283L5;

import kotlin.jvm.internal.C16525B;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: L5.l */
/* JADX INFO: loaded from: classes.dex */
public final class C4946l extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f16122Y;

    /* JADX INFO: renamed from: Z */
    public C16525B f16123Z;

    /* JADX INFO: renamed from: o0 */
    public C16525B f16124o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f16125p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C4951q f16126q0;

    /* JADX INFO: renamed from: r0 */
    public int f16127r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4946l(C4951q c4951q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f16126q0 = c4951q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f16125p0 = obj;
        this.f16127r0 |= Integer.MIN_VALUE;
        return this.f16126q0.mo3829a(this);
    }
}
