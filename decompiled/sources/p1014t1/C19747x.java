package p1014t1;

import sm.AbstractC19685a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: t1.x */
/* JADX INFO: loaded from: classes.dex */
public final class C19747x extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f62520Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19748y f62521Z;

    /* JADX INFO: renamed from: o0 */
    public int f62522o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19747x(C19748y c19748y, AbstractC19685a abstractC19685a) {
        super(abstractC19685a);
        this.f62521Z = c19748y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f62520Y = obj;
        this.f62522o0 |= Integer.MIN_VALUE;
        return this.f62521Z.m20699f(0L, null, this);
    }
}
