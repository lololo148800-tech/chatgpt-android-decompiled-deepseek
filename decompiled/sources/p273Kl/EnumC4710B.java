package p273Kl;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v2 Kl.B[], still in use, count: 1, list:
  (r2v2 Kl.B[]) from 0x009f: INVOKE (r2v2 Kl.B[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:160)
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
/* JADX INFO: renamed from: Kl.B */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4710B {
    /* JADX INFO: Fake field, exist only in values array */
    v1(1),
    /* JADX INFO: Fake field, exist only in values array */
    v2(2),
    /* JADX INFO: Fake field, exist only in values array */
    v3(3),
    /* JADX INFO: Fake field, exist only in values array */
    v4(4),
    /* JADX INFO: Fake field, exist only in values array */
    v5(5),
    /* JADX INFO: Fake field, exist only in values array */
    v6(6),
    /* JADX INFO: Fake field, exist only in values array */
    v7(7),
    /* JADX INFO: Fake field, exist only in values array */
    v8(8),
    /* JADX INFO: Fake field, exist only in values array */
    v9(9),
    /* JADX INFO: Fake field, exist only in values array */
    v10(10),
    /* JADX INFO: Fake field, exist only in values array */
    v11(11),
    /* JADX INFO: Fake field, exist only in values array */
    v12(12),
    v13(13);


    /* JADX INFO: renamed from: Y */
    public final int f15309Y;

    static {
        AbstractC7877E4.m8156j(enumC4710BArr);
    }

    public EnumC4710B(int i10) {
        super(str, i);
        this.f15309Y = i10;
    }

    public static EnumC4710B valueOf(String str) {
        return (EnumC4710B) Enum.valueOf(EnumC4710B.class, str);
    }

    public static EnumC4710B[] values() {
        return (EnumC4710B[]) f15308o0.clone();
    }
}
