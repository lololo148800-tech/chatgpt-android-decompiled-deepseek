package p958q5;

import p112E6.C2350i;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: q5.k */
/* JADX INFO: loaded from: classes.dex */
public final class C18636k extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C18637l f59363Y;

    /* JADX INFO: renamed from: Z */
    public C2350i f59364Z;

    /* JADX INFO: renamed from: o0 */
    public Object f59365o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f59366p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C18637l f59367q0;

    /* JADX INFO: renamed from: r0 */
    public int f59368r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18636k(C18637l c18637l, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f59367q0 = c18637l;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f59366p0 = obj;
        this.f59368r0 |= Integer.MIN_VALUE;
        return this.f59367q0.mo19985a(this);
    }
}
