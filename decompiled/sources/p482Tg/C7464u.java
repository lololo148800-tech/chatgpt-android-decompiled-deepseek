package p482Tg;

import kotlin.jvm.internal.AbstractC16544l;
import p072Ci.EnumC1696a;
import p098Di.InterfaceC2052a;

/* JADX INFO: renamed from: Tg.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C7464u implements InterfaceC2052a {

    /* JADX INFO: renamed from: a */
    public final EnumC1696a f23718a;

    public C7464u(EnumC1696a mode) {
        AbstractC16544l.m18094g(mode, "mode");
        this.f23718a = mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7464u) && this.f23718a == ((C7464u) obj).f23718a;
    }

    public final int hashCode() {
        return this.f23718a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
