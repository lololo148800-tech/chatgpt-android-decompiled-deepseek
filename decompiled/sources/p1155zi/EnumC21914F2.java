package p1155zi;

import mm.EnumC17307j;
import p040Bd.C0961M1;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v3 zi.F2[], still in use, count: 1, list:
  (r8v3 zi.F2[]) from 0x0044: INVOKE (r8v3 zi.F2[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:70)
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
/* JADX INFO: renamed from: zi.F2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C0961M1.class)
public final class EnumC21914F2 {
    Ok("ok"),
    /* JADX INFO: Fake field, exist only in values array */
    NewChat("new_chat"),
    /* JADX INFO: Fake field, exist only in values array */
    EF30("switch_to_standard"),
    /* JADX INFO: Fake field, exist only in values array */
    UpgradeToPlus("upgrade_to_plus"),
    /* JADX INFO: Fake field, exist only in values array */
    UpgradeToPro("upgrade_to_pro");


    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ C20007b f69466p0;

    /* JADX INFO: renamed from: Y */
    public final String f69467Y;
    public static final C21910E2 Companion = new C21910E2();

    /* JADX INFO: renamed from: Z */
    public static final Object f69464Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C21982a.f69590D0);

    public EnumC21914F2(String str) {
        super(str, i);
        this.f69467Y = str;
    }

    public static EnumC21914F2 valueOf(String str) {
        return (EnumC21914F2) Enum.valueOf(EnumC21914F2.class, str);
    }

    public static EnumC21914F2[] values() {
        return (EnumC21914F2[]) f69465o0.clone();
    }

    static {
        f69466p0 = AbstractC7877E4.m8156j(new EnumC21914F2[]{r0, new EnumC21914F2("new_chat"), new EnumC21914F2("switch_to_standard"), new EnumC21914F2("upgrade_to_plus"), new EnumC21914F2("upgrade_to_pro")});
    }
}
