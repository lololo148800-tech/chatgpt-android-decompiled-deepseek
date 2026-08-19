package p530Vi;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.C16644c;
import p1114xp.InterfaceC21331b;

/* JADX INFO: renamed from: Vi.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C8304L implements InterfaceC21331b {
    public static final C8302J Companion = new C8302J();

    /* JADX INFO: renamed from: a */
    public String f25878a;

    /* JADX INFO: renamed from: b */
    public String f25879b;

    /* JADX INFO: renamed from: c */
    public C16644c f25880c;

    public C8304L(String anonymousId, String str, C16644c c16644c) {
        AbstractC16544l.m18094g(anonymousId, "anonymousId");
        this.f25878a = anonymousId;
        this.f25879b = str;
        this.f25880c = c16644c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8304L)) {
            return false;
        }
        C8304L c8304l = (C8304L) obj;
        return AbstractC16544l.m18089b(this.f25878a, c8304l.f25878a) && AbstractC16544l.m18089b(this.f25879b, c8304l.f25879b) && AbstractC16544l.m18089b(this.f25880c, c8304l.f25880c);
    }

    public final int hashCode() {
        int iHashCode = this.f25878a.hashCode() * 31;
        String str = this.f25879b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C16644c c16644c = this.f25880c;
        return iHashCode2 + (c16644c != null ? c16644c.f53331Y.hashCode() : 0);
    }

    public final String toString() {
        return "UserInfo(anonymousId=" + this.f25878a + ", userId=" + this.f25879b + ", traits=" + this.f25880c + ')';
    }
}
