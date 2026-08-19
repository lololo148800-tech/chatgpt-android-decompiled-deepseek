package p449S9;

/* JADX INFO: renamed from: S9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7059b extends AbstractC7063d {

    /* JADX INFO: renamed from: Y */
    public static final C7059b f22536Y = new C7059b();

    @Override // p449S9.AbstractC7063d
    /* JADX INFO: renamed from: a */
    public final Object mo7470a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // p449S9.AbstractC7063d
    /* JADX INFO: renamed from: b */
    public final boolean mo7471b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
