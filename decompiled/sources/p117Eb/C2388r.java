package p117Eb;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.gov.nist.core.Separators;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import io.sentry.android.core.AbstractC15256t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p063C9.AbstractC1616b;
import p228J.InterfaceC3800E0;
import p228J.InterfaceC3818U;
import p228J.InterfaceC3866v;
import p253K.AbstractC4491b;
import p253K.C4490a;
import p253K.C4493d;
import p326N.C5568j;
import p379Pb.LVf.efyhmdM;
import p391Q.AbstractC6542b;
import p490U.C7530a;
import p490U.C7531b;
import p490U.C7532c;
import p523V9.AbstractC8072d6;
import p832jb.C16187g;
import p832jb.C16189i;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Eb.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2388r {

    /* JADX INFO: renamed from: a */
    public int f7419a;

    /* JADX INFO: renamed from: b */
    public int f7420b;

    /* JADX INFO: renamed from: c */
    public Object f7421c;

    /* JADX INFO: renamed from: d */
    public Serializable f7422d;

    /* JADX INFO: renamed from: e */
    public Object f7423e;

    public C2388r(InterfaceC3866v interfaceC3866v, Size size) {
        Rational rational;
        this.f7421c = interfaceC3866v;
        this.f7419a = interfaceC3866v.mo136a();
        this.f7420b = interfaceC3866v.mo141f();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List listMo146k = interfaceC3866v.mo146k(256);
            if (listMo146k.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(listMo146k, new C4493d(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.f7422d = rational;
        this.f7423e = new C5568j(interfaceC3866v, rational);
    }

    /* JADX INFO: renamed from: d */
    public static String m3487d(C16187g c16187g) {
        c16187g.m17794a();
        C16189i c16189i = c16187g.f50237c;
        String str = c16189i.f50253e;
        if (str != null) {
            return str;
        }
        c16187g.m17794a();
        String str2 = c16189i.f50250b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList m3488f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(AbstractC4491b.f14647a);
        arrayList2.add(AbstractC4491b.f14649c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList2.contains(rational)) {
                Iterator it2 = arrayList2.iterator();
                do {
                    if (!it2.hasNext()) {
                        arrayList2.add(rational);
                        break;
                    }
                } while (!AbstractC4491b.m5220a((Rational) it2.next(), size));
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: h */
    public static Rational m3489h(int i10, boolean z6) {
        if (i10 != -1) {
            if (i10 == 0) {
                return z6 ? AbstractC4491b.f14647a : AbstractC4491b.f14648b;
            }
            if (i10 == 1) {
                return z6 ? AbstractC4491b.f14649c : AbstractC4491b.f14650d;
            }
            AbstractC8072d6.m8487d("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static HashMap m3490i(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = m3488f(arrayList).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (AbstractC4491b.m5220a(rational, size)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: l */
    public static void m3491l(List list, Size size, boolean z6) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z6) {
            list.addAll(arrayList);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m3492m(List list, Size size, boolean z6) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Size size2 = (Size) list.get(i10);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z6) {
            list.addAll(arrayList);
        }
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [int[], java.io.Serializable] */
    /* JADX INFO: renamed from: a */
    public int m3493a(int i10) {
        int i11 = this.f7419a + 1;
        int[] iArr = (int[]) this.f7421c;
        int length = iArr.length;
        if (i11 > length) {
            int i12 = length * 2;
            int[] iArr2 = new int[i12];
            ?? r6 = new int[i12];
            AbstractC17678l.m19307n(0, 0, 14, iArr, iArr2);
            AbstractC17678l.m19307n(0, 0, 14, (int[]) this.f7422d, r6);
            this.f7421c = iArr2;
            this.f7422d = r6;
        }
        int i13 = this.f7419a;
        this.f7419a = i13 + 1;
        int length2 = ((int[]) this.f7423e).length;
        if (this.f7420b >= length2) {
            int i14 = length2 * 2;
            int[] iArr3 = new int[i14];
            int i15 = 0;
            while (i15 < i14) {
                int i16 = i15 + 1;
                iArr3[i15] = i16;
                i15 = i16;
            }
            AbstractC17678l.m19307n(0, 0, 14, (int[]) this.f7423e, iArr3);
            this.f7423e = iArr3;
        }
        int i17 = this.f7420b;
        int[] iArr4 = (int[]) this.f7423e;
        this.f7420b = iArr4[i17];
        int[] iArr5 = (int[]) this.f7421c;
        iArr5[i13] = i10;
        ((int[]) this.f7422d)[i13] = i17;
        iArr4[i17] = i13;
        int i18 = iArr5[i13];
        while (i13 > 0) {
            int i19 = ((i13 + 1) >> 1) - 1;
            if (iArr5[i19] <= i18) {
                break;
            }
            m3500n(i19, i13);
            i13 = i19;
        }
        return i17;
    }

    /* JADX INFO: renamed from: b */
    public synchronized String m3494b() {
        try {
            if (((String) this.f7422d) == null) {
                m3499k();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (String) this.f7422d;
    }

    /* JADX INFO: renamed from: c */
    public synchronized String m3495c() {
        try {
            if (((String) this.f7423e) == null) {
                m3499k();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (String) this.f7423e;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
    /* JADX INFO: renamed from: g */
    public List m3497g(InterfaceC3800E0 interfaceC3800E0) {
        Size[] sizeArr;
        InterfaceC3818U interfaceC3818U = (InterfaceC3818U) interfaceC3800E0;
        ArrayList arrayListMo4550r = interfaceC3818U.mo4550r();
        if (arrayListMo4550r != null) {
            return arrayListMo4550r;
        }
        C7531b c7531bMo4551s = interfaceC3818U.mo4551s();
        List listMo4547f = interfaceC3818U.mo4547f();
        int inputFormat = interfaceC3800E0.getInputFormat();
        Rational rational = null;
        if (listMo4547f == null) {
            sizeArr = null;
            break;
        }
        Iterator it = listMo4547f.iterator();
        while (true) {
            if (!it.hasNext()) {
                sizeArr = null;
                break;
            }
            Pair pair = (Pair) it.next();
            if (((Integer) pair.first).intValue() == inputFormat) {
                sizeArr = (Size[]) pair.second;
                break;
            }
        }
        List listAsList = sizeArr == null ? null : Arrays.asList(sizeArr);
        if (listAsList == null) {
            listAsList = ((InterfaceC3866v) this.f7421c).mo146k(inputFormat);
        }
        ArrayList arrayList = new ArrayList(listAsList);
        Collections.sort(arrayList, new C4493d(true));
        if (arrayList.isEmpty()) {
            AbstractC8072d6.m8492i("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + inputFormat + Separators.DOT);
        }
        if (c7531bMo4551s != null) {
            Size sizeMo4545P = ((InterfaceC3818U) interfaceC3800E0).mo4545P();
            interfaceC3818U.mo4541B();
            if (!interfaceC3800E0.mo48p()) {
                interfaceC3800E0.getInputFormat();
            }
            C7531b c7531bMo4548g = interfaceC3818U.mo4548g();
            C7530a c7530a = c7531bMo4548g.f23873a;
            HashMap mapM3490i = m3490i(arrayList);
            Rational rational2 = (Rational) this.f7422d;
            boolean z6 = rational2 == null || rational2.getNumerator() >= rational2.getDenominator();
            c7530a.getClass();
            Rational rationalM3489h = m3489h(0, z6);
            ArrayList<Rational> arrayList2 = new ArrayList(mapM3490i.keySet());
            Collections.sort(arrayList2, new C4490a(rationalM3489h, rational2));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Rational rational3 : arrayList2) {
                linkedHashMap.put(rational3, (List) mapM3490i.get(rational3));
            }
            if (sizeMo4545P != null) {
                Size size = AbstractC6542b.f21170a;
                int height = sizeMo4545P.getHeight() * sizeMo4545P.getWidth();
                Iterator it2 = linkedHashMap.keySet().iterator();
                while (it2.hasNext()) {
                    List<Size> list = (List) linkedHashMap.get((Rational) it2.next());
                    ArrayList arrayList3 = new ArrayList();
                    for (Size size2 : list) {
                        if (AbstractC6542b.m7097a(size2) <= height) {
                            arrayList3.add(size2);
                        }
                    }
                    list.clear();
                    list.addAll(arrayList3);
                }
            }
            C7532c c7532c = c7531bMo4548g.f23874b;
            if (c7532c != null) {
                Iterator it3 = linkedHashMap.keySet().iterator();
                while (it3.hasNext()) {
                    List list2 = (List) linkedHashMap.get((Rational) it3.next());
                    if (!list2.isEmpty() && !c7532c.equals(C7532c.f23875c)) {
                        int i10 = c7532c.f23877b;
                        Size size3 = c7532c.f23876a;
                        if (i10 == 0) {
                            boolean zContains = list2.contains(size3);
                            list2.clear();
                            if (zContains) {
                                list2.add(size3);
                            }
                        } else if (i10 == 1) {
                            m3491l(list2, size3, true);
                        } else if (i10 == 2) {
                            m3491l(list2, size3, false);
                        } else if (i10 == 3) {
                            m3492m(list2, size3, true);
                        } else if (i10 == 4) {
                            m3492m(list2, size3, false);
                        }
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it4 = linkedHashMap.values().iterator();
            while (it4.hasNext()) {
                for (Size size4 : (List) it4.next()) {
                    if (!arrayList4.contains(size4)) {
                        arrayList4.add(size4);
                    }
                }
            }
            return arrayList4;
        }
        C5568j c5568j = (C5568j) this.f7423e;
        c5568j.getClass();
        if (!arrayList.isEmpty()) {
            ArrayList<Size> arrayList5 = new ArrayList(arrayList);
            Collections.sort(arrayList5, new C4493d(true));
            ArrayList arrayList6 = new ArrayList();
            InterfaceC3818U interfaceC3818U2 = (InterfaceC3818U) interfaceC3800E0;
            Size sizeMo4545P2 = interfaceC3818U2.mo4545P();
            Size size5 = (Size) arrayList5.get(0);
            if (sizeMo4545P2 == null) {
                sizeMo4545P2 = size5;
            } else if (AbstractC6542b.m7097a(size5) < sizeMo4545P2.getHeight() * sizeMo4545P2.getWidth()) {
                sizeMo4545P2 = size5;
            }
            Size sizeM5977a = c5568j.m5977a(interfaceC3818U2);
            Size size6 = AbstractC6542b.f21171b;
            int iM7097a = AbstractC6542b.m7097a(size6);
            if (AbstractC6542b.m7097a(sizeMo4545P2) < iM7097a) {
                size6 = AbstractC6542b.f21170a;
            } else if (sizeM5977a != null) {
                if (sizeM5977a.getHeight() * sizeM5977a.getWidth() < iM7097a) {
                    size6 = sizeM5977a;
                }
            }
            for (Size size7 : arrayList5) {
                if (AbstractC6542b.m7097a(size7) <= sizeMo4545P2.getHeight() * sizeMo4545P2.getWidth()) {
                    if (size7.getHeight() * size7.getWidth() >= AbstractC6542b.m7097a(size6) && !arrayList6.contains(size7)) {
                        arrayList6.add(size7);
                    }
                }
            }
            if (arrayList6.isEmpty()) {
                throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size6 + "\nmaxSize = " + sizeMo4545P2 + "\ninitial size list: " + arrayList5);
            }
            if (!interfaceC3818U2.mo4543G()) {
                Size sizeM5977a2 = c5568j.m5977a(interfaceC3818U2);
                if (sizeM5977a2 != null) {
                    Iterator it5 = m3488f(arrayList6).iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            rational = new Rational(sizeM5977a2.getWidth(), sizeM5977a2.getHeight());
                            break;
                        }
                        Rational rational4 = (Rational) it5.next();
                        if (AbstractC4491b.m5220a(rational4, sizeM5977a2)) {
                            rational = rational4;
                            break;
                        }
                    }
                }
            } else {
                rational = m3489h(interfaceC3818U2.mo4544I(), c5568j.f18062c);
            }
            if (sizeM5977a == null) {
                sizeM5977a = interfaceC3818U2.mo4552w();
            }
            arrayList = new ArrayList();
            new HashMap();
            if (rational == null) {
                arrayList.addAll(arrayList6);
                if (sizeM5977a != null) {
                    m3491l(arrayList, sizeM5977a, true);
                }
            } else {
                HashMap mapM3490i2 = m3490i(arrayList6);
                if (sizeM5977a != null) {
                    Iterator it6 = mapM3490i2.keySet().iterator();
                    while (it6.hasNext()) {
                        m3491l((List) mapM3490i2.get((Rational) it6.next()), sizeM5977a, true);
                    }
                }
                ArrayList arrayList7 = new ArrayList(mapM3490i2.keySet());
                Collections.sort(arrayList7, new C4490a(rational, (Rational) c5568j.f18063d));
                Iterator it7 = arrayList7.iterator();
                while (it7.hasNext()) {
                    for (Size size8 : (List) mapM3490i2.get((Rational) it7.next())) {
                        if (!arrayList.contains(size8)) {
                            arrayList.add(size8);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004c A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:43:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x006a A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:43:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0077 A[Catch: all -> 0x0027, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:43:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007a A[Catch: all -> 0x0027, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:43:0x0001 }] */
    /* JADX INFO: renamed from: j */
    public boolean m3498j() {
        int i10;
        List<ResolveInfo> listQueryBroadcastReceivers;
        synchronized (this) {
            i10 = this.f7420b;
            if (i10 == 0) {
                PackageManager packageManager = ((Context) this.f7421c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    AbstractC15256t.m16465c("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i10 = 0;
                } else if (AbstractC1616b.m2472d()) {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers != null) {
                        AbstractC15256t.m16482t("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (AbstractC1616b.m2472d()) {
                            this.f7420b = 2;
                        } else {
                            this.f7420b = 1;
                        }
                        i10 = this.f7420b;
                    } else {
                        AbstractC15256t.m16482t("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (AbstractC1616b.m2472d()) {
                            this.f7420b = 2;
                        } else {
                            this.f7420b = 1;
                        }
                        i10 = this.f7420b;
                    }
                } else {
                    Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
                        Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
                        intent3.setPackage("com.google.android.gms");
                        listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
                        if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.size() <= 0) {
                            AbstractC15256t.m16482t("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                            if (AbstractC1616b.m2472d()) {
                                this.f7420b = 2;
                            } else {
                                this.f7420b = 1;
                            }
                            i10 = this.f7420b;
                        } else {
                            this.f7420b = 2;
                            i10 = 2;
                        }
                    } else {
                        this.f7420b = 1;
                        i10 = 1;
                    }
                }
            }
        }
        return i10 != 0;
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m3499k() {
        PackageInfo packageInfoM3496e = m3496e(((Context) this.f7421c).getPackageName());
        if (packageInfoM3496e != null) {
            this.f7422d = Integer.toString(packageInfoM3496e.versionCode);
            this.f7423e = packageInfoM3496e.versionName;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m3500n(int i10, int i11) {
        int[] iArr = (int[]) this.f7421c;
        int[] iArr2 = (int[]) this.f7422d;
        int[] iArr3 = (int[]) this.f7423e;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = iArr2[i10];
        iArr2[i10] = iArr2[i11];
        iArr2[i11] = i13;
        iArr3[iArr2[i10]] = i10;
        iArr3[iArr2[i11]] = i11;
    }

    /* JADX INFO: renamed from: e */
    public PackageInfo m3496e(String str) {
        try {
            return ((Context) this.f7421c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            AbstractC15256t.m16482t("FirebaseMessaging", efyhmdM.yEit + e10);
            return null;
        }
    }
}
