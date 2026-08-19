package p1113xn;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: xn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C21307a {

    /* JADX INFO: renamed from: a */
    public static final Charset f67720a;

    /* JADX INFO: renamed from: b */
    public static final Charset f67721b;

    /* JADX INFO: renamed from: c */
    public static volatile Charset f67722c;

    /* JADX INFO: renamed from: d */
    public static volatile Charset f67723d;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC16544l.m18093f(charsetForName, "forName(...)");
        f67720a = charsetForName;
        AbstractC16544l.m18093f(Charset.forName("UTF-16"), "forName(...)");
        AbstractC16544l.m18093f(Charset.forName("UTF-16BE"), "forName(...)");
        AbstractC16544l.m18093f(Charset.forName("UTF-16LE"), "forName(...)");
        AbstractC16544l.m18093f(Charset.forName("US-ASCII"), "forName(...)");
        Charset charsetForName2 = Charset.forName("ISO-8859-1");
        AbstractC16544l.m18093f(charsetForName2, "forName(...)");
        f67721b = charsetForName2;
    }
}
