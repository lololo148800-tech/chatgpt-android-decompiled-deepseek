package p817j$.time.format;

import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.time.format.C */
/* JADX INFO: loaded from: classes4.dex */
public final class C15576C {

    /* JADX INFO: renamed from: a */
    public static final C15576C f48621a = new C15576C();

    /* JADX INFO: renamed from: a */
    final int m17011a(char c9) {
        int i10 = c9 - '0';
        if (i10 < 0 || i10 > 9) {
            return -1;
        }
        return i10;
    }

    public final int hashCode() {
        return 182;
    }

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15576C)) {
            return false;
        }
        ((C15576C) obj).getClass();
        return true;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
