package p736f0;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p758g0.InterfaceC13726B;

/* JADX INFO: renamed from: f0.S */
/* JADX INFO: loaded from: classes.dex */
public final class C13480S {

    /* JADX INFO: renamed from: a */
    public final AbstractC16546n f42657a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13726B f42658b;

    /* JADX WARN: Multi-variable type inference failed */
    public C13480S(InterfaceC1436k interfaceC1436k, InterfaceC13726B interfaceC13726B) {
        this.f42657a = (AbstractC16546n) interfaceC1436k;
        this.f42658b = interfaceC13726B;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13480S)) {
            return false;
        }
        C13480S c13480s = (C13480S) obj;
        return this.f42657a.equals(c13480s.f42657a) && AbstractC16544l.m18089b(this.f42658b, c13480s.f42658b);
    }

    public final int hashCode() {
        return this.f42658b.hashCode() + (this.f42657a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f42657a + ", animationSpec=" + this.f42658b + ')';
    }
}
