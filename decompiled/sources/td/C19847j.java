package td;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: td.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C19847j implements InterfaceC19848k {

    /* JADX INFO: renamed from: a */
    public final String f62935a;

    /* JADX INFO: renamed from: b */
    public final String f62936b;

    public C19847j(String conversationId, String str) {
        AbstractC16544l.m18094g(conversationId, "conversationId");
        this.f62935a = conversationId;
        this.f62936b = str;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19847j)) {
            return false;
        }
        C19847j c19847j = (C19847j) obj;
        if (!AbstractC16544l.m18089b(this.f62935a, c19847j.f62935a)) {
            return false;
        }
        String str = this.f62936b;
        String str2 = c19847j.f62936b;
        if (str == null) {
            if (str2 == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str2 == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str, str2);
        }
        return zM18089b;
    }

    public final int hashCode() {
        int iHashCode = this.f62935a.hashCode() * 31;
        String str = this.f62936b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
