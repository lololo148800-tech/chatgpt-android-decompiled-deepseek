package p881m0;

import p049Bm.InterfaceC1436k;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: m0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C17128e extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public InterfaceC1436k f54765Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f54766Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C17133j f54767o0;

    /* JADX INFO: renamed from: p0 */
    public int f54768p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17128e(C17133j c17133j, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f54767o0 = c17133j;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f54766Z = obj;
        this.f54768p0 |= Integer.MIN_VALUE;
        return this.f54767o0.m18898c(null, 0.0f, null, this);
    }
}
