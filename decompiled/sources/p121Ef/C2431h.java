package p121Ef;

import kotlin.jvm.internal.AbstractC16544l;
import p072Ci.EnumC1711p;
import p098Di.InterfaceC2062k;

/* JADX INFO: renamed from: Ef.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C2431h implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final EnumC1711p f7560a;

    public C2431h(EnumC1711p weatherUnit) {
        AbstractC16544l.m18094g(weatherUnit, "weatherUnit");
        this.f7560a = weatherUnit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2431h) && this.f7560a == ((C2431h) obj).f7560a;
    }

    public final int hashCode() {
        return this.f7560a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
