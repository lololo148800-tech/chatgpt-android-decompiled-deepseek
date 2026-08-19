package p294Li;

import kotlin.jvm.internal.AbstractC16544l;
import p172Gi.C3077j;

/* JADX INFO: renamed from: Li.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C5098t implements InterfaceC5099u {

    /* JADX INFO: renamed from: a */
    public final C3077j f16669a;

    public C5098t(C3077j voice) {
        AbstractC16544l.m18094g(voice, "voice");
        this.f16669a = voice;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5098t) && AbstractC16544l.m18089b(this.f16669a, ((C5098t) obj).f16669a);
    }

    public final int hashCode() {
        return this.f16669a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
