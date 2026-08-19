package p172Gi;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v3 Gi.a[], still in use, count: 1, list:
  (r12v3 Gi.a[]) from 0x0067: INVOKE (r12v3 Gi.a[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:104)
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
/* JADX INFO: renamed from: Gi.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3068a {
    UserRequest("userRequest"),
    AppBackgrounded("appBackgrounded"),
    LimitReached("limitReached"),
    Reconnect("reconnect"),
    ModelHangUp("modelHangUp"),
    ToolHangUp("toolHangUp"),
    RecreateSession("recreateSession");


    /* JADX INFO: renamed from: Y */
    public final String f9255Y;

    static {
        AbstractC7877E4.m8156j(enumC3068aArr);
    }

    public EnumC3068a(String str) {
        super(str, i);
        this.f9255Y = str;
    }

    public static EnumC3068a valueOf(String str) {
        return (EnumC3068a) Enum.valueOf(EnumC3068a.class, str);
    }

    public static EnumC3068a[] values() {
        return (EnumC3068a[]) f9254u0.clone();
    }
}
