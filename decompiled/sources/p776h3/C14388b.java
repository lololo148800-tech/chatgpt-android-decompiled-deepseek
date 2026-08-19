package p776h3;

/* JADX INFO: renamed from: h3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C14388b {

    /* JADX INFO: renamed from: a */
    public final int f45115a;

    public /* synthetic */ C14388b(int i10) {
        this.f45115a = i10;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C14388b m15892a(int i10) {
        return new C14388b(i10);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m15893b(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: c */
    public static String m15894c(int i10) {
        return "Vertical(value=" + i10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14388b) {
            return this.f45115a == ((C14388b) obj).f45115a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f45115a;
    }

    public final String toString() {
        return m15894c(this.f45115a);
    }
}
