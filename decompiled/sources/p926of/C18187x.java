package p926of;

import kotlin.jvm.internal.AbstractC16544l;
import p360Od.C6172d;

/* JADX INFO: renamed from: of.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C18187x implements InterfaceC18159W {

    /* JADX INFO: renamed from: a */
    public final C6172d f58003a;

    public C18187x(C6172d data) {
        AbstractC16544l.m18094g(data, "data");
        this.f58003a = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18187x) && AbstractC16544l.m18089b(this.f58003a, ((C18187x) obj).f58003a);
    }

    public final int hashCode() {
        return this.f58003a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
