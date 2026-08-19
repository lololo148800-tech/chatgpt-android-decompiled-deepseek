package p797i1;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: i1.p */
/* JADX INFO: loaded from: classes.dex */
public final class C14914p extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f46450Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14915q f46451Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14914p(C14915q c14915q, int i10) {
        super(1);
        this.f46450Y = i10;
        this.f46451Z = c14915q;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f46450Y) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                C14915q c14915q = this.f46451Z;
                return Double.valueOf(c14915q.f46463n.mo9580b(AbstractC8301I.m8919j(dDoubleValue, c14915q.f46454e, c14915q.f46455f)));
            default:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                C14915q c14915q2 = this.f46451Z;
                return Double.valueOf(AbstractC8301I.m8919j(c14915q2.f46460k.mo9580b(dDoubleValue2), c14915q2.f46454e, c14915q2.f46455f));
        }
    }
}
