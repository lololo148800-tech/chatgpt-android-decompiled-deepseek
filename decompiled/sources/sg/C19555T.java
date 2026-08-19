package sg;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sg.T */
/* JADX INFO: loaded from: classes3.dex */
public final class C19555T implements InterfaceC19558W {

    /* JADX INFO: renamed from: a */
    public final String f62110a;

    public C19555T(String str) {
        this.f62110a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19555T) && AbstractC16544l.m18089b(this.f62110a, ((C19555T) obj).f62110a);
    }

    public final int hashCode() {
        String str = this.f62110a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
