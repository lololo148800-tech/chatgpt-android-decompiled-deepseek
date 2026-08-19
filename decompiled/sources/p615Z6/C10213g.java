package p615Z6;

/* JADX INFO: renamed from: Z6.g */
/* JADX INFO: loaded from: classes.dex */
public final class C10213g implements InterfaceC10209e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30334a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p615Z6.InterfaceC10209e
    /* JADX INFO: renamed from: a */
    public final boolean mo10789a(AbstractC10199Y abstractC10199Y) {
        switch (this.f30334a) {
            case 0:
                return !(abstractC10199Y instanceof InterfaceC10197W) || ((InterfaceC10197W) abstractC10199Y).getChildren().size() == 0;
            case 1:
                return abstractC10199Y.f30315b == null;
            default:
                return false;
        }
    }

    public final String toString() {
        switch (this.f30334a) {
            case 0:
                return "empty";
            case 1:
                return "root";
            default:
                return "target";
        }
    }
}
