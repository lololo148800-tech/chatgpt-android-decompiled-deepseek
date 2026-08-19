package androidx.compose.p650ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p737f1.C13516h;
import p737f1.C13519k;
import p737f1.C13521m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/ui/focus/FocusPropertiesElement;", "Lz1/S;", "Lf1/m;", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class FocusPropertiesElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final C13519k f32690Y;

    public FocusPropertiesElement(C13519k c13519k) {
        this.f32690Y = c13519k;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C13521m c13521m = new C13521m();
        c13521m.f42802z0 = this.f32690Y;
        return c13521m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && AbstractC16544l.m18089b(this.f32690Y, ((FocusPropertiesElement) obj).f32690Y);
    }

    public final int hashCode() {
        return C13516h.f42785Z.hashCode();
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        ((C13521m) abstractC10458p).f42802z0 = this.f32690Y;
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.f32690Y + ')';
    }
}
