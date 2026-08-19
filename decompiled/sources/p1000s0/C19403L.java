package p1000s0;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: s0.L */
/* JADX INFO: loaded from: classes.dex */
public final class C19403L extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f61477Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19404M f61478Z;

    /* JADX INFO: renamed from: o0 */
    public int f61479o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19403L(C19404M c19404m, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f61478Z = c19404m;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f61477Y = obj;
        this.f61479o0 |= Integer.MIN_VALUE;
        return this.f61478Z.mo18490a(null, 0.0f, this);
    }
}
