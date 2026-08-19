package androidx.compose.p650ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;
import p1140z1.AbstractC21672S;
import p156G1.C2956c;
import p156G1.C2963j;
import p156G1.InterfaceC2964k;
import p635a1.AbstractC10458p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, m18067d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "Lz1/S;", "LG1/c;", "LG1/k;", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class AppendedSemanticsElement extends AbstractC21672S implements InterfaceC2964k {

    /* JADX INFO: renamed from: Y */
    public final boolean f32831Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC1436k f32832Z;

    public AppendedSemanticsElement(InterfaceC1436k interfaceC1436k, boolean z6) {
        this.f32831Y = z6;
        this.f32832Z = interfaceC1436k;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new C2956c(this.f32831Y, false, this.f32832Z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f32831Y == appendedSemanticsElement.f32831Y && AbstractC16544l.m18089b(this.f32832Z, appendedSemanticsElement.f32832Z);
    }

    public final int hashCode() {
        return this.f32832Z.hashCode() + ((this.f32831Y ? 1231 : 1237) * 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C2956c c2956c = (C2956c) abstractC10458p;
        c2956c.f8843z0 = this.f32831Y;
        c2956c.f8842B0 = this.f32832Z;
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f32831Y + ", properties=" + this.f32832Z + ')';
    }

    @Override // p156G1.InterfaceC2964k
    /* JADX INFO: renamed from: v0 */
    public final C2963j mo3788v0() {
        C2963j c2963j = new C2963j();
        c2963j.f8881Z = this.f32831Y;
        this.f32832Z.invoke(c2963j);
        return c2963j;
    }
}
