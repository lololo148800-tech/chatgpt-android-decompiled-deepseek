package p823j3;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: j3.o */
/* JADX INFO: loaded from: classes.dex */
public final class C16093o extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C16095q f49848Y;

    /* JADX INFO: renamed from: Z */
    public String f49849Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f49850o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16095q f49851p0;

    /* JADX INFO: renamed from: q0 */
    public int f49852q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16093o(C16095q c16095q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f49851p0 = c16095q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f49850o0 = obj;
        this.f49852q0 |= Integer.MIN_VALUE;
        return this.f49851p0.m17650a(null, null, this);
    }
}
