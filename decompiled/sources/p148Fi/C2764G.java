package p148Fi;

import ao.AbstractC11153a0;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import mm.InterfaceC17306i;
import p002A0.C0130g;
import p559Wn.C8972d;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Fi.G */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2764G extends AbstractC2841n {
    public static final C2762F Companion = new C2762F();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f8468d = {null, null, new C8972d(AbstractC16526C.f51263a.mo5693b(InterfaceC17306i.class), new Annotation[0])};

    /* JADX INFO: renamed from: a */
    public final C2862x0 f8469a;

    /* JADX INFO: renamed from: b */
    public final Double f8470b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17306i f8471c;

    public C2764G(int i10, C2862x0 c2862x0, Double d10, InterfaceC17306i interfaceC17306i) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C2760E.f8458a.getDescriptor());
            throw null;
        }
        this.f8469a = c2862x0;
        this.f8470b = d10;
        if ((i10 & 4) == 0) {
            this.f8471c = AbstractC9227W.m9800c(new C0130g(this, 23));
        } else {
            this.f8471c = interfaceC17306i;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2764G)) {
            return false;
        }
        C2764G c2764g = (C2764G) obj;
        return AbstractC16544l.m18089b(this.f8469a, c2764g.f8469a) && AbstractC16544l.m18089b(this.f8470b, c2764g.f8470b);
    }

    public final int hashCode() {
        C2862x0 c2862x0 = this.f8469a;
        int iHashCode = (c2862x0 == null ? 0 : c2862x0.hashCode()) * 31;
        Double d10 = this.f8470b;
        return iHashCode + (d10 != null ? d10.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
