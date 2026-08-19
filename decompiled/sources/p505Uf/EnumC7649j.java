package p505Uf;

import mm.EnumC17307j;
import p040Bd.C0961M1;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v4 Uf.j[], still in use, count: 1, list:
  (r2v4 Uf.j[]) from 0x0020: INVOKE (r2v4 Uf.j[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:34)
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
/* JADX INFO: renamed from: Uf.j */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C0961M1.class)
public final class EnumC7649j {
    /* JADX INFO: Fake field, exist only in values array */
    Notification("notification"),
    None(MMVKXkcLpuHFDi.QuaiwUTLiWSQxGw);


    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ C20007b f24167p0;

    /* JADX INFO: renamed from: Y */
    public final String f24168Y;
    public static final C7648i Companion = new C7648i();

    /* JADX INFO: renamed from: Z */
    public static final Object f24165Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C7641b.f24154o0);

    public EnumC7649j(String str) {
        super(str, i);
        this.f24168Y = str;
    }

    public static EnumC7649j valueOf(String str) {
        return (EnumC7649j) Enum.valueOf(EnumC7649j.class, str);
    }

    public static EnumC7649j[] values() {
        return (EnumC7649j[]) f24166o0.clone();
    }

    static {
        f24167p0 = AbstractC7877E4.m8156j(new EnumC7649j[]{r0, r1});
    }
}
