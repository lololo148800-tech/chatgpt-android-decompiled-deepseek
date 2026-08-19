package p072Ci;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC7877E4;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v4 Ci.g[], still in use, count: 1, list:
  (r7v4 Ci.g[]) from 0x0091: INVOKE (r7v4 Ci.g[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:146)
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
/* JADX INFO: renamed from: Ci.g */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1702g {
    MemoryOnboarding("oai/apps/hasSeenMemoryOnboarding", C1701f.f4848p0, C1700e.f4841q0),
    MemoryInSearch("oai/apps/hasSeenMemoryInSearch", C1701f.f4849q0, C1700e.f4842r0),
    TemporaryChatOnboarding("oai/apps/hasSeenTemporaryChatOnboarding", C1701f.f4850r0, C1700e.f4843s0),
    DalleOperatioOnboarding("oai/apps/hasSeenDalleEditingOnboarding", C1701f.f4851s0, C1700e.f4844t0),
    AdvancedVoice("oai/apps/hasSeenAdvancedVoice/2024-09-24", C1701f.f4852t0, C1700e.f4838Z),
    AdvancedVoiceVideo("oai/apps/hasSeenStardustOnboarding", C1701f.f4846Z, C1700e.f4839o0),
    StrawSelection("oai/apps/hasSeenStrawSelection", C1701f.f4847o0, C1700e.f4840p0);


    /* JADX INFO: renamed from: x0 */
    public static final /* synthetic */ C20007b f4862x0;

    /* JADX INFO: renamed from: Y */
    public final String f4863Y;

    /* JADX INFO: renamed from: Z */
    public final AbstractC16546n f4864Z;

    /* JADX INFO: renamed from: o0 */
    public final AbstractC16546n f4865o0;

    static {
        f4862x0 = AbstractC7877E4.m8156j(enumC1702gArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EnumC1702g(String str, InterfaceC1436k interfaceC1436k, InterfaceC1439n interfaceC1439n) {
        super(str, i);
        this.f4863Y = str;
        this.f4864Z = (AbstractC16546n) interfaceC1436k;
        this.f4865o0 = (AbstractC16546n) interfaceC1439n;
    }

    public static EnumC1702g valueOf(String str) {
        return (EnumC1702g) Enum.valueOf(EnumC1702g.class, str);
    }

    public static EnumC1702g[] values() {
        return (EnumC1702g[]) f4861w0.clone();
    }
}
