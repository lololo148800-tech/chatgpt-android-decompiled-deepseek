package p926of;

import kotlin.jvm.internal.AbstractC16544l;
import p479Td.C7351f0;

/* JADX INFO: renamed from: of.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C18138A implements InterfaceC18159W {

    /* JADX INFO: renamed from: a */
    public final C7351f0 f57875a;

    public C18138A(C7351f0 message) {
        AbstractC16544l.m18094g(message, "message");
        this.f57875a = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18138A) && AbstractC16544l.m18089b(this.f57875a, ((C18138A) obj).f57875a);
    }

    public final int hashCode() {
        return this.f57875a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
