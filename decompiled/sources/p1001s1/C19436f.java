package p1001s1;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: s1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C19436f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C19437g f61632Y;

    /* JADX INFO: renamed from: Z */
    public long f61633Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f61634o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C19437g f61635p0;

    /* JADX INFO: renamed from: q0 */
    public int f61636q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19436f(C19437g c19437g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f61635p0 = c19437g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f61634o0 = obj;
        this.f61636q0 |= Integer.MIN_VALUE;
        return this.f61635p0.mo4040p0(0L, this);
    }
}
