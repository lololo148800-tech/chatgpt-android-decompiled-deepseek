package p994rk;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p1113xn.AbstractC21329w;
import p571X9.AbstractC9227W;
import p887m7.C17176b;

/* JADX INFO: renamed from: rk.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C19232x implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final int f60980a;

    /* JADX INFO: renamed from: b */
    public final C17314q f60981b = AbstractC9227W.m9800c(new C17176b(this, 15));

    public C19232x(int i10) {
        this.f60980a = i10;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence source, int i10, int i11, Spanned dest, int i12, int i13) {
        AbstractC16544l.m18094g(source, "source");
        AbstractC16544l.m18094g(dest, "dest");
        CharSequence charSequenceSubSequence = source.subSequence(i10, i11);
        CharSequence charSequenceSubSequence2 = dest.subSequence(0, i12);
        CharSequence charSequenceSubSequence3 = dest.subSequence(i13, dest.length());
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) charSequenceSubSequence2);
        sb2.append((Object) charSequenceSubSequence);
        sb2.append((Object) charSequenceSubSequence3);
        String strM21730q = AbstractC21329w.m21730q(sb2.toString(), ',', '.');
        Object value = this.f60981b.getValue();
        AbstractC16544l.m18093f(value, "getValue(...)");
        Matcher matcher = ((Pattern) value).matcher(strM21730q);
        AbstractC16544l.m18093f(matcher, "matcher(...)");
        if (matcher.matches()) {
            return null;
        }
        return source.length() == 0 ? dest.subSequence(i12, i13) : "";
    }
}
