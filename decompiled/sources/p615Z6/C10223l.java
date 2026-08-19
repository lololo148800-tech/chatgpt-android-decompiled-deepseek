package p615Z6;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: Z6.l */
/* JADX INFO: loaded from: classes.dex */
public final class C10223l {

    /* JADX INFO: renamed from: a */
    public C10225m f30349a;

    /* JADX INFO: renamed from: b */
    public C10193S f30350b;

    /* JADX INFO: renamed from: c */
    public int f30351c;

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.f30349a));
        sb2.append(" {...} (src=");
        int i10 = this.f30351c;
        if (i10 != 1) {
            str = i10 != 2 ? "null" : "RenderOptions";
        } else {
            str = "Document";
        }
        sb2.append(str);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
