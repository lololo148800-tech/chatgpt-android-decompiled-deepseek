package androidx.compose.foundation;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1440o;
import p349O0.C6021p;
import p544W9.AbstractC8485H;
import p635a1.InterfaceC10459q;
import p773h0.C14322z0;
import p860l0.EnumC16673F0;
import p860l0.InterfaceC16661B0;

/* JADX INFO: renamed from: androidx.compose.foundation.h */
/* JADX INFO: loaded from: classes.dex */
public final class C10841h extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C14322z0 f32471Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f32472Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC16661B0 f32473o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f32474p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean f32475q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10841h(C14322z0 c14322z0, boolean z6, InterfaceC16661B0 interfaceC16661B0, boolean z10, boolean z11) {
        super(3);
        this.f32471Y = c14322z0;
        this.f32472Z = z6;
        this.f32473o0 = interfaceC16661B0;
        this.f32474p0 = z10;
        this.f32475q0 = z11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C6021p c6021p = (C6021p) obj2;
        ((Number) obj3).intValue();
        c6021p.m6524S(1478351300);
        C14322z0 c14322z0 = this.f32471Y;
        boolean z6 = this.f32472Z;
        InterfaceC16661B0 interfaceC16661B0 = this.f32473o0;
        boolean z10 = this.f32474p0;
        boolean z11 = this.f32475q0;
        InterfaceC10459q interfaceC10459qMo428M = AbstractC8485H.m9138a(new ScrollSemanticsElement(c14322z0, z6, interfaceC16661B0, z10, z11), c14322z0, z11 ? EnumC16673F0.f53401Y : EnumC16673F0.f53402Z, z10, z6, interfaceC16661B0, c14322z0.f44954c, null, c6021p, 64).mo428M(new ScrollingLayoutElement(this.f32471Y, this.f32472Z, this.f32475q0));
        c6021p.m6553p(false);
        return interfaceC10459qMo428M;
    }
}
