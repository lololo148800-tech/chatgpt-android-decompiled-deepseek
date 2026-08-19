package p351O2;

import java.io.Serializable;
import java.util.Iterator;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: O2.w */
/* JADX INFO: loaded from: classes.dex */
public final class C6109w extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C6084G f19866Y;

    /* JADX INFO: renamed from: Z */
    public Object f19867Z;

    /* JADX INFO: renamed from: o0 */
    public Serializable f19868o0;

    /* JADX INFO: renamed from: p0 */
    public Object f19869p0;

    /* JADX INFO: renamed from: q0 */
    public C6111y f19870q0;

    /* JADX INFO: renamed from: r0 */
    public Iterator f19871r0;

    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ Object f19872s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C6084G f19873t0;

    /* JADX INFO: renamed from: u0 */
    public int f19874u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6109w(C6084G c6084g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f19873t0 = c6084g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f19872s0 = obj;
        this.f19874u0 |= Integer.MIN_VALUE;
        return this.f19873t0.m6653e(this);
    }
}
