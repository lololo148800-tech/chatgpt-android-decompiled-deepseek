package p776h3;

/* JADX INFO: renamed from: h3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C14387a {

    /* JADX INFO: renamed from: a */
    public final int f45114a;

    public /* synthetic */ C14387a(int i10) {
        this.f45114a = i10;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C14387a m15889a(int i10) {
        return new C14387a(i10);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m15890b(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: c */
    public static String m15891c(int i10) {
        return "Horizontal(value=" + i10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14387a) {
            return this.f45114a == ((C14387a) obj).f45114a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f45114a;
    }

    public final String toString() {
        return m15891c(this.f45114a);
    }
}
