package p571X9;

import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader$Cache;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.C17903I;

/* JADX INFO: renamed from: X9.u4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9376u4 {

    /* JADX INFO: renamed from: a */
    public static Java16SealedRecordLoader$Cache f28245a;

    /* JADX INFO: renamed from: a */
    public static C17903I m9952a(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            AbstractC16544l.m18093f(id2, "id");
            return new C17903I(id2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Application", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Application", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Application", e12);
        }
    }
}
