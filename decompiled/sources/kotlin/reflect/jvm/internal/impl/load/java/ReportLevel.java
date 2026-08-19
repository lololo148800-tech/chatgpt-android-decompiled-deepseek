package kotlin.reflect.jvm.internal.impl.load.java;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 kotlin.reflect.jvm.internal.impl.load.java.ReportLevel[], still in use, count: 1, list:
  (r4v3 kotlin.reflect.jvm.internal.impl.load.java.ReportLevel[]) from 0x002f: INVOKE (r4v3 kotlin.reflect.jvm.internal.impl.load.java.ReportLevel[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:48)
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
public final class ReportLevel {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");

    public static final Companion Companion;

    /* JADX INFO: renamed from: Y */
    public final String f51780Y;

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.reflect.jvm.internal.impl.load.java.ReportLevel$Companion] */
    static {
        AbstractC7877E4.m8156j(reportLevelArr);
        Companion = new Object(null) { // from class: kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.Companion
        };
    }

    public ReportLevel(String str) {
        super(str, i);
        this.f51780Y = str;
    }

    public static ReportLevel valueOf(String str) {
        return (ReportLevel) Enum.valueOf(ReportLevel.class, str);
    }

    public static ReportLevel[] values() {
        return (ReportLevel[]) f51779Z.clone();
    }

    public final String getDescription() {
        return this.f51780Y;
    }

    public final boolean isIgnore() {
        return this == IGNORE;
    }

    public final boolean isWarning() {
        return this == WARN;
    }
}
