package p522V8;

/* JADX INFO: renamed from: V8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7835b {

    /* JADX INFO: renamed from: a */
    public final Integer f24729a;

    public C7835b(Integer num) {
        this.f24729a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7835b)) {
            return false;
        }
        C7835b c7835b = (C7835b) obj;
        Integer num = this.f24729a;
        if (num == null) {
            return c7835b.f24729a == null;
        }
        return num.equals(c7835b.f24729a);
    }

    public final int hashCode() {
        Integer num = this.f24729a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f24729a + "}";
    }
}
