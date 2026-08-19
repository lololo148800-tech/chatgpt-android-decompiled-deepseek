package androidx.compose.p650ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1001s1.C19434d;
import p1001s1.C19437g;
import p1001s1.InterfaceC19431a;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p887m7.C17176b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "Lz1/S;", "Ls1/g;", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class NestedScrollElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC19431a f32736Y;

    /* JADX INFO: renamed from: Z */
    public final C19434d f32737Z;

    public NestedScrollElement(InterfaceC19431a interfaceC19431a, C19434d c19434d) {
        this.f32736Y = interfaceC19431a;
        this.f32737Z = c19434d;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new C19437g(this.f32736Y, this.f32737Z);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return AbstractC16544l.m18089b(nestedScrollElement.f32736Y, this.f32736Y) && AbstractC16544l.m18089b(nestedScrollElement.f32737Z, this.f32737Z);
    }

    public final int hashCode() {
        int iHashCode = this.f32736Y.hashCode() * 31;
        C19434d c19434d = this.f32737Z;
        return iHashCode + (c19434d != null ? c19434d.hashCode() : 0);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C19437g c19437g = (C19437g) abstractC10458p;
        c19437g.f61639z0 = this.f32736Y;
        C19434d c19434d = c19437g.f61637A0;
        if (c19434d.f61623a == c19437g) {
            c19434d.f61623a = null;
        }
        C19434d c19434d2 = this.f32737Z;
        if (c19434d2 == null) {
            c19437g.f61637A0 = new C19434d();
        } else if (!c19434d2.equals(c19434d)) {
            c19437g.f61637A0 = c19434d2;
        }
        if (c19437g.f30972y0) {
            C19434d c19434d3 = c19437g.f61637A0;
            c19434d3.f61623a = c19437g;
            c19434d3.f61624b = new C17176b(c19437g, 18);
            c19434d3.f61625c = c19437g.m10935y0();
        }
    }
}
