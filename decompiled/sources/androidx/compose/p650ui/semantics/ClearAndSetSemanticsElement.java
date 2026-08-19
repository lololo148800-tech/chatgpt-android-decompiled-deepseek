package androidx.compose.p650ui.semantics;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p156G1.C2956c;
import p156G1.C2963j;
import p156G1.InterfaceC2964k;
import p229J0.C4161y;
import p635a1.AbstractC10458p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, m18067d2 = {"Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;", "Lz1/S;", "LG1/c;", "LG1/k;", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class ClearAndSetSemanticsElement extends AbstractC21672S implements InterfaceC2964k {
    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new C2956c(false, true, C4161y.f13493Z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClearAndSetSemanticsElement)) {
            return false;
        }
        Object obj2 = C4161y.f13493Z;
        ((ClearAndSetSemanticsElement) obj).getClass();
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return C4161y.f13493Z.hashCode();
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        ((C2956c) abstractC10458p).f8842B0 = C4161y.f13493Z;
    }

    public final String toString() {
        return "ClearAndSetSemanticsElement(properties=" + C4161y.f13493Z + ')';
    }

    @Override // p156G1.InterfaceC2964k
    /* JADX INFO: renamed from: v0 */
    public final C2963j mo3788v0() {
        C2963j c2963j = new C2963j();
        c2963j.f8881Z = false;
        c2963j.f8882o0 = true;
        return c2963j;
    }
}
