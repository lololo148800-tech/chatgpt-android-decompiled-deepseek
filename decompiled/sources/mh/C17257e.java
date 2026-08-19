package mh;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2052a;

/* JADX INFO: renamed from: mh.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C17257e implements InterfaceC2052a {

    /* JADX INFO: renamed from: a */
    public final String f55053a;

    public C17257e(String text) {
        AbstractC16544l.m18094g(text, "text");
        this.f55053a = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17257e) && AbstractC16544l.m18089b(this.f55053a, ((C17257e) obj).f55053a);
    }

    public final int hashCode() {
        return this.f55053a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
