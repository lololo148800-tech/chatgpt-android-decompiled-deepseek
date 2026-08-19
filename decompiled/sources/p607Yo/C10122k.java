package p607Yo;

import android.gov.nist.core.Separators;
import java.util.regex.Pattern;
import p690cp.AbstractC12915a;
import p690cp.C12927m;
import p712dp.C13191g;
import p756fp.AbstractC13719a;
import p826j6.C16137F;

/* JADX INFO: renamed from: Yo.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C10122k extends AbstractC13719a {

    /* JADX INFO: renamed from: e */
    public static final Pattern[][] f29997e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style|textarea)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style|textarea)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(Separators.GREATER_THAN)}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|search|section|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* JADX INFO: renamed from: b */
    public final Pattern f29999b;

    /* JADX INFO: renamed from: a */
    public final C12927m f29998a = new C12927m();

    /* JADX INFO: renamed from: c */
    public boolean f30000c = false;

    /* JADX INFO: renamed from: d */
    public C16137F f30001d = new C16137F(6, (byte) 0);

    public C10122k(Pattern pattern) {
        this.f29999b = pattern;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: a */
    public final void mo7964a(C13191g c13191g) {
        C16137F c16137f = this.f30001d;
        int i10 = c16137f.f50063Z;
        StringBuilder sb2 = (StringBuilder) c16137f.f50064o0;
        if (i10 != 0) {
            sb2.append('\n');
        }
        CharSequence charSequence = c13191g.f41860a;
        sb2.append(charSequence);
        c16137f.f50063Z++;
        Pattern pattern = this.f29999b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.f30000c = true;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: e */
    public final void mo7965e() {
        this.f29998a.f41081g = ((StringBuilder) this.f30001d.f50064o0).toString();
        this.f30001d = null;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: f */
    public final AbstractC12915a mo7966f() {
        return this.f29998a;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: j */
    public final C10112a mo7967j(C10119h c10119h) {
        if (this.f30000c) {
            return null;
        }
        if (c10119h.f29977i && this.f29999b == null) {
            return null;
        }
        return C10112a.m10688a(c10119h.f29971c);
    }
}
