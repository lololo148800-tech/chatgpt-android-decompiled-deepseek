package p1013t0;

import p759g1.C13801c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: t0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C19714b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C13801c f62408Y;

    /* JADX INFO: renamed from: Z */
    public Object[] f62409Z;

    /* JADX INFO: renamed from: o0 */
    public int f62410o0;

    /* JADX INFO: renamed from: p0 */
    public int f62411p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f62412q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C19715c f62413r0;

    /* JADX INFO: renamed from: s0 */
    public int f62414s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19714b(C19715c c19715c, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f62413r0 = c19715c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f62412q0 = obj;
        this.f62414s0 |= Integer.MIN_VALUE;
        return this.f62413r0.m20665a(null, this);
    }
}
