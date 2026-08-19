package p666bl;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 bl.e[], still in use, count: 1, list:
  (r4v2 bl.e[]) from 0x0056: INVOKE (r4v2 bl.e[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:87)
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
/* JADX INFO: renamed from: bl.e */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC11489e {
    /* JADX INFO: Fake field, exist only in values array */
    EF6(true, true, true),
    f34773p0(true, true, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(true, false, true),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(true, false, false),
    f34774q0(false, false, false);


    /* JADX INFO: renamed from: Y */
    public final boolean f34776Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f34777Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f34778o0;

    static {
        AbstractC7877E4.m8156j(enumC11489eArr);
    }

    public EnumC11489e(boolean z6, boolean z10, boolean z11) {
        super(str, i);
        this.f34776Y = z6;
        this.f34777Z = z10;
        this.f34778o0 = z11;
    }

    public static EnumC11489e valueOf(String str) {
        return (EnumC11489e) Enum.valueOf(EnumC11489e.class, str);
    }

    public static EnumC11489e[] values() {
        return (EnumC11489e[]) f34775r0.clone();
    }
}
