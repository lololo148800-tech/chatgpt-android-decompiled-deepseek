package p071Ch;

import p275Kn.C4816c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ch.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C1688s extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C1692w f4776Y;

    /* JADX INFO: renamed from: Z */
    public C4816c f4777Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f4778o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f4779p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C1692w f4780q0;

    /* JADX INFO: renamed from: r0 */
    public int f4781r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1688s(C1692w c1692w, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f4780q0 = c1692w;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f4779p0 = obj;
        this.f4781r0 |= Integer.MIN_VALUE;
        return this.f4780q0.m2509c(false, this);
    }
}
