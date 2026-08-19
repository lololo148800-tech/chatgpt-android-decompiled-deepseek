package p1155zi;

import p523V9.AbstractC7877E4;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v3 zi.k1[], still in use, count: 1, list:
  (r10v3 zi.k1[]) from 0x0051: INVOKE (r10v3 zi.k1[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:82)
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
/* JADX INFO: renamed from: zi.k1 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC22024k1 {
    /* JADX INFO: Fake field, exist only in values array */
    UNSUPPORTED_ATTACHMENT("unsupported_attachment"),
    /* JADX INFO: Fake field, exist only in values array */
    UNSUPPORTED_AUDIO("unsupported_audio"),
    /* JADX INFO: Fake field, exist only in values array */
    UNSUPPORTED_IMAGE("unsupported_image"),
    /* JADX INFO: Fake field, exist only in values array */
    UNSUPPORTED_TOOL_USE("unsupported_tool_use"),
    UNSUPPORTED_GIZMO("unsupported_gizmo"),
    UNKNOWN("unknown");


    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ C20007b f69670q0;

    /* JADX INFO: renamed from: Y */
    public final String f69671Y;

    static {
        f69670q0 = AbstractC7877E4.m8156j(enumC22024k1Arr);
    }

    public EnumC22024k1(String str) {
        super(str, i);
        this.f69671Y = str;
    }

    public static EnumC22024k1 valueOf(String str) {
        return (EnumC22024k1) Enum.valueOf(EnumC22024k1.class, str);
    }

    public static EnumC22024k1[] values() {
        return (EnumC22024k1[]) f69669p0.clone();
    }
}
