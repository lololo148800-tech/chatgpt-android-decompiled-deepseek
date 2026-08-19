package p324Mn;

import kotlin.jvm.internal.AbstractC16544l;
import p463Sn.C7163p;
import p559Wn.InterfaceC8975g;
import p817j$.time.ZoneOffset;

/* JADX INFO: renamed from: Mn.H */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8975g(with = C7163p.class)
public final class C5527H {
    public static final C5526G Companion = new C5526G();

    /* JADX INFO: renamed from: a */
    public final ZoneOffset f17978a;

    static {
        ZoneOffset UTC = ZoneOffset.UTC;
        AbstractC16544l.m18093f(UTC, "UTC");
        new C5527H(UTC);
    }

    public C5527H(ZoneOffset zoneOffset) {
        AbstractC16544l.m18094g(zoneOffset, "zoneOffset");
        this.f17978a = zoneOffset;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5527H) {
            if (AbstractC16544l.m18089b(this.f17978a, ((C5527H) obj).f17978a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17978a.hashCode();
    }

    public final String toString() {
        String string = this.f17978a.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }
}
