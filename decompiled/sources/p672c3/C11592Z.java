package p672c3;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: c3.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C11592Z extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C11596b0 f35073Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f35074Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11596b0 f35075o0;

    /* JADX INFO: renamed from: p0 */
    public int f35076p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11592Z(C11596b0 c11596b0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f35075o0 = c11596b0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f35074Z = obj;
        this.f35076p0 |= Integer.MIN_VALUE;
        return C11596b0.m12978a(this.f35075o0, null, this);
    }
}
