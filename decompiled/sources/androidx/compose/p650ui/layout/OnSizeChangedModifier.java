package androidx.compose.p650ui.layout;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;
import p1095x1.C21065T;
import p1140z1.AbstractC21672S;
import p571X9.AbstractC9113C4;
import p635a1.AbstractC10458p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/ui/layout/OnSizeChangedModifier;", "Lz1/S;", "Lx1/T;", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class OnSizeChangedModifier extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC1436k f32747Y;

    public OnSizeChangedModifier(InterfaceC1436k interfaceC1436k) {
        this.f32747Y = interfaceC1436k;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C21065T c21065t = new C21065T();
        c21065t.f66978z0 = this.f32747Y;
        c21065t.f66977A0 = AbstractC9113C4.m9643a(Integer.MIN_VALUE, Integer.MIN_VALUE);
        return c21065t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.f32747Y == ((OnSizeChangedModifier) obj).f32747Y;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32747Y.hashCode();
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C21065T c21065t = (C21065T) abstractC10458p;
        c21065t.f66978z0 = this.f32747Y;
        c21065t.f66977A0 = AbstractC9113C4.m9643a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
