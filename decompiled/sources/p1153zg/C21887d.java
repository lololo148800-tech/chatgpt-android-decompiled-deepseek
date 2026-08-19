package p1153zg;

import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: zg.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C21887d extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C21889f f69395Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f69396Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21889f f69397o0;

    /* JADX INFO: renamed from: p0 */
    public int f69398p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21887d(C21889f c21889f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f69397o0 = c21889f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f69396Z = obj;
        this.f69398p0 |= Integer.MIN_VALUE;
        this.f69397o0.mo4160c(this);
        return EnumC19250a.f61036Y;
    }
}
