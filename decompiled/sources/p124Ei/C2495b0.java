package p124Ei;

import kotlin.jvm.internal.AbstractC16544l;
import p172Gi.C3077j;

/* JADX INFO: renamed from: Ei.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2495b0 implements InterfaceC2548v0 {

    /* JADX INFO: renamed from: a */
    public final C3077j f7776a;

    public C2495b0(C3077j voice) {
        AbstractC16544l.m18094g(voice, "voice");
        this.f7776a = voice;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2495b0) && AbstractC16544l.m18089b(this.f7776a, ((C2495b0) obj).f7776a);
    }

    public final int hashCode() {
        return this.f7776a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
