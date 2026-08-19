package p911o0;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;

/* JADX INFO: renamed from: o0.D */
/* JADX INFO: loaded from: classes.dex */
public final class C17721D implements InterfaceC17716A0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC17716A0 f56579a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17716A0 f56580b;

    public C17721D(InterfaceC17716A0 interfaceC17716A0, InterfaceC17716A0 interfaceC17716A1) {
        this.f56579a = interfaceC17716A0;
        this.f56580b = interfaceC17716A1;
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: a */
    public final int mo5505a(InterfaceC7537b interfaceC7537b, EnumC7546k enumC7546k) {
        int iMo5505a = this.f56579a.mo5505a(interfaceC7537b, enumC7546k) - this.f56580b.mo5505a(interfaceC7537b, enumC7546k);
        if (iMo5505a < 0) {
            return 0;
        }
        return iMo5505a;
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: b */
    public final int mo5506b(InterfaceC7537b interfaceC7537b, EnumC7546k enumC7546k) {
        int iMo5506b = this.f56579a.mo5506b(interfaceC7537b, enumC7546k) - this.f56580b.mo5506b(interfaceC7537b, enumC7546k);
        if (iMo5506b < 0) {
            return 0;
        }
        return iMo5506b;
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: c */
    public final int mo5507c(InterfaceC7537b interfaceC7537b) {
        int iMo5507c = this.f56579a.mo5507c(interfaceC7537b) - this.f56580b.mo5507c(interfaceC7537b);
        if (iMo5507c < 0) {
            return 0;
        }
        return iMo5507c;
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: d */
    public final int mo5508d(InterfaceC7537b interfaceC7537b) {
        int iMo5508d = this.f56579a.mo5508d(interfaceC7537b) - this.f56580b.mo5508d(interfaceC7537b);
        if (iMo5508d < 0) {
            return 0;
        }
        return iMo5508d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17721D)) {
            return false;
        }
        C17721D c17721d = (C17721D) obj;
        return AbstractC16544l.m18089b(c17721d.f56579a, this.f56579a) && AbstractC16544l.m18089b(c17721d.f56580b, this.f56580b);
    }

    public final int hashCode() {
        return this.f56580b.hashCode() + (this.f56579a.hashCode() * 31);
    }

    public final String toString() {
        return Separators.LPAREN + this.f56579a + " - " + this.f56580b + ')';
    }
}
