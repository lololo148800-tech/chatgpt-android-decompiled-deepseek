package p571X9;

import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p523V9.AbstractC8071d5;
import p635a1.InterfaceC10459q;
import p919o8.C17992n;

/* JADX INFO: renamed from: X9.b4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9262b4 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC10459q m9836a(InterfaceC10459q interfaceC10459q, boolean z6) {
        AbstractC16544l.m18094g(interfaceC10459q, "<this>");
        return z6 ? AbstractC8071d5.m8483b(interfaceC10459q, 0.38f) : interfaceC10459q;
    }

    /* JADX INFO: renamed from: b */
    public static C17992n m9837b(C3676s c3676s) {
        try {
            return new C17992n(c3676s.m4395w("count").mo4382p());
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Crash", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Crash", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Crash", e12);
        }
    }
}
