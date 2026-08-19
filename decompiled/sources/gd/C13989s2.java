package gd;

import p038Ba.AbstractC0865o;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: gd.s2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13989s2 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C13993t2 f44053Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC0865o f44054Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f44055o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13993t2 f44056p0;

    /* JADX INFO: renamed from: q0 */
    public int f44057q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13989s2(C13993t2 c13993t2, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f44056p0 = c13993t2;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f44055o0 = obj;
        this.f44057q0 |= Integer.MIN_VALUE;
        return this.f44056p0.m15480b(null, this);
    }
}
