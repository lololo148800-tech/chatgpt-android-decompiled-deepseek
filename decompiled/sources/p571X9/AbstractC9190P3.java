package p571X9;

import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p001A.AbstractC0010F;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p444S4.C7011q;
import p470T4.AbstractC7250o;
import p470T4.C7236a;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p919o8.AbstractC17962d;
import p919o8.C17959c;

/* JADX INFO: renamed from: X9.P3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9190P3 {
    /* JADX INFO: renamed from: a */
    public static C17959c m9751a(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            String strMo4384r = c3676s.m4395w("type").mo4384r();
            AbstractC16544l.m18093f(strMo4384r, "jsonObject.get(\"type\").asString");
            for (int i10 : AbstractC0010F.m27k(3)) {
                if (AbstractC17962d.m19663x(i10).equals(strMo4384r)) {
                    AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("has_replay");
                    Boolean boolValueOf = abstractC3673pM4395w != null ? Boolean.valueOf(abstractC3673pM4395w.mo4380f()) : null;
                    AbstractC16544l.m18093f(id2, "id");
                    return new C17959c(i10, boolValueOf, id2);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type ActionEventSession", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type ActionEventSession", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type ActionEventSession", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9752b(Context context) {
        AbstractC16544l.m18094g(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        AbstractC16544l.m18093f(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            C7011q.m7408d().m7410a(AbstractC7250o.f22991a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            AbstractC16544l.m18093f(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File file = new File(C7236a.f22943a.m7638a(context), "androidx.work.workdb");
            String[] strArr = AbstractC7250o.f22992b;
            int iM19257b = AbstractC17660E.m19257b(strArr.length);
            if (iM19257b < 16) {
                iM19257b = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            for (Map.Entry entry : AbstractC17659D.m19249k(linkedHashMap, new C17309l(databasePath2, file)).entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        C7011q.m7408d().m7414g(AbstractC7250o.f22991a, "Over-writing contents of " + file3);
                    }
                    C7011q.m7408d().m7410a(AbstractC7250o.f22991a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }
}
