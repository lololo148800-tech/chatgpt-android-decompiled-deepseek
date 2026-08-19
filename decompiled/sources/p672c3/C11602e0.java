package p672c3;

import android.content.Context;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: c3.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11602e0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Context f35095Y;

    /* JADX INFO: renamed from: Z */
    public int f35096Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f35097o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11641y f35098p0;

    /* JADX INFO: renamed from: q0 */
    public int f35099q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11602e0(C11641y c11641y, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f35098p0 = c11641y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f35097o0 = obj;
        this.f35099q0 |= Integer.MIN_VALUE;
        return this.f35098p0.m13004b(null, 0, this);
    }
}
