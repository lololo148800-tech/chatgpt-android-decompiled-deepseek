package p990rg;

import mm.EnumC17307j;
import p040Bd.C0961M1;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v13 rg.c[], still in use, count: 1, list:
  (r7v13 rg.c[]) from 0x014b: INVOKE (r7v13 rg.c[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:332)
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
/* JADX INFO: renamed from: rg.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C0961M1.class)
public final class EnumC18976c {
    /* JADX INFO: Fake field, exist only in values array */
    Code("code"),
    /* JADX INFO: Fake field, exist only in values array */
    CurrentEvent("current-event"),
    Dalle("dalle"),
    /* JADX INFO: Fake field, exist only in values array */
    DataVis("data-vis"),
    /* JADX INFO: Fake field, exist only in values array */
    Genius("genius"),
    /* JADX INFO: Fake field, exist only in values array */
    Idea("idea"),
    /* JADX INFO: Fake field, exist only in values array */
    Local("local"),
    Math("math"),
    /* JADX INFO: Fake field, exist only in values array */
    Misc("misc"),
    /* JADX INFO: Fake field, exist only in values array */
    News("news"),
    /* JADX INFO: Fake field, exist only in values array */
    RankOrRate("rank-or-rate"),
    /* JADX INFO: Fake field, exist only in values array */
    ReadOrAnalyze("read-or-analyze"),
    /* JADX INFO: Fake field, exist only in values array */
    Browse("shop"),
    TeachOrExplain("teach-or-explain"),
    Travel("travel"),
    Weather("weather"),
    /* JADX INFO: Fake field, exist only in values array */
    FileUploadDocument("write"),
    /* JADX INFO: Fake field, exist only in values array */
    Vision("vision"),
    /* JADX INFO: Fake field, exist only in values array */
    Browse("browse"),
    /* JADX INFO: Fake field, exist only in values array */
    FileUploadDocument("file-upload-document"),
    Unknown("unknown");


    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ C20007b f60536u0;

    /* JADX INFO: renamed from: Y */
    public final String f60537Y;
    public static final C18975b Companion = new C18975b();

    /* JADX INFO: renamed from: Z */
    public static final Object f60529Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C18974a.f60528Y);

    static {
        f60536u0 = AbstractC7877E4.m8156j(new EnumC18976c[]{r0, r1, r2, r4, r6, r8, r10, r12, r14, r13, r11, r9, r7, r5, r3, r7, r5, r3, r7, r5, r3});
    }

    public EnumC18976c(String str) {
        super(str, i);
        this.f60537Y = str;
    }

    public static EnumC18976c valueOf(String str) {
        return (EnumC18976c) Enum.valueOf(EnumC18976c.class, str);
    }

    public static EnumC18976c[] values() {
        return (EnumC18976c[]) f60535t0.clone();
    }
}
