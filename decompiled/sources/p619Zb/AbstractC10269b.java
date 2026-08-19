package p619Zb;

import android.content.Context;
import android.util.SparseArray;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p165G9.C3020f;
import p449S9.C7042K;
import p501Ub.C7604f;
import p523V9.AbstractC8233y;
import p523V9.C7896H;
import p523V9.C8184r6;
import p523V9.C8232x6;
import p523V9.EnumC7901H4;
import p523V9.EnumC7909I4;
import p523V9.EnumC7980R4;
import p523V9.EnumC7988S4;
import p523V9.EnumC8176q6;
import p546Wb.C8756b;
import p594Y9.C9895g4;
import p960q9.C18655i;

/* JADX INFO: renamed from: Zb.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10269b {

    /* JADX INFO: renamed from: a */
    public static final SparseArray f30500a;

    /* JADX INFO: renamed from: b */
    public static final SparseArray f30501b;

    /* JADX INFO: renamed from: c */
    public static final AtomicReference f30502c;

    /* JADX INFO: renamed from: d */
    public static final HashMap f30503d;

    static {
        SparseArray sparseArray = new SparseArray();
        f30500a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f30501b = sparseArray2;
        f30502c = new AtomicReference();
        sparseArray.put(-1, EnumC7980R4.FORMAT_UNKNOWN);
        sparseArray.put(1, EnumC7980R4.FORMAT_CODE_128);
        sparseArray.put(2, EnumC7980R4.FORMAT_CODE_39);
        sparseArray.put(4, EnumC7980R4.FORMAT_CODE_93);
        sparseArray.put(8, EnumC7980R4.FORMAT_CODABAR);
        sparseArray.put(16, EnumC7980R4.FORMAT_DATA_MATRIX);
        sparseArray.put(32, EnumC7980R4.FORMAT_EAN_13);
        sparseArray.put(64, EnumC7980R4.FORMAT_EAN_8);
        sparseArray.put(128, EnumC7980R4.FORMAT_ITF);
        sparseArray.put(256, EnumC7980R4.FORMAT_QR_CODE);
        sparseArray.put(512, EnumC7980R4.FORMAT_UPC_A);
        sparseArray.put(1024, EnumC7980R4.FORMAT_UPC_E);
        sparseArray.put(2048, EnumC7980R4.FORMAT_PDF417);
        sparseArray.put(4096, EnumC7980R4.FORMAT_AZTEC);
        sparseArray2.put(0, EnumC7988S4.TYPE_UNKNOWN);
        sparseArray2.put(1, EnumC7988S4.TYPE_CONTACT_INFO);
        sparseArray2.put(2, EnumC7988S4.TYPE_EMAIL);
        sparseArray2.put(3, EnumC7988S4.TYPE_ISBN);
        sparseArray2.put(4, EnumC7988S4.TYPE_PHONE);
        sparseArray2.put(5, EnumC7988S4.TYPE_PRODUCT);
        sparseArray2.put(6, EnumC7988S4.TYPE_SMS);
        sparseArray2.put(7, EnumC7988S4.TYPE_TEXT);
        sparseArray2.put(8, EnumC7988S4.TYPE_URL);
        sparseArray2.put(9, EnumC7988S4.TYPE_WIFI);
        sparseArray2.put(10, EnumC7988S4.TYPE_GEO);
        sparseArray2.put(11, EnumC7988S4.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, EnumC7988S4.TYPE_DRIVER_LICENSE);
        HashMap map = new HashMap();
        f30503d = map;
        map.put(1, EnumC8176q6.CODE_128);
        map.put(2, EnumC8176q6.CODE_39);
        map.put(4, EnumC8176q6.CODE_93);
        map.put(8, EnumC8176q6.CODABAR);
        map.put(16, EnumC8176q6.DATA_MATRIX);
        map.put(32, EnumC8176q6.EAN_13);
        map.put(64, EnumC8176q6.EAN_8);
        map.put(128, EnumC8176q6.f25613u0);
        map.put(256, EnumC8176q6.QR_CODE);
        map.put(512, EnumC8176q6.UPC_A);
        map.put(1024, EnumC8176q6.UPC_E);
        map.put(2048, EnumC8176q6.PDF417);
        map.put(4096, EnumC8176q6.f25618z0);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:13:0x003d A[LOOP:0: B:11:0x0037->B:13:0x003d, LOOP_END] */
    /* JADX INFO: renamed from: a */
    public static C8184r6 m10866a(C8756b c8756b) {
        Iterator it;
        int i10 = c8756b.f26676a;
        C7042K c7042k = new C7042K();
        HashMap map = f30503d;
        if (i10 == 0) {
            Collection collectionValues = map.values();
            if (collectionValues instanceof Collection) {
                c7042k.m7440n(collectionValues.size() + c7042k.f22494a);
                if (collectionValues instanceof AbstractC8233y) {
                    c7042k.f22494a = ((AbstractC8233y) collectionValues).mo8143f(c7042k.f22494a, (Object[]) c7042k.f22496c);
                } else {
                    it = collectionValues.iterator();
                    while (it.hasNext()) {
                        c7042k.m7439m(it.next());
                    }
                }
            } else {
                it = collectionValues.iterator();
                while (it.hasNext()) {
                    c7042k.m7439m(it.next());
                }
            }
        } else {
            for (Map.Entry entry : map.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & i10) != 0) {
                    c7042k.m7439m((EnumC8176q6) entry.getValue());
                }
            }
        }
        C18655i c18655i = new C18655i(20, false);
        c18655i.f59414Z = c7042k.m7441o();
        return new C8184r6(c18655i);
    }

    /* JADX INFO: renamed from: b */
    public static void m10867b(C8232x6 c8232x6, EnumC7901H4 enumC7901H4) {
        c8232x6.m8870b(new C9895g4(enumC7901H4), EnumC7909I4.ON_DEVICE_BARCODE_LOAD);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m10868c() {
        AtomicReference atomicReference = f30502c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        Context contextM7952b = C7604f.m7950c().m7952b();
        C7896H c7896h = C10275h.f30517h;
        boolean z6 = C3020f.m3865a(contextM7952b, "com.google.mlkit.dynamite.barcode") > 0;
        atomicReference.set(Boolean.valueOf(z6));
        return z6;
    }
}
