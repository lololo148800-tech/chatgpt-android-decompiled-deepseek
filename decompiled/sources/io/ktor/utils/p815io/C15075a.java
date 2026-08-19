package io.ktor.utils.p815io;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: io.ktor.utils.io.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C15075a implements InterfaceC15081g {

    /* JADX INFO: renamed from: b */
    public final Throwable f46839b;

    public C15075a(Throwable th2) {
        this.f46839b = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15075a) && AbstractC16544l.m18089b(this.f46839b, ((C15075a) obj).f46839b);
    }

    public final int hashCode() {
        Throwable th2 = this.f46839b;
        if (th2 == null) {
            return 0;
        }
        return th2.hashCode();
    }

    public final String toString() {
        return "Closed(cause=" + this.f46839b + ')';
    }
}
