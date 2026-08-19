package kotlin.reflect.jvm.internal.impl.types;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v2 kotlin.reflect.jvm.internal.impl.types.Variance[], still in use, count: 1, list:
  (r6v2 kotlin.reflect.jvm.internal.impl.types.Variance[]) from 0x002f: INVOKE (r6v2 kotlin.reflect.jvm.internal.impl.types.Variance[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:48)
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
/* JADX INFO: loaded from: classes2.dex */
public final class Variance {
    INVARIANT("", true),
    IN_VARIANCE("in", false),
    OUT_VARIANCE("out", true);


    /* JADX INFO: renamed from: Y */
    public final String f53219Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f53220Z;

    static {
        AbstractC7877E4.m8156j(varianceArr);
    }

    public Variance(String str, boolean z6) {
        super(str, i);
        this.f53219Y = str;
        this.f53220Z = z6;
    }

    public static Variance valueOf(String str) {
        return (Variance) Enum.valueOf(Variance.class, str);
    }

    public static Variance[] values() {
        return (Variance[]) f53218o0.clone();
    }

    public final boolean getAllowsOutPosition() {
        return this.f53220Z;
    }

    public final String getLabel() {
        return this.f53219Y;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f53219Y;
    }
}
