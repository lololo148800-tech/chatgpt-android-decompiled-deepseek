package re;

import kotlin.jvm.internal.AbstractC16544l;
import p172Gi.C3061C;

/* JADX INFO: renamed from: re.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C18957j implements InterfaceC18962o {

    /* JADX INFO: renamed from: a */
    public final C3061C f60511a;

    public C18957j(C3061C voiceSessionInformation) {
        AbstractC16544l.m18094g(voiceSessionInformation, "voiceSessionInformation");
        this.f60511a = voiceSessionInformation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18957j) && AbstractC16544l.m18089b(this.f60511a, ((C18957j) obj).f60511a);
    }

    public final int hashCode() {
        return this.f60511a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
