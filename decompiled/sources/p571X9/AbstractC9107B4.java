package p571X9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p492U1.C7544i;
import p759g1.C13801c;
import p919o8.AbstractC17962d;
import p919o8.C17921O;
import p919o8.EnumC17954a0;

/* JADX INFO: renamed from: X9.B4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9107B4 {
    /* JADX INFO: renamed from: a */
    public static C17921O m9637a(C3676s c3676s) {
        ArrayList arrayList;
        String strMo4384r;
        EnumC17954a0 enumC17954a0;
        try {
            String strMo4384r2 = c3676s.m4395w("status").mo4384r();
            AbstractC16544l.m18093f(strMo4384r2, "jsonObject.get(\"status\").asString");
            int i10 = 0;
            for (int i11 : AbstractC0010F.m27k(3)) {
                if (AbstractC17962d.m19650k(i11).equals(strMo4384r2)) {
                    AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("interfaces");
                    if (abstractC3673pM4395w != null) {
                        ArrayList arrayList2 = abstractC3673pM4395w.m4389j().f11172Y;
                        arrayList = new ArrayList(arrayList2.size());
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            String strMo4384r3 = ((AbstractC3673p) it.next()).mo4384r();
                            AbstractC16544l.m18093f(strMo4384r3, "it.asString");
                            EnumC17954a0[] enumC17954a0ArrValues = EnumC17954a0.values();
                            int length = enumC17954a0ArrValues.length;
                            int i12 = 0;
                            while (true) {
                                if (i12 >= length) {
                                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                                }
                                enumC17954a0 = enumC17954a0ArrValues[i12];
                                if (enumC17954a0.f57305Y.equals(strMo4384r3)) {
                                    break;
                                }
                                i12++;
                            }
                            arrayList.add(enumC17954a0);
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
                            if (AbstractC17962d.m19640c(i13).equals(strMo4384r)) {
                                i10 = i13;
                                break;
                            }
                            i10++;
                        }
                    }
                    AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("cellular");
                    return new C17921O(i11, arrayList, i10, abstractC3673pM4395w3 != null ? AbstractC9394x4.m9977b(abstractC3673pM4395w3.m4390m()) : null);
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

    /* JADX INFO: renamed from: b */
    public static final C7544i m9638b(C13801c c13801c) {
        return new C7544i(Math.round(c13801c.f43586a), Math.round(c13801c.f43587b), Math.round(c13801c.f43588c), Math.round(c13801c.f43589d));
    }
}
