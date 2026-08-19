package androidx.compose.foundation.text.modifiers;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;
import p054C0.C1502o;
import p1140z1.AbstractC21672S;
import p204I1.C3582M;
import p204I1.C3590f;
import p328N1.InterfaceC5598n;
import p571X9.AbstractC9160K3;
import p635a1.AbstractC10458p;
import p774h1.InterfaceC14366v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18067d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Lz1/S;", "LC0/o;", "Lh1/v;", "color", "Lh1/v;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class TextAnnotatedStringElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final C3590f f32620Y;

    /* JADX INFO: renamed from: Z */
    public final C3582M f32621Z;
    private final InterfaceC14366v color;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC5598n f32622o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC1436k f32623p0;

    /* JADX INFO: renamed from: q0 */
    public final int f32624q0;

    /* JADX INFO: renamed from: r0 */
    public final boolean f32625r0;

    /* JADX INFO: renamed from: s0 */
    public final int f32626s0;

    /* JADX INFO: renamed from: t0 */
    public final int f32627t0;

    /* JADX INFO: renamed from: u0 */
    public final List f32628u0;

    /* JADX INFO: renamed from: v0 */
    public final InterfaceC1436k f32629v0;

    /* JADX INFO: renamed from: w0 */
    public final InterfaceC1436k f32630w0;

    public TextAnnotatedStringElement(C3590f c3590f, C3582M c3582m, InterfaceC5598n interfaceC5598n, InterfaceC1436k interfaceC1436k, int i10, boolean z6, int i11, int i12, List list, InterfaceC1436k interfaceC1436k2, InterfaceC14366v interfaceC14366v, InterfaceC1436k interfaceC1436k3) {
        this.f32620Y = c3590f;
        this.f32621Z = c3582m;
        this.f32622o0 = interfaceC5598n;
        this.f32623p0 = interfaceC1436k;
        this.f32624q0 = i10;
        this.f32625r0 = z6;
        this.f32626s0 = i11;
        this.f32627t0 = i12;
        this.f32628u0 = list;
        this.f32629v0 = interfaceC1436k2;
        this.color = interfaceC14366v;
        this.f32630w0 = interfaceC1436k3;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        InterfaceC14366v interfaceC14366v = this.color;
        return new C1502o(this.f32620Y, this.f32621Z, this.f32622o0, this.f32623p0, this.f32624q0, this.f32625r0, this.f32626s0, this.f32627t0, this.f32628u0, this.f32629v0, null, interfaceC14366v, this.f32630w0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return AbstractC16544l.m18089b(this.color, textAnnotatedStringElement.color) && AbstractC16544l.m18089b(this.f32620Y, textAnnotatedStringElement.f32620Y) && AbstractC16544l.m18089b(this.f32621Z, textAnnotatedStringElement.f32621Z) && AbstractC16544l.m18089b(this.f32628u0, textAnnotatedStringElement.f32628u0) && AbstractC16544l.m18089b(this.f32622o0, textAnnotatedStringElement.f32622o0) && this.f32623p0 == textAnnotatedStringElement.f32623p0 && this.f32630w0 == textAnnotatedStringElement.f32630w0 && AbstractC9160K3.m9708a(this.f32624q0, textAnnotatedStringElement.f32624q0) && this.f32625r0 == textAnnotatedStringElement.f32625r0 && this.f32626s0 == textAnnotatedStringElement.f32626s0 && this.f32627t0 == textAnnotatedStringElement.f32627t0 && this.f32629v0 == textAnnotatedStringElement.f32629v0 && AbstractC16544l.m18089b(null, null);
    }

    public final int hashCode() {
        int iHashCode = (this.f32622o0.hashCode() + ((this.f32621Z.hashCode() + (this.f32620Y.hashCode() * 31)) * 31)) * 31;
        InterfaceC1436k interfaceC1436k = this.f32623p0;
        int iHashCode2 = (((((((((iHashCode + (interfaceC1436k != null ? interfaceC1436k.hashCode() : 0)) * 31) + this.f32624q0) * 31) + (this.f32625r0 ? 1231 : 1237)) * 31) + this.f32626s0) * 31) + this.f32627t0) * 31;
        List list = this.f32628u0;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        InterfaceC1436k interfaceC1436k2 = this.f32629v0;
        int iHashCode4 = (iHashCode3 + (interfaceC1436k2 != null ? interfaceC1436k2.hashCode() : 0)) * 961;
        InterfaceC14366v interfaceC14366v = this.color;
        int iHashCode5 = (iHashCode4 + (interfaceC14366v != null ? interfaceC14366v.hashCode() : 0)) * 31;
        InterfaceC1436k interfaceC1436k3 = this.f32630w0;
        return iHashCode5 + (interfaceC1436k3 != null ? interfaceC1436k3.hashCode() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        boolean z6;
        C1502o c1502o = (C1502o) abstractC10458p;
        InterfaceC14366v interfaceC14366v = this.color;
        boolean zM18089b = AbstractC16544l.m18089b(interfaceC14366v, c1502o.f3995K0);
        c1502o.f3995K0 = interfaceC14366v;
        if (zM18089b) {
            if (this.f32621Z.m4278e(c1502o.f3985A0)) {
                z6 = false;
            } else {
                z6 = true;
            }
        } else {
            z6 = true;
        }
        boolean z10 = z6;
        c1502o.m2161K0(z10, c1502o.m2166P0(this.f32620Y), c1502o.m2165O0(this.f32621Z, this.f32628u0, this.f32627t0, this.f32626s0, this.f32625r0, this.f32622o0, this.f32624q0), c1502o.m2164N0(this.f32623p0, this.f32629v0, null, this.f32630w0));
    }
}
