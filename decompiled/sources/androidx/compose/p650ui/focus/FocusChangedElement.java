package androidx.compose.p650ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;
import p1140z1.AbstractC21672S;
import p138F8.vJO.vRJidSveZHcTw;
import p635a1.AbstractC10458p;
import p737f1.C13509a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/ui/focus/FocusChangedElement;", "Lz1/S;", "Lf1/a;", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class FocusChangedElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC1436k f32688Y;

    public FocusChangedElement(InterfaceC1436k interfaceC1436k) {
        this.f32688Y = interfaceC1436k;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C13509a c13509a = new C13509a();
        c13509a.f42773z0 = this.f32688Y;
        return c13509a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && AbstractC16544l.m18089b(this.f32688Y, ((FocusChangedElement) obj).f32688Y);
    }

    public final int hashCode() {
        return this.f32688Y.hashCode();
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        ((C13509a) abstractC10458p).f42773z0 = this.f32688Y;
    }

    public final String toString() {
        return vRJidSveZHcTw.qdG + this.f32688Y + ')';
    }
}
