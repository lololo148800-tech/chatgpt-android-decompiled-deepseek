package p1099x6;

import p001A.C0017I0;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: x6.m */
/* JADX INFO: loaded from: classes.dex */
public final class C21145m extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f67196Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0017I0 f67197Z;

    /* JADX INFO: renamed from: o0 */
    public int f67198o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21145m(C0017I0 c0017i0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f67197Z = c0017i0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f67196Y = obj;
        this.f67198o0 |= Integer.MIN_VALUE;
        return this.f67197Z.m64B(null, this);
    }
}
