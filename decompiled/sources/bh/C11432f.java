package bh;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: bh.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C11432f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C11434h f34538Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f34539Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11434h f34540o0;

    /* JADX INFO: renamed from: p0 */
    public int f34541p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11432f(C11434h c11434h, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f34540o0 = c11434h;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f34539Z = obj;
        this.f34541p0 |= Integer.MIN_VALUE;
        return this.f34540o0.m12797b(this);
    }
}
