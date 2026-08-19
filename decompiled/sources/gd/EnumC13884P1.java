package gd;

import p174Gk.uSfJ.HpucjswO;
import p523V9.AbstractC7877E4;
import sj.hJY.CsqksqyPE;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v3 gd.P1[], still in use, count: 1, list:
  (r14v3 gd.P1[]) from 0x007a: INVOKE (r14v3 gd.P1[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:123)
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
/* JADX INFO: renamed from: gd.P1 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC13884P1 {
    GrowthByUser(HpucjswO.IlcEkUPswr),
    GrowthByUser2("android_growth_by_user_2"),
    GrowthByUser3(CsqksqyPE.vGTBdcwvulDJScW),
    GrowthByDevice("android_growth_by_device"),
    GrowthByDevice2("android_growth_by_device_2"),
    Login("chatgpt_login_signup_layer"),
    AndroidVoice("android_voice"),
    Voice("chatgpt_voice");


    /* JADX INFO: renamed from: Y */
    public final String f43932Y;

    public EnumC13884P1(String str) {
        super(str, i);
        this.f43932Y = str;
    }

    public static EnumC13884P1 valueOf(String str) {
        return (EnumC13884P1) Enum.valueOf(EnumC13884P1.class, str);
    }

    public static EnumC13884P1[] values() {
        return (EnumC13884P1[]) f43931v0.clone();
    }

    static {
        AbstractC7877E4.m8156j(enumC13884P1Arr);
    }
}
