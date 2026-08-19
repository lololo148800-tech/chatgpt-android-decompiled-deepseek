package p351O2;

import kotlin.jvm.internal.C16525B;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: O2.x */
/* JADX INFO: loaded from: classes.dex */
public final class C6110x extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f19875Y;

    /* JADX INFO: renamed from: Z */
    public Object f19876Z;

    /* JADX INFO: renamed from: o0 */
    public Object f19877o0;

    /* JADX INFO: renamed from: p0 */
    public C16525B f19878p0;

    /* JADX INFO: renamed from: q0 */
    public C6084G f19879q0;

    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ Object f19880r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C6111y f19881s0;

    /* JADX INFO: renamed from: t0 */
    public int f19882t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6110x(C6111y c6111y, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f19881s0 = c6111y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f19880r0 = obj;
        this.f19882t0 |= Integer.MIN_VALUE;
        return this.f19881s0.m6664a(null, this);
    }
}
