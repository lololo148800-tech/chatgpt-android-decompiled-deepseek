package p875ll;

import java.util.ArrayList;
import java.util.Set;
import p1113xn.C21319m;
import p544W9.AbstractC8639g4;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: ll.e */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17067e {

    /* JADX INFO: renamed from: a */
    public static final Set f54542a = AbstractC17678l.m19293P(new Character[]{'!', '#', '$', '%', '&', '\'', '*', '+', '-', '.', '^', '_', '`', '|', '~'});

    /* JADX INFO: renamed from: b */
    public static final Set f54543b = AbstractC17678l.m19293P(new Character[]{'-', '.', '_', '~', '+', '/'});

    /* JADX INFO: renamed from: c */
    public static final C21319m f54544c = new C21319m("[a-zA-Z0-9\\-._~+/]+=*");

    /* JADX INFO: renamed from: d */
    public static final C21319m f54545d = new C21319m("\\\\.");

    /* JADX INFO: renamed from: a */
    public static final boolean m18888a(char c9) {
        if (('a' > c9 || c9 >= '{') && (('A' > c9 || c9 >= '[') && !AbstractC8639g4.m9299c(c9))) {
            if (!f54542a.contains(Character.valueOf(c9))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final Integer m18889b(ArrayList arrayList, AbstractC17066d abstractC17066d, int i10, String str) {
        if (i10 != str.length() && str.charAt(i10) != ',') {
            return null;
        }
        arrayList.add(abstractC17066d);
        if (i10 == str.length()) {
            return -1;
        }
        if (str.charAt(i10) == ',') {
            return Integer.valueOf(i10 + 1);
        }
        throw new IllegalStateException("");
    }

    /* JADX INFO: renamed from: c */
    public static final int m18890c(int i10, String str) {
        while (i10 < str.length() && str.charAt(i10) == ' ') {
            i10++;
        }
        return i10;
    }
}
