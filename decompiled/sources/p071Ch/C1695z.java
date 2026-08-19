package p071Ch;

import java.util.Map;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ch.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C1695z extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C1663C f4814Y;

    /* JADX INFO: renamed from: Z */
    public Map f4815Z;

    /* JADX INFO: renamed from: o0 */
    public String f4816o0;

    /* JADX INFO: renamed from: p0 */
    public String f4817p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f4818q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C1663C f4819r0;

    /* JADX INFO: renamed from: s0 */
    public int f4820s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1695z(C1663C c1663c, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f4819r0 = c1663c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f4818q0 = obj;
        this.f4820s0 |= Integer.MIN_VALUE;
        return this.f4819r0.m2495b(null, null, this);
    }
}
