package p1107xh;

import p523V9.AbstractC7877E4;
import p885m4.C17152b;
import p909nm.AbstractC17681o;
import p917o6.C17871x;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v2 xh.F[], still in use, count: 1, list:
  (r15v2 xh.F[]) from 0x0059: INVOKE (r15v2 xh.F[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:90)
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
/* JADX INFO: renamed from: xh.F */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21216F {
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE("PRIVATE"),
    /* JADX INFO: Fake field, exist only in values array */
    USER("USER"),
    /* JADX INFO: Fake field, exist only in values array */
    GROUP("GROUP"),
    /* JADX INFO: Fake field, exist only in values array */
    WORKSPACE_LINK("WORKSPACE_LINK"),
    /* JADX INFO: Fake field, exist only in values array */
    WORKSPACE("WORKSPACE"),
    /* JADX INFO: Fake field, exist only in values array */
    LINK("LINK"),
    /* JADX INFO: Fake field, exist only in values array */
    MARKETPLACE("MARKETPLACE"),
    UNKNOWN__("UNKNOWN__");


    /* JADX INFO: renamed from: Z */
    public static final C17152b f67489Z = new C17152b();

    /* JADX INFO: renamed from: o0 */
    public static final C17871x f67490o0 = new C17871x("GizmoSharingRecipient", AbstractC17681o.m19382k("PRIVATE", "USER", "GROUP", "WORKSPACE_LINK", "WORKSPACE", "LINK", "MARKETPLACE"));

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ C20007b f67493r0;

    /* JADX INFO: renamed from: Y */
    public final String f67494Y;

    static {
        f67493r0 = AbstractC7877E4.m8156j(new EnumC21216F[]{r0, r1, r3, r5, r7, r9, r11, r13});
    }

    public EnumC21216F(String str) {
        super(str, i);
        this.f67494Y = str;
    }

    public static EnumC21216F valueOf(String str) {
        return (EnumC21216F) Enum.valueOf(EnumC21216F.class, str);
    }

    public static EnumC21216F[] values() {
        return (EnumC21216F[]) f67492q0.clone();
    }
}
