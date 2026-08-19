package pf;

import kotlin.jvm.internal.AbstractC16544l;
import p479Td.C7351f0;

/* JADX INFO: renamed from: pf.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C18391g implements InterfaceC18393i {

    /* JADX INFO: renamed from: a */
    public final C7351f0 f58672a;

    public C18391g(C7351f0 message) {
        AbstractC16544l.m18094g(message, "message");
        this.f58672a = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18391g) && AbstractC16544l.m18089b(this.f58672a, ((C18391g) obj).f58672a);
    }

    public final int hashCode() {
        return this.f58672a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
