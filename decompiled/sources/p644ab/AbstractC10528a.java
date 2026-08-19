package p644ab;

/* JADX INFO: renamed from: ab.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10528a implements InterfaceC10533f {
    /* JADX INFO: renamed from: a */
    public abstract boolean mo10977a(char c9);

    @Override // p644ab.InterfaceC10533f
    public final boolean apply(Object obj) {
        return mo10977a(((Character) obj).charValue());
    }
}
