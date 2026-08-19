package p124Ei;

import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.C22025k2;

/* JADX INFO: renamed from: Ei.k0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2522k0 implements InterfaceC2548v0 {

    /* JADX INFO: renamed from: a */
    public final C22025k2 f7832a;

    public C2522k0(C22025k2 voiceDisabledMessage) {
        AbstractC16544l.m18094g(voiceDisabledMessage, "voiceDisabledMessage");
        this.f7832a = voiceDisabledMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2522k0) && AbstractC16544l.m18089b(this.f7832a, ((C2522k0) obj).f7832a);
    }

    public final int hashCode() {
        return this.f7832a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
