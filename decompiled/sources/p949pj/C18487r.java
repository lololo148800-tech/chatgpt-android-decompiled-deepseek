package p949pj;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: pj.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C18487r extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f58933Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18490u f58934Z;

    /* JADX INFO: renamed from: o0 */
    public int f58935o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18487r(C18490u c18490u, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f58934Z = c18490u;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f58933Y = obj;
        this.f58935o0 |= Integer.MIN_VALUE;
        return this.f58934Z.m19883d(null, this);
    }
}
