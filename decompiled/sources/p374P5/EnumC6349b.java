package p374P5;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v2 P5.b[], still in use, count: 1, list:
  (r7v2 P5.b[]) from 0x002f: INVOKE (r7v2 P5.b[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:48)
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
/* JADX INFO: renamed from: P5.b */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6349b {
    f20614o0(true, true),
    /* JADX INFO: Fake field, exist only in values array */
    EF15(true, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF23(false, true),
    /* JADX INFO: Fake field, exist only in values array */
    EF31(false, false);


    /* JADX INFO: renamed from: Y */
    public final boolean f20616Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f20617Z;

    static {
        AbstractC7877E4.m8156j(enumC6349bArr);
    }

    public EnumC6349b(boolean z6, boolean z10) {
        super(str, i);
        this.f20616Y = z6;
        this.f20617Z = z10;
    }

    public static EnumC6349b valueOf(String str) {
        return (EnumC6349b) Enum.valueOf(EnumC6349b.class, str);
    }

    public static EnumC6349b[] values() {
        return (EnumC6349b[]) f20615p0.clone();
    }
}
