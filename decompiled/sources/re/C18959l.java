package re;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: re.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C18959l implements InterfaceC18962o {

    /* JADX INFO: renamed from: a */
    public final Iterable f60513a;

    /* JADX INFO: renamed from: b */
    public final String f60514b;

    public C18959l(String str, Iterable selectedOptions) {
        AbstractC16544l.m18094g(selectedOptions, "selectedOptions");
        this.f60513a = selectedOptions;
        this.f60514b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18959l)) {
            return false;
        }
        C18959l c18959l = (C18959l) obj;
        return AbstractC16544l.m18089b(this.f60513a, c18959l.f60513a) && AbstractC16544l.m18089b(this.f60514b, c18959l.f60514b);
    }

    public final int hashCode() {
        int iHashCode = this.f60513a.hashCode() * 31;
        String str = this.f60514b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
