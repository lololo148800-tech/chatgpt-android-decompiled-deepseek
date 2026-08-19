package p645ah;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;

/* JADX INFO: renamed from: ah.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C10609c implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final String f31484a;

    public C10609c(String errorMessage) {
        AbstractC16544l.m18094g(errorMessage, "errorMessage");
        this.f31484a = errorMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10609c) && AbstractC16544l.m18089b(this.f31484a, ((C10609c) obj).f31484a);
    }

    public final int hashCode() {
        return this.f31484a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
