package p523V9;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import androidx.compose.p650ui.layout.AbstractC10868a;
import androidx.work.impl.WorkDatabase;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p042Bf.C1260b;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p110E4.C2315m;
import p204I1.C3590f;
import p229J0.AbstractC4124r4;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p895n1.C17425e;
import p963qd.C18685n;
import tf.C19899D;

/* JADX INFO: renamed from: V9.J5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7918J5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25135a;

    /* JADX INFO: renamed from: a */
    public static final void m8211a(C3590f c3590f, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(1713538282);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c3590f) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 48;
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(-166861076);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6430Q(null, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
            Object objM530s = AbstractC0168G.m530s(-166856819, c6021p, false);
            if (objM530s == c5975s) {
                objM530s = new C1260b(interfaceC5985X, 2);
                c6021p.m6537c0(objM530s);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11316b = AbstractC10868a.m11316b(c10456n, (InterfaceC1440o) objM530s);
            c6021p.m6524S(-166828156);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == c5975s) {
                objM6514H2 = new C19899D(interfaceC5985X, 7);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC4124r4.m4769c(c3590f, interfaceC10459qM11316b, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (InterfaceC1436k) objM6514H2, null, c6021p, i12 & 14, 1572864, 196604);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18685n(c3590f, interfaceC10459q2, i10, 9);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Cursor m8212b(WorkDatabase db2, C2315m c2315m, boolean z6) {
        AbstractC16544l.m18094g(db2, "db");
        Cursor c9 = db2.m12350m(c2315m, null);
        if (z6 && (c9 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) c9;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                AbstractC16544l.m18094g(c9, "c");
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(c9.getColumnNames(), c9.getCount());
                    while (c9.moveToNext()) {
                        Object[] objArr = new Object[c9.getColumnCount()];
                        int columnCount = c9.getColumnCount();
                        for (int i10 = 0; i10 < columnCount; i10++) {
                            int type = c9.getType(i10);
                            if (type == 0) {
                                objArr[i10] = null;
                            } else if (type == 1) {
                                objArr[i10] = Long.valueOf(c9.getLong(i10));
                            } else if (type == 2) {
                                objArr[i10] = Double.valueOf(c9.getDouble(i10));
                            } else if (type == 3) {
                                objArr[i10] = c9.getString(i10);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i10] = c9.getBlob(i10);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    AbstractC7942M5.m8232a(c9, null);
                    return matrixCursor;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC7942M5.m8232a(c9, th2);
                        throw th3;
                    }
                }
            }
        }
        return c9;
    }
}
