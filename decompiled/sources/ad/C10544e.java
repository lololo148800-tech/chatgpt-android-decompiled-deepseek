package ad;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p204I1.C3582M;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8042a0;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: ad.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C10544e extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f31294Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10459q f31295Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f31296o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f31297p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C3582M f31298q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f31299r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ int f31300s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10544e(String str, InterfaceC10459q interfaceC10459q, long j10, long j11, C3582M c3582m, int i10, int i11) {
        super(2);
        this.f31294Y = str;
        this.f31295Z = interfaceC10459q;
        this.f31296o0 = j10;
        this.f31297p0 = j11;
        this.f31298q0 = c3582m;
        this.f31299r0 = i10;
        this.f31300s0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM6447d0 = C5997d.m6447d0(this.f31299r0 | 1);
        long j10 = this.f31296o0;
        AbstractC8042a0.m8413a(this.f31294Y, this.f31295Z, j10, this.f31297p0, this.f31298q0, (C6021p) obj, iM6447d0, this.f31300s0);
        return C17296C.f55119a;
    }
}
