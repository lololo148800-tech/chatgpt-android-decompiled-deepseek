package p328N1;

import java.util.List;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: N1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5588d extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C5592h f18099Y;

    /* JADX INFO: renamed from: Z */
    public List f18100Z;

    /* JADX INFO: renamed from: o0 */
    public C5576C f18101o0;

    /* JADX INFO: renamed from: p0 */
    public int f18102p0;

    /* JADX INFO: renamed from: q0 */
    public int f18103q0;

    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ Object f18104r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C5592h f18105s0;

    /* JADX INFO: renamed from: t0 */
    public int f18106t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5588d(C5592h c5592h, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f18105s0 = c5592h;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f18104r0 = obj;
        this.f18106t0 |= Integer.MIN_VALUE;
        return this.f18105s0.m5988c(this);
    }
}
