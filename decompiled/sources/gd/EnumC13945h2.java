package gd;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 gd.h2[], still in use, count: 1, list:
  (r4v3 gd.h2[]) from 0x002b: INVOKE (r4v3 gd.h2[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:44)
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
/* JADX INFO: renamed from: gd.h2 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC13945h2 implements InterfaceC13921b2 {
    None("none"),
    /* JADX INFO: Fake field, exist only in values array */
    Prompt(SDPKeywords.PROMPT),
    /* JADX INFO: Fake field, exist only in values array */
    Direct("direct");


    /* JADX INFO: renamed from: Y */
    public final String f43997Y;

    static {
        AbstractC7877E4.m8156j(enumC13945h2Arr);
    }

    public EnumC13945h2(String str) {
        super(str, i);
        this.f43997Y = str;
    }

    public static EnumC13945h2 valueOf(String str) {
        return (EnumC13945h2) Enum.valueOf(EnumC13945h2.class, str);
    }

    public static EnumC13945h2[] values() {
        return (EnumC13945h2[]) f43996o0.clone();
    }
}
