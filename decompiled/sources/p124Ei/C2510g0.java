package p124Ei;

import kotlin.jvm.internal.AbstractC16544l;
import p172Gi.C3077j;

/* JADX INFO: renamed from: Ei.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2510g0 implements InterfaceC2548v0 {

    /* JADX INFO: renamed from: a */
    public final C3077j f7805a;

    public C2510g0(C3077j voice) {
        AbstractC16544l.m18094g(voice, "voice");
        this.f7805a = voice;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2510g0) && AbstractC16544l.m18089b(this.f7805a, ((C2510g0) obj).f7805a);
    }

    public final int hashCode() {
        return this.f7805a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
