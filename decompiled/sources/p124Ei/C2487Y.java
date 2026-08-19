package p124Ei;

import kotlin.jvm.internal.AbstractC16544l;
import p1081wc.EnumC20861G;

/* JADX INFO: renamed from: Ei.Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C2487Y implements InterfaceC2548v0 {

    /* JADX INFO: renamed from: a */
    public final EnumC20861G f7746a;

    public C2487Y(EnumC20861G source) {
        AbstractC16544l.m18094g(source, "source");
        this.f7746a = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2487Y) && this.f7746a == ((C2487Y) obj).f7746a;
    }

    public final int hashCode() {
        return this.f7746a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
