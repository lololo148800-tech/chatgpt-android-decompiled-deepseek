package p071Ch;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ch.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C1690u extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C1692w f4785Y;

    /* JADX INFO: renamed from: Z */
    public boolean f4786Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f4787o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C1692w f4788p0;

    /* JADX INFO: renamed from: q0 */
    public int f4789q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1690u(C1692w c1692w, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f4788p0 = c1692w;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f4787o0 = obj;
        this.f4789q0 |= Integer.MIN_VALUE;
        return C1692w.m2507a(this.f4788p0, false, this);
    }
}
