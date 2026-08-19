package p041Be;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 Be.V[], still in use, count: 1, list:
  (r2v3 Be.V[]) from 0x0021: INVOKE (r2v3 Be.V[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:34)
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
/* JADX INFO: renamed from: Be.V */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1228V {
    Regular("https://android.chat.openai.com/backend-api/"),
    Alternate("https://android.chat.openai.com/backend-alt/");


    /* JADX INFO: renamed from: Y */
    public final String f3240Y;

    static {
        AbstractC7877E4.m8156j(enumC1228VArr);
    }

    public EnumC1228V(String str) {
        super(str, i);
        this.f3240Y = str;
    }

    public static EnumC1228V valueOf(String str) {
        return (EnumC1228V) Enum.valueOf(EnumC1228V.class, str);
    }

    public static EnumC1228V[] values() {
        return (EnumC1228V[]) f3239p0.clone();
    }
}
