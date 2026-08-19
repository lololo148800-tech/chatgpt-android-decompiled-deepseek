package bg;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: bg.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C11424x extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f34506Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11399A f34507Z;

    /* JADX INFO: renamed from: o0 */
    public int f34508o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11424x(C11399A c11399a, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f34507Z = c11399a;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f34506Y = obj;
        this.f34508o0 |= Integer.MIN_VALUE;
        return this.f34507Z.m12785a(this);
    }
}
