package p003A1;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.p650ui.platform.AndroidComposeView;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p156G1.AbstractC2962i;
import p156G1.C2954a;
import p156G1.C2963j;
import p156G1.C2971r;
import p156G1.C2974u;
import p670c1.ViewOnAttachStateChangeListenerC11560d;
import p692d0.C12982u;

/* JADX INFO: renamed from: A1.X */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTranslationCallbackC0218X implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a */
    public static final ViewTranslationCallbackC0218X f846a = new ViewTranslationCallbackC0218X();

    /* JADX WARN: Code duplicated, block: B:26:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x007d A[LOOP:0: B:5:0x001d->B:27:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0080 A[EDGE_INSN: B:30:0x0080->B:28:0x0080 BREAK  A[LOOP:0: B:5:0x001d->B:27:0x007d], SYNTHETIC] */
    public final boolean onClearTranslation(View view) {
        InterfaceC1426a interfaceC1426a;
        AbstractC16544l.m18092e(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ViewOnAttachStateChangeListenerC11560d contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.f34947s0 = 1;
        C12982u c12982uM12956b = contentCaptureManager.m12956b();
        Object[] objArr = c12982uM12956b.f41206c;
        long[] jArr = c12982uM12956b.f41204a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            C2963j c2963j = ((C0297v1) objArr[(i10 << 3) + i12]).f1070a.f8889d;
                            C2974u c2974u = C2971r.f8937w;
                            LinkedHashMap linkedHashMap = c2963j.f8880Y;
                            Object obj = linkedHashMap.get(c2974u);
                            if (obj == null) {
                                obj = null;
                            }
                            if (obj != null) {
                                Object obj2 = linkedHashMap.get(AbstractC2962i.f8865l);
                                C2954a c2954a = (C2954a) (obj2 != null ? obj2 : null);
                                if (c2954a != null && (interfaceC1426a = (InterfaceC1426a) c2954a.f8838b) != null) {
                                }
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0085 A[LOOP:0: B:5:0x001d->B:28:0x0085, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0088 A[EDGE_INSN: B:31:0x0088->B:29:0x0088 BREAK  A[LOOP:0: B:5:0x001d->B:28:0x0085], SYNTHETIC] */
    public final boolean onHideTranslation(View view) {
        InterfaceC1436k interfaceC1436k;
        AbstractC16544l.m18092e(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ViewOnAttachStateChangeListenerC11560d contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.f34947s0 = 1;
        C12982u c12982uM12956b = contentCaptureManager.m12956b();
        Object[] objArr = c12982uM12956b.f41206c;
        long[] jArr = c12982uM12956b.f41204a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            C2963j c2963j = ((C0297v1) objArr[(i10 << 3) + i12]).f1070a.f8889d;
                            C2974u c2974u = C2971r.f8937w;
                            LinkedHashMap linkedHashMap = c2963j.f8880Y;
                            Object obj = linkedHashMap.get(c2974u);
                            if (obj == null) {
                                obj = null;
                            }
                            if (AbstractC16544l.m18089b(obj, Boolean.TRUE)) {
                                Object obj2 = linkedHashMap.get(AbstractC2962i.f8864k);
                                C2954a c2954a = (C2954a) (obj2 != null ? obj2 : null);
                                if (c2954a != null && (interfaceC1436k = (InterfaceC1436k) c2954a.f8838b) != null) {
                                }
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return true;
    }

    public final boolean onShowTranslation(View view) {
        InterfaceC1436k interfaceC1436k;
        AbstractC16544l.m18092e(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ViewOnAttachStateChangeListenerC11560d contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.f34947s0 = 2;
        C12982u c12982uM12956b = contentCaptureManager.m12956b();
        Object[] objArr = c12982uM12956b.f41206c;
        long[] jArr = c12982uM12956b.f41204a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        C2963j c2963j = ((C0297v1) objArr[(i10 << 3) + i12]).f1070a.f8889d;
                        C2974u c2974u = C2971r.f8937w;
                        LinkedHashMap linkedHashMap = c2963j.f8880Y;
                        Object obj = linkedHashMap.get(c2974u);
                        if (obj == null) {
                            obj = null;
                        }
                        if (AbstractC16544l.m18089b(obj, Boolean.FALSE)) {
                            Object obj2 = linkedHashMap.get(AbstractC2962i.f8864k);
                            C2954a c2954a = (C2954a) (obj2 != null ? obj2 : null);
                            if (c2954a != null && (interfaceC1436k = (InterfaceC1436k) c2954a.f8838b) != null) {
                            }
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }
}
