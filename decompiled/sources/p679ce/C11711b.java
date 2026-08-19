package p679ce;

/* JADX INFO: renamed from: ce.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C11711b extends AbstractC11715f {

    /* JADX INFO: renamed from: a */
    public final EnumC11710a f35526a;

    public C11711b(EnumC11710a enumC11710a) {
        this.f35526a = enumC11710a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11711b) && this.f35526a == ((C11711b) obj).f35526a;
    }

    public final int hashCode() {
        return this.f35526a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
