package p594Y9;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p507Uh.C7680f;
import p507Uh.C7681g;
import p507Uh.InterfaceC7682h;
import p919o8.C17996o0;

/* JADX INFO: renamed from: Y9.Z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9842Z {
    /* JADX INFO: renamed from: a */
    public static C17996o0 m10489a(C3676s c3676s) {
        try {
            String testExecutionId = c3676s.m4395w("test_execution_id").mo4384r();
            AbstractC16544l.m18093f(testExecutionId, "testExecutionId");
            return new C17996o0(testExecutionId);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type CiTest", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type CiTest", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type CiTest", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m10490b(InterfaceC7682h interfaceC7682h) {
        AbstractC16544l.m18094g(interfaceC7682h, "<this>");
        if (interfaceC7682h instanceof C7680f) {
            return ((C7680f) interfaceC7682h).f24218a;
        }
        if (interfaceC7682h.equals(C7681g.f24220a)) {
            return false;
        }
        throw new C0644w();
    }
}
