package androidx.compose.p650ui.layout;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;
import p1095x1.C21064S;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedElement;", "Lz1/S;", "Lx1/S;", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class OnGloballyPositionedElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC1436k f32746Y;

    public OnGloballyPositionedElement(InterfaceC1436k interfaceC1436k) {
        this.f32746Y = interfaceC1436k;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C21064S c21064s = new C21064S();
        c21064s.f66976z0 = this.f32746Y;
        return c21064s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.f32746Y == ((OnGloballyPositionedElement) obj).f32746Y;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32746Y.hashCode();
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        ((C21064S) abstractC10458p).f66976z0 = this.f32746Y;
    }
}
