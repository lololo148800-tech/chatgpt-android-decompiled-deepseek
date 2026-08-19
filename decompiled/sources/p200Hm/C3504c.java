package p200Hm;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Hm.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3504c extends AbstractC3502a {
    static {
        new C3504c((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3504c) {
            if (!isEmpty() || !((C3504c) obj).isEmpty()) {
                C3504c c3504c = (C3504c) obj;
                if (this.f10582Y != c3504c.f10582Y || this.f10583Z != c3504c.f10583Z) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f10582Y * 31) + this.f10583Z;
    }

    public final boolean isEmpty() {
        return AbstractC16544l.m18096i(this.f10582Y, this.f10583Z) > 0;
    }

    public final String toString() {
        return this.f10582Y + ".." + this.f10583Z;
    }
}
