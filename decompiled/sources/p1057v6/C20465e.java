package p1057v6;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p051Bo.AbstractC1456b;
import p136F6.AbstractC2674a;
import p523V9.AbstractC8175q5;

/* JADX INFO: renamed from: v6.e */
/* JADX INFO: loaded from: classes.dex */
public final class C20465e {

    /* JADX INFO: renamed from: a */
    public final C20468h f64963a;

    /* JADX INFO: renamed from: b */
    public final long f64964b;

    /* JADX INFO: renamed from: c */
    public final long f64965c;

    /* JADX INFO: renamed from: d */
    public final int f64966d;

    public C20465e(C20468h record, long j10) {
        AbstractC16544l.m18094g(record, "record");
        this.f64963a = record;
        this.f64964b = j10;
        int i10 = AbstractC2674a.f8212a;
        this.f64965c = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = record.f64975p0;
        int size = linkedHashMap != null ? linkedHashMap.size() * 8 : 0;
        int length = AbstractC1456b.m2063c(record.f64972Y).length + 16;
        for (Map.Entry entry : record.f64973Z.entrySet()) {
            String str = (String) entry.getKey();
            length += AbstractC8175q5.m8759d(entry.getValue()) + AbstractC1456b.m2063c(str).length;
        }
        this.f64966d = length + size + 8;
    }
}
