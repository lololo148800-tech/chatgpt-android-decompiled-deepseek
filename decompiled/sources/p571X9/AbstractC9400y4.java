package p571X9;

import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.C17915M;

/* JADX INFO: renamed from: X9.y4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9400y4 {
    /* JADX INFO: renamed from: a */
    public static final long m9978a(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static final long m9979b(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    /* JADX INFO: renamed from: c */
    public static C17915M m9980c(C3676s c3676s) {
        try {
            String testExecutionId = c3676s.m4395w("test_execution_id").mo4384r();
            AbstractC16544l.m18093f(testExecutionId, "testExecutionId");
            return new C17915M(testExecutionId);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type CiTest", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type CiTest", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type CiTest", e12);
        }
    }
}
