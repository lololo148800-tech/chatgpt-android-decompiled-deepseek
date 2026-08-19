package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1095x1.C21094o;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p911o0.C17787u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/layout/WithAlignmentLineElement;", "Lz1/S;", "Lo0/u0;", "foundation-layout_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class WithAlignmentLineElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final C21094o f32504Y;

    public WithAlignmentLineElement(C21094o c21094o) {
        this.f32504Y = c21094o;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C17787u0 c17787u0 = new C17787u0();
        c17787u0.f56764z0 = this.f32504Y;
        return c17787u0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        WithAlignmentLineElement withAlignmentLineElement = obj instanceof WithAlignmentLineElement ? (WithAlignmentLineElement) obj : null;
        if (withAlignmentLineElement == null) {
            return false;
        }
        return AbstractC16544l.m18089b(this.f32504Y, withAlignmentLineElement.f32504Y);
    }

    public final int hashCode() {
        return this.f32504Y.hashCode();
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        ((C17787u0) abstractC10458p).f56764z0 = this.f32504Y;
    }
}
