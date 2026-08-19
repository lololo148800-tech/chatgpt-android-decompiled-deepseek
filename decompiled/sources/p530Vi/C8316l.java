package p530Vi;

import com.segment.analytics.kotlin.core.AbstractC12774a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Vi.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C8316l extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public AbstractC12774a f25911Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f25912Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC12774a f25913o0;

    /* JADX INFO: renamed from: p0 */
    public int f25914p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8316l(AbstractC12774a abstractC12774a, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f25913o0 = abstractC12774a;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f25912Z = obj;
        this.f25914p0 |= Integer.MIN_VALUE;
        return this.f25913o0.m14521a(null, this);
    }
}
