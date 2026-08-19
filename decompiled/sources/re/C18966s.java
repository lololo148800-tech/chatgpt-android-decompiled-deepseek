package re;

import kotlin.jvm.internal.AbstractC16544l;
import p172Gi.C3061C;

/* JADX INFO: renamed from: re.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C18966s extends AbstractC18967t {

    /* JADX INFO: renamed from: a */
    public final C3061C f60521a;

    public C18966s(C3061C voiceSessionInformation) {
        AbstractC16544l.m18094g(voiceSessionInformation, "voiceSessionInformation");
        this.f60521a = voiceSessionInformation;
    }

    @Override // re.AbstractC18967t
    /* JADX INFO: renamed from: e */
    public final C3061C mo20277e() {
        return this.f60521a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18966s) && AbstractC16544l.m18089b(this.f60521a, ((C18966s) obj).f60521a);
    }

    public final int hashCode() {
        return this.f60521a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
