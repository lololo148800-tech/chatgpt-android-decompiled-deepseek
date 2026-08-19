package p705dd;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 dd.a[], still in use, count: 1, list:
  (r4v3 dd.a[]) from 0x002f: INVOKE (r4v3 dd.a[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:48)
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
/* JADX INFO: renamed from: dd.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC13068a {
    Short(10),
    Medium(40),
    Long(60);


    /* JADX INFO: renamed from: Y */
    public final int f41515Y;

    static {
        AbstractC7877E4.m8156j(enumC13068aArr);
    }

    public EnumC13068a(int i10) {
        super(str, i);
        this.f41515Y = i10;
    }

    public static EnumC13068a valueOf(String str) {
        return (EnumC13068a) Enum.valueOf(EnumC13068a.class, str);
    }

    public static EnumC13068a[] values() {
        return (EnumC13068a[]) f41514q0.clone();
    }
}
