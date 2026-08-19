package p925oe;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: oe.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C18137z extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f57872Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18077B f57873Z;

    /* JADX INFO: renamed from: o0 */
    public int f57874o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18137z(C18077B c18077b, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f57873Z = c18077b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f57872Y = obj;
        this.f57874o0 |= Integer.MIN_VALUE;
        return this.f57873Z.m19703h(null, null, this);
    }
}
