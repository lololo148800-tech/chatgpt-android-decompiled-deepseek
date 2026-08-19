package p911o0;

import com.google.protobuf.AbstractC12107L1;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;

/* JADX INFO: renamed from: o0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C17725F implements InterfaceC17716A0 {

    /* JADX INFO: renamed from: a */
    public final int f56586a;

    /* JADX INFO: renamed from: b */
    public final int f56587b;

    /* JADX INFO: renamed from: c */
    public final int f56588c;

    /* JADX INFO: renamed from: d */
    public final int f56589d;

    public C17725F(int i10, int i11, int i12, int i13) {
        this.f56586a = i10;
        this.f56587b = i11;
        this.f56588c = i12;
        this.f56589d = i13;
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: a */
    public final int mo5505a(InterfaceC7537b interfaceC7537b, EnumC7546k enumC7546k) {
        return this.f56586a;
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: b */
    public final int mo5506b(InterfaceC7537b interfaceC7537b, EnumC7546k enumC7546k) {
        return this.f56588c;
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: c */
    public final int mo5507c(InterfaceC7537b interfaceC7537b) {
        return this.f56589d;
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: d */
    public final int mo5508d(InterfaceC7537b interfaceC7537b) {
        return this.f56587b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17725F)) {
            return false;
        }
        C17725F c17725f = (C17725F) obj;
        return this.f56586a == c17725f.f56586a && this.f56587b == c17725f.f56587b && this.f56588c == c17725f.f56588c && this.f56589d == c17725f.f56589d;
    }

    public final int hashCode() {
        return (((((this.f56586a * 31) + this.f56587b) * 31) + this.f56588c) * 31) + this.f56589d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets(left=");
        sb2.append(this.f56586a);
        sb2.append(", top=");
        sb2.append(this.f56587b);
        sb2.append(", right=");
        sb2.append(this.f56588c);
        sb2.append(", bottom=");
        return AbstractC12107L1.m13826q(sb2, this.f56589d, ')');
    }
}
