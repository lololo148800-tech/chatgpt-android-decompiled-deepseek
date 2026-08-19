package androidx.compose.material3;

import androidx.compose.material.ripple.RippleNode;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21690f;
import p1140z1.AbstractC21706n;
import p1140z1.InterfaceC21681a0;
import p1140z1.InterfaceC21702l;
import p229J0.C4010Y2;
import p774h1.InterfaceC14366v;
import p894n0.InterfaceC17406l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Landroidx/compose/material3/DelegatingThemeAwareRippleNode;", "Lz1/n;", "Lz1/l;", "Lz1/a0;", "Lh1/v;", "color", "Lh1/v;", "material3_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class DelegatingThemeAwareRippleNode extends AbstractC21706n implements InterfaceC21702l, InterfaceC21681a0 {

    /* JADX INFO: renamed from: B0 */
    public final InterfaceC17406l f32647B0;

    /* JADX INFO: renamed from: C0 */
    public final boolean f32648C0;

    /* JADX INFO: renamed from: D0 */
    public final float f32649D0;

    /* JADX INFO: renamed from: E0 */
    public RippleNode f32650E0;
    private final InterfaceC14366v color;

    public DelegatingThemeAwareRippleNode(InterfaceC17406l interfaceC17406l, boolean z6, float f10, C4010Y2 c4010y2) {
        this.f32647B0 = interfaceC17406l;
        this.f32648C0 = z6;
        this.f32649D0 = f10;
        this.color = c4010y2;
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: C0 */
    public final void mo438C0() {
        AbstractC21690f.m22214s(this, new C10857b(this, 1));
    }

    @Override // p1140z1.InterfaceC21681a0
    /* JADX INFO: renamed from: j0 */
    public final void mo2488j0() {
        AbstractC21690f.m22214s(this, new C10857b(this, 1));
    }
}
