package p006A4;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import p049Bm.InterfaceC1439n;
import p1143z4.AbstractC21769K;
import p1143z4.C21778h;
import p1143z4.C21779i;
import p1143z4.C21795y;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17681o;
import p909nm.C17677k;

/* JADX INFO: renamed from: A4.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0358s extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public static final C0358s f1233Y = new C0358s(2);

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        Bundle bundle;
        C21795y c21795y = (C21795y) obj2;
        c21795y.getClass();
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : AbstractC17659D.m19254p(c21795y.f33551w.f69054a).entrySet()) {
            ((AbstractC21769K) entry.getValue()).getClass();
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        C17677k c17677k = c21795y.f33535g;
        if (!c17677k.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[c17677k.f56476o0];
            Iterator<E> it = c17677k.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                parcelableArr[i10] = new C21779i((C21778h) it.next());
                i10++;
            }
            bundle.putParcelableArray(HJrCuD.sqxItyDDL, parcelableArr);
        }
        LinkedHashMap linkedHashMap = c21795y.f33542n;
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i11 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str = (String) entry2.getValue();
                iArr[i11] = iIntValue;
                arrayList2.add(str);
                i11++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = c21795y.f33543o;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str2 = (String) entry3.getKey();
                C17677k c17677k2 = (C17677k) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[c17677k2.f56476o0];
                int i12 = 0;
                for (Object obj3 : c17677k2) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        AbstractC17681o.m19388q();
                        throw null;
                    }
                    parcelableArr2[i12] = (C21779i) obj3;
                    i12 = i13;
                }
                bundle.putParcelableArray(AbstractC9306j0.m9889h("android-support-nav:controller:backStackStates:", str2), parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (c21795y.f33534f) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", c21795y.f33534f);
        }
        return bundle;
    }
}
