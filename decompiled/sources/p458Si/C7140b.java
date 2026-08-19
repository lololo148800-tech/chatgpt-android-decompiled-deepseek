package p458Si;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Si.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C7140b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C7141c f22709Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f22710Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C7141c f22711o0;

    /* JADX INFO: renamed from: p0 */
    public int f22712p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7140b(C7141c c7141c, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f22711o0 = c7141c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f22710Z = obj;
        this.f22712p0 |= Integer.MIN_VALUE;
        return this.f22711o0.mo7528e(this);
    }
}
