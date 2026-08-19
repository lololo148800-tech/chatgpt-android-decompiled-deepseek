package p1107xh;

import p523V9.AbstractC7877E4;
import p849k7.C16361n;
import p909nm.AbstractC17681o;
import p917o6.C17871x;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v2 xh.O[], still in use, count: 1, list:
  (r10v2 xh.O[]) from 0x002f: INVOKE (r10v2 xh.O[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:48)
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
/* JADX INFO: renamed from: xh.O */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21225O {
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_HTTP("SERVICE_HTTP"),
    /* JADX INFO: Fake field, exist only in values array */
    OAUTH("OAUTH"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("NONE"),
    UNKNOWN__("UNKNOWN__");


    /* JADX INFO: renamed from: Z */
    public static final C16361n f67518Z = new C16361n();

    /* JADX INFO: renamed from: o0 */
    public static final C17871x f67519o0 = new C17871x("GizmoToolMetadataAuthType", AbstractC17681o.m19382k("SERVICE_HTTP", "OAUTH", "NONE"));

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ C20007b f67522r0;

    /* JADX INFO: renamed from: Y */
    public final String f67523Y;

    static {
        f67522r0 = AbstractC7877E4.m8156j(new EnumC21225O[]{r0, r3, r6, r9});
    }

    public EnumC21225O(String str) {
        super(str, i);
        this.f67523Y = str;
    }

    public static EnumC21225O valueOf(String str) {
        return (EnumC21225O) Enum.valueOf(EnumC21225O.class, str);
    }

    public static EnumC21225O[] values() {
        return (EnumC21225O[]) f67521q0.clone();
    }
}
