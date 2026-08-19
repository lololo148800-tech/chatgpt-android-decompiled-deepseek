package co;

import p523V9.AbstractC7877E4;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 co.K[], still in use, count: 1, list:
  (r4v3 co.K[]) from 0x003e: INVOKE (r4v3 co.K[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:64)
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
/* JADX INFO: renamed from: co.K */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC11810K {
    OBJ('{', '}'),
    f35799p0('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');


    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ C20007b f35803t0;

    /* JADX INFO: renamed from: Y */
    public final char f35804Y;

    /* JADX INFO: renamed from: Z */
    public final char f35805Z;

    public EnumC11810K(char c9, char c10) {
        super(str, i);
        this.f35804Y = c9;
        this.f35805Z = c10;
    }

    public static EnumC11810K valueOf(String str) {
        return (EnumC11810K) Enum.valueOf(EnumC11810K.class, str);
    }

    public static EnumC11810K[] values() {
        return (EnumC11810K[]) f35802s0.clone();
    }

    static {
        f35803t0 = AbstractC7877E4.m8156j(enumC11810KArr);
    }
}
