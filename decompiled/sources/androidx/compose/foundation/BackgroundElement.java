package androidx.compose.foundation;

import com.google.protobuf.AbstractC12107L1;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17321x;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p773h0.C14301p;
import p774h1.AbstractC14360p;
import p774h1.C14327E;
import p774h1.C14365u;
import p774h1.InterfaceC14339Q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/BackgroundElement;", "Lz1/S;", "Lh0/p;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class BackgroundElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final long f32377Y;

    /* JADX INFO: renamed from: Z */
    public final AbstractC14360p f32378Z;

    /* JADX INFO: renamed from: o0 */
    public final float f32379o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC14339Q f32380p0;

    public BackgroundElement(long j10, C14327E c14327e, float f10, InterfaceC14339Q interfaceC14339Q, int i10) {
        j10 = (i10 & 1) != 0 ? C14365u.f45060j : j10;
        c14327e = (i10 & 2) != 0 ? null : c14327e;
        this.f32377Y = j10;
        this.f32378Z = c14327e;
        this.f32379o0 = f10;
        this.f32380p0 = interfaceC14339Q;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C14301p c14301p = new C14301p();
        c14301p.f44902z0 = this.f32377Y;
        c14301p.f44895A0 = this.f32378Z;
        c14301p.f44896B0 = this.f32379o0;
        c14301p.f44897C0 = this.f32380p0;
        c14301p.f44898D0 = 9205357640488583168L;
        return c14301p;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && C14365u.m15775c(this.f32377Y, backgroundElement.f32377Y) && AbstractC16544l.m18089b(this.f32378Z, backgroundElement.f32378Z) && this.f32379o0 == backgroundElement.f32379o0 && AbstractC16544l.m18089b(this.f32380p0, backgroundElement.f32380p0);
    }

    public final int hashCode() {
        int i10 = C14365u.f45061k;
        int iM18981a = C17321x.m18981a(this.f32377Y) * 31;
        AbstractC14360p abstractC14360p = this.f32378Z;
        return this.f32380p0.hashCode() + AbstractC12107L1.m13819j(this.f32379o0, (iM18981a + (abstractC14360p != null ? abstractC14360p.hashCode() : 0)) * 31, 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C14301p c14301p = (C14301p) abstractC10458p;
        c14301p.f44902z0 = this.f32377Y;
        c14301p.f44895A0 = this.f32378Z;
        c14301p.f44896B0 = this.f32379o0;
        c14301p.f44897C0 = this.f32380p0;
    }
}
