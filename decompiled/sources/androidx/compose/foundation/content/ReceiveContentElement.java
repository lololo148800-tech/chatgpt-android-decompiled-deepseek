package androidx.compose.foundation.content;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p796i0.C14897d;
import p796i0.InterfaceC14896c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/content/ReceiveContentElement;", "Lz1/S;", "Li0/d;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class ReceiveContentElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC14896c f32430Y;

    public ReceiveContentElement(InterfaceC14896c interfaceC14896c) {
        this.f32430Y = interfaceC14896c;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new C14897d(this.f32430Y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReceiveContentElement) && AbstractC16544l.m18089b(this.f32430Y, ((ReceiveContentElement) obj).f32430Y);
    }

    public final int hashCode() {
        return this.f32430Y.hashCode();
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        ((C14897d) abstractC10458p).f46389B0 = this.f32430Y;
    }

    public final String toString() {
        return "ReceiveContentElement(receiveContentListener=" + this.f32430Y + ')';
    }
}
