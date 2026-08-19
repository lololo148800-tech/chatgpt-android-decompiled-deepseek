package p504Ue;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ue.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C7631a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f24128Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C7634d f24129Z;

    /* JADX INFO: renamed from: o0 */
    public int f24130o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7631a(C7634d c7634d, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f24129Z = c7634d;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f24128Y = obj;
        this.f24130o0 |= Integer.MIN_VALUE;
        return this.f24129Z.m7968a(null, this);
    }
}
