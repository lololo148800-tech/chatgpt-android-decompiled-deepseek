package p925oe;

import p1126yd.C21495r0;
import p1155zi.C21952P1;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: oe.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C18133v extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f57851Y;

    /* JADX INFO: renamed from: Z */
    public String f57852Z;

    /* JADX INFO: renamed from: o0 */
    public C21952P1 f57853o0;

    /* JADX INFO: renamed from: p0 */
    public C21495r0 f57854p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f57855q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C18077B f57856r0;

    /* JADX INFO: renamed from: s0 */
    public int f57857s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18133v(C18077B c18077b, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f57856r0 = c18077b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f57855q0 = obj;
        this.f57857s0 |= Integer.MIN_VALUE;
        return this.f57856r0.m19699d(null, null, this);
    }
}
