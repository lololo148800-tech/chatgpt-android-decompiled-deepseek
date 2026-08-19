package bg;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: bg.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C11420t extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f34481Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11422v f34482Z;

    /* JADX INFO: renamed from: o0 */
    public int f34483o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11420t(C11422v c11422v, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f34482Z = c11422v;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f34481Y = obj;
        this.f34483o0 |= Integer.MIN_VALUE;
        return this.f34482Z.m12792g(null, null, this);
    }
}
