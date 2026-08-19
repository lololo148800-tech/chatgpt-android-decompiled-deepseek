package p571X9;

import android.view.View;
import android.view.ViewGroup;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17324A;
import mo.C17352s;
import no.AbstractC17708b;
import p1113xn.C21307a;

/* JADX INFO: renamed from: X9.E2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9123E2 {
    /* JADX INFO: renamed from: a */
    public static C17324A m9653a(String str, C17352s c17352s) {
        AbstractC16544l.m18094g(str, "<this>");
        Charset charset = C21307a.f67720a;
        if (c17352s != null) {
            Pattern pattern = C17352s.f55296e;
            Charset charsetM19029a = c17352s.m19029a(null);
            if (charsetM19029a == null) {
                c17352s = AbstractC9282f0.m9858d(c17352s + "; charset=utf-8");
            } else {
                charset = charsetM19029a;
            }
        }
        byte[] bytes = str.getBytes(charset);
        AbstractC16544l.m18093f(bytes, "this as java.lang.String).getBytes(charset)");
        int length = bytes.length;
        AbstractC17708b.m19411c(bytes.length, 0, length);
        return new C17324A(c17352s, length, bytes, 0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9654b(View view, int i10) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View viewFindViewById = viewGroup.getChildAt(i11).findViewById(i10);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }
}
