package androidx.compose.foundation.text.modifiers;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;
import p054C0.C1493f;
import p054C0.C1495h;
import p054C0.C1502o;
import p1140z1.AbstractC21672S;
import p1140z1.AbstractC21690f;
import p204I1.C3582M;
import p204I1.C3590f;
import p328N1.InterfaceC5598n;
import p571X9.AbstractC9160K3;
import p635a1.AbstractC10458p;
import p774h1.InterfaceC14366v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18067d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "Lz1/S;", "LC0/f;", "Lh1/v;", "color", "Lh1/v;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class SelectableTextAnnotatedStringElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final C3590f f32609Y;

    /* JADX INFO: renamed from: Z */
    public final C3582M f32610Z;
    private final InterfaceC14366v color;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC5598n f32611o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC1436k f32612p0;

    /* JADX INFO: renamed from: q0 */
    public final int f32613q0;

    /* JADX INFO: renamed from: r0 */
    public final boolean f32614r0;

    /* JADX INFO: renamed from: s0 */
    public final int f32615s0;

    /* JADX INFO: renamed from: t0 */
    public final int f32616t0;

    /* JADX INFO: renamed from: u0 */
    public final List f32617u0;

    /* JADX INFO: renamed from: v0 */
    public final InterfaceC1436k f32618v0;

    /* JADX INFO: renamed from: w0 */
    public final C1495h f32619w0;

    public SelectableTextAnnotatedStringElement(C3590f c3590f, C3582M c3582m, InterfaceC5598n interfaceC5598n, InterfaceC1436k interfaceC1436k, int i10, boolean z6, int i11, int i12, List list, InterfaceC1436k interfaceC1436k2, C1495h c1495h, InterfaceC14366v interfaceC14366v) {
        this.f32609Y = c3590f;
        this.f32610Z = c3582m;
        this.f32611o0 = interfaceC5598n;
        this.f32612p0 = interfaceC1436k;
        this.f32613q0 = i10;
        this.f32614r0 = z6;
        this.f32615s0 = i11;
        this.f32616t0 = i12;
        this.f32617u0 = list;
        this.f32618v0 = interfaceC1436k2;
        this.f32619w0 = c1495h;
        this.color = interfaceC14366v;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        InterfaceC14366v interfaceC14366v = this.color;
        return new C1493f(this.f32609Y, this.f32610Z, this.f32611o0, this.f32612p0, this.f32613q0, this.f32614r0, this.f32615s0, this.f32616t0, this.f32617u0, this.f32618v0, this.f32619w0, interfaceC14366v);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return AbstractC16544l.m18089b(this.color, selectableTextAnnotatedStringElement.color) && AbstractC16544l.m18089b(this.f32609Y, selectableTextAnnotatedStringElement.f32609Y) && AbstractC16544l.m18089b(this.f32610Z, selectableTextAnnotatedStringElement.f32610Z) && AbstractC16544l.m18089b(this.f32617u0, selectableTextAnnotatedStringElement.f32617u0) && AbstractC16544l.m18089b(this.f32611o0, selectableTextAnnotatedStringElement.f32611o0) && this.f32612p0 == selectableTextAnnotatedStringElement.f32612p0 && AbstractC9160K3.m9708a(this.f32613q0, selectableTextAnnotatedStringElement.f32613q0) && this.f32614r0 == selectableTextAnnotatedStringElement.f32614r0 && this.f32615s0 == selectableTextAnnotatedStringElement.f32615s0 && this.f32616t0 == selectableTextAnnotatedStringElement.f32616t0 && this.f32618v0 == selectableTextAnnotatedStringElement.f32618v0 && AbstractC16544l.m18089b(this.f32619w0, selectableTextAnnotatedStringElement.f32619w0);
    }

    public final int hashCode() {
        int iHashCode = (this.f32611o0.hashCode() + ((this.f32610Z.hashCode() + (this.f32609Y.hashCode() * 31)) * 31)) * 31;
        InterfaceC1436k interfaceC1436k = this.f32612p0;
        int iHashCode2 = (((((((((iHashCode + (interfaceC1436k != null ? interfaceC1436k.hashCode() : 0)) * 31) + this.f32613q0) * 31) + (this.f32614r0 ? 1231 : 1237)) * 31) + this.f32615s0) * 31) + this.f32616t0) * 31;
        List list = this.f32617u0;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        InterfaceC1436k interfaceC1436k2 = this.f32618v0;
        int iHashCode4 = (iHashCode3 + (interfaceC1436k2 != null ? interfaceC1436k2.hashCode() : 0)) * 31;
        C1495h c1495h = this.f32619w0;
        int iHashCode5 = (iHashCode4 + (c1495h != null ? c1495h.hashCode() : 0)) * 31;
        InterfaceC14366v interfaceC14366v = this.color;
        return iHashCode5 + (interfaceC14366v != null ? interfaceC14366v.hashCode() : 0);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C1493f c1493f = (C1493f) abstractC10458p;
        InterfaceC14366v interfaceC14366v = this.color;
        C1502o c1502o = c1493f.f3956D0;
        boolean zM18089b = AbstractC16544l.m18089b(interfaceC14366v, c1502o.f3995K0);
        c1502o.f3995K0 = interfaceC14366v;
        C3582M c3582m = this.f32610Z;
        boolean z6 = (zM18089b && c3582m.m4278e(c1502o.f3985A0)) ? false : true;
        boolean zM2166P0 = c1502o.m2166P0(this.f32609Y);
        boolean zM2165O0 = c1493f.f3956D0.m2165O0(c3582m, this.f32617u0, this.f32616t0, this.f32615s0, this.f32614r0, this.f32611o0, this.f32613q0);
        InterfaceC1436k interfaceC1436k = c1493f.f3955C0;
        InterfaceC1436k interfaceC1436k2 = this.f32612p0;
        InterfaceC1436k interfaceC1436k3 = this.f32618v0;
        C1495h c1495h = this.f32619w0;
        c1502o.m2161K0(z6, zM2166P0, zM2165O0, c1502o.m2164N0(interfaceC1436k2, interfaceC1436k3, c1495h, interfaceC1436k));
        c1493f.f3954B0 = c1495h;
        AbstractC21690f.m22210o(c1493f);
    }

    public final String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.f32609Y) + ", style=" + this.f32610Z + ", fontFamilyResolver=" + this.f32611o0 + ", onTextLayout=" + this.f32612p0 + ", overflow=" + ((Object) AbstractC9160K3.m9709b(this.f32613q0)) + ", softWrap=" + this.f32614r0 + ", maxLines=" + this.f32615s0 + ", minLines=" + this.f32616t0 + ", placeholders=" + this.f32617u0 + ", onPlaceholderLayout=" + this.f32618v0 + ", selectionController=" + this.f32619w0 + ", color=" + this.color + ')';
    }
}
