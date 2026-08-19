package p838jj;

/* JADX INFO: renamed from: jj.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C16226g extends AbstractC16228i {

    /* JADX INFO: renamed from: a */
    public final EnumC16225f f50342a;

    public C16226g(EnumC16225f enumC16225f) {
        this.f50342a = enumC16225f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16226g) && this.f50342a == ((C16226g) obj).f50342a;
    }

    public final int hashCode() {
        return this.f50342a.hashCode();
    }

    public final String toString() {
        return "ButtonClicked(button=" + this.f50342a + ')';
    }
}
