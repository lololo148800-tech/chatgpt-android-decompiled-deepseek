package p926of;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: of.T */
/* JADX INFO: loaded from: classes3.dex */
public final class C18156T implements InterfaceC18159W {

    /* JADX INFO: renamed from: a */
    public final String f57907a;

    public C18156T(String str) {
        this.f57907a = str;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18156T)) {
            return false;
        }
        String str = ((C18156T) obj).f57907a;
        String str2 = this.f57907a;
        if (str2 == null) {
            if (str == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str2, str);
        }
        return zM18089b;
    }

    public final int hashCode() {
        String str = this.f57907a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
