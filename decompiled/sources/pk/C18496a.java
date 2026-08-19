package pk;

import android.gov.nist.core.Separators;
import android.view.View;
import kotlin.jvm.internal.AbstractC16544l;
import p994rk.InterfaceC19201o2;

/* JADX INFO: renamed from: pk.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C18496a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC19201o2 f58958a;

    /* JADX INFO: renamed from: b */
    public final View f58959b;

    public C18496a(InterfaceC19201o2 component, View view) {
        AbstractC16544l.m18094g(component, "component");
        this.f58958a = component;
        this.f58959b = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18496a)) {
            return false;
        }
        C18496a c18496a = (C18496a) obj;
        return AbstractC16544l.m18089b(this.f58958a, c18496a.f58958a) && AbstractC16544l.m18089b(this.f58959b, c18496a.f58959b);
    }

    public final int hashCode() {
        return this.f58959b.hashCode() + (this.f58958a.hashCode() * 31);
    }

    public final String toString() {
        return "ComponentView(component=" + this.f58958a + ", view=" + this.f58959b + Separators.RPAREN;
    }
}
