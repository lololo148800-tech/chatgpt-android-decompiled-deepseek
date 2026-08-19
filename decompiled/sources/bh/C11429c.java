package bh;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: bh.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C11429c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C11431e f34523Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f34524Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11431e f34525o0;

    /* JADX INFO: renamed from: p0 */
    public int f34526p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11429c(C11431e c11431e, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f34525o0 = c11431e;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f34524Z = obj;
        this.f34526p0 |= Integer.MIN_VALUE;
        return this.f34525o0.m12795d(null, null, null, this);
    }
}
