package p521V6;

/* JADX INFO: renamed from: V6.o */
/* JADX INFO: loaded from: classes.dex */
public final class C7822o extends AbstractC7801D {
    public C7822o() {
        super("ID token is required but missing");
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return C7822o.class.getSuperclass().getName() + ": " + getMessage();
    }
}
