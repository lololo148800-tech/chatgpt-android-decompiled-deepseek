package io;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: io.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C15051g implements InterfaceC15054j {

    /* JADX INFO: renamed from: a */
    public final boolean f46778a;

    public C15051g(boolean z6) {
        this.f46778a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15051g) && this.f46778a == ((C15051g) obj).f46778a;
    }

    public final int hashCode() {
        return this.f46778a ? 1231 : 1237;
    }

    public final String toString() {
        return "Dragging(willDismissOnRelease=" + this.f46778a + Separators.RPAREN;
    }
}
