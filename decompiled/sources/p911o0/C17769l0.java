package p911o0;

import kotlin.jvm.internal.AbstractC16544l;
import p492U1.C7540e;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;

/* JADX INFO: renamed from: o0.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17769l0 implements InterfaceC17716A0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC17763i0 f56723a;

    public C17769l0(InterfaceC17763i0 interfaceC17763i0) {
        this.f56723a = interfaceC17763i0;
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: a */
    public final int mo5505a(InterfaceC7537b interfaceC7537b, EnumC7546k enumC7546k) {
        return interfaceC7537b.mo7866k0(this.f56723a.mo19474c(enumC7546k));
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: b */
    public final int mo5506b(InterfaceC7537b interfaceC7537b, EnumC7546k enumC7546k) {
        return interfaceC7537b.mo7866k0(this.f56723a.mo19472a(enumC7546k));
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: c */
    public final int mo5507c(InterfaceC7537b interfaceC7537b) {
        return interfaceC7537b.mo7866k0(this.f56723a.mo19473b());
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: d */
    public final int mo5508d(InterfaceC7537b interfaceC7537b) {
        return interfaceC7537b.mo7866k0(this.f56723a.mo19475d());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17769l0) {
            return AbstractC16544l.m18089b(((C17769l0) obj).f56723a, this.f56723a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f56723a.hashCode();
    }

    public final String toString() {
        EnumC7546k enumC7546k = EnumC7546k.f23904Y;
        InterfaceC17763i0 interfaceC17763i0 = this.f56723a;
        return "PaddingValues(" + ((Object) C7540e.m7874b(interfaceC17763i0.mo19474c(enumC7546k))) + ", " + ((Object) C7540e.m7874b(interfaceC17763i0.mo19475d())) + ", " + ((Object) C7540e.m7874b(interfaceC17763i0.mo19472a(enumC7546k))) + ", " + ((Object) C7540e.m7874b(interfaceC17763i0.mo19473b())) + ')';
    }
}
