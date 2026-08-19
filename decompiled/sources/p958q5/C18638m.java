package p958q5;

import kotlin.jvm.internal.AbstractC16544l;
import p899n5.AbstractC17497n;
import p899n5.EnumC17488e;

/* JADX INFO: renamed from: q5.m */
/* JADX INFO: loaded from: classes.dex */
public final class C18638m extends AbstractC18630e {

    /* JADX INFO: renamed from: a */
    public final AbstractC17497n f59376a;

    /* JADX INFO: renamed from: b */
    public final String f59377b;

    /* JADX INFO: renamed from: c */
    public final EnumC17488e f59378c;

    public C18638m(AbstractC17497n abstractC17497n, String str, EnumC17488e enumC17488e) {
        this.f59376a = abstractC17497n;
        this.f59377b = str;
        this.f59378c = enumC17488e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18638m) {
            C18638m c18638m = (C18638m) obj;
            if (AbstractC16544l.m18089b(this.f59376a, c18638m.f59376a) && AbstractC16544l.m18089b(this.f59377b, c18638m.f59377b) && this.f59378c == c18638m.f59378c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f59376a.hashCode() * 31;
        String str = this.f59377b;
        return this.f59378c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
