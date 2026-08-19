package p434Rk;

import p1111xl.C21296a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Rk.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C6910b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C6911c f22157Y;

    /* JADX INFO: renamed from: Z */
    public C21296a f22158Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f22159o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6911c f22160p0;

    /* JADX INFO: renamed from: q0 */
    public int f22161q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6910b(C6911c c6911c, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f22160p0 = c6911c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f22159o0 = obj;
        this.f22161q0 |= Integer.MIN_VALUE;
        return this.f22160p0.m7294a(null, this);
    }
}
