package p523V9;

import android.database.Cursor;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.Closeable;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC16544l;
import om.C18235b;
import p159G4.C2992c;
import p159G4.C2993d;
import p233J4.C4256b;
import p257K3.C4535c;
import p571X9.AbstractC9221V;
import p571X9.AbstractC9393x3;
import p774h1.AbstractC14334L;
import p774h1.C14341T;
import p895n1.C17424d;
import p895n1.C17425e;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: V9.M5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7942M5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25171a;

    /* JADX INFO: renamed from: a */
    public static final void m8232a(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                AbstractC9221V.m9789a(th2, th3);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C17425e m8233b() {
        C17425e c17425e = f25171a;
        if (c17425e != null) {
            return c17425e;
        }
        float f10 = (float) 24.0d;
        C17424d c17424d = new C17424d("InstagramFilled", f10, f10, 24.0f, 24.0f, 0L, 0, false, 224);
        C14341T c14341t = new C14341T(AbstractC14334L.m15626d(4278190080L));
        C4535c c4535c = new C4535c(3);
        c4535c.m5290p(12.0f, 2.5f);
        c4535c.m5283i(9.4203f, 2.5f, 9.0964f, 2.5112f, 8.0834f, 2.557f);
        c4535c.m5283i(7.2954f, 2.5727f, 6.5157f, 2.7219f, 5.7775f, 2.9983f);
        c4535c.m5283i(5.1433f, 3.2371f, 4.5689f, 3.6114f, 4.0943f, 4.0951f);
        c4535c.m5283i(3.611f, 4.5696f, 3.2369f, 5.1437f, 2.9983f, 5.7775f);
        c4535c.m5283i(2.7222f, 6.5157f, 2.5733f, 7.2954f, 2.5579f, 8.0834f);
        c4535c.m5283i(2.5104f, 9.0964f, 2.5f, 9.4203f, 2.5f, 12.0f);
        c4535c.m5283i(2.5f, 14.5797f, 2.5112f, 14.9035f, 2.557f, 15.9166f);
        c4535c.m5283i(2.5727f, 16.7046f, 2.7219f, 17.4843f, 2.9983f, 18.2225f);
        c4535c.m5283i(3.2371f, 18.8567f, 3.6114f, 19.4311f, 4.0951f, 19.9057f);
        c4535c.m5283i(4.5696f, 20.389f, 5.1437f, 20.763f, 5.7775f, 21.0017f);
        c4535c.m5283i(6.5157f, 21.2778f, 7.2954f, 21.4267f, 8.0834f, 21.4421f);
        c4535c.m5283i(9.0964f, 21.4896f, 9.4203f, 21.5f, 12.0f, 21.5f);
        c4535c.m5283i(14.5797f, 21.5f, 14.9035f, 21.4888f, 15.9166f, 21.443f);
        c4535c.m5283i(16.7046f, 21.4273f, 17.4843f, 21.2781f, 18.2225f, 21.0017f);
        c4535c.m5283i(18.8538f, 20.7576f, 19.4271f, 20.3843f, 19.9057f, 19.9057f);
        c4535c.m5283i(20.3843f, 19.4271f, 20.7576f, 18.8538f, 21.0017f, 18.2225f);
        c4535c.m5283i(21.2778f, 17.4843f, 21.4267f, 16.7046f, 21.4421f, 15.9166f);
        c4535c.m5283i(21.4896f, 14.9035f, 21.5f, 14.5797f, 21.5f, 12.0f);
        c4535c.m5283i(21.5f, 9.4203f, 21.4888f, 9.0964f, 21.443f, 8.0834f);
        c4535c.m5283i(21.4273f, 7.2954f, 21.2781f, 6.5157f, 21.0017f, 5.7775f);
        c4535c.m5283i(20.7629f, 5.1433f, 20.3886f, 4.5689f, 19.9049f, 4.0943f);
        c4535c.m5283i(19.4304f, 3.611f, 18.8563f, 3.2369f, 18.2225f, 2.9983f);
        c4535c.m5283i(17.4843f, 2.7222f, 16.7046f, 2.5733f, 15.9166f, 2.5579f);
        c4535c.m5283i(14.9035f, 2.5104f, 14.5797f, 2.5f, 12.0f, 2.5f);
        c4535c.m5282h();
        c4535c.m5290p(16.4377f, 5.9809f);
        c4535c.m5283i(16.6252f, 5.8556f, 16.8456f, 5.7887f, 17.0711f, 5.7887f);
        c4535c.m5283i(17.3734f, 5.7887f, 17.6634f, 5.9088f, 17.8772f, 6.1226f);
        c4535c.m5283i(18.0909f, 6.3364f, 18.2111f, 6.6264f, 18.2111f, 6.9287f);
        c4535c.m5283i(18.2111f, 7.1542f, 18.1442f, 7.3746f, 18.0189f, 7.5621f);
        c4535c.m5283i(17.8937f, 7.7495f, 17.7156f, 7.8957f, 17.5073f, 7.9819f);
        c4535c.m5283i(17.299f, 8.0682f, 17.0698f, 8.0908f, 16.8486f, 8.0468f);
        c4535c.m5283i(16.6275f, 8.0028f, 16.4244f, 7.8943f, 16.2649f, 7.7348f);
        c4535c.m5283i(16.1055f, 7.5754f, 15.9969f, 7.3723f, 15.953f, 7.1511f);
        c4535c.m5283i(15.909f, 6.93f, 15.9315f, 6.7008f, 16.0178f, 6.4925f);
        c4535c.m5283i(16.1041f, 6.2842f, 16.2502f, 6.1061f, 16.4377f, 5.9809f);
        c4535c.m5282h();
        c4535c.m5290p(9.2893f, 7.9435f);
        c4535c.m5283i(10.0916f, 7.4075f, 11.0349f, 7.1213f, 11.9998f, 7.1213f);
        c4535c.m5283i(13.2937f, 7.1213f, 14.5346f, 7.6353f, 15.4495f, 8.5503f);
        c4535c.m5283i(16.3645f, 9.4652f, 16.8785f, 10.7061f, 16.8785f, 12.0f);
        c4535c.m5283i(16.8785f, 12.9649f, 16.5923f, 13.9082f, 16.0563f, 14.7104f);
        c4535c.m5283i(15.5202f, 15.5127f, 14.7582f, 16.1381f, 13.8668f, 16.5073f);
        c4535c.m5283i(12.9753f, 16.8766f, 11.9944f, 16.9732f, 11.048f, 16.7849f);
        c4535c.m5283i(10.1016f, 16.5967f, 9.2323f, 16.132f, 8.55f, 15.4497f);
        c4535c.m5283i(7.8677f, 14.7675f, 7.4031f, 13.8982f, 7.2148f, 12.9518f);
        c4535c.m5283i(7.0266f, 12.0054f, 7.1232f, 11.0245f, 7.4925f, 10.133f);
        c4535c.m5283i(7.8617f, 9.2416f, 8.487f, 8.4796f, 9.2893f, 7.9435f);
        c4535c.m5282h();
        c4535c.m5290p(10.2405f, 14.6332f);
        c4535c.m5283i(10.7613f, 14.9812f, 11.3736f, 15.1669f, 12.0f, 15.1669f);
        c4535c.m5283i(12.8399f, 15.1669f, 13.6454f, 14.8333f, 14.2393f, 14.2394f);
        c4535c.m5283i(14.8333f, 13.6454f, 15.1669f, 12.8399f, 15.1669f, 12.0f);
        c4535c.m5283i(15.1669f, 11.3736f, 14.9812f, 10.7613f, 14.6332f, 10.2405f);
        c4535c.m5283i(14.2852f, 9.7197f, 13.7906f, 9.3138f, 13.2119f, 9.0741f);
        c4535c.m5283i(12.6332f, 8.8344f, 11.9965f, 8.7717f, 11.3821f, 8.8939f);
        c4535c.m5283i(10.7678f, 9.0161f, 10.2035f, 9.3177f, 9.7606f, 9.7606f);
        c4535c.m5283i(9.3177f, 10.2035f, 9.0161f, 10.7678f, 8.8939f, 11.3822f);
        c4535c.m5283i(8.7717f, 11.9965f, 8.8344f, 12.6333f, 9.0741f, 13.2119f);
        c4535c.m5283i(9.3138f, 13.7906f, 9.7197f, 14.2852f, 10.2405f, 14.6332f);
        c4535c.m5282h();
        C17424d.m19121a(c17424d, c4535c.f14813Z, 1, c14341t, null, 0.0f, 0, 0, 4.0f);
        C17425e c17425eM19122b = c17424d.m19122b();
        f25171a = c17425eM19122b;
        return c17425eM19122b;
    }

    /* JADX INFO: renamed from: c */
    public static final List m8234c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(ParameterNames.f31999ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        C18235b c18235bM9972b = AbstractC9393x3.m9972b();
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(columnIndex);
            int i11 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            AbstractC16544l.m18093f(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            AbstractC16544l.m18093f(string2, "cursor.getString(toColumnIndex)");
            c18235bM9972b.add(new C2992c(string, i10, i11, string2));
        }
        return AbstractC17680n.m19369s0(AbstractC9393x3.m9971a(c18235bM9972b));
    }

    /* JADX INFO: renamed from: d */
    public static final C2993d m8235d(C4256b c4256b, String str, boolean z6) {
        Cursor cursorM5025j0 = c4256b.m5025j0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorM5025j0.getColumnIndex("seqno");
            int columnIndex2 = cursorM5025j0.getColumnIndex("cid");
            int columnIndex3 = cursorM5025j0.getColumnIndex(DiagnosticsEntry.NAME_KEY);
            int columnIndex4 = cursorM5025j0.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorM5025j0.moveToNext()) {
                    if (cursorM5025j0.getInt(columnIndex2) >= 0) {
                        int i10 = cursorM5025j0.getInt(columnIndex);
                        String columnName = cursorM5025j0.getString(columnIndex3);
                        String str2 = cursorM5025j0.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i10);
                        AbstractC16544l.m18093f(columnName, "columnName");
                        treeMap.put(numValueOf, columnName);
                        treeMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                AbstractC16544l.m18093f(collectionValues, "columnsMap.values");
                List listM19322C0 = AbstractC17680n.m19322C0(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                AbstractC16544l.m18093f(collectionValues2, "ordersMap.values");
                C2993d c2993d = new C2993d(str, z6, listM19322C0, AbstractC17680n.m19322C0(collectionValues2));
                m8232a(cursorM5025j0, null);
                return c2993d;
            }
            m8232a(cursorM5025j0, null);
            return null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                m8232a(cursorM5025j0, th2);
                throw th3;
            }
        }
    }
}
