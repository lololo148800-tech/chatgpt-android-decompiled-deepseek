package p749fd;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v3 fd.b[], still in use, count: 1, list:
  (r6v3 fd.b[]) from 0x002f: INVOKE (r6v3 fd.b[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:48)
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
/* JADX INFO: renamed from: fd.b */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC13617b {
    f43009Z(0),
    f43010o0(1),
    f43011p0(2);


    /* JADX INFO: renamed from: Y */
    public final long f43013Y;

    static {
        AbstractC7877E4.m8156j(enumC13617bArr);
    }

    public EnumC13617b(int i10) {
        super(str, i10);
        this.f43013Y = j;
    }

    public static EnumC13617b valueOf(String str) {
        return (EnumC13617b) Enum.valueOf(EnumC13617b.class, str);
    }

    public static EnumC13617b[] values() {
        return (EnumC13617b[]) f43012q0.clone();
    }
}
