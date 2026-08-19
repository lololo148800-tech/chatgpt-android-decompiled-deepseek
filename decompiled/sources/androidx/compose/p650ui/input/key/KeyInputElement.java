package androidx.compose.p650ui.input.key;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p978r1.C18859e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "Lz1/S;", "Lr1/e;", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class KeyInputElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC1436k f32734Y;

    /* JADX INFO: renamed from: Z */
    public final AbstractC16546n f32735Z;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputElement(InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
        this.f32734Y = interfaceC1436k;
        this.f32735Z = (AbstractC16546n) interfaceC1436k2;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C18859e c18859e = new C18859e();
        c18859e.f60083z0 = this.f32734Y;
        c18859e.f60082A0 = this.f32735Z;
        return c18859e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return AbstractC16544l.m18089b(this.f32734Y, keyInputElement.f32734Y) && AbstractC16544l.m18089b(this.f32735Z, keyInputElement.f32735Z);
    }

    public final int hashCode() {
        InterfaceC1436k interfaceC1436k = this.f32734Y;
        int iHashCode = (interfaceC1436k == null ? 0 : interfaceC1436k.hashCode()) * 31;
        AbstractC16546n abstractC16546n = this.f32735Z;
        return iHashCode + (abstractC16546n != null ? abstractC16546n.hashCode() : 0);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C18859e c18859e = (C18859e) abstractC10458p;
        c18859e.f60083z0 = this.f32734Y;
        c18859e.f60082A0 = this.f32735Z;
    }

    public final String toString() {
        return "KeyInputElement(onKeyEvent=" + this.f32734Y + ", onPreKeyEvent=" + this.f32735Z + ')';
    }
}
