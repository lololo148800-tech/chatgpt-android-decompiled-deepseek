package p670c1;

import android.gov.nist.core.Separators;
import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0297v1;
import p049Bm.InterfaceC1436k;
import p083D3.AbstractC1872j;
import p156G1.AbstractC2962i;
import p156G1.C2954a;
import p156G1.C2968o;
import p156G1.C2971r;
import p204I1.C3590f;
import p221Ii.RunnableC3724c;
import p594Y9.AbstractC9918k3;

/* JADX INFO: renamed from: c1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C11558b {

    /* JADX INFO: renamed from: a */
    public static final C11558b f34932a = new C11558b();

    /* JADX INFO: renamed from: a */
    public static void m12952a(ViewOnAttachStateChangeListenerC11560d viewOnAttachStateChangeListenerC11560d, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        C0297v1 c0297v1;
        C2968o c2968o;
        InterfaceC1436k interfaceC1436k;
        int i10 = 0;
        while (i10 < longSparseArray.size()) {
            int i11 = i10 + 1;
            long jKeyAt = longSparseArray.keyAt(i10);
            ViewTranslationResponse viewTranslationResponseM2832k = AbstractC1872j.m2832k(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseM2832k != null && (value = viewTranslationResponseM2832k.getValue("android:text")) != null && (text = value.getText()) != null && (c0297v1 = (C0297v1) viewOnAttachStateChangeListenerC11560d.m12956b().m14694f((int) jKeyAt)) != null && (c2968o = c0297v1.f1070a) != null) {
                Object obj = c2968o.f8889d.f8880Y.get(AbstractC2962i.f8863j);
                if (obj == null) {
                    obj = null;
                }
                C2954a c2954a = (C2954a) obj;
                if (c2954a != null && (interfaceC1436k = (InterfaceC1436k) c2954a.f8838b) != null) {
                }
            }
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12953b(ViewOnAttachStateChangeListenerC11560d viewOnAttachStateChangeListenerC11560d, long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        C2968o c2968o;
        String strM10573a;
        for (long j10 : jArr) {
            C0297v1 c0297v1 = (C0297v1) viewOnAttachStateChangeListenerC11560d.m12956b().m14694f((int) j10);
            if (c0297v1 != null && (c2968o = c0297v1.f1070a) != null) {
                AbstractC11557a.m12944i();
                ViewTranslationRequest.Builder builderM12941f = AbstractC11557a.m12941f(viewOnAttachStateChangeListenerC11560d.f34941Y.getAutofillId(), c2968o.f8892g);
                Object obj = c2968o.f8889d.f8880Y.get(C2971r.f8935u);
                if (obj == null) {
                    obj = null;
                }
                List list = (List) obj;
                if (list != null && (strM10573a = AbstractC9918k3.m10573a(list, Separators.RETURN, null, 62)) != null) {
                    builderM12941f.setValue("android:text", TranslationRequestValue.forText(new C3590f(6, strM10573a, null)));
                    consumer.m17405p(builderM12941f.build());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12954c(ViewOnAttachStateChangeListenerC11560d viewOnAttachStateChangeListenerC11560d, LongSparseArray<ViewTranslationResponse> longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (AbstractC16544l.m18089b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            m12952a(viewOnAttachStateChangeListenerC11560d, longSparseArray);
        } else {
            viewOnAttachStateChangeListenerC11560d.f34941Y.post(new RunnableC3724c(viewOnAttachStateChangeListenerC11560d, 26, longSparseArray));
        }
    }
}
