package p708dh;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: dh.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C13162p extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f41785Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f41786Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13166t f41787o0;

    /* JADX INFO: renamed from: p0 */
    public int f41788p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13162p(C13166t c13166t, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f41787o0 = c13166t;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f41786Z = obj;
        this.f41788p0 |= Integer.MIN_VALUE;
        return this.f41787o0.m14826a(this);
    }
}
