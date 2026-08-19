package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C12084E {

    /* JADX INFO: renamed from: a */
    public final InterfaceC12091G0 f36882a;

    /* JADX INFO: renamed from: b */
    public final int f36883b;

    public C12084E(int i10, InterfaceC12091G0 interfaceC12091G0) {
        this.f36882a = interfaceC12091G0;
        this.f36883b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12084E)) {
            return false;
        }
        C12084E c12084e = (C12084E) obj;
        return this.f36882a == c12084e.f36882a && this.f36883b == c12084e.f36883b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f36882a) * 65535) + this.f36883b;
    }
}
