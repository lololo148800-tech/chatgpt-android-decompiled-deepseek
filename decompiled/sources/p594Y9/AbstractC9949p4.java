package p594Y9;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p582Xk.C9526c;
import p919o8.C17943V1;

/* JADX INFO: renamed from: Y9.p4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9949p4 {
    /* JADX INFO: renamed from: a */
    public static final C9526c m10607a(String str, InterfaceC1426a createConfiguration, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(createConfiguration, "createConfiguration");
        return new C9526c(str, createConfiguration, interfaceC1436k);
    }

    /* JADX INFO: renamed from: b */
    public static C17943V1 m10608b(C3676s c3676s) {
        try {
            Number width = c3676s.m4395w("width").mo4383q();
            Number height = c3676s.m4395w("height").mo4383q();
            AbstractC16544l.m18093f(width, "width");
            AbstractC16544l.m18093f(height, "height");
            return new C17943V1(width, height);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Viewport", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Viewport", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Viewport", e12);
        }
    }
}
