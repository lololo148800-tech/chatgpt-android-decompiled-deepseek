package p1155zi;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 zi.E1[], still in use, count: 1, list:
  (r2v3 zi.E1[]) from 0x0021: INVOKE (r2v3 zi.E1[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:34)
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
/* JADX INFO: renamed from: zi.E1 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21909E1 {
    Plus("oai.chatgpt.plus"),
    Pro("oai.chatgpt.pro");


    /* JADX INFO: renamed from: Y */
    public final String f69459Y;

    static {
        AbstractC7877E4.m8156j(enumC21909E1Arr);
    }

    public EnumC21909E1(String str) {
        super(str, i);
        this.f69459Y = str;
    }

    public static EnumC21909E1 valueOf(String str) {
        return (EnumC21909E1) Enum.valueOf(EnumC21909E1.class, str);
    }

    public static EnumC21909E1[] values() {
        return (EnumC21909E1[]) f69458p0.clone();
    }
}
