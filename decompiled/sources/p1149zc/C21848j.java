package p1149zc;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: zc.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C21848j extends AbstractC21849k {

    /* JADX INFO: renamed from: Y */
    public final String f69314Y;

    public C21848j(String str) {
        this.f69314Y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21848j) && AbstractC16544l.m18089b(this.f69314Y, ((C21848j) obj).f69314Y);
    }

    public final int hashCode() {
        String str = this.f69314Y;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "█";
    }
}
