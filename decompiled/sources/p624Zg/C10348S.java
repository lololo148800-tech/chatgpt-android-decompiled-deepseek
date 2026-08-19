package p624Zg;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Zg.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C10348S {

    /* JADX INFO: renamed from: a */
    public final String f30690a;

    public C10348S(String str) {
        this.f30690a = str;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10348S)) {
            return false;
        }
        String str = ((C10348S) obj).f30690a;
        String str2 = this.f30690a;
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
        String str = this.f30690a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
