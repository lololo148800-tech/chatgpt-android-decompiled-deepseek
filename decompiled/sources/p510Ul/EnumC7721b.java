package p510Ul;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v3 Ul.b[], still in use, count: 1, list:
  (r12v3 Ul.b[]) from 0x0067: INVOKE (r12v3 Ul.b[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:104)
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
/* JADX INFO: renamed from: Ul.b */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC7721b {
    WIFI("wifi"),
    ETHERNET("ethernet"),
    CELLULAR("cellular"),
    VPN("vpn"),
    BLUETOOTH("bluetooth"),
    OTHER("other"),
    UNKNOWN("");


    /* JADX INFO: renamed from: Y */
    public final String f24337Y;

    static {
        AbstractC7877E4.m8156j(enumC7721bArr);
    }

    public EnumC7721b(String str) {
        super(str, i);
        this.f24337Y = str;
    }

    public static EnumC7721b valueOf(String str) {
        return (EnumC7721b) Enum.valueOf(EnumC7721b.class, str);
    }

    public static EnumC7721b[] values() {
        return (EnumC7721b[]) f24336u0.clone();
    }
}
