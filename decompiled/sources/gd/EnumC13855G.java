package gd;

import java.util.List;
import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v4 gd.G[], still in use, count: 1, list:
  (r1v4 gd.G[]) from 0x001d: INVOKE (r1v4 gd.G[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:30)
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
/* JADX INFO: renamed from: gd.G */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC13855G {
    f43892Z;


    /* JADX INFO: renamed from: Y */
    public final List f43894Y;

    static {
        AbstractC7877E4.m8156j(enumC13855GArr);
    }

    public EnumC13855G() {
        super("DeviceId", 0);
        this.f43894Y = list;
    }

    public static EnumC13855G valueOf(String str) {
        return (EnumC13855G) Enum.valueOf(EnumC13855G.class, str);
    }

    public static EnumC13855G[] values() {
        return (EnumC13855G[]) f43893o0.clone();
    }
}
