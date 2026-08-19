package p131F1;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: F1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2632j extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C2633k f8145Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f8146Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2633k f8147o0;

    /* JADX INFO: renamed from: p0 */
    public int f8148p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2632j(C2633k c2633k, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f8147o0 = c2633k;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f8146Z = obj;
        this.f8148p0 |= Integer.MIN_VALUE;
        return this.f8147o0.m3622b(0.0f, this);
    }
}
