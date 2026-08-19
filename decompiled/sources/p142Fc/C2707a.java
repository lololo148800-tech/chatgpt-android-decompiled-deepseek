package p142Fc;

import p1081wc.C20879Z;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Fc.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2707a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C20879Z f8334Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f8335Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2708b f8336o0;

    /* JADX INFO: renamed from: p0 */
    public int f8337p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2707a(C2708b c2708b, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f8336o0 = c2708b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f8335Z = obj;
        this.f8337p0 |= Integer.MIN_VALUE;
        return this.f8336o0.m3702a(this);
    }
}
