package p1155zi;

import com.openai.feature.onboarding.p683mU.YladLSetV;
import mm.EnumC17307j;
import p040Bd.C0961M1;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v4 zi.U[], still in use, count: 1, list:
  (r6v4 zi.U[]) from 0x003e: INVOKE (r6v4 zi.U[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:64)
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
/* JADX INFO: renamed from: zi.U */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C0961M1.class)
public final class EnumC21964U {
    Unknown("unknown"),
    Send("send"),
    GizmoTag("gizmo_tag"),
    FileUpload(YladLSetV.KkprSEHu);


    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ C20007b f69532s0;

    /* JADX INFO: renamed from: Y */
    public final String f69533Y;
    public static final C21961T Companion = new C21961T();

    /* JADX INFO: renamed from: Z */
    public static final Object f69527Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C21982a.f69595p0);

    public EnumC21964U(String str) {
        super(str, i);
        this.f69533Y = str;
    }

    public static EnumC21964U valueOf(String str) {
        return (EnumC21964U) Enum.valueOf(EnumC21964U.class, str);
    }

    public static EnumC21964U[] values() {
        return (EnumC21964U[]) f69531r0.clone();
    }

    static {
        f69532s0 = AbstractC7877E4.m8156j(new EnumC21964U[]{r0, r1, r2, r4});
    }
}
