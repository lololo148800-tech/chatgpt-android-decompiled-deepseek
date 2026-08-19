package p1126yd;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: yd.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C21407B implements InterfaceC21409C {

    /* JADX INFO: renamed from: a */
    public final Map f67973a;

    public C21407B(Map map) {
        this.f67973a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21407B) && AbstractC16544l.m18089b(this.f67973a, ((C21407B) obj).f67973a);
    }

    public final int hashCode() {
        return this.f67973a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
