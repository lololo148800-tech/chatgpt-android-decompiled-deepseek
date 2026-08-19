package p209I6;

import java.util.LinkedHashMap;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: I6.k */
/* JADX INFO: loaded from: classes.dex */
public final class C3633k extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C3635m f11073Y;

    /* JADX INFO: renamed from: Z */
    public LinkedHashMap f11074Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f11075o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C3635m f11076p0;

    /* JADX INFO: renamed from: q0 */
    public int f11077q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3633k(C3635m c3635m, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f11076p0 = c3635m;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f11075o0 = obj;
        this.f11077q0 |= Integer.MIN_VALUE;
        return this.f11076p0.mo4330a(this);
    }
}
