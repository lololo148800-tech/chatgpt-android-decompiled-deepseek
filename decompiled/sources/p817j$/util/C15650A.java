package p817j$.util;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j$.util.A */
/* JADX INFO: loaded from: classes4.dex */
public final class C15650A {

    /* JADX INFO: renamed from: c */
    private static final C15650A f48839c = new C15650A();

    /* JADX INFO: renamed from: a */
    private final boolean f48840a;

    /* JADX INFO: renamed from: b */
    private final int f48841b;

    private C15650A() {
        this.f48840a = false;
        this.f48841b = 0;
    }

    /* JADX INFO: renamed from: a */
    public static C15650A m17230a() {
        return f48839c;
    }

    private C15650A(int i10) {
        this.f48840a = true;
        this.f48841b = i10;
    }

    /* JADX INFO: renamed from: d */
    public static C15650A m17231d(int i10) {
        return new C15650A(i10);
    }

    /* JADX INFO: renamed from: b */
    public final int m17232b() {
        if (!this.f48840a) {
            throw new NoSuchElementException("No value present");
        }
        return this.f48841b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17233c() {
        return this.f48840a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15650A)) {
            return false;
        }
        C15650A c15650a = (C15650A) obj;
        boolean z6 = this.f48840a;
        if (z6 && c15650a.f48840a) {
            if (this.f48841b == c15650a.f48841b) {
                return true;
            }
        } else if (z6 == c15650a.f48840a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f48840a) {
            return this.f48841b;
        }
        return 0;
    }

    public final String toString() {
        if (this.f48840a) {
            return "OptionalInt[" + this.f48841b + "]";
        }
        return "OptionalInt.empty";
    }
}
