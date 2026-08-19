package androidx.datastore.preferences.protobuf;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.M */
/* JADX INFO: loaded from: classes.dex */
public final class C10934M {
    /* JADX WARN: Code duplicated, block: B:44:0x0129  */
    /* JADX WARN: Code duplicated, block: B:49:0x0137  */
    /* JADX WARN: Code duplicated, block: B:50:0x0147  */
    /* JADX WARN: Code duplicated, block: B:51:0x0158  */
    /* JADX WARN: Code duplicated, block: B:52:0x015f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0167  */
    /* JADX WARN: Code duplicated, block: B:55:0x0173  */
    /* JADX WARN: Code duplicated, block: B:56:0x017f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0183  */
    /* JADX WARN: Code duplicated, block: B:59:0x018b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0195  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:79:0x0131 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static int m11459a(Object obj, int i10, Object obj2) {
        int iM11630O;
        int iMo11521a;
        int iM11628M;
        int i11;
        int iM11626K;
        C10994x0 c10994x0;
        int iMo11521a2;
        int iM11628M2;
        C10933L c10933l = (C10933L) obj;
        C10932K c10932k = (C10932K) obj2;
        int iM11046d = 0;
        if (!c10933l.isEmpty()) {
            for (Map.Entry entry : c10933l.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                c10932k.getClass();
                int iM11626K2 = C10963i.m11626K(i10);
                C10931J c10931j = c10932k.f32975a;
                int i12 = C10975o.f33074c;
                int iM11626K3 = C10963i.m11626K(1);
                C10992w0 c10992w0 = EnumC10998z0.f33102p0;
                C10990v0 c10990v0 = c10931j.f32972a;
                if (c10990v0 == c10992w0) {
                    iM11626K3 *= 2;
                }
                int iM11630O2 = 8;
                switch (c10990v0.ordinal()) {
                    case 0:
                        ((Double) key).getClass();
                        iM11630O = 8;
                        i11 = iM11630O + iM11626K3;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                int i13 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i13, i13, iM11626K2, iM11046d);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                int i14 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i14, i14, iM11626K2, iM11046d);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i15 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i15, i15, iM11626K2, iM11046d);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i16 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i16, i16, iM11626K2, iM11046d);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i17 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i17, i17, iM11626K2, iM11046d);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                int i18 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i18, i18, iM11626K2, iM11046d);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i19 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i19, i19, iM11626K2, iM11046d);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                int i110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i110, i110, iM11626K2, iM11046d);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                int i111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111, i111, iM11626K2, iM11046d);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                int i112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i112, i112, iM11626K2, iM11046d);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                int i113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i113, i113, iM11626K2, iM11046d);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                int i114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i114, i114, iM11626K2, iM11046d);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                int i115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i115, i115, iM11626K2, iM11046d);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i116, i116, iM11626K2, iM11046d);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i117, i117, iM11626K2, iM11046d);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                int i118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i118, i118, iM11626K2, iM11046d);
                                break;
                            case 16:
                                int iIntValue = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue >> 31) ^ (iIntValue << 1));
                                int i119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i119, i119, iM11626K2, iM11046d);
                                break;
                            case 17:
                                long jLongValue = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue >> 63) ^ (jLongValue << 1));
                                int i1110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1110, i1110, iM11626K2, iM11046d);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 1:
                        ((Float) key).getClass();
                        iM11630O = 4;
                        i11 = iM11630O + iM11626K3;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                int i1111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111, i1111, iM11626K2, iM11046d);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                int i1112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1112, i1112, iM11626K2, iM11046d);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i1113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1113, i1113, iM11626K2, iM11046d);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i1114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1114, i1114, iM11626K2, iM11046d);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i1115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1115, i1115, iM11626K2, iM11046d);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                int i1116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1116, i1116, iM11626K2, iM11046d);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i1117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1117, i1117, iM11626K2, iM11046d);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                int i1118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1118, i1118, iM11626K2, iM11046d);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                int i1119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1119, i1119, iM11626K2, iM11046d);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                int i11110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11110, i11110, iM11626K2, iM11046d);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                int i11111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111, i11111, iM11626K2, iM11046d);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                int i11112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11112, i11112, iM11626K2, iM11046d);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                int i11113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11113, i11113, iM11626K2, iM11046d);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i11114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11114, i11114, iM11626K2, iM11046d);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i11115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11115, i11115, iM11626K2, iM11046d);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                int i11116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11116, i11116, iM11626K2, iM11046d);
                                break;
                            case 16:
                                int iIntValue2 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                int i11117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11117, i11117, iM11626K2, iM11046d);
                                break;
                            case 17:
                                long jLongValue2 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                                int i11118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11118, i11118, iM11626K2, iM11046d);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 2:
                        iM11630O = C10963i.m11630O(((Long) key).longValue());
                        i11 = iM11630O + iM11626K3;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                int i11119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11119, i11119, iM11626K2, iM11046d);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                int i111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111110, i111110, iM11626K2, iM11046d);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111, i111111, iM11626K2, iM11046d);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111112, i111112, iM11626K2, iM11046d);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111113, i111113, iM11626K2, iM11046d);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                int i111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111114, i111114, iM11626K2, iM11046d);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111115, i111115, iM11626K2, iM11046d);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                int i111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111116, i111116, iM11626K2, iM11046d);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                int i111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111117, i111117, iM11626K2, iM11046d);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                int i111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111118, i111118, iM11626K2, iM11046d);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                int i111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111119, i111119, iM11626K2, iM11046d);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                int i1111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111110, i1111110, iM11626K2, iM11046d);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                int i1111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111, i1111111, iM11626K2, iM11046d);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i1111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111112, i1111112, iM11626K2, iM11046d);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i1111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111113, i1111113, iM11626K2, iM11046d);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                int i1111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111114, i1111114, iM11626K2, iM11046d);
                                break;
                            case 16:
                                int iIntValue3 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                int i1111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111115, i1111115, iM11626K2, iM11046d);
                                break;
                            case 17:
                                long jLongValue3 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                                int i1111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111116, i1111116, iM11626K2, iM11046d);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 3:
                        iM11630O = C10963i.m11630O(((Long) key).longValue());
                        i11 = iM11630O + iM11626K3;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                int i1111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111117, i1111117, iM11626K2, iM11046d);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                int i1111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111118, i1111118, iM11626K2, iM11046d);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i1111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111119, i1111119, iM11626K2, iM11046d);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i11111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111110, i11111110, iM11626K2, iM11046d);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i11111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111, i11111111, iM11626K2, iM11046d);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                int i11111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111112, i11111112, iM11626K2, iM11046d);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i11111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111113, i11111113, iM11626K2, iM11046d);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                int i11111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111114, i11111114, iM11626K2, iM11046d);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                int i11111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111115, i11111115, iM11626K2, iM11046d);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                int i11111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111116, i11111116, iM11626K2, iM11046d);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                int i11111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111117, i11111117, iM11626K2, iM11046d);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                int i11111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111118, i11111118, iM11626K2, iM11046d);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                int i11111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111119, i11111119, iM11626K2, iM11046d);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111110, i111111110, iM11626K2, iM11046d);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111, i111111111, iM11626K2, iM11046d);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                int i111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111112, i111111112, iM11626K2, iM11046d);
                                break;
                            case 16:
                                int iIntValue4 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                int i111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111113, i111111113, iM11626K2, iM11046d);
                                break;
                            case 17:
                                long jLongValue4 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                                int i111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111114, i111111114, iM11626K2, iM11046d);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 4:
                        iM11630O = C10963i.m11618C(((Integer) key).intValue());
                        i11 = iM11630O + iM11626K3;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                int i111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111115, i111111115, iM11626K2, iM11046d);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                int i111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111116, i111111116, iM11626K2, iM11046d);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111117, i111111117, iM11626K2, iM11046d);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111118, i111111118, iM11626K2, iM11046d);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111119, i111111119, iM11626K2, iM11046d);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                int i1111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111110, i1111111110, iM11626K2, iM11046d);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i1111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111, i1111111111, iM11626K2, iM11046d);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                int i1111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111112, i1111111112, iM11626K2, iM11046d);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                int i1111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111113, i1111111113, iM11626K2, iM11046d);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                int i1111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111114, i1111111114, iM11626K2, iM11046d);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                int i1111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111115, i1111111115, iM11626K2, iM11046d);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                int i1111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111116, i1111111116, iM11626K2, iM11046d);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                int i1111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111117, i1111111117, iM11626K2, iM11046d);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i1111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111118, i1111111118, iM11626K2, iM11046d);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i1111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111119, i1111111119, iM11626K2, iM11046d);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                int i11111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111110, i11111111110, iM11626K2, iM11046d);
                                break;
                            case 16:
                                int iIntValue5 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                int i11111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111, i11111111111, iM11626K2, iM11046d);
                                break;
                            case 17:
                                long jLongValue5 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                                int i11111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111112, i11111111112, iM11626K2, iM11046d);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 5:
                        ((Long) key).getClass();
                        iM11630O = 8;
                        i11 = iM11630O + iM11626K3;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                int i11111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111113, i11111111113, iM11626K2, iM11046d);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                int i11111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111114, i11111111114, iM11626K2, iM11046d);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i11111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111115, i11111111115, iM11626K2, iM11046d);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i11111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111116, i11111111116, iM11626K2, iM11046d);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i11111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111117, i11111111117, iM11626K2, iM11046d);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                int i11111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111118, i11111111118, iM11626K2, iM11046d);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i11111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111119, i11111111119, iM11626K2, iM11046d);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                int i111111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111110, i111111111110, iM11626K2, iM11046d);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                int i111111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111, i111111111111, iM11626K2, iM11046d);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                int i111111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111112, i111111111112, iM11626K2, iM11046d);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                int i111111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111113, i111111111113, iM11626K2, iM11046d);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                int i111111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111114, i111111111114, iM11626K2, iM11046d);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                int i111111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111115, i111111111115, iM11626K2, iM11046d);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i111111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111116, i111111111116, iM11626K2, iM11046d);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i111111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111117, i111111111117, iM11626K2, iM11046d);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                int i111111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111118, i111111111118, iM11626K2, iM11046d);
                                break;
                            case 16:
                                int iIntValue6 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                int i111111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111119, i111111111119, iM11626K2, iM11046d);
                                break;
                            case 17:
                                long jLongValue6 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                                int i1111111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111110, i1111111111110, iM11626K2, iM11046d);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 6:
                        ((Integer) key).getClass();
                        iM11630O = 4;
                        i11 = iM11630O + iM11626K3;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                int i1111111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111, i1111111111111, iM11626K2, iM11046d);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                int i1111111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111112, i1111111111112, iM11626K2, iM11046d);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i1111111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111113, i1111111111113, iM11626K2, iM11046d);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i1111111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111114, i1111111111114, iM11626K2, iM11046d);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i1111111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111115, i1111111111115, iM11626K2, iM11046d);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                int i1111111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111116, i1111111111116, iM11626K2, iM11046d);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i1111111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111117, i1111111111117, iM11626K2, iM11046d);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                int i1111111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111118, i1111111111118, iM11626K2, iM11046d);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                int i1111111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111119, i1111111111119, iM11626K2, iM11046d);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                int i11111111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111110, i11111111111110, iM11626K2, iM11046d);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                int i11111111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111, i11111111111111, iM11626K2, iM11046d);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                int i11111111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111112, i11111111111112, iM11626K2, iM11046d);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                int i11111111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111113, i11111111111113, iM11626K2, iM11046d);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i11111111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111114, i11111111111114, iM11626K2, iM11046d);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i11111111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111115, i11111111111115, iM11626K2, iM11046d);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                int i11111111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111116, i11111111111116, iM11626K2, iM11046d);
                                break;
                            case 16:
                                int iIntValue7 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                int i11111111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111117, i11111111111117, iM11626K2, iM11046d);
                                break;
                            case 17:
                                long jLongValue7 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                                int i11111111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111118, i11111111111118, iM11626K2, iM11046d);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 7:
                        ((Boolean) key).getClass();
                        iM11630O = 1;
                        i11 = iM11630O + iM11626K3;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                int i11111111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111119, i11111111111119, iM11626K2, iM11046d);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                int i111111111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111110, i111111111111110, iM11626K2, iM11046d);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i111111111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111, i111111111111111, iM11626K2, iM11046d);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i111111111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111112, i111111111111112, iM11626K2, iM11046d);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i111111111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111113, i111111111111113, iM11626K2, iM11046d);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                int i111111111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111114, i111111111111114, iM11626K2, iM11046d);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i111111111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111115, i111111111111115, iM11626K2, iM11046d);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                int i111111111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111116, i111111111111116, iM11626K2, iM11046d);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                int i111111111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111117, i111111111111117, iM11626K2, iM11046d);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                int i111111111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111118, i111111111111118, iM11626K2, iM11046d);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                int i111111111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111119, i111111111111119, iM11626K2, iM11046d);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                int i1111111111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111110, i1111111111111110, iM11626K2, iM11046d);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                int i1111111111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111, i1111111111111111, iM11626K2, iM11046d);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i1111111111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111112, i1111111111111112, iM11626K2, iM11046d);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i1111111111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111113, i1111111111111113, iM11626K2, iM11046d);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                int i1111111111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111114, i1111111111111114, iM11626K2, iM11046d);
                                break;
                            case 16:
                                int iIntValue8 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                int i1111111111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111115, i1111111111111115, iM11626K2, iM11046d);
                                break;
                            case 17:
                                long jLongValue8 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                                int i1111111111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111116, i1111111111111116, iM11626K2, iM11046d);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 8:
                        iM11630O = key instanceof C10957f ? C10963i.m11633u((C10957f) key) : C10963i.m11625J((String) key);
                        i11 = iM11630O + iM11626K3;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                int i1111111111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111117, i1111111111111117, iM11626K2, iM11046d);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                int i1111111111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111118, i1111111111111118, iM11626K2, iM11046d);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i1111111111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111119, i1111111111111119, iM11626K2, iM11046d);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i11111111111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111110, i11111111111111110, iM11626K2, iM11046d);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i11111111111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111, i11111111111111111, iM11626K2, iM11046d);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                int i11111111111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111112, i11111111111111112, iM11626K2, iM11046d);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i11111111111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111113, i11111111111111113, iM11626K2, iM11046d);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                int i11111111111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111114, i11111111111111114, iM11626K2, iM11046d);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                int i11111111111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111115, i11111111111111115, iM11626K2, iM11046d);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                int i11111111111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111116, i11111111111111116, iM11626K2, iM11046d);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                int i11111111111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111117, i11111111111111117, iM11626K2, iM11046d);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                int i11111111111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111118, i11111111111111118, iM11626K2, iM11046d);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                int i11111111111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111119, i11111111111111119, iM11626K2, iM11046d);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i111111111111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111110, i111111111111111110, iM11626K2, iM11046d);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i111111111111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111, i111111111111111111, iM11626K2, iM11046d);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                int i111111111111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111112, i111111111111111112, iM11626K2, iM11046d);
                                break;
                            case 16:
                                int iIntValue9 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                int i111111111111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111113, i111111111111111113, iM11626K2, iM11046d);
                                break;
                            case 17:
                                long jLongValue9 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                                int i111111111111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111114, i111111111111111114, iM11626K2, iM11046d);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 9:
                        iM11630O = ((AbstractC10947a) key).mo11521a();
                        i11 = iM11630O + iM11626K3;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                int i111111111111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111115, i111111111111111115, iM11626K2, iM11046d);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                int i111111111111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111116, i111111111111111116, iM11626K2, iM11046d);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i111111111111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111117, i111111111111111117, iM11626K2, iM11046d);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i111111111111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111118, i111111111111111118, iM11626K2, iM11046d);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i111111111111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111119, i111111111111111119, iM11626K2, iM11046d);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                int i1111111111111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111110, i1111111111111111110, iM11626K2, iM11046d);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i1111111111111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111, i1111111111111111111, iM11626K2, iM11046d);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                int i1111111111111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111112, i1111111111111111112, iM11626K2, iM11046d);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                int i1111111111111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111113, i1111111111111111113, iM11626K2, iM11046d);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                int i1111111111111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111114, i1111111111111111114, iM11626K2, iM11046d);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                int i1111111111111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111115, i1111111111111111115, iM11626K2, iM11046d);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                int i1111111111111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111116, i1111111111111111116, iM11626K2, iM11046d);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                int i1111111111111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111117, i1111111111111111117, iM11626K2, iM11046d);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i1111111111111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111118, i1111111111111111118, iM11626K2, iM11046d);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i1111111111111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111119, i1111111111111111119, iM11626K2, iM11046d);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                int i11111111111111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111110, i11111111111111111110, iM11626K2, iM11046d);
                                break;
                            case 16:
                                int iIntValue10 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                int i11111111111111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111, i11111111111111111111, iM11626K2, iM11046d);
                                break;
                            case 17:
                                long jLongValue10 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                                int i11111111111111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111112, i11111111111111111112, iM11626K2, iM11046d);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 10:
                        iMo11521a = ((AbstractC10947a) key).mo11521a();
                        iM11628M = C10963i.m11628M(iMo11521a);
                        iM11630O = iMo11521a + iM11628M;
                        i11 = iM11630O + iM11626K3;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                int i11111111111111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111113, i11111111111111111113, iM11626K2, iM11046d);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                int i11111111111111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111114, i11111111111111111114, iM11626K2, iM11046d);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i11111111111111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111115, i11111111111111111115, iM11626K2, iM11046d);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i11111111111111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111116, i11111111111111111116, iM11626K2, iM11046d);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i11111111111111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111117, i11111111111111111117, iM11626K2, iM11046d);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                int i11111111111111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111118, i11111111111111111118, iM11626K2, iM11046d);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i11111111111111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111119, i11111111111111111119, iM11626K2, iM11046d);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                int i111111111111111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111110, i111111111111111111110, iM11626K2, iM11046d);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                int i111111111111111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111, i111111111111111111111, iM11626K2, iM11046d);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                int i111111111111111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111112, i111111111111111111112, iM11626K2, iM11046d);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                int i111111111111111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111113, i111111111111111111113, iM11626K2, iM11046d);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                int i111111111111111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111114, i111111111111111111114, iM11626K2, iM11046d);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                int i111111111111111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111115, i111111111111111111115, iM11626K2, iM11046d);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i111111111111111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111116, i111111111111111111116, iM11626K2, iM11046d);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i111111111111111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111117, i111111111111111111117, iM11626K2, iM11046d);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                int i111111111111111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111118, i111111111111111111118, iM11626K2, iM11046d);
                                break;
                            case 16:
                                int iIntValue11 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                int i111111111111111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111119, i111111111111111111119, iM11626K2, iM11046d);
                                break;
                            case 17:
                                long jLongValue11 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                                int i1111111111111111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111110, i1111111111111111111110, iM11626K2, iM11046d);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 11:
                        if (key instanceof C10957f) {
                            iM11630O = C10963i.m11633u((C10957f) key);
                        } else {
                            iMo11521a = ((byte[]) key).length;
                            iM11628M = C10963i.m11628M(iMo11521a);
                            iM11630O = iMo11521a + iM11628M;
                        }
                        i11 = iM11630O + iM11626K3;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                int i1111111111111111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111, i1111111111111111111111, iM11626K2, iM11046d);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                int i1111111111111111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111112, i1111111111111111111112, iM11626K2, iM11046d);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i1111111111111111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111113, i1111111111111111111113, iM11626K2, iM11046d);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i1111111111111111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111114, i1111111111111111111114, iM11626K2, iM11046d);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i1111111111111111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111115, i1111111111111111111115, iM11626K2, iM11046d);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                int i1111111111111111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111116, i1111111111111111111116, iM11626K2, iM11046d);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i1111111111111111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111117, i1111111111111111111117, iM11626K2, iM11046d);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                int i1111111111111111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111118, i1111111111111111111118, iM11626K2, iM11046d);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                int i1111111111111111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111119, i1111111111111111111119, iM11626K2, iM11046d);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                int i11111111111111111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111110, i11111111111111111111110, iM11626K2, iM11046d);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                int i11111111111111111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111, i11111111111111111111111, iM11626K2, iM11046d);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                int i11111111111111111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111112, i11111111111111111111112, iM11626K2, iM11046d);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                int i11111111111111111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111113, i11111111111111111111113, iM11626K2, iM11046d);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i11111111111111111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111114, i11111111111111111111114, iM11626K2, iM11046d);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i11111111111111111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111115, i11111111111111111111115, iM11626K2, iM11046d);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                int i11111111111111111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111116, i11111111111111111111116, iM11626K2, iM11046d);
                                break;
                            case 16:
                                int iIntValue12 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                int i11111111111111111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111117, i11111111111111111111117, iM11626K2, iM11046d);
                                break;
                            case 17:
                                long jLongValue12 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                                int i11111111111111111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111118, i11111111111111111111118, iM11626K2, iM11046d);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 12:
                        iM11630O = C10963i.m11628M(((Integer) key).intValue());
                        i11 = iM11630O + iM11626K3;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                int i11111111111111111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111119, i11111111111111111111119, iM11626K2, iM11046d);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                int i111111111111111111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111110, i111111111111111111111110, iM11626K2, iM11046d);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i111111111111111111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111, i111111111111111111111111, iM11626K2, iM11046d);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i111111111111111111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111112, i111111111111111111111112, iM11626K2, iM11046d);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i111111111111111111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111113, i111111111111111111111113, iM11626K2, iM11046d);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                int i111111111111111111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111114, i111111111111111111111114, iM11626K2, iM11046d);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i111111111111111111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111115, i111111111111111111111115, iM11626K2, iM11046d);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                int i111111111111111111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111116, i111111111111111111111116, iM11626K2, iM11046d);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                int i111111111111111111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111117, i111111111111111111111117, iM11626K2, iM11046d);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                int i111111111111111111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111118, i111111111111111111111118, iM11626K2, iM11046d);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                int i111111111111111111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111119, i111111111111111111111119, iM11626K2, iM11046d);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                int i1111111111111111111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111110, i1111111111111111111111110, iM11626K2, iM11046d);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                int i1111111111111111111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111, i1111111111111111111111111, iM11626K2, iM11046d);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i1111111111111111111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111112, i1111111111111111111111112, iM11626K2, iM11046d);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i1111111111111111111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111113, i1111111111111111111111113, iM11626K2, iM11046d);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                int i1111111111111111111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111114, i1111111111111111111111114, iM11626K2, iM11046d);
                                break;
                            case 16:
                                int iIntValue13 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                int i1111111111111111111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111115, i1111111111111111111111115, iM11626K2, iM11046d);
                                break;
                            case 17:
                                long jLongValue13 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                                int i1111111111111111111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111116, i1111111111111111111111116, iM11626K2, iM11046d);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 13:
                        iM11630O = C10963i.m11618C(((Integer) key).intValue());
                        i11 = iM11630O + iM11626K3;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                int i1111111111111111111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111117, i1111111111111111111111117, iM11626K2, iM11046d);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                int i1111111111111111111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111118, i1111111111111111111111118, iM11626K2, iM11046d);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i1111111111111111111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111119, i1111111111111111111111119, iM11626K2, iM11046d);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i11111111111111111111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111110, i11111111111111111111111110, iM11626K2, iM11046d);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i11111111111111111111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111111, i11111111111111111111111111, iM11626K2, iM11046d);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                int i11111111111111111111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111112, i11111111111111111111111112, iM11626K2, iM11046d);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i11111111111111111111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111113, i11111111111111111111111113, iM11626K2, iM11046d);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                int i11111111111111111111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111114, i11111111111111111111111114, iM11626K2, iM11046d);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                int i11111111111111111111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111115, i11111111111111111111111115, iM11626K2, iM11046d);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                int i11111111111111111111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111116, i11111111111111111111111116, iM11626K2, iM11046d);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                int i11111111111111111111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111117, i11111111111111111111111117, iM11626K2, iM11046d);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                int i11111111111111111111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111118, i11111111111111111111111118, iM11626K2, iM11046d);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                int i11111111111111111111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111119, i11111111111111111111111119, iM11626K2, iM11046d);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i111111111111111111111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111110, i111111111111111111111111110, iM11626K2, iM11046d);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i111111111111111111111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111111, i111111111111111111111111111, iM11626K2, iM11046d);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                int i111111111111111111111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111112, i111111111111111111111111112, iM11626K2, iM11046d);
                                break;
                            case 16:
                                int iIntValue14 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                int i111111111111111111111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111113, i111111111111111111111111113, iM11626K2, iM11046d);
                                break;
                            case 17:
                                long jLongValue14 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                                int i111111111111111111111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111114, i111111111111111111111111114, iM11626K2, iM11046d);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 14:
                        ((Integer) key).getClass();
                        iM11630O = 4;
                        i11 = iM11630O + iM11626K3;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                int i111111111111111111111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111115, i111111111111111111111111115, iM11626K2, iM11046d);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                int i111111111111111111111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111116, i111111111111111111111111116, iM11626K2, iM11046d);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i111111111111111111111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111117, i111111111111111111111111117, iM11626K2, iM11046d);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i111111111111111111111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111118, i111111111111111111111111118, iM11626K2, iM11046d);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i111111111111111111111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111119, i111111111111111111111111119, iM11626K2, iM11046d);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                int i1111111111111111111111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111110, i1111111111111111111111111110, iM11626K2, iM11046d);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i1111111111111111111111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111111, i1111111111111111111111111111, iM11626K2, iM11046d);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                int i1111111111111111111111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111112, i1111111111111111111111111112, iM11626K2, iM11046d);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                int i1111111111111111111111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111113, i1111111111111111111111111113, iM11626K2, iM11046d);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                int i1111111111111111111111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111114, i1111111111111111111111111114, iM11626K2, iM11046d);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                int i1111111111111111111111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111115, i1111111111111111111111111115, iM11626K2, iM11046d);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                int i1111111111111111111111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111116, i1111111111111111111111111116, iM11626K2, iM11046d);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                int i1111111111111111111111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111117, i1111111111111111111111111117, iM11626K2, iM11046d);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i1111111111111111111111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111118, i1111111111111111111111111118, iM11626K2, iM11046d);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i1111111111111111111111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111119, i1111111111111111111111111119, iM11626K2, iM11046d);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                int i11111111111111111111111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111111110, i11111111111111111111111111110, iM11626K2, iM11046d);
                                break;
                            case 16:
                                int iIntValue15 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                int i11111111111111111111111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111111111, i11111111111111111111111111111, iM11626K2, iM11046d);
                                break;
                            case 17:
                                long jLongValue15 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                                int i11111111111111111111111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111111112, i11111111111111111111111111112, iM11626K2, iM11046d);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 15:
                        ((Long) key).getClass();
                        iM11630O = 8;
                        i11 = iM11630O + iM11626K3;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                int i11111111111111111111111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111111113, i11111111111111111111111111113, iM11626K2, iM11046d);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                int i11111111111111111111111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111111114, i11111111111111111111111111114, iM11626K2, iM11046d);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i11111111111111111111111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111111115, i11111111111111111111111111115, iM11626K2, iM11046d);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i11111111111111111111111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111111116, i11111111111111111111111111116, iM11626K2, iM11046d);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i11111111111111111111111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111111117, i11111111111111111111111111117, iM11626K2, iM11046d);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                int i11111111111111111111111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111111118, i11111111111111111111111111118, iM11626K2, iM11046d);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i11111111111111111111111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111111119, i11111111111111111111111111119, iM11626K2, iM11046d);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                int i111111111111111111111111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111111110, i111111111111111111111111111110, iM11626K2, iM11046d);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                int i111111111111111111111111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111111111, i111111111111111111111111111111, iM11626K2, iM11046d);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                int i111111111111111111111111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111111112, i111111111111111111111111111112, iM11626K2, iM11046d);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                int i111111111111111111111111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111111113, i111111111111111111111111111113, iM11626K2, iM11046d);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                int i111111111111111111111111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111111114, i111111111111111111111111111114, iM11626K2, iM11046d);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                int i111111111111111111111111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111111115, i111111111111111111111111111115, iM11626K2, iM11046d);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i111111111111111111111111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111111116, i111111111111111111111111111116, iM11626K2, iM11046d);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i111111111111111111111111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111111117, i111111111111111111111111111117, iM11626K2, iM11046d);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                int i111111111111111111111111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111111118, i111111111111111111111111111118, iM11626K2, iM11046d);
                                break;
                            case 16:
                                int iIntValue16 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                int i111111111111111111111111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111111119, i111111111111111111111111111119, iM11626K2, iM11046d);
                                break;
                            case 17:
                                long jLongValue16 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                                int i1111111111111111111111111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111111110, i1111111111111111111111111111110, iM11626K2, iM11046d);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 16:
                        int iIntValue17 = ((Integer) key).intValue();
                        iM11630O = C10963i.m11628M((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                        i11 = iM11630O + iM11626K3;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                int i1111111111111111111111111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111111111, i1111111111111111111111111111111, iM11626K2, iM11046d);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                int i1111111111111111111111111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111111112, i1111111111111111111111111111112, iM11626K2, iM11046d);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i1111111111111111111111111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111111113, i1111111111111111111111111111113, iM11626K2, iM11046d);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i1111111111111111111111111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111111114, i1111111111111111111111111111114, iM11626K2, iM11046d);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i1111111111111111111111111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111111115, i1111111111111111111111111111115, iM11626K2, iM11046d);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                int i1111111111111111111111111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111111116, i1111111111111111111111111111116, iM11626K2, iM11046d);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i1111111111111111111111111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111111117, i1111111111111111111111111111117, iM11626K2, iM11046d);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                int i1111111111111111111111111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111111118, i1111111111111111111111111111118, iM11626K2, iM11046d);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                int i1111111111111111111111111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111111119, i1111111111111111111111111111119, iM11626K2, iM11046d);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                int i11111111111111111111111111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111111111110, i11111111111111111111111111111110, iM11626K2, iM11046d);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                int i11111111111111111111111111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111111111111, i11111111111111111111111111111111, iM11626K2, iM11046d);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                int i11111111111111111111111111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111111111112, i11111111111111111111111111111112, iM11626K2, iM11046d);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                int i11111111111111111111111111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111111111113, i11111111111111111111111111111113, iM11626K2, iM11046d);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i11111111111111111111111111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111111111114, i11111111111111111111111111111114, iM11626K2, iM11046d);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i11111111111111111111111111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111111111115, i11111111111111111111111111111115, iM11626K2, iM11046d);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                int i11111111111111111111111111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111111111116, i11111111111111111111111111111116, iM11626K2, iM11046d);
                                break;
                            case 16:
                                int iIntValue18 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                int i11111111111111111111111111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111111111117, i11111111111111111111111111111117, iM11626K2, iM11046d);
                                break;
                            case 17:
                                long jLongValue17 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue17 >> 63) ^ (jLongValue17 << 1));
                                int i11111111111111111111111111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111111111118, i11111111111111111111111111111118, iM11626K2, iM11046d);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 17:
                        long jLongValue18 = ((Long) key).longValue();
                        iM11630O = C10963i.m11630O((jLongValue18 << 1) ^ (jLongValue18 >> 63));
                        i11 = iM11630O + iM11626K3;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                int i11111111111111111111111111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i11111111111111111111111111111119, i11111111111111111111111111111119, iM11626K2, iM11046d);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                int i111111111111111111111111111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111111111110, i111111111111111111111111111111110, iM11626K2, iM11046d);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i111111111111111111111111111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111111111111, i111111111111111111111111111111111, iM11626K2, iM11046d);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                int i111111111111111111111111111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111111111112, i111111111111111111111111111111112, iM11626K2, iM11046d);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i111111111111111111111111111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111111111113, i111111111111111111111111111111113, iM11626K2, iM11046d);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                int i111111111111111111111111111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111111111114, i111111111111111111111111111111114, iM11626K2, iM11046d);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i111111111111111111111111111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111111111115, i111111111111111111111111111111115, iM11626K2, iM11046d);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                int i111111111111111111111111111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111111111116, i111111111111111111111111111111116, iM11626K2, iM11046d);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                int i111111111111111111111111111111117 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111111111117, i111111111111111111111111111111117, iM11626K2, iM11046d);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                int i111111111111111111111111111111118 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111111111118, i111111111111111111111111111111118, iM11626K2, iM11046d);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                int i111111111111111111111111111111119 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i111111111111111111111111111111119, i111111111111111111111111111111119, iM11626K2, iM11046d);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                int i1111111111111111111111111111111110 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111111111110, i1111111111111111111111111111111110, iM11626K2, iM11046d);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                int i1111111111111111111111111111111111 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111111111111, i1111111111111111111111111111111111, iM11626K2, iM11046d);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                int i1111111111111111111111111111111112 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111111111112, i1111111111111111111111111111111112, iM11626K2, iM11046d);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                int i1111111111111111111111111111111113 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111111111113, i1111111111111111111111111111111113, iM11626K2, iM11046d);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                int i1111111111111111111111111111111114 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111111111114, i1111111111111111111111111111111114, iM11626K2, iM11046d);
                                break;
                            case 16:
                                int iIntValue19 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                int i1111111111111111111111111111111115 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111111111115, i1111111111111111111111111111111115, iM11626K2, iM11046d);
                                break;
                            case 17:
                                long jLongValue19 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                                int i1111111111111111111111111111111116 = iM11630O2 + iM11626K + i11;
                                iM11046d = AbstractC10763a.m11046d(i1111111111111111111111111111111116, i1111111111111111111111111111111116, iM11626K2, iM11046d);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            }
        }
        return iM11046d;
    }

    /* JADX INFO: renamed from: b */
    public static C10933L m11460b(Object obj, Object obj2) {
        C10933L c10933lM11458b = (C10933L) obj;
        C10933L c10933l = (C10933L) obj2;
        if (!c10933l.isEmpty()) {
            if (!c10933lM11458b.f32977Y) {
                c10933lM11458b = c10933lM11458b.m11458b();
            }
            c10933lM11458b.m11457a();
            if (!c10933l.isEmpty()) {
                c10933lM11458b.putAll(c10933l);
            }
        }
        return c10933lM11458b;
    }
}
