package p1001s1;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: s1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C19432b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f61617Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19434d f61618Z;

    /* JADX INFO: renamed from: o0 */
    public int f61619o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19432b(C19434d c19434d, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f61618Z = c19434d;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f61617Y = obj;
        this.f61619o0 |= Integer.MIN_VALUE;
        return this.f61618Z.m20512a(0L, 0L, this);
    }
}
