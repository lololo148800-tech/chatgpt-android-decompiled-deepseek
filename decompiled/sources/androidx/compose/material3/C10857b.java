package androidx.compose.material3;

import androidx.compose.material.ripple.RippleNode;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1140z1.AbstractC21690f;
import p203I0.AbstractC3564u;
import p203I0.AbstractC3569z;
import p203I0.C3545b;
import p203I0.C3547d;
import p203I0.C3551h;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4005X2;
import p229J0.C4000W2;
import p758g0.C13781p0;
import p894n0.InterfaceC17406l;

/* JADX INFO: renamed from: androidx.compose.material3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10857b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f32655Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ DelegatingThemeAwareRippleNode f32656Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10857b(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode, int i10) {
        super(0);
        this.f32655Y = i10;
        this.f32656Z = delegatingThemeAwareRippleNode;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C3551h c3551h;
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.f32656Z;
        switch (this.f32655Y) {
            case 0:
                C4000W2 c4000w2 = (C4000W2) AbstractC21690f.m22204i(delegatingThemeAwareRippleNode, AbstractC4005X2.f12566b);
                return (c4000w2 == null || (c3551h = c4000w2.f12551b) == null) ? AbstractC3984T1.f12488b : c3551h;
            default:
                if (((C4000W2) AbstractC21690f.m22204i(delegatingThemeAwareRippleNode, AbstractC4005X2.f12566b)) == null) {
                    RippleNode rippleNode = delegatingThemeAwareRippleNode.f32650E0;
                    if (rippleNode != null) {
                        delegatingThemeAwareRippleNode.m22224L0(rippleNode);
                    }
                } else if (delegatingThemeAwareRippleNode.f32650E0 == null) {
                    C10856a c10856a = new C10856a(delegatingThemeAwareRippleNode);
                    C10857b c10857b = new C10857b(delegatingThemeAwareRippleNode, 0);
                    C13781p0 c13781p0 = AbstractC3564u.f10803a;
                    boolean z6 = AbstractC3569z.f10811a;
                    InterfaceC17406l interfaceC17406l = delegatingThemeAwareRippleNode.f32647B0;
                    boolean z10 = delegatingThemeAwareRippleNode.f32648C0;
                    float f10 = delegatingThemeAwareRippleNode.f32649D0;
                    RippleNode c3547d = z6 ? new C3547d(interfaceC17406l, z10, f10, c10856a, c10857b) : new C3545b(interfaceC17406l, z10, f10, c10856a, c10857b);
                    delegatingThemeAwareRippleNode.m22223K0(c3547d);
                    delegatingThemeAwareRippleNode.f32650E0 = c3547d;
                }
                return C17296C.f55119a;
        }
    }
}
