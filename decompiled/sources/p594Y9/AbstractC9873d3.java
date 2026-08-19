package p594Y9;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.InterfaceC2149O0;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p225Im.InterfaceC3771s;
import p533Vl.AbstractC8391c;
import p533Vl.C8398j;
import p919o8.AbstractC17976h1;
import p919o8.C17936T0;
import p919o8.EnumC17961c1;

/* JADX INFO: renamed from: Y9.d3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9873d3 {
    /* JADX INFO: renamed from: a */
    public static final C8398j m10527a(Object obj, InterfaceC1439n interfaceC1439n) {
        return new C8398j(AbstractC2124C.m3204c(obj), interfaceC1439n);
    }

    /* JADX INFO: renamed from: b */
    public static C17936T0 m10528b(C3676s c3676s) {
        EnumC17961c1 enumC17961c1;
        String strMo4384r;
        String strMo4384r2;
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("plan");
            int i10 = 0;
            if (abstractC3673pM4395w == null || (strMo4384r2 = abstractC3673pM4395w.mo4384r()) == null) {
                enumC17961c1 = null;
            } else {
                EnumC17961c1[] enumC17961c1ArrValues = EnumC17961c1.values();
                int length = enumC17961c1ArrValues.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    enumC17961c1 = enumC17961c1ArrValues[i11];
                    if (AbstractC16544l.m18089b(enumC17961c1.f57334Y.toString(), strMo4384r2)) {
                        break;
                    }
                    i11++;
                }
            }
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("session_precondition");
            if (abstractC3673pM4395w2 != null && (strMo4384r = abstractC3673pM4395w2.mo4384r()) != null) {
                int[] iArrM27k = AbstractC0010F.m27k(7);
                int length2 = iArrM27k.length;
                while (i10 < length2) {
                    int i12 = iArrM27k[i10];
                    if (AbstractC17976h1.m19673h(i12).equals(strMo4384r)) {
                        i10 = i12;
                    } else {
                        i10++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new C17936T0(enumC17961c1, i10);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type DdSession", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type DdSession", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type DdSession", e12);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC2149O0 m10529c(InterfaceC3771s interfaceC3771s) {
        try {
            ThreadLocal threadLocal = AbstractC8391c.f26112b;
            threadLocal.set(Boolean.TRUE);
            interfaceC3771s.get();
            ThreadLocal threadLocal2 = AbstractC8391c.f26111a;
            Object obj = threadLocal2.get();
            threadLocal2.set(null);
            threadLocal.set(Boolean.FALSE);
            AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of io.livekit.android.util.FlowDelegateKt.<get-flow>>");
            return (InterfaceC2149O0) obj;
        } catch (Throwable th2) {
            AbstractC8391c.f26111a.set(null);
            AbstractC8391c.f26112b.set(Boolean.FALSE);
            throw th2;
        }
    }
}
