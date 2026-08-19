package p1075w5;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v2 w5.b[], still in use, count: 1, list:
  (r7v2 w5.b[]) from 0x0031: INVOKE (r7v2 w5.b[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:50)
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
/* JADX INFO: renamed from: w5.b */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC20824b {
    f66156o0(true, true),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(true, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(false, true),
    f66157p0(false, false);


    /* JADX INFO: renamed from: Y */
    public final boolean f66159Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f66160Z;

    static {
        AbstractC7877E4.m8156j(enumC20824bArr);
    }

    public EnumC20824b(boolean z6, boolean z10) {
        super(str, i);
        this.f66159Y = z6;
        this.f66160Z = z10;
    }

    public static EnumC20824b valueOf(String str) {
        return (EnumC20824b) Enum.valueOf(EnumC20824b.class, str);
    }

    public static EnumC20824b[] values() {
        return (EnumC20824b[]) f66158q0.clone();
    }
}
