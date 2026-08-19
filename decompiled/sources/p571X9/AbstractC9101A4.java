package p571X9;

import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p759g1.C13800b;
import p919o8.C17918N;

/* JADX INFO: renamed from: X9.A4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9101A4 {
    /* JADX INFO: renamed from: a */
    public static final long m9631a(int i10, int i11) {
        return (((long) i11) & 4294967295L) | (((long) i10) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static C17918N m9632b(C3676s c3676s) {
        try {
            Number sessionSampleRate = c3676s.m4395w("session_sample_rate").mo4383q();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("session_replay_sample_rate");
            Number numberMo4383q = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4383q() : null;
            AbstractC16544l.m18093f(sessionSampleRate, "sessionSampleRate");
            return new C17918N(sessionSampleRate, numberMo4383q);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Configuration", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Configuration", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Configuration", e12);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final long m9633c(long j10) {
        int iRound = Math.round(C13800b.m15306g(j10));
        return (((long) Math.round(C13800b.m15307h(j10))) & 4294967295L) | (((long) iRound) << 32);
    }
}
