package p324Mn;

import kotlin.jvm.internal.AbstractC16544l;
import p463Sn.C7159l;
import p559Wn.InterfaceC8975g;
import p817j$.time.LocalTime;

/* JADX INFO: renamed from: Mn.D */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8975g(with = C7159l.class)
public final class C5523D implements Comparable<C5523D> {
    public static final C5522C Companion = new C5522C();

    /* JADX INFO: renamed from: Y */
    public final LocalTime f17976Y;

    static {
        LocalTime MIN = LocalTime.MIN;
        AbstractC16544l.m18093f(MIN, "MIN");
        new C5523D(MIN);
        LocalTime MAX = LocalTime.MAX;
        AbstractC16544l.m18093f(MAX, "MAX");
        new C5523D(MAX);
    }

    public C5523D(LocalTime value) {
        AbstractC16544l.m18094g(value, "value");
        this.f17976Y = value;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C5523D c5523d) {
        C5523D other = c5523d;
        AbstractC16544l.m18094g(other, "other");
        return this.f17976Y.compareTo(other.f17976Y);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5523D) {
                if (AbstractC16544l.m18089b(this.f17976Y, ((C5523D) obj).f17976Y)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f17976Y.hashCode();
    }

    public final String toString() {
        String string = this.f17976Y.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }
}
