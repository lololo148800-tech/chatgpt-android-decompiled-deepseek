package p1107xh;

import p523V9.AbstractC7877E4;
import p867l8.C16831c;
import p909nm.AbstractC17681o;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v2 xh.o[], still in use, count: 1, list:
  (r7v2 xh.o[]) from 0x0025: INVOKE (r7v2 xh.o[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:38)
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
/* JADX INFO: renamed from: xh.o */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21252o {
    /* JADX INFO: Fake field, exist only in values array */
    GLOBAL("GLOBAL"),
    /* JADX INFO: Fake field, exist only in values array */
    EN("EN"),
    UNKNOWN__("UNKNOWN__");


    /* JADX INFO: renamed from: Z */
    public static final C16831c f67612Z = new C16831c();

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ C20007b f67615q0;

    /* JADX INFO: renamed from: Y */
    public final String f67616Y;

    static {
        f67615q0 = AbstractC7877E4.m8156j(new EnumC21252o[]{r0, r3, r6});
        AbstractC17681o.m19382k("GLOBAL", "EN");
    }

    public EnumC21252o(String str) {
        super(str, i);
        this.f67616Y = str;
    }

    public static EnumC21252o valueOf(String str) {
        return (EnumC21252o) Enum.valueOf(EnumC21252o.class, str);
    }

    public static EnumC21252o[] values() {
        return (EnumC21252o[]) f67614p0.clone();
    }
}
