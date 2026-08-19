package p017Af;

import com.openai.chatgpt.R;
import p523V9.AbstractC7877E4;
import p525Vb.C8258a;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 Af.e[], still in use, count: 1, list:
  (r4v2 Af.e[]) from 0x0063: INVOKE (r4v2 Af.e[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:100)
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
/* JADX INFO: renamed from: Af.e */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0474e {
    /* JADX INFO: Fake field, exist only in values array */
    GoogleDocs("https://docs.google.com/document", R.drawable.file_google_docs, false),
    /* JADX INFO: Fake field, exist only in values array */
    GoogleSlides("https://docs.google.com/presentation", R.drawable.file_google_slides, false),
    /* JADX INFO: Fake field, exist only in values array */
    GoogleSheets("https://docs.google.com/spreadsheets", R.drawable.file_google_sheets, false),
    /* JADX INFO: Fake field, exist only in values array */
    GoogleDrive("https://drive.google.com/", R.drawable.app_google_drive, false),
    Other(null, R.drawable.file_document, true);


    /* JADX INFO: renamed from: p0 */
    public static final C8258a f1538p0 = new C8258a();

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ C20007b f1541s0;

    /* JADX INFO: renamed from: Y */
    public final String f1542Y;

    /* JADX INFO: renamed from: Z */
    public final int f1543Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f1544o0;

    static {
        f1541s0 = AbstractC7877E4.m8156j(new EnumC0474e[]{r6, r0, r1, r2, r3});
    }

    public EnumC0474e(String str, int i10, boolean z6) {
        super(str, i);
        this.f1542Y = str;
        this.f1543Z = i10;
        this.f1544o0 = z6;
    }

    public static EnumC0474e valueOf(String str) {
        return (EnumC0474e) Enum.valueOf(EnumC0474e.class, str);
    }

    public static EnumC0474e[] values() {
        return (EnumC0474e[]) f1540r0.clone();
    }
}
