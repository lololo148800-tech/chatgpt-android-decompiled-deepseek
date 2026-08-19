package p230J1;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* JADX INFO: renamed from: J1.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4173A {

    /* JADX INFO: renamed from: a */
    public static final C4198y f13587a = new C4198y();

    /* JADX INFO: renamed from: b */
    public static final long f13588b;

    static {
        long j10 = 0;
        f13588b = (j10 & 4294967295L) | (j10 << 32);
    }

    /* JADX INFO: renamed from: a */
    public static final TextDirectionHeuristic m4792a(int i10) {
        if (i10 == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (i10 == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (i10 == 2) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i10 == 3) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (i10 != 4) {
            return i10 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.ANYRTL_LTR;
    }
}
