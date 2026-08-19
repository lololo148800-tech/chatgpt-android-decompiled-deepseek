package p1155zi;

import p379Pb.LVf.efyhmdM;
import p523V9.AbstractC7877E4;
import p885m4.C17155e;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v3 zi.l[], still in use, count: 1, list:
  (r14v3 zi.l[]) from 0x0079: INVOKE (r14v3 zi.l[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:123)
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
/* JADX INFO: renamed from: zi.l */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC22026l {
    DisableUpgradeUi("disable_upgrade_ui"),
    ChatPreferencesAvailable("chat_preferences_available"),
    AdvancedVoice("voice_advanced_ga"),
    MemoryAvailable("sunshine_available"),
    MemoryInSearch("memory_in_search"),
    NoAuthTrainingEnabled("no_auth_training_enabled_by_default"),
    SearchTool(efyhmdM.psUwsvM),
    WorkspaceShareLinks("workspace_share_links");


    /* JADX INFO: renamed from: Z */
    public static final C17155e f69677Z = new C17155e();

    /* JADX INFO: renamed from: x0 */
    public static final /* synthetic */ C20007b f69687x0;

    /* JADX INFO: renamed from: Y */
    public final String f69688Y;

    public EnumC22026l(String str) {
        super(str, i);
        this.f69688Y = str;
    }

    public static EnumC22026l valueOf(String str) {
        return (EnumC22026l) Enum.valueOf(EnumC22026l.class, str);
    }

    public static EnumC22026l[] values() {
        return (EnumC22026l[]) f69686w0.clone();
    }

    static {
        f69687x0 = AbstractC7877E4.m8156j(new EnumC22026l[]{r0, r1, r2, r4, r6, r8, r10, r12});
    }
}
