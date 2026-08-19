package p1155zi;

import p523V9.AbstractC7877E4;
import p846k4.C16340i;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 zi.V0[], still in use, count: 1, list:
  (r2v3 zi.V0[]) from 0x0021: INVOKE (r2v3 zi.V0[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:34)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: zi.V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21968V0 {
    Inpainting("inpainting"),
    Transformation("transformation");


    /* JADX INFO: renamed from: Z */
    public static final C16340i f69543Z;

    /* JADX INFO: renamed from: Y */
    public final String f69547Y;

    static {
        AbstractC7877E4.m8156j(enumC21968V0Arr);
        f69543Z = new C16340i();
    }

    public EnumC21968V0(String str) {
        super(str, i);
        this.f69547Y = str;
    }

    public static EnumC21968V0 valueOf(String str) {
        return (EnumC21968V0) Enum.valueOf(EnumC21968V0.class, str);
    }

    public static EnumC21968V0[] values() {
        return (EnumC21968V0[]) f69546q0.clone();
    }
}
