package p911o0;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;

/* JADX INFO: renamed from: o0.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17791w0 implements InterfaceC17716A0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC17716A0 f56773a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17716A0 f56774b;

    public C17791w0(InterfaceC17716A0 interfaceC17716A0, InterfaceC17716A0 interfaceC17716A1) {
        this.f56773a = interfaceC17716A0;
        this.f56774b = interfaceC17716A1;
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: a */
    public final int mo5505a(InterfaceC7537b interfaceC7537b, EnumC7546k enumC7546k) {
        return Math.max(this.f56773a.mo5505a(interfaceC7537b, enumC7546k), this.f56774b.mo5505a(interfaceC7537b, enumC7546k));
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: b */
    public final int mo5506b(InterfaceC7537b interfaceC7537b, EnumC7546k enumC7546k) {
        return Math.max(this.f56773a.mo5506b(interfaceC7537b, enumC7546k), this.f56774b.mo5506b(interfaceC7537b, enumC7546k));
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: c */
    public final int mo5507c(InterfaceC7537b interfaceC7537b) {
        return Math.max(this.f56773a.mo5507c(interfaceC7537b), this.f56774b.mo5507c(interfaceC7537b));
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: d */
    public final int mo5508d(InterfaceC7537b interfaceC7537b) {
        return Math.max(this.f56773a.mo5508d(interfaceC7537b), this.f56774b.mo5508d(interfaceC7537b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17791w0)) {
            return false;
        }
        C17791w0 c17791w0 = (C17791w0) obj;
        return AbstractC16544l.m18089b(c17791w0.f56773a, this.f56773a) && AbstractC16544l.m18089b(c17791w0.f56774b, this.f56774b);
    }

    public final int hashCode() {
        return (this.f56774b.hashCode() * 31) + this.f56773a.hashCode();
    }

    public final String toString() {
        return Separators.LPAREN + this.f56773a + " ∪ " + this.f56774b + ')';
    }
}
