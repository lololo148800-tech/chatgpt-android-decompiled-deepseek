package p209I6;

import p077Cn.C1743k;
import p1159zo.C22221g;
import p477Tb.C7296c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: I6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3623a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C1743k f11045Y;

    /* JADX INFO: renamed from: Z */
    public C22221g f11046Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f11047o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C7296c f11048p0;

    /* JADX INFO: renamed from: q0 */
    public int f11049q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3623a(C7296c c7296c, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f11048p0 = c7296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f11047o0 = obj;
        this.f11049q0 |= Integer.MIN_VALUE;
        return this.f11048p0.m7753E(null, null, this);
    }
}
