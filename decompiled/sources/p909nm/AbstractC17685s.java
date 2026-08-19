package p909nm;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: nm.s */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17685s extends AbstractC17684r {
    /* JADX INFO: renamed from: t */
    public static void m19391t(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m19392u(List list, Comparator comparator) {
        AbstractC16544l.m18094g(list, "<this>");
        AbstractC16544l.m18094g(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
