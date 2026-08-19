package p571X9;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p124Ei.C2446D;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p349O0.C6018n0;
import p349O0.C6021p;
import p587Y1.InterfaceC9589o;
import p919o8.AbstractC17962d;
import p919o8.C17980j;
import p919o8.EnumC18019w;

/* JADX INFO: renamed from: X9.X3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9237X3 {
    /* JADX INFO: renamed from: a */
    public static final void m9812a(int i10, C6021p c6021p) {
        Window windowMo4721a;
        WindowManager.LayoutParams attributes;
        c6021p.m6526U(1532161005);
        if (i10 == 0 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            ViewParent parent = ((View) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32829f)).getParent();
            InterfaceC9589o interfaceC9589o = parent instanceof InterfaceC9589o ? (InterfaceC9589o) parent : null;
            if (interfaceC9589o != null && (windowMo4721a = interfaceC9589o.mo4721a()) != null) {
                windowMo4721a.addFlags(256);
                windowMo4721a.addFlags(Integer.MIN_VALUE);
                windowMo4721a.setLayout(-1, -1);
                if (Build.VERSION.SDK_INT >= 30 && (attributes = windowMo4721a.getAttributes()) != null) {
                    attributes.setFitInsetsTypes(0);
                }
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2446D(i10, 10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C17980j m9813b(C3676s c3676s) {
        ArrayList arrayList;
        String strMo4384r;
        EnumC18019w enumC18019w;
        try {
            String strMo4384r2 = c3676s.m4395w("status").mo4384r();
            AbstractC16544l.m18093f(strMo4384r2, "jsonObject.get(\"status\").asString");
            int i10 = 0;
            for (int i11 : AbstractC0010F.m27k(3)) {
                if (AbstractC17962d.m19611B(i11).equals(strMo4384r2)) {
                    AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("interfaces");
                    if (abstractC3673pM4395w != null) {
                        ArrayList arrayList2 = abstractC3673pM4395w.m4389j().f11172Y;
                        arrayList = new ArrayList(arrayList2.size());
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            String strMo4384r3 = ((AbstractC3673p) it.next()).mo4384r();
                            AbstractC16544l.m18093f(strMo4384r3, "it.asString");
                            EnumC18019w[] enumC18019wArrValues = EnumC18019w.values();
                            int length = enumC18019wArrValues.length;
                            int i12 = 0;
                            while (true) {
                                if (i12 >= length) {
                                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                                }
                                enumC18019w = enumC18019wArrValues[i12];
                                if (enumC18019w.f57522Y.equals(strMo4384r3)) {
                                    break;
                                }
                                i12++;
                            }
                            arrayList.add(enumC18019w);
                        }
                    } else {
                        arrayList = null;
                    }
                    AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("effective_type");
                    if (abstractC3673pM4395w2 != null && (strMo4384r = abstractC3673pM4395w2.mo4384r()) != null) {
                        int[] iArrM27k = AbstractC0010F.m27k(4);
                        int length2 = iArrM27k.length;
                        while (true) {
                            if (i10 >= length2) {
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            }
                            int i13 = iArrM27k[i10];
                            if (AbstractC17962d.m19665z(i13).equals(strMo4384r)) {
                                i10 = i13;
                                break;
                            }
                            i10++;
                        }
                    }
                    AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("cellular");
                    return new C17980j(i11, arrayList, i10, abstractC3673pM4395w3 != null ? AbstractC9207S3.m9773a(abstractC3673pM4395w3.m4390m()) : null);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Connectivity", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Connectivity", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Connectivity", e12);
        }
    }
}
