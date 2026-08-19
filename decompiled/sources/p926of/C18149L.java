package p926of;

import kotlin.jvm.internal.AbstractC16544l;
import p479Td.C7351f0;
import ye.EnumC21517f;

/* JADX INFO: renamed from: of.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C18149L implements InterfaceC18159W {

    /* JADX INFO: renamed from: a */
    public final C7351f0 f57895a;

    /* JADX INFO: renamed from: b */
    public final String f57896b;

    /* JADX INFO: renamed from: c */
    public final EnumC21517f f57897c;

    public C18149L(C7351f0 message, String str, EnumC21517f forceSearch, int i10) {
        str = (i10 & 2) != 0 ? null : str;
        forceSearch = (i10 & 4) != 0 ? EnumC21517f.f68138Z : forceSearch;
        AbstractC16544l.m18094g(message, "message");
        AbstractC16544l.m18094g(forceSearch, "forceSearch");
        this.f57895a = message;
        this.f57896b = str;
        this.f57897c = forceSearch;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18149L)) {
            return false;
        }
        C18149L c18149l = (C18149L) obj;
        if (!AbstractC16544l.m18089b(this.f57895a, c18149l.f57895a)) {
            return false;
        }
        String str = this.f57896b;
        String str2 = c18149l.f57896b;
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
        return zM18089b && this.f57897c == c18149l.f57897c;
    }

    public final int hashCode() {
        int iHashCode = this.f57895a.hashCode() * 31;
        String str = this.f57896b;
        return this.f57897c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "█";
    }
}
