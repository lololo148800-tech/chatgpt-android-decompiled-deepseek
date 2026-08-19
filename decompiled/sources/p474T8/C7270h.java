package p474T8;

import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: T8.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7270h implements InterfaceC7272j {

    /* JADX INFO: renamed from: a */
    public final boolean f23053a;

    public C7270h(boolean z6) {
        this.f23053a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7270h) && this.f23053a == ((C7270h) obj).f23053a;
    }

    public final int hashCode() {
        return this.f23053a ? 1231 : 1237;
    }

    public final String toString() {
        return AbstractC3794B0.m4499x(new StringBuilder("Denied(shouldShowRationale="), this.f23053a, ')');
    }
}
