package p964qe;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: qe.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C18690c implements InterfaceC18692e {

    /* JADX INFO: renamed from: a */
    public final Integer f59506a;

    public C18690c(Integer num) {
        this.f59506a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18690c) && AbstractC16544l.m18089b(this.f59506a, ((C18690c) obj).f59506a);
    }

    public final int hashCode() {
        Integer num = this.f59506a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
