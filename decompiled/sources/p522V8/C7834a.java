package p522V8;

/* JADX INFO: renamed from: V8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7834a {

    /* JADX INFO: renamed from: a */
    public final Object f24726a;

    /* JADX INFO: renamed from: b */
    public final EnumC7837d f24727b;

    /* JADX INFO: renamed from: c */
    public final C7835b f24728c;

    public C7834a(Object obj, EnumC7837d enumC7837d, C7835b c7835b) {
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f24726a = obj;
        this.f24727b = enumC7837d;
        this.f24728c = c7835b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7834a)) {
            return false;
        }
        C7834a c7834a = (C7834a) obj;
        c7834a.getClass();
        if (this.f24726a.equals(c7834a.f24726a) && this.f24727b.equals(c7834a.f24727b)) {
            C7835b c7835b = c7834a.f24728c;
            C7835b c7835b2 = this.f24728c;
            if (c7835b2 == null) {
                if (c7835b == null) {
                    return true;
                }
            } else if (c7835b2.equals(c7835b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.f24726a.hashCode()) * 1000003) ^ this.f24727b.hashCode()) * 1000003;
        C7835b c7835b = this.f24728c;
        return (c7835b == null ? 0 : c7835b.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f24726a + ", priority=" + this.f24727b + ", productData=" + this.f24728c + "}";
    }
}
