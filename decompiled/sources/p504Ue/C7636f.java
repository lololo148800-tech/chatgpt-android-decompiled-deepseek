package p504Ue;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ue.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C7636f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C7637g f24140Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f24141Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C7637g f24142o0;

    /* JADX INFO: renamed from: p0 */
    public int f24143p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7636f(C7637g c7637g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f24142o0 = c7637g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f24141Z = obj;
        this.f24143p0 |= Integer.MIN_VALUE;
        return this.f24142o0.mo3829a(this);
    }
}
