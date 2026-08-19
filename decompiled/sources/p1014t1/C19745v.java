package p1014t1;

import p025An.C0564B0;
import sm.AbstractC19685a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: t1.v */
/* JADX INFO: loaded from: classes.dex */
public final class C19745v extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C0564B0 f62513Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f62514Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19748y f62515o0;

    /* JADX INFO: renamed from: p0 */
    public int f62516p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19745v(C19748y c19748y, AbstractC19685a abstractC19685a) {
        super(abstractC19685a);
        this.f62515o0 = c19748y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f62514Z = obj;
        this.f62516p0 |= Integer.MIN_VALUE;
        return this.f62515o0.m20698e(0L, null, this);
    }
}
