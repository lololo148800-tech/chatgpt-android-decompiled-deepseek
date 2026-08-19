package p576Xe;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Xe.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C9494s extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C9473F f28584Y;

    /* JADX INFO: renamed from: Z */
    public String f28585Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f28586o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C9473F f28587p0;

    /* JADX INFO: renamed from: q0 */
    public int f28588q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9494s(C9473F c9473f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f28587p0 = c9473f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f28586o0 = obj;
        this.f28588q0 |= Integer.MIN_VALUE;
        return this.f28587p0.m10015n(null, this);
    }
}
