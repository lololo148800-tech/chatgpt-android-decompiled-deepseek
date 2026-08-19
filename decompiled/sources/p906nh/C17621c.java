package p906nh;

import p324Mn.C5551u;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: nh.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C17621c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C17625g f56383Y;

    /* JADX INFO: renamed from: Z */
    public C5551u f56384Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f56385o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C17625g f56386p0;

    /* JADX INFO: renamed from: q0 */
    public int f56387q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17621c(C17625g c17625g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f56386p0 = c17625g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f56385o0 = obj;
        this.f56387q0 |= Integer.MIN_VALUE;
        return this.f56386p0.m19229a(this);
    }
}
