package p911o0;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;

/* JADX INFO: renamed from: o0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C17746a implements InterfaceC17716A0 {

    /* JADX INFO: renamed from: a */
    public final C17769l0 f56665a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17716A0 f56666b;

    public C17746a(C17769l0 c17769l0, InterfaceC17716A0 interfaceC17716A0) {
        this.f56665a = c17769l0;
        this.f56666b = interfaceC17716A0;
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: a */
    public final int mo5505a(InterfaceC7537b interfaceC7537b, EnumC7546k enumC7546k) {
        return this.f56666b.mo5505a(interfaceC7537b, enumC7546k) + this.f56665a.mo5505a(interfaceC7537b, enumC7546k);
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: b */
    public final int mo5506b(InterfaceC7537b interfaceC7537b, EnumC7546k enumC7546k) {
        return this.f56666b.mo5506b(interfaceC7537b, enumC7546k) + this.f56665a.mo5506b(interfaceC7537b, enumC7546k);
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: c */
    public final int mo5507c(InterfaceC7537b interfaceC7537b) {
        return this.f56666b.mo5507c(interfaceC7537b) + this.f56665a.mo5507c(interfaceC7537b);
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: d */
    public final int mo5508d(InterfaceC7537b interfaceC7537b) {
        return this.f56666b.mo5508d(interfaceC7537b) + this.f56665a.mo5508d(interfaceC7537b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17746a)) {
            return false;
        }
        C17746a c17746a = (C17746a) obj;
        return c17746a.f56665a.equals(this.f56665a) && AbstractC16544l.m18089b(c17746a.f56666b, this.f56666b);
    }

    public final int hashCode() {
        return (this.f56666b.hashCode() * 31) + this.f56665a.f56723a.hashCode();
    }

    public final String toString() {
        return Separators.LPAREN + this.f56665a + " + " + this.f56666b + ')';
    }
}
