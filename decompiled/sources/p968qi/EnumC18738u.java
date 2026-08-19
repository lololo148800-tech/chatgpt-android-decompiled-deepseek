package p968qi;

import com.openai.chatgpt.R;
import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v4 qi.u[], still in use, count: 1, list:
  (r3v4 qi.u[]) from 0x005f: INVOKE (r3v4 qi.u[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:96)
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
/* JADX INFO: renamed from: qi.u */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC18738u {
    Normal(new C18719b(R.color.spreadsheet_header_text, R.color.spreadsheet_cell_header_background), new C18719b(R.color.spreadsheet_text, R.color.spreadsheet_cell_background)),
    SelectedRowOrColumn(new C18719b(android.R.color.white, R.color.web_selection_blue), new C18719b(R.color.spreadsheet_cell_selected_text, R.color.spreadsheet_cell_background)),
    SelectedCell(new C18719b(R.color.spreadsheet_cell_selected_header_text, R.color.web_selection_blue), new C18719b(R.color.spreadsheet_text, R.color.spreadsheet_cell_background));


    /* JADX INFO: renamed from: Y */
    public final C18719b f59603Y;

    /* JADX INFO: renamed from: Z */
    public final C18719b f59604Z;

    /* JADX INFO: renamed from: o0 */
    public final int f59605o0;

    /* JADX INFO: renamed from: p0 */
    public final int f59606p0;

    /* JADX INFO: renamed from: q0 */
    public final float f59607q0;

    /* JADX INFO: renamed from: r0 */
    public final float f59608r0;

    static {
        AbstractC7877E4.m8156j(enumC18738uArr);
    }

    public EnumC18738u(C18719b c18719b, C18719b c18719b2) {
        super(str, i);
        this.f59603Y = c18719b;
        this.f59604Z = c18719b2;
        this.f59605o0 = R.color.spreadsheet_cell_border;
        this.f59606p0 = R.color.web_selection_blue;
        this.f59607q0 = (float) 0.25d;
        this.f59608r0 = (float) 1.5d;
    }

    public static EnumC18738u valueOf(String str) {
        return (EnumC18738u) Enum.valueOf(EnumC18738u.class, str);
    }

    public static EnumC18738u[] values() {
        return (EnumC18738u[]) f59602v0.clone();
    }
}
