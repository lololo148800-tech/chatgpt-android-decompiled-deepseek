package p072Ci;

import p523V9.AbstractC7877E4;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 Ci.a[], still in use, count: 1, list:
  (r4v3 Ci.a[]) from 0x002b: INVOKE (r4v3 Ci.a[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:44)
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
/* JADX INFO: renamed from: Ci.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1696a {
    System("system"),
    /* JADX INFO: Fake field, exist only in values array */
    Light("light"),
    /* JADX INFO: Fake field, exist only in values array */
    Dark("dark");


    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ C20007b f4823p0;

    /* JADX INFO: renamed from: Y */
    public final String f4824Y;

    static {
        f4823p0 = AbstractC7877E4.m8156j(enumC1696aArr);
    }

    public EnumC1696a(String str) {
        super(str, i);
        this.f4824Y = str;
    }

    public static EnumC1696a valueOf(String str) {
        return (EnumC1696a) Enum.valueOf(EnumC1696a.class, str);
    }

    public static EnumC1696a[] values() {
        return (EnumC1696a[]) f4822o0.clone();
    }
}
