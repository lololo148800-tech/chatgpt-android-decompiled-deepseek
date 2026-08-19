package p1113xn;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import ao.C11198x;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p1091wn.C21022c;
import p523V9.AbstractC7981R5;

/* JADX INFO: renamed from: xn.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C21319m implements Serializable {

    /* JADX INFO: renamed from: Y */
    public final Pattern f67758Y;

    public C21319m(String pattern) {
        AbstractC16544l.m18094g(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        AbstractC16544l.m18093f(patternCompile, "compile(...)");
        this.f67758Y = patternCompile;
    }

    /* JADX INFO: renamed from: b */
    public static C21022c m21661b(String input, C21319m c21319m) {
        c21319m.getClass();
        AbstractC16544l.m18094g(input, "input");
        int i10 = 0;
        if (input.length() >= 0) {
            return new C21022c(new C11198x(c21319m, input, i10), C21318l.f67757Y);
        }
        StringBuilder sbM11057o = AbstractC10763a.m11057o(0, "Start index out of bounds: ", ", input length: ");
        sbM11057o.append(input.length());
        throw new IndexOutOfBoundsException(sbM11057o.toString());
    }

    /* JADX INFO: renamed from: a */
    public final C21317k m21662a(int i10, String input) {
        AbstractC16544l.m18094g(input, "input");
        Matcher matcher = this.f67758Y.matcher(input);
        AbstractC16544l.m18093f(matcher, "matcher(...)");
        return AbstractC7981R5.m8287d(matcher, i10, input);
    }

    /* JADX INFO: renamed from: c */
    public final C21317k m21663c(CharSequence input) {
        AbstractC16544l.m18094g(input, "input");
        Matcher matcher = this.f67758Y.matcher(input);
        AbstractC16544l.m18093f(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new C21317k(matcher, input);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m21664d(CharSequence input) {
        AbstractC16544l.m18094g(input, "input");
        return this.f67758Y.matcher(input).matches();
    }

    /* JADX INFO: renamed from: e */
    public final String m21665e(CharSequence input, String replacement) {
        AbstractC16544l.m18094g(input, "input");
        AbstractC16544l.m18094g(replacement, "replacement");
        String strReplaceAll = this.f67758Y.matcher(input).replaceAll(replacement);
        AbstractC16544l.m18093f(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    /* JADX INFO: renamed from: f */
    public final String m21666f(String input, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(input, "input");
        int i10 = 0;
        C21317k c21317kM21662a = m21662a(0, input);
        if (c21317kM21662a == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append((CharSequence) input, i10, c21317kM21662a.m21658b().f10591Y);
            sb2.append((CharSequence) interfaceC1436k.invoke(c21317kM21662a));
            i10 = c21317kM21662a.m21658b().f10592Z + 1;
            c21317kM21662a = c21317kM21662a.m21660d();
            if (i10 >= length) {
                break;
            }
        } while (c21317kM21662a != null);
        if (i10 < length) {
            sb2.append((CharSequence) input, i10, length);
        }
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }

    public final String toString() {
        String string = this.f67758Y.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }
}
