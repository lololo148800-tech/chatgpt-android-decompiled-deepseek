package kotlin.reflect.jvm.internal.impl.types.model;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 kotlin.reflect.jvm.internal.impl.types.model.TypeVariance[], still in use, count: 1, list:
  (r4v3 kotlin.reflect.jvm.internal.impl.types.model.TypeVariance[]) from 0x002f: INVOKE (r4v3 kotlin.reflect.jvm.internal.impl.types.model.TypeVariance[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:48)
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
public final class TypeVariance {
    IN("in"),
    OUT("out"),
    INV("");


    /* JADX INFO: renamed from: Y */
    public final String f53277Y;

    static {
        AbstractC7877E4.m8156j(typeVarianceArr);
    }

    public TypeVariance(String str) {
        super(str, i);
        this.f53277Y = str;
    }

    public static TypeVariance valueOf(String str) {
        return (TypeVariance) Enum.valueOf(TypeVariance.class, str);
    }

    public static TypeVariance[] values() {
        return (TypeVariance[]) f53276Z.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f53277Y;
    }
}
