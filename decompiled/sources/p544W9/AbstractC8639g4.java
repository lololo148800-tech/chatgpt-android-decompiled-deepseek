package p544W9;

import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.EnumC21895B;
import p336Nc.AbstractC5707c;

/* JADX INFO: renamed from: W9.g4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8639g4 {
    /* JADX INFO: renamed from: a */
    public static final float m9297a(EnumC21895B enumC21895B) {
        AbstractC16544l.m18094g(enumC21895B, "<this>");
        return AbstractC5707c.f18496a[enumC21895B.ordinal()] == 1 ? 1.0f : 100.0f;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m9298b(char c9) {
        return c9 == '\t' || (' ' <= c9 && c9 < '0') || ((';' <= c9 && c9 < 'A') || (('[' <= c9 && c9 < 'a') || ('{' <= c9 && c9 < 127)));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m9299c(char c9) {
        return '0' <= c9 && c9 < ':';
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m9300d(char c9) {
        return (c9 >= 0 && c9 < '\t') || ('\n' <= c9 && c9 < ' ') || (('0' <= c9 && c9 < ':') || c9 == ':' || (('a' <= c9 && c9 < '{') || (('A' <= c9 && c9 < '[') || (127 <= c9 && c9 < 256))));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m9301e(char c9) {
        return (c9 >= 0 && c9 < '0') || ('J' <= c9 && c9 < 256);
    }
}
