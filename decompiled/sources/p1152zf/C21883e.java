package p1152zf;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;

/* JADX INFO: renamed from: zf.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C21883e implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final String f69385a = null;

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21883e)) {
            return false;
        }
        String str = ((C21883e) obj).f69385a;
        String str2 = this.f69385a;
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
        String str = this.f69385a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
