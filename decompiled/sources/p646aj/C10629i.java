package p646aj;

import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21329w;

/* JADX INFO: renamed from: aj.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C10629i {
    /* JADX INFO: renamed from: a */
    public static String m11003a() {
        String str = ((SimpleDateFormat) AbstractC10630j.f31542a.get()).format(new Date());
        AbstractC16544l.m18093f(str, "formatters.get().format(date)");
        return AbstractC21329w.m21731r(str, "UTC", "Z");
    }
}
