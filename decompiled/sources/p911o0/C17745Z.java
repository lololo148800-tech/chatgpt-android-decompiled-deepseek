package p911o0;

import kotlin.jvm.internal.AbstractC16544l;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;

/* JADX INFO: renamed from: o0.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C17745Z implements InterfaceC17763i0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC17716A0 f56663a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7537b f56664b;

    public C17745Z(InterfaceC17716A0 interfaceC17716A0, InterfaceC7537b interfaceC7537b) {
        this.f56663a = interfaceC17716A0;
        this.f56664b = interfaceC7537b;
    }

    @Override // p911o0.InterfaceC17763i0
    /* JADX INFO: renamed from: a */
    public final float mo19472a(EnumC7546k enumC7546k) {
        InterfaceC17716A0 interfaceC17716A0 = this.f56663a;
        InterfaceC7537b interfaceC7537b = this.f56664b;
        return interfaceC7537b.mo7861O(interfaceC17716A0.mo5506b(interfaceC7537b, enumC7546k));
    }

    @Override // p911o0.InterfaceC17763i0
    /* JADX INFO: renamed from: b */
    public final float mo19473b() {
        InterfaceC17716A0 interfaceC17716A0 = this.f56663a;
        InterfaceC7537b interfaceC7537b = this.f56664b;
        return interfaceC7537b.mo7861O(interfaceC17716A0.mo5507c(interfaceC7537b));
    }

    @Override // p911o0.InterfaceC17763i0
    /* JADX INFO: renamed from: c */
    public final float mo19474c(EnumC7546k enumC7546k) {
        InterfaceC17716A0 interfaceC17716A0 = this.f56663a;
        InterfaceC7537b interfaceC7537b = this.f56664b;
        return interfaceC7537b.mo7861O(interfaceC17716A0.mo5505a(interfaceC7537b, enumC7546k));
    }

    @Override // p911o0.InterfaceC17763i0
    /* JADX INFO: renamed from: d */
    public final float mo19475d() {
        InterfaceC17716A0 interfaceC17716A0 = this.f56663a;
        InterfaceC7537b interfaceC7537b = this.f56664b;
        return interfaceC7537b.mo7861O(interfaceC17716A0.mo5508d(interfaceC7537b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17745Z)) {
            return false;
        }
        C17745Z c17745z = (C17745Z) obj;
        return AbstractC16544l.m18089b(this.f56663a, c17745z.f56663a) && AbstractC16544l.m18089b(this.f56664b, c17745z.f56664b);
    }

    public final int hashCode() {
        return this.f56664b.hashCode() + (this.f56663a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f56663a + ", density=" + this.f56664b + ')';
    }
}
