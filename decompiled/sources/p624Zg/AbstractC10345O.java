package p624Zg;

/* JADX INFO: renamed from: Zg.O */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10345O extends Exception implements InterfaceC10347Q {

    /* JADX INFO: renamed from: Y */
    public final String f30686Y;

    /* JADX INFO: renamed from: Z */
    public final Throwable f30687Z;

    public AbstractC10345O(String str, Throwable th2) {
        this.f30686Y = str;
        this.f30687Z = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f30687Z;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f30686Y;
    }
}
