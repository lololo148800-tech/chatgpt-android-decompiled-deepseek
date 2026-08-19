package androidx.compose.p650ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p737f1.C13522n;
import p737f1.C13524p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "Lz1/S;", "Lf1/p;", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class FocusRequesterElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final C13522n f32691Y;

    public FocusRequesterElement(C13522n c13522n) {
        this.f32691Y = c13522n;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C13524p c13524p = new C13524p();
        c13524p.f42806z0 = this.f32691Y;
        return c13524p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && AbstractC16544l.m18089b(this.f32691Y, ((FocusRequesterElement) obj).f32691Y);
    }

    public final int hashCode() {
        return this.f32691Y.hashCode();
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C13524p c13524p = (C13524p) abstractC10458p;
        c13524p.f42806z0.f42805a.m7110o(c13524p);
        C13522n c13522n = this.f32691Y;
        c13524p.f42806z0 = c13522n;
        c13522n.f42805a.m7099c(c13524p);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f32691Y + ')';
    }
}
