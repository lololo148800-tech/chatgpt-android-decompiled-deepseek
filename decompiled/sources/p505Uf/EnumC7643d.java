package p505Uf;

import mm.EnumC17307j;
import p040Bd.C0961M1;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 Uf.d[], still in use, count: 1, list:
  (r2v3 Uf.d[]) from 0x001f: INVOKE (r2v3 Uf.d[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:32)
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
/* JADX INFO: renamed from: Uf.d */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C0961M1.class)
public final class EnumC7643d {
    /* JADX INFO: Fake field, exist only in values array */
    Jawbone("jawbone"),
    None("none'");


    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ C20007b f24158p0;

    /* JADX INFO: renamed from: Y */
    public final String f24159Y;
    public static final C7642c Companion = new C7642c();

    /* JADX INFO: renamed from: Z */
    public static final Object f24156Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C7641b.f24153Z);

    static {
        f24158p0 = AbstractC7877E4.m8156j(new EnumC7643d[]{r0, r1});
    }

    public EnumC7643d(String str) {
        super(str, i);
        this.f24159Y = str;
    }

    public static EnumC7643d valueOf(String str) {
        return (EnumC7643d) Enum.valueOf(EnumC7643d.class, str);
    }

    public static EnumC7643d[] values() {
        return (EnumC7643d[]) f24157o0.clone();
    }
}
