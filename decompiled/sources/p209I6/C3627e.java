package p209I6;

import java.util.LinkedHashMap;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: I6.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3627e extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C3630h f11054Y;

    /* JADX INFO: renamed from: Z */
    public LinkedHashMap f11055Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f11056o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C3630h f11057p0;

    /* JADX INFO: renamed from: q0 */
    public int f11058q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3627e(C3630h c3630h, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f11057p0 = c3630h;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f11056o0 = obj;
        this.f11058q0 |= Integer.MIN_VALUE;
        return this.f11057p0.mo4330a(this);
    }
}
