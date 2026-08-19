package androidx.compose.p650ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.internal.C16525B;
import livekit.LivekitInternal$NodeStats;
import p1014t1.C19724a;
import p1014t1.C19732i;
import p1140z1.AbstractC21672S;
import p1140z1.AbstractC21690f;
import p228J.AbstractC3794B0;
import p332N8.C5677a;
import p635a1.AbstractC10458p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "Lz1/S;", "Lt1/i;", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class PointerHoverIconModifierElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final C19724a f32738Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f32739Z;

    public PointerHoverIconModifierElement(C19724a c19724a, boolean z6) {
        this.f32738Y = c19724a;
        this.f32739Z = z6;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C19724a c19724a = this.f32738Y;
        C19732i c19732i = new C19732i();
        c19732i.f62471z0 = c19724a;
        c19732i.f62469A0 = this.f32739Z;
        return c19732i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        return this.f32738Y.equals(pointerHoverIconModifierElement.f32738Y) && this.f32739Z == pointerHoverIconModifierElement.f32739Z;
    }

    public final int hashCode() {
        return (this.f32738Y.f62446b * 31) + (this.f32739Z ? 1231 : 1237);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C19732i c19732i = (C19732i) abstractC10458p;
        C19724a c19724a = c19732i.f62471z0;
        C19724a c19724a2 = this.f32738Y;
        if (!c19724a.equals(c19724a2)) {
            c19732i.f62471z0 = c19724a2;
            if (c19732i.f62470B0) {
                c19732i.m20677L0();
            }
        }
        boolean z6 = c19732i.f62469A0;
        boolean z10 = this.f32739Z;
        if (z6 != z10) {
            c19732i.f62469A0 = z10;
            if (z10) {
                if (c19732i.f62470B0) {
                    c19732i.m20676K0();
                    return;
                }
                return;
            }
            boolean z11 = c19732i.f62470B0;
            if (z11 && z11) {
                if (!z10) {
                    C16525B c16525b = new C16525B();
                    AbstractC21690f.m22221z(c19732i, new C5677a(c16525b, 6));
                    C19732i c19732i2 = (C19732i) c16525b.f51262Y;
                    if (c19732i2 != null) {
                        c19732i = c19732i2;
                    }
                }
                c19732i.m20676K0();
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerHoverIconModifierElement(icon=");
        sb2.append(this.f32738Y);
        sb2.append(", overrideDescendants=");
        return AbstractC3794B0.m4499x(sb2, this.f32739Z, ')');
    }
}
