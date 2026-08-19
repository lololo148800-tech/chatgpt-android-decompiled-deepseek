package androidx.compose.material3.internal;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1439n;
import p1140z1.AbstractC21672S;
import p278L0.C4848L;
import p635a1.AbstractC10458p;
import p658b5.C11246q;
import p860l0.EnumC16673F0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, m18067d2 = {"Landroidx/compose/material3/internal/DraggableAnchorsElement;", TokenNames.f32019T, "Lz1/S;", "LL0/L;", "material3_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class DraggableAnchorsElement<T> extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final C11246q f32667Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC1439n f32668Z;

    public DraggableAnchorsElement(C11246q c11246q, InterfaceC1439n interfaceC1439n) {
        this.f32667Y = c11246q;
        this.f32668Z = interfaceC1439n;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C4848L c4848l = new C4848L();
        c4848l.f15782z0 = this.f32667Y;
        c4848l.f15779A0 = this.f32668Z;
        c4848l.f15780B0 = EnumC16673F0.f53401Y;
        return c4848l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return AbstractC16544l.m18089b(this.f32667Y, draggableAnchorsElement.f32667Y) && this.f32668Z == draggableAnchorsElement.f32668Z;
    }

    public final int hashCode() {
        return EnumC16673F0.f53401Y.hashCode() + ((this.f32668Z.hashCode() + (this.f32667Y.hashCode() * 31)) * 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C4848L c4848l = (C4848L) abstractC10458p;
        c4848l.f15782z0 = this.f32667Y;
        c4848l.f15779A0 = this.f32668Z;
        c4848l.f15780B0 = EnumC16673F0.f53401Y;
    }
}
