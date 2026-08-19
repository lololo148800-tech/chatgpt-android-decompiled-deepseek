package p273Kl;

import kotlin.jvm.internal.C16525B;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kl.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C4772g extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C4808y f15559Y;

    /* JADX INFO: renamed from: Z */
    public C16525B f15560Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f15561o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C4808y f15562p0;

    /* JADX INFO: renamed from: q0 */
    public int f15563q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4772g(C4808y c4808y, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f15562p0 = c4808y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f15561o0 = obj;
        this.f15563q0 |= Integer.MIN_VALUE;
        return this.f15562p0.m5438b(null, this);
    }
}
