package p521V6;

/* JADX INFO: renamed from: V6.E */
/* JADX INFO: loaded from: classes.dex */
public final class C7802E extends AbstractC7801D {
    public C7802E(Exception exc) {
        super("ID token could not be decoded", exc);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return C7802E.class.getSuperclass().getName() + ": " + getMessage();
    }
}
