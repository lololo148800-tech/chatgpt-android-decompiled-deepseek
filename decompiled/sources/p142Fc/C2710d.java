package p142Fc;

import p1081wc.C20881a0;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Fc.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C2710d extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C20881a0 f8344Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f8345Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2708b f8346o0;

    /* JADX INFO: renamed from: p0 */
    public int f8347p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2710d(C2708b c2708b, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f8346o0 = c2708b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f8345Z = obj;
        this.f8347p0 |= Integer.MIN_VALUE;
        return this.f8346o0.m3702a(this);
    }
}
