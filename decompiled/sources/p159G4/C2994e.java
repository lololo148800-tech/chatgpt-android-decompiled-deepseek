package p159G4;

import android.database.Cursor;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import om.C18238e;
import om.C18240g;
import p233J4.C4256b;
import p523V9.AbstractC7942M5;
import p909nm.AbstractC17665J;
import p909nm.C17690x;

/* JADX INFO: renamed from: G4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2994e {

    /* JADX INFO: renamed from: a */
    public final String f9012a;

    /* JADX INFO: renamed from: b */
    public final Object f9013b;

    /* JADX INFO: renamed from: c */
    public final AbstractSet f9014c;

    /* JADX INFO: renamed from: d */
    public final AbstractSet f9015d;

    public C2994e(String str, Map map, AbstractSet foreignKeys, AbstractSet abstractSet) {
        AbstractC16544l.m18094g(foreignKeys, "foreignKeys");
        this.f9012a = str;
        this.f9013b = map;
        this.f9014c = foreignKeys;
        this.f9015d = abstractSet;
    }

    public final boolean equals(Object obj) {
        AbstractSet abstractSet;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2994e)) {
            return false;
        }
        C2994e c2994e = (C2994e) obj;
        if (!this.f9012a.equals(c2994e.f9012a) || !this.f9013b.equals(c2994e.f9013b) || !AbstractC16544l.m18089b(this.f9014c, c2994e.f9014c)) {
            return false;
        }
        AbstractSet abstractSet2 = this.f9015d;
        if (abstractSet2 == null || (abstractSet = c2994e.f9015d) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.f9014c.hashCode() + ((this.f9013b.hashCode() + (this.f9012a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f9012a + "', columns=" + this.f9013b + ", foreignKeys=" + this.f9014c + ", indices=" + this.f9015d + '}';
    }

    /* JADX INFO: renamed from: a */
    public static final C2994e m3827a(C4256b c4256b, String str) {
        Map mapM19755b;
        C18240g c18240gM19262b;
        C18240g c18240g;
        Cursor cursorM5025j0 = c4256b.m5025j0("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorM5025j0.getColumnCount() <= 0) {
                mapM19755b = C17690x.f56481Y;
                AbstractC7942M5.m8232a(cursorM5025j0, null);
            } else {
                int columnIndex = cursorM5025j0.getColumnIndex(DiagnosticsEntry.NAME_KEY);
                int columnIndex2 = cursorM5025j0.getColumnIndex("type");
                int columnIndex3 = cursorM5025j0.getColumnIndex("notnull");
                int columnIndex4 = cursorM5025j0.getColumnIndex(qffLJgOYizGmMj.xrYfjib);
                int columnIndex5 = cursorM5025j0.getColumnIndex("dflt_value");
                C18238e c18238e = new C18238e();
                while (cursorM5025j0.moveToNext()) {
                    String name = cursorM5025j0.getString(columnIndex);
                    String type = cursorM5025j0.getString(columnIndex2);
                    boolean z6 = cursorM5025j0.getInt(columnIndex3) != 0;
                    int i10 = cursorM5025j0.getInt(columnIndex4);
                    String string = cursorM5025j0.getString(columnIndex5);
                    AbstractC16544l.m18093f(name, "name");
                    AbstractC16544l.m18093f(type, "type");
                    c18238e.put(name, new C2990a(i10, 2, name, type, string, z6));
                }
                mapM19755b = c18238e.m19755b();
                AbstractC7942M5.m8232a(cursorM5025j0, null);
            }
            Cursor cursorM5025j1 = c4256b.m5025j0("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorM5025j1.getColumnIndex(ParameterNames.f31999ID);
                int columnIndex7 = cursorM5025j1.getColumnIndex("seq");
                int columnIndex8 = cursorM5025j1.getColumnIndex("table");
                int columnIndex9 = cursorM5025j1.getColumnIndex("on_delete");
                int columnIndex10 = cursorM5025j1.getColumnIndex("on_update");
                List listM8234c = AbstractC7942M5.m8234c(cursorM5025j1);
                cursorM5025j1.moveToPosition(-1);
                C18240g c18240g2 = new C18240g();
                while (cursorM5025j1.moveToNext()) {
                    if (cursorM5025j1.getInt(columnIndex7) == 0) {
                        int i11 = cursorM5025j1.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i12 = columnIndex6;
                        ArrayList<C2992c> arrayList3 = new ArrayList();
                        for (Object obj : listM8234c) {
                            int i13 = columnIndex7;
                            List list = listM8234c;
                            if (((C2992c) obj).f9004Y == i11) {
                                arrayList3.add(obj);
                            }
                            columnIndex7 = i13;
                            listM8234c = list;
                        }
                        int i14 = columnIndex7;
                        List list2 = listM8234c;
                        for (C2992c c2992c : arrayList3) {
                            arrayList.add(c2992c.f9006o0);
                            arrayList2.add(c2992c.f9007p0);
                        }
                        String string2 = cursorM5025j1.getString(columnIndex8);
                        AbstractC16544l.m18093f(string2, "cursor.getString(tableColumnIndex)");
                        String string3 = cursorM5025j1.getString(columnIndex9);
                        AbstractC16544l.m18093f(string3, "cursor.getString(onDeleteColumnIndex)");
                        String string4 = cursorM5025j1.getString(columnIndex10);
                        AbstractC16544l.m18093f(string4, "cursor.getString(onUpdateColumnIndex)");
                        c18240g2.add(new C2991b(string2, string3, string4, arrayList, arrayList2));
                        columnIndex6 = i12;
                        columnIndex7 = i14;
                        listM8234c = list2;
                        columnIndex8 = columnIndex8;
                    }
                }
                C18240g c18240gM19262b2 = AbstractC17665J.m19262b(c18240g2);
                AbstractC7942M5.m8232a(cursorM5025j1, null);
                Cursor cursorM5025j2 = c4256b.m5025j0("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorM5025j2.getColumnIndex(DiagnosticsEntry.NAME_KEY);
                    int columnIndex12 = cursorM5025j2.getColumnIndex("origin");
                    int columnIndex13 = cursorM5025j2.getColumnIndex("unique");
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        c18240gM19262b = null;
                        AbstractC7942M5.m8232a(cursorM5025j2, null);
                    } else {
                        C18240g c18240g3 = new C18240g();
                        while (cursorM5025j2.moveToNext()) {
                            if ("c".equals(cursorM5025j2.getString(columnIndex12))) {
                                String name2 = cursorM5025j2.getString(columnIndex11);
                                boolean z10 = cursorM5025j2.getInt(columnIndex13) == 1;
                                AbstractC16544l.m18093f(name2, "name");
                                C2993d c2993dM8235d = AbstractC7942M5.m8235d(c4256b, name2, z10);
                                if (c2993dM8235d == null) {
                                    AbstractC7942M5.m8232a(cursorM5025j2, null);
                                    c18240g = null;
                                    return new C2994e(str, mapM19755b, c18240gM19262b2, c18240g);
                                }
                                c18240g3.add(c2993dM8235d);
                            }
                        }
                        c18240gM19262b = AbstractC17665J.m19262b(c18240g3);
                        AbstractC7942M5.m8232a(cursorM5025j2, null);
                    }
                    c18240g = c18240gM19262b;
                    return new C2994e(str, mapM19755b, c18240gM19262b2, c18240g);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC7942M5.m8232a(cursorM5025j2, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    AbstractC7942M5.m8232a(cursorM5025j1, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                AbstractC7942M5.m8232a(cursorM5025j0, th6);
                throw th7;
            }
        }
    }
}
