package pg;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: pg.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C18411a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f58743Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18412b f58744Z;

    /* JADX INFO: renamed from: o0 */
    public int f58745o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18411a(C18412b c18412b, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f58744Z = c18412b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f58743Y = obj;
        this.f58745o0 |= Integer.MIN_VALUE;
        return this.f58744Z.m19870a(null, false, this);
    }
}
