package p600Yg;

import android.app.Application;
import p215Ic.C3688e;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Yg.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C10060b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Application f29790Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f29791Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3688e f29792o0;

    /* JADX INFO: renamed from: p0 */
    public int f29793p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10060b(C3688e c3688e, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f29792o0 = c3688e;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f29791Z = obj;
        this.f29793p0 |= Integer.MIN_VALUE;
        return this.f29792o0.m4400e(null, null, this);
    }
}
