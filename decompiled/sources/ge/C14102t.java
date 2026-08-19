package ge;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ge.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C14102t implements InterfaceC14052T {

    /* JADX INFO: renamed from: a */
    public final List f44353a;

    public C14102t(List list) {
        this.f44353a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14102t) && AbstractC16544l.m18089b(this.f44353a, ((C14102t) obj).f44353a);
    }

    public final int hashCode() {
        List list = this.f44353a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
