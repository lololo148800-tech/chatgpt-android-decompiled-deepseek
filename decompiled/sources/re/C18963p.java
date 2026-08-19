package re;

import kotlin.jvm.internal.AbstractC16544l;
import p172Gi.C3061C;

/* JADX INFO: renamed from: re.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C18963p extends AbstractC18967t {

    /* JADX INFO: renamed from: a */
    public final C3061C f60517a;

    /* JADX INFO: renamed from: b */
    public final boolean f60518b;

    public C18963p(C3061C voiceSessionInformation, boolean z6) {
        AbstractC16544l.m18094g(voiceSessionInformation, "voiceSessionInformation");
        this.f60517a = voiceSessionInformation;
        this.f60518b = z6;
    }

    @Override // re.AbstractC18967t
    /* JADX INFO: renamed from: e */
    public final C3061C mo20277e() {
        return this.f60517a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18963p)) {
            return false;
        }
        C18963p c18963p = (C18963p) obj;
        return AbstractC16544l.m18089b(this.f60517a, c18963p.f60517a) && this.f60518b == c18963p.f60518b;
    }

    public final int hashCode() {
        return (this.f60517a.hashCode() * 31) + (this.f60518b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
