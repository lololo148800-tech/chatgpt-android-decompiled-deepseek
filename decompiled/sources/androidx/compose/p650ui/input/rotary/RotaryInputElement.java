package androidx.compose.p650ui.input.rotary;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p003A1.C0280q;
import p1052v1.C20418a;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "Lz1/S;", "Lv1/a;", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class RotaryInputElement extends AbstractC21672S {
    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C20418a c20418a = new C20418a();
        c20418a.f64540z0 = C0280q.f1026p0;
        return c20418a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        ((RotaryInputElement) obj).getClass();
        Object obj2 = C0280q.f1026p0;
        return obj2.equals(obj2) && AbstractC16544l.m18089b(null, null);
    }

    public final int hashCode() {
        return C0280q.f1026p0.hashCode() * 31;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        ((C20418a) abstractC10458p).f64540z0 = C0280q.f1026p0;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + C0280q.f1026p0 + ", onPreRotaryScrollEvent=null)";
    }
}
