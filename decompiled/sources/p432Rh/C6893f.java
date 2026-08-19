package p432Rh;

import p754fl.C13693c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Rh.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C6893f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C13693c f22096Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f22097Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6894g f22098o0;

    /* JADX INFO: renamed from: p0 */
    public int f22099p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6893f(C6894g c6894g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f22098o0 = c6894g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f22097Z = obj;
        this.f22099p0 |= Integer.MIN_VALUE;
        return this.f22098o0.m7288a(null, this);
    }
}
