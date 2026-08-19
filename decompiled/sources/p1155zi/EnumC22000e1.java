package p1155zi;

import p523V9.AbstractC7877E4;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 zi.e1[], still in use, count: 1, list:
  (r4v3 zi.e1[]) from 0x0029: INVOKE (r4v3 zi.e1[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:42)
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
/* JADX INFO: renamed from: zi.e1 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC22000e1 {
    /* JADX INFO: Fake field, exist only in values array */
    UnexpectedSsoLogin("unexpected_sso_login"),
    /* JADX INFO: Fake field, exist only in values array */
    SsoMismatch("sso_mismatch"),
    /* JADX INFO: Fake field, exist only in values array */
    RequireSsoLogin("require_sso_login");


    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ C20007b f69633o0;

    /* JADX INFO: renamed from: Y */
    public final String f69634Y;

    static {
        f69633o0 = AbstractC7877E4.m8156j(enumC22000e1Arr);
    }

    public EnumC22000e1(String str) {
        super(str, i);
        this.f69634Y = str;
    }

    public static EnumC22000e1 valueOf(String str) {
        return (EnumC22000e1) Enum.valueOf(EnumC22000e1.class, str);
    }

    public static EnumC22000e1[] values() {
        return (EnumC22000e1[]) f69632Z.clone();
    }
}
