package p041Be;

import java.util.Map;
import p117Eb.C2391u;
import p812ii.C15006f;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Be.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C1246r extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C2391u f3281Y;

    /* JADX INFO: renamed from: Z */
    public C15006f f3282Z;

    /* JADX INFO: renamed from: o0 */
    public Map f3283o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f3284p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C2391u f3285q0;

    /* JADX INFO: renamed from: r0 */
    public int f3286r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1246r(C2391u c2391u, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f3285q0 = c2391u;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f3284p0 = obj;
        this.f3286r0 |= Integer.MIN_VALUE;
        return this.f3285q0.m3506C(null, null, null, this);
    }
}
