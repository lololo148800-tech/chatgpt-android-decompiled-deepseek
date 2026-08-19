package p600Yg;

import android.app.Application;
import p1042uh.C20263a0;
import p215Ic.C3688e;
import p578Xg.C9513a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Yg.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C10059a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C3688e f29783Y;

    /* JADX INFO: renamed from: Z */
    public Application f29784Z;

    /* JADX INFO: renamed from: o0 */
    public C20263a0 f29785o0;

    /* JADX INFO: renamed from: p0 */
    public C9513a f29786p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f29787q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C3688e f29788r0;

    /* JADX INFO: renamed from: s0 */
    public int f29789s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10059a(C3688e c3688e, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f29788r0 = c3688e;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f29787q0 = obj;
        this.f29789s0 |= Integer.MIN_VALUE;
        return this.f29788r0.m4398c(null, null, null, this);
    }
}
