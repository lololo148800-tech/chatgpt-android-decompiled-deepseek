package ch;

import p1155zi.EnumC22080y1;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ch.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C11755i extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C11757k f35639Y;

    /* JADX INFO: renamed from: Z */
    public EnumC22080y1 f35640Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f35641o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11757k f35642p0;

    /* JADX INFO: renamed from: q0 */
    public int f35643q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11755i(C11757k c11757k, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f35642p0 = c11757k;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f35641o0 = obj;
        this.f35643q0 |= Integer.MIN_VALUE;
        return this.f35642p0.m13051b(null, this);
    }
}
