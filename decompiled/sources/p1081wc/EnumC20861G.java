package p1081wc;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 wc.G[], still in use, count: 1, list:
  (r4v3 wc.G[]) from 0x002f: INVOKE (r4v3 wc.G[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:48)
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
/* JADX INFO: renamed from: wc.G */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC20861G {
    FrontCamera("front_camera"),
    BackCamera("back_camera"),
    Upload("upload");


    /* JADX INFO: renamed from: Y */
    public final String f66394Y;

    static {
        AbstractC7877E4.m8156j(enumC20861GArr);
    }

    public EnumC20861G(String str) {
        super(str, i);
        this.f66394Y = str;
    }

    public static EnumC20861G valueOf(String str) {
        return (EnumC20861G) Enum.valueOf(EnumC20861G.class, str);
    }

    public static EnumC20861G[] values() {
        return (EnumC20861G[]) f66393q0.clone();
    }
}
