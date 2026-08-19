package p324Mn;

import kotlin.jvm.internal.AbstractC16544l;
import p463Sn.C7162o;
import p559Wn.InterfaceC8975g;
import p817j$.time.ZoneId;
import p817j$.time.ZoneOffset;

/* JADX INFO: renamed from: Mn.F */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8975g(with = C7162o.class)
public class C5525F {
    public static final C5524E Companion = new C5524E();

    /* JADX INFO: renamed from: a */
    public final ZoneId f17977a;

    static {
        ZoneOffset UTC = ZoneOffset.UTC;
        AbstractC16544l.m18093f(UTC, "UTC");
        new C5549s(new C5527H(UTC));
    }

    public C5525F(ZoneId zoneId) {
        AbstractC16544l.m18094g(zoneId, "zoneId");
        this.f17977a = zoneId;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5525F) {
                if (AbstractC16544l.m18089b(this.f17977a, ((C5525F) obj).f17977a)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f17977a.hashCode();
    }

    public final String toString() {
        String string = this.f17977a.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }
}
