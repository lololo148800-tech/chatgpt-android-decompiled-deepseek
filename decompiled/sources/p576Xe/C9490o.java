package p576Xe;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Xe.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C9490o extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f28572Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9473F f28573Z;

    /* JADX INFO: renamed from: o0 */
    public int f28574o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9490o(C9473F c9473f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f28573Z = c9473f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f28572Y = obj;
        this.f28574o0 |= Integer.MIN_VALUE;
        return this.f28573Z.m10011j(this);
    }
}
