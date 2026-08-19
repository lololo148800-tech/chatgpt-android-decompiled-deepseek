package p1063vf;

import kotlin.jvm.internal.C16524A;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: vf.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C20612t extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public String f65409Y;

    /* JADX INFO: renamed from: Z */
    public C16524A f65410Z;

    /* JADX INFO: renamed from: o0 */
    public long f65411o0;

    /* JADX INFO: renamed from: p0 */
    public int f65412p0;

    /* JADX INFO: renamed from: q0 */
    public int f65413q0;

    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ Object f65414r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C20613u f65415s0;

    /* JADX INFO: renamed from: t0 */
    public int f65416t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20612t(C20613u c20613u, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f65415s0 = c20613u;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f65414r0 = obj;
        this.f65416t0 |= Integer.MIN_VALUE;
        return C20613u.m21196j(this.f65415s0, null, 0L, this);
    }
}
