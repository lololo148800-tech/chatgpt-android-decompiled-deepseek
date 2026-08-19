package p741f5;

import android.database.Cursor;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import androidx.work.impl.WorkDatabase_Impl;
import io.sentry.AbstractC15152P0;
import io.sentry.InterfaceC15154Q;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p110E4.C2315m;
import p444S4.C7011q;
import p523V9.AbstractC7873E0;
import p523V9.AbstractC7918J5;
import p658b5.C11236g;
import p658b5.C11238i;
import p658b5.C11241l;
import p658b5.C11245p;
import p658b5.C11248s;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: f5.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13544c {

    /* JADX INFO: renamed from: a */
    public static final String f42867a;

    static {
        String strM7409f = C7011q.m7409f("DiagnosticsWrkr");
        AbstractC16544l.m18093f(strM7409f, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f42867a = strM7409f;
    }

    /* JADX INFO: renamed from: a */
    public static final String m15086a(C11241l c11241l, C11248s c11248s, C11238i c11238i, ArrayList arrayList) {
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C11245p c11245p = (C11245p) it.next();
            C11236g c11236gM12566l0 = c11238i.m12566l0(AbstractC7873E0.m8151b(c11245p));
            Integer numValueOf = c11236gM12566l0 != null ? Integer.valueOf(c11236gM12566l0.f34005c) : null;
            c11241l.getClass();
            InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
            InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkNameDao") : null;
            C2315m c2315mM3418a = C2315m.m3418a(1, "SELECT name FROM workname WHERE work_spec_id=?");
            String str = c11245p.f34041a;
            if (str == null) {
                c2315mM3418a.mo3426s0(1);
            } else {
                c2315mM3418a.mo3422c(1, str);
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c11241l.f34016Y;
            workDatabase_Impl.m12339b();
            Cursor cursorM8212b = AbstractC7918J5.m8212b(workDatabase_Impl, c2315mM3418a, false);
            try {
                ArrayList arrayList2 = new ArrayList(cursorM8212b.getCount());
                while (cursorM8212b.moveToNext()) {
                    arrayList2.add(cursorM8212b.isNull(0) ? null : cursorM8212b.getString(0));
                }
                cursorM8212b.close();
                if (interfaceC15154QMo16291v != null) {
                    interfaceC15154QMo16291v.mo16271b();
                }
                c2315mM3418a.m3425m();
                String strM19349Y = AbstractC17680n.m19349Y(arrayList2, Separators.COMMA, null, null, 0, null, null, 62);
                String strM19349Y2 = AbstractC17680n.m19349Y(c11248s.m12667l(str), Separators.COMMA, null, null, 0, null, null, 62);
                StringBuilder sbM11058p = AbstractC10763a.m11058p(Separators.RETURN, str, "\t ");
                sbM11058p.append(c11245p.f34043c);
                sbM11058p.append("\t ");
                sbM11058p.append(numValueOf);
                sbM11058p.append("\t ");
                sbM11058p.append(c11245p.f34042b.name());
                sbM11058p.append("\t ");
                sbM11058p.append(strM19349Y);
                sbM11058p.append("\t ");
                sbM11058p.append(strM19349Y2);
                sbM11058p.append('\t');
                sb2.append(sbM11058p.toString());
            } catch (Throwable th2) {
                cursorM8212b.close();
                if (interfaceC15154QMo16291v != null) {
                    interfaceC15154QMo16291v.mo16271b();
                }
                c2315mM3418a.m3425m();
                throw th2;
            }
        }
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
